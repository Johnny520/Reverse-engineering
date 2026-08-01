package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世楪苏兰哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6604 implements InterfaceC6826 {
    public static final C6605 Companion = new C6605();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17985;

    public /* synthetic */ C6604(int i, String str) {
        if (1 == (i & 1)) {
            this.f17985 = str;
        } else {
            AbstractC7143.m12393(i, 1, C6606.f17986.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6604) && AbstractC4394.m8917(this.f17985, ((C6604) obj).f17985);
    }

    public final int hashCode() {
        return this.f17985.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("UnknownReference(type="), this.f17985, ')');
    }
}
