package kotlinx.coroutines.selects;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4485 f14985 = new C4485("STATE_REG", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4485 f14984 = new C4485("STATE_COMPLETED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4485 f14983 = new C4485("STATE_CANCELLED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4485 f14982 = new C4485("NO_RESULT", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4485 f14981 = new C4485("PARAM_CLAUSE_0", 1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m10426(C5369 c5369, long j, InterfaceC6558 interfaceC6558) {
        C5373 c5373 = new C5373(j);
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.INSTANCE;
        onTimeout$selectClause$1.getClass();
        AbstractC4388.m8888(3, onTimeout$selectClause$1);
        C5370 c5370 = new C5370(c5369, c5373, onTimeout$selectClause$1, C5374.f14987, f14981, (SuspendLambda) interfaceC6558, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5369.f14964;
        c5369.m10417(c5370, false);
    }
}
