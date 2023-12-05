package com.example.myapplication.RecyclerViewImplementation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.myapplication.R;

import java.util.Arrays;
import java.util.List;

/*
* Crear un RecyclerView:
*   - Añadirlo en el layout que queramos
*   - Crear el layout para cada componente
*   - Crear la clase adapter (UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder>)
*   - Opcional: Creamos una clase para representar los items a representar
*   - Pasamos la lista en el OnCreate del MainActivity
* */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = findViewById(R.id.reciclerView);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        List<String> l = Arrays.asList("Gustavo", "Daniel", "Cecilia", "Diego", "Carlos", "Juan");
        rv.setAdapter(new UserAdapter(l));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int noMeVaciles = R.id.mp0p1;
        switch (item.getItemId()){
            //case R.id.mp0p1:
            case 1:
                // do w/e
                return true;
            case R.id.mp0p2:
                // do smthng else
                return true;

        }
    }
}