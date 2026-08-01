package retrofit2;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6630 implements InterfaceC6626 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Type f16241;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16242;

    public /* synthetic */ C6630(int i, Type type) {
        this.f16242 = i;
        this.f16241 = type;
    }

    @Override // retrofit2.InterfaceC6626
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final Type mo10304() {
        int i = this.f16242;
        return this.f16241;
    }

    @Override // retrofit2.InterfaceC6626
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public final Object mo10313(C6598 c6598) {
        switch (this.f16242) {
            case 0:
                C6627 c6627 = new C6627(c6598);
                c6598.mo11722(new C6629(c6627, 0));
                return c6627;
            default:
                C6627 c66272 = new C6627(c6598);
                c6598.mo11722(new C6629(c66272, 1));
                return c66272;
        }
    }
}
