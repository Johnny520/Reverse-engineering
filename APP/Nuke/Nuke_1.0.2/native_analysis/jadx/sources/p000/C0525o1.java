package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: o1 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0525o1 extends CancellationException {

    /* JADX INFO: renamed from: h */
    public final transient ha0 f7410h;

    public C0525o1(ha0 ha0Var) {
        super("Flow was aborted, no more elements needed");
        this.f7410h = ha0Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
