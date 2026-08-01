package kotlin.reflect.jvm.internal;

import kotlin.C5175;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5110;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5017 extends AbstractC4959 implements InterfaceC5110 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C5021 f14477;

    public C5017(C5021 c5021) {
        this.f14477 = c5021;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        this.f14477.set(obj, obj2);
        return C5175.f14739;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4952
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final AbstractC4941 mo9952() {
        return this.f14477;
    }

    @Override // kotlin.reflect.InterfaceC5104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5087 mo9953() {
        return this.f14477;
    }
}
