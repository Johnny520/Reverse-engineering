package p056;

import androidx.window.area.C2558;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6704 implements InterfaceC6795 {
    public static final C6700 Companion = new C6700();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC5183[] f18125 = {AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C2558(25)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7151 f18126;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Boolean f18127;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18128;

    public C6704(int i, List list, Boolean bool, C7151 c7151) {
        if (1 != (i & 1)) {
            AbstractC7143.m12393(i, 1, C6701.f18119.getDescriptor());
            throw null;
        }
        this.f18128 = list;
        if ((i & 2) == 0) {
            this.f18127 = Boolean.FALSE;
        } else {
            this.f18127 = bool;
        }
        if ((i & 4) == 0) {
            this.f18126 = AbstractC6601.f17981;
        } else {
            this.f18126 = c7151;
        }
    }
}
