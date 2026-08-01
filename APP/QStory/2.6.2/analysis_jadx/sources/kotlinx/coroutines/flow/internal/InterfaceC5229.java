package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC5318;
import p093.C7200;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5229 extends InterfaceC5318 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    static /* synthetic */ InterfaceC5318 m10303(InterfaceC5229 interfaceC5229, C7200 c7200, int i, BufferOverflow bufferOverflow, int i2) {
        InterfaceC4359 interfaceC4359 = c7200;
        if ((i2 & 1) != 0) {
            interfaceC4359 = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return interfaceC5229.mo10288(interfaceC4359, i, bufferOverflow);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    InterfaceC5318 mo10288(InterfaceC4359 interfaceC4359, int i, BufferOverflow bufferOverflow);
}
