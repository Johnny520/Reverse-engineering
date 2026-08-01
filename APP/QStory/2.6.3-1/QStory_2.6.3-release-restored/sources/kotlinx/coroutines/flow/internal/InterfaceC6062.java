package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC6151;
import p109.C8030;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6062 extends InterfaceC6151 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    static /* synthetic */ InterfaceC6151 m10866(InterfaceC6062 interfaceC6062, C8030 c8030, int i, BufferOverflow bufferOverflow, int i2) {
        InterfaceC5192 interfaceC5192 = c8030;
        if ((i2 & 1) != 0) {
            interfaceC5192 = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return interfaceC6062.mo10851(interfaceC5192, i, bufferOverflow);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    InterfaceC6151 mo10851(InterfaceC5192 interfaceC5192, int i, BufferOverflow bufferOverflow);
}
