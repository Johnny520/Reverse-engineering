package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class kx implements Serializable {
    public final Object a;
    public final Object b;

    public kx(Object r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof kx) == true) goto L8;
        return false;
    L8:
        kx r52 = (kx) r5;
        if (ip.i(this.a, r52.a) == true) goto L12;
        return false;
    L12:
        if (ip.i(this.b, r52.b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        Object r1 = this.a;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r13 = r12 * 31;
        Object r2 = this.b;
        if (r2 == null) goto L11;
        r0 = r2.hashCode();
    L11:
        return r13 + r0;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ')';
    }
}
