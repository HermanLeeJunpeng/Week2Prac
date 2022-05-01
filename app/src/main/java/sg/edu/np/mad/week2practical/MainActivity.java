package sg.edu.np.mad.week2practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button followbutton = findViewById(R.id.FollowButton);
        User user1 = initial();
        followstatus(user1, followbutton);
        followbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user1.followed == false)
                {
                    user1.followed = true;
                }
                else
                {
                    user1.followed = false;
                }
                followstatus(user1,followbutton);
            }
        });



    }

    public User initial()
    {
        User initialization = new User("name","description",0,false);
        return initialization;
    }

    public void followstatus (User user, Button button)
    {
        TextView txt = button;
        if(user.followed == false)
        {
            txt.setText("Follow");
        }
        else
        {
            txt.setText("Unfollow");
        }
    }
}