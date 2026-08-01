package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: zc */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0995zc extends C0688rg {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7862c = AtomicIntegerFieldUpdater.newUpdater(C0995zc.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0995zc(C0884wc c0884wc, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + c0884wc + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
