package Yue;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5543 extends CancellationException implements InterfaceC4224<C5543> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final transient InterfaceC5542 f13509;

    public C5543(@InterfaceC6399 String str, @InterfaceC6489 Throwable th, @InterfaceC6399 InterfaceC5542 interfaceC5542) {
        super(str);
        this.f13509 = interfaceC5542;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj != this) {
            if (obj instanceof C5543) {
                C5543 c5543 = (C5543) obj;
                if (!C5499.m17094(c5543.getMessage(), getMessage()) || !C5499.m17094(c5543.f13509, this.f13509) || !C5499.m17094(c5543.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    @InterfaceC6399
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C5499.m17100(message);
        int iHashCode = ((message.hashCode() * 31) + this.f13509.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @InterfaceC6399
    public String toString() {
        return super.toString() + "; job=" + this.f13509;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ()Ljava/lang/Throwable; */
    @Override // Yue.InterfaceC4224
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
    public C5543 mo1189() {
        return null;
    }
}
