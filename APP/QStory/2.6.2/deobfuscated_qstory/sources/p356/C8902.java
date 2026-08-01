package p356;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8902 extends AbstractC8903 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f25078;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25079;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25080;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25081;

    public C8902(String str, int i, int i2, boolean z) {
        "categoryName";
        this.f25081 = i;
        this.f25080 = str;
        this.f25079 = i2;
        this.f25078 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8902)) {
            return false;
        }
        C8902 c8902 = (C8902) obj;
        return this.f25081 == c8902.f25081 && AbstractC4394.m8917(this.f25080, c8902.f25080) && this.f25079 == c8902.f25079 && this.f25078 == c8902.f25078;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25078) + AbstractC0053.m143(this.f25079, AbstractC6136.m11539(Integer.hashCode(this.f25081) * 31, 31, this.f25080), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GroupHeader(categoryId=");
        AbstractC6136.m11533(sb, this.f25081, -3937296928073844135L);
        AbstractC6136.m11531(sb, this.f25080, -3937296859354367399L);
        AbstractC6136.m11533(sb, this.f25079, -3937296782044956071L);
        return AbstractC0053.m150(sb, this.f25078, ')');
    }
}
