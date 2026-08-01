package p072;

import io.modelcontextprotocol.kotlin.sdk.Role;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7446 implements InterfaceC7625 {
    public static final C7450 Companion = new C7450();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC6016[] f18334 = {null, null, AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C7460(3)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7981 f18335;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7561 f18336;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Role f18337;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7411 f18338;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18339;

    public C7446(int i, String str, InterfaceC7411 interfaceC7411, Role role, InterfaceC7561 interfaceC7561, C7981 c7981) {
        if (13 != (i & 13)) {
            AbstractC7973.m12979(i, 13, C7451.f18352.getDescriptor());
            throw null;
        }
        this.f18339 = str;
        if ((i & 2) == 0) {
            this.f18338 = null;
        } else {
            this.f18338 = interfaceC7411;
        }
        this.f18337 = role;
        this.f18336 = interfaceC7561;
        if ((i & 16) == 0) {
            this.f18335 = AbstractC7431.f18321;
        } else {
            this.f18335 = c7981;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7446)) {
            return false;
        }
        C7446 c7446 = (C7446) obj;
        return AbstractC5227.m9466(this.f18339, c7446.f18339) && AbstractC5227.m9466(this.f18338, c7446.f18338) && this.f18337 == c7446.f18337 && AbstractC5227.m9466(this.f18336, c7446.f18336) && AbstractC5227.m9466(this.f18335, c7446.f18335);
    }

    public final int hashCode() {
        int iHashCode = this.f18339.hashCode() * 31;
        InterfaceC7411 interfaceC7411 = this.f18338;
        return this.f18335.f19461.hashCode() + ((this.f18336.hashCode() + ((this.f18337.hashCode() + ((iHashCode + (interfaceC7411 == null ? 0 : interfaceC7411.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateMessageResult(model=");
        sb.append(this.f18339);
        sb.append(", stopReason=");
        sb.append(this.f18338);
        sb.append(", role=");
        sb.append(this.f18337);
        sb.append(", content=");
        sb.append(this.f18336);
        sb.append(", _meta=");
        return AbstractC7012.m12139(sb, this.f18335, ')');
    }
}
