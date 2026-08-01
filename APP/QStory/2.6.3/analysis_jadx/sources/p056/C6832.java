package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪苏世子哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6832 implements InterfaceC6840 {
    public static final C6848 Companion = new C6848();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6816 f18272;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7152 f18273;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18274;

    public C6832(int i, String str, C7152 c7152, InterfaceC6816 interfaceC6816) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6847.f18285.getDescriptor());
            throw null;
        }
        this.f18274 = str;
        if ((i & 2) == 0) {
            this.f18273 = AbstractC6602.f17976;
        } else {
            this.f18273 = c7152;
        }
        if ((i & 4) == 0) {
            this.f18272 = Method$Defined.ResourcesRead;
        } else {
            this.f18272 = interfaceC6816;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6832)) {
            return false;
        }
        C6832 c6832 = (C6832) obj;
        return AbstractC4395.m8907(this.f18274, c6832.f18274) && AbstractC4395.m8907(this.f18273, c6832.f18273);
    }

    @Override // p056.InterfaceC6840
    public final InterfaceC6816 getMethod() {
        return this.f18272;
    }

    public final int hashCode() {
        return this.f18273.f19116.hashCode() + (this.f18274.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReadResourceRequest(uri=");
        sb.append(this.f18274);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f18273, ')');
    }
}
