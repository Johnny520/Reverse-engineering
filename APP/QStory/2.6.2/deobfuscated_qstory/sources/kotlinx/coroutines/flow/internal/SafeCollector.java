package kotlinx.coroutines.flow.internal;

import androidx.compose.foundation.layout.C0640;
import androidx.compose.foundation.lazy.C0753;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4353;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5144;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.flow.InterfaceC5317;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6550;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000e2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000f\u0010\"R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010&\u001a\u00020%8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010$R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世苏兰哲;", "collector", "Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "collectContext", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "uCont", "value", "", "emit", "(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;Ljava/lang/Object;)Ljava/lang/Object;", "currentContext", "previousContext", "checkContext", "(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/internal/飘花落叶言子楪哲世苏兰;", "exception", "exceptionTransparencyViolated", "(Lkotlinx/coroutines/flow/internal/飘花落叶言子楪哲世苏兰;Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "", "collectContextSize", "I", "lastEmissionContext", "completion_", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "getCallerFrame", "()L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世苏兰哲;", "callerFrame", "getContext", "()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SafeCollector<T> extends ContinuationImpl implements InterfaceC5317 {
    public final InterfaceC4359 collectContext;
    public final int collectContextSize;
    public final InterfaceC5317 collector;
    private InterfaceC4356<? super C5175> completion_;
    private InterfaceC4359 lastEmissionContext;

    public SafeCollector(InterfaceC5317 interfaceC5317, InterfaceC4359 interfaceC4359) {
        super(C5230.f14824, EmptyCoroutineContext.INSTANCE);
        this.collector = interfaceC5317;
        this.collectContext = interfaceC4359;
        this.collectContextSize = ((Number) interfaceC4359.fold(0, new C0753(21))).intValue();
    }

    private final void checkContext(InterfaceC4359 currentContext, InterfaceC4359 previousContext, T value) {
        if (previousContext instanceof C5226) {
            exceptionTransparencyViolated((C5226) previousContext, value);
        }
        if (((Number) currentContext.fold(0, new C0640(this, 9))).intValue() == this.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.collectContext + ",\n\t\tbut emission happened in " + currentContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int collectContextSize$lambda$0(int i, InterfaceC4353 interfaceC4353) {
        return i + 1;
    }

    private final Object emit(InterfaceC4356<? super C5175> uCont, T value) {
        InterfaceC4359 context = uCont.getContext();
        AbstractC5398.m10498(context);
        InterfaceC4359 interfaceC4359 = this.lastEmissionContext;
        if (interfaceC4359 != context) {
            checkContext(context, interfaceC4359, value);
            this.lastEmissionContext = context;
        }
        this.completion_ = uCont;
        InterfaceC6550 interfaceC6550 = AbstractC5228.f14822;
        InterfaceC5317 interfaceC5317 = this.collector;
        interfaceC5317.getClass();
        Object objInvoke = interfaceC6550.invoke(interfaceC5317, value, this);
        if (!AbstractC4394.m8917(objInvoke, CoroutineSingletons.COROUTINE_SUSPENDED)) {
            this.completion_ = null;
        }
        return objInvoke;
    }

    private final void exceptionTransparencyViolated(C5226 exception, Object value) {
        throw new IllegalStateException(AbstractC5144.m10174("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + exception.f14819 + ", but then emission attempt of value '" + value + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, p063.InterfaceC6862
    public InterfaceC6862 getCallerFrame() {
        InterfaceC4356<? super C5175> interfaceC4356 = this.completion_;
        if (interfaceC4356 instanceof InterfaceC6862) {
            return (InterfaceC6862) interfaceC4356;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.InterfaceC4356
    public InterfaceC4359 getContext() {
        InterfaceC4359 interfaceC4359 = this.lastEmissionContext;
        return interfaceC4359 == null ? EmptyCoroutineContext.INSTANCE : interfaceC4359;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object result) {
        Throwable thM8758exceptionOrNullimpl = Result.m8758exceptionOrNullimpl(result);
        if (thM8758exceptionOrNullimpl != null) {
            this.lastEmissionContext = new C5226(getContext(), thM8758exceptionOrNullimpl);
        }
        InterfaceC4356<? super C5175> interfaceC4356 = this.completion_;
        if (interfaceC4356 != null) {
            interfaceC4356.resumeWith(result);
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5317
    public Object emit(T t, InterfaceC4356<? super C5175> interfaceC4356) {
        try {
            Object objEmit = emit(interfaceC4356, t);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objEmit == coroutineSingletons) {
                interfaceC4356.getClass();
            }
            return objEmit == coroutineSingletons ? objEmit : C5175.f14739;
        } catch (Throwable th) {
            this.lastEmissionContext = new C5226(interfaceC4356.getContext(), th);
            throw th;
        }
    }
}
