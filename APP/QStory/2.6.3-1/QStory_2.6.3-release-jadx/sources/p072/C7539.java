package p072;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import java.util.Map;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7539 implements InterfaceC7669 {
    public static final C7540 Companion = new C7540();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC6016[] f18475 = {null, AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C7460(5)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7645 f18476;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7981 f18477;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Map f18478;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18479;

    public C7539(int i, String str, Map map, C7981 c7981, InterfaceC7645 interfaceC7645) {
        if (3 != (i & 3)) {
            AbstractC7973.m12979(i, 3, C7541.f18480.getDescriptor());
            throw null;
        }
        this.f18479 = str;
        this.f18478 = map;
        if ((i & 4) == 0) {
            this.f18477 = AbstractC7431.f18321;
        } else {
            this.f18477 = c7981;
        }
        if ((i & 8) == 0) {
            this.f18476 = Method$Defined.PromptsGet;
        } else {
            this.f18476 = interfaceC7645;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7539)) {
            return false;
        }
        C7539 c7539 = (C7539) obj;
        return AbstractC5227.m9466(this.f18479, c7539.f18479) && AbstractC5227.m9466(this.f18478, c7539.f18478) && AbstractC5227.m9466(this.f18477, c7539.f18477);
    }

    @Override // p072.InterfaceC7669
    public final InterfaceC7645 getMethod() {
        return this.f18476;
    }

    public final int hashCode() {
        int iHashCode = this.f18479.hashCode() * 31;
        Map map = this.f18478;
        return this.f18477.f19461.hashCode() + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetPromptRequest(name=");
        sb.append(this.f18479);
        sb.append(", arguments=");
        sb.append(this.f18478);
        sb.append(", _meta=");
        return AbstractC7012.m12139(sb, this.f18477, ')');
    }
}
