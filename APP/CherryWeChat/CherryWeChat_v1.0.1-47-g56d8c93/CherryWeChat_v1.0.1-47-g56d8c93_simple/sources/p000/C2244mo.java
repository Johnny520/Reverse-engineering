package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: mo */
/* JADX INFO: loaded from: classes.dex */
public final class C2244mo {

    /* JADX INFO: renamed from: q */
    public static boolean f7925q = false;

    /* JADX INFO: renamed from: a */
    public int f7926a;

    /* JADX INFO: renamed from: b */
    public boolean f7927b;

    /* JADX INFO: renamed from: c */
    public int f7928c;

    /* JADX INFO: renamed from: d */
    public final C2731xu f7929d;

    /* JADX INFO: renamed from: e */
    public int f7930e;

    /* JADX INFO: renamed from: f */
    public int f7931f;

    /* JADX INFO: renamed from: g */
    public C0564N4[] f7932g;

    /* JADX INFO: renamed from: h */
    public boolean f7933h;

    /* JADX INFO: renamed from: i */
    public boolean[] f7934i;

    /* JADX INFO: renamed from: j */
    public int f7935j;

    /* JADX INFO: renamed from: k */
    public int f7936k;

    /* JADX INFO: renamed from: l */
    public int f7937l;

    /* JADX INFO: renamed from: m */
    public final C2656w4 f7938m;

    /* JADX INFO: renamed from: n */
    public C0256Fy[] f7939n;

    /* JADX INFO: renamed from: o */
    public int f7940o;

    /* JADX INFO: renamed from: p */
    public C0564N4 f7941p;

    public C2244mo() {
        this.f7926a = 1000;
        this.f7927b = false;
        this.f7928c = 0;
        this.f7930e = 32;
        this.f7931f = 32;
        this.f7933h = false;
        this.f7934i = new boolean[32];
        this.f7935j = 1;
        this.f7936k = 0;
        this.f7937l = 32;
        this.f7939n = new C0256Fy[1000];
        this.f7940o = 0;
        this.f7932g = new C0564N4[32];
        m4579s();
        C2656w4 r0 = new C2656w4(7);
        r0.f9196b = new C1067Yt();
        r0.f9197c = new C1067Yt();
        r0.f9198d = new C0256Fy[32];
        this.f7938m = r0;
        C2731xu r2 = new C2731xu(r0);
        r2.f9331f = new C0256Fy[128];
        r2.f9332g = new C0256Fy[128];
        r2.f9333h = 0;
        r2.f9334i = new C0649P3(27, r2);
        this.f7929d = r2;
        this.f7941p = new C0564N4(r0);
    }

    /* JADX INFO: renamed from: n */
    public static int m4561n(Object r1) {
        C0256Fy r12 = ((C1259cb) r1).f4273i;
        if (r12 != null) goto L5;
        return 0;
    L5:
        return (int) (r12.f833e + 0.5f);
    }

    /* JADX INFO: renamed from: a */
    public final C0256Fy m4562a(int r6) {
        C1067Yt r0 = (C1067Yt) this.f7938m.f9197c;
        int r1 = r0.f3379b;
        Object r2 = null;
        if (r1 <= 0) goto L5;
        int r12 = r1 - 1;
        Object[] r3 = r0.f3378a;
        Object r4 = r3[r12];
        r3[r12] = null;
        r0.f3379b = r12;
        r2 = r4;
    L5:
        C0256Fy r22 = (C0256Fy) r2;
        if (r22 != null) goto L8;
        r22 = new C0256Fy(r6);
        r22.f840l = r6;
    L9:
        int r62 = this.f7940o;
        int r02 = this.f7926a;
        if (r62 < r02) goto L12;
        int r03 = r02 * 2;
        this.f7926a = r03;
        this.f7939n = (C0256Fy[]) Arrays.copyOf(this.f7939n, r03);
    L12:
        C0256Fy[] r63 = this.f7939n;
        int r04 = this.f7940o;
        this.f7940o = r04 + 1;
        r63[r04] = r22;
        return r22;
    L8:
        r22.m535c();
        r22.f840l = r6;
        goto L9
    }

