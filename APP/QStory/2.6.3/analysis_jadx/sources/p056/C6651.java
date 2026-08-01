package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6651 implements InterfaceC6840 {
    public static final C6647 Companion = new C6647();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6816 f18047;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7152 f18048;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18049;

    public C6651(int i, String str, C7152 c7152, InterfaceC6816 interfaceC6816) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6648.f18042.getDescriptor());
            throw null;
        }
        this.f18049 = str;
        if ((i & 2) == 0) {
            this.f18048 = AbstractC6602.f17976;
        } else {
            this.f18048 = c7152;
        }
        if ((i & 4) == 0) {
            this.f18047 = Method$Defined.ResourcesTemplatesList;
        } else {
            this.f18047 = interfaceC6816;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6651)) {
            return false;
        }
        C6651 c6651 = (C6651) obj;
        return AbstractC4395.m8907(this.f18049, c6651.f18049) && AbstractC4395.m8907(this.f18048, c6651.f18048);
    }

    @Override // p056.InterfaceC6840
    public final InterfaceC6816 getMethod() {
        return this.f18047;
    }

    public final int hashCode() {
        String str = this.f18049;
        return this.f18048.f19116.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListResourceTemplatesRequest(cursor=");
        sb.append(this.f18049);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f18048, ')');
    }
}
