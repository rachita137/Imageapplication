package tatastrive.application.imageapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {
Button b,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_welcome );
        b=findViewById( R.id.button );
        b2=findViewById( R.id.button2 );

        // b button.onclick() & create intent
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rachu=new Intent(Welcome.this,MainActivity.class);
                startActivity( rachu );
            }
        } );

         //b2 button
        b2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rachu1=new Intent(Welcome.this,Imageslideshow.class);
                startActivity( rachu1 );
            }
        } );
    }
}


