package Yue;

import java.util.concurrent.TimeUnit;
import net.bytebuddy.implementation.MethodDelegation;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4108 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final C7030 f671;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4108(@InterfaceC6399 C7030 c7030) {
        C5499.m17103(c7030, MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX);
        this.f671 = c7030;
    }

    /* JADX INFO: renamed from: ۥ */
    public final int m1067() {
        return this.f671.m21879();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m1068() {
        this.f671.m21880();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C7030 m11697() {
        return this.f671;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m11698() {
        return this.f671.m21881();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4108(int i, long j, @InterfaceC6399 TimeUnit timeUnit) {
        this(new C7030(C7733.f23262, i, j, timeUnit));
        C5499.m17103(timeUnit, "timeUnit");
    }

    public C4108() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
