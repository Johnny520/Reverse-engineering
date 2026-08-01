package p104;

import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4565;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7286 extends AbstractC7290 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f19388;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7286 f19387 = new C7286("must have no value parameters", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7286 f19386 = new C7286("must have a single value parameter", 1);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7286(String str, int i) {
        super(str, 1);
        this.f19388 = i;
    }

    @Override // p104.InterfaceC7280
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12497(C4565 c4565) {
        switch (this.f19388) {
            case 0:
                return c4565.mo9035().isEmpty();
            default:
                return c4565.mo9035().size() == 1;
        }
    }
}
