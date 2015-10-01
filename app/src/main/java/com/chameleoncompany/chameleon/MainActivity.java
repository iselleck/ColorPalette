package com.chameleoncompany.chameleon;

import android.app.Fragment;
import android.app.FragmentManager;
<<<<<<< HEAD
import android.content.Intent;
=======
>>>>>>> origin/master
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    // Attributes
    private String[] mNavList;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    private CharSequence mDrawerTitle;
    private CharSequence mTitle;

<<<<<<< HEAD

=======
>>>>>>> origin/master
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD

=======
>>>>>>> origin/master
        // Instantiate mTitle
        mTitle = mDrawerTitle = getTitle();

        mNavList = getResources().getStringArray(R.array.items_list);

        // Hook up attributes with correct ids
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        // Set the adapter for the list view
        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                R.layout.draw_list, mNavList));



        // Instantiate mDrawerToggle with actionbar
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                R.string.drawer_open, R.string.drawer_close)
        {
            // Calls this method when the drawer is closed
            public void onDrawerClosed(View view){
                super.onDrawerClosed(view);
                getSupportActionBar().setTitle(mTitle);

                // Call onPrepareOptionsMenu()
               // invalidateOptionsMenu();;
            }

            // Calls method when the drawer is open
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getSupportActionBar().setTitle(mDrawerTitle);

                // Call onPrepareOptionsMenu()
                // invalidateOptionsMenu();;
            }
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerList);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        recyclerView.setAdapter(new cycleViewAdapter(generatePalettes()));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }



    private ArrayList<Palette> generatePalettes(){
        ArrayList<Palette> palettes = new ArrayList<>();
        palettes.add(new Palette("RED", "#D32F2F", Color.parseColor("#F44336"),Color.parseColor("#ffcdd2"), Color.parseColor("#ff5252"), Color.parseColor("#ffffff"), Color.parseColor("#b6b6b6") ));
        palettes.add(new Palette("PINK", "#FF4081", Color.parseColor("#ff4081"), Color.parseColor("#c2185b"), Color.parseColor("#e91e63"), Color.parseColor("#f8bbd0"), Color.parseColor("#ffffff")));
        palettes.add(new Palette("Purple", "#7B1FA2", Color.parseColor("#7b1fa2"), Color.parseColor("#303f9f"), Color.parseColor("#3f51b5"), Color.parseColor("#536dfe"), Color.parseColor("#c5cae9")));
        palettes.add(new Palette("BLUE", "#536DFE", Color.parseColor("#536dfe"), Color.parseColor("#1976d2"), Color.parseColor("#448aff"),  Color.parseColor("#2196f3"),  Color.parseColor("#bbdefb")));
        palettes.add(new Palette("GREEN", "#388E3C", Color.parseColor("#388e3c"), Color.parseColor("#4caf50"),  Color.parseColor("#689f38"),  Color.parseColor("#c8ec69"),  Color.parseColor("#8bc34a")));
        palettes.add(new Palette("ORANGE", "#FF5722", Color.parseColor("#ff5722"), Color.parseColor("#f57c00"), Color.parseColor("#ff9800"), Color.parseColor("#e64a19"), Color.parseColor("#ffccbc")));
        palettes.add(new Palette("AMBER", "#FFA000", Color.parseColor("#ffa000"), Color.parseColor("#ffc107"), Color.parseColor("#ffeb3b"), Color.parseColor("#ffecb3"), Color.parseColor("#fbc02d")));
        return palettes;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /*
    private class DrawerItemClickListener implements ListView.OnItemClickListener{
     @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
         selectItem(position);
     }
    }

   private void selectItem(int position){
        Fragment fragment = null;

        switch(position){
            case 0:
                fragment = new CreateFragment();
                break;
            case 1:
                fragment = new CreateFragment();
                break;
            case 2:
                fragment = new CreateFragment();
                break;
            default:
                break;
        }

       if(fragment != null){
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();

        mDrawerList.setItemChecked(position,true);
        mDrawerList.setSelection(position);
        getSupportActionBar().setTitle(mNavList[position]);
        mDrawerLayout.closeDrawer(mDrawerList);
    }
       else
       {
           Log.e("MainActivity", "Unable to create fragment");
       }
}

    public class CreateFragment extends Fragment{
        public CreateFragment()
        {
            @Override
                    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle)
        }
    }*/
}
