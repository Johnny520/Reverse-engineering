package p000;

/* JADX INFO: renamed from: kC */
/* JADX INFO: loaded from: classes.dex */
public final class C2135kC implements Comparable {

    /* JADX INFO: renamed from: a */
    public final long f7478a;

    public /* synthetic */ C2135kC(long r1) {
        this.f7478a = r1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r7) {
        long r0 = ((C2135kC) r7).f7478a;
        long r2 = this.f7478a ^ Long.MIN_VALUE;
        long r02 = r0 ^ Long.MIN_VALUE;
        if (r2 >= r02) goto L6;
        return -1;
    L6:
        if (r2 != r02) goto L9;
        return 0;
    L9:
        return 1;
    }

    public final boolean equals(Object r5) {
        if ((r5 instanceof C2135kC) == false) goto L11;
        long r0 = ((C2135kC) r5).f7478a;
        if (this.f7478a == r0) goto L9;
        return false;
    L9:
        return true;
    L11:
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7478a);
    }

    public final String toString() {
        long r2 = this.f7478a;
        if (r2 >= 0) goto L5;
        long r6 = 10;
        long r4 = ((r2 >>> 1) / r6) << 1;
        long r22 = r2 - (r4 * r6);
        if (r22 < r6) goto L10;
        r22 = r22 - r6;
        r4 = r4 + 1;
    L10:
        return Long.toString(r4, 10).concat(Long.toString(r22, 10));
    L5:
        return Long.toString(r2, 10);
    }
}
