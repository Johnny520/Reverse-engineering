package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: em */
/* JADX INFO: loaded from: classes.dex */
public final class C1375em extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final transient InterfaceC1332dm f4910a;

    public C1375em(String r1, Throwable r2, C2152km r3) {
        super(r1);
        this.f4910a = r3;
        if (r2 == null) goto L6;
        initCause(r2);
        return;
    }

    public final boolean equals(Object r3) {
        if (r3 != this) goto L4;
        return true;
    L4:
        if ((r3 instanceof C1375em) == false) goto L18;
        C1375em r32 = (C1375em) r3;
        if (AbstractC0585Nj.m1134a(r32.getMessage(), getMessage()) == false) goto L22;
        Object r0 = r32.f4910a;
        if (r0 != null) goto L10;
        r0 = C0894Us.f2788b;
    L10:
        Object r1 = this.f4910a;
        if (r1 != null) goto L14;
        r1 = C0894Us.f2788b;
    L14:
        if (r0.equals(r1) == true) goto L16;
        return false;
    L16:
        if (AbstractC0585Nj.m1134a(r32.getCause(), getCause()) == true) goto L25;
        return false;
    L25:
        return true;
    L22:
        return false;
    L18:
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int r0 = getMessage().hashCode() * 31;
        Object r1 = this.f4910a;
        if (r1 != null) goto L5;
        r1 = C0894Us.f2788b;
    L5:
        int r12 = (r1.hashCode() + r0) * 31;
        Throwable r02 = getCause();
        if (r02 == null) goto L8;
        int r03 = r02.hashCode();
    L10:
        return r12 + r03;
    L8:
        r03 = 0;
        goto L10
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(super.toString());
        r0.append("; job=");
        Object r1 = this.f4910a;
        if (r1 != null) goto L5;
        r1 = C0894Us.f2788b;
    L5:
        r0.append(r1);
        return r0.toString();
    }
}
