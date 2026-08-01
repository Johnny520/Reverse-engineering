package p160f3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p000A.C0009E0;

/* JADX INFO: renamed from: f3.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C2114Q extends AbstractC2118V {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7048i = AtomicIntegerFieldUpdater.newUpdater(C2114Q.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX INFO: renamed from: h */
    public final C0009E0 f7049h;

    public C2114Q(C0009E0 c0009e0) {
        this.f7049h = c0009e0;
    }

    @Override // p160f3.AbstractC2118V
    /* JADX INFO: renamed from: k */
    public final boolean mo3884k() {
        return true;
    }

    @Override // p160f3.AbstractC2118V
    /* JADX INFO: renamed from: l */
    public final void mo3885l(Throwable th) {
        if (f7048i.compareAndSet(this, 0, 1)) {
            this.f7049h.mo1h(th);
        }
    }
}
