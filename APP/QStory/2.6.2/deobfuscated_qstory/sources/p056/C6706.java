package p056;

import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6706 implements InterfaceC6795 {
    public static final C6707 Companion = new C6707();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC5183[] f18130 = {null, AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C6630(6)), null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7151 f18131;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f18132;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18133;

    public C6706(int i, String str, List list, C7151 c7151) {
        if (3 != (i & 3)) {
            AbstractC7143.m12393(i, 3, C6708.f18134.getDescriptor());
            throw null;
        }
        this.f18133 = str;
        this.f18132 = list;
        if ((i & 4) == 0) {
            this.f18131 = AbstractC6601.f17981;
        } else {
            this.f18131 = c7151;
        }
    }
}
