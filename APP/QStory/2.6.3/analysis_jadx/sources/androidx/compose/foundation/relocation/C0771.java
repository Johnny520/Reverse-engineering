package androidx.compose.foundation.relocation;

import androidx.compose.foundation.gestures.C0524;
import androidx.compose.foundation.lazy.C0755;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.InterfaceC1776;
import androidx.compose.ui.relocation.InterfaceC1926;
import kotlin.C5176;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6543;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.relocation.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0771 extends AbstractC2128 implements InterfaceC1926, InterfaceC1776 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C0524 f2241;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f2242;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static final C7328 m1574(C0771 c0771, InterfaceC1695 interfaceC1695, InterfaceC6543 interfaceC6543) {
        C7328 c7328;
        if (c0771.f6279 && c0771.f2242) {
            AbstractC1794 abstractC1794M3349 = AbstractC1785.m3349(c0771);
            if (!interfaceC1695.mo3086()) {
                interfaceC1695 = null;
            }
            if (interfaceC1695 != null && (c7328 = (C7328) interfaceC6543.invoke()) != null) {
                return c7328.m12524(abstractC1794M3349.mo3089(interfaceC1695, false).m12518());
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.relocation.InterfaceC1926
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Object mo1575(AbstractC1794 abstractC1794, InterfaceC6543 interfaceC6543, ContinuationImpl continuationImpl) throws Throwable {
        Object objM10507 = AbstractC5399.m10507(new BringIntoViewResponderNode$bringIntoView$2(this, abstractC1794, interfaceC6543, new C0755(this, abstractC1794, interfaceC6543, 1), null), continuationImpl);
        return objM10507 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10507 : C5176.f14739;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1293() {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1776
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void mo1576(InterfaceC1695 interfaceC1695) {
        this.f2242 = true;
    }
}
