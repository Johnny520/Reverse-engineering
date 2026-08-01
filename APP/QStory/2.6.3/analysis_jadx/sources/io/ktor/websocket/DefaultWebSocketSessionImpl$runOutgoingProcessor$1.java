package io.ktor.websocket;

import com.android.dx.io.Opcodes;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1", f = "DefaultWebSocketSession.kt", l = {246, 257, 257, 257, Opcodes.INVOKE_POLYMORPHIC, 257, 257, Opcodes.CONST_METHOD_HANDLE, 257, 257}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultWebSocketSessionImpl$runOutgoingProcessor$1 extends SuspendLambda implements InterfaceC6554 {
    Object L$0;
    int label;
    final /* synthetic */ C4261 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultWebSocketSessionImpl$runOutgoingProcessor$1(C4261 c4261, InterfaceC4357<? super DefaultWebSocketSessionImpl$runOutgoingProcessor$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c4261;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new DefaultWebSocketSessionImpl$runOutgoingProcessor$1(this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((DefaultWebSocketSessionImpl$runOutgoingProcessor$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r5 != r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (io.ktor.websocket.AbstractC4257.m8714(r6, new io.ktor.websocket.C4263(io.ktor.websocket.CloseReason$Codes.NORMAL, ""), r5) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (io.ktor.websocket.AbstractC4257.m8714(r6, new io.ktor.websocket.C4263(io.ktor.websocket.CloseReason$Codes.NORMAL, ""), r5) != r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c7, code lost:
    
        if (io.ktor.websocket.AbstractC4257.m8714(r6, new io.ktor.websocket.C4263(io.ktor.websocket.CloseReason$Codes.NORMAL, ""), r5) != r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
    
        if (io.ktor.websocket.AbstractC4257.m8714(r6, new io.ktor.websocket.C4263(io.ktor.websocket.CloseReason$Codes.NORMAL, ""), r5) != r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010b, code lost:
    
        if (io.ktor.websocket.AbstractC4257.m8714(r6, new io.ktor.websocket.C4263(io.ktor.websocket.CloseReason$Codes.NORMAL, ""), r5) != r0) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
