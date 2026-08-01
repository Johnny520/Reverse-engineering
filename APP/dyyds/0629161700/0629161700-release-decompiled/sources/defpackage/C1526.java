package defpackage;

/* JADX INFO: renamed from: ᛸᛷᛴᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1526 implements defpackage.InterfaceC1521 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f6735;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f6736;

    public /* synthetic */ C1526(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f6735 = r1
            r0.f6736 = r2
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC1521
    public final void accept(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f6735
            switch(r0) {
                case 0: goto L3a;
                default: goto L5;
            }
        L5:
            ᛴᲀᛷ r4 = (defpackage.C0748) r4
            java.lang.Object r0 = defpackage.AbstractC0604.f2990
            monitor-enter(r0)
            ᛸᲇᛲᛶ r1 = defpackage.AbstractC0604.f2989     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r2 = r3.f6736     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L1a
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            goto L37
        L1a:
            r3 = move-exception
            goto L38
        L1c:
            java.lang.Object r3 = r3.f6736     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1a
            r1.remove(r3)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            r3 = 0
        L25:
            int r0 = r2.size()
            if (r3 >= r0) goto L37
            java.lang.Object r0 = r2.get(r3)
            ᛸᛶᲈᛵ r0 = (defpackage.InterfaceC1521) r0
            r0.accept(r4)
            int r3 = r3 + 1
            goto L25
        L37:
            return
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r3
        L3a:
            ᛴᲀᛷ r4 = (defpackage.C0748) r4
            if (r4 != 0) goto L44
            ᛴᲀᛷ r4 = new ᛴᲀᛷ
            r0 = -3
            r4.<init>(r0)
        L44:
            java.lang.Object r3 = r3.f6736
            ᛴᛵᲇᲇ r3 = (defpackage.C0682) r3
            r3.m1561(r4)
            return
    }
}
