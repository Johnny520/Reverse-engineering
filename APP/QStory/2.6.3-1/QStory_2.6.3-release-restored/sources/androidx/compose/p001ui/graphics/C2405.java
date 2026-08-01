package androidx.compose.p001ui.graphics;

import androidx.activity.AbstractC0900;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2405 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2405 f4961 = new C2405(0.0f, AbstractC2416.m3440(4278190080L), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4962;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f4963;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f4964;

    public C2405(float f, long j, long j2) {
        this.f4964 = j;
        this.f4963 = j2;
        this.f4962 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2405)) {
            return false;
        }
        C2405 c2405 = (C2405) obj;
        return C2434.m3509(this.f4964, c2405.f4964) && C8158.m13087(this.f4963, c2405.f4963) && this.f4962 == c2405.f4962;
    }

    public final int hashCode() {
        int i = C2434.f5044;
        return Float.hashCode(this.f4962) + AbstractC0900.m702(Long.hashCode(this.f4964) * 31, 31, this.f4963);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        AbstractC0900.m698(this.f4964, sb, ", offset=");
        sb.append((Object) C8158.m13090(this.f4963));
        sb.append(", blurRadius=");
        return AbstractC0900.m715(sb, this.f4962, ')');
    }
}
