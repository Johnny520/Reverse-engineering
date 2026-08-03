package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: Ih */
/* JADX INFO: loaded from: classes.dex */
public final class C0368Ih extends AbstractC2592uk {

    /* JADX INFO: renamed from: A0 */
    public int f1248A0;

    /* JADX INFO: renamed from: B0 */
    public C0178E5 f1249B0;

    /* JADX INFO: renamed from: C0 */
    public C1496hb f1250C0;

    /* JADX INFO: renamed from: D0 */
    public int f1251D0;

    /* JADX INFO: renamed from: E0 */
    public int f1252E0;

    /* JADX INFO: renamed from: F0 */
    public int f1253F0;

    /* JADX INFO: renamed from: G0 */
    public int f1254G0;

    /* JADX INFO: renamed from: H0 */
    public int f1255H0;

    /* JADX INFO: renamed from: I0 */
    public int f1256I0;

    /* JADX INFO: renamed from: J0 */
    public float f1257J0;

    /* JADX INFO: renamed from: K0 */
    public float f1258K0;

    /* JADX INFO: renamed from: L0 */
    public float f1259L0;

    /* JADX INFO: renamed from: M0 */
    public float f1260M0;

    /* JADX INFO: renamed from: N0 */
    public float f1261N0;

    /* JADX INFO: renamed from: O0 */
    public float f1262O0;

    /* JADX INFO: renamed from: P0 */
    public int f1263P0;

    /* JADX INFO: renamed from: Q0 */
    public int f1264Q0;

    /* JADX INFO: renamed from: R0 */
    public int f1265R0;

    /* JADX INFO: renamed from: S0 */
    public int f1266S0;

    /* JADX INFO: renamed from: T0 */
    public int f1267T0;

    /* JADX INFO: renamed from: U0 */
    public int f1268U0;

    /* JADX INFO: renamed from: V0 */
    public int f1269V0;

    /* JADX INFO: renamed from: W0 */
    public ArrayList f1270W0;

    /* JADX INFO: renamed from: X0 */
    public C2454rb[] f1271X0;

    /* JADX INFO: renamed from: Y0 */
    public C2454rb[] f1272Y0;

    /* JADX INFO: renamed from: Z0 */
    public int[] f1273Z0;

    /* JADX INFO: renamed from: a1 */
    public C2454rb[] f1274a1;

    /* JADX INFO: renamed from: b1 */
    public int f1275b1;

    /* JADX INFO: renamed from: s0 */
    public int f1276s0;

    /* JADX INFO: renamed from: t0 */
    public int f1277t0;

    /* JADX INFO: renamed from: u0 */
    public int f1278u0;

    /* JADX INFO: renamed from: v0 */
    public int f1279v0;

    /* JADX INFO: renamed from: w0 */
    public int f1280w0;

    /* JADX INFO: renamed from: x0 */
    public int f1281x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f1282y0;

    /* JADX INFO: renamed from: z0 */
    public int f1283z0;

    @Override // p000.AbstractC2592uk
    /* JADX INFO: renamed from: S */
    public final void mo809S() {
        int r0 = 0;
    L4:
        if (r0 >= this.f8966r0) goto L9;
        C2454rb r1 = this.f8965q0[r0];
        if (r1 == null) goto L8;
        r1.f8585F = true;
    L8:
        r0 = r0 + 1;
        goto L4
    }

    /* JADX INFO: renamed from: T */
    public final int m810T(C2454rb r11, int r12) {
        if (r11 == null) goto L9;
        int[] r1 = r11.f8637p0;
        if (r1[1] != 3) goto L23;
        int r3 = r11.f8640s;
        if (r3 == 0) goto L9;
        if (r3 != 2) goto L16;
        int r8 = (int) (r11.f8647z * r12);
        if (r8 == r11.m4933k()) goto L15;
        r11.f8618g = true;
        m812V(r1[0], r11.m4937q(), 1, r8, r11);
    L15:
        return r8;
    L16:
        C2454rb r9 = r11;
        if (r3 == 1) goto L19;
        if (r3 != 3) goto L25;
        return (int) ((r9.m4937q() * r9.f8602W) + 0.5f);
    L25:
        return r9.m4933k();
    L19:
        return r9.m4933k();
    L23:
        r9 = r11;
    L9:
        return 0;
    }

