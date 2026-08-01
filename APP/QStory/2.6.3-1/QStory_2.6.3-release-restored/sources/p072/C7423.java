package p072;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世楪哲兰苏子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7423 implements InterfaceC7669 {
    public static final C7422 Companion = new C7422();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7645 f18312;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7981 f18313;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18314;

    public C7423(int i, String str, C7981 c7981, InterfaceC7645 interfaceC7645) {
        if (1 != (i & 1)) {
            AbstractC7973.m12979(i, 1, C7426.f18316.getDescriptor());
            throw null;
        }
        this.f18314 = str;
        if ((i & 2) == 0) {
            this.f18313 = AbstractC7431.f18321;
        } else {
            this.f18313 = c7981;
        }
        if ((i & 4) == 0) {
            this.f18312 = Method$Defined.ResourcesUnsubscribe;
        } else {
            this.f18312 = interfaceC7645;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7423)) {
            return false;
        }
        C7423 c7423 = (C7423) obj;
        return AbstractC5227.m9466(this.f18314, c7423.f18314) && AbstractC5227.m9466(this.f18313, c7423.f18313);
    }

    @Override // p072.InterfaceC7669
    public final InterfaceC7645 getMethod() {
        return this.f18312;
    }

    public final int hashCode() {
        return this.f18313.f19461.hashCode() + (this.f18314.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnsubscribeRequest(uri=");
        sb.append(this.f18314);
        sb.append(", _meta=");
        return AbstractC7012.m12139(sb, this.f18313, ')');
    }
}
