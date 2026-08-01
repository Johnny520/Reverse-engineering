package p056;

import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6678 implements InterfaceC6660 {
    public static final C6679 Companion = new C6679();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5183[] f18090 = {AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C6630(8)), null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6673 f18091;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6795 f18092;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18093;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6835 f18094;

    public /* synthetic */ C6678(int i, InterfaceC6835 interfaceC6835, String str, InterfaceC6795 interfaceC6795, C6673 c6673) {
        if (1 != (i & 1)) {
            AbstractC7143.m12393(i, 1, C6676.f18084.getDescriptor());
            throw null;
        }
        this.f18094 = interfaceC6835;
        if ((i & 2) == 0) {
            this.f18093 = "2.0";
        } else {
            this.f18093 = str;
        }
        if ((i & 4) == 0) {
            this.f18092 = null;
        } else {
            this.f18092 = interfaceC6795;
        }
        if ((i & 8) == 0) {
            this.f18091 = null;
        } else {
            this.f18091 = c6673;
        }
    }

    public C6678(InterfaceC6835 interfaceC6835, InterfaceC6795 interfaceC6795, C6673 c6673, int i) {
        interfaceC6795 = (i & 4) != 0 ? null : interfaceC6795;
        c6673 = (i & 8) != 0 ? null : c6673;
        interfaceC6835.getClass();
        this.f18094 = interfaceC6835;
        this.f18093 = "2.0";
        this.f18092 = interfaceC6795;
        this.f18091 = c6673;
    }
}
