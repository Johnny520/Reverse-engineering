package defpackage;

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
    public defpackage.p6[] i;
    public int j;
    public int k;
    public int l;

    public a40(int r4) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.b = r0
            r3.c = r0
            r0 = 0
            r3.d = r0
            r3.f = r0
            r1 = 9
            float[] r2 = new float[r1]
            r3.g = r2
            float[] r1 = new float[r1]
            r3.h = r1
            r1 = 16
            p6[] r1 = new defpackage.p6[r1]
            r3.i = r1
            r3.j = r0
            r3.k = r0
            r3.l = r4
            return
    }

    public final void a(defpackage.p6 r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.j
            if (r0 >= r1) goto Lf
            p6[] r1 = r3.i
            r1 = r1[r0]
            if (r1 != r4) goto Lc
            return
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            p6[] r0 = r3.i
            int r2 = r0.length
            if (r1 < r2) goto L1f
            int r1 = r0.length
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            p6[] r0 = (defpackage.p6[]) r0
            r3.i = r0
        L1f:
            p6[] r0 = r3.i
            int r1 = r3.j
            r0[r1] = r4
            int r1 = r1 + 1
            r3.j = r1
            return
    }

    public final void b(defpackage.p6 r5) {
            r4 = this;
            int r0 = r4.j
            r1 = 0
        L3:
            if (r1 >= r0) goto L23
            p6[] r2 = r4.i
            r2 = r2[r1]
            if (r2 != r5) goto L20
        Lb:
            int r5 = r0 + (-1)
            if (r1 >= r5) goto L19
            p6[] r5 = r4.i
            int r2 = r1 + 1
            r3 = r5[r2]
            r5[r1] = r3
            r1 = r2
            goto Lb
        L19:
            int r5 = r4.j
            int r5 = r5 + (-1)
            r4.j = r5
            return
        L20:
            int r1 = r1 + 1
            goto L3
        L23:
            return
    }

    public final void c() {
            r6 = this;
            r0 = 5
            r6.l = r0
            r0 = 0
            r6.d = r0
            r1 = -1
            r6.b = r1
            r6.c = r1
            r1 = 0
            r6.e = r1
            r6.f = r0
            int r2 = r6.j
            r3 = r0
        L13:
            if (r3 >= r2) goto L1d
            p6[] r4 = r6.i
            r5 = 0
            r4[r3] = r5
            int r3 = r3 + 1
            goto L13
        L1d:
            r6.j = r0
            r6.k = r0
            r6.a = r0
            float[] r0 = r6.h
            java.util.Arrays.fill(r0, r1)
            return
    }

    public final void d(defpackage.p6 r5) {
            r4 = this;
            int r0 = r4.j
            r1 = 0
            r2 = r1
        L4:
            if (r2 >= r0) goto L10
            p6[] r3 = r4.i
            r3 = r3[r2]
            r3.h(r5, r1)
            int r2 = r2 + 1
            goto L4
        L10:
            r4.j = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
