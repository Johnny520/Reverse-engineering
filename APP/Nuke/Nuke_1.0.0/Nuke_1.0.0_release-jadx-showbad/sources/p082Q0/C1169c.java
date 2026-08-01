package p082Q0;

import java.util.Arrays;
import p011B4.AbstractC0231b;
import p153e1.C2014j;
import p260x.C3421d;

/* JADX INFO: renamed from: Q0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1169c {

    /* JADX INFO: renamed from: a */
    public final long f3830a;

    /* JADX INFO: renamed from: b */
    public final long f3831b;

    /* JADX INFO: renamed from: c */
    public final long f3832c;

    /* JADX INFO: renamed from: d */
    public final long f3833d;

    /* JADX INFO: renamed from: e */
    public final long f3834e;

    /* JADX INFO: renamed from: f */
    public final float[] f3835f;

    /* JADX INFO: renamed from: g */
    public final C3421d f3836g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1169c(long j5, long j6, long j7, long j8, long j9, float[] fArr, C3421d c3421d) {
        this.f3830a = j5;
        this.f3831b = j6;
        this.f3832c = j7;
        this.f3833d = j8;
        this.f3834e = j9;
        this.f3835f = fArr;
        this.f3836g = c3421d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && C1169c.class == obj.getClass()) {
                C1169c c1169c = (C1169c) obj;
                if (this.f3830a == c1169c.f3830a && this.f3831b == c1169c.f3831b && this.f3834e == c1169c.f3834e && C2014j.m3700a(this.f3832c, c1169c.f3832c) && C2014j.m3700a(this.f3833d, c1169c.f3833d)) {
                    float[] fArr = c1169c.f3835f;
                    float[] fArr2 = this.f3835f;
                    if (fArr2 == null) {
                        zEquals = fArr == null;
                        if (zEquals && this.f3836g.equals(c1169c.f3836g)) {
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
        int iM392c = AbstractC0231b.m392c(AbstractC0231b.m392c(AbstractC0231b.m392c(AbstractC0231b.m392c(Long.hashCode(this.f3830a) * 31, 31, this.f3831b), 31, this.f3834e), 31, this.f3832c), 31, this.f3833d);
        float[] fArr = this.f3835f;
        return this.f3836g.hashCode() + ((iM392c + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
