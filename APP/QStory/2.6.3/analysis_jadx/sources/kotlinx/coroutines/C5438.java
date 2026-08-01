package kotlinx.coroutines;

import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5438 extends C5460 implements InterfaceC5441 {
    public C5438(InterfaceC5452 interfaceC5452) {
        super(true);
        m10580(interfaceC5452);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final boolean m10529(Throwable th) {
        return m10588(new C5430(th, false));
    }

    @Override // kotlinx.coroutines.InterfaceC5408
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final Object mo10510() throws Throwable {
        Object objM10581 = m10581();
        if (objM10581 instanceof InterfaceC5470) {
            C5925.m11311("This job has not completed yet");
            return null;
        }
        if (objM10581 instanceof C5430) {
            throw ((C5430) objM10581).f15075;
        }
        return AbstractC5399.m10480(objM10581);
    }
}
