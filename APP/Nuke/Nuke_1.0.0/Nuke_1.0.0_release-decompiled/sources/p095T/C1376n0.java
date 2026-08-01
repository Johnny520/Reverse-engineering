package p095T;

import java.util.ArrayList;
import p049I2.AbstractC0797o;
import p056K2.C0887m;
import p186k.C2439u;

/* JADX INFO: renamed from: T.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1376n0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f4845a;

    /* JADX INFO: renamed from: b */
    public final int f4846b;

    /* JADX INFO: renamed from: c */
    public int f4847c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f4848d;

    /* JADX INFO: renamed from: e */
    public final C2439u f4849e;

    /* JADX INFO: renamed from: f */
    public final C0887m f4850f;

    public C1376n0(int i5, ArrayList arrayList) {
        this.f4845a = arrayList;
        this.f4846b = i5;
        if (i5 < 0) {
            AbstractC1380p0.m2542a("Invalid start index");
        }
        this.f4848d = new ArrayList();
        C2439u c2439u = new C2439u();
        int size = arrayList.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            C1336S c1336s = (C1336S) this.f4845a.get(i7);
            int i8 = c1336s.f4770c;
            int i9 = c1336s.f4771d;
            c2439u.m4344h(i8, new C1323L(i7, i6, i9));
            i6 += i9;
        }
        this.f4849e = c2439u;
        this.f4850f = AbstractC0797o.m1396u(new C1374m0(this));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2518a(int i5, int i6) {
        int i7;
        C2439u c2439u = this.f4849e;
        C1323L c1323l = (C1323L) c2439u.m4318b(i5);
        if (c1323l == null) {
            return false;
        }
        int i8 = c1323l.f4721b;
        int i9 = i6 - c1323l.f4722c;
        c1323l.f4722c = i6;
        if (i9 == 0) {
            return true;
        }
        Object[] objArr = c2439u.f7847c;
        long[] jArr = c2439u.f7845a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j5 = jArr[i10];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j5) < 128) {
                        C1323L c1323l2 = (C1323L) objArr[(i10 << 3) + i12];
                        if (c1323l2.f4721b >= i8 && !c1323l2.equals(c1323l) && (i7 = c1323l2.f4721b + i9) >= 0) {
                            c1323l2.f4721b = i7;
                        }
                    }
                    j5 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }
}
