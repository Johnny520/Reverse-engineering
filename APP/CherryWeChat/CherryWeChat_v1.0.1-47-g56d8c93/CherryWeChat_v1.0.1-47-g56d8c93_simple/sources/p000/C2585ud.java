package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: ud */
/* JADX INFO: loaded from: classes.dex */
public final class C2585ud {

    /* JADX INFO: renamed from: a */
    public C2497sb f8947a;

    /* JADX INFO: renamed from: b */
    public boolean f8948b;

    /* JADX INFO: renamed from: c */
    public boolean f8949c;

    /* JADX INFO: renamed from: d */
    public C2497sb f8950d;

    /* JADX INFO: renamed from: e */
    public ArrayList f8951e;

    /* JADX INFO: renamed from: f */
    public C1496hb f8952f;

    /* JADX INFO: renamed from: g */
    public C0178E5 f8953g;

    /* JADX INFO: renamed from: h */
    public ArrayList f8954h;

    /* JADX INFO: renamed from: a */
    public final void m5087a(C2628vd r7, int r8, ArrayList r9, C0769Rw r10) {
        AbstractC1449gF r72 = r7.f9113d;
        C0769Rw r0 = r72.f5059c;
        C2628vd r1 = r72.f5065i;
        C2628vd r2 = r72.f5064h;
        if (r0 != null) goto L48;
        C2497sb r02 = this.f8947a;
        if (r72 != r02.f8612d) goto L7;
        return;
    L7:
        if (r72 == r02.f8614e) goto L70;
        if (r10 != null) goto L11;
        r10 = new C0769Rw();
        r10.f2441a = null;
        r10.f2442b = new ArrayList();
        r10.f2441a = r72;
        r9.add(r10);
    L11:
        r72.f5059c = r10;
        r10.f2442b.add(r72);
        Iterator r03 = r2.f9120k.iterator();
    L13:
        if (r03.hasNext() == false) goto L17;
        InterfaceC2542td r3 = (InterfaceC2542td) r03.next();
        if ((r3 instanceof C2628vd) == false) goto L13;
        m5087a((C2628vd) r3, r8, r9, r10);
        goto L13
    L17:
        Iterator r04 = r1.f9120k.iterator();
    L19:
        if (r04.hasNext() == false) goto L24;
        InterfaceC2542td r32 = (InterfaceC2542td) r04.next();
        if ((r32 instanceof C2628vd) == false) goto L19;
        m5087a((C2628vd) r32, r8, r9, r10);
        goto L19
    L24:
        if (r8 == 1) goto L26;
    L33:
        Iterator r22 = r2.f9121l.iterator();
    L35:
        if (r22.hasNext() == false) goto L37;
        m5087a((C2628vd) r22.next(), r8, r9, r10);
        goto L35
    L37:
        Iterator r12 = r1.f9121l.iterator();
    L39:
        if (r12.hasNext() == false) goto L41;
        m5087a((C2628vd) r12.next(), r8, r9, r10);
        goto L39
    L41:
        if (r8 == 1) goto L43;
        return;
    L43:
        if ((r72 instanceof C0830TD) == false) goto L69;
        Iterator r73 = ((C0830TD) r72).f2621k.f9121l.iterator();
    L46:
        if (r73.hasNext() == false) goto L71;
        m5087a((C2628vd) r73.next(), r8, r9, r10);
        goto L46
    L71:
        return;
    L69:
        return;
    L26:
        if ((r72 instanceof C0830TD) == false) goto L33;
        Iterator r33 = ((C0830TD) r72).f2621k.f9120k.iterator();
    L29:
        if (r33.hasNext() == false) goto L33;
        InterfaceC2542td r4 = (InterfaceC2542td) r33.next();
        if ((r4 instanceof C2628vd) == false) goto L29;
        m5087a((C2628vd) r4, r8, r9, r10);
        goto L29
    L70:
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m5088b(C2497sb r25) {
        ArrayList r1 = r25.f8774q0;
        int[] r2 = r25.f8637p0;
        Iterator r12 = r1.iterator();
    L4:
        if (r12.hasNext() == false) goto L152;
        C2454rb r9 = (C2454rb) r12.next();
        int[] r3 = r9.f8637p0;
        C1259cb[] r4 = r9.f8596Q;
        C1259cb r5 = r9.f8591L;
        C1259cb r6 = r9.f8589J;
        C1259cb r7 = r9.f8590K;
        C1259cb r8 = r9.f8588I;
        int r11 = r3[0];
        int r32 = r3[1];
        if (r9.f8619g0 == 8) goto L7;
        float r13 = r9.f8644w;
        if (r13 >= 1.0f) goto L12;
        if (r11 != 3) goto L12;
        r9.f8639r = 2;
    L12:
        float r15 = r9.f8647z;
        if (r15 >= 1.0f) goto L17;
        if (r32 != 3) goto L17;
        r9.f8640s = 2;
    L17:
        if (r9.f8602W > 0.0f) goto L19;
    L35:
        if (r11 == 3) goto L37;
    L43:
        if (r32 == 3) goto L45;
    L51:
        C0757Rk r122 = r9.f8612d;
        r122.f5060d = r11;
        int r14 = r9.f8639r;
        r122.f5057a = r14;
        C0830TD r123 = r9.f8614e;
        r123.f5060d = r32;
        int r10 = r9.f8640s;
        r123.f5057a = r10;
        if (r11 == 4) goto L58;
        if (r11 == 1) goto L58;
        int r124 = 2;
        if (r11 == 2) goto L58;
    L65:
        if (r11 != 3) goto L93;
        if (r32 != r124) goto L68;
    L71:
        if (r14 != 3) goto L75;
        if (r32 != r124) goto L74;
        m5092f(r124, 0, r124, 0, r9);
    L74:
        int r82 = r9.m4933k();
        m5092f(1, (int) ((r82 * r9.f8602W) + 0.5f), 1, r82, r9);
        r9.f8612d.f5061e.mo1539d(r9.m4937q());
        r9.f8614e.f5061e.mo1539d(r9.m4933k());
        r9.f8606a = true;
        goto L4
    L75:
        int r52 = r124;
        if (r14 != 1) goto L78;
        m5092f(r52, 0, r32, 0, r9);
        r9.f8612d.f5061e.f2386m = r9.m4937q();
        goto L4
    L78:
        r124 = r52;
        if (r14 == 2) goto L80;
        int r53 = 1;
        int r72 = r32;
        if (r4[0].f4270f == null) goto L92;
        if (r4[1].f4270f == null) goto L92;
    L86:
        int r33 = 3;
    L94:
        if (r72 != r33) goto L128;
        if (r11 == r124) goto L99;
        if (r11 == r53) goto L99;
        int r62 = r33;
        int r42 = r72;
        int r73 = r124;
        int r34 = 1;
        int r125 = r11;
    L129:
        if (r125 != r62) goto L4;
        if (r42 != r62) goto L4;
        if (r14 == r34) goto L142;
        if (r10 == r34) goto L142;
        if (r10 != 2) goto L4;
        if (r14 != 2) goto L4;
        if (r2[0] != r53) goto L4;
        if (r2[r34] != r53) goto L4;
        m5092f(r53, (int) ((r13 * r25.m4937q()) + 0.5f), r53, (int) ((r15 * r25.m4933k()) + 0.5f), r9);
        r9.f8612d.f5061e.mo1539d(r9.m4937q());
        r9.f8614e.f5061e.mo1539d(r9.m4933k());
        r9.f8606a = true;
    L142:
        m5092f(r73, 0, r73, 0, r9);
        r9.f8612d.f5061e.f2386m = r9.m4937q();
        r9.f8614e.f5061e.f2386m = r9.m4933k();
    L99:
        if (r10 != r33) goto L107;
        if (r11 != r124) goto L102;
        int r21 = r53;
        m5092f(r124, 0, r124, 0, r9);
    L103:
        int r63 = r9.m4937q();
        float r35 = r9.f8602W;
        if (r9.f8603X != (-1)) goto L106;
        r35 = 1.0f / r35;
    L106:
        int r54 = r21;
        m5092f(r54, r63, r21, (int) ((r63 * r35) + 0.5f), r9);
        r9.f8612d.f5061e.mo1539d(r9.m4937q());
        r9.f8614e.f5061e.mo1539d(r9.m4933k());
        r9.f8606a = true;
        goto L4
    L102:
        r21 = r53;
        goto L103
    L107:
        int r36 = r72;
        int r74 = r53;
        int r55 = r124;
        if (r10 != 1) goto L110;
        m5092f(r11, 0, r55, 0, r9);
        r9.f8614e.f5061e.f2386m = r9.m4933k();
        goto L4
    L110:
        int r56 = r11;
        if (r10 == 2) goto L112;
        r125 = r56;
        r53 = r74;
        if (r4[2].f4270f == null) goto L127;
        if (r4[3].f4270f == null) goto L127;
        r42 = r36;
    L118:
        r73 = r55;
        r34 = 1;
    L119:
        r62 = 3;
    L127:
        m5092f(r55, 0, r36, 0, r9);
        r9.f8612d.f5061e.mo1539d(r9.m4937q());
        r9.f8614e.f5061e.mo1539d(r9.m4933k());
        r9.f8606a = true;
        goto L4
    L112:
        int r43 = r2[1];
        if (r43 == r74) goto L120;
        if (r43 == 4) goto L120;
        r42 = r36;
        r125 = r56;
        r53 = r74;
    L120:
        m5092f(r56, r9.m4937q(), r74, (int) ((r15 * r25.m4933k()) + 0.5f), r9);
        r9.f8612d.f5061e.mo1539d(r9.m4937q());
        r9.f8614e.f5061e.mo1539d(r9.m4933k());
        r9.f8606a = true;
        goto L4
    L128:
        r42 = r72;
        r73 = r124;
        r34 = 1;
        r125 = r11;
    L92:
        m5092f(r124, 0, r72, 0, r9);
        r9.f8612d.f5061e.mo1539d(r9.m4937q());
        r9.f8614e.f5061e.mo1539d(r9.m4933k());
        r9.f8606a = true;
        goto L4
    L80:
        int r57 = r2[0];
        if (r57 == 1) goto L87;
        if (r57 == 4) goto L87;
        r53 = 1;
        r72 = r32;
    L87:
        m5092f(1, (int) ((r13 * r25.m4937q()) + 0.5f), r32, r9.m4933k(), r9);
        r9.f8612d.f5061e.mo1539d(r9.m4937q());
        r9.f8614e.f5061e.mo1539d(r9.m4933k());
        r9.f8606a = true;
        goto L4
    L68:
        if (r32 == 1) goto L71;
        r72 = r32;
        r33 = 3;
        r53 = 1;
        goto L94
    L93:
        r72 = r32;
        r53 = 1;
    L58:
        if (r32 == 4) goto L63;
        if (r32 == 1) goto L143;
        r124 = 2;
        if (r32 != 2) goto L65;
    L143:
        int r44 = r32;
        int r212 = 1;
        int r126 = r11;
    L144:
        int r37 = r9.m4937q();
        if (r126 != 4) goto L147;
        r37 = (r25.m4937q() - r8.f4271g) - r7.f4271g;
        r126 = r212;
    L147:
        int r75 = r9.m4933k();
        if (r44 != 4) goto L150;
        int r83 = (r25.m4933k() - r6.f4271g) - r5.f4271g;
        int r76 = r212;
        C2585ud r45 = this;
        int r64 = r37;
        int r58 = r126;
    L151:
        r45.m5092f(r58, r64, r76, r83, r9);
        r9.f8612d.f5061e.mo1539d(r9.m4937q());
        r9.f8614e.f5061e.mo1539d(r9.m4933k());
        r9.f8606a = true;
        goto L4
    L150:
        r83 = r75;
        r76 = r44;
        r64 = r37;
        r58 = r126;
        r45 = this;
    L63:
        r44 = r32;
        r126 = r11;
        r212 = 1;
        goto L144
    L45:
        if (r9.f8640s != 1) goto L51;
        if (r6.f4270f != null) goto L49;
    L50:
        r32 = 2;
        goto L51
    L49:
        if (r5.f4270f != null) goto L51;
    L37:
        if (r9.f8639r != 1) goto L43;
        if (r8.f4270f != null) goto L41;
    L42:
        r11 = 2;
        goto L43
    L41:
        if (r7.f4270f != null) goto L43;
    L19:
        if (r11 != 3) goto L23;
        if (r32 == 2) goto L22;
        if (r32 != 1) goto L23;
    L22:
        r9.f8639r = 3;
    L23:
        if (r32 != 3) goto L27;
        if (r11 == 2) goto L26;
        if (r11 != 1) goto L27;
    L26:
        r9.f8640s = 3;
    L27:
        if (r11 != 3) goto L35;
        if (r32 != 3) goto L35;
        if (r9.f8639r != 0) goto L33;
        r9.f8639r = 3;
    L33:
        if (r9.f8640s != 0) goto L35;
        r9.f8640s = 3;
        goto L35
    L7:
        r9.f8606a = true;
        goto L4
    }

    /* JADX INFO: renamed from: c */
    public final void m5089c() {
        C2497sb r0 = this.f8947a;
        ArrayList r1 = this.f8954h;
        ArrayList r2 = this.f8951e;
        r2.clear();
        C2497sb r3 = this.f8950d;
        r3.f8612d.mo1549f();
        r3.f8614e.mo1549f();
        r2.add(r3.f8612d);
        r2.add(r3.f8614e);
        Iterator r4 = r3.f8774q0.iterator();
        HashSet r5 = null;
    L4:
        if (r4.hasNext() == false) goto L29;
        C2454rb r6 = (C2454rb) r4.next();
        if ((r6 instanceof C2150kk) == true) goto L7;
        if (r6.m4944x() == true) goto L11;
        r2.add(r6.f8612d);
    L18:
        if (r6.m4945y() == true) goto L20;
        r2.add(r6.f8614e);
    L27:
        if ((r6 instanceof AbstractC2592uk) == false) goto L4;
        r2.add(new C2549tk(r6));
        goto L4
    L20:
        if (r6.f8610c != null) goto L22;
        r6.f8610c = new C2221m7(r6, 1);
    L22:
        if (r5 != null) goto L24;
        r5 = new HashSet();
    L24:
        r5.add(r6.f8610c);
        goto L27
    L11:
        if (r6.f8608b != null) goto L13;
        r6.f8608b = new C2221m7(r6, 0);
    L13:
        if (r5 != null) goto L15;
        r5 = new HashSet();
    L15:
        r5.add(r6.f8608b);
        goto L18
    L7:
        C2197lk r7 = new C2197lk(r6);
        r6.f8612d.mo1549f();
        r6.f8614e.mo1549f();
        r7.f5062f = ((C2150kk) r6).f7522u0;
        r2.add(r7);
        goto L4
    L29:
        if (r5 == null) goto L31;
        r2.addAll(r5);
    L31:
        Iterator r42 = r2.iterator();
    L33:
        if (r42.hasNext() == false) goto L35;
        ((AbstractC1449gF) r42.next()).mo1549f();
        goto L33
    L35:
        Iterator r22 = r2.iterator();
    L37:
        if (r22.hasNext() == false) goto L42;
        AbstractC1449gF r43 = (AbstractC1449gF) r22.next();
        if (r43.f5058b == r3) goto L37;
        r43.mo1547d();
        goto L37
    L42:
        r1.clear();
        m5091e(r0.f8612d, 0, r1);
        m5091e(r0.f8614e, 1, r1);
        this.f8948b = false;
    }

    /* JADX INFO: renamed from: d */
    public final int m5090d(C2497sb r20, int r21) {
        C2497sb r0 = r20;
        ArrayList r3 = this.f8954h;
        int r4 = r3.size();
        long r5 = 0;
        int r7 = 0;
        long r8 = 0;
    L3:
        if (r7 >= r4) goto L53;
        AbstractC1449gF r10 = ((C0769Rw) r3.get(r7)).f2441a;
        if ((r10 instanceof C2221m7) == true) goto L7;
        if (r21 != 0) goto L14;
        if ((r10 instanceof C0757Rk) == false) goto L8;
    L16:
        if (r21 != 0) goto L19;
        AbstractC1449gF r11 = r0.f8612d;
    L18:
        C2628vd r112 = r11.f5064h;
        if (r21 != 0) goto L23;
        AbstractC1449gF r12 = r0.f8612d;
    L22:
        C2628vd r122 = r12.f5065i;
        C2628vd r13 = r10.f5064h;
        C2628vd r14 = r10.f5065i;
        boolean r113 = r13.f9121l.contains(r112);
        boolean r123 = r14.f9121l.contains(r122);
        long r15 = r10.mo2779j();
        if (r113 == false) goto L45;
        if (r123 == false) goto L45;
        long r114 = C0769Rw.m1565b(r13, r5);
        long r02 = C0769Rw.m1564a(r14, r5);
        long r115 = r114 - r15;
        int r52 = r14.f9115f;
        ArrayList r17 = r3;
        int r18 = r4;
        if (r115 < (-r52)) goto L30;
        r115 = r115 + ((long) r52);
    L30:
        long r32 = r13.f9115f;
        long r03 = ((-r02) - r15) - r32;
        if (r03 < r32) goto L33;
        r03 = r03 - r32;
    L33:
        C2454rb r33 = r10.f5058b;
        if (r21 != 0) goto L37;
        float r34 = r33.f8613d0;
    L41:
        if (r34 <= 0.0f) goto L43;
        long r04 = (long) ((r115 / (1.0f - r34)) + (r03 / r34));
    L44:
        float r05 = r04;
        long r06 = (((long) r13.f9115f) + ((((long) ((r05 * r34) + 0.5f)) + r15) + ((long) (((1.0f - r34) * r05) + 0.5f)))) - ((long) r14.f9115f);
    L51:
        r8 = Math.max(r8, r06);
        r7 = r7 + 1;
        r0 = r20;
        r3 = r17;
        r4 = r18;
        r5 = 0;
        goto L3
    L43:
        r04 = 0;
        goto L44
    L37:
        if (r21 != 1) goto L39;
        r34 = r33.f8615e0;
        goto L41
    L39:
        r33.getClass();
        r34 = -1.0f;
    L45:
        r17 = r3;
        r18 = r4;
        if (r113 == false) goto L48;
        r06 = Math.max(C0769Rw.m1565b(r13, r13.f9115f), ((long) r13.f9115f) + r15);
        goto L51
    L48:
        if (r123 == false) goto L50;
        r06 = Math.max(-C0769Rw.m1564a(r14, r14.f9115f), ((long) (-r14.f9115f)) + r15);
        goto L51
    L50:
        r06 = (r10.mo2779j() + r13.f9115f) - ((long) r14.f9115f);
        goto L51
    L23:
        r12 = r0.f8614e;
        goto L22
    L19:
        r11 = r0.f8614e;
    L8:
        r17 = r3;
        r18 = r4;
        r06 = r5;
        goto L51
    L14:
        if ((r10 instanceof C0830TD) == true) goto L16;
    L7:
        if (((C2221m7) r10).f5062f == r21) goto L16;
    L53:
        return (int) r8;
    }

    /* JADX INFO: renamed from: e */
    public final void m5091e(AbstractC1449gF r6, int r7, ArrayList r8) {
        C2628vd r0 = r6.f5064h;
        C2628vd r1 = r6.f5065i;
        Iterator r02 = r0.f9120k.iterator();
    L4:
        if (r02.hasNext() == false) goto L11;
        InterfaceC2542td r2 = (InterfaceC2542td) r02.next();
        if ((r2 instanceof C2628vd) == true) goto L7;
        if ((r2 instanceof AbstractC1449gF) == false) goto L4;
        m5087a(((AbstractC1449gF) r2).f5064h, r7, r8, null);
        goto L4
    L7:
        m5087a((C2628vd) r2, r7, r8, null);
        goto L4
    L11:
        Iterator r03 = r1.f9120k.iterator();
    L13:
        if (r03.hasNext() == false) goto L21;
        InterfaceC2542td r12 = (InterfaceC2542td) r03.next();
        if ((r12 instanceof C2628vd) == true) goto L16;
        if ((r12 instanceof AbstractC1449gF) == false) goto L13;
        m5087a(((AbstractC1449gF) r12).f5065i, r7, r8, null);
        goto L13
    L16:
        m5087a((C2628vd) r12, r7, r8, null);
        goto L13
    L21:
        if (r7 != 1) goto L28;
        Iterator r62 = ((C0830TD) r6).f2621k.f9120k.iterator();
    L24:
        if (r62.hasNext() == false) goto L50;
        InterfaceC2542td r04 = (InterfaceC2542td) r62.next();
        if ((r04 instanceof C2628vd) == false) goto L24;
        m5087a((C2628vd) r04, r7, r8, null);
        goto L24
    L50:
        return;
    }

    /* JADX INFO: renamed from: f */
    public final void m5092f(int r2, int r3, int r4, int r5, C2454rb r6) {
        C0178E5 r0 = this.f8953g;
        r0.f520a = r2;
        r0.f521b = r4;
        r0.f522c = r3;
        r0.f523d = r5;
        this.f8952f.m2865b(r6, r0);
        r6.m4924O(r0.f524e);
        r6.m4921L(r0.f525f);
        r6.f8584E = r0.f527h;
        r6.m4918I(r0.f526g);
    }

    /* JADX INFO: renamed from: g */
    public final void m5093g() {
        Iterator r0 = this.f8947a.f8774q0.iterator();
    L4:
        if (r0.hasNext() == false) goto L40;
        C2454rb r7 = (C2454rb) r0.next();
        if (r7.f8606a == true) goto L4;
        int[] r1 = r7.f8637p0;
        boolean r2 = false;
        int r8 = r1[0];
        int r12 = r1[1];
        int r3 = r7.f8639r;
        int r4 = r7.f8640s;
        if (r8 == 2) goto L14;
        if (r8 != 3) goto L13;
        if (r3 == 1) goto L14;
    L13:
        boolean r32 = false;
    L15:
        if (r12 == 2) goto L18;
        if (r12 != 3) goto L19;
        if (r4 == 1) goto L18;
    L19:
        C0750Rd r42 = r7.f8612d.f5061e;
        boolean r6 = r42.f9119j;
        C0750Rd r11 = r7.f8614e.f5061e;
        boolean r122 = r11.f9119j;
        boolean r13 = r32;
        if (r6 == false) goto L23;
        if (r122 == false) goto L23;
        m5092f(1, r42.f9116g, 1, r11.f9116g, r7);
        r7.f8606a = true;
    L36:
        if (r7.f8606a == false) goto L4;
        C0135D5 r14 = r7.f8614e.f2622l;
        if (r14 == null) goto L4;
        r14.mo1539d(r7.f8607a0);
    L23:
        if (r6 == false) goto L29;
        if (r2 == false) goto L29;
        m5092f(1, r42.f9116g, 2, r11.f9116g, r7);
        if (r12 != 3) goto L28;
        r7.f8614e.f5061e.f2386m = r7.m4933k();
        goto L36
    L28:
        r7.f8614e.f5061e.mo1539d(r7.m4933k());
        r7.f8606a = true;
    L29:
        if (r122 == false) goto L36;
        if (r13 == false) goto L36;
        m5092f(2, r42.f9116g, 1, r11.f9116g, r7);
        if (r8 != 3) goto L34;
        r7.f8612d.f5061e.f2386m = r7.m4937q();
        goto L36
    L34:
        r7.f8612d.f5061e.mo1539d(r7.m4937q());
        r7.f8606a = true;
    L18:
        r2 = true;
    L14:
        r32 = true;
        goto L15
    }
}
