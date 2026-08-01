package defpackage;

/* JADX INFO: renamed from: ᛸᛳᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1451 implements defpackage.InterfaceC0843 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.concurrent.ScheduledFuture f6385;

    public C1451(java.util.concurrent.ScheduledFuture r1) {
            r0 = this;
            r0.<init>()
            r0.f6385 = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisposableFutureHandle["
            r0.<init>(r1)
            java.util.concurrent.ScheduledFuture r2 = r2.f6385
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC0843
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo1182() {
            r1 = this;
            java.util.concurrent.ScheduledFuture r1 = r1.f6385
            r0 = 0
            r1.cancel(r0)
            return
    }
}
