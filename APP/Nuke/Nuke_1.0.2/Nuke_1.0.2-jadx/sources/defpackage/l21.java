package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l21 extends CancellationException {
    public final transient r21 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l21(String str, Throwable th, r21 r21Var) {
        super(str);
        this.h = r21Var;
        if (th != null) {
            initCause(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l21)) {
            return false;
        }
        l21 l21Var = (l21) obj;
        if (!t11.l(l21Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = l21Var.h;
        if (obj2 == null) {
            obj2 = fo1.i;
        }
        Object obj3 = this.h;
        if (obj3 == null) {
            obj3 = fo1.i;
        }
        return t11.l(obj2, obj3) && t11.l(l21Var.getCause(), getCause());
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
        int iHashCode = message.hashCode() * 31;
        Object obj = this.h;
        if (obj == null) {
            obj = fo1.i;
        }
        int iHashCode2 = (obj.hashCode() + iHashCode) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.h;
        if (obj == null) {
            obj = fo1.i;
        }
        sb.append(obj);
        return sb.toString();
    }
}
