package defpackage;

/* JADX INFO: renamed from: ᛷᛸᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1340 extends defpackage.AbstractRunnableC1247 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Runnable f5918;

    public C1340(java.lang.Runnable r1, long r2, boolean r4) {
            r0 = this;
            r0.<init>(r2, r4)
            r0.f5918 = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r0 = this;
            java.lang.Runnable r0 = r0.f5918
            r0.run()
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Task["
            r0.<init>(r1)
            java.lang.Runnable r1 = r4.f5918
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            r2 = 64
            r0.append(r2)
            java.lang.String r1 = defpackage.AbstractC0762.m1681(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            long r2 = r4.f5577
            r0.append(r2)
            r0.append(r1)
            boolean r4 = r4.f5576
            if (r4 == 0) goto L34
            java.lang.String r4 = "Blocking"
            goto L36
        L34:
            java.lang.String r4 = "Non-blocking"
        L36:
            r1 = 93
            java.lang.String r4 = defpackage.AbstractC0225.m823(r0, r4, r1)
            return r4
    }
}
