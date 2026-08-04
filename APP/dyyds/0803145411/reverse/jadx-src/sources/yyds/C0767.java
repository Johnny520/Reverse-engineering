package yyds;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: yyds.ᛴᛱᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0767 implements InterfaceC0970 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ScheduledFuture f3540;

    public C0767(ScheduledFuture scheduledFuture) {
        this.f3540 = scheduledFuture;
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f3540 + ']';
    }

    @Override // yyds.InterfaceC0970
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void mo1720() {
        this.f3540.cancel(false);
    }
}
