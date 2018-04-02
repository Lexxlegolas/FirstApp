package com.example.lexx.fragtofragcomms;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MessageFrag.OnMessageSendListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.frag_container)!=null)
        {
            if(savedInstanceState != null)
            {
                return;
            }
            MessageFrag messageFrag = new MessageFrag();
            getSupportFragmentManager().beginTransaction().add(R.id.frag_container,messageFrag,null).commit();

        }
    }

    @Override
    public void onMessageSend(String message) {
        Display display = new Display();
        Bundle bundle = new Bundle();
        bundle.putString("message",message);
        display.setArguments(bundle);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.frag_container,display,null);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}
