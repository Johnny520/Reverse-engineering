package p056;

import io.modelcontextprotocol.kotlin.sdk.Role;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6616 implements InterfaceC6795 {
    public static final C6620 Companion = new C6620();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC5183[] f17994 = {null, null, AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C6630(3)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7151 f17995;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6731 f17996;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Role f17997;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6581 f17998;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17999;

    public C6616(int i, String str, InterfaceC6581 interfaceC6581, Role role, InterfaceC6731 interfaceC6731, C7151 c7151) {
        if (13 != (i & 13)) {
            AbstractC7143.m12393(i, 13, C6621.f18012.getDescriptor());
            throw null;
        }
        this.f17999 = str;
        if ((i & 2) == 0) {
            this.f17998 = null;
        } else {
            this.f17998 = interfaceC6581;
        }
        this.f17997 = role;
        this.f17996 = interfaceC6731;
        if ((i & 16) == 0) {
            this.f17995 = AbstractC6601.f17981;
        } else {
            this.f17995 = c7151;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6616)) {
            return false;
        }
        C6616 c6616 = (C6616) obj;
        return AbstractC4394.m8917(this.f17999, c6616.f17999) && AbstractC4394.m8917(this.f17998, c6616.f17998) && this.f17997 == c6616.f17997 && AbstractC4394.m8917(this.f17996, c6616.f17996) && AbstractC4394.m8917(this.f17995, c6616.f17995);
    }

    public final int hashCode() {
        int iHashCode = this.f17999.hashCode() * 31;
        InterfaceC6581 interfaceC6581 = this.f17998;
        return this.f17995.f19121.hashCode() + ((this.f17996.hashCode() + ((this.f17997.hashCode() + ((iHashCode + (interfaceC6581 == null ? 0 : interfaceC6581.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateMessageResult(model=");
        sb.append(this.f17999);
        sb.append(", stopReason=");
        sb.append(this.f17998);
        sb.append(", role=");
        sb.append(this.f17997);
        sb.append(", content=");
        sb.append(this.f17996);
        sb.append(", _meta=");
        return AbstractC6136.m11552(sb, this.f17995, ')');
    }
}
