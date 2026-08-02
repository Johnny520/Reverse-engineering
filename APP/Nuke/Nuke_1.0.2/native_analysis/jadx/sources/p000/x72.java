package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x72 {

    /* JADX INFO: renamed from: a */
    public final long f12864a;

    /* JADX INFO: renamed from: b */
    public final long f12865b;

    /* JADX INFO: renamed from: c */
    public final long f12866c;

    /* JADX INFO: renamed from: d */
    public final long f12867d;

    /* JADX INFO: renamed from: e */
    public final long f12868e;

    /* JADX INFO: renamed from: f */
    public final float[] f12869f;

    /* JADX INFO: renamed from: g */
    public final C0924yi f12870g;

    public x72(long j, long j2, long j3, long j4, long j5, float[] fArr, C0924yi c0924yi) {
        this.f12864a = j;
        this.f12865b = j2;
        this.f12866c = j3;
        this.f12867d = j4;
        this.f12868e = j5;
        this.f12869f = fArr;
        this.f12870g = c0924yi;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && x72.class == obj.getClass()) {
                x72 x72Var = (x72) obj;
                if (this.f12864a == x72Var.f12864a && this.f12865b == x72Var.f12865b && this.f12868e == x72Var.f12868e && z01.m6371a(this.f12866c, x72Var.f12866c) && z01.m6371a(this.f12867d, x72Var.f12867d)) {
                    float[] fArr = x72Var.f12869f;
                    float[] fArr2 = this.f12869f;
                    if (fArr2 == null) {
                        zEquals = fArr == null;
                        if (zEquals) {
                            if (!(this.f12870g == x72Var.f12870g)) {
                            }
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

    public final int hashCode() {
        int iM2204c = hk1.m2204c(hk1.m2204c(hk1.m2204c(hk1.m2204c(Long.hashCode(this.f12864a) * 31, 31, this.f12865b), 31, this.f12868e), 31, this.f12866c), 31, this.f12867d);
        float[] fArr = this.f12869f;
        return this.f12870g.hashCode() + ((iM2204c + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
