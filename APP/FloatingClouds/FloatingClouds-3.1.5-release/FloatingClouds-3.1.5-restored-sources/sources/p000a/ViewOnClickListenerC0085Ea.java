package p000a;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.C1284c;
import com.google.android.material.datepicker.C1288g;
import java.util.Calendar;

/* JADX INFO: renamed from: a.Ea */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0085Ea implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1288g f266a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1284c f267b;

    public ViewOnClickListenerC0085Ea(C1284c c1284c, C1288g c1288g) {
        this.f267b = c1284c;
        this.f266a = c1288g;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1284c c1284c = this.f267b;
        int iM2697M0 = ((LinearLayoutManager) c1284c.f5699e0.getLayoutManager()).m2697M0() - 1;
        if (iM2697M0 >= 0) {
            Calendar calendarM1137c = C0467Zf.m1137c(this.f266a.f5753d.f5680a.f3312a);
            calendarM1137c.add(2, iM2697M0);
            c1284c.m3215G(new C0842tb(calendarM1137c));
        }
    }
}
