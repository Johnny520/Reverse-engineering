package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Ea */
/* JADX INFO: loaded from: classes.dex */
public class C0189Ea {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f574b = AtomicIntegerFieldUpdater.newUpdater(C0189Ea.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a */
    public final Throwable f575a;

    public C0189Ea(Throwable th, boolean z) {
        this.f575a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f575a + ']';
    }
}
