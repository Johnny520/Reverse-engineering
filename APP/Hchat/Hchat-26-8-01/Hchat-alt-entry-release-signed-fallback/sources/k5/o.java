package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends i5.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k5.u f7243j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f7244k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k5.n f7245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f7246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7247n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7248o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7249p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f7250q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f7251r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7252s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f7253t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public o5.e f7254u;

    public o(k5.u r4, int r5, int r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f7247n = r0
            r3.f7248o = r0
            r3.f7249p = r0
            r3.f7243j = r4
            r3.f7244k = r5
            androidx.lifecycle.x r1 = r4.f7263a
            int r5 = r5 + 24
            int r5 = r1.N(r5)
            if (r5 != 0) goto L24
            r4 = -1
            r3.f7246m = r4
            r3.f7250q = r0
            r3.f7251r = r0
            r3.f7252s = r0
            r3.f7253t = r0
            goto L4b
        L24:
            androidx.lifecycle.x r4 = r4.f7264b
            r4.getClass()
            a5.a r1 = new a5.a
            r2 = 5
            r1.<init>(r5, r2, r4)
            int r4 = r1.o(r0)
            r3.f7250q = r4
            int r4 = r1.o(r0)
            r3.f7251r = r4
            int r4 = r1.o(r0)
            r3.f7252s = r4
            int r4 = r1.o(r0)
            r3.f7253t = r4
            int r4 = r1.f56h
            r3.f7246m = r4
        L4b:
            if (r6 == 0) goto L55
            k5.n r4 = new k5.n
            r4.<init>(r3, r6)
            r3.f7245l = r4
            return
        L55:
            r4 = 0
            r3.f7245l = r4
            return
    }

    public final o5.e e1() {
            r3 = this;
            o5.e r0 = r3.f7254u
            if (r0 != 0) goto L1d
            k5.u r0 = r3.f7243j
            androidx.lifecycle.x r1 = r0.f7263a
            int r2 = r3.f7244k
            int r2 = r2 + 20
            int r1 = r1.N(r2)
            if (r1 != 0) goto L15
            o5.a r0 = o5.e.f9510a
            goto L1b
        L15:
            o5.d r2 = new o5.d
            r2.<init>(r0, r1)
            r0 = r2
        L1b:
            r3.f7254u = r0
        L1d:
            o5.e r0 = r3.f7254u
            return r0
    }

    public final java.lang.Iterable f1(boolean r12) {
            r11 = this;
            int r0 = r11.f7252s
            if (r0 <= 0) goto L37
            k5.u r0 = r11.f7243j
            androidx.lifecycle.x r0 = r0.f7264b
            int r4 = r11.g1()
            r0.getClass()
            o5.e r3 = r11.e1()
            k5.n r6 = r11.f7245l
            if (r6 != 0) goto L1a
            r0 = 0
            r5 = r0
            goto L2e
        L1a:
            k5.l r5 = new k5.l
            java.lang.Object r0 = r6.f7242l
            k5.o r0 = (k5.o) r0
            k5.u r1 = r0.f7243j
            androidx.lifecycle.x r7 = r1.f7264b
            int r8 = r6.d()
            int r9 = r0.f7252s
            r10 = 2
            r5.<init>(r6, r7, r8, r9, r10)
        L2e:
            k5.i r1 = new k5.i
            r7 = 1
            r2 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L37:
            r2 = r11
            int r12 = r2.f7248o
            if (r12 <= 0) goto L3e
            r2.f7249p = r12
        L3e:
            java.util.Set r12 = java.util.Collections.EMPTY_SET
            return r12
    }

    public final int g1() {
            r4 = this;
            int r0 = r4.f7248o
            if (r0 <= 0) goto L5
            return r0
        L5:
            k5.u r0 = r4.f7243j
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r4.h1()
            r0.getClass()
            a5.a r2 = new a5.a
            r3 = 5
            r2.<init>(r1, r3, r0)
            r0 = 0
        L17:
            int r1 = r4.f7251r
            if (r0 >= r1) goto L24
            r2.q()
            r2.q()
            int r0 = r0 + 1
            goto L17
        L24:
            int r0 = r2.f56h
            r4.f7248o = r0
            return r0
    }

    @Override // v5.c
    public final java.lang.String getType() {
            r3 = this;
            k5.u r0 = r3.f7243j
            k5.s r1 = r0.f7281s
            androidx.lifecycle.x r0 = r0.f7263a
            int r2 = r3.f7244k
            int r0 = r0.N(r2)
            java.lang.String r0 = r1.b(r0)
            return r0
    }

    public final int h1() {
            r4 = this;
            int r0 = r4.f7247n
            if (r0 <= 0) goto L5
            return r0
        L5:
            k5.u r0 = r4.f7243j
            androidx.lifecycle.x r0 = r0.f7264b
            r0.getClass()
            a5.a r1 = new a5.a
            r2 = 5
            int r3 = r4.f7246m
            r1.<init>(r3, r2, r0)
            r0 = 0
        L15:
            int r2 = r4.f7250q
            if (r0 >= r2) goto L22
            r1.q()
            r1.q()
            int r0 = r0 + 1
            goto L15
        L22:
            int r0 = r1.f56h
            r4.f7247n = r0
            return r0
    }

    public final java.lang.Iterable i1(boolean r11) {
            r10 = this;
            int r0 = r10.f7253t
            if (r0 <= 0) goto L7a
            k5.u r0 = r10.f7243j
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r10.f7249p
            r2 = 0
            if (r1 <= 0) goto Lf
        Ld:
            r6 = r1
            goto L32
        Lf:
            int r1 = r10.g1()
            r0.getClass()
            a5.a r3 = new a5.a
            r4 = 5
            r3.<init>(r1, r4, r0)
            r1 = r2
        L1d:
            int r4 = r10.f7252s
            if (r1 >= r4) goto L2d
            r3.q()
            r3.q()
            r3.q()
            int r1 = r1 + 1
            goto L1d
        L2d:
            int r1 = r3.f56h
            r10.f7249p = r1
            goto Ld
        L32:
            r0.getClass()
            o5.e r5 = r10.e1()
            k5.n r0 = r10.f7245l
            if (r0 != 0) goto L40
            r0 = 0
            r7 = r0
            goto L72
        L40:
            k5.m r1 = new k5.m
            java.lang.Object r3 = r0.f7242l
            k5.o r3 = (k5.o) r3
            k5.u r4 = r3.f7243j
            androidx.lifecycle.x r4 = r4.f7264b
            int r7 = r0.f7241k
            if (r7 != 0) goto L6a
            int r7 = r0.d()
            r4.getClass()
            a5.a r8 = new a5.a
            r9 = 5
            r8.<init>(r7, r9, r4)
            r7 = r2
        L5c:
            int r9 = r3.f7252s
            if (r7 >= r9) goto L66
            r8.o(r2)
            int r7 = r7 + 1
            goto L5c
        L66:
            int r2 = r8.f56h
            r0.f7241k = r2
        L6a:
            int r0 = r0.f7241k
            int r2 = r3.f7253t
            r1.<init>(r4, r0, r2)
            r7 = r1
        L72:
            k5.k r3 = new k5.k
            r4 = r10
            r8 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L7a:
            java.util.Set r11 = java.util.Collections.EMPTY_SET
            return r11
    }
}
