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

    public C0506Lq(C0549Mq r1, C1277c r2) {
        this.f1660b = r1;
        this.f1659a = r2;
    }

    @Override // p000.AbstractC2603uv
    public final void onScrolled(RecyclerView r6, int r7, int r8) {
        C0136D6 r62 = this.f1659a.f4534a;
        C0549Mq r82 = this.f1660b;
        if (r7 >= 0) goto L5;
        int r72 = ((LinearLayoutManager) r82.f1780a0.getLayoutManager()).findFirstVisibleItemPosition();
    L6:
        Calendar r0 = AbstractC2407qD.m4843a(r62.f349a.f5207a);
        r0.add(2, r72);
        C1469gs r2 = new C1469gs(r0);
        r82.f1776W = r2;
        MaterialButton r02 = r82.f1785f0;
        Calendar r3 = AbstractC2407qD.m4843a(r62.f349a.f5207a);
        r3.add(2, r72);
        r3.set(5, 1);
        Calendar r32 = AbstractC2407qD.m4843a(r3);
        r32.get(2);
        r32.get(1);
        r32.getMaximum(7);
        r32.getActualMaximum(5);
        r32.getTimeInMillis();
        long r33 = r32.getTimeInMillis();
        Locale r73 = Locale.getDefault();
        AtomicReference r1 = AbstractC2407qD.f8441a;
        DateFormat r74 = DateFormat.getInstanceForSkeleton("yMMMM", r73);
        r74.setTimeZone(TimeZone.getTimeZone("UTC"));
        r74.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        r02.setText(r74.format(new Date(r33)));
        r82.m1042E(r62.f349a.m2823d(r2));
        return;
    L5:
        r72 = ((LinearLayoutManager) r82.f1780a0.getLayoutManager()).findLastVisibleItemPosition();
        goto L6
    }
}
