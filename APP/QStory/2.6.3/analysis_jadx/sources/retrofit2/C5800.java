package retrofit2;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5800 implements InterfaceC5796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Type f15896;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15897;

    public /* synthetic */ C5800(int i, Type type) {
        this.f15897 = i;
        this.f15896 = type;
    }

    @Override // retrofit2.InterfaceC5796
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final Type mo9745() {
        int i = this.f15897;
        return this.f15896;
    }

    @Override // retrofit2.InterfaceC5796
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public final Object mo9754(C5768 c5768) {
        switch (this.f15897) {
            case 0:
                C5797 c5797 = new C5797(c5768);
                c5768.mo11163(new C5799(c5797, 0));
                return c5797;
            default:
                C5797 c57972 = new C5797(c5768);
                c5768.mo11163(new C5799(c57972, 1));
                return c57972;
        }
    }
}
