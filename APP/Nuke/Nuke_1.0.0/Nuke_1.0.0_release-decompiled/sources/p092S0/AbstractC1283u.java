package p092S0;

import p147d1.C1959i;
import p147d1.C1967q;
import p147d1.C1969s;
import p153e1.C2019o;
import p153e1.C2020p;

/* JADX INFO: renamed from: S0.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1283u {

    /* JADX INFO: renamed from: a */
    public static final long f4614a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f4615b = 0;

    static {
        C2020p[] c2020pArr = C2019o.f6746b;
        f4614a = C2019o.f6747c;
    }

    /* JADX INFO: renamed from: a */
    public static final C1282t m2376a(C1282t c1282t, int i5, int i6, long j5, C1967q c1967q, C1284v c1284v, C1959i c1959i, int i7, int i8, C1969s c1969s) {
        long j6;
        int i9 = i5;
        int i10 = i6;
        long j7 = j5;
        C1967q c1967q2 = c1967q;
        C1284v c1284v2 = c1284v;
        C1959i c1959i2 = c1959i;
        int i11 = i7;
        int i12 = i8;
        C1969s c1969s2 = c1969s;
        if (i9 == 0 || i9 == c1282t.f4605a) {
            C2020p[] c2020pArr = C2019o.f6746b;
            if ((j7 & 1095216660480L) == 0) {
                j6 = 0;
            } else {
                j6 = 0;
                if (C2019o.m3708a(j7, c1282t.f4607c)) {
                }
            }
            if ((c1967q2 == null || c1967q2.equals(c1282t.f4608d)) && ((i10 == 0 || i10 == c1282t.f4606b) && ((c1284v2 == null || c1284v2.equals(c1282t.f4609e)) && ((c1959i2 == null || c1959i2.equals(c1282t.f4610f)) && ((i11 == 0 || i11 == c1282t.f4611g) && ((i12 == 0 || i12 == c1282t.f4612h) && (c1969s2 == null || c1969s2.equals(c1282t.f4613i)))))))) {
                return c1282t;
            }
        } else {
            j6 = 0;
        }
        C2020p[] c2020pArr2 = C2019o.f6746b;
        if ((j7 & 1095216660480L) == j6) {
            j7 = c1282t.f4607c;
        }
        if (c1967q2 == null) {
            c1967q2 = c1282t.f4608d;
        }
        if (i9 == 0) {
            i9 = c1282t.f4605a;
        }
        if (i10 == 0) {
            i10 = c1282t.f4606b;
        }
        C1284v c1284v3 = c1282t.f4609e;
        if (c1284v3 != null && c1284v2 == null) {
            c1284v2 = c1284v3;
        }
        if (c1959i2 == null) {
            c1959i2 = c1282t.f4610f;
        }
        if (i11 == 0) {
            i11 = c1282t.f4611g;
        }
        if (i12 == 0) {
            i12 = c1282t.f4612h;
        }
        if (c1969s2 == null) {
            c1969s2 = c1282t.f4613i;
        }
        return new C1282t(i9, i10, j7, c1967q2, c1284v2, c1959i2, i11, i12, c1969s2);
    }
}
