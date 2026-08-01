package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;
import androidx.window.area.AbstractC2567;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2065 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f6117;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f6118;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f6119;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f6120;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6121;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2054 f6122;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float f6123;

    public C2065(C2054 c2054, int i, int i2, int i3, int i4, float f, float f2) {
        this.f6122 = c2054;
        this.f6121 = i;
        this.f6120 = i2;
        this.f6119 = i3;
        this.f6118 = i4;
        this.f6117 = f;
        this.f6123 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2065) {
            C2065 c2065 = (C2065) obj;
            if (this.f6122 == c2065.f6122 && this.f6121 == c2065.f6121 && this.f6120 == c2065.f6120 && this.f6119 == c2065.f6119 && this.f6118 == c2065.f6118 && Float.compare(this.f6117, c2065.f6117) == 0 && Float.compare(this.f6123, c2065.f6123) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6123) + AbstractC0053.m145(AbstractC0053.m144(this.f6118, AbstractC0053.m144(this.f6119, AbstractC0053.m144(this.f6120, AbstractC0053.m144(this.f6121, this.f6122.hashCode() * 31, 31), 31), 31), 31), this.f6117, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f6122);
        sb.append(", startIndex=");
        sb.append(this.f6121);
        sb.append(", endIndex=");
        sb.append(this.f6120);
        sb.append(", startLineIndex=");
        sb.append(this.f6119);
        sb.append(", endLineIndex=");
        sb.append(this.f6118);
        sb.append(", top=");
        sb.append(this.f6117);
        sb.append(", bottom=");
        return AbstractC0053.m155(sb, this.f6123, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m3798(int i) {
        int i2 = this.f6120;
        int i3 = this.f6121;
        return AbstractC2567.m5090(i, i3, i2) - i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7328 m3799(C7328 c7328) {
        float f = -this.f6117;
        return c7328.m12524((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m3800(long j, boolean z) {
        if (z) {
            long j2 = C2035.f6003;
            if (C2035.m3753(j, j2)) {
                return j2;
            }
        }
        int i = C2035.f6002;
        int i2 = this.f6121;
        return AbstractC2048.m3770(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7328 m3801(C7328 c7328) {
        return c7328.m12524((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f6117)) & 4294967295L));
    }
}
