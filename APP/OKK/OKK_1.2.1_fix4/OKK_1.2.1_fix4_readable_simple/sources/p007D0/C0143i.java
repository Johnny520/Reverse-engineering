package p007D0;

import java.io.Serializable;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: D0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0143i implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f334a;

    /* JADX INFO: renamed from: b */
    public final Object f335b;

    /* JADX INFO: renamed from: c */
    public final Object f336c;

    public C0143i(Object r1, Object r2, Object r3) {
        this.f334a = r1;
        this.f335b = r2;
        this.f336c = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0143i) == true) goto L8;
        return false;
    L8:
        C0143i r52 = (C0143i) r5;
        Object r1 = r52.f334a;
        if (AbstractC0307g.m699a(this.f334a, r1) == true) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(this.f335b, r52.f335b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0307g.m699a(this.f336c, r52.f336c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r02 = 0;
        Object r1 = this.f334a;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r13 = r12 * 31;
        Object r2 = this.f335b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r14 = (r13 + r22) * 31;
        Object r23 = this.f336c;
        if (r23 == null) goto L15;
        r02 = r23.hashCode();
    L15:
        return r14 + r02;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        return "(" + this.f334a + ", " + this.f335b + ", " + this.f336c + ')';
    }
}
