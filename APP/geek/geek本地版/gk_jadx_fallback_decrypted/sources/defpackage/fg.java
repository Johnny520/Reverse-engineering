package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fg implements java.util.Iterator {
    public int a;
    public int b;
    public int c;
    public defpackage.hp d;
    public final /* synthetic */ defpackage.gg e;

    public fg(defpackage.gg r2) {
            r1 = this;
            r1.<init>()
            r1.e = r2
            r0 = -1
            r1.a = r0
            java.lang.Object r2 = r2.b
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            r0 = 0
            int r2 = defpackage.gt.e(r0, r2)
            r1.b = r2
            r1.c = r2
            return
    }

    public final void a() {
            r7 = this;
            gg r0 = r7.e
            java.lang.Object r1 = r0.b
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r2 = r7.c
            r3 = 0
            if (r2 >= 0) goto L11
            r7.a = r3
            r0 = 0
            r7.d = r0
            return
        L11:
            int r4 = r1.length()
            r5 = -1
            r6 = 1
            if (r2 <= r4) goto L29
            hp r0 = new hp
            int r2 = r7.b
            int r1 = defpackage.b50.D(r1)
            r0.<init>(r2, r1, r6)
            r7.d = r0
            r7.c = r5
            goto L77
        L29:
            java.lang.Object r0 = r0.c
            oh r0 = (defpackage.oh) r0
            int r2 = r7.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.e(r1, r2)
            kx r0 = (defpackage.kx) r0
            if (r0 != 0) goto L4b
            hp r0 = new hp
            int r2 = r7.b
            int r1 = defpackage.b50.D(r1)
            r0.<init>(r2, r1, r6)
            r7.d = r0
            r7.c = r5
            goto L77
        L4b:
            java.lang.Object r1 = r0.a
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r7.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 > r4) goto L64
            hp r2 = defpackage.hp.d
            goto L6c
        L64:
            hp r4 = new hp
            int r5 = r1 + (-1)
            r4.<init>(r2, r5, r6)
            r2 = r4
        L6c:
            r7.d = r2
            int r1 = r1 + r0
            r7.b = r1
            if (r0 != 0) goto L74
            r3 = r6
        L74:
            int r1 = r1 + r3
            r7.c = r1
        L77:
            r7.a = r6
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.a
            r1 = -1
            if (r0 != r1) goto L8
            r2.a()
        L8:
            int r0 = r2.a
            r1 = 1
            if (r0 != r1) goto Le
            return r1
        Le:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.a
            r1 = -1
            if (r0 != r1) goto L8
            r3.a()
        L8:
            int r0 = r3.a
            if (r0 == 0) goto L19
            hp r0 = r3.d
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.ranges.IntRange"
            defpackage.ip.m(r2, r0)
            r2 = 0
            r3.d = r2
            r3.a = r1
            return r0
        L19:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
