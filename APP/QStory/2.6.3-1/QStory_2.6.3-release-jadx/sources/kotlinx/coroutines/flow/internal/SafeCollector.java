package kotlinx.coroutines.flow.internal;

import androidx.compose.foundation.layout.C1481;
import androidx.compose.foundation.lazy.C1594;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5977;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.flow.InterfaceC6150;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7380;
import p079.InterfaceC7692;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000e2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000f\u0010\"R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010&\u001a\u00020%8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010$R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, m151d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世苏兰哲;", "collector", "Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "collectContext", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "uCont", "value", "", "emit", "(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;Ljava/lang/Object;)Ljava/lang/Object;", "currentContext", "previousContext", "checkContext", "(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/internal/飘花落叶言子楪哲世苏兰;", "exception", "exceptionTransparencyViolated", "(Lkotlinx/coroutines/flow/internal/飘花落叶言子楪哲世苏兰;Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "", "collectContextSize", "I", "lastEmissionContext", "completion_", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "getCallerFrame", "()L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世苏兰哲;", "callerFrame", "getContext", "()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "context", "kotlinx-coroutines-core"}, m152k = 1, m153mv = {2, 2, 0}, m155xi = 48)
public final class SafeCollector<T> extends ContinuationImpl implements InterfaceC6150 {
    public final InterfaceC5192 collectContext;
    public final int collectContextSize;
    public final InterfaceC6150 collector;
    private InterfaceC5189<? super C6008> completion_;
    private InterfaceC5192 lastEmissionContext;

    public SafeCollector(InterfaceC6150 interfaceC6150, InterfaceC5192 interfaceC5192) {
        super(C6063.f15169, EmptyCoroutineContext.INSTANCE);
        this.collector = interfaceC6150;
        this.collectContext = interfaceC5192;
        this.collectContextSize = ((Number) interfaceC5192.fold(0, new C1594(21))).intValue();
    }

    private final void checkContext(InterfaceC5192 currentContext, InterfaceC5192 previousContext, T value) {
        if (previousContext instanceof C6059) {
            exceptionTransparencyViolated((C6059) previousContext, value);
        }
        if (((Number) currentContext.fold(0, new C1481(this, 9))).intValue() == this.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.collectContext + ",\n\t\tbut emission happened in " + currentContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int collectContextSize$lambda$0(int i, InterfaceC5186 interfaceC5186) {
        return i + 1;
    }

    private final Object emit(InterfaceC5189<? super C6008> uCont, T value) {
        InterfaceC5192 context = uCont.getContext();
        AbstractC6231.m11061(context);
        InterfaceC5192 interfaceC5192 = this.lastEmissionContext;
        if (interfaceC5192 != context) {
            checkContext(context, interfaceC5192, value);
            this.lastEmissionContext = context;
        }
        this.completion_ = uCont;
        InterfaceC7380 interfaceC7380 = AbstractC6061.f15167;
        InterfaceC6150 interfaceC6150 = this.collector;
        interfaceC6150.getClass();
        Object objInvoke = interfaceC7380.invoke(interfaceC6150, value, this);
        if (!AbstractC5227.m9466(objInvoke, CoroutineSingletons.COROUTINE_SUSPENDED)) {
            this.completion_ = null;
        }
        return objInvoke;
    }

    private final void exceptionTransparencyViolated(C6059 exception, Object value) {
        throw new IllegalStateException(AbstractC5977.m10737("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + exception.f15164 + ", but then emission attempt of value '" + value + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, p079.InterfaceC7692
    public InterfaceC7692 getCallerFrame() {
        InterfaceC5189<? super C6008> interfaceC5189 = this.completion_;
        if (interfaceC5189 instanceof InterfaceC7692) {
            return (InterfaceC7692) interfaceC5189;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.InterfaceC5189
    public InterfaceC5192 getContext() {
        InterfaceC5192 interfaceC5192 = this.lastEmissionContext;
        return interfaceC5192 == null ? EmptyCoroutineContext.INSTANCE : interfaceC5192;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object result) {
        Throwable thM9307exceptionOrNullimpl = Result.m9307exceptionOrNullimpl(result);
        if (thM9307exceptionOrNullimpl != null) {
            this.lastEmissionContext = new C6059(getContext(), thM9307exceptionOrNullimpl);
        }
        InterfaceC5189<? super C6008> interfaceC5189 = this.completion_;
        if (interfaceC5189 != null) {
            interfaceC5189.resumeWith(result);
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public Object emit(T t, InterfaceC5189<? super C6008> interfaceC5189) {
        try {
            Object objEmit = emit(interfaceC5189, t);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objEmit == coroutineSingletons) {
                interfaceC5189.getClass();
            }
            return objEmit == coroutineSingletons ? objEmit : C6008.f15084;
        } catch (Throwable th) {
            this.lastEmissionContext = new C6059(interfaceC5189.getContext(), th);
            throw th;
        }
    }
}
