package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: kj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0413kj extends AbstractC0408ke {

    /* JADX INFO: renamed from: c */
    public long f2904c;

    /* JADX INFO: renamed from: d */
    public boolean f2905d;

    /* JADX INFO: renamed from: e */
    public C0400k6 f2906e;

    /* JADX INFO: renamed from: f */
    public final void m1701f() {
        long j = this.f2904c - 4294967296L;
        this.f2904c = j;
        if (j <= 0 && this.f2905d) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract Thread mo1695j();

    /* JADX INFO: renamed from: k */
    public final void m1702k(boolean z) {
        this.f2904c = (z ? 4294967296L : 1L) + this.f2904c;
        if (z) {
            return;
        }
        this.f2905d = true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1703l() throws IllegalAccessException, InvocationTargetException {
        C0400k6 c0400k6 = this.f2906e;
        if (c0400k6 == null) {
            return false;
        }
        AbstractC0818vg abstractC0818vg = (AbstractC0818vg) (c0400k6.isEmpty() ? null : c0400k6.removeFirst());
        if (abstractC0818vg == null) {
            return false;
        }
        abstractC0818vg.run();
        return true;
    }

    /* JADX INFO: renamed from: m */
    public void mo1696m(long j, AbstractRunnableC0300hj abstractRunnableC0300hj) {
        RunnableC0409kf.f2886i.m1603r(j, abstractRunnableC0300hj);
    }

    public abstract void shutdown();
}
