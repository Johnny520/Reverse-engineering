package p007D0;

import java.io.Serializable;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: D0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0139e implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f328a;

    /* JADX INFO: renamed from: b */
    public final Object f329b;

    public C0139e(Object r1, Object r2) {
        this.f328a = r1;
        this.f329b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0139e) == true) goto L8;
        return false;
    L8:
        C0139e r52 = (C0139e) r5;
        Object r1 = r52.f328a;
        if (AbstractC0307g.m699a(this.f328a, r1) == true) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(this.f329b, r52.f329b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r02 = 0;
        Object r1 = this.f328a;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r13 = r12 * 31;
        Object r2 = this.f329b;
        if (r2 == null) goto L11;
        r02 = r2.hashCode();
    L11:
        return r13 + r02;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        return "(" + this.f328a + ", " + this.f329b + ')';
    }
}
