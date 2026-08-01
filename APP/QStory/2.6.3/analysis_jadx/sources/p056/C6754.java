package p056;

import androidx.activity.AbstractC0053;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世苏子哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6754 implements InterfaceC6813 {
    public static final C6743 Companion = new C6743();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final InterfaceC5184[] f18182 = {null, AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(19)), null, null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC6816 f18183;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f18184;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Double f18185;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7152 f18186;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6836 f18187;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f18188;

    public C6754(int i, int i2, InterfaceC6836 interfaceC6836, C7152 c7152, Double d, String str, InterfaceC6816 interfaceC6816) {
        if (27 != (i & 27)) {
            AbstractC7144.m12420(i, 27, C6744.f18170.getDescriptor());
            throw null;
        }
        this.f18188 = i2;
        this.f18187 = interfaceC6836;
        if ((i & 4) == 0) {
            this.f18186 = AbstractC6602.f17976;
        } else {
            this.f18186 = c7152;
        }
        this.f18185 = d;
        this.f18184 = str;
        if ((i & 32) == 0) {
            this.f18183 = Method$Defined.NotificationsProgress;
        } else {
            this.f18183 = interfaceC6816;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6754)) {
            return false;
        }
        C6754 c6754 = (C6754) obj;
        return this.f18188 == c6754.f18188 && AbstractC4395.m8907(this.f18187, c6754.f18187) && AbstractC4395.m8907(this.f18186, c6754.f18186) && AbstractC4395.m8907(this.f18185, c6754.f18185) && AbstractC4395.m8907(this.f18184, c6754.f18184);
    }

    public final int hashCode() {
        int iM11571 = AbstractC6183.m11571(this.f18186.f19116, (this.f18187.hashCode() + (Integer.hashCode(this.f18188) * 31)) * 31, 31);
        Double d = this.f18185;
        int iHashCode = (iM11571 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.f18184;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressNotification(progress=");
        sb.append(this.f18188);
        sb.append(", progressToken=");
        sb.append(this.f18187);
        sb.append(", _meta=");
        sb.append(this.f18186);
        sb.append(", total=");
        sb.append(this.f18185);
        sb.append(", message=");
        return AbstractC0053.m148(sb, this.f18184, ')');
    }
}
