package p069m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p004C.C0061b;
import p043Y.C0463v;
import p071n.C0998c;

/* JADX INFO: renamed from: m.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0985e {

    /* JADX INFO: renamed from: o */
    public static int f3484o = 1000;

    /* JADX INFO: renamed from: p */
    public static boolean f3485p = true;

    /* JADX INFO: renamed from: a */
    public int f3486a;

    /* JADX INFO: renamed from: b */
    public final C0987g f3487b;

    /* JADX INFO: renamed from: c */
    public int f3488c;

    /* JADX INFO: renamed from: d */
    public int f3489d;

    /* JADX INFO: renamed from: e */
    public C0983c[] f3490e;

    /* JADX INFO: renamed from: f */
    public boolean f3491f;

    /* JADX INFO: renamed from: g */
    public boolean[] f3492g;

    /* JADX INFO: renamed from: h */
    public int f3493h;

    /* JADX INFO: renamed from: i */
    public int f3494i;

    /* JADX INFO: renamed from: j */
    public int f3495j;

    /* JADX INFO: renamed from: k */
    public final C0463v f3496k;

    /* JADX INFO: renamed from: l */
    public C0989i[] f3497l;

    /* JADX INFO: renamed from: m */
    public int f3498m;

    /* JADX INFO: renamed from: n */
    public C0983c f3499n;

    public C0985e() {
        this.f3486a = 0;
        this.f3488c = 32;
        this.f3489d = 32;
        this.f3490e = null;
        this.f3491f = false;
        this.f3492g = new boolean[32];
        this.f3493h = 1;
        this.f3494i = 0;
        this.f3495j = 32;
        this.f3497l = new C0989i[f3484o];
        this.f3498m = 0;
        this.f3490e = new C0983c[32];
        m2368q();
        C0463v r2 = new C0463v();
        r2.f1044a = new C0061b();
        r2.f1045b = new C0061b();
        r2.f1046c = new C0061b();
        r2.f1047d = new C0989i[32];
        this.f3496k = r2;
        C0987g r1 = new C0987g(r2);
        r1.f3502f = new C0989i[128];
        r1.f3503g = new C0989i[128];
        r1.f3504h = 0;
        r1.f3505i = new C0986f(r1);
        this.f3487b = r1;
        if (f3485p == false) goto L5;
        this.f3499n = new C0984d(r2);
        return;
    L5:
        this.f3499n = new C0983c(r2);
    }

    /* JADX INFO: renamed from: m */
    public static int m2352m(Object r1) {
        C0989i r12 = ((C0998c) r1).f3583g;
        if (r12 != null) goto L5;
        return 0;
    L5:
        return (int) (r12.f3510e + 0.5f);
    }

    /* JADX INFO: renamed from: a */
    public final C0989i m2353a(int r4) {
        C0989i r02 = (C0989i) ((C0061b) this.f3496k.f1046c).mo198a();
        if (r02 != null) goto L5;
        r02 = new C0989i(r4);
        r02.f3517l = r4;
    L6:
        int r42 = this.f3498m;
        int r1 = f3484o;
        if (r42 < r1) goto L9;
        int r12 = r1 * 2;
        f3484o = r12;
        this.f3497l = (C0989i[]) Arrays.copyOf(this.f3497l, r12);
    L9:
        C0989i[] r43 = this.f3497l;
        int r13 = this.f3498m;
        this.f3498m = r13 + 1;
        r43[r13] = r02;
        return r02;
    L5:
        r02.m2375c();
        r02.f3517l = r4;
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public final void m2354b(C0989i r7, C0989i r8, int r9, float r10, C0989i r11, C0989i r12, int r13, int r14) {
        C0983c r02 = m2363k();
        if (r8 != r11) goto L6;
        r02.f3482d.mo2335c(r7, 1.0f);
        r02.f3482d.mo2335c(r12, 1.0f);
        r02.f3482d.mo2335c(r8, -2.0f);
    L22:
        if (r14 == 8) goto L24;
        r02.m2344a(this, r14);
    L24:
        m2355c(r02);
        return;
    L6:
        if (r10 != 0.5f) goto L12;
        r02.f3482d.mo2335c(r7, 1.0f);
        r02.f3482d.mo2335c(r8, -1.0f);
        r02.f3482d.mo2335c(r11, -1.0f);
        r02.f3482d.mo2335c(r12, 1.0f);
        if (r9 > 0) goto L10;
        if (r13 <= 0) goto L22;
    L10:
        r02.f3480b = (-r9) + r13;
        goto L22
    L12:
        if (r10 > 0.0f) goto L15;
        r02.f3482d.mo2335c(r7, -1.0f);
        r02.f3482d.mo2335c(r8, 1.0f);
        r02.f3480b = r9;
        goto L22
    L15:
        if (r10 < 1.0f) goto L17;
        r02.f3482d.mo2335c(r12, -1.0f);
        r02.f3482d.mo2335c(r11, 1.0f);
        r02.f3480b = -r13;
        goto L22
    L17:
        float r4 = 1.0f - r10;
        r02.f3482d.mo2335c(r7, r4 * 1.0f);
        r02.f3482d.mo2335c(r8, r4 * (-1.0f));
        r02.f3482d.mo2335c(r11, (-1.0f) * r10);
        r02.f3482d.mo2335c(r12, 1.0f * r10);
        if (r9 > 0) goto L20;
        if (r13 <= 0) goto L22;
    L20:
        r02.f3480b = (r13 * r10) + ((-r9) * r4);
        goto L22
    }

    /* JADX INFO: renamed from: c */
    public final void m2355c(C0983c r17) {
        if ((this.f3494i + 1) < this.f3495j) goto L5;
    L6:
        m2365n();
    L8:
        if (r17.f3483e == false) goto L10;
        boolean r4 = false;
    L121:
        if (r4 == true) goto L150;
        m2360h(r17);
        return;
    L150:
        return;
    L10:
        if (this.f3490e.length == 0) goto L35;
        boolean r2 = false;
    L13:
        if (r2 == true) goto L35;
        int r6 = r17.f3482d.mo2343k();
        int r7 = 0;
    L15:
        ArrayList r8 = r17.f3481c;
        if (r7 >= r6) goto L24;
        C0989i r9 = r17.f3482d.mo2336d(r7);
        if (r9.f3508c == (-1)) goto L20;
    L21:
        r8.add(r9);
    L22:
        r7 = r7 + 1;
        goto L15
    L20:
        if (r9.f3511f == false) goto L22;
    L24:
        if (r8.size() > 0) goto L25;
        r2 = true;
        goto L13
    L25:
        Iterator r62 = r8.iterator();
    L27:
        if (r62.hasNext() == false) goto L32;
        C0989i r72 = (C0989i) r62.next();
        if (r72.f3511f == true) goto L30;
        r17.mo2351h(this.f3490e[r72.f3508c], true);
        goto L27
    L30:
        r17.m2350g(r72, true);
        goto L27
    L32:
        r8.clear();
    L35:
        if (r17.f3479a == null) goto L37;
    L41:
        float r22 = r17.f3480b;
        if (r22 >= 0.0f) goto L44;
        r17.f3480b = r22 * (-1.0f);
        r17.f3482d.mo2342j();
    L44:
        int r23 = r17.f3482d.mo2343k();
        float r11 = 0.0f;
        float r13 = 0.0f;
        C0989i r92 = null;
        C0989i r10 = null;
        int r82 = 0;
        boolean r12 = false;
        boolean r14 = false;
    L45:
        if (r82 >= r23) goto L82;
        float r15 = r17.f3482d.mo2333a(r82);
        C0989i r42 = r17.f3482d.mo2336d(r82);
        if (r42.f3517l != 1) goto L63;
        if (r92 != null) goto L55;
        if (r42.f3516k <= 1) goto L62;
    L52:
        r12 = false;
    L53:
        r92 = r42;
        r11 = r15;
    L81:
        r82 = r82 + 1;
    L62:
        r12 = true;
        goto L53
    L55:
        if (r11 > r15) goto L57;
        if (r12 == true) goto L81;
        if (r42.f3516k > 1) goto L81;
    L57:
        if (r42.f3516k > 1) goto L52;
    L63:
        if (r92 != null) goto L81;
        if (r15 >= 0.0f) goto L81;
        if (r10 != null) goto L73;
        if (r42.f3516k <= 1) goto L80;
    L70:
        r14 = false;
    L71:
        r10 = r42;
        r13 = r15;
    L80:
        r14 = true;
        goto L71
    L73:
        if (r13 > r15) goto L75;
        if (r14 == true) goto L81;
        if (r42.f3516k > 1) goto L81;
    L75:
        if (r42.f3516k > 1) goto L70;
    L82:
        if (r92 != null) goto L85;
        r92 = r10;
    L85:
        if (r92 != null) goto L87;
        boolean r24 = true;
    L89:
        if (r17.f3482d.mo2343k() != 0) goto L91;
        r17.f3483e = true;
    L91:
        if (r24 == true) goto L93;
        r4 = false;
    L112:
        C0989i r25 = r17.f3479a;
        if (r25 != null) goto L115;
        return;
    L115:
        if (r25.f3517l == 1) goto L121;
        if (r17.f3480b >= 0.0f) goto L121;
        return;
    L93:
        if ((this.f3493h + 1) < this.f3489d) goto L95;
        m2365n();
    L95:
        C0989i r26 = m2353a(3);
        int r43 = this.f3486a + 1;
        this.f3486a = r43;
        this.f3493h++;
        r26.f3507b = r43;
        ((C0989i[]) this.f3496k.f1047d)[r43] = r26;
        r17.f3479a = r26;
        m2360h(r17);
        C0983c r44 = this.f3499n;
        r44.getClass();
        r44.f3479a = null;
        r44.f3482d.clear();
        int r5 = 0;
    L97:
        if (r5 >= r17.f3482d.mo2343k()) goto L99;
        r44.f3482d.mo2338f(r17.f3482d.mo2336d(r5), r17.f3482d.mo2333a(r5), true);
        r5 = r5 + 1;
        goto L97
    L99:
        m2367p(this.f3499n);
        if (r26.f3508c == (-1)) goto L102;
    L110:
        r4 = true;
        goto L112
    L102:
        if (r17.f3479a != r26) goto L107;
        C0989i r27 = r17.m2348e(null, r26);
        if (r27 == null) goto L107;
        r17.m2349f(r27);
    L107:
        if (r17.f3483e == true) goto L109;
        r17.f3479a.m2376d(r17);
    L109:
        this.f3494i--;
        goto L110
    L87:
        r17.m2349f(r92);
        r24 = false;
        goto L89
    L37:
        if (r17.f3480b != 0.0f) goto L41;
        if (r17.f3482d.mo2343k() != 0) goto L41;
        return;
    L5:
        if ((this.f3493h + 1) < this.f3489d) goto L8;
        goto L6
    }

    /* JADX INFO: renamed from: d */
    public final void m2356d(C0989i r5, int r6) {
        int r02 = r5.f3508c;
        if (r02 != (-1)) goto L9;
        r5.f3510e = r6;
        r5.f3511f = true;
        int r62 = r5.f3515j;
        int r1 = 0;
    L5:
        if (r1 >= r62) goto L7;
        r5.f3514i[r1].m2350g(r5, false);
        r1 = r1 + 1;
        goto L5
    L7:
        r5.f3515j = 0;
        return;
    L9:
        if (r02 == (-1)) goto L21;
        C0983c r03 = this.f3490e[r02];
        if (r03.f3483e == false) goto L14;
        r03.f3480b = r6;
        return;
    L14:
        if (r03.f3482d.mo2343k() != 0) goto L16;
        r03.f3483e = true;
        r03.f3480b = r6;
        return;
    L16:
        C0983c r04 = m2363k();
        if (r6 >= 0) goto L19;
        r04.f3480b = r6 * (-1);
        r04.f3482d.mo2335c(r5, 1.0f);
    L20:
        m2355c(r04);
        return;
    L19:
        r04.f3480b = r6;
        r04.f3482d.mo2335c(r5, -1.0f);
        goto L20
    L21:
        C0983c r05 = m2363k();
        r05.f3479a = r5;
        float r63 = r6;
        r5.f3510e = r63;
        r05.f3480b = r63;
        r05.f3483e = true;
        m2355c(r05);
    }

    /* JADX INFO: renamed from: e */
    public final void m2357e(C0989i r6, C0989i r7, int r8, int r9) {
        boolean r02 = false;
        if (r9 == 8) goto L5;
    L13:
        C0983c r3 = m2363k();
        if (r8 == 0) goto L19;
        if (r8 >= 0) goto L17;
        r8 = r8 * (-1);
        r02 = true;
    L17:
        r3.f3480b = r8;
    L19:
        if (r02 == true) goto L21;
        r3.f3482d.mo2335c(r6, -1.0f);
        r3.f3482d.mo2335c(r7, 1.0f);
    L22:
        if (r9 == 8) goto L24;
        r3.m2344a(this, r9);
    L24:
        m2355c(r3);
        return;
    L21:
        r3.f3482d.mo2335c(r6, 1.0f);
        r3.f3482d.mo2335c(r7, -1.0f);
        goto L22
    L5:
        if (r7.f3511f == false) goto L13;
        if (r6.f3508c != (-1)) goto L13;
        r6.f3510e = r7.f3510e + r8;
        r6.f3511f = true;
        int r72 = r6.f3515j;
        int r82 = 0;
    L9:
        if (r82 >= r72) goto L11;
        r6.f3514i[r82].m2350g(r6, false);
        r82 = r82 + 1;
        goto L9
    L11:
        r6.f3515j = 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m2358f(C0989i r4, C0989i r5, int r6, int r7) {
        C0983c r02 = m2363k();
        C0989i r1 = m2364l();
        r1.f3509d = 0;
        r02.m2345b(r4, r5, r1, r6);
        if (r7 == 8) goto L5;
        int r42 = (int) (r02.f3482d.mo2339g(r1) * (-1.0f));
        r02.f3482d.mo2335c(m2361i(r7), r42);
    L5:
        m2355c(r02);
    }

    /* JADX INFO: renamed from: g */
    public final void m2359g(C0989i r4, C0989i r5, int r6, int r7) {
        C0983c r02 = m2363k();
        C0989i r1 = m2364l();
        r1.f3509d = 0;
        r02.m2346c(r4, r5, r1, r6);
        if (r7 == 8) goto L5;
        int r42 = (int) (r02.f3482d.mo2339g(r1) * (-1.0f));
        r02.f3482d.mo2335c(m2361i(r7), r42);
    L5:
        m2355c(r02);
    }

    /* JADX INFO: renamed from: h */
    public final void m2360h(C0983c r4) {
        boolean r02 = f3485p;
        C0463v r1 = this.f3496k;
        if (r02 == false) goto L7;
        C0983c r03 = this.f3490e[this.f3494i];
        if (r03 == null) goto L10;
        ((C0061b) r1.f1044a).m199b(r03);
    L10:
        C0983c[] r04 = this.f3490e;
        int r12 = this.f3494i;
        r04[r12] = r4;
        C0989i r05 = r4.f3479a;
        r05.f3508c = r12;
        this.f3494i = r12 + 1;
        r05.m2376d(r4);
        return;
    L7:
        C0983c r06 = this.f3490e[this.f3494i];
        if (r06 == null) goto L10;
        ((C0061b) r1.f1045b).m199b(r06);
        goto L10
    }

    /* JADX INFO: renamed from: i */
    public final C0989i m2361i(int r5) {
        if ((this.f3493h + 1) < this.f3489d) goto L5;
        m2365n();
    L5:
        C0989i r02 = m2353a(4);
        int r1 = this.f3486a + 1;
        this.f3486a = r1;
        this.f3493h++;
        r02.f3507b = r1;
        r02.f3509d = r5;
        ((C0989i[]) this.f3496k.f1047d)[r1] = r02;
        C0987g r52 = this.f3487b;
        r52.f3505i.f3500a = r02;
        float[] r12 = r02.f3513h;
        Arrays.fill(r12, 0.0f);
        r12[r02.f3509d] = 1.0f;
        r52.m2370i(r02);
        return r02;
    }

    /* JADX INFO: renamed from: j */
    public final C0989i m2362j(Object r6) {
        C0989i r02 = null;
        if (r6 != null) goto L6;
        return null;
    L6:
        if ((this.f3493h + 1) < this.f3489d) goto L9;
        m2365n();
    L9:
        if ((r6 instanceof C0998c) == false) goto L22;
        C0998c r62 = (C0998c) r6;
        r02 = r62.f3583g;
        if (r02 != null) goto L13;
        r62.m2396i();
        r02 = r62.f3583g;
    L13:
        int r63 = r02.f3507b;
        C0463v r1 = this.f3496k;
        if (r63 != (-1)) goto L16;
    L19:
        if (r63 == (-1)) goto L21;
        r02.m2375c();
    L21:
        int r64 = this.f3486a + 1;
        this.f3486a = r64;
        this.f3493h++;
        r02.f3507b = r64;
        r02.f3517l = 1;
        ((C0989i[]) r1.f1047d)[r64] = r02;
        goto L22
    L16:
        if (r63 > this.f3486a) goto L19;
        if (((C0989i[]) r1.f1047d)[r63] == null) goto L19;
    L22:
        return r02;
    }

    /* JADX INFO: renamed from: k */
    public final C0983c m2363k() {
        boolean r02 = f3485p;
        C0463v r4 = this.f3496k;
        if (r02 == false) goto L8;
        C0983c r03 = (C0983c) ((C0061b) r4.f1044a).mo198a();
        if (r03 == null) goto L13;
        r03.f3479a = null;
        r03.f3482d.clear();
        r03.f3480b = 0.0f;
        r03.f3483e = false;
        return r03;
    L13:
        return new C0984d(r4);
    L8:
        C0983c r04 = (C0983c) ((C0061b) r4.f1045b).mo198a();
        if (r04 == null) goto L15;
        r04.f3479a = null;
        r04.f3482d.clear();
        r04.f3480b = 0.0f;
        r04.f3483e = false;
        return r04;
    L15:
        return new C0983c(r4);
    }

    /* JADX INFO: renamed from: l */
    public final C0989i m2364l() {
        if ((this.f3493h + 1) < this.f3489d) goto L5;
        m2365n();
    L5:
        C0989i r02 = m2353a(3);
        int r1 = this.f3486a + 1;
        this.f3486a = r1;
        this.f3493h++;
        r02.f3507b = r1;
        ((C0989i[]) this.f3496k.f1047d)[r1] = r02;
        return r02;
    }

    /* JADX INFO: renamed from: n */
    public final void m2365n() {
        int r02 = this.f3488c * 2;
        this.f3488c = r02;
        this.f3490e = (C0983c[]) Arrays.copyOf(this.f3490e, r02);
        C0463v r03 = this.f3496k;
        r03.f1047d = (C0989i[]) Arrays.copyOf((C0989i[]) r03.f1047d, this.f3488c);
        int r04 = this.f3488c;
        this.f3492g = new boolean[r04];
        this.f3489d = r04;
        this.f3495j = r04;
    }

    /* JADX INFO: renamed from: o */
    public final void m2366o(C0987g r19) {
        int r2 = 0;
    L4:
        if (r2 >= this.f3494i) goto L48;
        C0983c r3 = this.f3490e[r2];
        int r5 = 1;
        if (r3.f3479a.f3517l == 1) goto L47;
        float r4 = 0.0f;
        if (r3.f3480b >= 0.0f) goto L47;
        boolean r22 = false;
        int r32 = 0;
    L11:
        if (r22 == true) goto L48;
        r32 = r32 + r5;
        float r7 = Float.MAX_VALUE;
        int r9 = -1;
        int r10 = -1;
        int r8 = 0;
        int r11 = 0;
    L13:
        int r12 = this.f3494i;
        C0463v r13 = this.f3496k;
        if (r8 >= r12) goto L40;
        C0983c r122 = this.f3490e[r8];
        if (r122.f3479a.f3517l == r5) goto L39;
        if (r122.f3483e == true) goto L39;
        if (r122.f3480b >= r4) goto L39;
        int r14 = r5;
    L25:
        if (r14 >= this.f3493h) goto L39;
        C0989i r15 = ((C0989i[]) r13.f1047d)[r14];
        float r1 = r122.f3482d.mo2339g(r15);
        if (r1 <= r4) goto L38;
        int r42 = 0;
    L31:
        if (r42 >= 9) goto L38;
        float r52 = r15.f3512g[r42] / r1;
        if (r52 >= r7) goto L35;
        if (r42 != r11) goto L35;
    L36:
        r11 = r42;
        r7 = r52;
        r9 = r8;
        r10 = r14;
    L37:
        r42 = r42 + 1;
    L35:
        if (r42 <= r11) goto L37;
    L38:
        r14 = r14 + 1;
        r4 = 0.0f;
    L39:
        r8 = r8 + 1;
        r4 = 0.0f;
        r5 = 1;
        goto L13
    L40:
        if (r9 == (-1)) goto L42;
        C0983c r16 = this.f3490e[r9];
        r16.f3479a.f3508c = -1;
        r16.m2349f(((C0989i[]) r13.f1047d)[r10]);
        C0989i r43 = r16.f3479a;
        r43.f3508c = r9;
        r43.m2376d(r16);
    L44:
        if (r32 <= (this.f3493h / 2)) goto L46;
        r22 = true;
    L46:
        r4 = 0.0f;
        r5 = 1;
        goto L11
    L42:
        r22 = true;
    L47:
        r2 = r2 + 1;
    L48:
        m2367p(r19);
        int r17 = 0;
    L50:
        if (r17 >= this.f3494i) goto L52;
        C0983c r23 = this.f3490e[r17];
        r23.f3479a.f3510e = r23.f3480b;
        r17 = r17 + 1;
        goto L50
    }

    /* JADX INFO: renamed from: p */
    public final void m2367p(C0983c r13) {
        int r1 = 0;
    L4:
        if (r1 >= this.f3493h) goto L6;
        this.f3492g[r1] = false;
        r1 = r1 + 1;
        goto L4
    L6:
        boolean r12 = false;
        int r2 = 0;
    L7:
        if (r12 == true) goto L41;
        r2 = r2 + 1;
        if (r2 >= (this.f3493h * 2)) goto L10;
        C0989i r4 = r13.f3479a;
        if (r4 == null) goto L14;
        this.f3492g[r4.f3507b] = true;
    L14:
        C0989i r42 = r13.mo2347d(this.f3492g);
        if (r42 == null) goto L20;
        boolean[] r5 = this.f3492g;
        int r6 = r42.f3507b;
        if (r5[r6] == true) goto L18;
        r5[r6] = true;
        goto L20
    L18:
        return;
    L20:
        if (r42 != null) goto L21;
        r12 = true;
        goto L7
    L21:
        float r62 = Float.MAX_VALUE;
        int r7 = 0;
        int r8 = -1;
    L23:
        if (r7 >= this.f3494i) goto L38;
        C0983c r9 = this.f3490e[r7];
        if (r9.f3479a.f3517l == 1) goto L37;
        if (r9.f3483e == true) goto L37;
        if (r9.f3482d.mo2334b(r42) == false) goto L37;
        float r10 = r9.f3482d.mo2339g(r42);
        if (r10 >= 0.0f) goto L37;
        float r92 = (-r9.f3480b) / r10;
        if (r92 >= r62) goto L37;
        r8 = r7;
        r62 = r92;
    L37:
        r7 = r7 + 1;
        goto L23
    L38:
        if (r8 <= (-1)) goto L7;
        C0983c r3 = this.f3490e[r8];
        r3.f3479a.f3508c = -1;
        r3.m2349f(r42);
        C0989i r43 = r3.f3479a;
        r43.f3508c = r8;
        r43.m2376d(r3);
        goto L7
    L10:
        return;
    }

    /* JADX INFO: renamed from: q */
    public final void m2368q() {
        boolean r02 = f3485p;
        C0463v r2 = this.f3496k;
        int r3 = 0;
        if (r02 == false) goto L10;
    L4:
        C0983c[] r03 = this.f3490e;
        if (r3 >= r03.length) goto L16;
        C0983c r04 = r03[r3];
        if (r04 == null) goto L9;
        ((C0061b) r2.f1044a).m199b(r04);
    L9:
        this.f3490e[r3] = null;
        r3 = r3 + 1;
        goto L4
    L16:
        return;
    L10:
        C0983c[] r05 = this.f3490e;
        if (r3 >= r05.length) goto L23;
        C0983c r06 = r05[r3];
        if (r06 == null) goto L15;
        ((C0061b) r2.f1045b).m199b(r06);
    L15:
        this.f3490e[r3] = null;
        r3 = r3 + 1;
        goto L10
    }

    /* JADX INFO: renamed from: r */
    public final void m2369r() {
        int r1 = 0;
    L3:
        C0463v r2 = this.f3496k;
        C0989i[] r3 = (C0989i[]) r2.f1047d;
        if (r1 >= r3.length) goto L9;
        C0989i r22 = r3[r1];
        if (r22 == null) goto L8;
        r22.m2375c();
    L8:
        r1 = r1 + 1;
        goto L3
    L9:
        C0061b r12 = (C0061b) r2.f1046c;
        C0989i[] r32 = this.f3497l;
        int r4 = this.f3498m;
        r12.getClass();
        if (r4 <= r32.length) goto L12;
        r4 = r32.length;
    L12:
        int r5 = 0;
    L13:
        if (r5 >= r4) goto L18;
        C0989i r6 = r32[r5];
        int r7 = r12.f207c;
        Object[] r8 = r12.f206b;
        if (r7 >= r8.length) goto L17;
        r8[r7] = r6;
        r12.f207c = r7 + 1;
    L17:
        r5 = r5 + 1;
        goto L13
    L18:
        this.f3498m = 0;
        Arrays.fill((C0989i[]) r2.f1047d, null);
        this.f3486a = 0;
        C0987g r13 = this.f3487b;
        r13.f3504h = 0;
        r13.f3480b = 0.0f;
        this.f3493h = 1;
        int r14 = 0;
    L20:
        if (r14 >= this.f3494i) goto L22;
        this.f3490e[r14].getClass();
        r14 = r14 + 1;
        goto L20
    L22:
        m2368q();
        this.f3494i = 0;
        if (f3485p == false) goto L25;
        this.f3499n = new C0984d(r2);
        return;
    L25:
        this.f3499n = new C0983c(r2);
    }
}
