package p160f3;

import java.util.concurrent.CancellationException;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: f3.T */
/* JADX INFO: loaded from: classes.dex */
public final class C2116T extends CancellationException {

    /* JADX INFO: renamed from: d */
    public final transient C2122Z f7050d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2116T(String str, Throwable th, C2122Z c2122z) {
        super(str);
        this.f7050d = c2122z;
        if (th != null) {
            initCause(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2116T)) {
            return false;
        }
        C2116T c2116t = (C2116T) obj;
        return AbstractC1665j.m2981a(c2116t.getMessage(), getMessage()) && AbstractC1665j.m2981a(c2116t.f7050d, this.f7050d) && AbstractC1665j.m2981a(c2116t.getCause(), getCause());
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
        AbstractC1665j.m2982b(message);
        int iHashCode = (this.f7050d.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f7050d;
    }
}
