package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.renderer.C4743;
import p097.InterfaceC7220;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4895 extends AbstractC4913 implements InterfaceC7220 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4877 f14212;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC4877 f14213;

    public AbstractC4895(AbstractC4877 abstractC4877, AbstractC4877 abstractC48772) {
        abstractC4877.getClass();
        abstractC48772.getClass();
        this.f14212 = abstractC4877;
        this.f14213 = abstractC48772;
    }

    public String toString() {
        return C4743.f13884.m9496(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC4872 mo9732() {
        return mo9842().mo9732();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final C4873 mo9733() {
        return mo9842().mo9733();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public InterfaceC7253 mo9734() {
        return mo9842().mo9734();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo9735() {
        return mo9842().mo9735();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final List mo9736() {
        return mo9842().mo9736();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public abstract String mo9841(C4743 c4743, C4743 c47432);

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public abstract AbstractC4877 mo9842();
}
