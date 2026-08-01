package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世楪子兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6598 implements InterfaceC6731 {
    public static final C6599 Companion = new C6599();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17979;

    public /* synthetic */ C6598(int i, String str) {
        if (1 == (i & 1)) {
            this.f17979 = str;
        } else {
            AbstractC7143.m12393(i, 1, C6600.f17980.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6598) && AbstractC4394.m8917(this.f17979, ((C6598) obj).f17979);
    }

    public final int hashCode() {
        return this.f17979.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("UnknownContent(type="), this.f17979, ')');
    }
}
