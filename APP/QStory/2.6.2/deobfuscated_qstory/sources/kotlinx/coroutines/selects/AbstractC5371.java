package kotlinx.coroutines.selects;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5371 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4484 f14985 = new C4484("STATE_REG", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4484 f14984 = new C4484("STATE_COMPLETED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4484 f14983 = new C4484("STATE_CANCELLED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4484 f14982 = new C4484("NO_RESULT", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4484 f14981 = new C4484("PARAM_CLAUSE_0", 1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m10422(C5368 c5368, long j, InterfaceC6557 interfaceC6557) {
        C5372 c5372 = new C5372(j);
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.INSTANCE;
        onTimeout$selectClause$1.getClass();
        AbstractC4387.m8898(3, onTimeout$selectClause$1);
        C5369 c5369 = new C5369(c5368, c5372, onTimeout$selectClause$1, C5373.f14987, f14981, (SuspendLambda) interfaceC6557, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5368.f14964;
        c5368.m10413(c5369, false);
    }
}
