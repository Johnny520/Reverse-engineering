package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: em */
/* JADX INFO: loaded from: classes.dex */
public final class C1375em extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final transient InterfaceC1332dm f4910a;

    public C1375em(String str, Throwable th, C2152km c2152km) {
        super(str);
        this.f4910a = c2152km;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1375em)) {
            return false;
        }
        C1375em c1375em = (C1375em) obj;
        if (!AbstractC0585Nj.m1134a(c1375em.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = c1375em.f4910a;
        if (obj2 == null) {
            obj2 = C0894Us.f2788b;
        }
        Object obj3 = this.f4910a;
        if (obj3 == null) {
            obj3 = C0894Us.f2788b;
        }
        return obj2.equals(obj3) && AbstractC0585Nj.m1134a(c1375em.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int iHashCode = getMessage().hashCode() * 31;
        Object obj = this.f4910a;
        if (obj == null) {
            obj = C0894Us.f2788b;
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
        Object obj = this.f4910a;
        if (obj == null) {
            obj = C0894Us.f2788b;
        }
        sb.append(obj);
        return sb.toString();
    }
}
