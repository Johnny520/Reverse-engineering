package androidx.compose.foundation.relocation;

import androidx.compose.foundation.gestures.C0524;
import androidx.compose.foundation.lazy.C0755;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.InterfaceC1776;
import androidx.compose.ui.relocation.InterfaceC1926;
import kotlin.C5175;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC5398;
import p052.InterfaceC6542;
import p112.C7327;

/* JADX INFO: renamed from: androidx.compose.foundation.relocation.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0771 extends AbstractC2128 implements InterfaceC1926, InterfaceC1776 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C0524 f2240;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f2241;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static final C7327 m1564(C0771 c0771, InterfaceC1695 interfaceC1695, InterfaceC6542 interfaceC6542) {
        C7327 c7327;
        if (c0771.f6278 && c0771.f2241) {
            AbstractC1794 abstractC1794M3339 = AbstractC1785.m3339(c0771);
            if (!interfaceC1695.mo3076()) {
                interfaceC1695 = null;
            }
            if (interfaceC1695 != null && (c7327 = (C7327) interfaceC6542.invoke()) != null) {
                return c7327.m12497(abstractC1794M3339.mo3079(interfaceC1695, false).m12491());
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.relocation.InterfaceC1926
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final Object mo1565(AbstractC1794 abstractC1794, InterfaceC6542 interfaceC6542, ContinuationImpl continuationImpl) throws Throwable {
        Object objM10503 = AbstractC5398.m10503(new BringIntoViewResponderNode$bringIntoView$2(this, abstractC1794, interfaceC6542, new C0755(this, abstractC1794, interfaceC6542, 1), null), continuationImpl);
        return objM10503 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10503 : C5175.f14739;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1283() {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1776
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void mo1566(InterfaceC1695 interfaceC1695) {
        this.f2241 = true;
    }
}
