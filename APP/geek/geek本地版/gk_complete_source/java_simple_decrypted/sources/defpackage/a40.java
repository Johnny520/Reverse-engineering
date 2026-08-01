package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a40 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public float e;
    public boolean f;
    public final float[] g;
    public final float[] h;
    public p6[] i;
    public int j;
    public int k;
    public int l;

    public a40(int r4) {
        this.b = -1;
        this.c = -1;
        this.d = 0;
        this.f = false;
        this.g = new float[9];
        this.h = new float[9];
        this.i = new p6[16];
        this.j = 0;
        this.k = 0;
        this.l = r4;
    }

    public final void a(p6 r4) {
        int r0 = 0;
    L3:
        int r1 = this.j;
        if (r0 >= r1) goto L9;
        if (this.i[r0] == r4) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        return;
    L9:
        p6[] r02 = this.i;
        if (r1 < r02.length) goto L12;
        this.i = (p6[]) Arrays.copyOf(r02, r02.length * 2);
    L12:
        p6[] r03 = this.i;
        int r12 = this.j;
        r03[r12] = r4;
        this.j = r12 + 1;
    }

    public final void b(p6 r5) {
        int r0 = this.j;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L12;
        if (this.i[r1] == r5) goto L7;
        r1 = r1 + 1;
    L7:
        if (r1 >= (r0 - 1)) goto L9;
        p6[] r52 = this.i;
        int r2 = r1 + 1;
        r52[r1] = r52[r2];
        r1 = r2;
        goto L7
    L9:
        this.j--;
        return;
    }

    public final void c() {
        this.l = 5;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.f = false;
        int r2 = this.j;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        this.i[r3] = null;
        r3 = r3 + 1;
        goto L3
    L5:
        this.j = 0;
        this.k = 0;
        this.a = false;
        Arrays.fill(this.h, 0.0f);
    }

    public final void d(p6 r5) {
        int r0 = this.j;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        this.i[r2].h(r5, false);
        r2 = r2 + 1;
        goto L3
    L5:
        this.j = 0;
    }

    public final String toString() {
        return "" + this.b;
    }
}
