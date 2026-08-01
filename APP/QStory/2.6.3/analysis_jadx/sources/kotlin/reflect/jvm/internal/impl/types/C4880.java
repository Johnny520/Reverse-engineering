package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.C5028;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import p052.InterfaceC6543;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4880 extends AbstractC4882 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4847 f14185;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4845 f14186;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6543 f14187;

    public C4880(C4845 c4845, InterfaceC6543 interfaceC6543) {
        c4845.getClass();
        this.f14186 = c4845;
        this.f14187 = interfaceC6543;
        this.f14185 = new C4847(c4845, interfaceC6543);
    }

    public final String toString() {
        return this.f14185.m9575() ? m9773().toString() : "<Not computed yet>";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final AbstractC4914 mo9772() {
        AbstractC4882 abstractC4882M9773 = m9773();
        while (abstractC4882M9773 instanceof C4880) {
            abstractC4882M9773 = ((C4880) abstractC4882M9773).m9773();
        }
        abstractC4882M9773.getClass();
        return (AbstractC4914) abstractC4882M9773;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC4882 mo9721(AbstractC4861 abstractC4861) {
        abstractC4861.getClass();
        return new C4880(this.f14186, new C5028(abstractC4861, 11, this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC4873 mo9722() {
        return m9773().mo9722();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final C4874 mo9723() {
        return m9773().mo9723();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC7254 mo9724() {
        return m9773().mo9724();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo9725() {
        return m9773().mo9725();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final List mo9726() {
        return m9773().mo9726();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final AbstractC4882 m9773() {
        return (AbstractC4882) this.f14185.invoke();
    }
}
