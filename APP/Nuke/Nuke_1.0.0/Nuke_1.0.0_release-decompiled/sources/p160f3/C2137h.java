package p160f3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: f3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2137h extends C2149n {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7079c = AtomicIntegerFieldUpdater.newUpdater(C2137h.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C2137h(C2135g c2135g, Throwable th, boolean z5) {
        if (th == null) {
            th = new CancellationException("Continuation " + c2135g + " was cancelled normally");
        }
        super(th, z5);
        this._resumed$volatile = 0;
    }
}
