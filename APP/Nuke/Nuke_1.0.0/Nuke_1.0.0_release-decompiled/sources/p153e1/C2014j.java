package p153e1;

import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: e1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2014j {

    /* JADX INFO: renamed from: a */
    public final long f6735a;

    /* JADX INFO: renamed from: a */
    public static final boolean m3700a(long j5, long j6) {
        return j5 == j6;
    }

    /* JADX INFO: renamed from: b */
    public static final long m3701b(long j5, long j6) {
        return (((long) (((int) (j5 >> 32)) - ((int) (j6 >> 32)))) << 32) | (((long) (((int) (j5 & 4294967295L)) - ((int) (j6 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: c */
    public static final long m3702c(long j5, long j6) {
        return (((long) (((int) (j5 >> 32)) + ((int) (j6 >> 32)))) << 32) | (((long) (((int) (j5 & 4294967295L)) + ((int) (j6 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: d */
    public static String m3703d(long j5) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j5 >> 32));
        sb.append(", ");
        return AbstractC3202a.m5466a(sb, (int) (j5 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2014j) {
            return this.f6735a == ((C2014j) obj).f6735a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6735a);
    }

    public final String toString() {
        return m3703d(this.f6735a);
    }
}
