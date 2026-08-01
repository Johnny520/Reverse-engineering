package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6714 implements InterfaceC6840 {
    public static final C6718 Companion = new C6718();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6816 f18137;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7152 f18138;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6721 f18139;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6698 f18140;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18141;

    public C6714(int i, String str, C6698 c6698, C6721 c6721, C7152 c7152, InterfaceC6816 interfaceC6816) {
        if (7 != (i & 7)) {
            AbstractC7144.m12420(i, 7, C6717.f18146.getDescriptor());
            throw null;
        }
        this.f18141 = str;
        this.f18140 = c6698;
        this.f18139 = c6721;
        if ((i & 8) == 0) {
            this.f18138 = AbstractC6602.f17976;
        } else {
            this.f18138 = c7152;
        }
        if ((i & 16) == 0) {
            this.f18137 = Method$Defined.Initialize;
        } else {
            this.f18137 = interfaceC6816;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6714)) {
            return false;
        }
        C6714 c6714 = (C6714) obj;
        return AbstractC4395.m8907(this.f18141, c6714.f18141) && AbstractC4395.m8907(this.f18140, c6714.f18140) && AbstractC4395.m8907(this.f18139, c6714.f18139) && AbstractC4395.m8907(this.f18138, c6714.f18138);
    }

    @Override // p056.InterfaceC6840
    public final InterfaceC6816 getMethod() {
        return this.f18137;
    }

    public final int hashCode() {
        return this.f18138.f19116.hashCode() + ((this.f18139.hashCode() + ((this.f18140.hashCode() + (this.f18141.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InitializeRequest(protocolVersion=");
        sb.append(this.f18141);
        sb.append(", capabilities=");
        sb.append(this.f18140);
        sb.append(", clientInfo=");
        sb.append(this.f18139);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f18138, ')');
    }
}
