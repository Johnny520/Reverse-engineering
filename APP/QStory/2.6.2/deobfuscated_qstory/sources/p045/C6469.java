package p045;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6469 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f17753;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC6472 f17754;

    public C6469(AbstractC6472 abstractC6472, int i) {
        this.f17754 = abstractC6472;
        this.f17753 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6469)) {
            return false;
        }
        C6469 c6469 = (C6469) obj;
        return this.f17754.equals(c6469.f17754) && this.f17753 == c6469.f17753;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17753) + (this.f17754.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KindWithArity(kind=");
        sb.append(this.f17754);
        sb.append(", arity=");
        return AbstractC0053.m154(sb, this.f17753, ')');
    }
}
