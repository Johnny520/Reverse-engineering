package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qc extends pc {
    public ArrayList d0;
    public final r5 e0;
    public final ig f0;
    public hc g0;
    public boolean h0;
    public final ar i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public u8[] n0;
    public u8[] o0;
    public int p0;
    public boolean q0;
    public boolean r0;

    public qc() {
        this.d0 = new ArrayList();
        this.e0 = new r5(this);
        ig r0 = new ig();
        r0.b = true;
        r0.c = true;
        r0.e = new ArrayList();
        new ArrayList();
        r0.f = null;
        r0.g = new k7();
        r0.h = new ArrayList();
        r0.a = this;
        r0.d = this;
        this.f0 = r0;
        this.g0 = null;
        this.h0 = false;
        this.i0 = new ar();
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = new u8[4];
        this.o0 = new u8[4];
        this.p0 = 263;
        this.q0 = false;
        this.r0 = false;
    }

    public final void B(pc r6, int r7) {
        if (r7 != 0) goto L9;
        int r72 = this.l0 + 1;
        u8[] r1 = this.o0;
        if (r72 < r1.length) goto L7;
        this.o0 = (u8[]) Arrays.copyOf(r1, r1.length * 2);
    L7:
        u8[] r73 = this.o0;
        int r12 = this.l0;
        r73[r12] = new u8(r6, 0, this.h0);
        this.l0 = r12 + 1;
        return;
    L9:
        if (r7 != 1) goto L15;
        int r74 = this.m0 + 1;
        u8[] r13 = this.n0;
        if (r74 < r13.length) goto L13;
        this.n0 = (u8[]) Arrays.copyOf(r13, r13.length * 2);
    L13:
        u8[] r75 = this.n0;
        int r14 = this.m0;
        r75[r14] = new u8(r6, 1, this.h0);
        this.m0 = r14 + 1;
        return;
    }

    public final void C(ar r19) {
        a(r19);
        int r2 = this.d0.size();
        char r3 = 0;
        int r4 = 0;
        boolean r5 = false;
    L3:
        int r6 = 1;
        if (r4 >= r2) goto L10;
        pc r7 = (pc) this.d0.get(r4);
        boolean[] r8 = r7.H;
        r8[0] = false;
        r8[1] = false;
        if ((r7 instanceof e7) == false) goto L8;
        r5 = true;
    L8:
        r4 = r4 + 1;
        goto L3
    L10:
        if (r5 == false) goto L29;
        int r52 = 0;
    L12:
        if (r52 >= r2) goto L29;
        pc r72 = (pc) this.d0.get(r52);
        if ((r72 instanceof e7) == false) goto L28;
        e7 r73 = (e7) r72;
        int r82 = 0;
    L17:
        if (r82 >= r73.e0) goto L28;
        pc r9 = r73.d0[r82];
        int r10 = r73.f0;
        if (r10 == 0) goto L26;
        if (r10 == 1) goto L26;
        if (r10 != 2) goto L24;
    L25:
        r9.H[1] = true;
    L27:
        r82 = r82 + 1;
        goto L17
    L24:
        if (r10 != 3) goto L27;
    L26:
        r9.H[0] = true;
    L28:
        r52 = r52 + 1;
    L29:
        int r53 = 0;
    L30:
        if (r53 >= r2) goto L37;
        pc r74 = (pc) this.d0.get(r53);
        r74.getClass();
        if ((r74 instanceof rk) == false) goto L34;
    L35:
        r74.a(r19);
    L36:
        r53 = r53 + 1;
        goto L30
    L34:
        if ((r74 instanceof go) == false) goto L36;
    L37:
        int r54 = 0;
    L38:
        if (r54 >= r2) goto L78;
        pc r75 = (pc) this.d0.get(r54);
        if ((r75 instanceof qc) == false) goto L52;
        int[] r83 = r75.c0;
        int r92 = r83[r3];
        int r84 = r83[r6];
        if (r92 != 2) goto L44;
        r75.w(r6);
    L44:
        if (r84 != 2) goto L46;
        r75.x(r6);
    L46:
        r75.a(r19);
        if (r92 != 2) goto L49;
        r75.w(r92);
    L49:
        if (r84 != 2) goto L51;
        r75.x(r84);
    L51:
        int r16 = r6;
    L77:
        r54 = r54 + 1;
        r6 = r16;
        r3 = 0;
        goto L38
    L52:
        r75.h = -1;
        cc r93 = r75.B;
        int[] r102 = r75.c0;
        cc r11 = r75.A;
        cc r12 = r75.y;
        cc r13 = r75.z;
        cc r14 = r75.x;
        r75.i = -1;
        int[] r85 = this.c0;
        r16 = r6;
        if (r85[r3] == 2) goto L60;
        if (r102[r3] != 4) goto L60;
        int r15 = r14.e;
        int r32 = l() - r13.e;
        r14.g = r19.j(r14);
        r13.g = r19.j(r13);
        r19.d(r14.g, r15);
        r19.d(r13.g, r32);
        r75.h = 2;
        r75.N = r15;
        int r33 = r32 - r15;
        r75.J = r33;
        int r62 = r75.Q;
        if (r33 >= r62) goto L60;
        r75.J = r62;
    L60:
        if (r85[r16] == 2) goto L72;
        if (r102[r16] != 4) goto L72;
        int r34 = r12.e;
        int r63 = i() - r11.e;
        r12.g = r19.j(r12);
        r11.g = r19.j(r11);
        r19.d(r12.g, r34);
        r19.d(r11.g, r63);
        if (r75.P <= 0) goto L66;
    L67:
        a40 r86 = r19.j(r93);
        r93.g = r86;
        r19.d(r86, r75.P + r34);
    L68:
        r75.i = 2;
        r75.O = r34;
        int r64 = r63 - r34;
        r75.K = r64;
        int r35 = r75.R;
        if (r64 >= r35) goto L72;
        r75.K = r35;
        goto L72
    L66:
        if (r75.V != 8) goto L68;
    L72:
        if ((r75 instanceof rk) == true) goto L77;
        if ((r75 instanceof go) == true) goto L77;
        r75.a(r19);
        goto L77
    L78:
        int r162 = r6;
        if (this.l0 <= 0) goto L82;
        a80.a(this, r19, 0);
    L82:
        if (this.m0 <= 0) goto L102;
        a80.a(this, r19, r162);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean D(int r20, boolean r21) {
        ig r2 = this.f0;
        ArrayList r3 = r2.e;
        qc r4 = r2.a;
        int r5 = 0;
        int r6 = r4.h(0);
        int[] r7 = r4.c0;
        m90 r8 = r4.e;
        po r9 = r4.d;
        int r11 = r4.h(1);
        int r12 = r4.m();
        int r13 = r4.n();
        if (r21 == false) goto L26;
        if (r6 == 2) goto L7;
        if (r11 != 2) goto L26;
    L7:
        int r15 = r3.size();
    L8:
        if (r5 >= r15) goto L15;
        Object r17 = r3.get(r5);
        r5 = r5 + 1;
        qb0 r10 = (qb0) r17;
        if (r10.f != r20) goto L8;
        if (r10.k() == true) goto L8;
        boolean r52 = false;
    L16:
        if (r20 != 0) goto L22;
        if (r52 == false) goto L26;
        if (r6 != 2) goto L26;
        r4.w(1);
        r4.y(r2.d(r4, 0));
        r9.e.d(r4.l());
        goto L26
    L22:
        if (r52 == false) goto L26;
        if (r11 != 2) goto L26;
        r4.x(1);
        r4.v(r2.d(r4, 1));
        r8.e.d(r4.i());
        goto L26
    L15:
        r52 = r21;
    L26:
        if (r20 != 0) goto L33;
        int r16 = 0;
        int r72 = r7[0];
        if (r72 == 1) goto L32;
        if (r72 == 4) goto L32;
        boolean r14 = true;
    L37:
        int r18 = r16;
    L39:
        r2.g();
        int r22 = r3.size();
        int r53 = r16;
    L40:
        if (r53 >= r22) goto L50;
        Object r73 = r3.get(r53);
        r53 = r53 + 1;
        qb0 r74 = (qb0) r73;
        if (r74.f != r20) goto L40;
        if (r74.b != r4) goto L49;
        if (r74.g == false) goto L40;
    L49:
        r74.e();
        goto L40
    L50:
        int r23 = r3.size();
        int r54 = r16;
    L51:
        if (r54 >= r23) goto L70;
        Object r75 = r3.get(r54);
        r54 = r54 + 1;
        qb0 r76 = (qb0) r75;
        if (r76.f != r20) goto L51;
        if (r18 != 0) goto L60;
        if (r76.b == r4) goto L51;
    L60:
        if (r76.h.j == false) goto L61;
        if (r76.i.j == false) goto L61;
        if ((r76 instanceof v8) == true) goto L51;
        if (r76.e.j == true) goto L51;
    L61:
        boolean r55 = r16;
    L71:
        r4.w(r6);
        r4.x(r11);
        return r55;
    L70:
        r55 = r14;
    L32:
        int r56 = r4.l() + r12;
        r9.i.d(r56);
        r9.e.d(r56 - r12);
        r14 = true;
        r18 = 1;
        goto L39
    L33:
        r14 = true;
        r16 = 0;
        int r77 = r7[1];
        if (r77 == 1) goto L38;
        if (r77 != 4) goto L37;
    L38:
        int r57 = r4.i() + r13;
        r8.i.d(r57);
        r8.e.d(r57 - r13);
        r18 = 1;
        goto L39
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r9v0 */
    public final void E() {
        boolean[] r2 = a80.h;
        boolean r3 = false;
        this.N = 0;
        this.O = 0;
        int r4 = Math.max(0, l());
        int r5 = Math.max(0, i());
        this.q0 = false;
        this.r0 = false;
        int r0 = this.p0;
        boolean r7 = true;
        if ((r0 & 64) != 64) goto L6;
    L7:
        boolean r02 = true;
    L9:
        ar r6 = this.i0;
        r6.getClass();
        r6.f = false;
        if (this.p0 == 0) goto L13;
        if (r02 == false) goto L13;
        r6.f = true;
    L13:
        ?? r8 = this.c0;
        ?? r9 = r8[1];
        ?? r10 = r8[0];
        ArrayList r11 = this.d0;
        char r12 = 2;
        if (r10 == 2) goto L18;
        if (r9 == 2) goto L18;
        boolean r13 = false;
    L19:
        this.l0 = 0;
        this.m0 = 0;
        int r14 = r11.size();
        int r03 = 0;
    L20:
        if (r03 >= r14) goto L25;
        pc r15 = (pc) this.d0.get(r03);
        boolean r16 = r7 ? 1 : 0;
        if ((r15 instanceof qc) == false) goto L24;
        ((qc) r15).E();
    L24:
        r03 = r03 + 1;
        r7 = r16 ? 1 : 0;
        goto L20
    L25:
        char r162 = r7 ? 1 : 0;
        int r04 = 0;
        boolean r152 = false;
        ?? r72 = r7;
    L26:
        if (r72 == 0) goto L104;
        char r17 = r12;
        int r122 = r04 + 1;
        r6.r();     // Catch: Exception -> L53
        this.l0 = r3 ? 1 : 0;     // Catch: Exception -> L53
        this.m0 = r3 ? 1 : 0;     // Catch: Exception -> L53
        f(r6);     // Catch: Exception -> L53
        int r05 = r3 ? 1 : 0;
    L30:
        if (r05 >= r14) goto L35;
        boolean r18 = r3;
        ((pc) this.d0.get(r05)).f(r6);     // Catch: Exception -> L33
        r05 = r05 + 1;     // Catch: Exception -> L33
        r3 = r18 ? 1 : 0;
    L33:
        e = e;
        ?? r73 = r72;
    L55:
        e.printStackTrace();
        boolean[] r19 = r2;
        ?? r20 = r73;
        System.out.println("EXCEPTION : " + e);
    L56:
        if (r20 == 0) goto L60;
        r19[r17] = r18;
        A(r6);
        int r06 = this.d0.size();
        int r22 = r18 ? 1 : 0;
    L58:
        if (r22 >= r06) goto L63;
        ((pc) this.d0.get(r22)).A(r6);
        r22 = r22 + 1;
    L63:
        if (r13 == true) goto L65;
    L81:
        char r07 = r18 ? 1 : 0;
    L82:
        int r23 = Math.max(this.Q, l());
        char r08 = r07;
        boolean r153 = r152;
        if (r23 <= l()) goto L85;
        y(r23);
        r8[r18 ? 1 : 0] = r162;
        char r09 = r162;
        r153 = r09 == true ? 1 : 0;
        r08 = r09;
    L85:
        int r24 = Math.max(this.R, i());
        char r010 = r08;
        boolean r154 = r153;
        if (r24 <= i()) goto L88;
        v(r24);
        r8[r162] = r162;
        char r011 = r162;
        r154 = r011 == true ? 1 : 0;
        r010 = r011;
    L88:
        if (r154 == false) goto L90;
        char r74 = 2;
    L103:
        char r25 = r74;
        r72 = r010;
        r04 = r122;
        r12 = r25;
        r3 = r18 ? 1 : 0;
        r2 = r19;
        r162 = 1;
        r152 = r154;
        goto L26
    L90:
        if (r8[r18 ? 1 : 0] != 2) goto L95;
        if (r4 <= 0) goto L95;
        if (l() <= r4) goto L95;
        ?? r26 = r162;
        this.q0 = r26;
        r8[r18 ? 1 : 0] = r26 == true ? 1 : 0;
        y(r4);
        char r012 = r26 == true ? 1 : 0;
        r154 = r012 == true ? 1 : 0;
        r010 = r012;
        ?? r27 = r26;
    L96:
        r74 = 2;
        if (r8[r27] != 2) goto L103;
        if (r5 <= 0) goto L103;
        if (i() <= r5) goto L103;
        this.r0 = r27;
        r8[r27] = r27;
        v(r5);
        r010 = 1;
        r154 = true;
    L95:
        r27 = r162;
        r010 = r010;
        r154 = r154;
        goto L96
    L65:
        if (r122 >= 8) goto L81;
        if (r19[r17] == false) goto L81;
        int r013 = r18 ? 1 : 0;
        int r28 = r013;
        int r32 = r28;
    L69:
        if (r013 >= r14) goto L71;
        pc r75 = (pc) this.d0.get(r013);
        int r202 = r013;
        r28 = Math.max(r28, r75.l() + r75.N);
        r32 = Math.max(r32, r75.i() + r75.O);
        r013 = (r202 == true ? 1 : 0) + 1;
        goto L69
    L71:
        int r014 = Math.max(this.Q, r28);
        int r29 = Math.max(this.R, r32);
        if (r10 == r17) goto L74;
    L76:
        r07 = r18 ? 1 : 0;
        r152 = r152;
    L77:
        if (r9 != r17) goto L82;
        if (i() >= r29) goto L82;
        v(r29);
        r8[r162] = r17;
        r07 = r162;
        r152 = r07 == true ? 1 : 0;
        goto L82
    L74:
        if (l() >= r014) goto L76;
        y(r014);
        r8[r18 ? 1 : 0] = r17;
        char r015 = r162;
        r152 = r015 == true ? 1 : 0;
        r07 = r015;
        goto L77
    L60:
        A(r6);
        int r016 = r18 ? 1 : 0;
    L61:
        if (r016 >= r14) goto L63;
        ((pc) this.d0.get(r016)).A(r6);
        r016 = r016 + 1;
        goto L61
    L35:
        r18 = r3;
        C(r6);     // Catch: Exception -> L33
        zx r017 = r6.b;     // Catch: Exception -> L51
        if (r6.f == false) goto L49;
        int r33 = r18 ? 1 : 0;
    L40:
        if (r33 >= r6.i) goto L45;
        if (r6.e[r33].e == false) goto L43;
        r33 = r33 + 1;     // Catch: Exception -> L51
        goto L40
    L43:
        r6.o(r017);     // Catch: Exception -> L51
    L50:
        r19 = r2;
        r20 = r162;
        goto L56
    L45:
        int r018 = r18 ? 1 : 0;
    L47:
        if (r018 >= r6.i) goto L50;
        p6 r34 = r6.e[r018];     // Catch: Exception -> L51
        r34.a.e = r34.b;     // Catch: Exception -> L51
        r018 = r018 + 1;     // Catch: Exception -> L51
        goto L47
    L49:
        r6.o(r017);     // Catch: Exception -> L51
    L51:
        e = e;
        r73 = r162;
    L53:
        e = e;
        r18 = r3 ? 1 : 0;
        r73 = r72;
        goto L55
    L104:
        boolean r182 = r3 ? 1 : 0;
        this.d0 = r11;
        if (r152 == false) goto L107;
        r8[r182 ? 1 : 0] = r10;
        r8[1] = r9;
    L107:
        u(r6.k);
        return;
    L18:
        r13 = true;
        goto L19
    L6:
        if ((r0 & 128) == 128) goto L7;
        r02 = false;
        goto L9
    }

    @Override // defpackage.pc
    public final void s() {
        this.i0.r();
        this.j0 = 0;
        this.k0 = 0;
        this.d0.clear();
        super.s();
    }

    @Override // defpackage.pc
    public final void u(a8 r4) {
        super.u(r4);
        int r0 = this.d0.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((pc) this.d0.get(r1)).u(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.pc
    public final void z(boolean r4, boolean r5) {
        super.z(r4, r5);
        int r0 = this.d0.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((pc) this.d0.get(r1)).z(r4, r5);
        r1 = r1 + 1;
        goto L3
    }
}
