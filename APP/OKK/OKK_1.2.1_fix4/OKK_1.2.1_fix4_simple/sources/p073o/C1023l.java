package p073o;

import p069m.AbstractC0988h;
import p071n.AbstractC1004i;
import p071n.C0998c;
import p071n.C0999d;

/* JADX INFO: renamed from: o.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1023l extends AbstractC1024m {

    /* JADX INFO: renamed from: k */
    public C1017f f3760k;

    /* JADX INFO: renamed from: l */
    public C1012a f3761l;

    @Override // p073o.InterfaceC1015d
    /* JADX INFO: renamed from: a */
    public final void mo2445a(InterfaceC1015d r11) {
        if (AbstractC0988h.m2372a(this.f3771j) == 3) goto L81;
        C1018g r112 = this.f3766e;
        if (r112.f3746c == true) goto L7;
    L32:
        C1017f r2 = this.f3769h;
        if (r2.f3746c == false) goto L83;
        C1017f r5 = this.f3770i;
        if (r5.f3746c == true) goto L38;
        return;
    L38:
        if (r2.f3753j == false) goto L45;
        if (r5.f3753j == false) goto L45;
        if (r112.f3753j == false) goto L45;
        return;
    L45:
        if (r112.f3753j == true) goto L55;
        if (this.f3765d != 3) goto L55;
        C0999d r6 = this.f3763b;
        if (r6.f3622j != 0) goto L55;
        if (r6.m2413r() == true) goto L55;
        C1017f r02 = (C1017f) r2.f3755l.get(0);
        C1017f r1 = (C1017f) r5.f3755l.get(0);
        int r03 = r02.f3750g + r2.f3749f;
        int r12 = r1.f3750g + r5.f3749f;
        r2.mo2462d(r03);
        r5.mo2462d(r12);
        r112.mo2462d(r12 - r03);
        return;
    L55:
        if (r112.f3753j == true) goto L69;
        if (this.f3765d != 3) goto L69;
        if (this.f3762a != 1) goto L69;
        if (r2.f3755l.size() <= 0) goto L69;
        if (r5.f3755l.size() <= 0) goto L69;
        C1017f r04 = (C1017f) r2.f3755l.get(0);
        C1017f r13 = (C1017f) r5.f3755l.get(0);
        int r14 = (r13.f3750g + r5.f3749f) - (r04.f3750g + r2.f3749f);
        int r05 = r112.f3756m;
        if (r14 >= r05) goto L67;
        r112.mo2462d(r14);
        goto L69
    L67:
        r112.mo2462d(r05);
    L69:
        if (r112.f3753j == true) goto L72;
        return;
    L72:
        if (r2.f3755l.size() > 0) goto L74;
        return;
    L74:
        if (r5.f3755l.size() <= 0) goto L85;
        C1017f r06 = (C1017f) r2.f3755l.get(0);
        C1017f r15 = (C1017f) r5.f3755l.get(0);
        int r4 = r06.f3750g;
        int r62 = r2.f3749f + r4;
        int r7 = r15.f3750g;
        int r8 = r5.f3749f + r7;
        float r9 = this.f3763b.f3603T;
        if (r06 != r15) goto L78;
        r9 = 0.5f;
    L79:
        r2.mo2462d((int) ((((r7 - r4) - r112.f3750g) * r9) + (r4 + 0.5f)));
        r5.mo2462d(r2.f3750g + r112.f3750g);
        return;
    L78:
        r4 = r62;
        r7 = r8;
        goto L79
    L85:
        return;
    L83:
        return;
    L7:
        if (r112.f3753j == true) goto L32;
        if (this.f3765d != 3) goto L32;
        C0999d r22 = this.f3763b;
        int r52 = r22.f3623k;
        if (r52 == 2) goto L27;
        if (r52 != 3) goto L32;
        C1018g r53 = r22.f3616d.f3766e;
        if (r53.f3753j == false) goto L32;
        int r63 = r22.f3596M;
        if (r63 == (-1)) goto L25;
        if (r63 == 0) goto L24;
        if (r63 == 1) goto L21;
        int r23 = 0;
    L26:
        r112.mo2462d(r23);
        goto L32
    L21:
        float r54 = r53.f3750g;
        float r24 = r22.f3595L;
    L22:
        float r55 = r54 / r24;
    L23:
        r23 = (int) (r55 + 0.5f);
        goto L26
    L24:
        r55 = r53.f3750g * r22.f3595L;
        goto L23
    L25:
        r54 = r53.f3750g;
        r24 = r22.f3595L;
        goto L22
    L27:
        C0999d r56 = r22.f3592I;
        if (r56 == null) goto L32;
        if (r56.f3617e.f3766e.f3753j == false) goto L32;
        r112.mo2462d((int) ((r5.f3750g * r22.f3630r) + 0.5f));
        goto L32
    L81:
        C0999d r113 = this.f3763b;
        m2475l(r113.f3637y, r113.f3584A, 1);
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: d */
    public final void mo2446d() {
        C0999d r02 = this.f3763b;
        boolean r1 = r02.f3610a;
        C1018g r2 = this.f3766e;
        if (r1 == false) goto L5;
        r2.mo2462d(r02.m2404i());
    L5:
        boolean r03 = r2.f3753j;
        C1017f r12 = this.f3770i;
        C1017f r3 = this.f3769h;
        if (r03 == true) goto L22;
        C0999d r04 = this.f3763b;
        this.f3765d = r04.f3615c0[1];
        if (r04.f3635w == false) goto L10;
        this.f3761l = new C1012a(this);
    L10:
        int r05 = this.f3765d;
        if (r05 == 3) goto L29;
        if (r05 != 4) goto L19;
        C0999d r7 = this.f3763b.f3592I;
        if (r7 == null) goto L19;
        if (r7.f3615c0[1] != 1) goto L19;
        int r06 = (r7.m2404i() - this.f3763b.f3637y.m2390c()) - this.f3763b.f3584A.m2390c();
        C1023l r4 = r7.f3617e;
        AbstractC1024m.m2470b(r3, r4.f3769h, this.f3763b.f3637y.m2390c());
        AbstractC1024m.m2470b(r12, r4.f3770i, -this.f3763b.f3584A.m2390c());
        r2.mo2462d(r06);
        return;
    L19:
        if (r05 != 1) goto L29;
        r2.mo2462d(this.f3763b.m2404i());
    L29:
        boolean r07 = r2.f3753j;
        C1017f r72 = this.f3760k;
        if (r07 == false) goto L78;
        C0999d r10 = this.f3763b;
        if (r10.f3610a == false) goto L78;
        C0998c[] r08 = r10.f3589F;
        C0998c r11 = r08[2];
        C0998c r122 = r11.f3580d;
        if (r122 != null) goto L36;
    L50:
        if (r122 == null) goto L56;
        C1017f r09 = AbstractC1024m.m2471h(r11);
        if (r09 == null) goto L153;
        AbstractC1024m.m2470b(r3, r09, this.f3763b.f3589F[2].m2390c());
        AbstractC1024m.m2470b(r12, r3, r2.f3750g);
        C0999d r010 = this.f3763b;
        if (r010.f3635w == false) goto L154;
        AbstractC1024m.m2470b(r72, r3, r010.f3599P);
        return;
    L154:
        return;
    L153:
        return;
    L56:
        C0998c r5 = r08[3];
        if (r5.f3580d == null) goto L64;
        C1017f r011 = AbstractC1024m.m2471h(r5);
        if (r011 == null) goto L61;
        AbstractC1024m.m2470b(r12, r011, -this.f3763b.f3589F[3].m2390c());
        AbstractC1024m.m2470b(r3, r12, -r2.f3750g);
    L61:
        C0999d r012 = this.f3763b;
        if (r012.f3635w == false) goto L156;
        AbstractC1024m.m2470b(r72, r3, r012.f3599P);
        return;
    L156:
        return;
    L64:
        C0998c r013 = r08[4];
        if (r013.f3580d == null) goto L70;
        C1017f r014 = AbstractC1024m.m2471h(r013);
        if (r014 == null) goto L158;
        AbstractC1024m.m2470b(r72, r014, 0);
        AbstractC1024m.m2470b(r3, r72, -this.f3763b.f3599P);
        AbstractC1024m.m2470b(r12, r3, r2.f3750g);
        return;
    L158:
        return;
    L70:
        if ((r10 instanceof AbstractC1004i) == false) goto L72;
        return;
    L72:
        if (r10.f3592I != null) goto L74;
        return;
    L74:
        if (r10.mo2402g(7).f3580d != null) goto L162;
        C0999d r015 = this.f3763b;
        AbstractC1024m.m2470b(r3, r015.f3592I.f3617e.f3769h, r015.m2409n());
        AbstractC1024m.m2470b(r12, r3, r2.f3750g);
        C0999d r016 = this.f3763b;
        if (r016.f3635w == false) goto L163;
        AbstractC1024m.m2470b(r72, r3, r016.f3599P);
        return;
    L163:
        return;
    L162:
        return;
    L36:
        if (r08[3].f3580d == null) goto L50;
        if (r10.m2413r() == false) goto L40;
        r3.f3749f = this.f3763b.f3589F[2].m2390c();
        r12.f3749f = -this.f3763b.f3589F[3].m2390c();
    L47:
        C0999d r017 = this.f3763b;
        if (r017.f3635w == false) goto L151;
        AbstractC1024m.m2470b(r72, r3, r017.f3599P);
        return;
    L151:
        return;
    L40:
        C1017f r018 = AbstractC1024m.m2471h(this.f3763b.f3589F[2]);
        if (r018 == null) goto L43;
        AbstractC1024m.m2470b(r3, r018, this.f3763b.f3589F[2].m2390c());
    L43:
        C1017f r019 = AbstractC1024m.m2471h(this.f3763b.f3589F[3]);
        if (r019 == null) goto L46;
        AbstractC1024m.m2470b(r12, r019, -this.f3763b.f3589F[3].m2390c());
    L46:
        r3.f3745b = true;
        r12.f3745b = true;
    L78:
        if (r07 == false) goto L80;
    L95:
        r2.m2460b(this);
    L96:
        C0999d r020 = this.f3763b;
        C0998c[] r102 = r020.f3589F;
        C0998c r112 = r102[2];
        C0998c r123 = r112.f3580d;
        if (r123 == null) goto L108;
        if (r102[3].f3580d == null) goto L108;
        if (r020.m2413r() == false) goto L103;
        r3.f3749f = this.f3763b.f3589F[2].m2390c();
        r12.f3749f = -this.f3763b.f3589F[3].m2390c();
    L105:
        if (this.f3763b.f3635w == false) goto L148;
        m2473c(r72, r3, 1, this.f3761l);
    L148:
        if (r2.f3755l.size() != 0) goto L165;
        r2.f3746c = true;
        return;
    L165:
        return;
    L103:
        C1017f r021 = AbstractC1024m.m2471h(this.f3763b.f3589F[2]);
        C1017f r13 = AbstractC1024m.m2471h(this.f3763b.f3589F[3]);
        r021.m2460b(this);
        r13.m2460b(this);
        this.f3771j = 4;
    L108:
        if (r123 == null) goto L121;
        C1017f r022 = AbstractC1024m.m2471h(r112);
        if (r022 == null) goto L148;
        AbstractC1024m.m2470b(r3, r022, this.f3763b.f3589F[2].m2390c());
        m2473c(r12, r3, 1, r2);
        if (this.f3763b.f3635w == false) goto L115;
        m2473c(r72, r3, 1, this.f3761l);
    L115:
        if (this.f3765d != 3) goto L148;
        C0999d r023 = this.f3763b;
        if (r023.f3595L <= 0.0f) goto L148;
        C1021j r024 = r023.f3616d;
        if (r024.f3765d != 3) goto L148;
        r024.f3766e.f3754k.add(r2);
        r2.f3755l.add(this.f3763b.f3616d.f3766e);
        r2.f3744a = this;
        goto L148
    L121:
        C0998c r9 = r102[3];
        if (r9.f3580d == null) goto L128;
        C1017f r025 = AbstractC1024m.m2471h(r9);
        if (r025 == null) goto L148;
        AbstractC1024m.m2470b(r12, r025, -this.f3763b.f3589F[3].m2390c());
        m2473c(r3, r12, -1, r2);
        if (this.f3763b.f3635w == false) goto L148;
        m2473c(r72, r3, 1, this.f3761l);
        goto L148
    L128:
        C0998c r6 = r102[4];
        if (r6.f3580d == null) goto L134;
        C1017f r026 = AbstractC1024m.m2471h(r6);
        if (r026 == null) goto L148;
        AbstractC1024m.m2470b(r72, r026, 0);
        m2473c(r3, r72, -1, this.f3761l);
        m2473c(r12, r3, 1, r2);
        goto L148
    L134:
        if ((r020 instanceof AbstractC1004i) == true) goto L148;
        C0999d r62 = r020.f3592I;
        if (r62 == null) goto L148;
        AbstractC1024m.m2470b(r3, r62.f3617e.f3769h, r020.m2409n());
        m2473c(r12, r3, 1, r2);
        if (this.f3763b.f3635w == false) goto L141;
        m2473c(r72, r3, 1, this.f3761l);
    L141:
        if (this.f3765d != 3) goto L148;
        C0999d r027 = this.f3763b;
        if (r027.f3595L <= 0.0f) goto L148;
        C1021j r028 = r027.f3616d;
        if (r028.f3765d != 3) goto L148;
        r028.f3766e.f3754k.add(r2);
        r2.f3755l.add(this.f3763b.f3616d.f3766e);
        r2.f3744a = this;
        goto L148
    L80:
        if (this.f3765d != 3) goto L95;
        C0999d r029 = this.f3763b;
        int r103 = r029.f3623k;
        if (r103 == 2) goto L91;
        if (r103 != 3) goto L96;
        if (r029.m2413r() == true) goto L96;
        C0999d r030 = this.f3763b;
        if (r030.f3622j == 3) goto L96;
        C1018g r031 = r030.f3616d.f3766e;
        r2.f3755l.add(r031);
        r031.f3754k.add(r2);
        r2.f3745b = true;
        r2.f3754k.add(r3);
        r2.f3754k.add(r12);
        goto L96
    L91:
        C0999d r032 = r029.f3592I;
        if (r032 == null) goto L96;
        C1018g r033 = r032.f3617e.f3766e;
        r2.f3755l.add(r033);
        r033.f3754k.add(r2);
        r2.f3745b = true;
        r2.f3754k.add(r3);
        r2.f3754k.add(r12);
        goto L96
    L22:
        if (this.f3765d != 4) goto L29;
        C0999d r034 = this.f3763b;
        C0999d r73 = r034.f3592I;
        if (r73 == null) goto L29;
        if (r73.f3615c0[1] != 1) goto L29;
        C1023l r22 = r73.f3617e;
        AbstractC1024m.m2470b(r3, r22.f3769h, r034.f3637y.m2390c());
        AbstractC1024m.m2470b(r12, r22.f3770i, -this.f3763b.f3584A.m2390c());
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: e */
    public final void mo2447e() {
        C1017f r02 = this.f3769h;
        if (r02.f3753j == false) goto L6;
        C0999d r1 = this.f3763b;
        r1.f3598O = r02.f3750g;
        return;
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: f */
    public final void mo2448f() {
        this.f3764c = null;
        this.f3769h.m2461c();
        this.f3770i.m2461c();
        this.f3760k.m2461c();
        this.f3766e.m2461c();
        this.f3768g = false;
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: k */
    public final boolean mo2450k() {
        if (this.f3765d == 3) goto L5;
        return true;
    L5:
        if (this.f3763b.f3623k != 0) goto L7;
        return true;
    L7:
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m2469m() {
        this.f3768g = false;
        C1017f r1 = this.f3769h;
        r1.m2461c();
        r1.f3753j = false;
        C1017f r12 = this.f3770i;
        r12.m2461c();
        r12.f3753j = false;
        C1017f r13 = this.f3760k;
        r13.m2461c();
        r13.f3753j = false;
        this.f3766e.f3753j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f3763b.f3606W;
    }
}
