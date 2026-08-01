package kotlin.coroutines.jvm.internal;

import androidx.activity.AbstractC0053;
import java.io.Serializable;
import java.lang.reflect.Field;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import net.bytebuddy.description.method.MethodDescription;
import p063.AbstractC6860;
import p063.InterfaceC6861;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH$¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR!\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "", "L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世苏兰哲;", "Ljava/io/Serializable;", "completion", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V", "Lkotlin/Result;", "result", "Lkotlin/飘花落叶言子楪兰苏哲世;", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "create", "(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "value", "(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "getCompletion", "()Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "getCallerFrame", "()L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世苏兰哲;", "callerFrame", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class BaseContinuationImpl implements InterfaceC4356<Object>, InterfaceC6862, Serializable {
    private final InterfaceC4356<Object> completion;

    public BaseContinuationImpl(InterfaceC4356<Object> interfaceC4356) {
        this.completion = interfaceC4356;
    }

    public InterfaceC4356<C5175> create(InterfaceC4356<?> completion) {
        completion.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // p063.InterfaceC6862
    public InterfaceC6862 getCallerFrame() {
        InterfaceC4356<Object> interfaceC4356 = this.completion;
        if (interfaceC4356 instanceof InterfaceC6862) {
            return (InterfaceC6862) interfaceC4356;
        }
        return null;
    }

    public final InterfaceC4356<Object> getCompletion() {
        return this.completion;
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public abstract /* synthetic */ InterfaceC4359 getContext();

    public StackTraceElement getStackTraceElement() {
        String strC;
        InterfaceC6861 interfaceC6861 = (InterfaceC6861) getClass().getAnnotation(InterfaceC6861.class);
        if (interfaceC6861 == null || interfaceC6861.v() < 1) {
            return null;
        }
        if (!(this instanceof TailCallBaseContinuationImpl)) {
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                iIntValue = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                iIntValue = -1;
            }
        }
        int i = iIntValue >= 0 ? interfaceC6861.l()[iIntValue] : -1;
        String strM12059 = AbstractC6860.m12059(this);
        if (strM12059 == null) {
            strC = interfaceC6861.c();
        } else {
            strC = strM12059 + '/' + interfaceC6861.c();
        }
        return new StackTraceElement(strC, interfaceC6861.m(), interfaceC6861.f(), i);
    }

    public abstract Object invokeSuspend(Object result);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // kotlin.coroutines.InterfaceC4356
    public final void resumeWith(Object result) {
        Object objInvokeSuspend;
        ?? r2 = this;
        while (true) {
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) r2;
            InterfaceC4356<Object> interfaceC4356 = baseContinuationImpl.completion;
            interfaceC4356.getClass();
            try {
                objInvokeSuspend = baseContinuationImpl.invokeSuspend(result);
            } catch (Throwable th) {
                result = AbstractC0053.m162(th);
            }
            if (objInvokeSuspend == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return;
            }
            result = Result.m8755constructorimpl(objInvokeSuspend);
            baseContinuationImpl.releaseIntercepted();
            if (!(interfaceC4356 instanceof BaseContinuationImpl)) {
                interfaceC4356.resumeWith(result);
                return;
            }
            r2 = interfaceC4356;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public InterfaceC4356<C5175> create(Object value, InterfaceC4356<?> completion) {
        completion.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
