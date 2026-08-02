package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i73 implements Comparable {

    /* JADX INFO: renamed from: h */
    public final long f4479h;

    public /* synthetic */ i73(long j) {
        this.f4479h = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return t11.m5090p(this.f4479h ^ Long.MIN_VALUE, ((i73) obj).f4479h ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i73) {
            return this.f4479h == ((i73) obj).f4479h;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4479h);
    }

    public final String toString() {
        long j = this.f4479h;
        if (j >= 0) {
            xe1.m6127j(10);
            String string = Long.toString(j, 10);
            string.getClass();
            return string;
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        xe1.m6127j(10);
        String string2 = Long.toString(j2, 10);
        string2.getClass();
        xe1.m6127j(10);
        String string3 = Long.toString(j3, 10);
        string3.getClass();
        return string2.concat(string3);
    }
}
