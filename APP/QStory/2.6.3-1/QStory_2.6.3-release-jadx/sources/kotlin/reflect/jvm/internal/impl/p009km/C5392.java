package kotlin.reflect.jvm.internal.impl.p009km;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5392 extends AbstractC5380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f13656;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13657;

    public C5392(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f13657 = str;
        this.f13656 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5392)) {
            return false;
        }
        C5392 c5392 = (C5392) obj;
        return AbstractC5227.m9466(this.f13657, c5392.f13657) && AbstractC5227.m9466(this.f13656, c5392.f13656);
    }

    public final int hashCode() {
        return this.f13656.hashCode() + (this.f13657.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnumValue(");
        sb.append(this.f13657);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        return AbstractC0900.m708(sb, this.f13656, ')');
    }
}
