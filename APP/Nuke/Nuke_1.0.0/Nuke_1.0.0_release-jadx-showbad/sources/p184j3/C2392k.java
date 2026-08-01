package p184j3;

import java.util.concurrent.CancellationException;
import p210o.AbstractC2725a;

/* JADX INFO: renamed from: j3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2392k extends CancellationException {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7750d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2392k(String str, int i5) {
        super(str);
        this.f7750d = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f7750d) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(AbstractC2725a.f8669a);
                break;
        }
        return this;
    }
}
