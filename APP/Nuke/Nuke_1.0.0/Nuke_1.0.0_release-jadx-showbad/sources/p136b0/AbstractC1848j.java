package p136b0;

import java.util.ArrayList;
import p056K2.InterfaceC0877c;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.C1397y;
import p095T.InterfaceC1373m;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: b0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1848j {

    /* JADX INFO: renamed from: a */
    public static final StackTraceElement[] f6256a = new StackTraceElement[0];

    /* JADX INFO: renamed from: b */
    public static final C1850l f6257b = new C1850l(0, new long[0], new Object[0]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final int m3312a(int i5, int i6) {
        return i5 << (((i6 % 10) * 3) + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final long m3313b() {
        return Thread.currentThread().getId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final C1843e m3314c(int i5, InterfaceC0877c interfaceC0877c, InterfaceC1373m interfaceC1373m) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        Object objM2558L = c1383r.m2558L();
        if (objM2558L == C1371l.f4833a) {
            objM2558L = new C1843e(i5, true, interfaceC0877c);
            c1383r.m2585g0(objM2558L);
        }
        C1843e c1843e = (C1843e) objM2558L;
        if (!c1843e.f6243f.equals(interfaceC0877c)) {
            c1843e.f6243f = interfaceC0877c;
            if (c1843e.f6242e) {
                C1388t0 c1388t0 = c1843e.f6244g;
                if (c1388t0 != null) {
                    C1397y c1397y = c1388t0.f4925a;
                    if (c1397y != null) {
                        c1397y.m2665s(c1388t0, null);
                    }
                    c1843e.f6244g = null;
                }
                ArrayList arrayList = c1843e.f6245h;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        C1388t0 c1388t02 = (C1388t0) arrayList.get(i6);
                        C1397y c1397y2 = c1388t02.f4925a;
                        if (c1397y2 != null) {
                            c1397y2.m2665s(c1388t02, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return c1843e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final boolean m3315d(C1388t0 c1388t0, C1388t0 c1388t02) {
        if (c1388t0 == null) {
            return true;
        }
        if (c1388t0 instanceof C1388t0) {
            return !c1388t0.m2641b() || c1388t0.equals(c1388t02) || AbstractC1665j.m2981a(c1388t0.f4927c, c1388t02.f4927c);
        }
        return false;
    }
}
