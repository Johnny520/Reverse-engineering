package androidx.compose.foundation.interaction;

import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.C6119;

/* JADX INFO: renamed from: androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1414 implements InterfaceC1421 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6119 f1970 = AbstractC6154.m10892(1, BufferOverflow.DROP_OLDEST);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m1913(InterfaceC1423 interfaceC1423) {
        return this.f1970.mo10868(interfaceC1423);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m1914(InterfaceC1423 interfaceC1423, InterfaceC5189 interfaceC5189) throws Throwable {
        Object objEmit = this.f1970.emit(interfaceC1423, interfaceC5189);
        return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : C6008.f15084;
    }
}
