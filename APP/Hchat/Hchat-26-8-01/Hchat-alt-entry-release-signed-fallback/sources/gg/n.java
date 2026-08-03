package gg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends gg.p implements mg.d, fg.l {
    public n(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r5 = 1
            gg.c r1 = gg.c.f4547g
            java.lang.Class<f2.w> r2 = f2.w.class
            r0 = r6
            r3 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // gg.d
    public final mg.a e() {
            r1 = this;
            gg.w r0 = gg.v.f4565a
            r0.getClass()
            return r1
    }

    public final void h() {
            r2 = this;
            boolean r0 = r2.f4559m
            if (r0 != 0) goto L1a
            mg.a r0 = r2.g()
            if (r0 == r2) goto L12
            mg.d r0 = (mg.d) r0
            gg.n r0 = (gg.n) r0
            r0.h()
            return
        L12:
            eg.a r0 = new eg.a
            java.lang.String r1 = "Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath"
            r0.<init>(r1)
            throw r0
        L1a:
            java.lang.String r0 = "Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980"
            j8.o.w(r0)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            r0.h()
            r1 = 0
            throw r1
    }
}
