package top.yukonga.miuix.kmp.utils;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.utils.AbstractPressableNode$launchAwaitingReset$1", f = "Pressable.kt", l = {388, 389}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class AbstractPressableNode$launchAwaitingReset$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $block;
    final /* synthetic */ InterfaceC5451 $resetJob;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractPressableNode$launchAwaitingReset$1(InterfaceC5451 interfaceC5451, InterfaceC6553 interfaceC6553, InterfaceC4356<? super AbstractPressableNode$launchAwaitingReset$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$resetJob = interfaceC5451;
        this.$block = interfaceC6553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        AbstractPressableNode$launchAwaitingReset$1 abstractPressableNode$launchAwaitingReset$1 = new AbstractPressableNode$launchAwaitingReset$1(this.$resetJob, this.$block, interfaceC4356);
        abstractPressableNode$launchAwaitingReset$1.L$0 = obj;
        return abstractPressableNode$launchAwaitingReset$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((AbstractPressableNode$launchAwaitingReset$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r7.invoke(r0, r6) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r0 = (kotlinx.coroutines.InterfaceC5400) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r6.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            kotlin.AbstractC5184.m10206(r7)
            goto L3c
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r3
        L1b:
            kotlin.AbstractC5184.m10206(r7)
            goto L2f
        L1f:
            kotlin.AbstractC5184.m10206(r7)
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r7 = r6.$resetJob
            r6.L$0 = r0
            r6.label = r5
            java.lang.Object r7 = r7.mo10558(r6)
            if (r7 != r1) goto L2f
            goto L3b
        L2f:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r7 = r6.$block
            r6.L$0 = r3
            r6.label = r4
            java.lang.Object r6 = r7.invoke(r0, r6)
            if (r6 != r1) goto L3c
        L3b:
            return r1
        L3c:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.utils.AbstractPressableNode$launchAwaitingReset$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
