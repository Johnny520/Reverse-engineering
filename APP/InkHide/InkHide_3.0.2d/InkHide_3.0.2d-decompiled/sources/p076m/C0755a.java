package p076m;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: m.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0755a {

    /* JADX INFO: renamed from: b */
    public static final C0755a f2561b;

    /* JADX INFO: renamed from: c */
    public static final C0755a f2562c;

    /* JADX INFO: renamed from: a */
    public final CancellationException f2563a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        if (AbstractFutureC0761g.f2574d) {
            f2562c = null;
            f2561b = null;
        } else {
            f2562c = new C0755a(false, null);
            f2561b = new C0755a(true, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0755a(boolean z2, CancellationException cancellationException) {
        this.f2563a = cancellationException;
    }
}
