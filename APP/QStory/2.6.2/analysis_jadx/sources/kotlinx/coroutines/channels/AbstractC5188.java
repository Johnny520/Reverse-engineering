package kotlinx.coroutines.channels;

import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlinx.coroutines.InterfaceC5446;
import kotlinx.coroutines.internal.AbstractC5352;
import p052.InterfaceC6550;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5188 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5200 f14752 = new C5200(-1, null, null, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int f14751 = AbstractC5352.m10369(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int f14750 = AbstractC5352.m10369(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4484 f14749 = new C4484("BUFFERED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4484 f14748 = new C4484("SHOULD_BUFFER", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4484 f14747 = new C4484("S_RESUMING_BY_RCV", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4484 f14761 = new C4484("RESUMING_BY_EB", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C4484 f14760 = new C4484("POISONED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C4484 f14764 = new C4484("DONE_RCV", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C4484 f14765 = new C4484("INTERRUPTED_SEND", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C4484 f14762 = new C4484("INTERRUPTED_RCV", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C4484 f14763 = new C4484("CHANNEL_CLOSED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C4484 f14755 = new C4484("SUSPEND", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C4484 f14754 = new C4484("SUSPEND_NO_WAITER", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C4484 f14758 = new C4484("FAILED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4484 f14759 = new C4484("NO_RECEIVE_RESULT", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4484 f14756 = new C4484("CLOSE_HANDLER_CLOSED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4484 f14757 = new C4484("CLOSE_HANDLER_INVOKED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C4484 f14753 = new C4484("NO_CLOSE_CAUSE", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m10214(InterfaceC5446 interfaceC5446, Object obj, InterfaceC6550 interfaceC6550) {
        C4484 c4484Mo10432 = interfaceC5446.mo10432(obj, interfaceC6550);
        if (c4484Mo10432 == null) {
            return false;
        }
        interfaceC5446.mo10429(c4484Mo10432);
        return true;
    }
}
