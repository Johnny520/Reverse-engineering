package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6650 implements InterfaceC6839 {
    public static final C6646 Companion = new C6646();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6815 f18052;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7151 f18053;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18054;

    public C6650(int i, String str, C7151 c7151, InterfaceC6815 interfaceC6815) {
        if (1 != (i & 1)) {
            AbstractC7143.m12393(i, 1, C6647.f18047.getDescriptor());
            throw null;
        }
        this.f18054 = str;
        if ((i & 2) == 0) {
            this.f18053 = AbstractC6601.f17981;
        } else {
            this.f18053 = c7151;
        }
        if ((i & 4) == 0) {
            this.f18052 = Method$Defined.ResourcesTemplatesList;
        } else {
            this.f18052 = interfaceC6815;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6650)) {
            return false;
        }
        C6650 c6650 = (C6650) obj;
        return AbstractC4394.m8917(this.f18054, c6650.f18054) && AbstractC4394.m8917(this.f18053, c6650.f18053);
    }

    @Override // p056.InterfaceC6839
    public final InterfaceC6815 getMethod() {
        return this.f18052;
    }

    public final int hashCode() {
        String str = this.f18054;
        return this.f18053.f19121.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListResourceTemplatesRequest(cursor=");
        sb.append(this.f18054);
        sb.append(", _meta=");
        return AbstractC6136.m11552(sb, this.f18053, ')');
    }
}
