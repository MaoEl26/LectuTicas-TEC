package cr.ac.tec.lectuticas.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cr.ac.tec.lectuticas.R;
import cr.ac.tec.lectuticas.Utilities.AnalyticsTracker;

public class MainActivity extends AppCompatActivity {
  
  private AnalyticsTracker analyticsTracker;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    analyticsTracker = AnalyticsTracker.getAnalyticsTracker(this.getApplicationContext());
  }
  
  public void irALeyendas(View view) { // Inicia la actividad Legendas -----------------------------
    Intent intent = new Intent(this, LeyendasActivity.class);
    startActivity(intent);
  }
  
  public void irAlAcerca(View view) { // Inicia la actividad Acerca --------------------------------
    Intent intent = new Intent(this, AcercaActivity.class);
    startActivity(intent);
    analyticsTracker.trackEvent("Action", "Share", "Friends");
    
  }
  
  protected void onResume() { // Analisis de actividad Main ----------------------------------------
    super.onResume();
    analyticsTracker.trackScreen("MainActivity");
  }
}
