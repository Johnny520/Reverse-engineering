package kotlin.reflect.jvm.internal.impl.km;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4538 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f13239;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C4533 f13240;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4538)) {
            return false;
        }
        C4538 c4538 = (C4538) obj;
        return this.f13240.equals(c4538.f13240) && AbstractC4394.m8917(this.f13239, c4538.f13239);
    }

    public final int hashCode() {
        int iHashCode = this.f13240.hashCode() * 31;
        String str = this.f13239;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KmFlexibleTypeUpperBound(type=");
        sb.append(this.f13240);
        sb.append(", typeFlexibilityId=");
        return AbstractC0053.m155(sb, this.f13239, ')');
    }
}
