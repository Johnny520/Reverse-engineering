package kotlinx.coroutines.selects;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6204 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5317 f15330 = new C5317("STATE_REG", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5317 f15329 = new C5317("STATE_COMPLETED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5317 f15328 = new C5317("STATE_CANCELLED", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5317 f15327 = new C5317("NO_RESULT", 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C5317 f15326 = new C5317("PARAM_CLAUSE_0", 1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m10985(C6201 c6201, long j, InterfaceC7387 interfaceC7387) {
        C6205 c6205 = new C6205(j);
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.INSTANCE;
        onTimeout$selectClause$1.getClass();
        AbstractC5220.m9447(3, onTimeout$selectClause$1);
        C6202 c6202 = new C6202(c6201, c6205, onTimeout$selectClause$1, C6206.f15332, f15326, (SuspendLambda) interfaceC7387, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C6201.f15309;
        c6201.m10976(c6202, false);
    }
}
