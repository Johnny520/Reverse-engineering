package kotlin.reflect.jvm.internal.impl.p009km;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5371 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f13588;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C5366 f13589;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5371)) {
            return false;
        }
        C5371 c5371 = (C5371) obj;
        return this.f13589.equals(c5371.f13589) && AbstractC5227.m9466(this.f13588, c5371.f13588);
    }

    public final int hashCode() {
        int iHashCode = this.f13589.hashCode() * 31;
        String str = this.f13588;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KmFlexibleTypeUpperBound(type=");
        sb.append(this.f13589);
        sb.append(", typeFlexibilityId=");
        return AbstractC0900.m708(sb, this.f13588, ')');
    }
}
