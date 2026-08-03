package p000;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.C1277c;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Lq */
/* JADX INFO: loaded from: classes.dex */
public final class C0506Lq extends AbstractC2603uv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1277c f1659a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0549Mq f1660b;

    public C0506Lq(C0549Mq c0549Mq, C1277c c1277c) {
        this.f1660b = c0549Mq;
        this.f1659a = c1277c;
    }

    @Override // p000.AbstractC2603uv
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C0136D6 c0136d6 = this.f1659a.f4534a;
        C0549Mq c0549Mq = this.f1660b;
        int iFindFirstVisibleItemPosition = i < 0 ? ((LinearLayoutManager) c0549Mq.f1780a0.getLayoutManager()).findFirstVisibleItemPosition() : ((LinearLayoutManager) c0549Mq.f1780a0.getLayoutManager()).findLastVisibleItemPosition();
        Calendar calendarM4843a = AbstractC2407qD.m4843a(c0136d6.f349a.f5207a);
        calendarM4843a.add(2, iFindFirstVisibleItemPosition);
        C1469gs c1469gs = new C1469gs(calendarM4843a);
        c0549Mq.f1776W = c1469gs;
        MaterialButton materialButton = c0549Mq.f1785f0;
        Calendar calendarM4843a2 = AbstractC2407qD.m4843a(c0136d6.f349a.f5207a);
        calendarM4843a2.add(2, iFindFirstVisibleItemPosition);
        calendarM4843a2.set(5, 1);
        Calendar calendarM4843a3 = AbstractC2407qD.m4843a(calendarM4843a2);
        calendarM4843a3.get(2);
        calendarM4843a3.get(1);
        calendarM4843a3.getMaximum(7);
        calendarM4843a3.getActualMaximum(5);
        calendarM4843a3.getTimeInMillis();
        long timeInMillis = calendarM4843a3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = AbstractC2407qD.f8441a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        materialButton.setText(instanceForSkeleton.format(new Date(timeInMillis)));
        c0549Mq.m1042E(c0136d6.f349a.m2823d(c1469gs));
    }
}
