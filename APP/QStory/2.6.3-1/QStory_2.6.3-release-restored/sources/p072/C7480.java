package p072;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7480 implements InterfaceC7669 {
    public static final C7476 Companion = new C7476();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7645 f18392;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7981 f18393;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18394;

    public C7480(int i, String str, C7981 c7981, InterfaceC7645 interfaceC7645) {
        if (1 != (i & 1)) {
            AbstractC7973.m12979(i, 1, C7477.f18387.getDescriptor());
            throw null;
        }
        this.f18394 = str;
        if ((i & 2) == 0) {
            this.f18393 = AbstractC7431.f18321;
        } else {
            this.f18393 = c7981;
        }
        if ((i & 4) == 0) {
            this.f18392 = Method$Defined.ResourcesTemplatesList;
        } else {
            this.f18392 = interfaceC7645;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7480)) {
            return false;
        }
        C7480 c7480 = (C7480) obj;
        return AbstractC5227.m9466(this.f18394, c7480.f18394) && AbstractC5227.m9466(this.f18393, c7480.f18393);
    }

    @Override // p072.InterfaceC7669
    public final InterfaceC7645 getMethod() {
        return this.f18392;
    }

    public final int hashCode() {
        String str = this.f18394;
        return this.f18393.f19461.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListResourceTemplatesRequest(cursor=");
        sb.append(this.f18394);
        sb.append(", _meta=");
        return AbstractC7012.m12139(sb, this.f18393, ')');
    }
}