    /* JADX INFO: renamed from: U */
    public final int m811U(C2454rb r12, int r13) {
        if (r12 == null) goto L9;
        int[] r1 = r12.f8637p0;
        if (r1[0] != 3) goto L23;
        int r2 = r12.f8639r;
        if (r2 == 0) goto L9;
        if (r2 != 2) goto L16;
        int r7 = (int) (r12.f8644w * r13);
        if (r7 == r12.m4937q()) goto L15;
        r12.f8618g = true;
        m812V(1, r7, r1[1], r12.m4933k(), r12);
    L15:
        return r7;
    L16:
        C2454rb r10 = r12;
        if (r2 == 1) goto L19;
        if (r2 != 3) goto L25;
        return (int) ((r10.m4933k() * r10.f8602W) + 0.5f);
    L25:
        return r10.m4937q();
    L19:
        return r10.m4937q();
    L23:
        r10 = r12;
    L9:
        return 0;
    }

    /* JADX INFO: renamed from: V */
    public final void m812V(int r4, int r5, int r6, int r7, C2454rb r8) {
        C0178E5 r0 = this.f1249B0;
    L3:
        C1496hb r1 = this.f1250C0;
        if (r1 != null) goto L8;
        C2454rb r2 = this.f8599T;
        if (r2 == null) goto L8;
        this.f1250C0 = ((C2497sb) r2).f8778u0;
    L8:
        r0.f520a = r4;
        r0.f521b = r6;
        r0.f522c = r5;
        r0.f523d = r7;
        r1.m2865b(r8, r0);
        r8.m4924O(r0.f524e);
        r8.m4921L(r0.f525f);
        r8.f8584E = r0.f527h;
        r8.m4918I(r0.f526g);
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: b */
    public final void mo813b(C2244mo r12, boolean r13) {
        ArrayList r0 = this.f1270W0;
        super.mo813b(r12, r13);
        C2454rb r122 = this.f8599T;
        if (r122 != null) goto L5;
    L7:
        boolean r123 = false;
    L8:
        int r2 = this.f1267T0;
        if (r2 == 0) goto L102;
        if (r2 != 1) goto L12;
        int r22 = r0.size();
        int r3 = 0;
    L95:
        if (r3 >= r22) goto L104;
        C0325Hh r4 = (C0325Hh) r0.get(r3);
        if (r3 != (r22 - 1)) goto L99;
        boolean r5 = true;
    L100:
        r4.m689b(r3, r123, r5);
        r3 = r3 + 1;
        goto L95
    L99:
        r5 = false;
    L104:
        this.f1282y0 = false;
        return;
    L12:
        if (r2 == 2) goto L24;
        if (r2 != 3) goto L104;
        int r23 = r0.size();
        int r32 = 0;
    L17:
        if (r32 >= r23) goto L104;
        C0325Hh r42 = (C0325Hh) r0.get(r32);
        if (r32 != (r23 - 1)) goto L21;
        boolean r52 = true;
    L22:
        r42.m689b(r32, r123, r52);
        r32 = r32 + 1;
        goto L17
    L21:
        r52 = false;
        goto L22
    L24:
        if (this.f1273Z0 == null) goto L104;
        if (this.f1272Y0 == null) goto L104;
        if (this.f1271X0 == null) goto L104;
        int r02 = 0;
    L32:
        if (r02 >= this.f1275b1) goto L34;
        this.f1274a1[r02].m4915D();
        r02 = r02 + 1;
        goto L32
    L34:
        int[] r03 = this.f1273Z0;
        int r24 = r03[0];
        int r04 = r03[1];
        float r33 = this.f1257J0;
        C2454rb r43 = null;
        int r53 = 0;
    L36:
        if (r53 >= r24) goto L55;
        if (r123 == false) goto L39;
        int r34 = (r24 - r53) - 1;
        float r7 = 1.0f - this.f1257J0;
    L40:
        C2454rb r35 = this.f1272Y0[r34];
        if (r35 == null) goto L54;
        C1259cb r8 = r35.f8588I;
        if (r35.f8619g0 == 8) goto L54;
        if (r53 != 0) goto L48;
        r35.m4929f(r8, this.f8588I, this.f1280w0);
        r35.f8623i0 = this.f1251D0;
        r35.f8613d0 = r7;
    L48:
        if (r53 != (r24 - 1)) goto L50;
        r35.m4929f(r35.f8590K, this.f8590K, this.f1281x0);
    L50:
        if (r53 <= 0) goto L53;
        if (r43 == null) goto L53;
        C1259cb r6 = r43.f8590K;
        r35.m4929f(r8, r6, this.f1263P0);
        r43.m4929f(r6, r8, 0);
    L53:
        r43 = r35;
    L54:
        r53 = r53 + 1;
        r33 = r7;
        goto L36
    L39:
        r7 = r33;
        r34 = r53;
        goto L40
    L55:
        int r124 = 0;
    L56:
        if (r124 >= r04) goto L72;
        C2454rb r36 = this.f1271X0[r124];
        if (r36 == null) goto L71;
        C1259cb r54 = r36.f8589J;
        if (r36.f8619g0 == 8) goto L71;
        if (r124 != 0) goto L65;
        r36.m4929f(r54, this.f8589J, this.f1276s0);
        r36.f8625j0 = this.f1252E0;
        r36.f8615e0 = this.f1258K0;
    L65:
        if (r124 != (r04 - 1)) goto L67;
        r36.m4929f(r36.f8591L, this.f8591L, this.f1277t0);
    L67:
        if (r124 <= 0) goto L70;
        if (r43 == null) goto L70;
        C1259cb r72 = r43.f8591L;
        r36.m4929f(r54, r72, this.f1264Q0);
        r43.m4929f(r72, r54, 0);
    L70:
        r43 = r36;
    L71:
        r124 = r124 + 1;
        goto L56
    L72:
        int r125 = 0;
    L73:
        if (r125 >= r24) goto L104;
        int r37 = 0;
    L75:
        if (r37 >= r04) goto L93;
        int r44 = (r37 * r24) + r125;
        if (this.f1269V0 != 1) goto L79;
        r44 = (r125 * r04) + r37;
    L79:
        C2454rb[] r55 = this.f1274a1;
        if (r44 >= r55.length) goto L92;
        C2454rb r45 = r55[r44];
        if (r45 == null) goto L92;
        if (r45.f8619g0 == 8) goto L92;
        C2454rb r56 = this.f1272Y0[r125];
        C2454rb r73 = this.f1271X0[r37];
        if (r45 == r56) goto L90;
        r45.m4929f(r45.f8588I, r56.f8588I, 0);
        r45.m4929f(r45.f8590K, r56.f8590K, 0);
    L90:
        if (r45 == r73) goto L92;
        r45.m4929f(r45.f8589J, r73.f8589J, 0);
        r45.m4929f(r45.f8591L, r73.f8591L, 0);
    L92:
        r37 = r37 + 1;
        goto L75
    L93:
        r125 = r125 + 1;
        goto L73
    L102:
        if (r0.size() <= 0) goto L104;
        ((C0325Hh) r0.get(0)).m689b(0, r123, true);
        goto L104
    L5:
        if (((C2497sb) r122).f8779v0 == false) goto L7;
        r123 = true;
        goto L8
    }
}
