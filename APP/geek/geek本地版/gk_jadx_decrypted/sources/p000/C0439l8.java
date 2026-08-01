package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0439l8 extends C0516nb {

    /* JADX INFO: renamed from: c */
    public static final AtomicIntegerFieldUpdater f3028c = AtomicIntegerFieldUpdater.newUpdater(C0439l8.class, "_resumed");
    private volatile int _resumed;

    public C0439l8(C0326i8 c0326i8, Throwable th, boolean z) {
        super(th, z);
        this._resumed = 0;
    }
}
