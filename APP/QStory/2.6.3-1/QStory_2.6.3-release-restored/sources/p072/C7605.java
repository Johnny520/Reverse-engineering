package p072;

import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰苏哲子世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7605 {
    public static final C7602 Companion = new C7602();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Boolean f18557;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Boolean f18558;

    public /* synthetic */ C7605(int i, Boolean bool, Boolean bool2) {
        if (3 != (i & 3)) {
            AbstractC7973.m12979(i, 3, C7603.f18555.getDescriptor());
            throw null;
        }
        this.f18558 = bool;
        this.f18557 = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7605)) {
            return false;
        }
        C7605 c7605 = (C7605) obj;
        return AbstractC5227.m9466(this.f18558, c7605.f18558) && AbstractC5227.m9466(this.f18557, c7605.f18557);
    }

    public final int hashCode() {
        Boolean bool = this.f18558;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f18557;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "Resources(subscribe=" + this.f18558 + ", listChanged=" + this.f18557 + ')';
    }

    public C7605() {
        this.f18558 = null;
        this.f18557 = null;
    }
}
