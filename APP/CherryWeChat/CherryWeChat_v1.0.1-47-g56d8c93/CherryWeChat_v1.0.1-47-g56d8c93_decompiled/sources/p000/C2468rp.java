package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: rp */
/* JADX INFO: loaded from: classes.dex */
public class C2468rp implements Iterable, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final long f8689a;

    /* JADX INFO: renamed from: b */
    public final long f8690b;

    /* JADX INFO: renamed from: c */
    public final long f8691c;

    public C2468rp(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f8689a = j;
        if (j3 > 0) {
            if (j < j2) {
                long j4 = j2 % j3;
                long j5 = j % j3;
                long j6 = ((j4 < 0 ? j4 + j3 : j4) - (j5 < 0 ? j5 + j3 : j5)) % j3;
                j2 -= j6 < 0 ? j6 + j3 : j6;
            }
        } else {
            if (j3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (j > j2) {
                long j7 = -j3;
                long j8 = j % j7;
                long j9 = j2 % j7;
                long j10 = ((j8 < 0 ? j8 + j7 : j8) - (j9 < 0 ? j9 + j7 : j9)) % j7;
                j2 += j10 < 0 ? j10 + j7 : j10;
            }
        }
        this.f8690b = j2;
        this.f8691c = j3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2468rp)) {
            return false;
        }
        if (isEmpty() && ((C2468rp) obj).isEmpty()) {
            return true;
        }
        C2468rp c2468rp = (C2468rp) obj;
        return this.f8689a == c2468rp.f8689a && this.f8690b == c2468rp.f8690b && this.f8691c == c2468rp.f8691c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = 31;
        long j2 = this.f8689a;
        long j3 = this.f8690b;
        long j4 = (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32))) * j;
        long j5 = this.f8691c;
        return (int) (j4 + (j5 ^ (j5 >>> 32)));
    }

    public boolean isEmpty() {
        long j = this.f8691c;
        long j2 = this.f8690b;
        long j3 = this.f8689a;
        return j > 0 ? j3 > j2 : j3 < j2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2511sp(this.f8689a, this.f8690b, this.f8691c);
    }

    public String toString() {
        StringBuilder sb;
        long j = this.f8691c;
        long j2 = this.f8690b;
        long j3 = this.f8689a;
        if (j > 0) {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append("..");
            sb.append(j2);
            sb.append(" step ");
            sb.append(j);
        } else {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append(" downTo ");
            sb.append(j2);
            sb.append(" step ");
            sb.append(-j);
        }
        return sb.toString();
    }
}
