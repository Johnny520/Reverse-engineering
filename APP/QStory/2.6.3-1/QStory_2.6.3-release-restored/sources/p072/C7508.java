package p072;

import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7508 implements InterfaceC7490 {
    public static final C7509 Companion = new C7509();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC6016[] f18430 = {AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C7460(8)), null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7503 f18431;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7625 f18432;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18433;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7665 f18434;

    public /* synthetic */ C7508(int i, InterfaceC7665 interfaceC7665, String str, InterfaceC7625 interfaceC7625, C7503 c7503) {
        if (1 != (i & 1)) {
            AbstractC7973.m12979(i, 1, C7506.f18424.getDescriptor());
            throw null;
        }
        this.f18434 = interfaceC7665;
        if ((i & 2) == 0) {
            this.f18433 = "2.0";
        } else {
            this.f18433 = str;
        }
        if ((i & 4) == 0) {
            this.f18432 = null;
        } else {
            this.f18432 = interfaceC7625;
        }
        if ((i & 8) == 0) {
            this.f18431 = null;
        } else {
            this.f18431 = c7503;
        }
    }

    public C7508(InterfaceC7665 interfaceC7665, InterfaceC7625 interfaceC7625, C7503 c7503, int i) {
        interfaceC7625 = (i & 4) != 0 ? null : interfaceC7625;
        c7503 = (i & 8) != 0 ? null : c7503;
        interfaceC7665.getClass();
        this.f18434 = interfaceC7665;
        this.f18433 = "2.0";
        this.f18432 = interfaceC7625;
        this.f18431 = c7503;
    }
}
