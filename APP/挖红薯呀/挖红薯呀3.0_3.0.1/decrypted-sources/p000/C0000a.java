package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: a */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0000a extends CancellationException {

    /* JADX INFO: renamed from: d */
    public final transient Object f0d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0000a(C0810uo c0810uo) {
        super("Flow was aborted, no more elements needed");
        this.f0d = c0810uo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
