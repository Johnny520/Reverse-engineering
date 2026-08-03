package p073o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p071n.AbstractC1004i;
import p071n.C0998c;
import p071n.C0999d;
import p071n.C1000e;
import p071n.C1003h;
import p075p.C1040f;

/* JADX INFO: renamed from: o.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1016e {

    /* JADX INFO: renamed from: a */
    public C1000e f3736a;

    /* JADX INFO: renamed from: b */
    public boolean f3737b;

    /* JADX INFO: renamed from: c */
    public boolean f3738c;

    /* JADX INFO: renamed from: d */
    public C1000e f3739d;

    /* JADX INFO: renamed from: e */
    public ArrayList f3740e;

    /* JADX INFO: renamed from: f */
    public C1040f f3741f;

    /* JADX INFO: renamed from: g */
    public C1013b f3742g;

    /* JADX INFO: renamed from: h */
    public ArrayList f3743h;

    /* JADX INFO: renamed from: a */
    public final void m2453a(C1017f r7, int r8, ArrayList r9, C1022k r10) {
        AbstractC1024m r72 = r7.f3747d;
        if (r72.f3764c != null) goto L48;
        C1000e r02 = this.f3736a;
        if (r72 != r02.f3616d) goto L7;
        return;
    L7:
        if (r72 == r02.f3617e) goto L70;
        if (r10 != null) goto L11;
        r10 = new C1022k();
        r10.f3758a = null;
        r10.f3759b = new ArrayList();
        r10.f3758a = r72;
        r9.add(r10);
    L11:
        r72.f3764c = r10;
        r10.f3759b.add(r72);
        C1017f r03 = r72.f3769h;
        Iterator r1 = r03.f3754k.iterator();
    L13:
        if (r1.hasNext() == false) goto L17;
        InterfaceC1015d r2 = (InterfaceC1015d) r1.next();
        if ((r2 instanceof C1017f) == false) goto L13;
        m2453a((C1017f) r2, r8, r9, r10);
        goto L13
    L17:
        C1017f r12 = r72.f3770i;
        Iterator r22 = r12.f3754k.iterator();
    L19:
        if (r22.hasNext() == false) goto L24;
        InterfaceC1015d r3 = (InterfaceC1015d) r22.next();
        if ((r3 instanceof C1017f) == false) goto L19;
        m2453a((C1017f) r3, r8, r9, r10);
        goto L19
    L24:
        if (r8 == 1) goto L26;
    L33:
        Iterator r04 = r03.f3755l.iterator();
    L35:
        if (r04.hasNext() == false) goto L37;
        m2453a((C1017f) r04.next(), r8, r9, r10);
        goto L35
    L37:
        Iterator r05 = r12.f3755l.iterator();
    L39:
        if (r05.hasNext() == false) goto L41;
        m2453a((C1017f) r05.next(), r8, r9, r10);
        goto L39
    L41:
        if (r8 == 1) goto L43;
        return;
    L43:
        if ((r72 instanceof C1023l) == false) goto L69;
        Iterator r73 = ((C1023l) r72).f3760k.f3755l.iterator();
    L46:
        if (r73.hasNext() == false) goto L71;
        m2453a((C1017f) r73.next(), r8, r9, r10);
        goto L46
    L71:
        return;
    L69:
        return;
    L26:
        if ((r72 instanceof C1023l) == false) goto L33;
        Iterator r32 = ((C1023l) r72).f3760k.f3754k.iterator();
    L29:
        if (r32.hasNext() == false) goto L33;
        InterfaceC1015d r4 = (InterfaceC1015d) r32.next();
        if ((r4 instanceof C1017f) == false) goto L29;
        m2453a((C1017f) r4, r8, r9, r10);
        goto L29
    L70:
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m2454b(C1000e r20) {
        Iterator r1 = r20.f3639d0.iterator();
    L4:
        if (r1.hasNext() == false) goto L148;
        C0999d r2 = (C0999d) r1.next();
        int[] r3 = r2.f3615c0;
        int r5 = r3[0];
        int r32 = r3[1];
        if (r2.f3605V == 8) goto L7;
        float r6 = r2.f3627o;
        if (r6 >= 1.0f) goto L12;
        if (r5 != 3) goto L12;
        r2.f3622j = 2;
    L12:
        float r7 = r2.f3630r;
        if (r7 >= 1.0f) goto L16;
        if (r32 != 3) goto L16;
        r2.f3623k = 2;
    L16:
        int r14 = 1;
        if (r2.f3595L <= 0.0f) goto L34;
        if (r5 != 3) goto L22;
        if (r32 == 2) goto L21;
        if (r32 != 1) goto L22;
    L21:
        r2.f3622j = 3;
    L22:
        if (r32 != 3) goto L26;
        if (r5 == 2) goto L25;
        if (r5 != 1) goto L26;
    L25:
        r2.f3623k = 3;
    L26:
        if (r5 != 3) goto L34;
        if (r32 != 3) goto L34;
        if (r2.f3622j != 0) goto L32;
        r2.f3622j = 3;
    L32:
        if (r2.f3623k != 0) goto L34;
        r2.f3623k = 3;
    L34:
        C0998c r12 = r2.f3638z;
        C0998c r15 = r2.f3636x;
        if (r5 == 3) goto L37;
    L43:
        C0998c r10 = r2.f3584A;
        C0998c r4 = r2.f3637y;
        if (r32 == 3) goto L46;
    L52:
        int r11 = r32;
    L53:
        C1021j r33 = r2.f3616d;
        r33.f3765d = r5;
        int r9 = r2.f3622j;
        r33.f3762a = r9;
        C1023l r72 = r2.f3617e;
        r72.f3765d = r11;
        int r8 = r2.f3623k;
        r72.f3762a = r8;
        if (r5 == 4) goto L59;
        if (r5 == 1) goto L59;
        C0998c r17 = r4;
        int r42 = 2;
        if (r5 != 2) goto L64;
    L60:
        if (r11 == 4) goto L139;
        if (r11 == 1) goto L139;
        if (r11 != r42) goto L64;
    L139:
        int r34 = r2.m2407l();
        if (r5 != 4) goto L142;
        int r62 = (r20.m2407l() - r15.f3581e) - r12.f3581e;
        r5 = 1;
    L143:
        int r35 = r2.m2404i();
        if (r11 != 4) goto L146;
        int r73 = (r20.m2404i() - r17.f3581e) - r10.f3581e;
    L147:
        m2458f(r5, r62, r14, r73, r2);
        r33.f3766e.mo2462d(r2.m2407l());
        r72.f3766e.mo2462d(r2.m2404i());
        r2.f3610a = true;
        goto L4
    L146:
        r73 = r35;
        r14 = r11;
        goto L147
    L142:
        r62 = r34;
    L64:
        int[] r102 = r20.f3615c0;
        C0998c[] r122 = r2.f3589F;
        if (r5 != 3) goto L92;
        if (r11 == r42) goto L70;
        if (r11 == 1) goto L70;
        C1023l r152 = r72;
        C1021j r13 = r33;
        int r36 = 3;
    L93:
        if (r11 != r36) goto L116;
        if (r5 == 2) goto L99;
        if (r5 == 1) goto L99;
        int r43 = r36;
        int r37 = 1;
    L123:
        if (r5 != r43) goto L4;
        if (r11 != r43) goto L4;
        if (r9 == r37) goto L138;
        if (r8 == r37) goto L138;
        if (r8 != 2) goto L4;
        if (r9 != 2) goto L4;
        int r44 = r102[0];
        if (r44 == 1) goto L134;
        if (r44 != 1) goto L4;
    L134:
        int r45 = r102[r37];
        if (r45 == 1) goto L137;
        if (r45 != 1) goto L4;
    L137:
        m2458f(1, (int) ((r6 * r20.m2407l()) + 0.5f), 1, (int) ((r7 * r20.m2404i()) + 0.5f), r2);
        r13.f3766e.mo2462d(r2.m2407l());
        r152.f3766e.mo2462d(r2.m2404i());
        r2.f3610a = true;
    L138:
        m2458f(2, 0, 2, 0, r2);
        r13.f3766e.f3756m = r2.m2407l();
        r152.f3766e.f3756m = r2.m2404i();
    L99:
        if (r8 != r36) goto L107;
        if (r5 != 2) goto L102;
        m2458f(2, 0, 2, 0, r2);
    L102:
        int r52 = r2.m2407l();
        float r38 = r2.f3595L;
        if (r2.f3596M != (-1)) goto L105;
        r38 = 1.0f / r38;
    L105:
        m2458f(1, r52, 1, (int) ((r52 * r38) + 0.5f), r2);
        r13.f3766e.mo2462d(r2.m2407l());
        r152.f3766e.mo2462d(r2.m2404i());
        r2.f3610a = true;
        goto L4
    L107:
        if (r8 != 1) goto L110;
        m2458f(r5, 0, 2, 0, r2);
        r152.f3766e.f3756m = r2.m2404i();
        goto L4
    L110:
        if (r8 == 2) goto L111;
        if (r122[2].f3580d == null) goto L122;
        if (r122[3].f3580d != null) goto L116;
    L122:
        m2458f(2, 0, r11, 0, r2);
        r13.f3766e.mo2462d(r2.m2407l());
        r152.f3766e.mo2462d(r2.m2404i());
        r2.f3610a = true;
        goto L4
    L111:
        int r46 = r102[1];
        if (r46 == 1) goto L117;
        if (r46 != 4) goto L116;
    L117:
        m2458f(r5, r2.m2407l(), 1, (int) ((r7 * r20.m2404i()) + 0.5f), r2);
        r13.f3766e.mo2462d(r2.m2407l());
        r152.f3766e.mo2462d(r2.m2404i());
        r2.f3610a = true;
    L116:
        r37 = 1;
        r43 = 3;
    L70:
        if (r9 != 3) goto L75;
        if (r11 != r42) goto L73;
        C1021j r132 = r33;
        C1023l r92 = r72;
        m2458f(r42, 0, r42, 0, r2);
    L74:
        int r74 = r2.m2404i();
        m2458f(1, (int) ((r74 * r2.f3595L) + 0.5f), 1, r74, r2);
        r132.f3766e.mo2462d(r2.m2407l());
        r92.f3766e.mo2462d(r2.m2404i());
        r2.f3610a = true;
        goto L4
    L73:
        r132 = r33;
        r92 = r72;
        goto L74
    L75:
        r13 = r33;
        if (r9 != 1) goto L79;
        m2458f(2, 0, r11, 0, r2);
        r13.f3766e.f3756m = r2.m2407l();
        goto L4
    L79:
        if (r9 == 2) goto L80;
        if (r122[0].f3580d == null) goto L91;
        if (r122[1].f3580d == null) goto L91;
    L85:
        r152 = r72;
        r36 = 3;
    L91:
        m2458f(2, 0, r11, 0, r2);
        r13.f3766e.mo2462d(r2.m2407l());
        r72.f3766e.mo2462d(r2.m2404i());
        r2.f3610a = true;
        goto L4
    L80:
        int r47 = r102[0];
        if (r47 == 1) goto L86;
        if (r47 != 4) goto L85;
    L86:
        m2458f(1, (int) ((r6 * r20.m2407l()) + 0.5f), r11, r2.m2404i(), r2);
        r13.f3766e.mo2462d(r2.m2407l());
        r72.f3766e.mo2462d(r2.m2404i());
        r2.f3610a = true;
        goto L4
    L92:
        r13 = r33;
    L59:
        r17 = r4;
        r42 = 2;
        goto L60
    L46:
        if (r2.f3623k != 1) goto L52;
        if (r4.f3580d != null) goto L50;
    L51:
        r11 = 2;
        goto L53
    L50:
        if (r10.f3580d != null) goto L52;
    L37:
        if (r2.f3622j != 1) goto L43;
        if (r15.f3580d != null) goto L41;
    L42:
        r5 = 2;
        goto L43
    L41:
        if (r12.f3580d != null) goto L43;
    L7:
        r2.f3610a = true;
        goto L4
    }

    /* JADX INFO: renamed from: c */
    public final void m2455c() {
        ArrayList r02 = this.f3740e;
        r02.clear();
        C1000e r1 = this.f3739d;
        r1.f3616d.mo2448f();
        C1023l r2 = r1.f3617e;
        r2.mo2448f();
        r02.add(r1.f3616d);
        r02.add(r2);
        Iterator r22 = r1.f3639d0.iterator();
        HashSet r3 = null;
    L4:
        if (r22.hasNext() == false) goto L29;
        C0999d r4 = (C0999d) r22.next();
        if ((r4 instanceof C1003h) == true) goto L7;
        if (r4.m2412q() == true) goto L11;
        r02.add(r4.f3616d);
    L18:
        if (r4.m2413r() == true) goto L20;
        r02.add(r4.f3617e);
    L27:
        if ((r4 instanceof AbstractC1004i) == false) goto L4;
        r02.add(new C1020i(r4));
        goto L4
    L20:
        if (r4.f3614c != null) goto L22;
        r4.f3614c = new C1014c(r4, 1);
    L22:
        if (r3 != null) goto L24;
        r3 = new HashSet();
    L24:
        r3.add(r4.f3614c);
        goto L27
    L11:
        if (r4.f3612b != null) goto L13;
        r4.f3612b = new C1014c(r4, 0);
    L13:
        if (r3 != null) goto L15;
        r3 = new HashSet();
    L15:
        r3.add(r4.f3612b);
        goto L18
    L7:
        C1019h r5 = new C1019h(r4);
        r4.f3616d.mo2448f();
        r4.f3617e.mo2448f();
        r5.f3767f = ((C1003h) r4).f3712h0;
        r02.add(r5);
        goto L4
    L29:
        if (r3 == null) goto L31;
        r02.addAll(r3);
    L31:
        Iterator r23 = r02.iterator();
    L33:
        if (r23.hasNext() == false) goto L35;
        ((AbstractC1024m) r23.next()).mo2448f();
        goto L33
    L35:
        Iterator r03 = r02.iterator();
    L37:
        if (r03.hasNext() == false) goto L42;
        AbstractC1024m r24 = (AbstractC1024m) r03.next();
        if (r24.f3763b == r1) goto L37;
        r24.mo2446d();
        goto L37
    L42:
        ArrayList r04 = this.f3743h;
        r04.clear();
        C1000e r12 = this.f3736a;
        m2457e(r12.f3616d, 0, r04);
        m2457e(r12.f3617e, 1, r04);
        this.f3737b = false;
    }

    /* JADX INFO: renamed from: d */
    public final int m2456d(C1000e r20, int r21) {
        C1000e r02 = r20;
        ArrayList r3 = this.f3743h;
        int r4 = r3.size();
        int r7 = 0;
        long r8 = 0;
    L3:
        if (r7 >= r4) goto L53;
        AbstractC1024m r10 = ((C1022k) r3.get(r7)).f3758a;
        if ((r10 instanceof C1014c) == true) goto L7;
        if (r21 != 0) goto L14;
        if ((r10 instanceof C1021j) == false) goto L8;
    L16:
        if (r21 != 0) goto L19;
        AbstractC1024m r11 = r02.f3616d;
    L18:
        C1017f r112 = r11.f3769h;
        if (r21 != 0) goto L23;
        AbstractC1024m r12 = r02.f3616d;
    L22:
        C1017f r122 = r12.f3770i;
        boolean r113 = r10.f3769h.f3755l.contains(r112);
        C1017f r13 = r10.f3770i;
        boolean r123 = r13.f3755l.contains(r122);
        long r14 = r10.mo2449j();
        C1017f r5 = r10.f3769h;
        if (r113 == false) goto L45;
        if (r123 == false) goto L45;
        long r114 = C1022k.m2468b(r5, 0);
        ArrayList r6 = r3;
        int r16 = r4;
        long r32 = C1022k.m2467a(r13, 0);
        long r115 = r114 - r14;
        int r03 = r13.f3749f;
        ArrayList r18 = r6;
        int r17 = r7;
        if (r115 < (-r03)) goto L30;
        r115 = r115 + ((long) r03);
    L30:
        long r04 = (-r32) - r14;
        long r33 = r5.f3749f;
        long r05 = r04 - r33;
        if (r05 < r33) goto L33;
        r05 = r05 - r33;
    L33:
        C0999d r34 = r10.f3763b;
        if (r21 != 0) goto L37;
        float r35 = r34.f3602S;
    L41:
        if (r35 <= 0.0f) goto L43;
        long r06 = (long) ((r115 / (1.0f - r35)) + (r05 / r35));
    L44:
        float r07 = r06;
        long r08 = (((long) r5.f3749f) + ((((long) ((r07 * r35) + 0.5f)) + r14) + ((long) (((1.0f - r35) * r07) + 0.5f)))) - ((long) r13.f3749f);
    L51:
        r8 = Math.max(r8, r08);
        r7 = r17 + 1;
        r02 = r20;
        r4 = r16;
        r3 = r18;
        goto L3
    L43:
        r06 = 0;
        goto L44
    L37:
        if (r21 != 1) goto L39;
        r35 = r34.f3603T;
        goto L41
    L39:
        r34.getClass();
        r35 = -1.0f;
    L45:
        r18 = r3;
        r16 = r4;
        r17 = r7;
        if (r113 == false) goto L48;
        r08 = Math.max(C1022k.m2468b(r5, r5.f3749f), ((long) r5.f3749f) + r14);
        goto L51
    L48:
        if (r123 == false) goto L50;
        r08 = Math.max(-C1022k.m2467a(r13, r13.f3749f), ((long) (-r13.f3749f)) + r14);
        goto L51
    L50:
        r08 = (r10.mo2449j() + r5.f3749f) - ((long) r13.f3749f);
        goto L51
    L23:
        r12 = r02.f3617e;
        goto L22
    L19:
        r11 = r02.f3617e;
    L8:
        r18 = r3;
        r16 = r4;
        r17 = r7;
        r08 = 0;
        goto L51
    L14:
        if ((r10 instanceof C1023l) == true) goto L16;
    L7:
        if (((C1014c) r10).f3767f == r21) goto L16;
    L53:
        return (int) r8;
    }

    /* JADX INFO: renamed from: e */
    public final void m2457e(AbstractC1024m r5, int r6, ArrayList r7) {
        Iterator r02 = r5.f3769h.f3754k.iterator();
    L3:
        boolean r1 = r02.hasNext();
        C1017f r2 = r5.f3770i;
        if (r1 == false) goto L11;
        InterfaceC1015d r12 = (InterfaceC1015d) r02.next();
        if ((r12 instanceof C1017f) == true) goto L7;
        if ((r12 instanceof AbstractC1024m) == false) goto L3;
        m2453a(((AbstractC1024m) r12).f3769h, r6, r7, null);
        goto L3
    L7:
        m2453a((C1017f) r12, r6, r7, null);
        goto L3
    L11:
        Iterator r03 = r2.f3754k.iterator();
    L13:
        if (r03.hasNext() == false) goto L21;
        InterfaceC1015d r13 = (InterfaceC1015d) r03.next();
        if ((r13 instanceof C1017f) == true) goto L16;
        if ((r13 instanceof AbstractC1024m) == false) goto L13;
        m2453a(((AbstractC1024m) r13).f3770i, r6, r7, null);
        goto L13
    L16:
        m2453a((C1017f) r13, r6, r7, null);
        goto L13
    L21:
        if (r6 != 1) goto L28;
        Iterator r52 = ((C1023l) r5).f3760k.f3754k.iterator();
    L24:
        if (r52.hasNext() == false) goto L50;
        InterfaceC1015d r04 = (InterfaceC1015d) r52.next();
        if ((r04 instanceof C1017f) == false) goto L24;
        m2453a((C1017f) r04, r6, r7, null);
        goto L24
    L50:
        return;
    }

    /* JADX INFO: renamed from: f */
    public final void m2458f(int r2, int r3, int r4, int r5, C0999d r6) {
        C1013b r02 = this.f3742g;
        r02.f3724a = r2;
        r02.f3725b = r4;
        r02.f3726c = r3;
        r02.f3727d = r5;
        this.f3741f.m2519a(r6, r02);
        r6.m2420y(r02.f3728e);
        r6.m2417v(r02.f3729f);
        r6.f3635w = r02.f3731h;
        int r22 = r02.f3730g;
        r6.f3599P = r22;
        if (r22 <= 0) goto L5;
        boolean r23 = true;
    L6:
        r6.f3635w = r23;
        return;
    L5:
        r23 = false;
        goto L6
    }

    /* JADX INFO: renamed from: g */
    public final void m2459g() {
        Iterator r7 = this.f3736a.f3639d0.iterator();
    L4:
        if (r7.hasNext() == false) goto L40;
        C0999d r8 = (C0999d) r7.next();
        if (r8.f3610a == true) goto L4;
        int[] r02 = r8.f3615c0;
        boolean r1 = false;
        int r9 = r02[0];
        int r11 = r02[1];
        int r03 = r8.f3622j;
        int r2 = r8.f3623k;
        if (r9 == 2) goto L14;
        if (r9 != 3) goto L13;
        if (r03 == 1) goto L14;
    L13:
        boolean r04 = false;
    L15:
        if (r11 == 2) goto L18;
        if (r11 != 3) goto L19;
        if (r2 == 1) goto L18;
    L19:
        C1021j r13 = r8.f3616d;
        C1018g r22 = r13.f3766e;
        boolean r4 = r22.f3753j;
        C1023l r14 = r8.f3617e;
        C1018g r5 = r14.f3766e;
        boolean r15 = r5.f3753j;
        if (r4 == false) goto L23;
        if (r15 == false) goto L23;
        m2458f(1, r22.f3750g, 1, r5.f3750g, r8);
        r8.f3610a = true;
    L36:
        if (r8.f3610a == false) goto L4;
        C1012a r05 = r14.f3761l;
        if (r05 == null) goto L4;
        r05.mo2462d(r8.f3599P);
    L23:
        if (r4 == false) goto L29;
        if (r1 == false) goto L29;
        m2458f(1, r22.f3750g, 2, r5.f3750g, r8);
        if (r11 != 3) goto L28;
        r14.f3766e.f3756m = r8.m2404i();
        goto L36
    L28:
        r14.f3766e.mo2462d(r8.m2404i());
        r8.f3610a = true;
    L29:
        if (r15 == false) goto L36;
        if (r04 == false) goto L36;
        m2458f(2, r22.f3750g, 1, r5.f3750g, r8);
        if (r9 != 3) goto L34;
        r13.f3766e.f3756m = r8.m2407l();
        goto L36
    L34:
        r13.f3766e.mo2462d(r8.m2407l());
        r8.f3610a = true;
    L18:
        r1 = true;
    L14:
        r04 = true;
        goto L15
    }
}
