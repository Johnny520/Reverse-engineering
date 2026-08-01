package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6665 implements InterfaceC6840 {
    public static final C6668 Companion = new C6668();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6816 f18064;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7152 f18065;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18066;

    public C6665(int i, String str, C7152 c7152, InterfaceC6816 interfaceC6816) {
        this.f18066 = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.f18065 = AbstractC6602.f17976;
        } else {
            this.f18065 = c7152;
        }
        if ((i & 4) == 0) {
            this.f18064 = Method$Defined.PromptsList;
        } else {
            this.f18064 = interfaceC6816;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6665)) {
            return false;
        }
        C6665 c6665 = (C6665) obj;
        return AbstractC4395.m8907(this.f18066, c6665.f18066) && AbstractC4395.m8907(this.f18065, c6665.f18065);
    }

    @Override // p056.InterfaceC6840
    public final InterfaceC6816 getMethod() {
        return this.f18064;
    }

    public final int hashCode() {
        String str = this.f18066;
        return this.f18065.f19116.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListPromptsRequest(cursor=");
        sb.append(this.f18066);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f18065, ')');
    }
}
