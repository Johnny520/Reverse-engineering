package p069m;

import java.util.Arrays;
import p034S.AbstractC0324d;
import p043Y.C0463v;

/* JADX INFO: renamed from: m.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0981a implements InterfaceC0982b {

    /* JADX INFO: renamed from: a */
    public int f3469a;

    /* JADX INFO: renamed from: b */
    public final C0983c f3470b;

    /* JADX INFO: renamed from: c */
    public final C0463v f3471c;

    /* JADX INFO: renamed from: d */
    public int f3472d;

    /* JADX INFO: renamed from: e */
    public int[] f3473e;

    /* JADX INFO: renamed from: f */
    public int[] f3474f;

    /* JADX INFO: renamed from: g */
    public float[] f3475g;

    /* JADX INFO: renamed from: h */
    public int f3476h;

    /* JADX INFO: renamed from: i */
    public int f3477i;

    /* JADX INFO: renamed from: j */
    public boolean f3478j;

    public C0981a(C0983c r4, C0463v r5) {
        this.f3469a = 0;
        this.f3472d = 8;
        this.f3473e = new int[8];
        this.f3474f = new int[8];
        this.f3475g = new float[8];
        this.f3476h = -1;
        this.f3477i = -1;
        this.f3478j = false;
        this.f3470b = r4;
        this.f3471c = r5;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: a */
    public final float mo2333a(int r4) {
        int r02 = this.f3476h;
        int r1 = 0;
    L4:
        if (r02 == (-1)) goto L11;
        if (r1 >= this.f3469a) goto L16;
        if (r1 == r4) goto L9;
        r02 = this.f3474f[r02];
        r1 = r1 + 1;
        goto L4
    L9:
        return this.f3475g[r02];
    L16:
        return 0.0f;
    L11:
        return 0.0f;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: b */
    public final boolean mo2334b(C0989i r7) {
        int r02 = this.f3476h;
        if (r02 != (-1)) goto L5;
        return false;
    L5:
        int r3 = 0;
    L6:
        if (r02 == (-1)) goto L14;
        if (r3 >= this.f3469a) goto L14;
        if (this.f3473e[r02] == r7.f3507b) goto L11;
        r02 = this.f3474f[r02];
        r3 = r3 + 1;
        goto L6
    L11:
        return true;
    L14:
        return false;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: c */
    public final void mo2335c(C0989i r10, float r11) {
        if (r11 != 0.0f) goto L6;
        mo2341i(r10, true);
        return;
    L6:
        int r02 = this.f3476h;
        C0983c r2 = this.f3470b;
        if (r02 != (-1)) goto L14;
        this.f3476h = 0;
        this.f3475g[0] = r11;
        this.f3473e[0] = r10.f3507b;
        this.f3474f[0] = -1;
        r10.f3516k++;
        r10.m2373a(r2);
        this.f3469a++;
        if (this.f3478j == true) goto L67;
        int r102 = this.f3477i + 1;
        this.f3477i = r102;
        int[] r112 = this.f3473e;
        if (r102 < r112.length) goto L68;
        this.f3478j = true;
        this.f3477i = r112.length - 1;
        return;
    L68:
        return;
    L67:
        return;
    L14:
        int r5 = 0;
        int r6 = -1;
    L15:
        if (r02 == (-1)) goto L25;
        if (r5 >= this.f3469a) goto L25;
        int r7 = this.f3473e[r02];
        int r8 = r10.f3507b;
        if (r7 == r8) goto L20;
        if (r7 >= r8) goto L24;
        r6 = r02;
    L24:
        r02 = this.f3474f[r02];
        r5 = r5 + 1;
        goto L15
    L20:
        this.f3475g[r02] = r11;
        return;
    L25:
        int r03 = this.f3477i;
        int r52 = r03 + 1;
        if (this.f3478j == false) goto L31;
        int[] r53 = this.f3473e;
        if (r53[r03] == (-1)) goto L32;
        r03 = r53.length;
    L32:
        int[] r54 = this.f3473e;
        if (r03 >= r54.length) goto L35;
    L43:
        int[] r55 = this.f3473e;
        if (r03 < r55.length) goto L46;
        r03 = r55.length;
        int r56 = this.f3472d * 2;
        this.f3472d = r56;
        this.f3478j = false;
        this.f3477i = r03 - 1;
        this.f3475g = Arrays.copyOf(this.f3475g, r56);
        this.f3473e = Arrays.copyOf(this.f3473e, this.f3472d);
        this.f3474f = Arrays.copyOf(this.f3474f, this.f3472d);
    L46:
        this.f3473e[r03] = r10.f3507b;
        this.f3475g[r03] = r11;
        if (r6 == (-1)) goto L49;
        int[] r113 = this.f3474f;
        r113[r03] = r113[r6];
        r113[r6] = r03;
    L50:
        r10.f3516k++;
        r10.m2373a(r2);
        int r103 = this.f3469a + 1;
        this.f3469a = r103;
        if (this.f3478j == true) goto L53;
        this.f3477i++;
    L53:
        int[] r114 = this.f3473e;
        if (r103 < r114.length) goto L57;
        this.f3478j = true;
    L57:
        if (this.f3477i < r114.length) goto L69;
        this.f3478j = true;
        this.f3477i = r114.length - 1;
        return;
    L69:
        return;
    L49:
        this.f3474f[r03] = this.f3476h;
        this.f3476h = r03;
        goto L50
    L35:
        if (this.f3469a >= r54.length) goto L43;
        int r57 = 0;
    L37:
        int[] r72 = this.f3473e;
        if (r57 >= r72.length) goto L43;
        if (r72[r57] == (-1)) goto L41;
        r57 = r57 + 1;
        goto L37
    L41:
        r03 = r57;
        goto L43
    L31:
        r03 = r52;
        goto L32
    }

    @Override // p069m.InterfaceC0982b
    public final void clear() {
        int r02 = this.f3476h;
        int r2 = 0;
    L4:
        if (r02 == (-1)) goto L11;
        if (r2 >= this.f3469a) goto L11;
        C0989i r3 = ((C0989i[]) this.f3471c.f1047d)[this.f3473e[r02]];
        if (r3 == null) goto L10;
        r3.m2374b(this.f3470b);
    L10:
        r02 = this.f3474f[r02];
        r2 = r2 + 1;
    L11:
        this.f3476h = -1;
        this.f3477i = -1;
        this.f3478j = false;
        this.f3469a = 0;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: d */
    public final C0989i mo2336d(int r4) {
        int r02 = this.f3476h;
        int r1 = 0;
    L4:
        if (r02 == (-1)) goto L11;
        if (r1 >= this.f3469a) goto L16;
        if (r1 == r4) goto L9;
        r02 = this.f3474f[r02];
        r1 = r1 + 1;
        goto L4
    L9:
        return ((C0989i[]) this.f3471c.f1047d)[this.f3473e[r02]];
    L16:
        return null;
    L11:
        return null;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: e */
    public final void mo2337e(float r5) {
        int r02 = this.f3476h;
        int r1 = 0;
    L4:
        if (r02 == (-1)) goto L8;
        if (r1 >= this.f3469a) goto L11;
        float[] r2 = this.f3475g;
        r2[r02] = r2[r02] / r5;
        r02 = this.f3474f[r02];
        r1 = r1 + 1;
        goto L4
    L11:
        return;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: f */
    public final void mo2338f(C0989i r12, float r13, boolean r14) {
        if (r13 > (-0.001f)) goto L5;
    L7:
        int r1 = this.f3476h;
        C0983c r4 = this.f3470b;
        if (r1 != (-1)) goto L15;
        this.f3476h = 0;
        this.f3475g[0] = r13;
        this.f3473e[0] = r12.f3507b;
        this.f3474f[0] = -1;
        r12.f3516k++;
        r12.m2373a(r4);
        this.f3469a++;
        if (this.f3478j == true) goto L81;
        int r122 = this.f3477i + 1;
        this.f3477i = r122;
        int[] r132 = this.f3473e;
        if (r122 < r132.length) goto L82;
        this.f3478j = true;
        this.f3477i = r132.length - 1;
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
        if (r7 >= this.f3469a) goto L42;
        int r9 = this.f3473e[r1];
        int r10 = r12.f3507b;
        if (r9 == r10) goto L21;
        if (r9 >= r10) goto L41;
        r8 = r1;
    L41:
        r1 = this.f3474f[r1];
        r7 = r7 + 1;
        goto L16
    L21:
        float[] r5 = this.f3475g;
        float r6 = r5[r1] + r13;
        if (r6 > (-0.001f)) goto L24;
    L26:
        r5[r1] = r6;
        if (r6 == 0.0f) goto L29;
        return;
    L29:
        if (r1 != this.f3476h) goto L31;
        this.f3476h = this.f3474f[r1];
    L32:
        if (r14 == false) goto L35;
        r12.m2374b(r4);
    L35:
        if (this.f3478j == false) goto L37;
        this.f3477i = r1;
    L37:
        r12.f3516k--;
        this.f3469a--;
        return;
    L31:
        int[] r133 = this.f3474f;
        r133[r8] = r133[r1];
        goto L32
    L24:
        if (r6 >= 0.001f) goto L26;
        r6 = 0.0f;
    L42:
        int r142 = this.f3477i;
        int r02 = r142 + 1;
        if (this.f3478j == false) goto L48;
        int[] r03 = this.f3473e;
        if (r03[r142] == (-1)) goto L49;
        r142 = r03.length;
    L49:
        int[] r04 = this.f3473e;
        if (r142 >= r04.length) goto L52;
    L60:
        int[] r05 = this.f3473e;
        if (r142 < r05.length) goto L63;
        r142 = r05.length;
        int r06 = this.f3472d * 2;
        this.f3472d = r06;
        this.f3478j = false;
        this.f3477i = r142 - 1;
        this.f3475g = Arrays.copyOf(this.f3475g, r06);
        this.f3473e = Arrays.copyOf(this.f3473e, this.f3472d);
        this.f3474f = Arrays.copyOf(this.f3474f, this.f3472d);
    L63:
        this.f3473e[r142] = r12.f3507b;
        this.f3475g[r142] = r13;
        if (r8 == (-1)) goto L66;
        int[] r134 = this.f3474f;
        r134[r142] = r134[r8];
        r134[r8] = r142;
    L67:
        r12.f3516k++;
        r12.m2373a(r4);
        this.f3469a++;
        if (this.f3478j == true) goto L70;
        this.f3477i++;
    L70:
        int r123 = this.f3477i;
        int[] r135 = this.f3473e;
        if (r123 < r135.length) goto L84;
        this.f3478j = true;
        this.f3477i = r135.length - 1;
        return;
    L84:
        return;
    L66:
        this.f3474f[r142] = this.f3476h;
        this.f3476h = r142;
        goto L67
    L52:
        if (this.f3469a >= r04.length) goto L60;
        int r07 = 0;
    L54:
        int[] r15 = this.f3473e;
        if (r07 >= r15.length) goto L60;
        if (r15[r07] == (-1)) goto L58;
        r07 = r07 + 1;
        goto L54
    L58:
        r142 = r07;
        goto L60
    L48:
        r142 = r02;
        goto L49
    L5:
        if (r13 >= 0.001f) goto L7;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: g */
    public final float mo2339g(C0989i r5) {
        int r02 = this.f3476h;
        int r1 = 0;
    L4:
        if (r02 == (-1)) goto L12;
        if (r1 >= this.f3469a) goto L17;
        if (this.f3473e[r02] == r5.f3507b) goto L10;
        r02 = this.f3474f[r02];
        r1 = r1 + 1;
        goto L4
    L10:
        return this.f3475g[r02];
    L17:
        return 0.0f;
    L12:
        return 0.0f;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: h */
    public final float mo2340h(C0983c r6, boolean r7) {
        float r02 = mo2339g(r6.f3479a);
        mo2341i(r6.f3479a, r7);
        InterfaceC0982b r62 = r6.f3482d;
        int r1 = r62.mo2343k();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        C0989i r3 = r62.mo2336d(r2);
        mo2338f(r3, r62.mo2339g(r3) * r02, r7);
        r2 = r2 + 1;
        goto L3
    L5:
        return r02;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: i */
    public final float mo2341i(C0989i r9, boolean r10) {
        int r02 = this.f3476h;
        if (r02 != (-1)) goto L5;
        return 0.0f;
    L5:
        int r3 = 0;
        int r4 = -1;
    L6:
        if (r02 == (-1)) goto L23;
        if (r3 >= this.f3469a) goto L23;
        if (this.f3473e[r02] == r9.f3507b) goto L12;
        r3 = r3 + 1;
        r4 = r02;
        r02 = this.f3474f[r02];
        goto L6
    L12:
        if (r02 != this.f3476h) goto L14;
        this.f3476h = this.f3474f[r02];
    L15:
        if (r10 == false) goto L17;
        r9.m2374b(this.f3470b);
    L17:
        r9.f3516k--;
        this.f3469a--;
        this.f3473e[r02] = -1;
        if (this.f3478j == false) goto L21;
        this.f3477i = r02;
    L21:
        return this.f3475g[r02];
    L14:
        int[] r1 = this.f3474f;
        r1[r4] = r1[r02];
    L23:
        return 0.0f;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: j */
    public final void mo2342j() {
        int r02 = this.f3476h;
        int r1 = 0;
    L4:
        if (r02 == (-1)) goto L8;
        if (r1 >= this.f3469a) goto L11;
        float[] r2 = this.f3475g;
        r2[r02] = r2[r02] * (-1.0f);
        r02 = this.f3474f[r02];
        r1 = r1 + 1;
        goto L4
    L11:
        return;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: k */
    public final int mo2343k() {
        return this.f3469a;
    }

    public final String toString() {
        int r02 = this.f3476h;
        String r1 = "";
        int r2 = 0;
    L4:
        if (r02 == (-1)) goto L8;
        if (r2 >= this.f3469a) goto L8;
        r1 = (AbstractC0324d.m722e(r1, " -> ") + this.f3475g[r02] + " : ") + ((C0989i[]) this.f3471c.f1047d)[this.f3473e[r02]];
        r02 = this.f3474f[r02];
        r2 = r2 + 1;
    L8:
        return r1;
    }
}
