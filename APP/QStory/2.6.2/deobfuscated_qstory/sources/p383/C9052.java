package p383;

import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9052 {
    public static final C9030 Companion = new C9030();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9057 f25349;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9050 f25350;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9054 f25351;

    public /* synthetic */ C9052(int i, C9054 c9054, C9050 c9050, C9057 c9057) {
        if (3 != (i & 3)) {
            AbstractC7143.m12393(i, 3, C9033.f25330.getDescriptor());
            throw null;
        }
        this.f25351 = c9054;
        this.f25350 = c9050;
        if ((i & 4) == 0) {
            this.f25349 = null;
        } else {
            this.f25349 = c9057;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C9052 m14591(C9052 c9052, C9057 c9057) {
        C9054 c9054 = c9052.f25351;
        C9050 c9050 = c9052.f25350;
        c9052.getClass();
        "messageHead";
        c9054.getClass();
        "messageContentInfo";
        c9050.getClass();
        return new C9052(c9054, c9050, c9057);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9052)) {
            return false;
        }
        C9052 c9052 = (C9052) obj;
        return AbstractC4394.m8917(this.f25351, c9052.f25351) && AbstractC4394.m8917(this.f25350, c9052.f25350) && AbstractC4394.m8917(this.f25349, c9052.f25349);
    }

    public final int hashCode() {
        int iHashCode = (this.f25350.hashCode() + (this.f25351.hashCode() * 31)) * 31;
        C9057 c9057 = this.f25349;
        return iHashCode + (c9057 == null ? 0 : c9057.hashCode());
    }

    public final String toString() {
        return "QQMessage(messageHead=" + this.f25351 + ", messageContentInfo=" + this.f25350 + ", messageBody=" + this.f25349 + ')';
    }

    public C9052(C9054 c9054, C9050 c9050, C9057 c9057) {
        "messageHead";
        "messageContentInfo";
        this.f25351 = c9054;
        this.f25350 = c9050;
        this.f25349 = c9057;
    }
}
