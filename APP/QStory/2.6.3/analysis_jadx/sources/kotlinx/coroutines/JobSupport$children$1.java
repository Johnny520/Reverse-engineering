package kotlinx.coroutines;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5125;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, 1005}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 2, 0})
final class JobSupport$children$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ C5460 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(C5460 c5460, InterfaceC4357<? super JobSupport$children$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c5460;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.this$0, interfaceC4357);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((JobSupport$children$1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r0.mo10121(r11, r10) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r0.mo10121(r11, r10) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0074 -> B:27:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0093 -> B:27:0x0096). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.L$0
            kotlin.sequences.飘花落叶言子楪苏兰世哲 r0 = (kotlin.sequences.AbstractC5125) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r10.label
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            int r2 = r10.I$1
            int r4 = r10.I$0
            java.lang.Object r7 = r10.L$5
            kotlinx.coroutines.internal.飘花落叶言子楪苏世兰哲 r7 = (kotlinx.coroutines.internal.C5362) r7
            java.lang.Object r7 = r10.L$4
            kotlinx.coroutines.internal.飘花落叶言子楪苏世兰哲 r7 = (kotlinx.coroutines.internal.C5362) r7
            java.lang.Object r8 = r10.L$3
            kotlinx.coroutines.飘花落叶言子苏兰楪世哲 r8 = (kotlinx.coroutines.C5458) r8
            java.lang.Object r9 = r10.L$2
            kotlinx.coroutines.飘花落叶言子苏兰楪世哲 r9 = (kotlinx.coroutines.C5458) r9
            kotlin.AbstractC5185.m10210(r11)
            goto L96
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r10)
            return r6
        L31:
            kotlin.AbstractC5185.m10210(r11)
            goto L9b
        L35:
            kotlin.AbstractC5185.m10210(r11)
            kotlinx.coroutines.飘花落叶言子苏哲世兰楪 r11 = r10.this$0
            java.lang.Object r11 = r11.m10581()
            boolean r2 = r11 instanceof kotlinx.coroutines.C5440
            if (r2 == 0) goto L53
            kotlinx.coroutines.飘花落叶言子楪哲苏世兰 r11 = (kotlinx.coroutines.C5440) r11
            kotlinx.coroutines.飘花落叶言子苏哲世兰楪 r11 = r11.f15086
            r10.L$0 = r6
            r10.L$1 = r6
            r10.label = r4
            kotlin.coroutines.intrinsics.CoroutineSingletons r10 = r0.mo10121(r11, r10)
            if (r10 != r1) goto L9b
            goto L95
        L53:
            boolean r2 = r11 instanceof kotlinx.coroutines.InterfaceC5470
            if (r2 == 0) goto L9b
            kotlinx.coroutines.飘花落叶言子苏楪哲世兰 r11 = (kotlinx.coroutines.InterfaceC5470) r11
            kotlinx.coroutines.飘花落叶言子苏兰楪世哲 r11 = r11.mo10459()
            if (r11 == 0) goto L9b
            java.lang.Object r2 = r11.m10401()
            r2.getClass()
            kotlinx.coroutines.internal.飘花落叶言子楪苏世兰哲 r2 = (kotlinx.coroutines.internal.C5362) r2
            r8 = r11
            r7 = r2
            r2 = r5
            r4 = r2
        L6c:
            boolean r11 = r7.equals(r8)
            if (r11 != 0) goto L9b
            boolean r11 = r7 instanceof kotlinx.coroutines.C5440
            if (r11 == 0) goto L96
            r11 = r7
            kotlinx.coroutines.飘花落叶言子楪哲苏世兰 r11 = (kotlinx.coroutines.C5440) r11
            kotlinx.coroutines.飘花落叶言子苏哲世兰楪 r11 = r11.f15086
            r10.L$0 = r0
            r10.L$1 = r6
            r10.L$2 = r6
            r10.L$3 = r8
            r10.L$4 = r7
            r10.L$5 = r6
            r10.I$0 = r4
            r10.I$1 = r2
            r10.I$2 = r5
            r10.label = r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r11 = r0.mo10121(r11, r10)
            if (r11 != r1) goto L96
        L95:
            return r1
        L96:
            kotlinx.coroutines.internal.飘花落叶言子楪苏世兰哲 r7 = r7.m10398()
            goto L6c
        L9b:
            kotlin.飘花落叶言子楪兰苏哲世 r10 = kotlin.C5176.f14739
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
