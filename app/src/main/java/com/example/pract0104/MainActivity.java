    package com.example.pract0104;

    import androidx.annotation.NonNull;
    import androidx.appcompat.app.AppCompatActivity;

    import android.os.Bundle;
    import android.util.DisplayMetrics;
    import android.view.Menu;
    import android.view.MenuInflater;
    import android.view.MenuItem;

    public class MainActivity extends AppCompatActivity {
        private PaintView paintView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            paintView = (PaintView) findViewById(R.id.paintView);
            DisplayMetrics metrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(metrics);
            paintView.init(metrics);

        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.inflate(R.menu.main, menu);
            return super.onCreateOptionsMenu(menu);
        }


            @Override
            public boolean onOptionsItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.normal:
                        paintView.normal();
                        return true;
                    case R.id.emboss:
                        paintView.emboss();
                        return true;
                    case R.id.blur:
                        paintView.blur();
                        return true;
                    case R.id.size_n:
                        paintView.size_n();
                        return true;
                    case R.id.size_s:
                        paintView.size_s();
                        return true;
                    case R.id.size_b:
                        paintView.size_b();
                        return true;
                    case R.id.size_z:
                        paintView.size_z();
                        return true;
                    case R.id.clear:
                        paintView.clear();
                        return true;
                    case R.id.color_r:
                        paintView.color_r();
                        return true;
                    case R.id.color_g:
                        paintView.color_g();
                        return true;
                    case R.id.color_b:
                        paintView.color_b();
                        return true;
                    case R.id.color_bl:
                        paintView.color_bl();
                        return true;








                }

            return super.onOptionsItemSelected(item);
        }

    }