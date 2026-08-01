package xhss;

/* JADX INFO: renamed from: xhss.ᲁᛳᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0942 extends xhss.AbstractRunnableC0130 {

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.Runnable f3059;

    public C0942(java.lang.Runnable r1, long r2, boolean r4) {
            r0 = this;
            r0.<init>(r2, r4)
            r0.f3059 = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r0 = this;
            java.lang.Runnable r0 = r0.f3059
            r0.run()
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Task["
            r0.<init>(r1)
            java.lang.Runnable r1 = r4.f3059
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            r2 = 64
            r0.append(r2)
            java.lang.String r1 = xhss.AbstractC0561.m1011(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            long r2 = r4.f588
            r0.append(r2)
            r0.append(r1)
            boolean r4 = r4.f589
            if (r4 == 0) goto L34
            java.lang.String r4 = "Blocking"
            goto L36
        L34:
            java.lang.String r4 = "Non-blocking"
        L36:
            r0.append(r4)
            r4 = 93
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
