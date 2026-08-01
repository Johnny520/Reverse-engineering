package p384;

import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9051 {
    public static final C9050 Companion = new C9050();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9059 f25335;

    public /* synthetic */ C9051(int i, C9059 c9059) {
        if (1 == (i & 1)) {
            this.f25335 = c9059;
        } else {
            AbstractC7144.m12420(i, 1, C9046.f25333.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9051) && AbstractC4395.m8907(this.f25335, ((C9051) obj).f25335);
    }

    public final int hashCode() {
        return this.f25335.hashCode();
    }

    public final String toString() {
        return AbstractC8405.m13972(1400) + this.f25335 + ')';
    }

    public C9051(C9059 c9059) {
        AbstractC8405.m13972(1374);
        this.f25335 = c9059;
    }
}
