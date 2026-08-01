package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "firstOrNull", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class FlowKt__ReduceKt$firstOrNull$1<T> extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public FlowKt__ReduceKt$firstOrNull$1(InterfaceC4356<? super FlowKt__ReduceKt$firstOrNull$1> interfaceC4356) {
        super(interfaceC4356);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
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
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L28
            java.lang.Object r0 = r5.L$3
            kotlinx.coroutines.flow.飘花落叶言子苏世哲兰楪 r0 = (kotlinx.coroutines.flow.C5325) r0
            java.lang.Object r1 = r5.L$2
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r1 = (kotlinx.coroutines.flow.InterfaceC5318) r1
            java.lang.Object r1 = r5.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r2 = r5.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r2 = (kotlinx.coroutines.flow.InterfaceC5318) r2
            kotlin.AbstractC5184.m10206(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L26
            goto L58
        L26:
            r6 = move-exception
            goto L4d
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r1
        L2e:
            kotlin.AbstractC5184.m10206(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            kotlinx.coroutines.flow.飘花落叶言子苏世哲兰楪 r0 = new kotlinx.coroutines.flow.飘花落叶言子苏世哲兰楪
            r0.<init>(r6)
            r5.L$0 = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L49
            r5.L$1 = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L49
            r5.L$2 = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L49
            r5.L$3 = r0     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L49
            r3 = 0
            r5.I$0 = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L49
            r5.label = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L49
            throw r1
        L49:
            r1 = move-exception
            r4 = r1
            r1 = r6
            r6 = r4
        L4d:
            java.lang.Object r2 = r6.owner
            if (r2 != r0) goto L5b
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r5 = r5.getContext()
            kotlinx.coroutines.AbstractC5398.m10498(r5)
        L58:
            T r5 = r1.element
            return r5
        L5b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
