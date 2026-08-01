package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: rp */
/* JADX INFO: loaded from: classes.dex */
public final class C0678rp extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final transient C0040aq f4166a;

    public C0678rp(String str, Throwable th, C0040aq c0040aq) {
        super(str);
        this.f4166a = c0040aq;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0678rp)) {
            return false;
        }
        C0678rp c0678rp = (C0678rp) obj;
        return AbstractC0493mp.m1853c(c0678rp.getMessage(), getMessage()) && AbstractC0493mp.m1853c(c0678rp.f4166a, this.f4166a) && AbstractC0493mp.m1853c(c0678rp.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        AbstractC0493mp.m1854d(message);
        int iHashCode = (this.f4166a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f4166a;
    }
}
