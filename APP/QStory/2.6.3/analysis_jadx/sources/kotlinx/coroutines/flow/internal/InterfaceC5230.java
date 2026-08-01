package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC5319;
import p093.C7201;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5230 extends InterfaceC5319 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    static /* synthetic */ InterfaceC5319 m10307(InterfaceC5230 interfaceC5230, C7201 c7201, int i, BufferOverflow bufferOverflow, int i2) {
        InterfaceC4360 interfaceC4360 = c7201;
        if ((i2 & 1) != 0) {
            interfaceC4360 = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return interfaceC5230.mo10292(interfaceC4360, i, bufferOverflow);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    InterfaceC5319 mo10292(InterfaceC4360 interfaceC4360, int i, BufferOverflow bufferOverflow);
}
