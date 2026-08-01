package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class fu0 {

    /* JADX INFO: renamed from: a */
    public final long f1812a;

    /* JADX INFO: renamed from: b */
    public final long f1813b;

    /* JADX INFO: renamed from: c */
    public final long f1814c;

    /* JADX INFO: renamed from: d */
    public final long f1815d;

    /* JADX INFO: renamed from: e */
    public final long f1816e;

    /* JADX INFO: renamed from: f */
    public final float[] f1817f;

    /* JADX INFO: renamed from: g */
    public final C0503n9 f1818g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fu0(long j, long j2, long j3, long j4, long j5, float[] fArr, C0503n9 c0503n9) {
        this.f1812a = j;
        this.f1813b = j2;
        this.f1814c = j3;
        this.f1815d = j4;
        this.f1816e = j5;
        this.f1817f = fArr;
        this.f1818g = c0503n9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && fu0.class == obj.getClass()) {
            fu0 fu0Var = (fu0) obj;
            if (this.f1812a == fu0Var.f1812a && this.f1813b == fu0Var.f1813b && this.f1816e == fu0Var.f1816e && w20.m4833a(this.f1814c, fu0Var.f1814c) && w20.m4833a(this.f1815d, fu0Var.f1815d)) {
                float[] fArr = fu0Var.f1817f;
                float[] fArr2 = this.f1817f;
                if (fArr2 == null) {
                    zEquals = fArr == null;
                    return zEquals && this.f1818g == fu0Var.f1818g;
                }
                if (fArr != null) {
                    zEquals = fArr2.equals(fArr);
                }
                if (zEquals) {
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM4146d = AbstractC0748t1.m4146d(this.f1815d, AbstractC0748t1.m4146d(this.f1814c, AbstractC0748t1.m4146d(this.f1816e, AbstractC0748t1.m4146d(this.f1813b, Long.hashCode(this.f1812a) * 31, 31), 31), 31), 31);
        float[] fArr = this.f1817f;
        return this.f1818g.hashCode() + ((iM4146d + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
