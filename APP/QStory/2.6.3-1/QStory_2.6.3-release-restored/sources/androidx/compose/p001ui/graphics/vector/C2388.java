package androidx.compose.p001ui.graphics.vector;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2388 extends AbstractC2368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4900;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4901;

    public C2388(float f, float f2) {
        super(3);
        this.f4901 = f;
        this.f4900 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2388)) {
            return false;
        }
        C2388 c2388 = (C2388) obj;
        return Float.compare(this.f4901, c2388.f4901) == 0 && Float.compare(this.f4900, c2388.f4900) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4900) + (Float.hashCode(this.f4901) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f4901);
        sb.append(", dy=");
        return AbstractC0900.m715(sb, this.f4900, ')');
    }
}
