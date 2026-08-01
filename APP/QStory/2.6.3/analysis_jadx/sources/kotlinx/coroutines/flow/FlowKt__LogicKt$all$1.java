package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", l = {119}, m = "all", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class FlowKt__LogicKt$all$1<T> extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public FlowKt__LogicKt$all$1(InterfaceC4357<? super FlowKt__LogicKt$all$1> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            r5.result = r6
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r5.label = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2c
            java.lang.Object r0 = r5.L$4
            kotlinx.coroutines.flow.飘花落叶言子苏楪世兰哲 r0 = (kotlinx.coroutines.flow.C5342) r0
            java.lang.Object r1 = r5.L$3
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r1 = (kotlinx.coroutines.flow.InterfaceC5319) r1
            java.lang.Object r1 = r5.L$2
            kotlin.jvm.internal.Ref$BooleanRef r1 = (kotlin.jvm.internal.Ref$BooleanRef) r1
            java.lang.Object r3 = r5.L$1
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r3 = (p052.InterfaceC6554) r3
            java.lang.Object r3 = r5.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r3 = (kotlinx.coroutines.flow.InterfaceC5319) r3
            kotlin.AbstractC5185.m10210(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2a
            goto L5e
        L2a:
            r6 = move-exception
            goto L53
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            return r1
        L32:
            kotlin.AbstractC5185.m10210(r6)
            kotlin.jvm.internal.Ref$BooleanRef r6 = new kotlin.jvm.internal.Ref$BooleanRef
            r6.<init>()
            kotlinx.coroutines.flow.飘花落叶言子苏楪世兰哲 r0 = new kotlinx.coroutines.flow.飘花落叶言子苏楪世兰哲
            r0.<init>(r6)
            r5.L$0 = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            r5.L$1 = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            r5.L$2 = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            r5.L$3 = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            r5.L$4 = r0     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            r3 = 0
            r5.I$0 = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            r5.label = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            throw r1
        L4f:
            r1 = move-exception
            r4 = r1
            r1 = r6
            r6 = r4
        L53:
            java.lang.Object r3 = r6.owner
            if (r3 != r0) goto L66
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r5 = r5.getContext()
            kotlinx.coroutines.AbstractC5399.m10502(r5)
        L5e:
            boolean r5 = r1.element
            r5 = r5 ^ r2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L66:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LogicKt$all$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
