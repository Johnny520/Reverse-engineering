package p400;

import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9841 {
    public static final C9853 Companion = new C9853();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9842 f25634;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25635;

    public /* synthetic */ C9841(int i, String str, C9842 c9842) {
        if (2 != (i & 2)) {
            AbstractC7973.m12979(i, 2, C9854.f25651.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f25635 = "";
        } else {
            this.f25635 = str;
        }
        this.f25634 = c9842;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9841)) {
            return false;
        }
        C9841 c9841 = (C9841) obj;
        return AbstractC5227.m9466(this.f25635, c9841.f25635) && AbstractC5227.m9466(this.f25634, c9841.f25634);
    }

    public final int hashCode() {
        return this.f25634.hashCode() + (this.f25635.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Info(operatorUid=");
        AbstractC7012.m12138(sb, this.f25635, 1434);
        sb.append(this.f25634);
        sb.append(')');
        return sb.toString();
    }

    public C9841(String str, C9842 c9842) {
        "operatorUid";
        str.getClass();
        "msgInfo";
        this.f25635 = str;
        this.f25634 = c9842;
    }
}
