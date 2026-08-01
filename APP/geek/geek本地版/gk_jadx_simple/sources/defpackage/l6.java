package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l6 implements o6 {
    public int a;
    public final p6 b;
    public final a8 c;
    public int d;
    public int[] e;
    public int[] f;
    public float[] g;
    public int h;
    public int i;
    public boolean j;

    public l6(p6 r4, a8 r5) {
        this.a = 0;
        this.d = 8;
        this.e = new int[8];
        this.f = new int[8];
        this.g = new float[8];
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.b = r4;
        this.c = r5;
    }

    @Override // defpackage.o6
    public final float a(int r4) {
        int r0 = this.h;
        int r1 = 0;
    L4:
        if (r0 == (-1)) goto L11;
        if (r1 >= this.a) goto L16;
        if (r1 == r4) goto L9;
        r0 = this.f[r0];
        r1 = r1 + 1;
        goto L4
    L9:
        return this.g[r0];
    L16:
        return 0.0f;
    L11:
        return 0.0f;
    }

    @Override // defpackage.o6
    public final float b(a40 r5) {
        int r0 = this.h;
        int r1 = 0;
    L4:
        if (r0 == (-1)) goto L12;
        if (r1 >= this.a) goto L17;
        if (this.e[r0] == r5.b) goto L10;
        r0 = this.f[r0];
        r1 = r1 + 1;
        goto L4
    L10:
        return this.g[r0];
    L17:
        return 0.0f;
    L12:
        return 0.0f;
    }

    @Override // defpackage.o6
    public final boolean c(a40 r7) {
        int r0 = this.h;
        if (r0 == (-1)) goto L14;
        int r3 = 0;
    L6:
        if (r0 == (-1)) goto L14;
        if (r3 >= this.a) goto L14;
        if (this.e[r0] == r7.b) goto L11;
        r0 = this.f[r0];
        r3 = r3 + 1;
        goto L6
    L11:
        return true;
    L14:
        return false;
    }

    @Override // defpackage.o6
    public final void clear() {
        int r0 = this.h;
        int r2 = 0;
    L4:
        if (r0 == (-1)) goto L11;
        if (r2 >= this.a) goto L11;
        a40 r3 = ((a40[]) this.c.d)[this.e[r0]];
        if (r3 == null) goto L10;
        r3.b(this.b);
    L10:
        r0 = this.f[r0];
        r2 = r2 + 1;
    L11:
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    @Override // defpackage.o6
    public final float d(a40 r8, boolean r9) {
        int r0 = this.h;
        if (r0 == (-1)) goto L23;
        int r2 = 0;
        int r3 = -1;
    L6:
        if (r0 == (-1)) goto L28;
        if (r2 >= this.a) goto L29;
        if (this.e[r0] == r8.b) goto L12;
        r2 = r2 + 1;
        r3 = r0;
        r0 = this.f[r0];
        goto L6
    L12:
        if (r0 != this.h) goto L14;
        this.h = this.f[r0];
    L15:
        if (r9 == false) goto L17;
        r8.b(this.b);
    L17:
        r8.k--;
        this.a--;
        this.e[r0] = -1;
        if (this.j == false) goto L21;
        this.i = r0;
    L21:
        return this.g[r0];
    L14:
        int[] r22 = this.f;
        r22[r3] = r22[r0];
        goto L15
    L29:
        return 0.0f;
    L28:
        return 0.0f;
    L23:
        return 0.0f;
    }

    @Override // defpackage.o6
    public final a40 e(int r4) {
        int r0 = this.h;
        int r1 = 0;
    L4:
        if (r0 == (-1)) goto L11;
        if (r1 >= this.a) goto L16;
        if (r1 == r4) goto L9;
        r0 = this.f[r0];
        r1 = r1 + 1;
        goto L4
    L9:
        return ((a40[]) this.c.d)[this.e[r0]];
    L16:
        return null;
    L11:
        return null;
    }

    @Override // defpackage.o6
    public final void f(a40 r12, float r13, boolean r14) {
        if (r13 > (-0.001f)) goto L5;
    L7:
        int r1 = this.h;
        p6 r3 = this.b;
        if (r1 != (-1)) goto L15;
        this.h = 0;
        this.g[0] = r13;
        this.e[0] = r12.b;
        this.f[0] = -1;
        r12.k++;
        r12.a(r3);
        this.a++;
        if (this.j == true) goto L81;
        int r122 = this.i + 1;
        this.i = r122;
        int[] r132 = this.e;
        if (r122 < r132.length) goto L82;
        this.j = true;
        this.i = r132.length - 1;
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
        if (r7 >= this.a) goto L42;
        int r9 = this.e[r1];
        int r10 = r12.b;
        if (r9 == r10) goto L21;
        if (r9 >= r10) goto L41;
        r8 = r1;
    L41:
        r1 = this.f[r1];
        r7 = r7 + 1;
        goto L16
    L21:
        float[] r4 = this.g;
        float r5 = r4[r1] + r13;
        if (r5 > (-0.001f)) goto L24;
    L26:
        r4[r1] = r5;
        if (r5 == 0.0f) goto L29;
        return;
    L29:
        if (r1 != this.h) goto L31;
        this.h = this.f[r1];
    L32:
        if (r14 == false) goto L35;
        r12.b(r3);
    L35:
        if (this.j == false) goto L37;
        this.i = r1;
    L37:
        r12.k--;
        this.a--;
        return;
    L31:
        int[] r133 = this.f;
        r133[r8] = r133[r1];
        goto L32
    L24:
        if (r5 >= 0.001f) goto L26;
        r5 = 0.0f;
    L42:
        int r142 = this.i;
        int r0 = r142 + 1;
        if (this.j == false) goto L48;
        int[] r02 = this.e;
        if (r02[r142] == (-1)) goto L49;
        r142 = r02.length;
    L49:
        int[] r03 = this.e;
        if (r142 >= r03.length) goto L52;
    L60:
        int[] r04 = this.e;
        if (r142 < r04.length) goto L63;
        r142 = r04.length;
        int r05 = this.d * 2;
        this.d = r05;
        this.j = false;
        this.i = r142 - 1;
        this.g = Arrays.copyOf(this.g, r05);
        this.e = Arrays.copyOf(this.e, this.d);
        this.f = Arrays.copyOf(this.f, this.d);
    L63:
        this.e[r142] = r12.b;
        this.g[r142] = r13;
        if (r8 == (-1)) goto L66;
        int[] r134 = this.f;
        r134[r142] = r134[r8];
        r134[r8] = r142;
    L67:
        r12.k++;
        r12.a(r3);
        this.a++;
        if (this.j == true) goto L70;
        this.i++;
    L70:
        int r123 = this.i;
        int[] r135 = this.e;
        if (r123 < r135.length) goto L84;
        this.j = true;
        this.i = r135.length - 1;
        return;
    L84:
        return;
    L66:
        this.f[r142] = this.h;
        this.h = r142;
        goto L67
    L52:
        if (this.a >= r03.length) goto L60;
        int r06 = 0;
    L54:
        int[] r15 = this.e;
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

    @Override // defpackage.o6
    public final float g(p6 r6, boolean r7) {
        float r0 = b(r6.a);
        d(r6.a, r7);
        o6 r62 = r6.d;
        int r1 = r62.k();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        a40 r3 = r62.e(r2);
        f(r3, r62.b(r3) * r0, r7);
        r2 = r2 + 1;
        goto L3
    L5:
        return r0;
    }

    @Override // defpackage.o6
    public final void h(float r5) {
        int r0 = this.h;
        int r1 = 0;
    L4:
        if (r0 == (-1)) goto L8;
        if (r1 >= this.a) goto L11;
        float[] r2 = this.g;
        r2[r0] = r2[r0] / r5;
        r0 = this.f[r0];
        r1 = r1 + 1;
        goto L4
    L11:
        return;
    }

    @Override // defpackage.o6
    public final void i(a40 r10, float r11) {
        if (r11 != 0.0f) goto L6;
        d(r10, true);
        return;
    L6:
        int r0 = this.h;
        p6 r2 = this.b;
        if (r0 != (-1)) goto L14;
        this.h = 0;
        this.g[0] = r11;
        this.e[0] = r10.b;
        this.f[0] = -1;
        r10.k++;
        r10.a(r2);
        this.a++;
        if (this.j == true) goto L67;
        int r102 = this.i + 1;
        this.i = r102;
        int[] r112 = this.e;
        if (r102 < r112.length) goto L68;
        this.j = true;
        this.i = r112.length - 1;
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
        if (r5 >= this.a) goto L25;
        int r7 = this.e[r0];
        int r8 = r10.b;
        if (r7 == r8) goto L20;
        if (r7 >= r8) goto L24;
        r6 = r0;
    L24:
        r0 = this.f[r0];
        r5 = r5 + 1;
        goto L15
    L20:
        this.g[r0] = r11;
        return;
    L25:
        int r02 = this.i;
        int r52 = r02 + 1;
        if (this.j == false) goto L31;
        int[] r53 = this.e;
        if (r53[r02] == (-1)) goto L32;
        r02 = r53.length;
    L32:
        int[] r54 = this.e;
        if (r02 >= r54.length) goto L35;
    L43:
        int[] r55 = this.e;
        if (r02 < r55.length) goto L46;
        r02 = r55.length;
        int r56 = this.d * 2;
        this.d = r56;
        this.j = false;
        this.i = r02 - 1;
        this.g = Arrays.copyOf(this.g, r56);
        this.e = Arrays.copyOf(this.e, this.d);
        this.f = Arrays.copyOf(this.f, this.d);
    L46:
        this.e[r02] = r10.b;
        this.g[r02] = r11;
        if (r6 == (-1)) goto L49;
        int[] r113 = this.f;
        r113[r02] = r113[r6];
        r113[r6] = r02;
    L50:
        r10.k++;
        r10.a(r2);
        int r103 = this.a + 1;
        this.a = r103;
        if (this.j == true) goto L53;
        this.i++;
    L53:
        int[] r114 = this.e;
        if (r103 < r114.length) goto L57;
        this.j = true;
    L57:
        if (this.i < r114.length) goto L69;
        this.j = true;
        this.i = r114.length - 1;
        return;
    L69:
        return;
    L49:
        this.f[r02] = this.h;
        this.h = r02;
        goto L50
    L35:
        if (this.a >= r54.length) goto L43;
        int r57 = 0;
    L37:
        int[] r72 = this.e;
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

    @Override // defpackage.o6
    public final void j() {
        int r0 = this.h;
        int r1 = 0;
    L4:
        if (r0 == (-1)) goto L8;
        if (r1 >= this.a) goto L11;
        float[] r2 = this.g;
        r2[r0] = r2[r0] * (-1.0f);
        r0 = this.f[r0];
        r1 = r1 + 1;
        goto L4
    L11:
        return;
    }

    @Override // defpackage.o6
    public final int k() {
        return this.a;
    }

    public final String toString() {
        int r0 = this.h;
        String r1 = "";
        int r2 = 0;
    L4:
        if (r0 == (-1)) goto L8;
        if (r2 >= this.a) goto L8;
        r1 = (z30.i(r1, " -> ") + this.g[r0] + " : ") + ((a40[]) this.c.d)[this.e[r0]];
        r0 = this.f[r0];
        r2 = r2 + 1;
    L8:
        return r1;
    }
}
