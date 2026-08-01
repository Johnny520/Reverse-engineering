package p056;

import androidx.window.area.C2558;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6692 implements InterfaceC6795 {
    public static final C6688 Companion = new C6688();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5183[] f18107 = {AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C2558(27)), null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7151 f18108;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7151 f18109;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Boolean f18110;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18111;

    public C6692(int i, List list, Boolean bool, C7151 c7151, C7151 c71512) {
        if (1 != (i & 1)) {
            AbstractC7143.m12393(i, 1, C6689.f18105.getDescriptor());
            throw null;
        }
        this.f18111 = list;
        if ((i & 2) == 0) {
            this.f18110 = Boolean.FALSE;
        } else {
            this.f18110 = bool;
        }
        if ((i & 4) == 0) {
            this.f18109 = AbstractC6601.f17981;
        } else {
            this.f18109 = c7151;
        }
        if ((i & 8) == 0) {
            this.f18108 = AbstractC6601.f17981;
        } else {
            this.f18108 = c71512;
        }
    }
}
