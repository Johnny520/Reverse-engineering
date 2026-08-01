package p056;

import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰苏哲子世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6776 {
    public static final C6773 Companion = new C6773();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Boolean f18212;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Boolean f18213;

    public /* synthetic */ C6776(int i, Boolean bool, Boolean bool2) {
        if (3 != (i & 3)) {
            AbstractC7144.m12420(i, 3, C6774.f18210.getDescriptor());
            throw null;
        }
        this.f18213 = bool;
        this.f18212 = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6776)) {
            return false;
        }
        C6776 c6776 = (C6776) obj;
        return AbstractC4395.m8907(this.f18213, c6776.f18213) && AbstractC4395.m8907(this.f18212, c6776.f18212);
    }

    public final int hashCode() {
        Boolean bool = this.f18213;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f18212;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "Resources(subscribe=" + this.f18213 + ", listChanged=" + this.f18212 + ')';
    }

    public C6776() {
        this.f18213 = null;
        this.f18212 = null;
    }
}
