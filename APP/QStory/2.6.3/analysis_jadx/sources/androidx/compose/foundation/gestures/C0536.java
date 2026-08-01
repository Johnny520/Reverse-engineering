package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0053;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0536 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f1560;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f1561;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f1562;

    public C0536(float f, float f2, long j) {
        this.f1562 = f;
        this.f1561 = j;
        this.f1560 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0536)) {
            return false;
        }
        C0536 c0536 = (C0536) obj;
        return Float.compare(this.f1562, c0536.f1562) == 0 && C7329.m12528(this.f1561, c0536.f1561) && Float.compare(this.f1560, c0536.f1560) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1560) + AbstractC0053.m142(Float.hashCode(this.f1562) * 31, 31, this.f1561);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationData(zoom=");
        sb.append(this.f1562);
        sb.append(", offset=");
        sb.append((Object) C7329.m12531(this.f1561));
        sb.append(", degrees=");
        return AbstractC0053.m155(sb, this.f1560, ')');
    }
}
