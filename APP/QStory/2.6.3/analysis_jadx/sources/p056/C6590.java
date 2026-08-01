package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6590 implements InterfaceC6840 {
    public static final C6591 Companion = new C6591();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6816 f17963;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7152 f17964;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17965;

    public C6590(int i, String str, C7152 c7152, InterfaceC6816 interfaceC6816) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6592.f17966.getDescriptor());
            throw null;
        }
        this.f17965 = str;
        if ((i & 2) == 0) {
            this.f17964 = AbstractC6602.f17976;
        } else {
            this.f17964 = c7152;
        }
        if ((i & 4) == 0) {
            this.f17963 = Method$Defined.ResourcesSubscribe;
        } else {
            this.f17963 = interfaceC6816;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6590)) {
            return false;
        }
        C6590 c6590 = (C6590) obj;
        return AbstractC4395.m8907(this.f17965, c6590.f17965) && AbstractC4395.m8907(this.f17964, c6590.f17964);
    }

    @Override // p056.InterfaceC6840
    public final InterfaceC6816 getMethod() {
        return this.f17963;
    }

    public final int hashCode() {
        return this.f17964.f19116.hashCode() + (this.f17965.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscribeRequest(uri=");
        sb.append(this.f17965);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f17964, ')');
    }
}
