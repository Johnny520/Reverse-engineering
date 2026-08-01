package p384;

import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4395;
import p089.InterfaceC7181;
import p287.AbstractC8405;
import p333.C8787;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9043 {
    public static final C9040 Companion = new C9040();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5184[] f25327 = {null, AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C8787(10)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f25328;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9042 f25329;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f25330;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9042 f25331;

    public /* synthetic */ C9043(int i, C9042 c9042, List list, C9042 c90422, int i2) {
        if ((i & 1) == 0) {
            this.f25331 = null;
        } else {
            this.f25331 = c9042;
        }
        if ((i & 2) == 0) {
            this.f25330 = null;
        } else {
            this.f25330 = list;
        }
        if ((i & 4) == 0) {
            this.f25329 = null;
        } else {
            this.f25329 = c90422;
        }
        if ((i & 8) == 0) {
            this.f25328 = 0;
        } else {
            this.f25328 = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9043)) {
            return false;
        }
        C9043 c9043 = (C9043) obj;
        return AbstractC4395.m8907(this.f25331, c9043.f25331) && AbstractC4395.m8907(this.f25330, c9043.f25330) && AbstractC4395.m8907(this.f25329, c9043.f25329) && this.f25328 == c9043.f25328;
    }

    public final int hashCode() {
        C9042 c9042 = this.f25331;
        int iHashCode = (c9042 == null ? 0 : Long.hashCode(c9042.f25326)) * 31;
        List list = this.f25330;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        C9042 c90422 = this.f25329;
        return Integer.hashCode(this.f25328) + ((iHashCode2 + (c90422 != null ? Long.hashCode(c90422.f25326) : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(1392));
        sb.append(this.f25331);
        sb.append(AbstractC8405.m13972(1393));
        sb.append(this.f25330);
        sb.append(AbstractC8405.m13972(1394));
        sb.append(this.f25329);
        sb.append(AbstractC8405.m13972(1406));
        return AbstractC0053.m156(sb, this.f25328, ')');
    }

    public C9043(C9042 c9042, List list, C9042 c90422, int i) {
        this.f25331 = c9042;
        this.f25330 = list;
        this.f25329 = c90422;
        this.f25328 = i;
    }
}
