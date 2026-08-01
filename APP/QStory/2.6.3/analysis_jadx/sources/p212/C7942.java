package p212;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7942 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f21984;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f21985;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f21986;

    public C7942(int i, int i2, boolean z) {
        this.f21986 = i;
        this.f21985 = i2;
        this.f21984 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7942)) {
            return false;
        }
        C7942 c7942 = (C7942) obj;
        return this.f21986 == c7942.f21986 && this.f21985 == c7942.f21985 && this.f21984 == c7942.f21984;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21984) + AbstractC0053.m144(this.f21985, Integer.hashCode(this.f21986) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(start=");
        sb.append(this.f21986);
        sb.append(", end=");
        sb.append(this.f21985);
        sb.append(", isRtl=");
        return AbstractC0053.m152(sb, this.f21984, ')');
    }
}
