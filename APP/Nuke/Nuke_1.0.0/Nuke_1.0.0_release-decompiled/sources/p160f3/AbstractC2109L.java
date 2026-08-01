package p160f3;

import p061L2.C0971k;

/* JADX INFO: renamed from: f3.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2109L extends AbstractC2153p {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f7042i = 0;

    /* JADX INFO: renamed from: f */
    public long f7043f;

    /* JADX INFO: renamed from: g */
    public boolean f7044g;

    /* JADX INFO: renamed from: h */
    public C0971k f7045h;

    /* JADX INFO: renamed from: G */
    public final void m3898G(boolean z5) {
        long j5 = this.f7043f - (z5 ? 4294967296L : 1L);
        this.f7043f = j5;
        if (j5 <= 0 && this.f7044g) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m3899H(AbstractC2099B abstractC2099B) {
        C0971k c0971k = this.f7045h;
        if (c0971k == null) {
            c0971k = new C0971k();
            this.f7045h = c0971k;
        }
        c0971k.addLast(abstractC2099B);
    }

    /* JADX INFO: renamed from: I */
    public abstract Thread mo3900I();

    /* JADX INFO: renamed from: J */
    public final void m3901J(boolean z5) {
        this.f7043f = (z5 ? 4294967296L : 1L) + this.f7043f;
        if (z5) {
            return;
        }
        this.f7044g = true;
    }

    /* JADX INFO: renamed from: K */
    public abstract long mo3890K();

    /* JADX INFO: renamed from: L */
    public final boolean m3902L() {
        C0971k c0971k = this.f7045h;
        if (c0971k == null) {
            return false;
        }
        AbstractC2099B abstractC2099B = (AbstractC2099B) (c0971k.isEmpty() ? null : c0971k.removeFirst());
        if (abstractC2099B == null) {
            return false;
        }
        abstractC2099B.run();
        return true;
    }

    /* JADX INFO: renamed from: M */
    public void mo3903M(long j5, AbstractRunnableC2106I abstractRunnableC2106I) {
        RunnableC2163w.f7120m.m3895R(j5, abstractRunnableC2106I);
    }

    public abstract void shutdown();
}
