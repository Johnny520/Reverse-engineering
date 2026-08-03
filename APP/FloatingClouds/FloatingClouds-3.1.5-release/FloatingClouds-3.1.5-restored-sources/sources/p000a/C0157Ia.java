package p000a;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.C1282a;
import com.google.android.material.datepicker.C1284c;
import com.google.android.material.datepicker.C1288g;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: a.Ia */
/* JADX INFO: loaded from: classes.dex */
public final class C0157Ia extends RecyclerView.AbstractC1179p {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1288g f538a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialButton f539b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1284c f540c;

    public C0157Ia(C1284c c1284c, C1288g c1288g, MaterialButton materialButton) {
        this.f540c = c1284c;
        this.f538a = c1288g;
        this.f539b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1179p
    /* JADX INFO: renamed from: a */
    public final void mo439a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f539b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1179p
    /* JADX INFO: renamed from: b */
    public final void mo440b(RecyclerView recyclerView, int i, int i2) {
        int iM2697M0;
        C1284c c1284c = this.f540c;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c1284c.f5699e0.getLayoutManager();
            View viewM2699O0 = linearLayoutManager.m2699O0(0, linearLayoutManager.m2860v(), false);
            iM2697M0 = viewM2699O0 == null ? -1 : RecyclerView.AbstractC1175l.m2827H(viewM2699O0);
        } else {
            iM2697M0 = ((LinearLayoutManager) c1284c.f5699e0.getLayoutManager()).m2697M0();
        }
        C1282a c1282a = this.f538a.f5753d;
        Calendar calendarM1137c = C0467Zf.m1137c(c1282a.f5680a.f3312a);
        calendarM1137c.add(2, iM2697M0);
        c1284c.f5695a0 = new C0842tb(calendarM1137c);
        Calendar calendarM1137c2 = C0467Zf.m1137c(c1282a.f5680a.f3312a);
        calendarM1137c2.add(2, iM2697M0);
        calendarM1137c2.set(5, 1);
        Calendar calendarM1137c3 = C0467Zf.m1137c(calendarM1137c2);
        calendarM1137c3.get(2);
        calendarM1137c3.get(1);
        calendarM1137c3.getMaximum(7);
        calendarM1137c3.getActualMaximum(5);
        calendarM1137c3.getTimeInMillis();
        this.f539b.setText(C0467Zf.m1136b("yMMMM", Locale.getDefault()).format(new Date(calendarM1137c3.getTimeInMillis())));
    }
}
