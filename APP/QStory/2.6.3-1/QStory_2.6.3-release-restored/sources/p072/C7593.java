package p072;

import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰哲子苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7593 {
    public static final C7592 Companion = new C7592();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Boolean f18547;

    public /* synthetic */ C7593(int i, Boolean bool) {
        if (1 == (i & 1)) {
            this.f18547 = bool;
        } else {
            AbstractC7973.m12979(i, 1, C7604.f18556.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7593) && AbstractC5227.m9466(this.f18547, ((C7593) obj).f18547);
    }

    public final int hashCode() {
        Boolean bool = this.f18547;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "Tools(listChanged=" + this.f18547 + ')';
    }

    public C7593() {
        this.f18547 = null;
    }
}
