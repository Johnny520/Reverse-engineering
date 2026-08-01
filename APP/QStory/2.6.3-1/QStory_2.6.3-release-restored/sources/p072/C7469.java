package p072;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7469 implements InterfaceC7669 {
    public static final C7466 Companion = new C7466();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7645 f18375;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7981 f18376;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18377;

    public C7469(int i, String str, C7981 c7981, InterfaceC7645 interfaceC7645) {
        this.f18377 = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.f18376 = AbstractC7431.f18321;
        } else {
            this.f18376 = c7981;
        }
        if ((i & 4) == 0) {
            this.f18375 = Method$Defined.ResourcesList;
        } else {
            this.f18375 = interfaceC7645;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7469)) {
            return false;
        }
        C7469 c7469 = (C7469) obj;
        return AbstractC5227.m9466(this.f18377, c7469.f18377) && AbstractC5227.m9466(this.f18376, c7469.f18376);
    }

    @Override // p072.InterfaceC7669
    public final InterfaceC7645 getMethod() {
        return this.f18375;
    }

    public final int hashCode() {
        String str = this.f18377;
        return this.f18376.f19461.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListResourcesRequest(cursor=");
        sb.append(this.f18377);
        sb.append(", _meta=");
        return AbstractC7012.m12139(sb, this.f18376, ')');
    }
}
