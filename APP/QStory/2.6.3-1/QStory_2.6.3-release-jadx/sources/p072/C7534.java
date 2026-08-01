package p072;

import androidx.window.area.C3391;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7534 implements InterfaceC7625 {
    public static final C7530 Companion = new C7530();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC6016[] f18465 = {AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C3391(25)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7981 f18466;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Boolean f18467;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18468;

    public C7534(int i, List list, Boolean bool, C7981 c7981) {
        if (1 != (i & 1)) {
            AbstractC7973.m12979(i, 1, C7531.f18459.getDescriptor());
            throw null;
        }
        this.f18468 = list;
        if ((i & 2) == 0) {
            this.f18467 = Boolean.FALSE;
        } else {
            this.f18467 = bool;
        }
        if ((i & 4) == 0) {
            this.f18466 = AbstractC7431.f18321;
        } else {
            this.f18466 = c7981;
        }
    }
}
