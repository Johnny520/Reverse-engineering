package p120;

import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C5397;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8115 extends AbstractC8119 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f19733;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8115 f19732 = new C8115("must have no value parameters", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8115 f19731 = new C8115("must have a single value parameter", 1);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8115(String str, int i) {
        super(str, 1);
        this.f19733 = i;
    }

    @Override // p120.InterfaceC8109
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo13056(C5397 c5397) {
        switch (this.f19733) {
            case 0:
                return c5397.mo9594().isEmpty();
            default:
                return c5397.mo9594().size() == 1;
        }
    }
}
