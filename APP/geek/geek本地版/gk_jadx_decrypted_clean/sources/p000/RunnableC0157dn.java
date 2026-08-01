package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: dn */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0157dn implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal f1607e = new ThreadLocal();

    /* JADX INFO: renamed from: f */
    public static final C0101ce f1608f = new C0101ce(1);

    /* JADX INFO: renamed from: a */
    public ArrayList f1609a;

    /* JADX INFO: renamed from: b */
    public long f1610b;

    /* JADX INFO: renamed from: c */
    public long f1611c;

    /* JADX INFO: renamed from: d */
    public ArrayList f1612d;

    /* JADX INFO: renamed from: c */
    public static b00 m945c(RecyclerView recyclerView, int i, long j) {
        int iM2240t = recyclerView.f591e.m2240t();
        for (int i2 = 0; i2 < iM2240t; i2++) {
            b00 b00VarM367I = RecyclerView.m367I(recyclerView.f591e.m2239s(i2));
            if (b00VarM367I.f699c == i && !b00VarM367I.m486f()) {
                return null;
            }
        }
        C0763tz c0763tz = recyclerView.f585b;
        try {
            recyclerView.m386P();
            b00 b00VarM2401i = c0763tz.m2401i(i, j);
            if (b00VarM2401i != null) {
                if (!b00VarM2401i.m485e() || b00VarM2401i.m486f()) {
                    c0763tz.m2393a(b00VarM2401i, false);
                } else {
                    c0763tz.m2398f(b00VarM2401i.f697a);
                }
            }
            recyclerView.m387Q(false);
            return b00VarM2401i;
        } catch (Throwable th) {
            recyclerView.m387Q(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m946a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f613p && this.f1610b == 0) {
            this.f1610b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0074bn c0074bn = recyclerView.f586b0;
        c0074bn.f813a = i;
        c0074bn.f814b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m947b(long r17) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC0157dn.m947b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f1609a;
        try {
            int i = n70.f3350a;
            m70.m1798a("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m947b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f1611c);
                }
            }
            this.f1610b = 0L;
            m70.m1799b();
        } catch (Throwable th) {
            this.f1610b = 0L;
            int i3 = n70.f3350a;
            m70.m1799b();
            throw th;
        }
    }
}
