package p384;

import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9059 {
    public static final C9039 Companion = new C9039();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9065 f25351;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9057 f25352;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9058 f25353;

    public /* synthetic */ C9059(int i, C9058 c9058, C9057 c9057, C9065 c9065) {
        if (3 != (i & 3)) {
            AbstractC7144.m12420(i, 3, C9038.f25324.getDescriptor());
            throw null;
        }
        this.f25353 = c9058;
        this.f25352 = c9057;
        if ((i & 4) == 0) {
            this.f25351 = null;
        } else {
            this.f25351 = c9065;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C9059 m14613(C9059 c9059, C9065 c9065) {
        C9058 c9058 = c9059.f25353;
        C9057 c9057 = c9059.f25352;
        c9059.getClass();
        AbstractC8405.m13972(1415);
        c9058.getClass();
        AbstractC8405.m13972(1416);
        c9057.getClass();
        return new C9059(c9058, c9057, c9065);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9059)) {
            return false;
        }
        C9059 c9059 = (C9059) obj;
        return AbstractC4395.m8907(this.f25353, c9059.f25353) && AbstractC4395.m8907(this.f25352, c9059.f25352) && AbstractC4395.m8907(this.f25351, c9059.f25351);
    }

    public final int hashCode() {
        int iHashCode = (this.f25352.hashCode() + (this.f25353.hashCode() * 31)) * 31;
        C9065 c9065 = this.f25351;
        return iHashCode + (c9065 == null ? 0 : c9065.hashCode());
    }

    public final String toString() {
        return AbstractC8405.m13972(1465) + this.f25353 + AbstractC8405.m13972(1466) + this.f25352 + AbstractC8405.m13972(1467) + this.f25351 + ')';
    }

    public C9059(C9058 c9058, C9057 c9057, C9065 c9065) {
        AbstractC8405.m13972(1415);
        AbstractC8405.m13972(1416);
        this.f25353 = c9058;
        this.f25352 = c9057;
        this.f25351 = c9065;
    }
}
