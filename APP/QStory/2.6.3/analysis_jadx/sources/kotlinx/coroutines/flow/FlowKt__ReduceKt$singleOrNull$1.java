package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "singleOrNull", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class FlowKt__ReduceKt$singleOrNull$1<T> extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public FlowKt__ReduceKt$singleOrNull$1(InterfaceC4357<? super FlowKt__ReduceKt$singleOrNull$1> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            r6.result = r7
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r2 = kotlinx.coroutines.flow.internal.AbstractC5219.f14807
            int r0 = r0 - r1
            r6.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L30
            if (r0 != r1) goto L2a
            java.lang.Object r0 = r6.L$3
            kotlinx.coroutines.flow.飘花落叶言子苏哲楪兰世 r0 = (kotlinx.coroutines.flow.C5341) r0
            java.lang.Object r1 = r6.L$2
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r1 = (kotlinx.coroutines.flow.InterfaceC5319) r1
            java.lang.Object r1 = r6.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r4 = r6.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r4 = (kotlinx.coroutines.flow.InterfaceC5319) r4
            kotlin.AbstractC5185.m10210(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L28
            goto L5c
        L28:
            r7 = move-exception
            goto L51
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r3
        L30:
            kotlin.AbstractC5185.m10210(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r7.element = r2
            kotlinx.coroutines.flow.飘花落叶言子苏哲楪兰世 r0 = new kotlinx.coroutines.flow.飘花落叶言子苏哲楪兰世
            r0.<init>(r7)
            r6.L$0 = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4d
            r6.L$1 = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4d
            r6.L$2 = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4d
            r6.L$3 = r0     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4d
            r4 = 0
            r6.I$0 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4d
            r6.label = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4d
            throw r3
        L4d:
            r1 = move-exception
            r5 = r1
            r1 = r7
            r7 = r5
        L51:
            java.lang.Object r4 = r7.owner
            if (r4 != r0) goto L63
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r6 = r6.getContext()
            kotlinx.coroutines.AbstractC5399.m10502(r6)
        L5c:
            T r6 = r1.element
            if (r6 != r2) goto L61
            goto L62
        L61:
            r3 = r6
        L62:
            return r3
        L63:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
