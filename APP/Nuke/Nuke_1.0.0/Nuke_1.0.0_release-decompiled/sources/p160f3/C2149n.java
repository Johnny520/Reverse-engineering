package p160f3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: f3.n */
/* JADX INFO: loaded from: classes.dex */
public class C2149n {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7091b = AtomicIntegerFieldUpdater.newUpdater(C2149n.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a */
    public final Throwable f7092a;

    public C2149n(Throwable th, boolean z5) {
        this.f7092a = th;
        this._handled$volatile = z5 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f7092a + ']';
    }
}
