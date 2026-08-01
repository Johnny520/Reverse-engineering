package p056;

import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4394;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6570 {
    public static final C6571 Companion = new C6571();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC5183[] f17946 = {null, AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C6630(28)), null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f17947;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f17948;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7151 f17949;

    public C6570(int i, String str, List list, C7151 c7151) {
        this.f17949 = (i & 1) == 0 ? AbstractC6601.f17981 : c7151;
        this.f17948 = (i & 2) == 0 ? null : list;
        if ((i & 4) == 0) {
            this.f17947 = "object";
        } else {
            this.f17947 = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6570)) {
            return false;
        }
        C6570 c6570 = (C6570) obj;
        return AbstractC4394.m8917(this.f17949, c6570.f17949) && AbstractC4394.m8917(this.f17948, c6570.f17948);
    }

    public final int hashCode() {
        int iHashCode = this.f17949.f19121.hashCode() * 31;
        List list = this.f17948;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Input(properties=" + this.f17949 + ", required=" + this.f17948 + ')';
    }
}
