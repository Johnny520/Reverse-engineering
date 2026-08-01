package androidx.compose.foundation.interaction;

import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.AbstractC5322;
import kotlinx.coroutines.flow.C5287;

/* JADX INFO: renamed from: androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0573 implements InterfaceC0580 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5287 f1625 = AbstractC5322.m10333(1, BufferOverflow.DROP_OLDEST);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m1353(InterfaceC0582 interfaceC0582) {
        return this.f1625.mo10309(interfaceC0582);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m1354(InterfaceC0582 interfaceC0582, InterfaceC4357 interfaceC4357) throws Throwable {
        Object objEmit = this.f1625.emit(interfaceC0582, interfaceC4357);
        return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : C5176.f14739;
    }
}
