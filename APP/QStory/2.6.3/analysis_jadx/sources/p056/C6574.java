package p056;

import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6574 {
    public static final C6575 Companion = new C6575();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6571 f17946;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17947;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17948;

    public /* synthetic */ C6574(int i, String str, String str2, C6571 c6571) {
        if (7 != (i & 7)) {
            AbstractC7144.m12420(i, 7, C6579.f17951.getDescriptor());
            throw null;
        }
        this.f17948 = str;
        this.f17947 = str2;
        this.f17946 = c6571;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6574)) {
            return false;
        }
        C6574 c6574 = (C6574) obj;
        return AbstractC4395.m8907(this.f17948, c6574.f17948) && AbstractC4395.m8907(this.f17947, c6574.f17947) && AbstractC4395.m8907(this.f17946, c6574.f17946);
    }

    public final int hashCode() {
        int iHashCode = this.f17948.hashCode() * 31;
        String str = this.f17947;
        return this.f17946.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Tool(name=" + this.f17948 + ", description=" + this.f17947 + ", inputSchema=" + this.f17946 + ')';
    }
}
