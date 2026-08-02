package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z01 {

    /* JADX INFO: renamed from: a */
    public final long f13695a;

    /* JADX INFO: renamed from: a */
    public static final boolean m6371a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static final long m6372b(long j, long j2) {
        return (((long) (((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: c */
    public static final long m6373c(long j, long j2) {
        return (((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: d */
    public static String m6374d(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return vi0.m5694m(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z01) {
            return this.f13695a == ((z01) obj).f13695a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13695a);
    }

    public final String toString() {
        return m6374d(this.f13695a);
    }
}
