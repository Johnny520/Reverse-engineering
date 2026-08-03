package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: TD */
/* JADX INFO: loaded from: classes.dex */
public final class C0830TD extends AbstractC1449gF {

    /* JADX INFO: renamed from: k */
    public C2628vd f2621k;

    /* JADX INFO: renamed from: l */
    public C0135D5 f2622l;

    @Override // p000.InterfaceC2542td
    /* JADX INFO: renamed from: a */
    public final void mo1546a(InterfaceC2542td r11) {
        if (AbstractC0213Ey.m424v(this.f5066j) == 3) goto L81;
        C0750Rd r112 = this.f5061e;
        if (r112.f9112c == true) goto L7;
    L32:
        C2628vd r2 = this.f5064h;
        boolean r5 = r2.f9112c;
        ArrayList r6 = r2.f9121l;
        if (r5 == false) goto L83;
        C2628vd r52 = this.f5065i;
        boolean r7 = r52.f9112c;
        ArrayList r8 = r52.f9121l;
        if (r7 == true) goto L38;
        return;
    L38:
        if (r2.f9119j == false) goto L45;
        if (r52.f9119j == false) goto L45;
        if (r112.f9119j == false) goto L45;
        return;
    L45:
        if (r112.f9119j == true) goto L55;
        if (this.f5060d != 3) goto L55;
        C2454rb r72 = this.f5058b;
        if (r72.f8639r != 0) goto L55;
        if (r72.m4945y() == true) goto L55;
        C2628vd r0 = (C2628vd) r6.get(0);
        C2628vd r1 = (C2628vd) r8.get(0);
        int r02 = r0.f9116g + r2.f9115f;
        int r12 = r1.f9116g + r52.f9115f;
        r2.mo1539d(r02);
        r52.mo1539d(r12);
        r112.mo1539d(r12 - r02);
        return;
    L55:
        if (r112.f9119j == true) goto L69;
        if (this.f5060d != 3) goto L69;
        if (this.f5057a != 1) goto L69;
        if (r6.size() <= 0) goto L69;
        if (r8.size() <= 0) goto L69;
        C2628vd r03 = (C2628vd) r6.get(0);
        C2628vd r13 = (C2628vd) r8.get(0);
        int r14 = (r13.f9116g + r52.f9115f) - (r03.f9116g + r2.f9115f);
        int r04 = r112.f2386m;
        if (r14 >= r04) goto L67;
        r112.mo1539d(r14);
        goto L69
    L67:
        r112.mo1539d(r04);
    L69:
        if (r112.f9119j == true) goto L72;
        return;
    L72:
        if (r6.size() > 0) goto L74;
        return;
    L74:
        if (r8.size() <= 0) goto L85;
        C2628vd r05 = (C2628vd) r6.get(0);
        C2628vd r15 = (C2628vd) r8.get(0);
        int r4 = r05.f9116g;
        int r62 = r2.f9115f + r4;
        int r73 = r15.f9116g;
        int r82 = r52.f9115f + r73;
        float r9 = this.f5058b.f8615e0;
        if (r05 != r15) goto L78;
        r9 = 0.5f;
    L79:
        r2.mo1539d((int) ((((r73 - r4) - r112.f9116g) * r9) + (r4 + 0.5f)));
        r52.mo1539d(r2.f9116g + r112.f9116g);
        return;
    L78:
        r4 = r62;
        r73 = r82;
        goto L79
    L85:
        return;
    L83:
        return;
    L7:
        if (r112.f9119j == true) goto L32;
        if (this.f5060d != 3) goto L32;
        C2454rb r22 = this.f5058b;
        int r53 = r22.f8640s;
        if (r53 == 2) goto L27;
        if (r53 != 3) goto L32;
        C0750Rd r54 = r22.f8612d.f5061e;
        if (r54.f9119j == false) goto L32;
        int r63 = r22.f8603X;
        if (r63 == (-1)) goto L25;
        if (r63 == 0) goto L24;
        if (r63 == 1) goto L21;
        int r23 = 0;
    L26:
        r112.mo1539d(r23);
        goto L32
    L21:
        float r55 = r54.f9116g;
        float r24 = r22.f8602W;
    L22:
        float r56 = r55 / r24;
    L23:
        r23 = (int) (r56 + 0.5f);
        goto L26
    L24:
        r56 = r54.f9116g * r22.f8602W;
        goto L23
    L25:
        r55 = r54.f9116g;
        r24 = r22.f8602W;
        goto L22
    L27:
        C2454rb r57 = r22.f8599T;
        if (r57 == null) goto L32;
        if (r57.f8614e.f5061e.f9119j == false) goto L32;
        r112.mo1539d((int) ((r5.f9116g * r22.f8647z) + 0.5f));
        goto L32
    L81:
        C2454rb r113 = this.f5058b;
        m2780l(r113.f8589J, r113.f8591L, 1);
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: d */
    public final void mo1547d() {
        C2628vd r0 = this.f2621k;
        C2454rb r1 = this.f5058b;
        boolean r2 = r1.f8606a;
        C0750Rd r3 = this.f5061e;
        if (r2 == false) goto L5;
        r3.mo1539d(r1.m4933k());
    L5:
        boolean r12 = r3.f9119j;
        ArrayList r22 = r3.f9120k;
        ArrayList r4 = r3.f9121l;
        C2628vd r8 = this.f5065i;
        C2628vd r9 = this.f5064h;
        if (r12 == true) goto L22;
        C2454rb r13 = this.f5058b;
        this.f5060d = r13.f8637p0[1];
        if (r13.f8584E == false) goto L10;
        this.f2622l = new C0135D5(this);
    L10:
        int r14 = this.f5060d;
        if (r14 == 3) goto L29;
        if (r14 != 4) goto L19;
        C2454rb r10 = this.f5058b.f8599T;
        if (r10 == null) goto L19;
        if (r10.f8637p0[1] != 1) goto L19;
        int r02 = (r10.m4933k() - this.f5058b.f8589J.m2384e()) - this.f5058b.f8591L.m2384e();
        AbstractC1449gF.m2774b(r9, r10.f8614e.f5064h, this.f5058b.f8589J.m2384e());
        AbstractC1449gF.m2774b(r8, r10.f8614e.f5065i, -this.f5058b.f8591L.m2384e());
        r3.mo1539d(r02);
        return;
    L19:
        if (r14 != 1) goto L29;
        r3.mo1539d(this.f5058b.m4933k());
    L29:
        boolean r15 = r3.f9119j;
        if (r15 == false) goto L83;
        C2454rb r122 = this.f5058b;
        if (r122.f8606a == false) goto L83;
        C1259cb[] r16 = r122.f8596Q;
        C1259cb r23 = r16[2];
        C1259cb r42 = r23.f4270f;
        if (r42 != null) goto L36;
    L51:
        if (r42 == null) goto L58;
        C2628vd r17 = AbstractC1449gF.m2775h(r23);
        if (r17 == null) goto L162;
        AbstractC1449gF.m2774b(r9, r17, this.f5058b.f8596Q[2].m2384e());
        AbstractC1449gF.m2774b(r8, r9, r3.f9116g);
        C2454rb r18 = this.f5058b;
        if (r18.f8584E == false) goto L163;
        AbstractC1449gF.m2774b(r0, r9, r18.f8607a0);
        return;
    L163:
        return;
    L162:
        return;
    L58:
        C1259cb r24 = r16[3];
        if (r24.f4270f == null) goto L67;
        C2628vd r19 = AbstractC1449gF.m2775h(r24);
        if (r19 == null) goto L63;
        AbstractC1449gF.m2774b(r8, r19, -this.f5058b.f8596Q[3].m2384e());
        AbstractC1449gF.m2774b(r9, r8, -r3.f9116g);
    L63:
        C2454rb r110 = this.f5058b;
        if (r110.f8584E == false) goto L164;
        AbstractC1449gF.m2774b(r0, r9, r110.f8607a0);
        return;
    L164:
        return;
    L67:
        C1259cb r111 = r16[4];
        if (r111.f4270f == null) goto L74;
        C2628vd r112 = AbstractC1449gF.m2775h(r111);
        if (r112 == null) goto L165;
        AbstractC1449gF.m2774b(r0, r112, 0);
        AbstractC1449gF.m2774b(r9, r0, -this.f5058b.f8607a0);
        AbstractC1449gF.m2774b(r8, r9, r3.f9116g);
        return;
    L165:
        return;
    L74:
        if ((r122 instanceof AbstractC2592uk) == false) goto L76;
        return;
    L76:
        if (r122.f8599T != null) goto L78;
        return;
    L78:
        if (r122.mo4340i(7).f4270f != null) goto L168;
        C2454rb r113 = this.f5058b;
        AbstractC1449gF.m2774b(r9, r113.f8599T.f8614e.f5064h, r113.m4939s());
        AbstractC1449gF.m2774b(r8, r9, r3.f9116g);
        C2454rb r114 = this.f5058b;
        if (r114.f8584E == false) goto L169;
        AbstractC1449gF.m2774b(r0, r9, r114.f8607a0);
        return;
    L169:
        return;
    L168:
        return;
    L36:
        if (r16[3].f4270f == null) goto L51;
        if (r122.m4945y() == false) goto L40;
        r9.f9115f = this.f5058b.f8596Q[2].m2384e();
        r8.f9115f = -this.f5058b.f8596Q[3].m2384e();
    L47:
        C2454rb r115 = this.f5058b;
        if (r115.f8584E == false) goto L161;
        AbstractC1449gF.m2774b(r0, r9, r115.f8607a0);
        return;
    L161:
        return;
    L40:
        C2628vd r116 = AbstractC1449gF.m2775h(this.f5058b.f8596Q[2]);
        if (r116 == null) goto L43;
        AbstractC1449gF.m2774b(r9, r116, this.f5058b.f8596Q[2].m2384e());
    L43:
        C2628vd r117 = AbstractC1449gF.m2775h(this.f5058b.f8596Q[3]);
        if (r117 == null) goto L46;
        AbstractC1449gF.m2774b(r8, r117, -this.f5058b.f8596Q[3].m2384e());
    L46:
        r9.f9111b = true;
        r8.f9111b = true;
    L83:
        if (r15 == false) goto L85;
    L100:
        r3.m5143b(this);
    L101:
        C2454rb r118 = this.f5058b;
        C1259cb[] r25 = r118.f8596Q;
        C1259cb r123 = r25[2];
        C1259cb r132 = r123.f4270f;
        if (r132 == null) goto L118;
        if (r25[3].f4270f == null) goto L118;
        if (r118.m4945y() == false) goto L108;
        r9.f9115f = this.f5058b.f8596Q[2].m2384e();
        r8.f9115f = -this.f5058b.f8596Q[3].m2384e();
    L115:
        if (this.f5058b.f8584E == false) goto L158;
        m2777c(r0, r9, 1, this.f2622l);
    L158:
        if (r4.size() != 0) goto L170;
        r3.f9112c = true;
        return;
    L170:
        return;
    L108:
        C2628vd r119 = AbstractC1449gF.m2775h(this.f5058b.f8596Q[2]);
        C2628vd r26 = AbstractC1449gF.m2775h(this.f5058b.f8596Q[3]);
        if (r119 == null) goto L111;
        r119.m5143b(this);
    L111:
        if (r26 == null) goto L113;
        r26.m5143b(this);
    L113:
        this.f5066j = 4;
    L118:
        if (r132 == null) goto L131;
        C2628vd r120 = AbstractC1449gF.m2775h(r123);
        if (r120 == null) goto L158;
        AbstractC1449gF.m2774b(r9, r120, this.f5058b.f8596Q[2].m2384e());
        m2777c(r8, r9, 1, r3);
        if (this.f5058b.f8584E == false) goto L125;
        m2777c(r0, r9, 1, this.f2622l);
    L125:
        if (this.f5060d != 3) goto L158;
        C2454rb r03 = this.f5058b;
        if (r03.f8602W <= 0.0f) goto L158;
        C0757Rk r04 = r03.f8612d;
        if (r04.f5060d != 3) goto L158;
        r04.f5061e.f9120k.add(r3);
        r4.add(this.f5058b.f8612d.f5061e);
        r3.f9110a = this;
        goto L158
    L131:
        C1259cb r11 = r25[3];
        if (r11.f4270f == null) goto L138;
        C2628vd r121 = AbstractC1449gF.m2775h(r11);
        if (r121 == null) goto L158;
        AbstractC1449gF.m2774b(r8, r121, -this.f5058b.f8596Q[3].m2384e());
        m2777c(r9, r8, -1, r3);
        if (this.f5058b.f8584E == false) goto L158;
        m2777c(r0, r9, 1, this.f2622l);
        goto L158
    L138:
        C1259cb r27 = r25[4];
        if (r27.f4270f == null) goto L144;
        C2628vd r124 = AbstractC1449gF.m2775h(r27);
        if (r124 == null) goto L158;
        AbstractC1449gF.m2774b(r0, r124, 0);
        m2777c(r9, r0, -1, this.f2622l);
        m2777c(r8, r9, 1, r3);
        goto L158
    L144:
        if ((r118 instanceof AbstractC2592uk) == true) goto L158;
        C2454rb r28 = r118.f8599T;
        if (r28 == null) goto L158;
        AbstractC1449gF.m2774b(r9, r28.f8614e.f5064h, r118.m4939s());
        m2777c(r8, r9, 1, r3);
        if (this.f5058b.f8584E == false) goto L151;
        m2777c(r0, r9, 1, this.f2622l);
    L151:
        if (this.f5060d != 3) goto L158;
        C2454rb r05 = this.f5058b;
        if (r05.f8602W <= 0.0f) goto L158;
        C0757Rk r06 = r05.f8612d;
        if (r06.f5060d != 3) goto L158;
        r06.f5061e.f9120k.add(r3);
        r4.add(this.f5058b.f8612d.f5061e);
        r3.f9110a = this;
        goto L158
    L85:
        if (this.f5060d != 3) goto L100;
        C2454rb r125 = this.f5058b;
        int r126 = r125.f8640s;
        if (r126 == 2) goto L96;
        if (r126 != 3) goto L101;
        if (r125.m4945y() == true) goto L101;
        C2454rb r127 = this.f5058b;
        if (r127.f8639r == 3) goto L101;
        C0750Rd r128 = r127.f8612d.f5061e;
        r4.add(r128);
        r128.f9120k.add(r3);
        r3.f9111b = true;
        r22.add(r9);
        r22.add(r8);
        goto L101
    L96:
        C2454rb r129 = r125.f8599T;
        if (r129 == null) goto L101;
        C0750Rd r130 = r129.f8614e.f5061e;
        r4.add(r130);
        r130.f9120k.add(r3);
        r3.f9111b = true;
        r22.add(r9);
        r22.add(r8);
        goto L101
    L22:
        if (this.f5060d != 4) goto L29;
        C2454rb r131 = this.f5058b;
        C2454rb r102 = r131.f8599T;
        if (r102 == null) goto L29;
        if (r102.f8637p0[1] != 1) goto L29;
        AbstractC1449gF.m2774b(r9, r102.f8614e.f5064h, r131.f8589J.m2384e());
        AbstractC1449gF.m2774b(r8, r102.f8614e.f5065i, -this.f5058b.f8591L.m2384e());
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: e */
    public final void mo1548e() {
        C2628vd r0 = this.f5064h;
        if (r0.f9119j == false) goto L6;
        C2454rb r1 = this.f5058b;
        r1.f8605Z = r0.f9116g;
        return;
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: f */
    public final void mo1549f() {
        this.f5059c = null;
        this.f5064h.m5144c();
        this.f5065i.m5144c();
        this.f2621k.m5144c();
        this.f5061e.m5144c();
        this.f5063g = false;
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: k */
    public final boolean mo1550k() {
        if (this.f5060d == 3) goto L5;
        return true;
    L5:
        if (this.f5058b.f8640s == 0) goto L11;
        return false;
    L11:
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m1655m() {
        this.f5063g = false;
        C2628vd r1 = this.f5064h;
        r1.m5144c();
        r1.f9119j = false;
        C2628vd r12 = this.f5065i;
        r12.m5144c();
        r12.f9119j = false;
        C2628vd r13 = this.f2621k;
        r13.m5144c();
        r13.f9119j = false;
        this.f5061e.f9119j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f5058b.f8621h0;
    }
}
