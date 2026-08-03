package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: Et */
/* JADX INFO: loaded from: classes.dex */
public final class C0208Et implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f613a;

    /* JADX INFO: renamed from: b */
    public final Object f614b;

    public C0208Et(Object r1, Object r2) {
        this.f613a = r1;
        this.f614b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0208Et) == true) goto L8;
        return false;
    L8:
        C0208Et r52 = (C0208Et) r5;
        if (AbstractC0585Nj.m1134a(this.f613a, r52.f613a) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f614b, r52.f614b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        Object r1 = this.f613a;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r13 = r12 * 31;
        Object r2 = this.f614b;
        if (r2 == null) goto L11;
        r0 = r2.hashCode();
    L11:
        return r13 + r0;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        return "(" + this.f613a + ", " + this.f614b + ')';
    }
}
