package p000a;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C1284c;
import com.google.android.material.datepicker.C1288g;
import java.util.Calendar;

/* JADX INFO: renamed from: a.Ka */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0193Ka implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1288g f658a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1284c f659b;

    public ViewOnClickListenerC0193Ka(C1284c c1284c, C1288g c1288g) {
        this.f659b = c1284c;
        this.f658a = c1288g;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1284c c1284c = this.f659b;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c1284c.f5699e0.getLayoutManager();
        View viewM2699O0 = linearLayoutManager.m2699O0(0, linearLayoutManager.m2860v(), false);
        int iM2827H = (viewM2699O0 == null ? -1 : RecyclerView.AbstractC1175l.m2827H(viewM2699O0)) + 1;
        if (iM2827H < c1284c.f5699e0.getAdapter().mo109a()) {
            Calendar calendarM1137c = C0467Zf.m1137c(this.f658a.f5753d.f5680a.f3312a);
            calendarM1137c.add(2, iM2827H);
            c1284c.m3215G(new C0842tb(calendarM1137c));
        }
    }
}
