package p072;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7512 implements InterfaceC7669 {
    public static final C7513 Companion = new C7513();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7645 f18436;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7981 f18437;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7981 f18438;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18439;

    public C7512(int i, String str, C7981 c7981, C7981 c79812, InterfaceC7645 interfaceC7645) {
        if (1 != (i & 1)) {
            AbstractC7973.m12979(i, 1, C7514.f18440.getDescriptor());
            throw null;
        }
        this.f18439 = str;
        if ((i & 2) == 0) {
            this.f18438 = AbstractC7431.f18321;
        } else {
            this.f18438 = c7981;
        }
        if ((i & 4) == 0) {
            this.f18437 = AbstractC7431.f18321;
        } else {
            this.f18437 = c79812;
        }
        if ((i & 8) == 0) {
            this.f18436 = Method$Defined.ToolsCall;
        } else {
            this.f18436 = interfaceC7645;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7512)) {
            return false;
        }
        C7512 c7512 = (C7512) obj;
        return AbstractC5227.m9466(this.f18439, c7512.f18439) && AbstractC5227.m9466(this.f18438, c7512.f18438) && AbstractC5227.m9466(this.f18437, c7512.f18437);
    }

    @Override // p072.InterfaceC7669
    public final InterfaceC7645 getMethod() {
        return this.f18436;
    }

    public final int hashCode() {
        return this.f18437.f19461.hashCode() + AbstractC7012.m12130(this.f18438.f19461, this.f18439.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallToolRequest(name=");
        sb.append(this.f18439);
        sb.append(", arguments=");
        sb.append(this.f18438);
        sb.append(", _meta=");
        return AbstractC7012.m12139(sb, this.f18437, ')');
    }
}
