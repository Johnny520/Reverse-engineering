package defpackage;

/* JADX INFO: renamed from: ᛲᛵᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0294 extends defpackage.AbstractC1883 {
    @Override // defpackage.AbstractC1883
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void mo954(android.app.Activity r3, java.util.ArrayList r4, int r5) {
            r2 = this;
            boolean r3 = r4.isEmpty()
            r0 = 0
            if (r3 == 0) goto La
            java.lang.String[] r3 = new java.lang.String[r0]
            goto L25
        La:
            int r3 = r4.size()
            java.lang.String[] r3 = new java.lang.String[r3]
        L10:
            int r1 = r4.size()
            if (r0 >= r1) goto L25
            java.lang.Object r1 = r4.get(r0)
            ᲁᛱᛲᛳ r1 = (defpackage.AbstractC1793) r1
            java.lang.String r1 = r1.mo1205()
            r3[r0] = r1
            int r0 = r0 + 1
            goto L10
        L25:
            ᛵᛳᲀ r2 = r2.f8173
            r2.requestPermissions(r3, r5)     // Catch: java.lang.Exception -> L2b
            goto L47
        L2b:
            r0 = move-exception
            r0.printStackTrace()
            android.app.Activity r2 = r2.getActivity()
            boolean r0 = r2 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L38
            goto L47
        L38:
            boolean r0 = defpackage.AbstractC1592.m2874(r2)
            if (r0 == 0) goto L3f
            goto L47
        L3f:
            r2.requestPermissions(r3, r5)     // Catch: java.lang.Exception -> L43
            goto L47
        L43:
            r2 = move-exception
            r2.printStackTrace()
        L47:
            defpackage.AbstractC2363.m3864(r4)
            return
    }

    @Override // defpackage.AbstractC1883
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void mo955(int r3) {
            r2 = this;
            ᛵᛳᲀ r0 = r2.f8173
            android.os.Bundle r0 = r0.getArguments()
            if (r0 != 0) goto La
            r0 = 0
            goto L10
        La:
            java.lang.String r1 = "request_code"
            int r0 = r0.getInt(r1)
        L10:
            if (r3 == r0) goto L13
            return
        L13:
            java.util.ArrayList r0 = defpackage.AbstractC1871.f8126
            java.lang.Class<ᲁᛶᛵᛲ> r0 = defpackage.AbstractC1871.class
            monitor-enter(r0)
            java.util.ArrayList r1 = defpackage.AbstractC1871.f8126     // Catch: java.lang.Throwable -> L26
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L26
            r1.remove(r3)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            r2.m3292()
            return
        L26:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r2
    }
}
