package kotlin.coroutines.jvm.internal;

import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import net.bytebuddy.description.method.MethodDescription;
import p079.AbstractC7690;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m151d2 = {"Lkotlin/coroutines/jvm/internal/TailCallBaseContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "", "declaringClass", "methodName", "fileName", "", "lineNumber", "", "", "spilledVariables", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "continuation", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V", "Lkotlin/Result;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Ljava/lang/String;", "getDeclaringClass", "()Ljava/lang/String;", "getMethodName", "getFileName", "I", "getLineNumber", "()I", "[Ljava/lang/Object;", "getSpilledVariables", "()[Ljava/lang/Object;", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "getContext", "()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;", "context", "kotlin-stdlib"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class TailCallBaseContinuationImpl extends BaseContinuationImpl {
    private final InterfaceC5189<Object> continuation;
    private final String declaringClass;
    private final String fileName;
    private final int lineNumber;
    private final String methodName;
    private final Object[] spilledVariables;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TailCallBaseContinuationImpl(String str, String str2, String str3, int i, Object[] objArr, InterfaceC5189<Object> interfaceC5189) {
        super(interfaceC5189);
        str.getClass();
        str2.getClass();
        str3.getClass();
        objArr.getClass();
        interfaceC5189.getClass();
        this.declaringClass = str;
        this.methodName = str2;
        this.fileName = str3;
        this.lineNumber = i;
        this.spilledVariables = objArr;
        this.continuation = interfaceC5189;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.InterfaceC5189
    public InterfaceC5192 getContext() {
        return this.continuation.getContext();
    }

    public final String getDeclaringClass() {
        return this.declaringClass;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }

    public final String getMethodName() {
        return this.methodName;
    }

    public final Object[] getSpilledVariables() {
        return this.spilledVariables;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public StackTraceElement getStackTraceElement() {
        String str;
        String strM12646 = AbstractC7690.m12646(this);
        if (strM12646 == null) {
            str = this.declaringClass;
        } else {
            str = strM12646 + '/' + this.declaringClass;
        }
        return new StackTraceElement(str, this.methodName, this.fileName, this.lineNumber);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object result) {
        AbstractC6017.m10769(result);
        return result;
    }
}
