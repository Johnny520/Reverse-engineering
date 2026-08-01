package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b40 implements o6 {
    public int a;
    public final int[] b;
    public int[] c;
    public int[] d;
    public float[] e;
    public int[] f;
    public int[] g;
    public int h;
    public int i;
    public final zq j;
    public final a8 k;

    public b40(zq r3, a8 r4) {
        this.a = 16;
        this.b = new int[16];
        this.c = new int[16];
        this.d = new int[16];
        this.e = new float[16];
        this.f = new int[16];
        this.g = new int[16];
        this.h = 0;
        this.i = -1;
        this.j = r3;
        this.k = r4;
        clear();
    }

    @Override // defpackage.o6
    public final float a(int r5) {
        int r0 = this.h;
        int r1 = this.i;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L11;
        if (r2 == r5) goto L6;
        r1 = this.g[r1];
        if (r1 == (-1)) goto L16;
        r2 = r2 + 1;
        goto L3
    L16:
        return 0.0f;
    L6:
        return this.e[r1];
    L11:
        return 0.0f;
    }

    @Override // defpackage.o6
    public final float b(a40 r2) {
        int r22 = n(r2);
        if (r22 != (-1)) goto L5;
        return 0.0f;
    L5:
        return this.e[r22];
    }

    @Override // defpackage.o6
    public final boolean c(a40 r2) {
        if (n(r2) == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.o6
    public final void clear() {
        int r0 = this.h;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L8;
        a40 r3 = e(r2);
        if (r3 == null) goto L7;
        r3.b(this.j);
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        int r02 = 0;
    L10:
        if (r02 >= this.a) goto L12;
        this.d[r02] = -1;
        this.c[r02] = -1;
        r02 = r02 + 1;
        goto L10
    L12:
        int r03 = 0;
    L14:
        if (r03 >= 16) goto L16;
        this.b[r03] = -1;
        r03 = r03 + 1;
        goto L14
    L16:
        this.h = 0;
        this.i = -1;
    }

    @Override // defpackage.o6
    public final float d(a40 r8, boolean r9) {
        int r0 = n(r8);
        if (r0 != (-1)) goto L6;
        return 0.0f;
    L6:
        int r2 = r8.b;
        int r3 = r2 % 16;
        int[] r4 = this.b;
        int r5 = r4[r3];
        if (r5 != (-1)) goto L10;
    L21:
        float r22 = this.e[r0];
        if (this.i != r0) goto L24;
        this.i = this.g[r0];
    L24:
        this.d[r0] = -1;
        int[] r32 = this.f;
        int r42 = r32[r0];
        if (r42 == (-1)) goto L27;
        int[] r52 = this.g;
        r52[r42] = r52[r0];
    L27:
        int r43 = this.g[r0];
        if (r43 == (-1)) goto L30;
        r32[r43] = r32[r0];
    L30:
        this.h--;
        r8.k--;
        if (r9 == false) goto L33;
        r8.b(this.j);
    L33:
        return r22;
    L10:
        if (this.d[r5] != r2) goto L12;
        int[] r23 = this.c;
        r4[r3] = r23[r5];
        r23[r5] = -1;
    L12:
        int[] r33 = this.c;
        int r44 = r33[r5];
        if (r44 == (-1)) goto L17;
        if (this.d[r44] == r2) goto L17;
        r5 = r44;
    L17:
        if (r44 == (-1)) goto L21;
        if (this.d[r44] != r2) goto L21;
        r33[r5] = r33[r44];
        r33[r44] = -1;
        goto L21
    }

    @Override // defpackage.o6
    public final a40 e(int r7) {
        int r0 = this.h;
        if (r0 != 0) goto L5;
        return null;
    L5:
        int r2 = this.i;
        int r3 = 0;
    L6:
        if (r3 >= r0) goto L16;
        if (r3 != r7) goto L12;
        if (r2 == (-1)) goto L12;
        return ((a40[]) this.k.d)[this.d[r2]];
    L12:
        r2 = this.g[r2];
        if (r2 == (-1)) goto L16;
        r3 = r3 + 1;
    L16:
        return null;
    }

    @Override // defpackage.o6
    public final void f(a40 r6, float r7, boolean r8) {
        if (r7 > (-0.001f)) goto L5;
    L7:
        int r1 = n(r6);
        if (r1 != (-1)) goto L11;
        i(r6, r7);
        return;
    L11:
        float[] r3 = this.e;
        float r4 = r3[r1] + r7;
        r3[r1] = r4;
        if (r4 > (-0.001f)) goto L14;
        return;
    L14:
        if (r4 >= 0.001f) goto L18;
        r3[r1] = 0.0f;
        d(r6, r8);
        return;
    L18:
        return;
    L5:
        if (r7 >= 0.001f) goto L7;
    }

    @Override // defpackage.o6
    public final float g(p6 r8, boolean r9) {
        float r0 = b(r8.a);
        d(r8.a, r9);
        b40 r82 = (b40) r8.d;
        int r1 = r82.h;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r1) goto L8;
        int r4 = r82.d[r3];
        if (r4 == (-1)) goto L7;
        f(((a40[]) this.k.d)[r4], r82.e[r3] * r0, r9);
        r2 = r2 + 1;
    L7:
        r3 = r3 + 1;
        goto L3
    L8:
        return r0;
    }

    @Override // defpackage.o6
    public final void h(float r6) {
        int r0 = this.h;
        int r1 = this.i;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L8;
        float[] r3 = this.e;
        r3[r1] = r3[r1] / r6;
        r1 = this.g[r1];
        if (r1 == (-1)) goto L11;
        r2 = r2 + 1;
        goto L3
    L11:
        return;
    }

    @Override // defpackage.o6
    public final void i(a40 r9, float r10) {
        if (r10 > (-0.001f)) goto L5;
    L8:
        int r2 = 0;
        if (this.h != 0) goto L12;
        m(0, r9, r10);
        l(r9, 0);
        this.i = 0;
        return;
    L12:
        int r0 = n(r9);
        if (r0 == (-1)) goto L16;
        this.e[r0] = r10;
        return;
    L16:
        int r02 = this.h + 1;
        int r1 = this.a;
        if (r02 < r1) goto L22;
        int r12 = r1 * 2;
        this.d = Arrays.copyOf(this.d, r12);
        this.e = Arrays.copyOf(this.e, r12);
        this.f = Arrays.copyOf(this.f, r12);
        this.g = Arrays.copyOf(this.g, r12);
        this.c = Arrays.copyOf(this.c, r12);
        int r03 = this.a;
    L19:
        if (r03 >= r12) goto L21;
        this.d[r03] = -1;
        this.c[r03] = -1;
        r03 = r03 + 1;
        goto L19
    L21:
        this.a = r12;
    L22:
        int r04 = this.h;
        int r13 = this.i;
        int r4 = 0;
        int r5 = -1;
    L23:
        if (r4 >= r04) goto L35;
        int r6 = this.d[r13];
        int r7 = r9.b;
        if (r6 == r7) goto L26;
        if (r6 >= r7) goto L30;
        r5 = r13;
    L30:
        r13 = this.g[r13];
        if (r13 == (-1)) goto L35;
        r4 = r4 + 1;
        goto L23
    L26:
        this.e[r13] = r10;
        return;
    L35:
        if (r2 >= this.a) goto L40;
        if (this.d[r2] == (-1)) goto L41;
        r2 = r2 + 1;
    L41:
        m(r2, r9, r10);
        if (r5 == (-1)) goto L44;
        this.f[r2] = r5;
        int[] r102 = this.g;
        r102[r2] = r102[r5];
        r102[r5] = r2;
    L48:
        int r103 = this.g[r2];
        if (r103 == (-1)) goto L51;
        this.f[r103] = r2;
    L51:
        l(r9, r2);
        return;
    L44:
        this.f[r2] = -1;
        if (this.h <= 0) goto L47;
        this.g[r2] = this.i;
        this.i = r2;
        goto L48
    L47:
        this.g[r2] = -1;
        goto L48
    L40:
        r2 = -1;
        goto L41
    L5:
        if (r10 >= 0.001f) goto L8;
        d(r9, true);
    }

    @Override // defpackage.o6
    public final void j() {
        int r0 = this.h;
        int r1 = this.i;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L8;
        float[] r3 = this.e;
        r3[r1] = r3[r1] * (-1.0f);
        r1 = this.g[r1];
        if (r1 == (-1)) goto L11;
        r2 = r2 + 1;
        goto L3
    L11:
        return;
    }

    @Override // defpackage.o6
    public final int k() {
        return this.h;
    }

    public final void l(a40 r4, int r5) {
        int r42 = r4.b % 16;
        int[] r0 = this.b;
        int r1 = r0[r42];
        if (r1 != (-1)) goto L5;
        r0[r42] = r5;
    L9:
        this.c[r5] = -1;
        return;
    L5:
        int[] r43 = this.c;
        int r02 = r43[r1];
        if (r02 == (-1)) goto L8;
        r1 = r02;
        goto L5
    L8:
        r43[r1] = r5;
        goto L9
    }

    public final void m(int r3, a40 r4, float r5) {
        this.d[r3] = r4.b;
        this.e[r3] = r5;
        this.f[r3] = -1;
        this.g[r3] = -1;
        r4.a(this.j);
        r4.k++;
        this.h++;
    }

    public final int n(a40 r4) {
        if (this.h != 0) goto L5;
        return -1;
    L5:
        int r42 = r4.b;
        int[] r2 = this.b;
        int r0 = r2[r42 % 16];
        if (r0 != (-1)) goto L9;
        return -1;
    L9:
        if (this.d[r0] != r42) goto L11;
        return r0;
    L11:
        r0 = this.c[r0];
        if (r0 == (-1)) goto L16;
        if (this.d[r0] != r42) goto L11;
    L16:
        if (r0 != (-1)) goto L19;
        return -1;
    L19:
        if (this.d[r0] != r42) goto L21;
        return r0;
    L21:
        return -1;
    }

    public final String toString() {
        String r0 = hashCode() + " { ";
        int r1 = this.h;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L18;
        a40 r3 = e(r2);
        if (r3 == null) goto L16;
        String r02 = r0 + r3 + " = " + a(r2) + " ";
        int r32 = n(r3);
        String r03 = z30.i(r02, "[p: ");
        int r4 = this.f[r32];
        a8 r6 = this.k;
        if (r4 == (-1)) goto L10;
        String r04 = r03 + ((a40[]) r6.d)[this.d[this.f[r32]]];
    L11:
        String r05 = z30.i(r04, ", n: ");
        if (this.g[r32] == (-1)) goto L14;
        String r06 = r05 + ((a40[]) r6.d)[this.d[this.g[r32]]];
    L15:
        r0 = z30.i(r06, "]");
        goto L16
    L14:
        r06 = z30.i(r05, "none");
        goto L15
    L10:
        r04 = z30.i(r03, "none");
    L16:
        r2 = r2 + 1;
        goto L3
    L18:
        return z30.i(r0, " }");
    }
}
