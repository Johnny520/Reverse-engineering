package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.renderer.C4744;
import p097.InterfaceC7221;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4896 extends AbstractC4914 implements InterfaceC7221 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4878 f14216;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC4878 f14217;

    public AbstractC4896(AbstractC4878 abstractC4878, AbstractC4878 abstractC48782) {
        abstractC4878.getClass();
        abstractC48782.getClass();
        this.f14216 = abstractC4878;
        this.f14217 = abstractC48782;
    }

    public String toString() {
        return C4744.f13888.m9486(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC4873 mo9722() {
        return mo9836().mo9722();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final C4874 mo9723() {
        return mo9836().mo9723();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public InterfaceC7254 mo9724() {
        return mo9836().mo9724();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo9725() {
        return mo9836().mo9725();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final List mo9726() {
        return mo9836().mo9726();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public abstract String mo9835(C4744 c4744, C4744 c47442);

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public abstract AbstractC4878 mo9836();
}
