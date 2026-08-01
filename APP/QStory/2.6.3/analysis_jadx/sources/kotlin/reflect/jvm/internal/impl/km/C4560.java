package kotlin.reflect.jvm.internal.impl.km;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4560 extends AbstractC4548 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f13311;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13312;

    public C4560(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f13312 = str;
        this.f13311 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4560)) {
            return false;
        }
        C4560 c4560 = (C4560) obj;
        return AbstractC4395.m8907(this.f13312, c4560.f13312) && AbstractC4395.m8907(this.f13311, c4560.f13311);
    }

    public final int hashCode() {
        return this.f13311.hashCode() + (this.f13312.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnumValue(");
        sb.append(this.f13312);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        return AbstractC0053.m148(sb, this.f13311, ')');
    }
}
