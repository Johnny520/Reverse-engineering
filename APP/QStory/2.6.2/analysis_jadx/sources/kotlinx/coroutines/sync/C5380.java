package kotlinx.coroutines.sync;

import kotlinx.coroutines.InterfaceC5397;
import kotlinx.coroutines.internal.AbstractC5360;
import kotlinx.coroutines.selects.InterfaceC5374;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5380 implements InterfaceC5374 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f14993;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C5379 f14994;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5374 f14995;

    public C5380(C5379 c5379, InterfaceC5374 interfaceC5374, Object obj) {
        this.f14994 = c5379;
        this.f14995 = interfaceC5374;
        this.f14993 = obj;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC5367
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo10407(Object obj) {
        C5379.f14991.set(this.f14994, this.f14993);
        this.f14995.mo10407(obj);
    }

    @Override // kotlinx.coroutines.selects.InterfaceC5367
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo10408(Object obj, Object obj2) {
        boolean zMo10408 = this.f14995.mo10408(obj, obj2);
        if (zMo10408) {
            C5379.f14991.set(this.f14994, this.f14993);
        }
        return zMo10408;
    }

    @Override // kotlinx.coroutines.InterfaceC5411
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10259(AbstractC5360 abstractC5360, int i) {
        this.f14995.mo10259(abstractC5360, i);
    }

    @Override // kotlinx.coroutines.selects.InterfaceC5367
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo10409(InterfaceC5397 interfaceC5397) {
        this.f14995.mo10409(interfaceC5397);
    }
}
