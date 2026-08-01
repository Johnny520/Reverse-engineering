package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: wb */
/* JADX INFO: loaded from: classes.dex */
public class C0850wb {

    /* JADX INFO: renamed from: b */
    public static final AtomicIntegerFieldUpdater f5078b = AtomicIntegerFieldUpdater.newUpdater(C0850wb.class, "_handled");
    private volatile int _handled;

    /* JADX INFO: renamed from: a */
    public final Throwable f5079a;

    public C0850wb(Throwable th, boolean z) {
        this.f5079a = th;
        this._handled = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f5079a + ']';
    }
}
