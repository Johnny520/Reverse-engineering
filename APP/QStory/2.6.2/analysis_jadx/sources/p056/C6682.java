package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6682 implements InterfaceC6839 {
    public static final C6683 Companion = new C6683();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6815 f18096;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7151 f18097;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7151 f18098;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18099;

    public C6682(int i, String str, C7151 c7151, C7151 c71512, InterfaceC6815 interfaceC6815) {
        if (1 != (i & 1)) {
            AbstractC7143.m12393(i, 1, C6684.f18100.getDescriptor());
            throw null;
        }
        this.f18099 = str;
        if ((i & 2) == 0) {
            this.f18098 = AbstractC6601.f17981;
        } else {
            this.f18098 = c7151;
        }
        if ((i & 4) == 0) {
            this.f18097 = AbstractC6601.f17981;
        } else {
            this.f18097 = c71512;
        }
        if ((i & 8) == 0) {
            this.f18096 = Method$Defined.ToolsCall;
        } else {
            this.f18096 = interfaceC6815;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6682)) {
            return false;
        }
        C6682 c6682 = (C6682) obj;
        return AbstractC4394.m8917(this.f18099, c6682.f18099) && AbstractC4394.m8917(this.f18098, c6682.f18098) && AbstractC4394.m8917(this.f18097, c6682.f18097);
    }

    @Override // p056.InterfaceC6839
    public final InterfaceC6815 getMethod() {
        return this.f18096;
    }

    public final int hashCode() {
        return this.f18097.f19121.hashCode() + AbstractC6136.m11538(this.f18098.f19121, this.f18099.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallToolRequest(name=");
        sb.append(this.f18099);
        sb.append(", arguments=");
        sb.append(this.f18098);
        sb.append(", _meta=");
        return AbstractC6136.m11552(sb, this.f18097, ')');
    }
}
