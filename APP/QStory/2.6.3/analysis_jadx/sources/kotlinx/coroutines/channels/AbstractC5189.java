package kotlinx.coroutines.channels;

import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlinx.coroutines.InterfaceC5447;
import kotlinx.coroutines.internal.AbstractC5353;
import p052.InterfaceC6551;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5189 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5201 f14752 = new C5201(-1, null, null, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int f14751 = AbstractC5353.m10373(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int f14750 = AbstractC5353.m10373(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4485 f14749 = new C4485("BUFFERED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4485 f14748 = new C4485("SHOULD_BUFFER", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4485 f14747 = new C4485("S_RESUMING_BY_RCV", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4485 f14761 = new C4485("RESUMING_BY_EB", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C4485 f14760 = new C4485("POISONED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C4485 f14764 = new C4485("DONE_RCV", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C4485 f14765 = new C4485("INTERRUPTED_SEND", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C4485 f14762 = new C4485("INTERRUPTED_RCV", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C4485 f14763 = new C4485("CHANNEL_CLOSED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C4485 f14755 = new C4485("SUSPEND", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C4485 f14754 = new C4485("SUSPEND_NO_WAITER", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C4485 f14758 = new C4485("FAILED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4485 f14759 = new C4485("NO_RECEIVE_RESULT", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4485 f14756 = new C4485("CLOSE_HANDLER_CLOSED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4485 f14757 = new C4485("CLOSE_HANDLER_INVOKED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C4485 f14753 = new C4485("NO_CLOSE_CAUSE", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m10218(InterfaceC5447 interfaceC5447, Object obj, InterfaceC6551 interfaceC6551) {
        C4485 c4485Mo10436 = interfaceC5447.mo10436(obj, interfaceC6551);
        if (c4485Mo10436 == null) {
            return false;
        }
        interfaceC5447.mo10433(c4485Mo10436);
        return true;
    }
}
