package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l21 extends CancellationException {

    /* JADX INFO: renamed from: h */
    public final transient r21 f5892h;

    public l21(String str, Throwable th, r21 r21Var) {
        super(str);
        this.f5892h = r21Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l21)) {
            return false;
        }
        l21 l21Var = (l21) obj;
        if (!t11.m5086l(l21Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = l21Var.f5892h;
        if (obj2 == null) {
            obj2 = fo1.f3079i;
        }
        Object obj3 = this.f5892h;
        if (obj3 == null) {
            obj3 = fo1.f3079i;
        }
        return t11.m5086l(obj2, obj3) && t11.m5086l(l21Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f5892h;
        if (obj == null) {
            obj = fo1.f3079i;
        }
        int iHashCode2 = (obj.hashCode() + iHashCode) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.f5892h;
        if (obj == null) {
            obj = fo1.f3079i;
        }
        sb.append(obj);
        return sb.toString();
    }
}
