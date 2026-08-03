package Yue;

import Yue.C3229;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4714 extends AbstractC4232 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public long f10077;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f10078;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6489
    public C3395<AbstractC4419<?>> f10079;

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static /* synthetic */ void m14076(AbstractC4714 abstractC4714, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC4714.m14079(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static /* synthetic */ void m14077(AbstractC4714 abstractC4714, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC4714.m14083(z);
    }

    @Override // Yue.AbstractC4232
    @InterfaceC6399
    public final AbstractC4232 limitedParallelism(int i) {
        C5699.m2376(i);
        return this;
    }

    public void shutdown() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m14078() {
        return this.f10077 > 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public final void m14079(boolean z) {
        long jM14080 = this.f10077 - m14080(z);
        this.f10077 = jM14080;
        if (jM14080 <= 0 && this.f10078) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public final long m14080(boolean z) {
        if (z) {
            return C3229.C3230.f4962;
        }
        return 1L;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final void m14081(@InterfaceC6399 AbstractC4419<?> abstractC4419) {
        C3395<AbstractC4419<?>> c3395 = this.f10079;
        if (c3395 == null) {
            c3395 = new C3395<>();
            this.f10079 = c3395;
        }
        c3395.m482(abstractC4419);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public long mo14082() {
        C3395<AbstractC4419<?>> c3395 = this.f10079;
        return (c3395 == null || c3395.m7011()) ? Long.MAX_VALUE : 0L;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public final void m14083(boolean z) {
        this.f10077 += m14080(z);
        if (z) {
            return;
        }
        this.f10078 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public boolean mo14084() {
        return m14086();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public final boolean m14085() {
        return this.f10077 >= m14080(true);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public final boolean m14086() {
        C3395<AbstractC4419<?>> c3395 = this.f10079;
        if (c3395 != null) {
            return c3395.m7011();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public long mo14087() {
        return !m14088() ? Long.MAX_VALUE : 0L;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public final boolean m14088() {
        AbstractC4419<?> abstractC4419M7012;
        C3395<AbstractC4419<?>> c3395 = this.f10079;
        if (c3395 == null || (abstractC4419M7012 = c3395.m7012()) == null) {
            return false;
        }
        abstractC4419M7012.run();
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public boolean m14089() {
        return false;
    }
}
