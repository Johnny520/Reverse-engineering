package p384;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4395;
import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9065 {
    public static final C9016 Companion = new C9016();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte[] f25360;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9064 f25361;

    public /* synthetic */ C9065(int i, C9064 c9064, byte[] bArr) {
        this.f25361 = (i & 1) == 0 ? null : c9064;
        if ((i & 2) == 0) {
            this.f25360 = new byte[0];
        } else {
            this.f25360 = bArr;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C9065 m14614(C9065 c9065, byte[] bArr) {
        C9064 c9064 = c9065.f25361;
        c9065.getClass();
        AbstractC8405.m13972(1419);
        return new C9065(c9064, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C9065.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC8405.m13972(1448);
        obj.getClass();
        C9065 c9065 = (C9065) obj;
        return AbstractC4395.m8907(this.f25361, c9065.f25361) && Arrays.equals(this.f25360, c9065.f25360);
    }

    public final int hashCode() {
        C9064 c9064 = this.f25361;
        return Arrays.hashCode(this.f25360) + ((c9064 != null ? c9064.f25359.hashCode() : 0) * 31);
    }

    public final String toString() {
        return AbstractC8405.m13972(1449) + this.f25361 + AbstractC8405.m13972(1450) + Arrays.toString(this.f25360) + ')';
    }

    public C9065(C9064 c9064, byte[] bArr) {
        AbstractC8405.m13972(1419);
        this.f25361 = c9064;
        this.f25360 = bArr;
    }
}
