package p249qg;

import gg.AbstractC1416l;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: qg.s0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3598s0 extends CancellationException {

    /* JADX INFO: renamed from: g */
    public final transient C3610y0 f11611g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3598s0(String str, Throwable th2, C3610y0 c3610y0) {
        super(str);
        this.f11611g = c3610y0;
        if (th2 != null) {
            initCause(th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3598s0)) {
            return false;
        }
        C3598s0 c3598s0 = (C3598s0) obj;
        return AbstractC1416l.m3825a(c3598s0.getMessage(), getMessage()) && AbstractC1416l.m3825a(c3598s0.f11611g, this.f11611g) && AbstractC1416l.m3825a(c3598s0.getCause(), getCause());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = (this.f11611g.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f11611g;
    }
}
