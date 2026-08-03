package p249qg;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: qg.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3567h extends C3585n {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11572c = AtomicIntegerFieldUpdater.newUpdater(C3567h.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3567h(C3564g c3564g, Throwable th2, boolean z9) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + c3564g + " was cancelled normally");
        }
        super(th2, z9);
        this._resumed$volatile = 0;
    }
}
