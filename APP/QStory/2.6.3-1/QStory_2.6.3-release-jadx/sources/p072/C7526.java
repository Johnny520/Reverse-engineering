package p072;

import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7526 {
    public static final C7529 Companion = new C7529();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Boolean f18454;

    public /* synthetic */ C7526(int i, Boolean bool) {
        if (1 == (i & 1)) {
            this.f18454 = bool;
        } else {
            AbstractC7973.m12979(i, 1, C7528.f18458.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7526) && AbstractC5227.m9466(this.f18454, ((C7526) obj).f18454);
    }

    public final int hashCode() {
        Boolean bool = this.f18454;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "Roots(listChanged=" + this.f18454 + ')';
    }
}
