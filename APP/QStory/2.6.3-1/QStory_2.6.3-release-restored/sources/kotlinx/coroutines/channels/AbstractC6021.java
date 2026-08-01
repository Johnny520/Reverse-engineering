package kotlinx.coroutines.channels;

import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.InterfaceC6279;
import kotlinx.coroutines.internal.AbstractC6185;
import p068.InterfaceC7380;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6021 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6033 f15097 = new C6033(-1, null, null, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int f15096 = AbstractC6185.m10932(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int f15095 = AbstractC6185.m10932(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5317 f15094 = new C5317("BUFFERED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C5317 f15093 = new C5317("SHOULD_BUFFER", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C5317 f15092 = new C5317("S_RESUMING_BY_RCV", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5317 f15106 = new C5317("RESUMING_BY_EB", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C5317 f15105 = new C5317("POISONED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C5317 f15109 = new C5317("DONE_RCV", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C5317 f15110 = new C5317("INTERRUPTED_SEND", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C5317 f15107 = new C5317("INTERRUPTED_RCV", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C5317 f15108 = new C5317("CHANNEL_CLOSED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C5317 f15100 = new C5317("SUSPEND", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C5317 f15099 = new C5317("SUSPEND_NO_WAITER", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C5317 f15103 = new C5317("FAILED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C5317 f15104 = new C5317("NO_RECEIVE_RESULT", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5317 f15101 = new C5317("CLOSE_HANDLER_CLOSED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5317 f15102 = new C5317("CLOSE_HANDLER_INVOKED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C5317 f15098 = new C5317("NO_CLOSE_CAUSE", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m10777(InterfaceC6279 interfaceC6279, Object obj, InterfaceC7380 interfaceC7380) {
        C5317 c5317Mo10995 = interfaceC6279.mo10995(obj, interfaceC7380);
        if (c5317Mo10995 == null) {
            return false;
        }
        interfaceC6279.mo10992(c5317Mo10995);
        return true;
    }
}
