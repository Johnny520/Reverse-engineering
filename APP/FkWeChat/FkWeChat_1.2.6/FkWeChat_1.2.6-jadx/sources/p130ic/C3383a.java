package p130ic;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ic.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3383a extends CancellationException {

    /* JADX INFO: renamed from: q */
    public final transient Object f9335q;

    public C3383a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f9335q = obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
