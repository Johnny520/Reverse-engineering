package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Ql */
/* JADX INFO: loaded from: classes.dex */
public final class C0716Ql extends AbstractC1507hm {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2301f = AtomicIntegerFieldUpdater.newUpdater(C0716Ql.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: e */
    public final C1463gm f2302e;

    public C0716Ql(C1463gm c1463gm) {
        this.f2302e = c1463gm;
    }

    @Override // p000.AbstractC1507hm
    /* JADX INFO: renamed from: j */
    public final boolean mo1505j() {
        return true;
    }

    @Override // p000.AbstractC1507hm
    /* JADX INFO: renamed from: k */
    public final void mo1506k(Throwable th) {
        if (f2301f.compareAndSet(this, 0, 1)) {
            this.f2302e.mo90g(th);
        }
    }
}
