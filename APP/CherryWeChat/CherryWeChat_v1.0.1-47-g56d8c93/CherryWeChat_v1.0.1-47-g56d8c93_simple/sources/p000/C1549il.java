package p000;

/* JADX INFO: renamed from: il */
/* JADX INFO: loaded from: classes.dex */
public final class C1549il {

    /* JADX INFO: renamed from: a */
    public final int f5502a;

    /* JADX INFO: renamed from: b */
    public final Object f5503b;

    public C1549il(int r1, Object r2) {
        this.f5502a = r1;
        this.f5503b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C1549il) == true) goto L8;
        return false;
    L8:
        C1549il r52 = (C1549il) r5;
        if (this.f5502a == r52.f5502a) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f5503b, r52.f5503b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = Integer.hashCode(this.f5502a) * 31;
        Object r1 = this.f5503b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r0 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f5502a + ", value=" + this.f5503b + ')';
    }
}
