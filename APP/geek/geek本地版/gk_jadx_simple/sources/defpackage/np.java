package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class np extends CancellationException {
    public final transient wp a;

    public np(String r1, Throwable r2, wp r3) {
        super(r1);
        this.a = r3;
        if (r2 == null) goto L6;
        initCause(r2);
        return;
    }

    public final boolean equals(Object r3) {
        if (r3 != this) goto L4;
        return true;
    L4:
        if ((r3 instanceof np) == false) goto L12;
        np r32 = (np) r3;
        if (ip.i(r32.getMessage(), getMessage()) == true) goto L8;
        return false;
    L8:
        if (ip.i(r32.a, this.a) == true) goto L10;
        return false;
    L10:
        if (ip.i(r32.getCause(), getCause()) == true) goto L19;
        return false;
    L19:
        return true;
    L12:
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String r0 = getMessage();
        ip.l(r0);
        int r02 = r0.hashCode() * 31;
        int r1 = (this.a.hashCode() + r02) * 31;
        Throwable r03 = getCause();
        if (r03 == null) goto L5;
        int r04 = r03.hashCode();
    L7:
        return r1 + r04;
    L5:
        r04 = 0;
        goto L7
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.a;
    }
}
