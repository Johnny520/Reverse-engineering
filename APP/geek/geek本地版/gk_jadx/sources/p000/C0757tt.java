package p000;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.C0114c;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: tt */
/* JADX INFO: loaded from: classes.dex */
public final class C0757tt extends AbstractC0652qz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0114c f4616a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialButton f4617b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0794ut f4618c;

    public C0757tt(C0794ut c0794ut, C0114c c0114c, MaterialButton materialButton) {
        this.f4618c = c0794ut;
        this.f4616a = c0114c;
        this.f4617b = materialButton;
    }

    @Override // p000.AbstractC0652qz
    /* JADX INFO: renamed from: a */
    public final void mo2184a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f4617b.getText());
        }
    }

    @Override // p000.AbstractC0652qz
    /* JADX INFO: renamed from: b */
    public final void mo2185b(RecyclerView recyclerView, int i, int i2) {
        int iM332I0;
        C0095c8 c0095c8 = this.f4616a.f1124c;
        C0794ut c0794ut = this.f4618c;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0794ut.f4766Y.getLayoutManager();
            View viewM335K0 = linearLayoutManager.m335K0(0, linearLayoutManager.m1980v(), false);
            iM332I0 = viewM335K0 == null ? -1 : AbstractC0540nz.m1953F(viewM335K0);
        } else {
            iM332I0 = ((LinearLayoutManager) c0794ut.f4766Y.getLayoutManager()).m332I0();
        }
        Calendar calendarM2426a = u80.m2426a(c0095c8.f909a.f5619a);
        calendarM2426a.add(2, iM332I0);
        c0794ut.f4762U = new C0981zv(calendarM2426a);
        Calendar calendarM2426a2 = u80.m2426a(c0095c8.f909a.f5619a);
        calendarM2426a2.add(2, iM332I0);
        calendarM2426a2.set(5, 1);
        Calendar calendarM2426a3 = u80.m2426a(calendarM2426a2);
        calendarM2426a3.get(2);
        calendarM2426a3.get(1);
        calendarM2426a3.getMaximum(7);
        calendarM2426a3.getActualMaximum(5);
        calendarM2426a3.getTimeInMillis();
        long timeInMillis = calendarM2426a3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = u80.f4698a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f4617b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
