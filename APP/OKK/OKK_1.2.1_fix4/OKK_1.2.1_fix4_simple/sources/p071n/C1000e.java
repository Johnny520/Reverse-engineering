package p071n;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p018J0.C0234d;
import p043Y.C0463v;
import p069m.C0983c;
import p069m.C0985e;
import p069m.C0987g;
import p069m.C0989i;
import p073o.AbstractC1024m;
import p073o.C1013b;
import p073o.C1014c;
import p073o.C1016e;
import p073o.C1021j;
import p073o.C1023l;
import p075p.C1040f;

/* JADX INFO: renamed from: n.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1000e extends C0999d {

    /* JADX INFO: renamed from: d0 */
    public ArrayList f3639d0;

    /* JADX INFO: renamed from: e0 */
    public final C0234d f3640e0;

    /* JADX INFO: renamed from: f0 */
    public final C1016e f3641f0;

    /* JADX INFO: renamed from: g0 */
    public C1040f f3642g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f3643h0;

    /* JADX INFO: renamed from: i0 */
    public final C0985e f3644i0;

    /* JADX INFO: renamed from: j0 */
    public int f3645j0;

    /* JADX INFO: renamed from: k0 */
    public int f3646k0;

    /* JADX INFO: renamed from: l0 */
    public int f3647l0;

    /* JADX INFO: renamed from: m0 */
    public int f3648m0;

    /* JADX INFO: renamed from: n0 */
    public C0997b[] f3649n0;

    /* JADX INFO: renamed from: o0 */
    public C0997b[] f3650o0;

    /* JADX INFO: renamed from: p0 */
    public int f3651p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f3652q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f3653r0;

    public C1000e() {
        this.f3639d0 = new ArrayList();
        this.f3640e0 = new C0234d(this);
        C1016e r02 = new C1016e();
        r02.f3737b = true;
        r02.f3738c = true;
        r02.f3740e = new ArrayList();
        new ArrayList();
        r02.f3741f = null;
        r02.f3742g = new C1013b();
        r02.f3743h = new ArrayList();
        r02.f3736a = this;
        r02.f3739d = this;
        this.f3641f0 = r02;
        this.f3642g0 = null;
        this.f3643h0 = false;
        this.f3644i0 = new C0985e();
        this.f3647l0 = 0;
        this.f3648m0 = 0;
        this.f3649n0 = new C0997b[4];
        this.f3650o0 = new C0997b[4];
        this.f3651p0 = 263;
        this.f3652q0 = false;
        this.f3653r0 = false;
    }

    /* JADX INFO: renamed from: B */
    public final void m2422B(C0999d r6, int r7) {
        if (r7 != 0) goto L8;
        int r72 = this.f3647l0 + 1;
        C0997b[] r1 = this.f3650o0;
        if (r72 < r1.length) goto L7;
        this.f3650o0 = (C0997b[]) Arrays.copyOf(r1, r1.length * 2);
    L7:
        C0997b[] r73 = this.f3650o0;
        int r12 = this.f3647l0;
        r73[r12] = new C0997b(r6, 0, this.f3643h0);
        this.f3647l0 = r12 + 1;
        return;
    L8:
        if (r7 != 1) goto L15;
        int r74 = this.f3648m0 + 1;
        C0997b[] r13 = this.f3649n0;
        if (r74 < r13.length) goto L12;
        this.f3649n0 = (C0997b[]) Arrays.copyOf(r13, r13.length * 2);
    L12:
        C0997b[] r75 = this.f3649n0;
        int r14 = this.f3648m0;
        r75[r14] = new C0997b(r6, 1, this.f3643h0);
        this.f3648m0 = r14 + 1;
        return;
    }

    /* JADX INFO: renamed from: C */
    public final void m2423C(C0985e r15) {
        mo2386a(r15);
        int r02 = this.f3639d0.size();
        int r2 = 0;
        boolean r3 = false;
    L4:
        if (r2 >= r02) goto L10;
        C0999d r5 = (C0999d) this.f3639d0.get(r2);
        boolean[] r6 = r5.f3591H;
        r6[0] = false;
        r6[1] = false;
        if ((r5 instanceof C0996a) == false) goto L8;
        r3 = true;
    L8:
        r2 = r2 + 1;
        goto L4
    L10:
        if (r3 == false) goto L29;
        int r32 = 0;
    L12:
        if (r32 >= r02) goto L29;
        C0999d r52 = (C0999d) this.f3639d0.get(r32);
        if ((r52 instanceof C0996a) == false) goto L28;
        C0996a r53 = (C0996a) r52;
        int r62 = 0;
    L17:
        if (r62 >= r53.f3714e0) goto L28;
        C0999d r7 = r53.f3713d0[r62];
        int r8 = r53.f3557f0;
        if (r8 == 0) goto L26;
        if (r8 == 1) goto L26;
        if (r8 != 2) goto L24;
    L25:
        r7.f3591H[1] = true;
    L27:
        r62 = r62 + 1;
        goto L17
    L24:
        if (r8 != 3) goto L27;
    L26:
        r7.f3591H[0] = true;
    L28:
        r32 = r32 + 1;
    L29:
        int r33 = 0;
    L30:
        if (r33 >= r02) goto L37;
        C0999d r54 = (C0999d) this.f3639d0.get(r33);
        r54.getClass();
        if ((r54 instanceof C1002g) == false) goto L34;
    L35:
        r54.mo2386a(r15);
    L36:
        r33 = r33 + 1;
        goto L30
    L34:
        if ((r54 instanceof C1003h) == false) goto L36;
    L37:
        int r34 = 0;
    L38:
        if (r34 >= r02) goto L78;
        C0999d r55 = (C0999d) this.f3639d0.get(r34);
        if ((r55 instanceof C1000e) == false) goto L51;
        int[] r63 = r55.f3615c0;
        int r72 = r63[0];
        int r64 = r63[1];
        if (r72 != 2) goto L44;
        r55.m2418w(1);
    L44:
        if (r64 != 2) goto L46;
        r55.m2419x(1);
    L46:
        r55.mo2386a(r15);
        if (r72 != 2) goto L49;
        r55.m2418w(r72);
    L49:
        if (r64 != 2) goto L76;
        r55.m2419x(r64);
    L76:
        r34 = r34 + 1;
        goto L38
    L51:
        r55.f3620h = -1;
        r55.f3621i = -1;
        int[] r65 = this.f3615c0;
        int r73 = r65[0];
        int[] r82 = r55.f3615c0;
        if (r73 == 2) goto L59;
        if (r82[0] != 4) goto L59;
        C0998c r74 = r55.f3636x;
        int r10 = r74.f3581e;
        int r11 = m2407l();
        C0998c r12 = r55.f3638z;
        int r112 = r11 - r12.f3581e;
        r74.f3583g = r15.m2362j(r74);
        r12.f3583g = r15.m2362j(r12);
        r15.m2356d(r74.f3583g, r10);
        r15.m2356d(r12.f3583g, r112);
        r55.f3620h = 2;
        r55.f3597N = r10;
        int r113 = r112 - r10;
        r55.f3593J = r113;
        int r75 = r55.f3600Q;
        if (r113 >= r75) goto L59;
        r55.f3593J = r75;
    L59:
        if (r65[1] == 2) goto L71;
        if (r82[1] != 4) goto L71;
        C0998c r66 = r55.f3637y;
        int r76 = r66.f3581e;
        int r83 = m2404i();
        C0998c r9 = r55.f3584A;
        int r84 = r83 - r9.f3581e;
        r66.f3583g = r15.m2362j(r66);
        r9.f3583g = r15.m2362j(r9);
        r15.m2356d(r66.f3583g, r76);
        r15.m2356d(r9.f3583g, r84);
        if (r55.f3599P <= 0) goto L65;
    L66:
        C0998c r67 = r55.f3585B;
        C0989i r92 = r15.m2362j(r67);
        r67.f3583g = r92;
        r15.m2356d(r92, r55.f3599P + r76);
    L67:
        r55.f3621i = 2;
        r55.f3598O = r76;
        int r85 = r84 - r76;
        r55.f3594K = r85;
        int r68 = r55.f3601R;
        if (r85 >= r68) goto L71;
        r55.f3594K = r68;
        goto L71
    L65:
        if (r55.f3605V != 8) goto L67;
    L71:
        if ((r55 instanceof C1002g) == true) goto L76;
        if ((r55 instanceof C1003h) == true) goto L76;
        r55.mo2386a(r15);
        goto L76
    L78:
        if (this.f3647l0 <= 0) goto L81;
        AbstractC1005j.m2437a(this, r15, 0);
    L81:
        if (this.f3648m0 <= 0) goto L102;
        AbstractC1005j.m2437a(this, r15, 1);
        return;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m2424D(int r17, boolean r18) {
        C1016e r2 = this.f3641f0;
        C1000e r3 = r2.f3736a;
        int r5 = r3.m2403h(0);
        int r7 = r3.m2403h(1);
        int r8 = r3.m2408m();
        int r9 = r3.m2409n();
        ArrayList r10 = r2.f3740e;
        C1023l r11 = r3.f3617e;
        C1021j r12 = r3.f3616d;
        if (r18 == true) goto L5;
    L24:
        int[] r4 = r3.f3615c0;
        if (r17 != 0) goto L31;
        boolean r14 = false;
        int r42 = r4[0];
        if (r42 == 1) goto L29;
        if (r42 == 4) goto L29;
    L35:
        boolean r43 = r14;
    L37:
        r2.m2459g();
        Iterator r22 = r10.iterator();
    L39:
        if (r22.hasNext() == false) goto L49;
        AbstractC1024m r82 = (AbstractC1024m) r22.next();
        if (r82.f3767f != r17) goto L39;
        if (r82.f3763b != r3) goto L48;
        if (r82.f3768g == false) goto L39;
    L48:
        r82.mo2447e();
        goto L39
    L49:
        Iterator r23 = r10.iterator();
    L51:
        if (r23.hasNext() == false) goto L70;
        AbstractC1024m r83 = (AbstractC1024m) r23.next();
        if (r83.f3767f != r17) goto L51;
        if (r43 == true) goto L60;
        if (r83.f3763b == r3) goto L51;
    L60:
        if (r83.f3769h.f3753j == false) goto L61;
        if (r83.f3770i.f3753j == false) goto L61;
        if ((r83 instanceof C1014c) == true) goto L51;
        if (r83.f3766e.f3753j == true) goto L51;
    L61:
        boolean r44 = r14;
    L71:
        r3.m2418w(r5);
        r3.m2419x(r7);
        return r44;
    L70:
        r44 = true;
    L29:
        int r45 = r3.m2407l() + r8;
        r12.f3770i.mo2462d(r45);
        r12.f3766e.mo2462d(r45 - r8);
    L30:
        r43 = true;
        goto L37
    L31:
        r14 = false;
        int r46 = r4[1];
        if (r46 == 1) goto L36;
        if (r46 != 4) goto L35;
    L36:
        int r47 = r3.m2404i() + r9;
        r11.f3770i.mo2462d(r47);
        r11.f3766e.mo2462d(r47 - r9);
        goto L30
    L5:
        if (r5 == 2) goto L7;
        if (r7 != 2) goto L24;
    L7:
        Iterator r142 = r10.iterator();
    L9:
        if (r142.hasNext() == false) goto L16;
        AbstractC1024m r15 = (AbstractC1024m) r142.next();
        if (r15.f3767f != r17) goto L9;
        if (r15.mo2450k() == true) goto L9;
        boolean r48 = false;
    L17:
        if (r17 != 0) goto L21;
        if (r48 == false) goto L24;
        if (r5 != 2) goto L24;
        r3.m2418w(1);
        r3.m2420y(r2.m2456d(r3, 0));
        r12.f3766e.mo2462d(r3.m2407l());
        goto L24
    L21:
        if (r48 == false) goto L24;
        if (r7 != 2) goto L24;
        r3.m2419x(1);
        r3.m2417v(r2.m2456d(r3, 1));
        r11.f3766e.mo2462d(r3.m2404i());
        goto L24
    L16:
        r48 = r18;
        goto L17
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX INFO: renamed from: E */
    public final void m2425E() {
        int r2 = 0;
        this.f3597N = 0;
        this.f3598O = 0;
        int r3 = Math.max(0, m2407l());
        int r4 = Math.max(0, m2404i());
        this.f3652q0 = false;
        this.f3653r0 = false;
        int r02 = this.f3651p0;
        if ((r02 & 64) != 64) goto L5;
        boolean r5 = true;
    L6:
        if (r5 == false) goto L8;
    L11:
        boolean r03 = true;
    L12:
        C0985e r52 = this.f3644i0;
        r52.getClass();
        r52.f3491f = false;
        if (this.f3651p0 == 0) goto L16;
        if (r03 == false) goto L16;
        r52.f3491f = true;
    L16:
        ?? r7 = this.f3615c0;
        ?? r8 = r7[1];
        ?? r9 = r7[0];
        ArrayList r10 = this.f3639d0;
        if (r9 == 2) goto L21;
        if (r8 == 2) goto L21;
        boolean r12 = false;
    L22:
        this.f3647l0 = 0;
        this.f3648m0 = 0;
        int r13 = r10.size();
        int r04 = 0;
    L23:
        if (r04 >= r13) goto L28;
        C0999d r14 = (C0999d) this.f3639d0.get(r04);
        if ((r14 instanceof C1000e) == false) goto L27;
        ((C1000e) r14).m2425E();
    L27:
        r04 = r04 + 1;
        goto L23
    L28:
        int r05 = 0;
        ?? r15 = 0;
        boolean r142 = true;
    L29:
        if (r142 == false) goto L106;
        int r11 = r05 + 1;
        r52.m2369r();     // Catch: Exception -> L34
        this.f3647l0 = r2;     // Catch: Exception -> L34
        this.f3648m0 = r2;     // Catch: Exception -> L34
        m2401f(r52);     // Catch: Exception -> L34
        int r06 = r2;
    L32:
        if (r06 >= r13) goto L36;
        ((C0999d) this.f3639d0.get(r06)).m2401f(r52);     // Catch: Exception -> L34
        r06 = r06 + 1;     // Catch: Exception -> L34
        goto L32
    L36:
        m2423C(r52);     // Catch: Exception -> L34
        C0987g r07 = r52.f3487b;     // Catch: Exception -> L52
        if (r52.f3491f == false) goto L50;
        int r6 = r2;
    L41:
        if (r6 >= r52.f3494i) goto L46;
        if (r52.f3490e[r6].f3483e == false) goto L44;
        r6 = r6 + 1;     // Catch: Exception -> L52
        goto L41
    L44:
        r52.m2366o(r07);     // Catch: Exception -> L52
    L51:
        boolean r17 = true;
    L55:
        boolean[] r08 = AbstractC1005j.f3715a;
        if (r17 == false) goto L60;
        r08[2] = false;
        mo2397A(r52);
        int r22 = this.f3639d0.size();
        int r62 = 0;
    L58:
        if (r62 >= r22) goto L63;
        ((C0999d) this.f3639d0.get(r62)).mo2397A(r52);
        r62 = r62 + 1;
    L63:
        if (r12 == true) goto L65;
    L81:
        int r172 = r11;
        boolean r09 = false;
    L82:
        int r23 = Math.max(this.f3600Q, m2407l());
        if (r23 <= m2407l()) goto L85;
        m2420y(r23);
        ?? r24 = 1;
        r7[0] = 1;
        r09 = true;
        ?? r16 = 1;
    L86:
        int r63 = Math.max(this.f3601R, m2404i());
        if (r63 <= m2404i()) goto L89;
        m2417v(r63);
        r7[r24] = r24;
        ?? r010 = r24;
        boolean r64 = r010 == true ? 1 : 0;
        ?? r011 = r010;
    L90:
        if (r011 != 0) goto L104;
        ?? r012 = r011;
        r012 = r011;
        if (r7[0] != 2) goto L97;
        if (r3 <= 0) goto L97;
        r012 = r011;
        if (m2407l() <= r3) goto L97;
        this.f3652q0 = r24;
        r7[0] = r24;
        m2420y(r3);
        ?? r013 = r24;
        r64 = r013 == true ? 1 : 0;
        r012 = r013;
    L97:
        char r143 = 2;
        ?? r014 = r012;
        r014 = r012;
        if (r7[r24] != 2) goto L103;
        if (r4 <= 0) goto L103;
        r014 = r012;
        if (m2404i() <= r4) goto L103;
        this.f3653r0 = r24;
        r7[r24] = r24;
        m2417v(r4);
        r64 = true;
        ?? r152 = 1;
    L105:
        r05 = r172;
        r2 = 0;
        r142 = r64;
        r15 = r152;
    L103:
        r152 = r014;
        goto L105
    L104:
        r143 = 2;
        r014 = r011;
        goto L103
    L89:
        r64 = r09;
        r011 = r16;
        goto L90
    L85:
        r24 = 1;
        r16 = r15;
        goto L86
    L65:
        if (r11 >= 8) goto L81;
        if (r08[2] == false) goto L81;
        int r015 = 0;
        int r25 = 0;
        int r65 = 0;
    L69:
        if (r015 >= r13) goto L71;
        C0999d r144 = (C0999d) this.f3639d0.get(r015);
        int r173 = r11;
        r25 = Math.max(r25, r144.m2407l() + r144.f3597N);
        r65 = Math.max(r65, r144.m2404i() + r144.f3598O);
        r015 = r015 + 1;
        r11 = r173;
        goto L69
    L71:
        r172 = r11;
        int r016 = Math.max(this.f3600Q, r25);
        int r26 = Math.max(this.f3601R, r65);
        if (r9 == 2) goto L74;
    L76:
        r09 = false;
        r15 = r15;
    L77:
        if (r8 != 2) goto L82;
        if (m2404i() >= r26) goto L82;
        m2417v(r26);
        r7[1] = 2;
        r09 = true;
        r15 = 1;
        goto L82
    L74:
        if (m2407l() >= r016) goto L76;
        m2420y(r016);
        r7[0] = 2;
        r09 = true;
        r15 = 1;
        goto L77
    L60:
        mo2397A(r52);
        int r27 = 0;
    L61:
        if (r27 >= r13) goto L63;
        ((C0999d) this.f3639d0.get(r27)).mo2397A(r52);
        r27 = r27 + 1;
        goto L61
    L46:
        int r017 = r2;
    L48:
        if (r017 >= r52.f3494i) goto L51;
        C0983c r66 = r52.f3490e[r017];     // Catch: Exception -> L52
        r66.f3479a.f3510e = r66.f3480b;     // Catch: Exception -> L52
        r017 = r017 + 1;     // Catch: Exception -> L52
        goto L48
    L50:
        r52.m2366o(r07);     // Catch: Exception -> L52
    L52:
        e = e;
        r142 = true;
    L54:
        e.printStackTrace();
        r17 = r142;
        System.out.println("EXCEPTION : " + e);
    L34:
        e = e;
        goto L54
    L106:
        this.f3639d0 = r10;
        if (r15 == 0) goto L109;
        r7[0] = r9;
        r7[1] = r8;
    L109:
        mo2416u(r52.f3496k);
        return;
    L21:
        r12 = true;
        goto L22
    L8:
        if ((r02 & 128) == 128) goto L11;
        r03 = false;
        goto L12
    L5:
        r5 = false;
        goto L6
    }

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: s */
    public final void mo2414s() {
        this.f3644i0.m2369r();
        this.f3645j0 = 0;
        this.f3646k0 = 0;
        this.f3639d0.clear();
        super.mo2414s();
    }

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: u */
    public final void mo2416u(C0463v r4) {
        super.mo2416u(r4);
        int r02 = this.f3639d0.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        ((C0999d) this.f3639d0.get(r1)).mo2416u(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: z */
    public final void mo2421z(boolean r4, boolean r5) {
        super.mo2421z(r4, r5);
        int r02 = this.f3639d0.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        ((C0999d) this.f3639d0.get(r1)).mo2421z(r4, r5);
        r1 = r1 + 1;
        goto L3
    }
}
