package retrofit2;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5799 implements InterfaceC5795 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Type f15896;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15897;

    public /* synthetic */ C5799(int i, Type type) {
        this.f15897 = i;
        this.f15896 = type;
    }

    @Override // retrofit2.InterfaceC5795
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final Type mo9753() {
        int i = this.f15897;
        return this.f15896;
    }

    @Override // retrofit2.InterfaceC5795
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public final Object mo9762(C5767 c5767) {
        switch (this.f15897) {
            case 0:
                C5796 c5796 = new C5796(c5767);
                c5767.mo11106(new C5798(c5796, 0));
                return c5796;
            default:
                C5796 c57962 = new C5796(c5767);
                c5767.mo11106(new C5798(c57962, 1));
                return c57962;
        }
    }
}
