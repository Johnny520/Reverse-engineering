package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世楪哲兰苏子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6594 implements InterfaceC6840 {
    public static final C6593 Companion = new C6593();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6816 f17967;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7152 f17968;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17969;

    public C6594(int i, String str, C7152 c7152, InterfaceC6816 interfaceC6816) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6597.f17971.getDescriptor());
            throw null;
        }
        this.f17969 = str;
        if ((i & 2) == 0) {
            this.f17968 = AbstractC6602.f17976;
        } else {
            this.f17968 = c7152;
        }
        if ((i & 4) == 0) {
            this.f17967 = Method$Defined.ResourcesUnsubscribe;
        } else {
            this.f17967 = interfaceC6816;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6594)) {
            return false;
        }
        C6594 c6594 = (C6594) obj;
        return AbstractC4395.m8907(this.f17969, c6594.f17969) && AbstractC4395.m8907(this.f17968, c6594.f17968);
    }

    @Override // p056.InterfaceC6840
    public final InterfaceC6816 getMethod() {
        return this.f17967;
    }

    public final int hashCode() {
        return this.f17968.f19116.hashCode() + (this.f17969.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnsubscribeRequest(uri=");
        sb.append(this.f17969);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f17968, ')');
    }
}
