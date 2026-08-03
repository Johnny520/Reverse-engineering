package p000;

/* JADX INFO: renamed from: kC */
/* JADX INFO: loaded from: classes.dex */
public final class C2135kC implements Comparable {

    /* JADX INFO: renamed from: a */
    public final long f7478a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((C2135kC) obj).f7478a;
        long j2 = this.f7478a ^ Long.MIN_VALUE;
        long j3 = j ^ Long.MIN_VALUE;
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2135kC) {
            return this.f7478a == ((C2135kC) obj).f7478a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7478a);
    }

    public final String toString() {
        long j = this.f7478a;
        if (j >= 0) {
            return Long.toString(j, 10);
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        return Long.toString(j3, 10).concat(Long.toString(j4, 10));
    }
}
