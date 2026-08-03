package Yue;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3812 extends CancellationException {
    public C3812() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    @InterfaceC6399
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
