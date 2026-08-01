package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: fn */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0230fn implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal f1808e = new ThreadLocal();

    /* JADX INFO: renamed from: f */
    public static final C0148de f1809f = new C0148de(1);

    /* JADX INFO: renamed from: a */
    public ArrayList f1810a;

    /* JADX INFO: renamed from: b */
    public long f1811b;

    /* JADX INFO: renamed from: c */
    public long f1812c;

    /* JADX INFO: renamed from: d */
    public ArrayList f1813d;

    /* JADX INFO: renamed from: c */
    public static i00 m1104c(RecyclerView recyclerView, int i, long j) {
        int iM2247t = recyclerView.f554e.m2247t();
        for (int i2 = 0; i2 < iM2247t; i2++) {
            i00 i00VarM352I = RecyclerView.m352I(recyclerView.f554e.m2246s(i2));
            if (i00VarM352I.f2298c == i && !i00VarM352I.m1424f()) {
                return null;
            }
        }
        a00 a00Var = recyclerView.f548b;
        try {
            recyclerView.m371P();
            i00 i00VarM11i = a00Var.m11i(i, j);
            if (i00VarM11i != null) {
                if (!i00VarM11i.m1423e() || i00VarM11i.m1424f()) {
                    a00Var.m3a(i00VarM11i, false);
                } else {
                    a00Var.m8f(i00VarM11i.f2296a);
                }
            }
            recyclerView.m372Q(false);
            return i00VarM11i;
        } catch (Throwable th) {
            recyclerView.m372Q(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1105a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f576p && this.f1811b == 0) {
            this.f1811b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0157dn c0157dn = recyclerView.f549b0;
        c0157dn.f1396a = i;
        c0157dn.f1397b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1106b(long r17) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC0230fn.m1106b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f1810a;
        try {
            int i = t70.f4419a;
            s70.m2309a("RV Prefetch");
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
                    m1106b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f1812c);
                }
            }
            this.f1811b = 0L;
            s70.m2310b();
        } catch (Throwable th) {
            this.f1811b = 0L;
            int i3 = t70.f4419a;
            s70.m2310b();
            throw th;
        }
    }
}
