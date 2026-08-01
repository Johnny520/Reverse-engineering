package androidx.compose.runtime;

import p024b9.AbstractC1043k;
import p117i.C3055g0;

/* JADX INFO: renamed from: androidx.compose.runtime.e3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0485e3 {
    /* JADX INFO: renamed from: a */
    public static final void m1634a(C3055g0 c3055g0, int i10) {
        if (c3055g0.f8151b == 0 || !(c3055g0.m11417e(0) == i10 || c3055g0.m11417e(c3055g0.f8151b - 1) == i10)) {
            int i11 = c3055g0.f8151b;
            c3055g0.m11303j(i10);
            while (i11 > 0) {
                int i12 = ((i11 + 1) >>> 1) - 1;
                int iM11417e = c3055g0.m11417e(i12);
                if (i10 <= iM11417e) {
                    break;
                }
                c3055g0.m11309p(i11, iM11417e);
                i11 = i12;
            }
            c3055g0.m11309p(i11, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C3055g0 m1636c(C3055g0 c3055g0, int i10, AbstractC1043k abstractC1043k) {
        int i11 = 1;
        if ((i10 & 1) != 0) {
            c3055g0 = new C3055g0(0, i11, null);
        }
        return m1635b(c3055g0);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m1637d(C3055g0 c3055g0) {
        return c3055g0.f8151b != 0;
    }

    /* JADX INFO: renamed from: e */
    public static final int m1638e(C3055g0 c3055g0) {
        return c3055g0.m11416d();
    }

    /* JADX INFO: renamed from: f */
    public static final int m1639f(C3055g0 c3055g0) {
        int iM11417e;
        int i10 = c3055g0.f8151b;
        int iM11417e2 = c3055g0.m11417e(0);
        while (c3055g0.f8151b != 0 && c3055g0.m11417e(0) == iM11417e2) {
            c3055g0.m11309p(0, c3055g0.m11419h());
            c3055g0.m11307n(c3055g0.f8151b - 1);
            int i11 = c3055g0.f8151b;
            int i12 = i11 >>> 1;
            int i13 = 0;
            while (i13 < i12) {
                int iM11417e3 = c3055g0.m11417e(i13);
                int i14 = (i13 + 1) * 2;
                int i15 = i14 - 1;
                int iM11417e4 = c3055g0.m11417e(i15);
                if (i14 >= i11 || (iM11417e = c3055g0.m11417e(i14)) <= iM11417e4) {
                    if (iM11417e4 > iM11417e3) {
                        c3055g0.m11309p(i13, iM11417e4);
                        c3055g0.m11309p(i15, iM11417e3);
                        i13 = i15;
                    }
                } else if (iM11417e > iM11417e3) {
                    c3055g0.m11309p(i13, iM11417e);
                    c3055g0.m11309p(i14, iM11417e3);
                    i13 = i14;
                }
            }
        }
        return iM11417e2;
    }

    /* JADX INFO: renamed from: b */
    public static C3055g0 m1635b(C3055g0 c3055g0) {
        return c3055g0;
    }
}