    /* JADX INFO: renamed from: b */
    public final void m4563b(C0256Fy r7, C0256Fy r8, int r9, float r10, C0256Fy r11, C0256Fy r12, int r13, int r14) {
        C0564N4 r0 = m4573l();
        if (r8 != r11) goto L6;
        r0.f1845d.m367g(r7, 1.0f);
        r0.f1845d.m367g(r12, 1.0f);
        r0.f1845d.m367g(r8, -2.0f);
    L22:
        if (r14 == 8) goto L24;
        r0.m1103a(this, r14);
    L24:
        m4564c(r0);
        return;
    L6:
        if (r10 != 0.5f) goto L12;
        r0.f1845d.m367g(r7, 1.0f);
        r0.f1845d.m367g(r8, -1.0f);
        r0.f1845d.m367g(r11, -1.0f);
        r0.f1845d.m367g(r12, 1.0f);
        if (r9 > 0) goto L10;
        if (r13 <= 0) goto L22;
    L10:
        r0.f1843b = (-r9) + r13;
        goto L22
    L12:
        if (r10 > 0.0f) goto L15;
        r0.f1845d.m367g(r7, -1.0f);
        r0.f1845d.m367g(r8, 1.0f);
        r0.f1843b = r9;
        goto L22
    L15:
        if (r10 < 1.0f) goto L17;
        r0.f1845d.m367g(r12, -1.0f);
        r0.f1845d.m367g(r11, 1.0f);
        r0.f1843b = -r13;
        goto L22
    L17:
        float r4 = 1.0f - r10;
        r0.f1845d.m367g(r7, r4 * 1.0f);
        r0.f1845d.m367g(r8, r4 * (-1.0f));
        r0.f1845d.m367g(r11, (-1.0f) * r10);
        r0.f1845d.m367g(r12, 1.0f * r10);
        if (r9 > 0) goto L20;
        if (r13 <= 0) goto L22;
    L20:
        r0.f1843b = (r13 * r10) + ((-r9) * r4);
        goto L22
    }

