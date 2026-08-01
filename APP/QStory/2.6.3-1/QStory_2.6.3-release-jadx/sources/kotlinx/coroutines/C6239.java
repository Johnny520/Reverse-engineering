package kotlinx.coroutines;

import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6239 extends AbstractC6261 implements InterfaceC6240 {
    @Override // kotlinx.coroutines.InterfaceC6240
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Object mo11069() throws Throwable {
        Object objM11140 = m11140();
        if (objM11140 instanceof InterfaceC6302) {
            C6755.m11870("This job has not completed yet");
            return null;
        }
        if (objM11140 instanceof C6262) {
            throw ((C6262) objM11140).f15420;
        }
        return AbstractC6231.m11039(objM11140);
    }
}
