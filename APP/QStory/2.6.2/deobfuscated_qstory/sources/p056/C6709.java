package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import java.util.Map;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6709 implements InterfaceC6839 {
    public static final C6710 Companion = new C6710();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5183[] f18135 = {null, AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C6630(5)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6815 f18136;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7151 f18137;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Map f18138;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18139;

    public C6709(int i, String str, Map map, C7151 c7151, InterfaceC6815 interfaceC6815) {
        if (3 != (i & 3)) {
            AbstractC7143.m12393(i, 3, C6711.f18140.getDescriptor());
            throw null;
        }
        this.f18139 = str;
        this.f18138 = map;
        if ((i & 4) == 0) {
            this.f18137 = AbstractC6601.f17981;
        } else {
            this.f18137 = c7151;
        }
        if ((i & 8) == 0) {
            this.f18136 = Method$Defined.PromptsGet;
        } else {
            this.f18136 = interfaceC6815;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6709)) {
            return false;
        }
        C6709 c6709 = (C6709) obj;
        return AbstractC4394.m8917(this.f18139, c6709.f18139) && AbstractC4394.m8917(this.f18138, c6709.f18138) && AbstractC4394.m8917(this.f18137, c6709.f18137);
    }

    @Override // p056.InterfaceC6839
    public final InterfaceC6815 getMethod() {
        return this.f18136;
    }

    public final int hashCode() {
        int iHashCode = this.f18139.hashCode() * 31;
        Map map = this.f18138;
        return this.f18137.f19121.hashCode() + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetPromptRequest(name=");
        sb.append(this.f18139);
        sb.append(", arguments=");
        sb.append(this.f18138);
        sb.append(", _meta=");
        return AbstractC6136.m11552(sb, this.f18137, ')');
    }
}
