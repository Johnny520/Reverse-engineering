package defpackage;

/* JADX INFO: renamed from: ᛱᲇᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0201 implements defpackage.InterfaceC1818 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f1270;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f1271;

    public /* synthetic */ C0201(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f1270 = r1
            r0.f1271 = r2
            r0.<init>()
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.f1270
            java.lang.Object r1 = r3.f1271
            r2 = 93
            switch(r0) {
                case 0: goto L41;
                case 1: goto L1d;
                default: goto L9;
            }
        L9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "DisposeOnCancel["
            r3.<init>(r0)
            ᛵᛲᲇᲇ r1 = (defpackage.InterfaceC0843) r1
            r3.append(r1)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            return r3
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CancelHandler.UserSupplied["
            r0.<init>(r1)
            java.lang.Class<ᛷᛷᲀᛳ> r1 = defpackage.C1316.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r3 = defpackage.AbstractC0762.m1681(r3)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            return r3
        L41:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "CancelFutureOnCancel["
            r3.<init>(r0)
            java.util.concurrent.ScheduledFuture r1 = (java.util.concurrent.ScheduledFuture) r1
            r3.append(r1)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            return r3
    }

    @Override // defpackage.InterfaceC1818
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void mo742(java.lang.Throwable r2) {
            r1 = this;
            int r0 = r1.f1270
            java.lang.Object r1 = r1.f1271
            switch(r0) {
                case 0: goto L13;
                case 1: goto Ld;
                default: goto L7;
            }
        L7:
            ᛵᛲᲇᲇ r1 = (defpackage.InterfaceC0843) r1
            r1.mo1182()
            return
        Ld:
            ᛷᛷᲀᛳ r1 = (defpackage.C1316) r1
            r1.mo617(r2)
            return
        L13:
            java.util.concurrent.ScheduledFuture r1 = (java.util.concurrent.ScheduledFuture) r1
            r2 = 0
            r1.cancel(r2)
            return
    }
}