    /* JADX INFO: renamed from: c */
    public final void m4564c(C0564N4 r18) {
        if ((this.f7936k + 1) < this.f7937l) goto L5;
    L6:
        m4575o();
    L8:
        if (r18.f1846e == true) goto L128;
        ArrayList r2 = r18.f1844c;
        if (this.f7932g.length == 0) goto L40;
        boolean r5 = false;
    L13:
        if (r5 == true) goto L35;
        int r7 = r18.f1845d.m364d();
        int r8 = 0;
    L15:
        if (r8 >= r7) goto L23;
        C0256Fy r9 = r18.f1845d.m365e(r8);
        if (r9.f831c == (-1)) goto L19;
    L21:
        r2.add(r9);
    L22:
        r8 = r8 + 1;
        goto L15
    L19:
        if (r9.f834f == true) goto L21;
    L23:
        int r72 = r2.size();
        if (r72 > 0) goto L25;
        r5 = true;
        goto L13
    L25:
        int r82 = 0;
    L26:
        if (r82 >= r72) goto L32;
        C0256Fy r92 = (C0256Fy) r2.get(r82);
        if (r92.f834f == false) goto L30;
        r18.m1110h(this, r92, true);
    L31:
        r82 = r82 + 1;
        goto L26
    L30:
        r18.mo1111i(this, this.f7932g[r92.f831c], true);
        goto L31
    L32:
        r2.clear();
        goto L13
    L35:
        if (r18.f1842a == null) goto L40;
        if (r18.f1845d.m364d() != 0) goto L40;
        r18.f1846e = true;
        this.f7927b = true;
    L40:
        if (r18.mo1107e() == true) goto L159;
        float r22 = r18.f1843b;
        float r52 = 0.0f;
        if (r22 >= 0.0f) goto L50;
        r18.f1843b = r22 * (-1.0f);
        C0177E4 r23 = r18.f1845d;
        int r73 = r23.f517h;
        int r83 = 0;
    L46:
        if (r73 == (-1)) goto L50;
        if (r83 >= r23.f510a) goto L50;
        float[] r93 = r23.f516g;
        r93[r73] = r93[r73] * (-1.0f);
        r73 = r23.f515f[r73];
        r83 = r83 + 1;
    L50:
        int r24 = r18.f1845d.m364d();
        float r11 = 0.0f;
        float r13 = 0.0f;
        C0256Fy r94 = null;
        C0256Fy r10 = null;
        int r84 = 0;
        boolean r12 = false;
        boolean r14 = false;
    L51:
        if (r84 >= r24) goto L88;
        float r15 = r18.f1845d.m366f(r84);
        C0256Fy r4 = r18.f1845d.m365e(r84);
        float r16 = r52;
        if (r4.f840l != 1) goto L69;
        if (r94 != null) goto L61;
        if (r4.f839k <= 1) goto L68;
    L58:
        r12 = false;
    L59:
        r94 = r4;
        r11 = r15;
    L87:
        r84 = r84 + 1;
        r52 = r16;
    L68:
        r12 = true;
        goto L59
    L61:
        if (r11 > r15) goto L63;
        if (r12 == true) goto L87;
        if (r4.f839k > 1) goto L87;
    L63:
        if (r4.f839k > 1) goto L58;
    L69:
        if (r94 != null) goto L87;
        if (r15 >= r16) goto L87;
        if (r10 != null) goto L79;
        if (r4.f839k <= 1) goto L86;
    L76:
        r14 = false;
    L77:
        r10 = r4;
        r13 = r15;
    L86:
        r14 = true;
        goto L77
    L79:
        if (r13 > r15) goto L81;
        if (r14 == true) goto L87;
        if (r4.f839k > 1) goto L87;
    L81:
        if (r4.f839k > 1) goto L76;
    L88:
        float r162 = r52;
        if (r94 != null) goto L92;
        r94 = r10;
    L92:
        if (r94 != null) goto L94;
        boolean r25 = true;
    L96:
        if (r18.f1845d.m364d() != 0) goto L98;
        r18.f1846e = true;
    L98:
        if (r25 == true) goto L100;
    L120:
        boolean r42 = false;
    L121:
        C0256Fy r26 = r18.f1842a;
        if (r26 != null) goto L124;
        return;
    L124:
        if (r26.f840l != 1) goto L126;
    L129:
        if (r42 == true) goto L158;
        m4569h(r18);
        return;
    L158:
        return;
    L126:
        if (r18.f1843b >= r162) goto L129;
        return;
    L100:
        if ((this.f7935j + 1) < this.f7931f) goto L102;
        m4575o();
    L102:
        C0256Fy r27 = m4562a(3);
        int r43 = this.f7928c + 1;
        this.f7928c = r43;
        this.f7935j++;
        r27.f830b = r43;
        C2656w4 r53 = this.f7938m;
        ((C0256Fy[]) r53.f9198d)[r43] = r27;
        r18.f1842a = r27;
        int r44 = this.f7936k;
        m4569h(r18);
        if (this.f7936k != (r44 + 1)) goto L120;
        C0564N4 r45 = this.f7941p;
        r45.f1842a = null;
        r45.f1845d.m362b();
        int r85 = 0;
    L106:
        if (r85 >= r18.f1845d.m364d()) goto L108;
        r45.f1845d.m361a(r18.f1845d.m365e(r85), r18.f1845d.m366f(r85), true);
        r85 = r85 + 1;
        goto L106
    L108:
        m4578r(this.f7941p);
        if (r27.f831c == (-1)) goto L111;
    L119:
        r42 = true;
        goto L121
    L111:
        if (r18.f1842a != r27) goto L116;
        C0256Fy r28 = r18.m1108f(null, r27);
        if (r28 == null) goto L116;
        r18.m1109g(r28);
    L116:
        if (r18.f1846e == true) goto L118;
        r18.f1842a.m537e(this, r18);
    L118:
        ((C1067Yt) r53.f9196b).m2003b(r18);
        this.f7936k--;
        goto L119
    L94:
        r18.m1109g(r94);
        r25 = false;
        goto L96
    L159:
        return;
    L128:
        r42 = false;
        goto L129
    L5:
        if ((this.f7935j + 1) < this.f7931f) goto L8;
        goto L6
    }

