package androidx.compose.foundation.relocation;

import androidx.compose.foundation.gestures.C1365;
import androidx.compose.foundation.lazy.C1596;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.InterfaceC2611;
import androidx.compose.p001ui.relocation.InterfaceC2761;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7372;
import p128.C8157;

/* JADX INFO: renamed from: androidx.compose.foundation.relocation.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1611 extends AbstractC2961 implements InterfaceC2761, InterfaceC2611 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C1365 f2586;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f2587;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static final C8157 m2134(C1611 c1611, InterfaceC2530 interfaceC2530, InterfaceC7372 interfaceC7372) {
        C8157 c8157;
        if (c1611.f6624 && c1611.f2587) {
            AbstractC2629 abstractC2629M3909 = AbstractC2620.m3909(c1611);
            if (!interfaceC2530.mo3646()) {
                interfaceC2530 = null;
            }
            if (interfaceC2530 != null && (c8157 = (C8157) interfaceC7372.invoke()) != null) {
                return c8157.m13083(abstractC2629M3909.mo3649(interfaceC2530, false).m13077());
            }
        }
        return null;
    }

    @Override // androidx.compose.p001ui.relocation.InterfaceC2761
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Object mo2135(AbstractC2629 abstractC2629, InterfaceC7372 interfaceC7372, ContinuationImpl continuationImpl) throws Throwable {
        Object objM11066 = AbstractC6231.m11066(new BringIntoViewResponderNode$bringIntoView$2(this, abstractC2629, interfaceC7372, new C1596(this, abstractC2629, interfaceC7372, 1), null), continuationImpl);
        return objM11066 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM11066 : C6008.f15084;
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1853() {
        return false;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2611
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void mo2136(InterfaceC2530 interfaceC2530) {
        this.f2587 = true;
    }
}
