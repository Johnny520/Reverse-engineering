package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6641 implements InterfaceC6840 {
    public static final C6644 Companion = new C6644();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6816 f18033;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7152 f18034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18035;

    public C6641(int i, String str, C7152 c7152, InterfaceC6816 interfaceC6816) {
        this.f18035 = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.f18034 = AbstractC6602.f17976;
        } else {
            this.f18034 = c7152;
        }
        if ((i & 4) == 0) {
            this.f18033 = Method$Defined.ToolsList;
        } else {
            this.f18033 = interfaceC6816;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6641)) {
            return false;
        }
        C6641 c6641 = (C6641) obj;
        return AbstractC4395.m8907(this.f18035, c6641.f18035) && AbstractC4395.m8907(this.f18034, c6641.f18034);
    }

    @Override // p056.InterfaceC6840
    public final InterfaceC6816 getMethod() {
        return this.f18033;
    }

    public final int hashCode() {
        String str = this.f18035;
        return this.f18034.f19116.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListToolsRequest(cursor=");
        sb.append(this.f18035);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f18034, ')');
    }
}
