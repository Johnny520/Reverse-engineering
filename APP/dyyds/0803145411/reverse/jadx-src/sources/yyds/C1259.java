package yyds;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: yyds.ᛶᛱᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1259 extends C0417 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final /* synthetic */ long f5817 = AbstractC2112.f10448.objectFieldOffset(C1259.class.getDeclaredField("_resumed$volatile"));
    private volatile /* synthetic */ int _resumed$volatile;

    public C1259(C1853 c1853, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + c1853 + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
