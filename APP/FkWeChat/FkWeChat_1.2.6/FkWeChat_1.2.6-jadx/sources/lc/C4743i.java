package lc;

import ec.AbstractC2181s0;

/* JADX INFO: renamed from: lc.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4743i extends AbstractRunnableC4742h {

    /* JADX INFO: renamed from: s */
    public final Runnable f14057s;

    public C4743i(Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f14057s = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f14057s.run();
    }

    public String toString() {
        return "Task[" + AbstractC2181s0.m7898a(this.f14057s) + '@' + AbstractC2181s0.m7899b(this.f14057s) + ", " + this.f14055q + ", " + AbstractC4744j.m18980c(this.f14056r) + ']';
    }
}
