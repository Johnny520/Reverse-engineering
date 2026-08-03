package p073o;

import java.util.ArrayList;
import p069m.AbstractC0988h;
import p071n.AbstractC1004i;
import p071n.C0998c;
import p071n.C0999d;

/* JADX INFO: renamed from: o.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1021j extends AbstractC1024m {

    /* JADX INFO: renamed from: k */
    public static final int[] f3757k = null;

    static {
        f3757k = new int[2];
    }

    /* JADX INFO: renamed from: m */
    public static void m2465m(int[] r2, int r3, int r4, int r5, int r6, float r7, int r8) {
        int r42 = r4 - r3;
        int r62 = r6 - r5;
        if (r8 == (-1)) goto L9;
        if (r8 == 0) goto L8;
        if (r8 != 1) goto L19;
        r2[0] = r42;
        r2[1] = (int) ((r42 * r7) + 0.5f);
        return;
    L19:
        return;
    L8:
        r2[0] = (int) ((r62 * r7) + 0.5f);
        r2[1] = r62;
        return;
    L9:
        int r32 = (int) ((r62 * r7) + 0.5f);
        int r72 = (int) ((r42 / r7) + 0.5f);
        if (r32 > r42) goto L12;
        r2[0] = r32;
        r2[1] = r62;
        return;
    L12:
        if (r72 > r62) goto L18;
        r2[0] = r42;
        r2[1] = r72;
        return;
    }

    @Override // p073o.InterfaceC1015d
    /* JADX INFO: renamed from: a */
    public final void mo2445a(InterfaceC1015d r24) {
        if (AbstractC0988h.m2372a(this.f3771j) == 3) goto L173;
        C1018g r1 = this.f3766e;
        boolean r4 = r1.f3753j;
        C1017f r5 = this.f3769h;
        C1017f r6 = this.f3770i;
        if (r4 == true) goto L129;
        if (this.f3765d != 3) goto L129;
        C0999d r42 = this.f3763b;
        int r9 = r42.f3622j;
        if (r9 == 2) goto L123;
        if (r9 != 3) goto L129;
        int r92 = r42.f3623k;
        if (r92 == 0) goto L27;
        if (r92 == 3) goto L27;
        int r93 = r42.f3596M;
        if (r93 == (-1)) goto L25;
        if (r93 == 0) goto L24;
        if (r93 == 1) goto L21;
        int r43 = 0;
    L26:
        r1.mo2462d(r43);
        goto L129
    L21:
        float r94 = r42.f3617e.f3766e.f3750g;
        float r44 = r42.f3595L;
    L22:
        float r95 = r94 * r44;
    L23:
        r43 = (int) (r95 + 0.5f);
        goto L26
    L24:
        r95 = r42.f3617e.f3766e.f3750g / r42.f3595L;
        goto L23
    L25:
        r94 = r42.f3617e.f3766e.f3750g;
        r44 = r42.f3595L;
    L27:
        C1023l r96 = r42.f3617e;
        C1017f r11 = r96.f3769h;
        C1017f r97 = r96.f3770i;
        if (r42.f3636x.f3580d == null) goto L30;
        boolean r12 = true;
    L32:
        if (r42.f3637y.f3580d == null) goto L34;
        boolean r13 = true;
    L36:
        if (r42.f3638z.f3580d == null) goto L38;
        boolean r14 = true;
    L40:
        if (r42.f3584A.f3580d == null) goto L42;
        boolean r15 = true;
    L43:
        int r3 = r42.f3596M;
        if (r12 == false) goto L81;
        if (r13 == false) goto L81;
        if (r14 == false) goto L81;
        if (r15 == false) goto L81;
        float r45 = r42.f3595L;
        boolean r10 = r11.f3753j;
        int[] r122 = f3757k;
        if (r10 == true) goto L51;
    L59:
        boolean r102 = r5.f3753j;
        ArrayList r132 = r11.f3755l;
        if (r102 == false) goto L71;
        if (r6.f3753j == false) goto L71;
        if (r11.f3746c == true) goto L66;
        return;
    L66:
        if (r97.f3746c == false) goto L177;
        m2465m(r122, r5.f3750g + r5.f3749f, r6.f3750g - r6.f3749f, ((C1017f) r132.get(0)).f3750g + r11.f3749f, ((C1017f) r97.f3755l.get(0)).f3750g - r97.f3749f, r45, r3);
        r1.mo2462d(r122[0]);
        this.f3763b.f3617e.f3766e.mo2462d(r122[1]);
        goto L71
    L177:
        return;
    L71:
        if (r5.f3746c == true) goto L73;
        return;
    L73:
        if (r6.f3746c == true) goto L75;
        return;
    L75:
        if (r11.f3746c == true) goto L77;
        return;
    L77:
        if (r97.f3746c == false) goto L180;
        m2465m(r122, ((C1017f) r5.f3755l.get(0)).f3750g + r5.f3749f, ((C1017f) r6.f3755l.get(0)).f3750g - r6.f3749f, ((C1017f) r132.get(0)).f3750g + r11.f3749f, ((C1017f) r97.f3755l.get(0)).f3750g - r97.f3749f, r45, r3);
        r1.mo2462d(r122[0]);
        this.f3763b.f3617e.f3766e.mo2462d(r122[1]);
        goto L129
    L180:
        return;
    L51:
        if (r97.f3753j == false) goto L59;
        if (r5.f3746c == true) goto L55;
        return;
    L55:
        if (r6.f3746c == false) goto L176;
        m2465m(r122, ((C1017f) r5.f3755l.get(0)).f3750g + r5.f3749f, ((C1017f) r6.f3755l.get(0)).f3750g - r6.f3749f, r11.f3750g + r11.f3749f, r97.f3750g - r97.f3749f, r45, r3);
        r1.mo2462d(r122[0]);
        this.f3763b.f3617e.f3766e.mo2462d(r122[1]);
        return;
    L176:
        return;
    L81:
        if (r12 == false) goto L102;
        if (r14 == false) goto L102;
        if (r5.f3746c == true) goto L86;
        return;
    L86:
        if (r6.f3746c == false) goto L181;
        float r46 = r42.f3595L;
        int r98 = ((C1017f) r5.f3755l.get(0)).f3750g + r5.f3749f;
        int r112 = ((C1017f) r6.f3755l.get(0)).f3750g - r6.f3749f;
        if (r3 == (-1)) goto L97;
        if (r3 == 0) goto L97;
        if (r3 != 1) goto L129;
        int r32 = m2474g(r112 - r98, 0);
        int r99 = (int) ((r32 / r46) + 0.5f);
        int r103 = m2474g(r99, 1);
        if (r99 == r103) goto L96;
        r32 = (int) ((r103 * r46) + 0.5f);
    L96:
        r1.mo2462d(r32);
        this.f3763b.f3617e.f3766e.mo2462d(r103);
    L97:
        int r33 = m2474g(r112 - r98, 0);
        int r910 = (int) ((r33 * r46) + 0.5f);
        int r104 = m2474g(r910, 1);
        if (r910 == r104) goto L100;
        r33 = (int) ((r104 / r46) + 0.5f);
    L100:
        r1.mo2462d(r33);
        this.f3763b.f3617e.f3766e.mo2462d(r104);
        goto L129
    L181:
        return;
    L102:
        if (r13 == false) goto L129;
        if (r15 == false) goto L129;
        if (r11.f3746c == true) goto L107;
        return;
    L107:
        if (r97.f3746c == false) goto L182;
        float r47 = r42.f3595L;
        int r123 = ((C1017f) r11.f3755l.get(0)).f3750g + r11.f3749f;
        int r113 = ((C1017f) r97.f3755l.get(0)).f3750g - r97.f3749f;
        if (r3 == (-1)) goto L118;
        if (r3 == 0) goto L114;
        if (r3 == 1) goto L118;
    L114:
        int r34 = m2474g(r113 - r123, 1);
        int r911 = (int) ((r34 * r47) + 0.5f);
        int r105 = m2474g(r911, 0);
        if (r911 == r105) goto L117;
        r34 = (int) ((r105 / r47) + 0.5f);
    L117:
        r1.mo2462d(r105);
        this.f3763b.f3617e.f3766e.mo2462d(r34);
    L118:
        int r35 = m2474g(r113 - r123, 1);
        int r912 = (int) ((r35 / r47) + 0.5f);
        int r106 = m2474g(r912, 0);
        if (r912 == r106) goto L121;
        r35 = (int) ((r106 * r47) + 0.5f);
    L121:
        r1.mo2462d(r106);
        this.f3763b.f3617e.f3766e.mo2462d(r35);
        goto L129
    L182:
        return;
    L42:
        r15 = false;
        goto L43
    L38:
        r14 = false;
        goto L40
    L34:
        r13 = false;
        goto L36
    L30:
        r12 = false;
        goto L32
    L123:
        C0999d r36 = r42.f3592I;
        if (r36 == null) goto L129;
        if (r36.f3616d.f3766e.f3753j == false) goto L129;
        r1.mo2462d((int) ((r3.f3750g * r42.f3627o) + 0.5f));
    L129:
        if (r5.f3746c == true) goto L131;
        return;
    L131:
        if (r6.f3746c == true) goto L134;
        return;
    L134:
        if (r5.f3753j == false) goto L141;
        if (r6.f3753j == false) goto L141;
        if (r1.f3753j == false) goto L141;
        return;
    L141:
        if (r1.f3753j == true) goto L151;
        if (this.f3765d != 3) goto L151;
        C0999d r37 = this.f3763b;
        if (r37.f3622j != 0) goto L151;
        if (r37.m2412q() == true) goto L151;
        C1017f r38 = (C1017f) r5.f3755l.get(0);
        C1017f r2 = (C1017f) r6.f3755l.get(0);
        int r39 = r38.f3750g + r5.f3749f;
        int r22 = r2.f3750g + r6.f3749f;
        r5.mo2462d(r39);
        r6.mo2462d(r22);
        r1.mo2462d(r22 - r39);
        return;
    L151:
        if (r1.f3753j == true) goto L165;
        if (this.f3765d != 3) goto L165;
        if (this.f3762a != 1) goto L165;
        if (r5.f3755l.size() <= 0) goto L165;
        if (r6.f3755l.size() <= 0) goto L165;
        C1017f r310 = (C1017f) r5.f3755l.get(0);
        C1017f r48 = (C1017f) r6.f3755l.get(0);
        int r311 = Math.min((r48.f3750g + r6.f3749f) - (r310.f3750g + r5.f3749f), r1.f3756m);
        C0999d r49 = this.f3763b;
        int r8 = r49.f3626n;
        int r312 = Math.max(r49.f3625m, r311);
        if (r8 <= 0) goto L163;
        r312 = Math.min(r8, r312);
    L163:
        r1.mo2462d(r312);
    L165:
        if (r1.f3753j == true) goto L167;
        return;
    L167:
        C1017f r313 = (C1017f) r5.f3755l.get(0);
        C1017f r23 = (C1017f) r6.f3755l.get(0);
        int r410 = r313.f3750g;
        int r82 = r5.f3749f + r410;
        int r913 = r23.f3750g;
        int r107 = r6.f3749f + r913;
        float r114 = this.f3763b.f3602S;
        if (r313 != r23) goto L170;
        r114 = 0.5f;
    L171:
        r5.mo2462d((int) ((((r913 - r410) - r1.f3750g) * r114) + (r410 + 0.5f)));
        r6.mo2462d(r5.f3750g + r1.f3750g);
        return;
    L170:
        r410 = r82;
        r913 = r107;
        goto L171
    L173:
        C0999d r16 = this.f3763b;
        m2475l(r16.f3636x, r16.f3638z, 0);
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: d */
    public final void mo2446d() {
        C0999d r02 = this.f3763b;
        boolean r1 = r02.f3610a;
        C1018g r2 = this.f3766e;
        if (r1 == false) goto L5;
        r2.mo2462d(r02.m2407l());
    L5:
        boolean r03 = r2.f3753j;
        C1017f r12 = this.f3770i;
        C1017f r3 = this.f3769h;
        if (r03 == true) goto L21;
        C0999d r04 = this.f3763b;
        int r8 = r04.f3615c0[0];
        this.f3765d = r8;
        if (r8 == 3) goto L31;
        if (r8 != 4) goto L18;
        C0999d r9 = r04.f3592I;
        if (r9 == null) goto L15;
        if (r9.f3615c0[0] != 1) goto L15;
    L16:
        int r05 = (r9.m2407l() - this.f3763b.f3636x.m2390c()) - this.f3763b.f3638z.m2390c();
        C1021j r4 = r9.f3616d;
        AbstractC1024m.m2470b(r3, r4.f3769h, this.f3763b.f3636x.m2390c());
        AbstractC1024m.m2470b(r12, r4.f3770i, -this.f3763b.f3638z.m2390c());
        r2.mo2462d(r05);
        return;
    L15:
        if (r9.f3615c0[0] == 4) goto L16;
    L18:
        if (r8 != 1) goto L31;
        r2.mo2462d(r04.m2407l());
    L31:
        if (r2.f3753j == false) goto L65;
        C0999d r06 = this.f3763b;
        if (r06.f3610a == false) goto L65;
        C0998c[] r5 = r06.f3589F;
        C0998c r6 = r5[0];
        C0998c r82 = r6.f3580d;
        if (r82 != null) goto L37;
    L48:
        if (r82 == null) goto L52;
        C1017f r07 = AbstractC1024m.m2471h(r6);
        if (r07 == null) goto L109;
        AbstractC1024m.m2470b(r3, r07, this.f3763b.f3589F[0].m2390c());
        AbstractC1024m.m2470b(r12, r3, r2.f3750g);
        return;
    L109:
        return;
    L52:
        C0998c r52 = r5[1];
        if (r52.f3580d == null) goto L58;
        C1017f r08 = AbstractC1024m.m2471h(r52);
        if (r08 == null) goto L111;
        AbstractC1024m.m2470b(r12, r08, -this.f3763b.f3589F[1].m2390c());
        AbstractC1024m.m2470b(r3, r12, -r2.f3750g);
        return;
    L111:
        return;
    L58:
        if ((r06 instanceof AbstractC1004i) == false) goto L60;
        return;
    L60:
        if (r06.f3592I != null) goto L62;
        return;
    L62:
        if (r06.mo2402g(7).f3580d != null) goto L115;
        C0999d r09 = this.f3763b;
        AbstractC1024m.m2470b(r3, r09.f3592I.f3616d.f3769h, r09.m2408m());
        AbstractC1024m.m2470b(r12, r3, r2.f3750g);
        return;
    L115:
        return;
    L37:
        if (r5[1].f3580d == null) goto L48;
        if (r06.m2412q() == false) goto L41;
        r3.f3749f = this.f3763b.f3589F[0].m2390c();
        r12.f3749f = -this.f3763b.f3589F[1].m2390c();
        return;
    L41:
        C1017f r010 = AbstractC1024m.m2471h(this.f3763b.f3589F[0]);
        if (r010 == null) goto L44;
        AbstractC1024m.m2470b(r3, r010, this.f3763b.f3589F[0].m2390c());
    L44:
        C1017f r011 = AbstractC1024m.m2471h(this.f3763b.f3589F[1]);
        if (r011 == null) goto L47;
        AbstractC1024m.m2470b(r12, r011, -this.f3763b.f3589F[1].m2390c());
    L47:
        r3.f3745b = true;
        r12.f3745b = true;
        return;
    L65:
        if (this.f3765d != 3) goto L84;
        C0999d r012 = this.f3763b;
        int r83 = r012.f3622j;
        if (r83 == 2) goto L80;
        if (r83 != 3) goto L84;
        if (r012.f3623k != 3) goto L79;
        r3.f3744a = this;
        r12.f3744a = this;
        C1023l r53 = r012.f3617e;
        r53.f3769h.f3744a = this;
        r53.f3770i.f3744a = this;
        r2.f3744a = this;
        if (r012.m2413r() == false) goto L76;
        r2.f3755l.add(this.f3763b.f3617e.f3766e);
        this.f3763b.f3617e.f3766e.f3754k.add(r2);
        C1023l r013 = this.f3763b.f3617e;
        r013.f3766e.f3744a = this;
        r2.f3755l.add(r013.f3769h);
        r2.f3755l.add(this.f3763b.f3617e.f3770i);
        this.f3763b.f3617e.f3769h.f3754k.add(r2);
        this.f3763b.f3617e.f3770i.f3754k.add(r2);
        goto L84
    L76:
        if (this.f3763b.m2412q() == false) goto L78;
        this.f3763b.f3617e.f3766e.f3755l.add(r2);
        r2.f3754k.add(this.f3763b.f3617e.f3766e);
        goto L84
    L78:
        this.f3763b.f3617e.f3766e.f3755l.add(r2);
        goto L84
    L79:
        C1018g r014 = r012.f3617e.f3766e;
        r2.f3755l.add(r014);
        r014.f3754k.add(r2);
        this.f3763b.f3617e.f3769h.f3754k.add(r2);
        this.f3763b.f3617e.f3770i.f3754k.add(r2);
        r2.f3745b = true;
        r2.f3754k.add(r3);
        r2.f3754k.add(r12);
        r3.f3755l.add(r2);
        r12.f3755l.add(r2);
        goto L84
    L80:
        C0999d r015 = r012.f3592I;
        if (r015 == null) goto L84;
        C1018g r016 = r015.f3617e.f3766e;
        r2.f3755l.add(r016);
        r016.f3754k.add(r2);
        r2.f3745b = true;
        r2.f3754k.add(r3);
        r2.f3754k.add(r12);
    L84:
        C0999d r017 = this.f3763b;
        C0998c[] r54 = r017.f3589F;
        C0998c r84 = r54[0];
        C0998c r92 = r84.f3580d;
        if (r92 != null) goto L87;
    L92:
        if (r92 == null) goto L96;
        C1017f r018 = AbstractC1024m.m2471h(r84);
        if (r018 == null) goto L119;
        AbstractC1024m.m2470b(r3, r018, this.f3763b.f3589F[0].m2390c());
        m2473c(r12, r3, 1, r2);
        return;
    L119:
        return;
    L96:
        C0998c r55 = r54[1];
        if (r55.f3580d == null) goto L102;
        C1017f r019 = AbstractC1024m.m2471h(r55);
        if (r019 == null) goto L121;
        AbstractC1024m.m2470b(r12, r019, -this.f3763b.f3589F[1].m2390c());
        m2473c(r3, r12, -1, r2);
        return;
    L121:
        return;
    L102:
        if ((r017 instanceof AbstractC1004i) == true) goto L123;
        C0999d r56 = r017.f3592I;
        if (r56 == null) goto L124;
        AbstractC1024m.m2470b(r3, r56.f3616d.f3769h, r017.m2408m());
        m2473c(r12, r3, 1, r2);
        return;
    L124:
        return;
    L123:
        return;
    L87:
        if (r54[1].f3580d == null) goto L92;
        if (r017.m2412q() == false) goto L91;
        r3.f3749f = this.f3763b.f3589F[0].m2390c();
        r12.f3749f = -this.f3763b.f3589F[1].m2390c();
        return;
    L91:
        C1017f r020 = AbstractC1024m.m2471h(this.f3763b.f3589F[0]);
        C1017f r13 = AbstractC1024m.m2471h(this.f3763b.f3589F[1]);
        r020.m2460b(this);
        r13.m2460b(this);
        this.f3771j = 4;
        return;
    L21:
        if (this.f3765d != 4) goto L31;
        C0999d r021 = this.f3763b;
        C0999d r85 = r021.f3592I;
        if (r85 == null) goto L27;
        if (r85.f3615c0[0] != 1) goto L27;
    L28:
        AbstractC1024m.m2470b(r3, r85.f3616d.f3769h, r021.f3636x.m2390c());
        AbstractC1024m.m2470b(r12, r85.f3616d.f3770i, -this.f3763b.f3638z.m2390c());
        return;
    L27:
        if (r85.f3615c0[0] != 4) goto L31;
        goto L28
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: e */
    public final void mo2447e() {
        C1017f r02 = this.f3769h;
        if (r02.f3753j == false) goto L6;
        C0999d r1 = this.f3763b;
        r1.f3597N = r02.f3750g;
        return;
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: f */
    public final void mo2448f() {
        this.f3764c = null;
        this.f3769h.m2461c();
        this.f3770i.m2461c();
        this.f3766e.m2461c();
        this.f3768g = false;
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: k */
    public final boolean mo2450k() {
        if (this.f3765d == 3) goto L5;
        return true;
    L5:
        if (this.f3763b.f3622j != 0) goto L7;
        return true;
    L7:
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final void m2466n() {
        this.f3768g = false;
        C1017f r1 = this.f3769h;
        r1.m2461c();
        r1.f3753j = false;
        C1017f r12 = this.f3770i;
        r12.m2461c();
        r12.f3753j = false;
        this.f3766e.f3753j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f3763b.f3606W;
    }
}
