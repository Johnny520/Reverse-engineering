package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class e10 implements Serializable {
    public final Throwable a;

    public e10(Throwable r2) {
        ip.o("exception", r2);
        this.a = r2;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof e10) == false) goto L8;
        Throwable r22 = ((e10) r2).a;
        if (ip.i(this.a, r22) == false) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ')';
    }
}
