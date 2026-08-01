package p184j3;

import java.util.concurrent.CancellationException;
import p058L.C0906H;

/* JADX INFO: renamed from: j3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2382a extends CancellationException {

    /* JADX INFO: renamed from: d */
    public final transient Object f7724d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2382a(C0906H c0906h) {
        super("Flow was aborted, no more elements needed");
        this.f7724d = c0906h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
