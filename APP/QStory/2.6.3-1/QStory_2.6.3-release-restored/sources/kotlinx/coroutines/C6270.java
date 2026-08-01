package kotlinx.coroutines;

import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6270 extends C6292 implements InterfaceC6273 {
    public C6270(InterfaceC6284 interfaceC6284) {
        super(true);
        m11139(interfaceC6284);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final boolean m11088(Throwable th) {
        return m11147(new C6262(th, false));
    }

    @Override // kotlinx.coroutines.InterfaceC6240
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
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
