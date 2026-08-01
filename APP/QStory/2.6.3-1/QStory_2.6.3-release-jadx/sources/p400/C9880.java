package p400;

import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9880 {
    public static final C9879 Companion = new C9879();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9888 f25680;

    public /* synthetic */ C9880(int i, C9888 c9888) {
        if (1 == (i & 1)) {
            this.f25680 = c9888;
        } else {
            AbstractC7973.m12979(i, 1, C9875.f25678.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9880) && AbstractC5227.m9466(this.f25680, ((C9880) obj).f25680);
    }

    public final int hashCode() {
        return this.f25680.hashCode();
    }

    public final String toString() {
        return AbstractC9234.m14531(1400) + this.f25680 + ')';
    }

    public C9880(C9888 c9888) {
        AbstractC9234.m14531(1374);
        this.f25680 = c9888;
    }
}
