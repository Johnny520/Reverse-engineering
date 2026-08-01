package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class oa {
    public final int a;
    public final Method b;

    public oa(int r1, Method r2) {
        this.a = r1;
        this.b = r2;
        r2.setAccessible(true);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof oa) == true) goto L8;
        return false;
    L8:
        oa r52 = (oa) r5;
        if (this.a == r52.a) goto L11;
    L13:
        return false;
    L11:
        if (this.b.getName().equals(r52.b.getName()) == false) goto L13;
        return true;
    }

    public final int hashCode() {
        int r0 = this.a * 31;
        return this.b.getName().hashCode() + r0;
    }
}
