package androidx.compose.foundation.interaction;

import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.AbstractC5321;
import kotlinx.coroutines.flow.C5286;

/* JADX INFO: renamed from: androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0573 implements InterfaceC0580 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5286 f1624 = AbstractC5321.m10329(1, BufferOverflow.DROP_OLDEST);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m1343(InterfaceC0582 interfaceC0582) {
        return this.f1624.mo10305(interfaceC0582);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m1344(InterfaceC0582 interfaceC0582, InterfaceC4356 interfaceC4356) throws Throwable {
        Object objEmit = this.f1624.emit(interfaceC0582, interfaceC4356);
        return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : C5175.f14739;
    }
}
