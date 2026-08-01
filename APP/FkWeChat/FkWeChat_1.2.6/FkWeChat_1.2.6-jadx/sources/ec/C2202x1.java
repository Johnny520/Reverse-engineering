package ec;

import java.util.concurrent.CancellationException;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: ec.x1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2202x1 extends CancellationException implements InterfaceC2125e0 {

    /* JADX INFO: renamed from: q */
    public final transient InterfaceC2198w1 f6029q;

    public C2202x1(String str, Throwable th, InterfaceC2198w1 interfaceC2198w1) {
        super(str);
        this.f6029q = interfaceC2198w1;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // ec.InterfaceC2125e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2202x1 mo5383a() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC2198w1 m7933c() {
        InterfaceC2198w1 interfaceC2198w1 = this.f6029q;
        return interfaceC2198w1 == null ? C2143i2.f5969r : interfaceC2198w1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2202x1)) {
            return false;
        }
        C2202x1 c2202x1 = (C2202x1) obj;
        return AbstractC1061t.m3842c(c2202x1.getMessage(), getMessage()) && AbstractC1061t.m3842c(c2202x1.m7933c(), m7933c()) && AbstractC1061t.m3842c(c2202x1.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = message.hashCode() * 31;
        InterfaceC2198w1 interfaceC2198w1M7933c = m7933c();
        int iHashCode2 = (iHashCode + (interfaceC2198w1M7933c != null ? interfaceC2198w1M7933c.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + m7933c();
    }
}