    /* JADX INFO: renamed from: d */
    public final void m4565d(C0256Fy r5, int r6) {
        int r0 = r5.f831c;
        if (r0 != (-1)) goto L9;
        r5.m536d(this, r6);
        int r52 = 0;
    L6:
        if (r52 >= (this.f7928c + 1)) goto L8;
        C0256Fy r62 = ((C0256Fy[]) this.f7938m.f9198d)[r52];
        r52 = r52 + 1;
        goto L6
    L8:
        return;
    L9:
        if (r0 == (-1)) goto L24;
        C0564N4 r02 = this.f7932g[r0];
        if (r02.f1846e == false) goto L15;
        r02.f1843b = r6;
        return;
    L15:
        if (r02.f1845d.m364d() != 0) goto L18;
        r02.f1846e = true;
        r02.f1843b = r6;
        return;
    L18:
        C0564N4 r03 = m4573l();
        if (r6 >= 0) goto L21;
        r03.f1843b = r6 * (-1);
        r03.f1845d.m367g(r5, 1.0f);
    L22:
        m4564c(r03);
        return;
    L21:
        r03.f1843b = r6;
        r03.f1845d.m367g(r5, -1.0f);
        goto L22
    L24:
        C0564N4 r04 = m4573l();
        r04.f1842a = r5;
        float r63 = r6;
        r5.f833e = r63;
        r04.f1843b = r63;
        r04.f1846e = true;
        m4564c(r04);
    }

    /* JADX INFO: renamed from: e */
    public final void m4566e(C0256Fy r5, C0256Fy r6, int r7, int r8) {
        if (r8 == 8) goto L5;
    L10:
        C0564N4 r1 = m4573l();
        boolean r2 = false;
        if (r7 == 0) goto L16;
        if (r7 >= 0) goto L14;
        r7 = r7 * (-1);
        r2 = true;
    L14:
        r1.f1843b = r7;
    L16:
        if (r2 == true) goto L18;
        r1.f1845d.m367g(r5, -1.0f);
        r1.f1845d.m367g(r6, 1.0f);
    L19:
        if (r8 == 8) goto L21;
        r1.m1103a(this, r8);
    L21:
        m4564c(r1);
        return;
    L18:
        r1.f1845d.m367g(r5, 1.0f);
        r1.f1845d.m367g(r6, -1.0f);
        goto L19
    L5:
        if (r6.f834f == false) goto L10;
        if (r5.f831c != (-1)) goto L10;
        r5.m536d(this, r6.f833e + r7);
    }

    /* JADX INFO: renamed from: f */
    public final void m4567f(C0256Fy r4, C0256Fy r5, int r6, int r7) {
        C0564N4 r0 = m4573l();
        C0256Fy r1 = m4574m();
        r1.f832d = 0;
        r0.m1104b(r4, r5, r1, r6);
        if (r7 == 8) goto L5;
        int r42 = (int) (r0.f1845d.m363c(r1) * (-1.0f));
        r0.f1845d.m367g(m4571j(r7), r42);
    L5:
        m4564c(r0);
    }

    /* JADX INFO: renamed from: g */
    public final void m4568g(C0256Fy r4, C0256Fy r5, int r6, int r7) {
        C0564N4 r0 = m4573l();
        C0256Fy r1 = m4574m();
        r1.f832d = 0;
        r0.m1105c(r4, r5, r1, r6);
        if (r7 == 8) goto L5;
        int r42 = (int) (r0.f1845d.m363c(r1) * (-1.0f));
        r0.f1845d.m367g(m4571j(r7), r42);
    L5:
        m4564c(r0);
    }

    /* JADX INFO: renamed from: h */
    public final void m4569h(C0564N4 r8) {
        if (r8.f1846e == false) goto L5;
        r8.f1842a.m536d(this, r8.f1843b);
    L7:
        if (this.f7927b == false) goto L38;
        int r0 = 0;
    L10:
        if (r0 >= this.f7936k) goto L29;
        if (this.f7932g[r0] != null) goto L14;
        System.out.println("WTF");
    L14:
        C0564N4 r1 = this.f7932g[r0];
        if (r1 == null) goto L28;
        if (r1.f1846e == false) goto L28;
        r1.f1842a.m536d(this, r1.f1843b);
        ((C1067Yt) this.f7938m.f9196b).m2003b(r1);
        this.f7932g[r0] = null;
        int r12 = r0 + 1;
        int r3 = r12;
    L19:
        int r4 = this.f7936k;
        if (r12 >= r4) goto L25;
        C0564N4[] r32 = this.f7932g;
        int r42 = r12 - 1;
        C0564N4 r5 = r32[r12];
        r32[r42] = r5;
        C0256Fy r33 = r5.f1842a;
        if (r33.f831c != r12) goto L24;
        r33.f831c = r42;
    L24:
        r3 = r12;
        r12 = r12 + 1;
        goto L19
    L25:
        if (r3 >= r4) goto L27;
        this.f7932g[r3] = null;
    L27:
        this.f7936k = r4 - 1;
        r0 = r0 - 1;
    L28:
        r0 = r0 + 1;
        goto L10
    L29:
        this.f7927b = false;
        return;
    L38:
        return;
    L5:
        C0564N4[] r02 = this.f7932g;
        int r13 = this.f7936k;
        r02[r13] = r8;
        C0256Fy r03 = r8.f1842a;
        r03.f831c = r13;
        this.f7936k = r13 + 1;
        r03.m537e(this, r8);
        goto L7
    }

