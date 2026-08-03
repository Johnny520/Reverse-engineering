package Yue;

import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥۡۧ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7186 extends RuntimeException {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final IOException f21677;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public IOException f21678;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7186(@InterfaceC6399 IOException iOException) {
        super(iOException);
        C5499.m17103(iOException, "firstConnectException");
        this.f21677 = iOException;
        this.f21678 = iOException;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m3472(@InterfaceC6399 IOException iOException) {
        C5499.m17103(iOException, "e");
        C4741.m1656(this.f21677, iOException);
        this.f21678 = iOException;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final IOException m3473() {
        return this.f21677;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final IOException m22509() {
        return this.f21678;
    }
}
