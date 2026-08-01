package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;

/* JADX INFO: renamed from: ko */
/* JADX INFO: loaded from: classes.dex */
public final class C0418ko extends C0925yc {

    /* JADX INFO: renamed from: d0 */
    public float f2861d0 = -1.0f;

    /* JADX INFO: renamed from: e0 */
    public int f2862e0 = -1;

    /* JADX INFO: renamed from: f0 */
    public int f2863f0 = -1;

    /* JADX INFO: renamed from: g0 */
    public C0443lc f2864g0 = this.f5424y;

    /* JADX INFO: renamed from: h0 */
    public int f2865h0 = 0;

    public C0418ko() {
        this.f5377G.clear();
        this.f5377G.add(this.f2864g0);
        int length = this.f5376F.length;
        for (int i = 0; i < length; i++) {
            this.f5376F[i] = this.f2864g0;
        }
    }

    @Override // p000.C0925yc
    /* JADX INFO: renamed from: A */
    public final void mo1701A(C0197er c0197er) {
        if (this.f5379I == null) {
            return;
        }
        C0443lc c0443lc = this.f2864g0;
        c0197er.getClass();
        int iM1000m = C0197er.m1000m(c0443lc);
        if (this.f2865h0 == 1) {
            this.f5384N = iM1000m;
            this.f5385O = 0;
            m2759v(this.f5379I.m2746i());
            m2762y(0);
            return;
        }
        this.f5384N = 0;
        this.f5385O = iM1000m;
        m2762y(this.f5379I.m2749l());
        m2759v(0);
    }

    /* JADX INFO: renamed from: B */
    public final void m1702B(int i) {
        if (this.f2865h0 == i) {
            return;
        }
        this.f2865h0 = i;
        ArrayList arrayList = this.f5377G;
        arrayList.clear();
        if (this.f2865h0 == 1) {
            this.f2864g0 = this.f5423x;
        } else {
            this.f2864g0 = this.f5424y;
        }
        arrayList.add(this.f2864g0);
        C0443lc[] c0443lcArr = this.f5376F;
        int length = c0443lcArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0443lcArr[i2] = this.f2864g0;
        }
    }

    @Override // p000.C0925yc
    /* JADX INFO: renamed from: a */
    public final void mo1703a(C0197er c0197er) {
        C0962zc c0962zc = (C0962zc) this.f5379I;
        if (c0962zc == null) {
            return;
        }
        C0443lc c0443lcMo1705g = c0962zc.mo1705g(2);
        C0443lc c0443lcMo1705g2 = c0962zc.mo1705g(4);
        C0925yc c0925yc = this.f5379I;
        boolean z = c0925yc != null && c0925yc.f5402c0[0] == 2;
        if (this.f2865h0 == 0) {
            c0443lcMo1705g = c0962zc.mo1705g(3);
            c0443lcMo1705g2 = c0962zc.mo1705g(5);
            C0925yc c0925yc2 = this.f5379I;
            z = c0925yc2 != null && c0925yc2.f5402c0[1] == 2;
        }
        if (this.f2862e0 != -1) {
            h40 h40VarM1010j = c0197er.m1010j(this.f2864g0);
            c0197er.m1005e(h40VarM1010j, c0197er.m1010j(c0443lcMo1705g), this.f2862e0, 8);
            if (z) {
                c0197er.m1006f(c0197er.m1010j(c0443lcMo1705g2), h40VarM1010j, 0, 5);
                return;
            }
            return;
        }
        if (this.f2863f0 != -1) {
            h40 h40VarM1010j2 = c0197er.m1010j(this.f2864g0);
            h40 h40VarM1010j3 = c0197er.m1010j(c0443lcMo1705g2);
            c0197er.m1005e(h40VarM1010j2, h40VarM1010j3, -this.f2863f0, 8);
            if (z) {
                c0197er.m1006f(h40VarM1010j2, c0197er.m1010j(c0443lcMo1705g), 0, 5);
                c0197er.m1006f(h40VarM1010j3, h40VarM1010j2, 0, 5);
                return;
            }
            return;
        }
        if (this.f2861d0 != -1.0f) {
            h40 h40VarM1010j4 = c0197er.m1010j(this.f2864g0);
            h40 h40VarM1010j5 = c0197er.m1010j(c0443lcMo1705g2);
            float f = this.f2861d0;
            C0585p6 c0585p6M1011k = c0197er.m1011k();
            c0585p6M1011k.f3603d.mo1451i(h40VarM1010j4, -1.0f);
            c0585p6M1011k.f3603d.mo1451i(h40VarM1010j5, f);
            c0197er.m1003c(c0585p6M1011k);
        }
    }

    @Override // p000.C0925yc
    /* JADX INFO: renamed from: b */
    public final boolean mo1704b() {
        return true;
    }

    @Override // p000.C0925yc
    /* JADX INFO: renamed from: g */
    public final C0443lc mo1705g(int i) {
        switch (g40.m1158u(i)) {
            case Base64.DEFAULT /* 0 */:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case Base64.NO_PADDING /* 1 */:
            case 3:
                if (this.f2865h0 == 1) {
                    return this.f2864g0;
                }
                break;
            case Base64.NO_WRAP /* 2 */:
            case 4:
                if (this.f2865h0 == 0) {
                    return this.f2864g0;
                }
                break;
        }
        throw new AssertionError(g40.m1157t(i));
    }
}
