package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: v8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0809v8 extends C0850wb {

    /* JADX INFO: renamed from: c */
    public static final AtomicIntegerFieldUpdater f4918c = AtomicIntegerFieldUpdater.newUpdater(C0809v8.class, "_resumed");
    private volatile int _resumed;

    public C0809v8(C0698s8 c0698s8, Throwable th, boolean z) {
        super(th, z);
        this._resumed = 0;
    }
}
