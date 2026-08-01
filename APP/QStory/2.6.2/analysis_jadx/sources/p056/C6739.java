package p056;

import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世哲子苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6739 {
    public static final C6748 Companion = new C6748();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Boolean f18171;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18172;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18173;

    public /* synthetic */ C6739(int i, String str, String str2, Boolean bool) {
        if (7 != (i & 7)) {
            AbstractC7143.m12393(i, 7, C6749.f18181.getDescriptor());
            throw null;
        }
        this.f18173 = str;
        this.f18172 = str2;
        this.f18171 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6739)) {
            return false;
        }
        C6739 c6739 = (C6739) obj;
        return AbstractC4394.m8917(this.f18173, c6739.f18173) && AbstractC4394.m8917(this.f18172, c6739.f18172) && AbstractC4394.m8917(this.f18171, c6739.f18171);
    }

    public final int hashCode() {
        int iHashCode = this.f18173.hashCode() * 31;
        String str = this.f18172;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f18171;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "PromptArgument(name=" + this.f18173 + ", description=" + this.f18172 + ", required=" + this.f18171 + ')';
    }
}
