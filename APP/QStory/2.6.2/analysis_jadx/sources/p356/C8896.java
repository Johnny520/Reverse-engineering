package p356;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8896 extends AbstractC8895 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f25059;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25060;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25061;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25062;

    public C8896(String str, int i, int i2, boolean z) {
        AbstractC3056.m6668(-3937727163537819047L);
        this.f25062 = i;
        this.f25061 = str;
        this.f25060 = i2;
        this.f25059 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8896)) {
            return false;
        }
        C8896 c8896 = (C8896) obj;
        return this.f25062 == c8896.f25062 && AbstractC4394.m8917(this.f25061, c8896.f25061) && this.f25060 == c8896.f25060 && this.f25059 == c8896.f25059;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25059) + AbstractC0053.m143(this.f25060, AbstractC6136.m11539(Integer.hashCode(this.f25062) * 31, 31, this.f25061), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937297099872535975L));
        AbstractC6136.m11533(sb, this.f25062, -3937296928073844135L);
        AbstractC6136.m11531(sb, this.f25061, -3937296859354367399L);
        AbstractC6136.m11533(sb, this.f25060, -3937296782044956071L);
        return AbstractC0053.m150(sb, this.f25059, ')');
    }
}
