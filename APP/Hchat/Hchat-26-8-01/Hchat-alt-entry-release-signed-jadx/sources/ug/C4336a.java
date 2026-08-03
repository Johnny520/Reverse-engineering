package ug;

import java.util.concurrent.CancellationException;
import tg.InterfaceC4187e;

/* JADX INFO: renamed from: ug.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4336a extends CancellationException {

    /* JADX INFO: renamed from: g */
    public final transient Object f14494g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4336a(InterfaceC4187e interfaceC4187e) {
        super("Flow was aborted, no more elements needed");
        this.f14494g = interfaceC4187e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
