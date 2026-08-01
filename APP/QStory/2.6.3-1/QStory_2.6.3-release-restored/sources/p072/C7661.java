package p072;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪苏世子哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7661 implements InterfaceC7669 {
    public static final C7677 Companion = new C7677();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7645 f18617;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7981 f18618;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18619;

    public C7661(int i, String str, C7981 c7981, InterfaceC7645 interfaceC7645) {
        if (1 != (i & 1)) {
            AbstractC7973.m12979(i, 1, C7676.f18630.getDescriptor());
            throw null;
        }
        this.f18619 = str;
        if ((i & 2) == 0) {
            this.f18618 = AbstractC7431.f18321;
        } else {
            this.f18618 = c7981;
        }
        if ((i & 4) == 0) {
            this.f18617 = Method$Defined.ResourcesRead;
        } else {
            this.f18617 = interfaceC7645;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7661)) {
            return false;
        }
        C7661 c7661 = (C7661) obj;
        return AbstractC5227.m9466(this.f18619, c7661.f18619) && AbstractC5227.m9466(this.f18618, c7661.f18618);
    }

    @Override // p072.InterfaceC7669
    public final InterfaceC7645 getMethod() {
        return this.f18617;
    }

    public final int hashCode() {
        return this.f18618.f19461.hashCode() + (this.f18619.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReadResourceRequest(uri=");
        sb.append(this.f18619);
        sb.append(", _meta=");
        return AbstractC7012.m12139(sb, this.f18618, ')');
    }
}
