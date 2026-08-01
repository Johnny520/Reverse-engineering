package defpackage;

/* JADX INFO: renamed from: ᛲᛴᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0283 extends defpackage.C2073 {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.Object f1565;

    public C0283(int r2) {
            r1 = this;
            r0 = 6
            r1.<init>(r2, r0)
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.f1565 = r2
            return
    }

    @Override // defpackage.C2073, defpackage.InterfaceC1398
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object mo913() {
            r1 = this;
            java.lang.Object r0 = r1.f1565
            monitor-enter(r0)
            java.lang.Object r1 = super.mo913()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // defpackage.C2073, defpackage.InterfaceC1398
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean mo914(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.f1565
            monitor-enter(r0)
            boolean r1 = super.mo914(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
