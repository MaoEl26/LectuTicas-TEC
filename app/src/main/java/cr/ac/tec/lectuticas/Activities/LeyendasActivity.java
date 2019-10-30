package cr.ac.tec.lectuticas.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import cr.ac.tec.lectuticas.R;
import cr.ac.tec.lectuticas.Utilities.AnalyticsTracker;

public class LeyendasActivity extends AppCompatActivity {

  private AnalyticsTracker analyticsTracker;
  private Intent intent;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_leyendas);
    analyticsTracker = AnalyticsTracker.getAnalyticsTracker(this.getApplicationContext());
  }

  // Las declaraciones onClick se encuentran establecidas en el layout -----------------------------

  public void verLeyendaCadejos(View view) { // Inicializar Leyenda Cadejo -------------------------
    Intent intent = new Intent(this, LecturaCuentoActivity.class);
    intent.putExtra("name", "El Cadejos");
    intent.putExtra("storyBackground", R.drawable.cadejos);
    intent.putExtra("characterGif", R.drawable.cadejos_anim);
    intent.putExtra("id", 1);
    intent.putExtra("number_paragraphs", 13);
    startActivity(intent);
  }

  public void verLeyendaCegua(View view) { // Inicializar Leyenda Cegua ----------------------------
    Intent intent = new Intent(this, LecturaCuentoActivity.class);
    intent.putExtra("storyBackground", R.drawable.cegua);
    intent.putExtra("characterGif", R.drawable.cegua_anim);
    intent.putExtra("id", 2);
    intent.putExtra("name", "La Cegua");
    intent.putExtra("number_paragraphs", 13);
    startActivity(intent);
  }

  public void verLeyendaCarreta(View view) { // Inicializar Leyenda Carreta sin bueyes -------------
    Intent intent = new Intent(this, LecturaCuentoActivity.class);
    intent.putExtra("storyBackground", R.drawable.carreta);
    intent.putExtra("characterGif", R.drawable.rueda_anim);
    intent.putExtra("id", 3);
    intent.putExtra("name", "La Carreta");
    intent.putExtra("number_paragraphs", 9);
    startActivity(intent);
  }

  public void verLeyendaLlorona(View view) { // Inicializar Leyenda La Llorona ---------------------
    Intent intent = new Intent(this, LecturaCuentoActivity.class);
    intent.putExtra("storyBackground", R.drawable.llorona);
    intent.putExtra("characterGif", R.drawable.llorona_anim);
    intent.putExtra("id", 4);
    intent.putExtra("name", "La Llorona");
    intent.putExtra("number_paragraphs", 7);
    startActivity(intent);
  }

  protected void onResume() {
    super.onResume();
    analyticsTracker.trackScreen("LeyendasActivity");
  }
}
