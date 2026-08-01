package p056;

import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰苏哲子世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6775 {
    public static final C6772 Companion = new C6772();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Boolean f18217;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Boolean f18218;

    public /* synthetic */ C6775(int i, Boolean bool, Boolean bool2) {
        if (3 != (i & 3)) {
            AbstractC7143.m12393(i, 3, C6773.f18215.getDescriptor());
            throw null;
        }
        this.f18218 = bool;
        this.f18217 = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6775)) {
            return false;
        }
        C6775 c6775 = (C6775) obj;
        return AbstractC4394.m8917(this.f18218, c6775.f18218) && AbstractC4394.m8917(this.f18217, c6775.f18217);
    }

    public final int hashCode() {
        Boolean bool = this.f18218;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f18217;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "Resources(subscribe=" + this.f18218 + ", listChanged=" + this.f18217 + ')';
    }

    public C6775() {
        this.f18218 = null;
        this.f18217 = null;
    }
}
