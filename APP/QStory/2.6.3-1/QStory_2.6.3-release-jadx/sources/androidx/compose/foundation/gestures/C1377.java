package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0900;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1377 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f1905;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f1906;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f1907;

    public C1377(float f, float f2, long j) {
        this.f1907 = f;
        this.f1906 = j;
        this.f1905 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1377)) {
            return false;
        }
        C1377 c1377 = (C1377) obj;
        return Float.compare(this.f1907, c1377.f1907) == 0 && C8158.m13087(this.f1906, c1377.f1906) && Float.compare(this.f1905, c1377.f1905) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1905) + AbstractC0900.m702(Float.hashCode(this.f1907) * 31, 31, this.f1906);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationData(zoom=");
        sb.append(this.f1907);
        sb.append(", offset=");
        sb.append((Object) C8158.m13090(this.f1906));
        sb.append(", degrees=");
        return AbstractC0900.m715(sb, this.f1905, ')');
    }
}
