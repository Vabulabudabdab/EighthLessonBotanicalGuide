package com.msaggik.eighthlessonbotanicalguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Plant
    List<Plant> plants = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // заполнение контейнера plants объектами Plant
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        // создадим адаптер и загрузим в него контейнер с данными
        PlantAdapter plantAdapter = new PlantAdapter(this, plants);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(plantAdapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер plants объектов сущности Plant
        plants.add( new Plant("Крио цветок", "Магический цветок, чья температура способна заморозить даже дракона",
                R.drawable.crio_flower));
        plants.add( new Plant("Цветок жизни", "Цветок жизни, растёт на полях великих сражений, способен заживлять даже самые страшные раны",
                R.drawable.health_flower));
        plants.add( new Plant("Цветок маны", "Цветок маны, нет ничего лучше для мага, чем этот цветок, способен восстановить магические силы в одно мгновение",
                R.drawable.magic_flower));
//        plants.add( new Plant("Красная смерть", "Не смотря на то, что этот цветок довольно красив, он является крайне опасным, и сорвать его без последствий могут лишь самые сильные герои",
//                R.drawable.plant_rev));
    }
}