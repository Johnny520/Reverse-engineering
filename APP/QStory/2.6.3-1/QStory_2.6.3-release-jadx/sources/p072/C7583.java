package p072;

import androidx.activity.AbstractC0900;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世苏子哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7583 implements InterfaceC7642 {
    public static final C7572 Companion = new C7572();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final InterfaceC6016[] f18527 = {null, AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C7460(19)), null, null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC7645 f18528;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f18529;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Double f18530;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7981 f18531;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7665 f18532;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f18533;

    public C7583(int i, int i2, InterfaceC7665 interfaceC7665, C7981 c7981, Double d, String str, InterfaceC7645 interfaceC7645) {
        if (27 != (i & 27)) {
            AbstractC7973.m12979(i, 27, C7573.f18515.getDescriptor());
            throw null;
        }
        this.f18533 = i2;
        this.f18532 = interfaceC7665;
        if ((i & 4) == 0) {
            this.f18531 = AbstractC7431.f18321;
        } else {
            this.f18531 = c7981;
        }
        this.f18530 = d;
        this.f18529 = str;
        if ((i & 32) == 0) {
            this.f18528 = Method$Defined.NotificationsProgress;
        } else {
            this.f18528 = interfaceC7645;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7583)) {
            return false;
        }
        C7583 c7583 = (C7583) obj;
        return this.f18533 == c7583.f18533 && AbstractC5227.m9466(this.f18532, c7583.f18532) && AbstractC5227.m9466(this.f18531, c7583.f18531) && AbstractC5227.m9466(this.f18530, c7583.f18530) && AbstractC5227.m9466(this.f18529, c7583.f18529);
    }

    public final int hashCode() {
        int iM12130 = AbstractC7012.m12130(this.f18531.f19461, (this.f18532.hashCode() + (Integer.hashCode(this.f18533) * 31)) * 31, 31);
        Double d = this.f18530;
        int iHashCode = (iM12130 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.f18529;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressNotification(progress=");
        sb.append(this.f18533);
        sb.append(", progressToken=");
        sb.append(this.f18532);
        sb.append(", _meta=");
        sb.append(this.f18531);
        sb.append(", total=");
        sb.append(this.f18530);
        sb.append(", message=");
        return AbstractC0900.m708(sb, this.f18529, ')');
    }
}
