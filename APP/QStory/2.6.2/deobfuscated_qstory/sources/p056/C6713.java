package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6713 implements InterfaceC6839 {
    public static final C6717 Companion = new C6717();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6815 f18142;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7151 f18143;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6720 f18144;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6697 f18145;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18146;

    public C6713(int i, String str, C6697 c6697, C6720 c6720, C7151 c7151, InterfaceC6815 interfaceC6815) {
        if (7 != (i & 7)) {
            AbstractC7143.m12393(i, 7, C6716.f18151.getDescriptor());
            throw null;
        }
        this.f18146 = str;
        this.f18145 = c6697;
        this.f18144 = c6720;
        if ((i & 8) == 0) {
            this.f18143 = AbstractC6601.f17981;
        } else {
            this.f18143 = c7151;
        }
        if ((i & 16) == 0) {
            this.f18142 = Method$Defined.Initialize;
        } else {
            this.f18142 = interfaceC6815;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6713)) {
            return false;
        }
        C6713 c6713 = (C6713) obj;
        return AbstractC4394.m8917(this.f18146, c6713.f18146) && AbstractC4394.m8917(this.f18145, c6713.f18145) && AbstractC4394.m8917(this.f18144, c6713.f18144) && AbstractC4394.m8917(this.f18143, c6713.f18143);
    }

    @Override // p056.InterfaceC6839
    public final InterfaceC6815 getMethod() {
        return this.f18142;
    }

    public final int hashCode() {
        return this.f18143.f19121.hashCode() + ((this.f18144.hashCode() + ((this.f18145.hashCode() + (this.f18146.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InitializeRequest(protocolVersion=");
        sb.append(this.f18146);
        sb.append(", capabilities=");
        sb.append(this.f18145);
        sb.append(", clientInfo=");
        sb.append(this.f18144);
        sb.append(", _meta=");
        return AbstractC6136.m11552(sb, this.f18143, ')');
    }
}
