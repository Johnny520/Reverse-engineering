package kotlinx.coroutines.sync;

import kotlinx.coroutines.InterfaceC6230;
import kotlinx.coroutines.internal.AbstractC6193;
import kotlinx.coroutines.selects.InterfaceC6207;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6213 implements InterfaceC6207 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f15338;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C6212 f15339;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6207 f15340;

    public C6213(C6212 c6212, InterfaceC6207 interfaceC6207, Object obj) {
        this.f15339 = c6212;
        this.f15340 = interfaceC6207;
        this.f15338 = obj;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6200
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo10970(Object obj) {
        C6212.f15336.set(this.f15339, this.f15338);
        this.f15340.mo10970(obj);
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6200
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo10971(Object obj, Object obj2) {
        boolean zMo10971 = this.f15340.mo10971(obj, obj2);
        if (zMo10971) {
            C6212.f15336.set(this.f15339, this.f15338);
        }
        return zMo10971;
    }

    @Override // kotlinx.coroutines.InterfaceC6244
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10822(AbstractC6193 abstractC6193, int i) {
        this.f15340.mo10822(abstractC6193, i);
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6200
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo10972(InterfaceC6230 interfaceC6230) {
        this.f15340.mo10972(interfaceC6230);
    }
}
