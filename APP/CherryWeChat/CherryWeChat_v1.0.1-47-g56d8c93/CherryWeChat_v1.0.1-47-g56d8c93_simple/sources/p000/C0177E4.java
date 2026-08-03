package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: E4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0177E4 {

    /* JADX INFO: renamed from: a */
    public int f510a;

    /* JADX INFO: renamed from: b */
    public final C0564N4 f511b;

    /* JADX INFO: renamed from: c */
    public final C2656w4 f512c;

    /* JADX INFO: renamed from: d */
    public int f513d;

    /* JADX INFO: renamed from: e */
    public int[] f514e;

    /* JADX INFO: renamed from: f */
    public int[] f515f;

    /* JADX INFO: renamed from: g */
    public float[] f516g;

    /* JADX INFO: renamed from: h */
    public int f517h;

    /* JADX INFO: renamed from: i */
    public int f518i;

    /* JADX INFO: renamed from: j */
    public boolean f519j;

    public C0177E4(C0564N4 r4, C2656w4 r5) {
        this.f510a = 0;
        this.f513d = 8;
        this.f514e = new int[8];
        this.f515f = new int[8];
        this.f516g = new float[8];
        this.f517h = -1;
        this.f518i = -1;
        this.f519j = false;
        this.f511b = r4;
        this.f512c = r5;
    }

    /* JADX INFO: renamed from: a */
    public final void m361a(C0256Fy r12, float r13, boolean r14) {
        if (r13 > (-0.001f)) goto L5;
    L7:
        int r1 = this.f517h;
        C0564N4 r3 = this.f511b;
        if (r1 != (-1)) goto L15;
        this.f517h = 0;
        this.f516g[0] = r13;
        this.f514e[0] = r12.f830b;
        this.f515f[0] = -1;
        r12.f839k++;
        r12.m533a(r3);
        this.f510a++;
        if (this.f519j == true) goto L81;
        int r122 = this.f518i + 1;
        this.f518i = r122;
        int[] r132 = this.f514e;
        if (r122 < r132.length) goto L82;
        this.f519j = true;
        this.f518i = r132.length - 1;
        return;
    L82:
        return;
    L81:
        return;
    L15:
        int r7 = 0;
        int r8 = -1;
    L16:
        if (r1 == (-1)) goto L42;
        if (r7 >= this.f510a) goto L42;
        int r9 = this.f514e[r1];
        int r10 = r12.f830b;
        if (r9 == r10) goto L21;
        if (r9 >= r10) goto L41;
        r8 = r1;
    L41:
        r1 = this.f515f[r1];
        r7 = r7 + 1;
        goto L16
    L21:
        float[] r4 = this.f516g;
        float r5 = r4[r1] + r13;
        if (r5 > (-0.001f)) goto L24;
    L26:
        r4[r1] = r5;
        if (r5 == 0.0f) goto L29;
        return;
    L29:
        if (r1 != this.f517h) goto L31;
        this.f517h = this.f515f[r1];
    L32:
        if (r14 == false) goto L35;
        r12.m534b(r3);
    L35:
        if (this.f519j == false) goto L37;
        this.f518i = r1;
    L37:
        r12.f839k--;
        this.f510a--;
        return;
    L31:
        int[] r133 = this.f515f;
        r133[r8] = r133[r1];
        goto L32
    L24:
        if (r5 >= 0.001f) goto L26;
        r5 = 0.0f;
    L42:
        int r142 = this.f518i;
        int r0 = r142 + 1;
        if (this.f519j == false) goto L48;
        int[] r02 = this.f514e;
        if (r02[r142] == (-1)) goto L49;
        r142 = r02.length;
    L49:
        int[] r03 = this.f514e;
        if (r142 >= r03.length) goto L52;
    L60:
        int[] r04 = this.f514e;
        if (r142 < r04.length) goto L63;
        r142 = r04.length;
        int r05 = this.f513d * 2;
        this.f513d = r05;
        this.f519j = false;
        this.f518i = r142 - 1;
        this.f516g = Arrays.copyOf(this.f516g, r05);
        this.f514e = Arrays.copyOf(this.f514e, this.f513d);
        this.f515f = Arrays.copyOf(this.f515f, this.f513d);
    L63:
        this.f514e[r142] = r12.f830b;
        this.f516g[r142] = r13;
        if (r8 == (-1)) goto L66;
        int[] r134 = this.f515f;
        r134[r142] = r134[r8];
        r134[r8] = r142;
    L67:
        r12.f839k++;
        r12.m533a(r3);
        this.f510a++;
        if (this.f519j == true) goto L70;
        this.f518i++;
    L70:
        int r123 = this.f518i;
        int[] r135 = this.f514e;
        if (r123 < r135.length) goto L84;
        this.f519j = true;
        this.f518i = r135.length - 1;
        return;
    L84:
        return;
    L66:
        this.f515f[r142] = this.f517h;
        this.f517h = r142;
        goto L67
    L52:
        if (this.f510a >= r03.length) goto L60;
        int r06 = 0;
    L54:
        int[] r15 = this.f514e;
        if (r06 >= r15.length) goto L60;
        if (r15[r06] == (-1)) goto L58;
        r06 = r06 + 1;
        goto L54
    L58:
        r142 = r06;
        goto L60
    L48:
        r142 = r0;
        goto L49
    L5:
        if (r13 >= 0.001f) goto L7;
    }

    /* JADX INFO: renamed from: b */
    public final void m362b() {
        int r0 = this.f517h;
        int r2 = 0;
    L4:
        if (r0 == (-1)) goto L11;
        if (r2 >= this.f510a) goto L11;
        C0256Fy r3 = ((C0256Fy[]) this.f512c.f9198d)[this.f514e[r0]];
        if (r3 == null) goto L10;
        r3.m534b(this.f511b);
    L10:
        r0 = this.f515f[r0];
        r2 = r2 + 1;
    L11:
        this.f517h = -1;
        this.f518i = -1;
        this.f519j = false;
        this.f510a = 0;
    }

    /* JADX INFO: renamed from: c */
    public final float m363c(C0256Fy r5) {
        int r0 = this.f517h;
        int r1 = 0;
    L4:
        if (r0 == (-1)) goto L12;
        if (r1 >= this.f510a) goto L17;
        if (this.f514e[r0] == r5.f830b) goto L10;
        r0 = this.f515f[r0];
        r1 = r1 + 1;
        goto L4
    L10:
        return this.f516g[r0];
    L17:
        return 0.0f;
    L12:
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final int m364d() {
        return this.f510a;
    }

    /* JADX INFO: renamed from: e */
    public final C0256Fy m365e(int r4) {
        int r0 = this.f517h;
        int r1 = 0;
    L4:
        if (r0 == (-1)) goto L11;
        if (r1 >= this.f510a) goto L16;
        if (r1 == r4) goto L9;
        r0 = this.f515f[r0];
        r1 = r1 + 1;
        goto L4
    L9:
        return ((C0256Fy[]) this.f512c.f9198d)[this.f514e[r0]];
    L16:
        return null;
    L11:
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final float m366f(int r4) {
        int r0 = this.f517h;
        int r1 = 0;
    L4:
        if (r0 == (-1)) goto L11;
        if (r1 >= this.f510a) goto L16;
        if (r1 == r4) goto L9;
        r0 = this.f515f[r0];
        r1 = r1 + 1;
        goto L4
    L9:
        return this.f516g[r0];
    L16:
        return 0.0f;
    L11:
        return 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public final void m367g(C0256Fy r10, float r11) {
        if (r11 != 0.0f) goto L6;
        m368h(r10, true);
        return;
    L6:
        int r0 = this.f517h;
        C0564N4 r2 = this.f511b;
        if (r0 != (-1)) goto L14;
        this.f517h = 0;
        this.f516g[0] = r11;
        this.f514e[0] = r10.f830b;
        this.f515f[0] = -1;
        r10.f839k++;
        r10.m533a(r2);
        this.f510a++;
        if (this.f519j == true) goto L67;
        int r102 = this.f518i + 1;
        this.f518i = r102;
        int[] r112 = this.f514e;
        if (r102 < r112.length) goto L68;
        this.f519j = true;
        this.f518i = r112.length - 1;
        return;
    L68:
        return;
    L67:
        return;
    L14:
        int r5 = 0;
        int r6 = -1;
    L15:
        if (r0 == (-1)) goto L25;
        if (r5 >= this.f510a) goto L25;
        int r7 = this.f514e[r0];
        int r8 = r10.f830b;
        if (r7 == r8) goto L20;
        if (r7 >= r8) goto L24;
        r6 = r0;
    L24:
        r0 = this.f515f[r0];
        r5 = r5 + 1;
        goto L15
    L20:
        this.f516g[r0] = r11;
        return;
    L25:
        int r02 = this.f518i;
        int r52 = r02 + 1;
        if (this.f519j == false) goto L31;
        int[] r53 = this.f514e;
        if (r53[r02] == (-1)) goto L32;
        r02 = r53.length;
    L32:
        int[] r54 = this.f514e;
        if (r02 >= r54.length) goto L35;
    L43:
        int[] r55 = this.f514e;
        if (r02 < r55.length) goto L46;
        r02 = r55.length;
        int r56 = this.f513d * 2;
        this.f513d = r56;
        this.f519j = false;
        this.f518i = r02 - 1;
        this.f516g = Arrays.copyOf(this.f516g, r56);
        this.f514e = Arrays.copyOf(this.f514e, this.f513d);
        this.f515f = Arrays.copyOf(this.f515f, this.f513d);
    L46:
        this.f514e[r02] = r10.f830b;
        this.f516g[r02] = r11;
        if (r6 == (-1)) goto L49;
        int[] r113 = this.f515f;
        r113[r02] = r113[r6];
        r113[r6] = r02;
    L50:
        r10.f839k++;
        r10.m533a(r2);
        int r103 = this.f510a + 1;
        this.f510a = r103;
        if (this.f519j == true) goto L53;
        this.f518i++;
    L53:
        int[] r114 = this.f514e;
        if (r103 < r114.length) goto L57;
        this.f519j = true;
    L57:
        if (this.f518i < r114.length) goto L69;
        this.f519j = true;
        this.f518i = r114.length - 1;
        return;
    L69:
        return;
    L49:
        this.f515f[r02] = this.f517h;
        this.f517h = r02;
        goto L50
    L35:
        if (this.f510a >= r54.length) goto L43;
        int r57 = 0;
    L37:
        int[] r72 = this.f514e;
        if (r57 >= r72.length) goto L43;
        if (r72[r57] == (-1)) goto L41;
        r57 = r57 + 1;
        goto L37
    L41:
        r02 = r57;
        goto L43
    L31:
        r02 = r52;
        goto L32
    }

    /* JADX INFO: renamed from: h */
    public final float m368h(C0256Fy r8, boolean r9) {
        int r0 = this.f517h;
        if (r0 == (-1)) goto L23;
        int r2 = 0;
        int r3 = -1;
    L6:
        if (r0 == (-1)) goto L28;
        if (r2 >= this.f510a) goto L29;
        if (this.f514e[r0] == r8.f830b) goto L12;
        r2 = r2 + 1;
        r3 = r0;
        r0 = this.f515f[r0];
        goto L6
    L12:
        if (r0 != this.f517h) goto L14;
        this.f517h = this.f515f[r0];
    L15:
        if (r9 == false) goto L17;
        r8.m534b(this.f511b);
    L17:
        r8.f839k--;
        this.f510a--;
        this.f514e[r0] = -1;
        if (this.f519j == false) goto L21;
        this.f518i = r0;
    L21:
        return this.f516g[r0];
    L14:
        int[] r22 = this.f515f;
        r22[r3] = r22[r0];
        goto L15
    L29:
        return 0.0f;
    L28:
        return 0.0f;
    L23:
        return 0.0f;
    }

    public final String toString() {
        int r0 = this.f517h;
        String r1 = "";
        int r2 = 0;
    L4:
        if (r0 == (-1)) goto L8;
        if (r2 >= this.f510a) goto L8;
        r1 = (AbstractC0213Ey.m407e(r1, " -> ") + this.f516g[r0] + " : ") + ((C0256Fy[]) this.f512c.f9198d)[this.f514e[r0]];
        r0 = this.f515f[r0];
        r2 = r2 + 1;
    L8:
        return r1;
    }
}
