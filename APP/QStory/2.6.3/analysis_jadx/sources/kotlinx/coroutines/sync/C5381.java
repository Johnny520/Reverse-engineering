package kotlinx.coroutines.sync;

import kotlinx.coroutines.InterfaceC5398;
import kotlinx.coroutines.internal.AbstractC5361;
import kotlinx.coroutines.selects.InterfaceC5375;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5381 implements InterfaceC5375 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f14993;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C5380 f14994;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5375 f14995;

    public C5381(C5380 c5380, InterfaceC5375 interfaceC5375, Object obj) {
        this.f14994 = c5380;
        this.f14995 = interfaceC5375;
        this.f14993 = obj;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC5368
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo10411(Object obj) {
        C5380.f14991.set(this.f14994, this.f14993);
        this.f14995.mo10411(obj);
    }

    @Override // kotlinx.coroutines.selects.InterfaceC5368
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo10412(Object obj, Object obj2) {
        boolean zMo10412 = this.f14995.mo10412(obj, obj2);
        if (zMo10412) {
            C5380.f14991.set(this.f14994, this.f14993);
        }
        return zMo10412;
    }

    @Override // kotlinx.coroutines.InterfaceC5412
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10263(AbstractC5361 abstractC5361, int i) {
        this.f14995.mo10263(abstractC5361, i);
    }

    @Override // kotlinx.coroutines.selects.InterfaceC5368
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo10413(InterfaceC5398 interfaceC5398) {
        this.f14995.mo10413(interfaceC5398);
    }
}
