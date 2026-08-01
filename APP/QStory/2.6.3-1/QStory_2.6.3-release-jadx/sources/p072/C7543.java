package p072;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7543 implements InterfaceC7669 {
    public static final C7547 Companion = new C7547();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC7645 f18482;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7981 f18483;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7550 f18484;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7527 f18485;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18486;

    public C7543(int i, String str, C7527 c7527, C7550 c7550, C7981 c7981, InterfaceC7645 interfaceC7645) {
        if (7 != (i & 7)) {
            AbstractC7973.m12979(i, 7, C7546.f18491.getDescriptor());
            throw null;
        }
        this.f18486 = str;
        this.f18485 = c7527;
        this.f18484 = c7550;
        if ((i & 8) == 0) {
            this.f18483 = AbstractC7431.f18321;
        } else {
            this.f18483 = c7981;
        }
        if ((i & 16) == 0) {
            this.f18482 = Method$Defined.Initialize;
        } else {
            this.f18482 = interfaceC7645;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7543)) {
            return false;
        }
        C7543 c7543 = (C7543) obj;
        return AbstractC5227.m9466(this.f18486, c7543.f18486) && AbstractC5227.m9466(this.f18485, c7543.f18485) && AbstractC5227.m9466(this.f18484, c7543.f18484) && AbstractC5227.m9466(this.f18483, c7543.f18483);
    }

    @Override // p072.InterfaceC7669
    public final InterfaceC7645 getMethod() {
        return this.f18482;
    }

    public final int hashCode() {
        return this.f18483.f19461.hashCode() + ((this.f18484.hashCode() + ((this.f18485.hashCode() + (this.f18486.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InitializeRequest(protocolVersion=");
        sb.append(this.f18486);
        sb.append(", capabilities=");
        sb.append(this.f18485);
        sb.append(", clientInfo=");
        sb.append(this.f18484);
        sb.append(", _meta=");
        return AbstractC7012.m12139(sb, this.f18483, ')');
    }
}
