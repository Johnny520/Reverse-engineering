package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e8 implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final int b;
    public final java.lang.Object c;

    public /* synthetic */ e8(java.lang.Object r1, int r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.c = r1
            r0.b = r2
            r0.<init>()
            return
    }

    public e8(java.util.List r1, int r2, java.lang.Throwable r3) {
            r0 = this;
            r3 = 1
            r0.a = r3
            r0.<init>()
            java.lang.String r3 = "initCallbacks cannot be null"
            defpackage.zt.f(r3, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            r0.c = r3
            r0.b = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto L4d;
                case 1: goto L22;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r5.c
            ut r0 = (defpackage.ut) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.Y
            boolean r1 = r0.u
            if (r1 == 0) goto L10
            goto L21
        L10:
            nz r1 = r0.l
            if (r1 != 0) goto L1c
            java.lang.String r0 = "RecyclerView"
            java.lang.String r1 = "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r0, r1)
            goto L21
        L1c:
            int r2 = r5.b
            r1.v0(r0, r2)
        L21:
            return
        L22:
            java.lang.Object r0 = r5.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            int r2 = r5.b
            r3 = 1
            r4 = 0
            if (r2 == r3) goto L3e
        L30:
            if (r4 >= r1) goto L4c
            java.lang.Object r2 = r0.get(r4)
            ci r2 = (defpackage.ci) r2
            r2.getClass()
            int r4 = r4 + 1
            goto L30
        L3e:
            if (r4 >= r1) goto L4c
            java.lang.Object r2 = r0.get(r4)
            ci r2 = (defpackage.ci) r2
            r2.a()
            int r4 = r4 + 1
            goto L3e
        L4c:
            return
        L4d:
            java.lang.Object r0 = r5.c
            l0 r0 = (defpackage.l0) r0
            java.lang.Object r0 = r0.b
            zt r0 = (defpackage.zt) r0
            if (r0 == 0) goto L5c
            int r1 = r5.b
            r0.I(r1)
        L5c:
            return
    }
}
