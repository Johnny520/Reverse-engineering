package androidx.compose.p001ui.text;

import androidx.activity.AbstractC0900;
import androidx.window.area.AbstractC3400;
import p128.C8157;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2899 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f6462;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f6463;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f6464;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f6465;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6466;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2888 f6467;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float f6468;

    public C2899(C2888 c2888, int i, int i2, int i3, int i4, float f, float f2) {
        this.f6467 = c2888;
        this.f6466 = i;
        this.f6465 = i2;
        this.f6464 = i3;
        this.f6463 = i4;
        this.f6462 = f;
        this.f6468 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2899) {
            C2899 c2899 = (C2899) obj;
            if (this.f6467 == c2899.f6467 && this.f6466 == c2899.f6466 && this.f6465 == c2899.f6465 && this.f6464 == c2899.f6464 && this.f6463 == c2899.f6463 && Float.compare(this.f6462, c2899.f6462) == 0 && Float.compare(this.f6468, c2899.f6468) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6468) + AbstractC0900.m705(AbstractC0900.m704(this.f6463, AbstractC0900.m704(this.f6464, AbstractC0900.m704(this.f6465, AbstractC0900.m704(this.f6466, this.f6467.hashCode() * 31, 31), 31), 31), 31), this.f6462, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f6467);
        sb.append(", startIndex=");
        sb.append(this.f6466);
        sb.append(", endIndex=");
        sb.append(this.f6465);
        sb.append(", startLineIndex=");
        sb.append(this.f6464);
        sb.append(", endLineIndex=");
        sb.append(this.f6463);
        sb.append(", top=");
        sb.append(this.f6462);
        sb.append(", bottom=");
        return AbstractC0900.m715(sb, this.f6468, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m4358(int i) {
        int i2 = this.f6465;
        int i3 = this.f6466;
        return AbstractC3400.m5650(i, i3, i2) - i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8157 m4359(C8157 c8157) {
        float f = -this.f6462;
        return c8157.m13083((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m4360(long j, boolean z) {
        if (z) {
            long j2 = C2869.f6348;
            if (C2869.m4313(j, j2)) {
                return j2;
            }
        }
        int i = C2869.f6347;
        int i2 = this.f6466;
        return AbstractC2882.m4330(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8157 m4361(C8157 c8157) {
        return c8157.m13083((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f6462)) & 4294967295L));
    }
}
