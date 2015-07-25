package weitang114.com.circularfloatingactionmenudemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create button
        ImageView icon = new ImageView(this); // Create an icon
        icon.setImageDrawable(getDrawable(R.mipmap.ic_launcher));
        FloatingActionButton actionButton = new FloatingActionButton.Builder(this)
                .setContentView(icon)
                .build();

        // New Items
        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);

        //// first item
        ImageView itemIcon = new ImageView(this);
        itemIcon.setImageDrawable(getDrawable(android.R.drawable.ic_delete));
        SubActionButton button1 = itemBuilder.setContentView(itemIcon).build();

        //// second item
        itemIcon = new ImageView(this);
        itemIcon.setImageDrawable(getDrawable(android.R.drawable.ic_menu_add));
        SubActionButton button2 = itemBuilder.setContentView(itemIcon).build();


        // create actionMenu
        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(button1)
                .addSubActionView(button2)
                .attachTo(actionButton)
                .build();


        // set listeners seperately
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "button 1", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "button 2", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
