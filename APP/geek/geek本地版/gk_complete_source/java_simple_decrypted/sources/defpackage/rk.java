package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rk extends oo {
    public float A0;
    public float B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public ArrayList J0;
    public pc[] K0;
    public pc[] L0;
    public int[] M0;
    public pc[] N0;
    public int O0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public boolean l0;
    public int m0;
    public int n0;
    public k7 o0;
    public hc p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public float w0;
    public float x0;
    public float y0;
    public float z0;

    @Override // defpackage.oo
    public final void B() {
        int r0 = 0;
    L4:
        if (r0 >= this.e0) goto L6;
        pc r1 = this.d0[r0];
        r0 = r0 + 1;
        goto L4
    }

    public final int C(pc r10, int r11) {
        if (r10 == null) goto L9;
        int[] r1 = r10.c0;
        if (r1[1] != 3) goto L23;
        int r3 = r10.k;
        if (r3 == 0) goto L9;
        if (r3 != 2) goto L16;
        int r7 = (int) (r10.r * r11);
        if (r7 == r10.i()) goto L15;
        E(r1[0], r10.l(), 1, r7, r10);
    L15:
        return r7;
    L16:
        pc r8 = r10;
        if (r3 == 1) goto L19;
        if (r3 != 3) goto L25;
        return (int) ((r8.l() * r8.L) + 0.5f);
    L25:
        return r8.i();
    L19:
        return r8.i();
    L23:
        r8 = r10;
    L9:
        return 0;
    }

    public final int D(pc r12, int r13) {
        if (r12 == null) goto L9;
        int[] r1 = r12.c0;
        if (r1[0] != 3) goto L23;
        int r2 = r12.j;
        if (r2 == 0) goto L9;
        if (r2 != 2) goto L16;
        int r7 = (int) (r12.o * r13);
        if (r7 == r12.l()) goto L15;
        E(1, r7, r1[1], r12.i(), r12);
    L15:
        return r7;
    L16:
        pc r10 = r12;
        if (r2 == 1) goto L19;
        if (r2 != 3) goto L25;
        return (int) ((r10.i() * r10.L) + 0.5f);
    L25:
        return r10.l();
    L19:
        return r10.l();
    L23:
        r10 = r12;
    L9:
        return 0;
    }

    public final void E(int r4, int r5, int r6, int r7, pc r8) {
        k7 r0 = this.o0;
    L3:
        hc r1 = this.p0;
        if (r1 != null) goto L8;
        pc r2 = this.I;
        if (r2 == null) goto L8;
        this.p0 = ((qc) r2).g0;
    L8:
        r0.a = r4;
        r0.b = r6;
        r0.c = r5;
        r0.d = r7;
        r1.a(r8, r0);
        r8.y(r0.e);
        r8.v(r0.f);
        r8.w = r0.h;
        int r42 = r0.g;
        r8.P = r42;
        if (r42 <= 0) goto L11;
        boolean r43 = true;
    L12:
        r8.w = r43;
        return;
    L11:
        r43 = false;
        goto L12
    }

    @Override // defpackage.pc
    public final void a(ar r12) {
        ArrayList r0 = this.J0;
        super.a(r12);
        pc r122 = this.I;
        if (r122 == null) goto L5;
        boolean r123 = ((qc) r122).h0;
    L6:
        int r2 = this.G0;
        if (r2 == 0) goto L89;
        if (r2 != 1) goto L10;
        int r22 = r0.size();
        int r4 = 0;
    L82:
        if (r4 >= r22) goto L91;
        qk r5 = (qk) r0.get(r4);
        if (r4 != (r22 - 1)) goto L86;
        boolean r6 = true;
    L87:
        r5.b(r4, r123, r6);
        r4 = r4 + 1;
        goto L82
    L86:
        r6 = false;
    L91:
        this.l0 = false;
        return;
    L10:
        if (r2 != 2) goto L91;
        if (this.M0 == null) goto L91;
        if (this.L0 == null) goto L91;
        if (this.K0 == null) goto L91;
        int r02 = 0;
    L21:
        if (r02 >= this.O0) goto L23;
        this.N0[r02].t();
        r02 = r02 + 1;
        goto L21
    L23:
        int[] r03 = this.M0;
        int r23 = r03[0];
        int r04 = r03[1];
        pc r42 = null;
        int r52 = 0;
    L25:
        if (r52 >= r23) goto L43;
        if (r123 == false) goto L28;
        int r7 = (r23 - r52) - 1;
    L29:
        pc r72 = this.L0[r7];
        if (r72 == null) goto L42;
        cc r8 = r72.x;
        if (r72.V == 8) goto L42;
        if (r52 != 0) goto L37;
        r72.e(r8, this.x, this.j0);
        r72.X = this.q0;
        r72.S = this.w0;
    L37:
        if (r52 != (r23 - 1)) goto L39;
        r72.e(r72.z, this.z, this.k0);
    L39:
        if (r52 <= 0) goto L41;
        r72.e(r8, r42.z, this.C0);
        r42.e(r42.z, r8, 0);
    L41:
        r42 = r72;
    L42:
        r52 = r52 + 1;
        goto L25
    L28:
        r7 = r52;
        goto L29
    L43:
        int r124 = 0;
    L44:
        if (r124 >= r04) goto L59;
        pc r53 = this.K0[r124];
        if (r53 == null) goto L58;
        cc r73 = r53.y;
        if (r53.V == 8) goto L58;
        if (r124 != 0) goto L53;
        r53.e(r73, this.y, this.f0);
        r53.Y = this.r0;
        r53.T = this.x0;
    L53:
        if (r124 != (r04 - 1)) goto L55;
        r53.e(r53.A, this.A, this.g0);
    L55:
        if (r124 <= 0) goto L57;
        r53.e(r73, r42.A, this.D0);
        r42.e(r42.A, r73, 0);
    L57:
        r42 = r53;
    L58:
        r124 = r124 + 1;
        goto L44
    L59:
        int r125 = 0;
    L60:
        if (r125 >= r23) goto L91;
        int r43 = 0;
    L62:
        if (r43 >= r04) goto L80;
        int r54 = (r43 * r23) + r125;
        if (this.I0 != 1) goto L66;
        r54 = (r125 * r04) + r43;
    L66:
        pc[] r74 = this.N0;
        if (r54 >= r74.length) goto L79;
        pc r55 = r74[r54];
        if (r55 == null) goto L79;
        if (r55.V == 8) goto L79;
        pc r75 = this.L0[r125];
        pc r82 = this.K0[r43];
        if (r55 == r75) goto L77;
        r55.e(r55.x, r75.x, 0);
        r55.e(r55.z, r75.z, 0);
    L77:
        if (r55 == r82) goto L79;
        r55.e(r55.y, r82.y, 0);
        r55.e(r55.A, r82.A, 0);
    L79:
        r43 = r43 + 1;
        goto L62
    L80:
        r125 = r125 + 1;
        goto L60
    L89:
        if (r0.size() <= 0) goto L91;
        ((qk) r0.get(0)).b(0, r123, true);
        goto L91
    L5:
        r123 = false;
        goto L6
    }
}
