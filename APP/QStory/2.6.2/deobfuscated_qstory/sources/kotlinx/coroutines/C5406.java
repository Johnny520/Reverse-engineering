package kotlinx.coroutines;

import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5406 extends AbstractC5428 implements InterfaceC5407 {
    @Override // kotlinx.coroutines.InterfaceC5407
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Object mo10506() throws Throwable {
        Object objM10578 = m10578();
        if (objM10578 instanceof InterfaceC5469) {
            C5919.m11250("This job has not completed yet");
            return null;
        }
        if (objM10578 instanceof C5429) {
            throw ((C5429) objM10578).f15075;
        }
        return AbstractC5398.m10476(objM10578);
    }
}
