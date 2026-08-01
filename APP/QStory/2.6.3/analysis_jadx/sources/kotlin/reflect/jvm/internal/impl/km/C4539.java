package kotlin.reflect.jvm.internal.impl.km;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4539 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f13243;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C4534 f13244;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4539)) {
            return false;
        }
        C4539 c4539 = (C4539) obj;
        return this.f13244.equals(c4539.f13244) && AbstractC4395.m8907(this.f13243, c4539.f13243);
    }

    public final int hashCode() {
        int iHashCode = this.f13244.hashCode() * 31;
        String str = this.f13243;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KmFlexibleTypeUpperBound(type=");
        sb.append(this.f13244);
        sb.append(", typeFlexibilityId=");
        return AbstractC0053.m148(sb, this.f13243, ')');
    }
}
