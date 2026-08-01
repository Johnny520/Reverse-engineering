package p400;

import androidx.activity.AbstractC0900;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import p105.InterfaceC8010;
import p303.AbstractC9234;
import p349.C9616;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9872 {
    public static final C9869 Companion = new C9869();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC6016[] f25672 = {null, AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C9616(10)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f25673;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9871 f25674;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f25675;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9871 f25676;

    public /* synthetic */ C9872(int i, C9871 c9871, List list, C9871 c98712, int i2) {
        if ((i & 1) == 0) {
            this.f25676 = null;
        } else {
            this.f25676 = c9871;
        }
        if ((i & 2) == 0) {
            this.f25675 = null;
        } else {
            this.f25675 = list;
        }
        if ((i & 4) == 0) {
            this.f25674 = null;
        } else {
            this.f25674 = c98712;
        }
        if ((i & 8) == 0) {
            this.f25673 = 0;
        } else {
            this.f25673 = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9872)) {
            return false;
        }
        C9872 c9872 = (C9872) obj;
        return AbstractC5227.m9466(this.f25676, c9872.f25676) && AbstractC5227.m9466(this.f25675, c9872.f25675) && AbstractC5227.m9466(this.f25674, c9872.f25674) && this.f25673 == c9872.f25673;
    }

    public final int hashCode() {
        C9871 c9871 = this.f25676;
        int iHashCode = (c9871 == null ? 0 : Long.hashCode(c9871.f25671)) * 31;
        List list = this.f25675;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        C9871 c98712 = this.f25674;
        return Integer.hashCode(this.f25673) + ((iHashCode2 + (c98712 != null ? Long.hashCode(c98712.f25671) : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(1392));
        sb.append(this.f25676);
        sb.append(AbstractC9234.m14531(1393));
        sb.append(this.f25675);
        sb.append(AbstractC9234.m14531(1394));
        sb.append(this.f25674);
        sb.append(AbstractC9234.m14531(1406));
        return AbstractC0900.m716(sb, this.f25673, ')');
    }

    public C9872(C9871 c9871, List list, C9871 c98712, int i) {
        this.f25676 = c9871;
        this.f25675 = list;
        this.f25674 = c98712;
        this.f25673 = i;
    }
}
