package p056;

import io.modelcontextprotocol.kotlin.sdk.Role;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6617 implements InterfaceC6796 {
    public static final C6621 Companion = new C6621();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC5184[] f17989 = {null, null, AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(3)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7152 f17990;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6732 f17991;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Role f17992;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6582 f17993;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17994;

    public C6617(int i, String str, InterfaceC6582 interfaceC6582, Role role, InterfaceC6732 interfaceC6732, C7152 c7152) {
        if (13 != (i & 13)) {
            AbstractC7144.m12420(i, 13, C6622.f18007.getDescriptor());
            throw null;
        }
        this.f17994 = str;
        if ((i & 2) == 0) {
            this.f17993 = null;
        } else {
            this.f17993 = interfaceC6582;
        }
        this.f17992 = role;
        this.f17991 = interfaceC6732;
        if ((i & 16) == 0) {
            this.f17990 = AbstractC6602.f17976;
        } else {
            this.f17990 = c7152;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6617)) {
            return false;
        }
        C6617 c6617 = (C6617) obj;
        return AbstractC4395.m8907(this.f17994, c6617.f17994) && AbstractC4395.m8907(this.f17993, c6617.f17993) && this.f17992 == c6617.f17992 && AbstractC4395.m8907(this.f17991, c6617.f17991) && AbstractC4395.m8907(this.f17990, c6617.f17990);
    }

    public final int hashCode() {
        int iHashCode = this.f17994.hashCode() * 31;
        InterfaceC6582 interfaceC6582 = this.f17993;
        return this.f17990.f19116.hashCode() + ((this.f17991.hashCode() + ((this.f17992.hashCode() + ((iHashCode + (interfaceC6582 == null ? 0 : interfaceC6582.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateMessageResult(model=");
        sb.append(this.f17994);
        sb.append(", stopReason=");
        sb.append(this.f17993);
        sb.append(", role=");
        sb.append(this.f17992);
        sb.append(", content=");
        sb.append(this.f17991);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f17990, ')');
    }
}
