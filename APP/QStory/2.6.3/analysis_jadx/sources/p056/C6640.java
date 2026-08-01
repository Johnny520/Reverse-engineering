package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6640 implements InterfaceC6840 {
    public static final C6637 Companion = new C6637();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6816 f18030;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7152 f18031;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18032;

    public C6640(int i, String str, C7152 c7152, InterfaceC6816 interfaceC6816) {
        this.f18032 = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.f18031 = AbstractC6602.f17976;
        } else {
            this.f18031 = c7152;
        }
        if ((i & 4) == 0) {
            this.f18030 = Method$Defined.ResourcesList;
        } else {
            this.f18030 = interfaceC6816;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6640)) {
            return false;
        }
        C6640 c6640 = (C6640) obj;
        return AbstractC4395.m8907(this.f18032, c6640.f18032) && AbstractC4395.m8907(this.f18031, c6640.f18031);
    }

    @Override // p056.InterfaceC6840
    public final InterfaceC6816 getMethod() {
        return this.f18030;
    }

    public final int hashCode() {
        String str = this.f18032;
        return this.f18031.f19116.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListResourcesRequest(cursor=");
        sb.append(this.f18032);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f18031, ')');
    }
}
