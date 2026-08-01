package androidx.compose.p001ui.spatial;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.lazy.layout.C1545;
import java.util.Arrays;
import p221.C8737;

/* JADX INFO: renamed from: androidx.compose.ui.spatial.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2795 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float[] f6157;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f6158;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f6159;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f6160;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f6161;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f6162;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1545 f6163;

    public C2795(long j, long j2, long j3, long j4, long j5, float[] fArr, C1545 c1545) {
        this.f6162 = j;
        this.f6161 = j2;
        this.f6160 = j3;
        this.f6159 = j4;
        this.f6158 = j5;
        this.f6157 = fArr;
        this.f6163 = c1545;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && C2795.class == obj.getClass()) {
            C2795 c2795 = (C2795) obj;
            if (this.f6162 == c2795.f6162 && this.f6161 == c2795.f6161 && this.f6158 == c2795.f6158 && C8737.m13923(this.f6160, c2795.f6160) && C8737.m13923(this.f6159, c2795.f6159)) {
                float[] fArr = c2795.f6157;
                float[] fArr2 = this.f6157;
                if (fArr2 == null) {
                    zEquals = fArr == null;
                    return zEquals && this.f6163 == c2795.f6163;
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

    public final int hashCode() {
        int iM702 = AbstractC0900.m702(AbstractC0900.m702(AbstractC0900.m702(AbstractC0900.m702(Long.hashCode(this.f6162) * 31, 31, this.f6161), 31, this.f6158), 31, this.f6160), 31, this.f6159);
        float[] fArr = this.f6157;
        return this.f6163.hashCode() + ((iM702 + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
