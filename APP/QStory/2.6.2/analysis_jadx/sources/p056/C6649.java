package p056;

import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6649 implements InterfaceC6795 {
    public static final C6648 Companion = new C6648();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC5183[] f18048 = {AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C6630(10)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7151 f18049;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18050;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18051;

    public C6649(int i, String str, List list, C7151 c7151) {
        if (1 != (i & 1)) {
            AbstractC7143.m12393(i, 1, C6651.f18055.getDescriptor());
            throw null;
        }
        this.f18051 = list;
        if ((i & 2) == 0) {
            this.f18050 = null;
        } else {
            this.f18050 = str;
        }
        if ((i & 4) == 0) {
            this.f18049 = AbstractC6601.f17981;
        } else {
            this.f18049 = c7151;
        }
    }

    public C6649(EmptyList emptyList) {
        C7151 c7151 = AbstractC6601.f17981;
        emptyList.getClass();
        c7151.getClass();
        this.f18051 = emptyList;
        this.f18050 = null;
        this.f18049 = c7151;
    }
}
