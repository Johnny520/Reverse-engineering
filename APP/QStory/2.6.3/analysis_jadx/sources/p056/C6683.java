package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6683 implements InterfaceC6840 {
    public static final C6684 Companion = new C6684();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6816 f18091;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7152 f18092;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7152 f18093;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18094;

    public C6683(int i, String str, C7152 c7152, C7152 c71522, InterfaceC6816 interfaceC6816) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6685.f18095.getDescriptor());
            throw null;
        }
        this.f18094 = str;
        if ((i & 2) == 0) {
            this.f18093 = AbstractC6602.f17976;
        } else {
            this.f18093 = c7152;
        }
        if ((i & 4) == 0) {
            this.f18092 = AbstractC6602.f17976;
        } else {
            this.f18092 = c71522;
        }
        if ((i & 8) == 0) {
            this.f18091 = Method$Defined.ToolsCall;
        } else {
            this.f18091 = interfaceC6816;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6683)) {
            return false;
        }
        C6683 c6683 = (C6683) obj;
        return AbstractC4395.m8907(this.f18094, c6683.f18094) && AbstractC4395.m8907(this.f18093, c6683.f18093) && AbstractC4395.m8907(this.f18092, c6683.f18092);
    }

    @Override // p056.InterfaceC6840
    public final InterfaceC6816 getMethod() {
        return this.f18091;
    }

    public final int hashCode() {
        return this.f18092.f19116.hashCode() + AbstractC6183.m11571(this.f18093.f19116, this.f18094.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallToolRequest(name=");
        sb.append(this.f18094);
        sb.append(", arguments=");
        sb.append(this.f18093);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f18092, ')');
    }
}
