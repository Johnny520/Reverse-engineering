package p045;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6470 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f17749;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC6473 f17750;

    public C6470(AbstractC6473 abstractC6473, int i) {
        this.f17750 = abstractC6473;
        this.f17749 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6470)) {
            return false;
        }
        C6470 c6470 = (C6470) obj;
        return this.f17750.equals(c6470.f17750) && this.f17749 == c6470.f17749;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17749) + (this.f17750.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KindWithArity(kind=");
        sb.append(this.f17750);
        sb.append(", arity=");
        return AbstractC0053.m156(sb, this.f17749, ')');
    }
}
