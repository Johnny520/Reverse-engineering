package yyds;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: yyds.ᲀᲀᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2062 extends CancellationException {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final transient AbstractC0986 f10210;

    public C2062(String str, Throwable th, AbstractC0986 abstractC0986) {
        super(str);
        this.f10210 = abstractC0986;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2062)) {
            return false;
        }
        C2062 c2062 = (C2062) obj;
        return AbstractC1544.m3188(c2062.getMessage(), getMessage()) && AbstractC1544.m3188(c2062.f10210, this.f10210) && AbstractC1544.m3188(c2062.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int iHashCode = (this.f10210.hashCode() + (getMessage().hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f10210;
    }
}
