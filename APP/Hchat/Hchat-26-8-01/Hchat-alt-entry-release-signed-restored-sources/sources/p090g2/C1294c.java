package p090g2;

import java.util.Arrays;
import p068eh.AbstractC0921a;
import p265s.C3821d;
import p293u2.C4240j;

/* JADX INFO: renamed from: g2.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1294c {

    /* JADX INFO: renamed from: a */
    public final long f4325a;

    /* JADX INFO: renamed from: b */
    public final long f4326b;

    /* JADX INFO: renamed from: c */
    public final long f4327c;

    /* JADX INFO: renamed from: d */
    public final long f4328d;

    /* JADX INFO: renamed from: e */
    public final long f4329e;

    /* JADX INFO: renamed from: f */
    public final float[] f4330f;

    /* JADX INFO: renamed from: g */
    public final C3821d f4331g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1294c(long j3, long j4, long j5, long j10, long j11, float[] fArr, C3821d c3821d) {
        this.f4325a = j3;
        this.f4326b = j4;
        this.f4327c = j5;
        this.f4328d = j10;
        this.f4329e = j11;
        this.f4330f = fArr;
        this.f4331g = c3821d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && C1294c.class == obj.getClass()) {
                C1294c c1294c = (C1294c) obj;
                if (this.f4325a == c1294c.f4325a && this.f4326b == c1294c.f4326b && this.f4329e == c1294c.f4329e && C4240j.m8528b(this.f4327c, c1294c.f4327c) && C4240j.m8528b(this.f4328d, c1294c.f4328d)) {
                    float[] fArr = c1294c.f4330f;
                    float[] fArr2 = this.f4330f;
                    if (fArr2 == null) {
                        zEquals = fArr == null;
                        if (zEquals && this.f4331g.equals(c1294c.f4331g)) {
                        }
                    } else {
                        if (fArr != null) {
                            zEquals = fArr2.equals(fArr);
                        }
                        if (zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2243f = AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f(Long.hashCode(this.f4325a) * 31, 31, this.f4326b), 31, this.f4329e), 31, this.f4327c), 31, this.f4328d);
        float[] fArr = this.f4330f;
        return this.f4331g.hashCode() + ((iM2243f + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
