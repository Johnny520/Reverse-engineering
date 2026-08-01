package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import java.util.Map;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6710 implements InterfaceC6840 {
    public static final C6711 Companion = new C6711();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5184[] f18130 = {null, AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(5)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6816 f18131;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7152 f18132;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Map f18133;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18134;

    public C6710(int i, String str, Map map, C7152 c7152, InterfaceC6816 interfaceC6816) {
        if (3 != (i & 3)) {
            AbstractC7144.m12420(i, 3, C6712.f18135.getDescriptor());
            throw null;
        }
        this.f18134 = str;
        this.f18133 = map;
        if ((i & 4) == 0) {
            this.f18132 = AbstractC6602.f17976;
        } else {
            this.f18132 = c7152;
        }
        if ((i & 8) == 0) {
            this.f18131 = Method$Defined.PromptsGet;
        } else {
            this.f18131 = interfaceC6816;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6710)) {
            return false;
        }
        C6710 c6710 = (C6710) obj;
        return AbstractC4395.m8907(this.f18134, c6710.f18134) && AbstractC4395.m8907(this.f18133, c6710.f18133) && AbstractC4395.m8907(this.f18132, c6710.f18132);
    }

    @Override // p056.InterfaceC6840
    public final InterfaceC6816 getMethod() {
        return this.f18131;
    }

    public final int hashCode() {
        int iHashCode = this.f18134.hashCode() * 31;
        Map map = this.f18133;
        return this.f18132.f19116.hashCode() + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetPromptRequest(name=");
        sb.append(this.f18134);
        sb.append(", arguments=");
        sb.append(this.f18133);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f18132, ')');
    }
}
