package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;
import p000.AbstractC6087;
import p112.C7327;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2065 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f6116;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f6117;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f6118;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f6119;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6120;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2054 f6121;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float f6122;

    public C2065(C2054 c2054, int i, int i2, int i3, int i4, float f, float f2) {
        this.f6121 = c2054;
        this.f6120 = i;
        this.f6119 = i2;
        this.f6118 = i3;
        this.f6117 = i4;
        this.f6116 = f;
        this.f6122 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2065) {
            C2065 c2065 = (C2065) obj;
            if (this.f6121 == c2065.f6121 && this.f6120 == c2065.f6120 && this.f6119 == c2065.f6119 && this.f6118 == c2065.f6118 && this.f6117 == c2065.f6117 && Float.compare(this.f6116, c2065.f6116) == 0 && Float.compare(this.f6122, c2065.f6122) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6122) + AbstractC0053.m144(AbstractC0053.m143(this.f6117, AbstractC0053.m143(this.f6118, AbstractC0053.m143(this.f6119, AbstractC0053.m143(this.f6120, this.f6121.hashCode() * 31, 31), 31), 31), 31), this.f6116, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f6121);
        sb.append(", startIndex=");
        sb.append(this.f6120);
        sb.append(", endIndex=");
        sb.append(this.f6119);
        sb.append(", startLineIndex=");
        sb.append(this.f6118);
        sb.append(", endLineIndex=");
        sb.append(this.f6117);
        sb.append(", top=");
        sb.append(this.f6116);
        sb.append(", bottom=");
        return AbstractC0053.m157(sb, this.f6122, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m3788(int i) {
        int i2 = this.f6119;
        int i3 = this.f6120;
        return AbstractC6087.m11420(i, i3, i2) - i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7327 m3789(C7327 c7327) {
        float f = -this.f6116;
        return c7327.m12497((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m3790(long j, boolean z) {
        if (z) {
            long j2 = C2035.f6002;
            if (C2035.m3743(j, j2)) {
                return j2;
            }
        }
        int i = C2035.f6001;
        int i2 = this.f6120;
        return AbstractC2048.m3760(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7327 m3791(C7327 c7327) {
        return c7327.m12497((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f6116)) & 4294967295L));
    }
}