    /* JADX INFO: renamed from: i */
    public final void m4570i() {
        int r0 = 0;
    L4:
        if (r0 >= this.f7936k) goto L6;
        C0564N4 r1 = this.f7932g[r0];
        C0256Fy r2 = r1.f1842a;
        r2.f833e = r1.f1843b;
        r0 = r0 + 1;
        goto L4
    }

    /* JADX INFO: renamed from: j */
    public final C0256Fy m4571j(int r5) {
        if ((this.f7935j + 1) < this.f7931f) goto L5;
        m4575o();
    L5:
        C0256Fy r0 = m4562a(4);
        float[] r1 = r0.f836h;
        int r2 = this.f7928c + 1;
        this.f7928c = r2;
        this.f7935j++;
        r0.f830b = r2;
        r0.f832d = r5;
        ((C0256Fy[]) this.f7938m.f9198d)[r2] = r0;
        C2731xu r52 = this.f7929d;
        r52.f9334i.f2089b = r0;
        Arrays.fill(r1, 0.0f);
        r1[r0.f832d] = 1.0f;
        r52.m5297j(r0);
        return r0;
    }

    /* JADX INFO: renamed from: k */
    public final C0256Fy m4572k(Object r6) {
        if (r6 != null) goto L5;
        return null;
    L5:
        if ((this.f7935j + 1) < this.f7931f) goto L8;
        m4575o();
    L8:
        if ((r6 instanceof C1259cb) == false) goto L24;
        C1259cb r62 = (C1259cb) r6;
        C0256Fy r0 = r62.f4273i;
        if (r0 != null) goto L12;
        r62.m2390k();
        r0 = r62.f4273i;
    L12:
        int r63 = r0.f830b;
        C2656w4 r3 = this.f7938m;
        if (r63 != (-1)) goto L15;
    L20:
        if (r63 == (-1)) goto L22;
        r0.m535c();
    L22:
        int r64 = this.f7928c + 1;
        this.f7928c = r64;
        this.f7935j++;
        r0.f830b = r64;
        r0.f840l = 1;
        ((C0256Fy[]) r3.f9198d)[r64] = r0;
        return r0;
    L15:
        if (r63 > this.f7928c) goto L20;
        if (((C0256Fy[]) r3.f9198d)[r63] == null) goto L20;
        return r0;
    L24:
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final C0564N4 m4573l() {
        C2656w4 r0 = this.f7938m;
        C1067Yt r1 = (C1067Yt) r0.f9196b;
        int r2 = r1.f3379b;
        if (r2 <= 0) goto L5;
        int r22 = r2 - 1;
        Object[] r4 = r1.f3378a;
        Object r5 = r4[r22];
        r4[r22] = null;
        r1.f3379b = r22;
    L6:
        C0564N4 r52 = (C0564N4) r5;
        if (r52 == null) goto L11;
        r52.f1842a = null;
        r52.f1845d.m362b();
        r52.f1843b = 0.0f;
        r52.f1846e = false;
        return r52;
    L11:
        return new C0564N4(r0);
    L5:
        r5 = null;
        goto L6
    }

    /* JADX INFO: renamed from: m */
    public final C0256Fy m4574m() {
        if ((this.f7935j + 1) < this.f7931f) goto L5;
        m4575o();
    L5:
        C0256Fy r0 = m4562a(3);
        int r1 = this.f7928c + 1;
        this.f7928c = r1;
        this.f7935j++;
        r0.f830b = r1;
        ((C0256Fy[]) this.f7938m.f9198d)[r1] = r0;
        return r0;
    }

    /* JADX INFO: renamed from: o */
    public final void m4575o() {
        int r0 = this.f7930e * 2;
        this.f7930e = r0;
        this.f7932g = (C0564N4[]) Arrays.copyOf(this.f7932g, r0);
        C2656w4 r02 = this.f7938m;
        r02.f9198d = (C0256Fy[]) Arrays.copyOf((C0256Fy[]) r02.f9198d, this.f7930e);
        int r03 = this.f7930e;
        this.f7934i = new boolean[r03];
        this.f7931f = r03;
        this.f7937l = r03;
    }

    /* JADX INFO: renamed from: p */
    public final void m4576p() {
        C2731xu r0 = this.f7929d;
        if (r0.mo1107e() == false) goto L7;
        m4570i();
        return;
    L7:
        if (this.f7933h == false) goto L18;
        int r1 = 0;
    L10:
        if (r1 >= this.f7936k) goto L16;
        if (this.f7932g[r1].f1846e == false) goto L13;
        r1 = r1 + 1;
        goto L10
    L13:
        m4577q(r0);
        return;
    L16:
        m4570i();
        return;
    L18:
        m4577q(r0);
    }

    /* JADX INFO: renamed from: q */
    public final void m4577q(C2731xu r19) {
        int r2 = 0;
    L4:
        if (r2 >= this.f7936k) goto L47;
        C0564N4 r3 = this.f7932g[r2];
        int r5 = 1;
        if (r3.f1842a.f840l == 1) goto L46;
        float r4 = 0.0f;
        if (r3.f1843b >= 0.0f) goto L46;
        boolean r22 = false;
        int r32 = 0;
    L11:
        if (r22 == true) goto L47;
        r32 = r32 + r5;
        float r7 = Float.MAX_VALUE;
        int r9 = -1;
        int r10 = -1;
        int r8 = 0;
        int r11 = 0;
    L14:
        if (r8 >= this.f7936k) goto L39;
        C0564N4 r12 = this.f7932g[r8];
        if (r12.f1842a.f840l == r5) goto L38;
        if (r12.f1846e == true) goto L38;
        if (r12.f1843b >= r4) goto L38;
        int r13 = r12.f1845d.m364d();
        int r14 = 0;
    L24:
        if (r14 >= r13) goto L38;
        C0256Fy r15 = r12.f1845d.m365e(r14);
        float r1 = r12.f1845d.m363c(r15);
        if (r1 <= r4) goto L37;
        int r42 = 0;
    L30:
        if (r42 >= 9) goto L37;
        float r52 = r15.f835g[r42] / r1;
        if (r52 >= r7) goto L34;
        if (r42 != r11) goto L34;
    L35:
        r11 = r42;
        r10 = r15.f830b;
        r9 = r8;
        r7 = r52;
    L36:
        r42 = r42 + 1;
    L34:
        if (r42 <= r11) goto L36;
    L37:
        r14 = r14 + 1;
        r4 = 0.0f;
    L38:
        r8 = r8 + 1;
        r4 = 0.0f;
        r5 = 1;
        goto L14
    L39:
        if (r9 == (-1)) goto L41;
        C0564N4 r16 = this.f7932g[r9];
        r16.f1842a.f831c = -1;
        r16.m1109g(((C0256Fy[]) this.f7938m.f9198d)[r10]);
        C0256Fy r43 = r16.f1842a;
        r43.f831c = r9;
        r43.m537e(this, r16);
    L43:
        if (r32 <= (this.f7935j / 2)) goto L45;
        r22 = true;
    L45:
        r4 = 0.0f;
        r5 = 1;
        goto L11
    L41:
        r22 = true;
    L46:
        r2 = r2 + 1;
    L47:
        m4578r(r19);
        m4570i();
    }

    /* JADX INFO: renamed from: r */
    public final void m4578r(C0564N4 r17) {
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r3 >= this.f7935j) goto L6;
        this.f7934i[r3] = false;
        r3 = r3 + 1;
        goto L4
    L6:
        boolean r32 = false;
        int r4 = 0;
    L7:
        if (r32 == true) goto L53;
        int r5 = 1;
        r4 = r4 + 1;
        if (r4 >= (this.f7935j * 2)) goto L71;
        C0256Fy r6 = r17.f1842a;
        if (r6 == null) goto L14;
        this.f7934i[r6.f830b] = true;
    L14:
        C0256Fy r62 = r17.mo1106d(this.f7934i);
        if (r62 == null) goto L20;
        boolean[] r7 = this.f7934i;
        int r8 = r62.f830b;
        if (r7[r8] == true) goto L72;
        r7[r8] = true;
        goto L20
    L72:
        return;
    L20:
        if (r62 == null) goto L51;
        float r82 = Float.MAX_VALUE;
        int r9 = r2;
        int r10 = -1;
    L23:
        if (r9 >= this.f7936k) goto L49;
        C0564N4 r11 = this.f7932g[r9];
        if (r11.f1842a.f840l == r5) goto L48;
        if (r11.f1846e == true) goto L48;
        C0177E4 r12 = r11.f1845d;
        int r13 = r12.f517h;
        if (r13 == (-1)) goto L41;
        int r22 = 0;
    L34:
        if (r13 == (-1)) goto L41;
        if (r22 >= r12.f510a) goto L41;
        if (r12.f514e[r13] == r62.f830b) goto L39;
        r13 = r12.f515f[r13];
        r22 = r22 + 1;
        goto L34
    L39:
        boolean r14 = true;
    L42:
        if (r14 == false) goto L48;
        float r23 = r11.f1845d.m363c(r62);
        if (r23 >= 0.0f) goto L48;
        float r52 = (-r11.f1843b) / r23;
        if (r52 >= r82) goto L48;
        r82 = r52;
        r10 = r9;
    L41:
        r14 = false;
    L48:
        r9 = r9 + 1;
        r5 = 1;
        goto L23
    L49:
        if (r10 <= (-1)) goto L52;
        C0564N4 r24 = this.f7932g[r10];
        r24.f1842a.f831c = -1;
        r24.m1109g(r62);
        C0256Fy r53 = r24.f1842a;
        r53.f831c = r10;
        r53.m537e(this, r24);
    L52:
        r2 = 0;
        goto L7
    L51:
        r32 = true;
        goto L52
    L71:
        return;
    }

