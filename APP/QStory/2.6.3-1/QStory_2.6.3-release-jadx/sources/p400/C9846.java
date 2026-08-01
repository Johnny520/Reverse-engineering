package p400;

import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9846 {
    public static final C9850 Companion = new C9850();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9847 f25643;

    public /* synthetic */ C9846(int i, C9847 c9847) {
        if (1 == (i & 1)) {
            this.f25643 = c9847;
        } else {
            AbstractC7973.m12979(i, 1, C9866.f25668.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9846) && AbstractC5227.m9466(this.f25643, ((C9846) obj).f25643);
    }

    public final int hashCode() {
        return this.f25643.hashCode();
    }

    public final String toString() {
        return AbstractC9234.m14531(1427) + this.f25643 + ')';
    }

    public C9846(C9847 c9847) {
        AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜呜呜");
        this.f25643 = c9847;
    }
}
