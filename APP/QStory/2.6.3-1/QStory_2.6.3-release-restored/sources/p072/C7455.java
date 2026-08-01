package p072;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7455 implements InterfaceC7669 {
    public static final C7456 Companion = new C7456();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7645 f18355;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7981 f18356;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7457 f18357;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7656 f18358;

    public C7455(int i, InterfaceC7656 interfaceC7656, C7457 c7457, C7981 c7981, InterfaceC7645 interfaceC7645) {
        if (3 != (i & 3)) {
            AbstractC7973.m12979(i, 3, C7523.f18452.getDescriptor());
            throw null;
        }
        this.f18358 = interfaceC7656;
        this.f18357 = c7457;
        if ((i & 4) == 0) {
            this.f18356 = AbstractC7431.f18321;
        } else {
            this.f18356 = c7981;
        }
        if ((i & 8) == 0) {
            this.f18355 = Method$Defined.CompletionComplete;
        } else {
            this.f18355 = interfaceC7645;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7455)) {
            return false;
        }
        C7455 c7455 = (C7455) obj;
        return AbstractC5227.m9466(this.f18358, c7455.f18358) && AbstractC5227.m9466(this.f18357, c7455.f18357) && AbstractC5227.m9466(this.f18356, c7455.f18356);
    }

    @Override // p072.InterfaceC7669
    public final InterfaceC7645 getMethod() {
        return this.f18355;
    }

    public final int hashCode() {
        return this.f18356.f19461.hashCode() + ((this.f18357.hashCode() + (this.f18358.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompleteRequest(ref=");
        sb.append(this.f18358);
        sb.append(", argument=");
        sb.append(this.f18357);
        sb.append(", _meta=");
        return AbstractC7012.m12139(sb, this.f18356, ')');
    }
}
