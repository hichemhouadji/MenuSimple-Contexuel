package com.example.menuformation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button contextMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contextMenu=(Button)findViewById(R.id.conetxt_btn);
        //appelle method de long touche
        registerForContextMenu(contextMenu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_formation,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.about_us_option_item:
                Toast.makeText(this,"you presed about us",Toast.LENGTH_LONG).show();
                return true;
            case R.id.exit_option_item:
                Toast.makeText(this,"you presed exit",Toast.LENGTH_LONG).show();

                return true;
            default:
                return super.onOptionsItemSelected(item);

        }


    }
    //flouting or context menu


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()){
            case R.id.delet_menu:
                Toast.makeText(this,"you presed delet",Toast.LENGTH_LONG).show();

                return true;
                case  R.id.share_menu:
                    Toast.makeText(this,"you presed share",Toast.LENGTH_LONG).show();

                    return true;
            case R.id.archive_menu:
                Toast.makeText(this,"you presed archive",Toast.LENGTH_LONG).show();

                return true;
            default:        return super.onContextItemSelected(item);

        }
    }
}
