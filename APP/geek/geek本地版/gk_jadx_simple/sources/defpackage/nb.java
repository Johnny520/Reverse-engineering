package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class nb {
    public static final AtomicIntegerFieldUpdater b = null;
    private volatile int _handled;
    public final Throwable a;

    static {
        b = AtomicIntegerFieldUpdater.newUpdater(nb.class, "_handled");
    }

    public nb(Throwable r1, boolean r2) {
        this.a = r1;
        this._handled = r2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}
