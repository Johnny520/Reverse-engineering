package p061;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7299 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f18094;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC7302 f18095;

    public C7299(AbstractC7302 abstractC7302, int i) {
        this.f18095 = abstractC7302;
        this.f18094 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7299)) {
            return false;
        }
        C7299 c7299 = (C7299) obj;
        return this.f18095.equals(c7299.f18095) && this.f18094 == c7299.f18094;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18094) + (this.f18095.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KindWithArity(kind=");
        sb.append(this.f18095);
        sb.append(", arity=");
        return AbstractC0900.m716(sb, this.f18094, ')');
    }
}
