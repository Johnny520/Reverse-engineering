package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m6 {
    public defpackage.ts a;
    public defpackage.ts b;
    public defpackage.vs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ m6(int r1, java.lang.Object r2) {
            r0 = this;
            r0.d = r1
            r0.e = r2
            r0.<init>()
            return
    }

    public static boolean h(java.util.Set r2, java.lang.Object r3) {
            if (r2 != r3) goto L3
            goto L19
        L3:
            boolean r0 = r3 instanceof java.util.Set
            if (r0 == 0) goto L1b
            java.util.Set r3 = (java.util.Set) r3
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L1b
            int r1 = r3.size()     // Catch: java.lang.Throwable -> L1b
            if (r0 != r1) goto L1b
            boolean r2 = r2.containsAll(r3)     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1b
        L19:
            r2 = 1
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public final void a() {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.e
            q6 r0 = (defpackage.q6) r0
            r0.clear()
            return
        Ld:
            java.lang.Object r0 = r1.e
            n6 r0 = (defpackage.n6) r0
            r0.clear()
            return
    }

    public final java.lang.Object b(int r2, int r3) {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r3 = r1.e
            q6 r3 = (defpackage.q6) r3
            java.lang.Object[] r3 = r3.b
            r2 = r3[r2]
            return r2
        Le:
            java.lang.Object r0 = r1.e
            n6 r0 = (defpackage.n6) r0
            java.lang.Object[] r0 = r0.b
            int r2 = r2 << 1
            int r2 = r2 + r3
            r2 = r0[r2]
            return r2
    }

    public final java.util.Map c() {
            r2 = this;
            int r0 = r2.d
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "not a map"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.Object r0 = r2.e
            n6 r0 = (defpackage.n6) r0
            return r0
    }

    public final int d() {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.e
            q6 r0 = (defpackage.q6) r0
            int r0 = r0.c
            return r0
        Lc:
            java.lang.Object r0 = r1.e
            n6 r0 = (defpackage.n6) r0
            int r0 = r0.c
            return r0
    }

    public final int e(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.d
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.e
            q6 r0 = (defpackage.q6) r0
            if (r3 != 0) goto L10
            int r3 = r0.d()
            goto L18
        L10:
            int r1 = r3.hashCode()
            int r3 = r0.c(r1, r3)
        L18:
            return r3
        L19:
            java.lang.Object r0 = r2.e
            n6 r0 = (defpackage.n6) r0
            int r3 = r0.e(r3)
            return r3
    }

    public final int f(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.d
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.e
            q6 r0 = (defpackage.q6) r0
            if (r3 != 0) goto L10
            int r3 = r0.d()
            goto L18
        L10:
            int r1 = r3.hashCode()
            int r3 = r0.c(r1, r3)
        L18:
            return r3
        L19:
            java.lang.Object r0 = r2.e
            n6 r0 = (defpackage.n6) r0
            int r3 = r0.g(r3)
            return r3
    }

    public final void g(int r2) {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.e
            q6 r0 = (defpackage.q6) r0
            r0.e(r2)
            return
        Ld:
            java.lang.Object r0 = r1.e
            n6 r0 = (defpackage.n6) r0
            r0.i(r2)
            return
    }

    public final java.lang.Object[] i(java.lang.Object[] r4, int r5) {
            r3 = this;
            int r0 = r3.d()
            int r1 = r4.length
            if (r1 >= r0) goto L15
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
        L15:
            r1 = 0
        L16:
            if (r1 >= r0) goto L21
            java.lang.Object r2 = r3.b(r1, r5)
            r4[r1] = r2
            int r1 = r1 + 1
            goto L16
        L21:
            int r5 = r4.length
            if (r5 <= r0) goto L27
            r5 = 0
            r4[r0] = r5
        L27:
            return r4
    }
}