    /* JADX INFO: renamed from: s */
    public final void m4579s() {
        int r0 = 0;
    L4:
        if (r0 >= this.f7936k) goto L9;
        C0564N4 r1 = this.f7932g[r0];
        if (r1 == null) goto L8;
        ((C1067Yt) this.f7938m.f9196b).m2003b(r1);
    L8:
        this.f7932g[r0] = null;
        r0 = r0 + 1;
        goto L4
    }

    /* JADX INFO: renamed from: t */
    public final void m4580t() {
        int r1 = 0;
    L3:
        C2656w4 r2 = this.f7938m;
        C0256Fy[] r3 = (C0256Fy[]) r2.f9198d;
        if (r1 >= r3.length) goto L9;
        C0256Fy r22 = r3[r1];
        if (r22 == null) goto L8;
        r22.m535c();
    L8:
        r1 = r1 + 1;
        goto L3
    L9:
        C1067Yt r12 = (C1067Yt) r2.f9197c;
        C0256Fy[] r32 = this.f7939n;
        int r4 = this.f7940o;
        r12.getClass();
        if (r4 <= r32.length) goto L12;
        r4 = r32.length;
    L12:
        int r5 = 0;
    L13:
        if (r5 >= r4) goto L18;
        C0256Fy r6 = r32[r5];
        int r7 = r12.f3379b;
        Object[] r8 = r12.f3378a;
        if (r7 >= r8.length) goto L17;
        r8[r7] = r6;
        r12.f3379b = r7 + 1;
    L17:
        r5 = r5 + 1;
        goto L13
    L18:
        this.f7940o = 0;
        Arrays.fill((C0256Fy[]) r2.f9198d, null);
        this.f7928c = 0;
        C2731xu r13 = this.f7929d;
        r13.f9333h = 0;
        r13.f1843b = 0.0f;
        this.f7935j = 1;
        int r14 = 0;
    L20:
        if (r14 >= this.f7936k) goto L22;
        C0564N4 r33 = this.f7932g[r14];
        r14 = r14 + 1;
        goto L20
    L22:
        m4579s();
        this.f7936k = 0;
        this.f7941p = new C0564N4(r2);
    }
}
