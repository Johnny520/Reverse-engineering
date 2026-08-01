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

/* JADX INFO: renamed from: xt */
/* JADX INFO: loaded from: classes.dex */
public final class C0905xt extends AbstractC0911xz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0114c f5306a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialButton f5307b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0942yt f5308c;

    public C0905xt(C0942yt c0942yt, C0114c c0114c, MaterialButton materialButton) {
        this.f5308c = c0942yt;
        this.f5306a = c0114c;
        this.f5307b = materialButton;
    }

    @Override // p000.AbstractC0911xz
    /* JADX INFO: renamed from: a */
    public final void mo865a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f5307b.getText());
        }
    }

    @Override // p000.AbstractC0911xz
    /* JADX INFO: renamed from: b */
    public final void mo866b(RecyclerView recyclerView, int i, int i2) {
        int iM317I0;
        C0476m8 c0476m8 = this.f5306a.f1049c;
        C0942yt c0942yt = this.f5308c;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0942yt.f5498Y.getLayoutManager();
            View viewM320K0 = linearLayoutManager.m320K0(0, linearLayoutManager.m2528v(), false);
            iM317I0 = viewM320K0 == null ? -1 : AbstractC0799uz.m2501F(viewM320K0);
        } else {
            iM317I0 = ((LinearLayoutManager) c0942yt.f5498Y.getLayoutManager()).m317I0();
        }
        Calendar calendarM2819a = z80.m2819a(c0476m8.f3099a.f2060a);
        calendarM2819a.add(2, iM317I0);
        c0942yt.f5494U = new C0276gw(calendarM2819a);
        Calendar calendarM2819a2 = z80.m2819a(c0476m8.f3099a.f2060a);
        calendarM2819a2.add(2, iM317I0);
        calendarM2819a2.set(5, 1);
        Calendar calendarM2819a3 = z80.m2819a(calendarM2819a2);
        calendarM2819a3.get(2);
        calendarM2819a3.get(1);
        calendarM2819a3.getMaximum(7);
        calendarM2819a3.getActualMaximum(5);
        calendarM2819a3.getTimeInMillis();
        long timeInMillis = calendarM2819a3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = z80.f5560a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f5307b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
