package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class l8 extends nb {
    public static final AtomicIntegerFieldUpdater c = null;
    private volatile int _resumed;

    static {
        c = AtomicIntegerFieldUpdater.newUpdater(l8.class, "_resumed");
    }

    public l8(i8 r1, Throwable r2, boolean r3) {
        super(r2, r3);
        this._resumed = 0;
    }
}
