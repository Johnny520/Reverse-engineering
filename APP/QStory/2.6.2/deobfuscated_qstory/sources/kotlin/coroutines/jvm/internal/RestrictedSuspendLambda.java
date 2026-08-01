package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.InterfaceC4382;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/jvm/internal/飘花落叶言子楪世兰苏哲;", "", "", "arity", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "completion", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V", "(I)V", "", "toString", "()Ljava/lang/String;", "I", "getArity", "()I", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements InterfaceC4382 {
    private final int arity;

    public RestrictedSuspendLambda(int i, InterfaceC4356<Object> interfaceC4356) {
        super(interfaceC4356);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.InterfaceC4382
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public String toString() {
        return getCompletion() == null ? AbstractC4395.f12971.mo8934(this) : super.toString();
    }

    public RestrictedSuspendLambda(int i) {
        this(i, null);
    }
}
