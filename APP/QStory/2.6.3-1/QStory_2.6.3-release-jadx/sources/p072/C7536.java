package p072;

import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7536 implements InterfaceC7625 {
    public static final C7537 Companion = new C7537();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC6016[] f18470 = {null, AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C7460(6)), null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7981 f18471;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f18472;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18473;

    public C7536(int i, String str, List list, C7981 c7981) {
        if (3 != (i & 3)) {
            AbstractC7973.m12979(i, 3, C7538.f18474.getDescriptor());
            throw null;
        }
        this.f18473 = str;
        this.f18472 = list;
        if ((i & 4) == 0) {
            this.f18471 = AbstractC7431.f18321;
        } else {
            this.f18471 = c7981;
        }
    }
}
