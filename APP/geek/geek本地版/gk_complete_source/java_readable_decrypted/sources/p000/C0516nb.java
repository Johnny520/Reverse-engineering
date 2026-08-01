package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: nb */
/* JADX INFO: loaded from: classes.dex */
public class C0516nb {

    /* JADX INFO: renamed from: b */
    public static final AtomicIntegerFieldUpdater f3367b = AtomicIntegerFieldUpdater.newUpdater(C0516nb.class, "_handled");
    private volatile int _handled;

    /* JADX INFO: renamed from: a */
    public final Throwable f3368a;

    public C0516nb(Throwable th, boolean z) {
        this.f3368a = th;
        this._handled = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f3368a + ']';
    }
}
