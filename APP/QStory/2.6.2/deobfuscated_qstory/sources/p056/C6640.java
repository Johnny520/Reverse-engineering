package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6640 implements InterfaceC6839 {
    public static final C6643 Companion = new C6643();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6815 f18038;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7151 f18039;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18040;

    public C6640(int i, String str, C7151 c7151, InterfaceC6815 interfaceC6815) {
        this.f18040 = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.f18039 = AbstractC6601.f17981;
        } else {
            this.f18039 = c7151;
        }
        if ((i & 4) == 0) {
            this.f18038 = Method$Defined.ToolsList;
        } else {
            this.f18038 = interfaceC6815;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6640)) {
            return false;
        }
        C6640 c6640 = (C6640) obj;
        return AbstractC4394.m8917(this.f18040, c6640.f18040) && AbstractC4394.m8917(this.f18039, c6640.f18039);
    }

    @Override // p056.InterfaceC6839
    public final InterfaceC6815 getMethod() {
        return this.f18038;
    }

    public final int hashCode() {
        String str = this.f18040;
        return this.f18039.f19121.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListToolsRequest(cursor=");
        sb.append(this.f18040);
        sb.append(", _meta=");
        return AbstractC6136.m11552(sb, this.f18039, ')');
    }
}
