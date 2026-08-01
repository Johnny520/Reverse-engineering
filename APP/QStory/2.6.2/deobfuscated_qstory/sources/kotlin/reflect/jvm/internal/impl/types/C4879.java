package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.C5027;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import p052.InterfaceC6542;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4879 extends AbstractC4881 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4846 f14181;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4844 f14182;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6542 f14183;

    public C4879(C4844 c4844, InterfaceC6542 interfaceC6542) {
        c4844.getClass();
        this.f14182 = c4844;
        this.f14183 = interfaceC6542;
        this.f14181 = new C4846(c4844, interfaceC6542);
    }

    public final String toString() {
        return this.f14181.m9585() ? m9779().toString() : "<Not computed yet>";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final AbstractC4913 mo9778() {
        AbstractC4881 abstractC4881M9779 = m9779();
        while (abstractC4881M9779 instanceof C4879) {
            abstractC4881M9779 = ((C4879) abstractC4881M9779).m9779();
        }
        abstractC4881M9779.getClass();
        return (AbstractC4913) abstractC4881M9779;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC4881 mo9731(AbstractC4860 abstractC4860) {
        abstractC4860.getClass();
        return new C4879(this.f14182, new C5027(abstractC4860, 11, this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC4872 mo9732() {
        return m9779().mo9732();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final C4873 mo9733() {
        return m9779().mo9733();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC7253 mo9734() {
        return m9779().mo9734();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo9735() {
        return m9779().mo9735();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final List mo9736() {
        return m9779().mo9736();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final AbstractC4881 m9779() {
        return (AbstractC4881) this.f14181.invoke();
    }
}
