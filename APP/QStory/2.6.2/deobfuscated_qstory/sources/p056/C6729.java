package p056;

import androidx.activity.AbstractC0053;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6729 implements InterfaceC6726 {
    public static final C6728 Companion = new C6728();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f18162;

    public /* synthetic */ C6729(int i, int i2) {
        if (1 == (i & 1)) {
            this.f18162 = i2;
        } else {
            AbstractC7143.m12393(i, 1, C6724.f18159.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6729) && this.f18162 == ((C6729) obj).f18162;
    }

    @Override // p056.InterfaceC6726
    public final int getCode() {
        return this.f18162;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18162);
    }

    public final String toString() {
        return AbstractC0053.m154(new StringBuilder("Unknown(code="), this.f18162, ')');
    }

    public C6729(int i) {
        this.f18162 = i;
    }
}
