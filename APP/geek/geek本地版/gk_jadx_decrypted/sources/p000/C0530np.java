package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: np */
/* JADX INFO: loaded from: classes.dex */
public final class C0530np extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final transient C0864wp f3442a;

    public C0530np(String str, Throwable th, C0864wp c0864wp) {
        super(str);
        this.f3442a = c0864wp;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0530np)) {
            return false;
        }
        C0530np c0530np = (C0530np) obj;
        return AbstractC0346ip.m1497i(c0530np.getMessage(), getMessage()) && AbstractC0346ip.m1497i(c0530np.f3442a, this.f3442a) && AbstractC0346ip.m1497i(c0530np.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        AbstractC0346ip.m1500l(message);
        int iHashCode = (this.f3442a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f3442a;
    }
}
