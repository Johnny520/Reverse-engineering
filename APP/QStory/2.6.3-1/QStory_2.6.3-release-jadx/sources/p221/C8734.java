package p221;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8734 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8734 f22219 = new C8734(0, 0, 0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f22220;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f22221;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f22222;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f22223;

    public C8734(int i, int i2, int i3, int i4) {
        this.f22223 = i;
        this.f22222 = i2;
        this.f22221 = i3;
        this.f22220 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8734)) {
            return false;
        }
        C8734 c8734 = (C8734) obj;
        return this.f22223 == c8734.f22223 && this.f22222 == c8734.f22222 && this.f22221 == c8734.f22221 && this.f22220 == c8734.f22220;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22220) + AbstractC0900.m704(this.f22221, AbstractC0900.m704(this.f22222, Integer.hashCode(this.f22223) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f22223);
        sb.append(", ");
        sb.append(this.f22222);
        sb.append(", ");
        sb.append(this.f22221);
        sb.append(", ");
        return AbstractC0900.m716(sb, this.f22220, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m13914() {
        return (((long) this.f22223) << 32) | (((long) this.f22222) & 4294967295L);
    }
}
