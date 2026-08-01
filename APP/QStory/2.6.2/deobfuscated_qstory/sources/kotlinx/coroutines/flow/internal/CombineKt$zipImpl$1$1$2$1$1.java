package kotlinx.coroutines.flow.internal;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5438;
import kotlinx.coroutines.channels.InterfaceC5198;
import kotlinx.coroutines.flow.InterfaceC5317;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", l = {126, 129, 129}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 2, 0})
final class CombineKt$zipImpl$1$1$2$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5438 $collectJob;
    final /* synthetic */ InterfaceC5198 $second;
    final /* synthetic */ InterfaceC5317 $this_unsafeFlow;
    final /* synthetic */ InterfaceC6550 $transform;
    final /* synthetic */ Object $value;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1$2$1$1(InterfaceC5198 interfaceC5198, InterfaceC5317 interfaceC5317, InterfaceC6550 interfaceC6550, Object obj, InterfaceC5438 interfaceC5438, InterfaceC4356<? super CombineKt$zipImpl$1$1$2$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$second = interfaceC5198;
        this.$this_unsafeFlow = interfaceC5317;
        this.$transform = interfaceC6550;
        this.$value = obj;
        this.$collectJob = interfaceC5438;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new CombineKt$zipImpl$1$1$2$1$1(this.$second, this.$this_unsafeFlow, this.$transform, this.$value, this.$collectJob, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C5175 c5175, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CombineKt$zipImpl$1$1$2$1$1) create(c5175, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r1.emit(r9, r8) != r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L14
            kotlin.AbstractC5184.m10206(r9)
            goto L6f
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r8)
            return r5
        L1a:
            java.lang.Object r1 = r8.L$1
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r1 = (kotlinx.coroutines.flow.InterfaceC5317) r1
            kotlin.AbstractC5184.m10206(r9)
            goto L62
        L22:
            kotlin.AbstractC5184.m10206(r9)
            kotlinx.coroutines.channels.飘花落叶言子楪哲世苏兰 r9 = (kotlinx.coroutines.channels.C5201) r9
            java.lang.Object r9 = r9.f14791
            goto L38
        L2a:
            kotlin.AbstractC5184.m10206(r9)
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r9 = r8.$second
            r8.label = r4
            java.lang.Object r9 = r9.mo10242(r8)
            if (r9 != r0) goto L38
            goto L6e
        L38:
            kotlinx.coroutines.飘花落叶言子楪哲兰苏世 r1 = r8.$collectJob
            boolean r4 = r9 instanceof kotlinx.coroutines.channels.C5209
            if (r4 == 0) goto L4a
            java.lang.Throwable r8 = kotlinx.coroutines.channels.C5201.m10269(r9)
            if (r8 != 0) goto L49
            kotlinx.coroutines.flow.internal.AbortFlowException r8 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r8.<init>(r1)
        L49:
            throw r8
        L4a:
            kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲 r1 = r8.$this_unsafeFlow
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r4 = r8.$transform
            java.lang.Object r6 = r8.$value
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r7 = kotlinx.coroutines.flow.internal.AbstractC5218.f14807
            if (r9 != r7) goto L55
            r9 = r5
        L55:
            r8.L$0 = r5
            r8.L$1 = r1
            r8.label = r3
            java.lang.Object r9 = r4.invoke(r6, r9, r8)
            if (r9 != r0) goto L62
            goto L6e
        L62:
            r8.L$0 = r5
            r8.L$1 = r5
            r8.label = r2
            java.lang.Object r8 = r1.emit(r9, r8)
            if (r8 != r0) goto L6f
        L6e:
            return r0
        L6f:
            kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5175.f14739
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
