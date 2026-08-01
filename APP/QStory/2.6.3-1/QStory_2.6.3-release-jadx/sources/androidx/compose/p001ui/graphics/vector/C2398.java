package androidx.compose.p001ui.graphics.vector;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2398 extends AbstractC2368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f4946;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4947;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4948;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4949;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f4950;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float f4951;

    public C2398(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.f4949 = f;
        this.f4948 = f2;
        this.f4947 = f3;
        this.f4946 = f4;
        this.f4951 = f5;
        this.f4950 = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2398)) {
            return false;
        }
        C2398 c2398 = (C2398) obj;
        return Float.compare(this.f4949, c2398.f4949) == 0 && Float.compare(this.f4948, c2398.f4948) == 0 && Float.compare(this.f4947, c2398.f4947) == 0 && Float.compare(this.f4946, c2398.f4946) == 0 && Float.compare(this.f4951, c2398.f4951) == 0 && Float.compare(this.f4950, c2398.f4950) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4950) + AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(Float.hashCode(this.f4949) * 31, this.f4948, 31), this.f4947, 31), this.f4946, 31), this.f4951, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f4949);
        sb.append(", y1=");
        sb.append(this.f4948);
        sb.append(", x2=");
        sb.append(this.f4947);
        sb.append(", y2=");
        sb.append(this.f4946);
        sb.append(", x3=");
        sb.append(this.f4951);
        sb.append(", y3=");
        return AbstractC0900.m715(sb, this.f4950, ')');
    }
}
