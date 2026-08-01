package androidx.compose.p001ui.graphics.vector;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2394 extends AbstractC2368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f4917;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4918;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4919;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4920;

    public C2394(float f, float f2, float f3, float f4) {
        super(1);
        this.f4920 = f;
        this.f4919 = f2;
        this.f4918 = f3;
        this.f4917 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2394)) {
            return false;
        }
        C2394 c2394 = (C2394) obj;
        return Float.compare(this.f4920, c2394.f4920) == 0 && Float.compare(this.f4919, c2394.f4919) == 0 && Float.compare(this.f4918, c2394.f4918) == 0 && Float.compare(this.f4917, c2394.f4917) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4917) + AbstractC0900.m705(AbstractC0900.m705(Float.hashCode(this.f4920) * 31, this.f4919, 31), this.f4918, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f4920);
        sb.append(", y1=");
        sb.append(this.f4919);
        sb.append(", x2=");
        sb.append(this.f4918);
        sb.append(", y2=");
        return AbstractC0900.m715(sb, this.f4917, ')');
    }
}
