package p072;

import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7484 implements InterfaceC7625 {
    public static final C7485 Companion = new C7485();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC6016[] f18399 = {AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C7460(12)), null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7981 f18400;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18401;

    public C7484(int i, List list, C7981 c7981) {
        if (1 != (i & 1)) {
            AbstractC7973.m12979(i, 1, C7482.f18396.getDescriptor());
            throw null;
        }
        this.f18401 = list;
        if ((i & 2) == 0) {
            this.f18400 = AbstractC7431.f18321;
        } else {
            this.f18400 = c7981;
        }
    }
}
