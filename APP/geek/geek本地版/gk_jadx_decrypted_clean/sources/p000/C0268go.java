package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;

/* JADX INFO: renamed from: go */
/* JADX INFO: loaded from: classes.dex */
public final class C0268go extends C0592pc {

    /* JADX INFO: renamed from: d0 */
    public float f2157d0 = -1.0f;

    /* JADX INFO: renamed from: e0 */
    public int f2158e0 = -1;

    /* JADX INFO: renamed from: f0 */
    public int f2159f0 = -1;

    /* JADX INFO: renamed from: g0 */
    public C0099cc f2160g0 = this.f3877y;

    /* JADX INFO: renamed from: h0 */
    public int f2161h0 = 0;

    public C0268go() {
        this.f3830G.clear();
        this.f3830G.add(this.f2160g0);
        int length = this.f3829F.length;
        for (int i = 0; i < length; i++) {
            this.f3829F[i] = this.f2160g0;
        }
    }

    @Override // p000.C0592pc
    /* JADX INFO: renamed from: A */
    public final void mo1292A(C0041ar c0041ar) {
        if (this.f3832I == null) {
            return;
        }
        C0099cc c0099cc = this.f2160g0;
        c0041ar.getClass();
        int iM452m = C0041ar.m452m(c0099cc);
        if (this.f2161h0 == 1) {
            this.f3837N = iM452m;
            this.f3838O = 0;
            m2110v(this.f3832I.m2097i());
            m2113y(0);
            return;
        }
        this.f3837N = 0;
        this.f3838O = iM452m;
        m2113y(this.f3832I.m2100l());
        m2110v(0);
    }

    /* JADX INFO: renamed from: B */
    public final void m1293B(int i) {
        if (this.f2161h0 == i) {
            return;
        }
        this.f2161h0 = i;
        ArrayList arrayList = this.f3830G;
        arrayList.clear();
        if (this.f2161h0 == 1) {
            this.f2160g0 = this.f3876x;
        } else {
            this.f2160g0 = this.f3877y;
        }
        arrayList.add(this.f2160g0);
        C0099cc[] c0099ccArr = this.f3829F;
        int length = c0099ccArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0099ccArr[i2] = this.f2160g0;
        }
    }

    @Override // p000.C0592pc
    /* JADX INFO: renamed from: a */
    public final void mo996a(C0041ar c0041ar) {
        C0629qc c0629qc = (C0629qc) this.f3832I;
        if (c0629qc == null) {
            return;
        }
        C0099cc c0099ccMo1294g = c0629qc.mo1294g(2);
        C0099cc c0099ccMo1294g2 = c0629qc.mo1294g(4);
        C0592pc c0592pc = this.f3832I;
        boolean z = c0592pc != null && c0592pc.f3855c0[0] == 2;
        if (this.f2161h0 == 0) {
            c0099ccMo1294g = c0629qc.mo1294g(3);
            c0099ccMo1294g2 = c0629qc.mo1294g(5);
            C0592pc c0592pc2 = this.f3832I;
            z = c0592pc2 != null && c0592pc2.f3855c0[1] == 2;
        }
        if (this.f2158e0 != -1) {
            a40 a40VarM462j = c0041ar.m462j(this.f2160g0);
            c0041ar.m457e(a40VarM462j, c0041ar.m462j(c0099ccMo1294g), this.f2158e0, 8);
            if (z) {
                c0041ar.m458f(c0041ar.m462j(c0099ccMo1294g2), a40VarM462j, 0, 5);
                return;
            }
            return;
        }
        if (this.f2159f0 != -1) {
            a40 a40VarM462j2 = c0041ar.m462j(this.f2160g0);
            a40 a40VarM462j3 = c0041ar.m462j(c0099ccMo1294g2);
            c0041ar.m457e(a40VarM462j2, a40VarM462j3, -this.f2159f0, 8);
            if (z) {
                c0041ar.m458f(a40VarM462j2, c0041ar.m462j(c0099ccMo1294g), 0, 5);
                c0041ar.m458f(a40VarM462j3, a40VarM462j2, 0, 5);
                return;
            }
            return;
        }
        if (this.f2157d0 != -1.0f) {
            a40 a40VarM462j4 = c0041ar.m462j(this.f2160g0);
            a40 a40VarM462j5 = c0041ar.m462j(c0099ccMo1294g2);
            float f = this.f2157d0;
            C0586p6 c0586p6M463k = c0041ar.m463k();
            c0586p6M463k.f3673d.mo506i(a40VarM462j4, -1.0f);
            c0586p6M463k.f3673d.mo506i(a40VarM462j5, f);
            c0041ar.m455c(c0586p6M463k);
        }
    }

    @Override // p000.C0592pc
    /* JADX INFO: renamed from: b */
    public final boolean mo997b() {
        return true;
    }

    @Override // p000.C0592pc
    /* JADX INFO: renamed from: g */
    public final C0099cc mo1294g(int i) {
        switch (z30.m2775t(i)) {
            case Base64.DEFAULT /* 0 */:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case Base64.NO_PADDING /* 1 */:
            case 3:
                if (this.f2161h0 == 1) {
                    return this.f2160g0;
                }
                break;
            case Base64.NO_WRAP /* 2 */:
            case 4:
                if (this.f2161h0 == 0) {
                    return this.f2160g0;
                }
                break;
        }
        throw new AssertionError(z30.m2774s(i));
    }
}
