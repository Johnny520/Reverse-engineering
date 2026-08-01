package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InterfaceC0580;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1", f = "Clickable.kt", l = {2157, 2162, 2163}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class AbstractClickableNode$handlePressInteractionRelease$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC0580 $interactionSource;
    final /* synthetic */ InterfaceC5452 $job;
    final /* synthetic */ long $offset;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteractionRelease$1$1(InterfaceC5452 interfaceC5452, long j, InterfaceC0580 interfaceC0580, InterfaceC4357<? super AbstractClickableNode$handlePressInteractionRelease$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$job = interfaceC5452;
        this.$offset = j;
        this.$interactionSource = interfaceC0580;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new AbstractClickableNode$handlePressInteractionRelease$1$1(this.$job, this.$offset, this.$interactionSource, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((AbstractClickableNode$handlePressInteractionRelease$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (((androidx.compose.foundation.interaction.C0573) r8).m1354(r1, r7) != r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L26
            if (r1 == r5) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L14
            kotlin.AbstractC5185.m10210(r8)
            goto L5e
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r2
        L1a:
            java.lang.Object r1 = r7.L$0
            androidx.compose.foundation.interaction.飘花落叶言子楪哲苏兰世 r1 = (androidx.compose.foundation.interaction.C0576) r1
            kotlin.AbstractC5185.m10210(r8)
            goto L4f
        L22:
            kotlin.AbstractC5185.m10210(r8)
            goto L34
        L26:
            kotlin.AbstractC5185.m10210(r8)
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r8 = r7.$job
            r7.label = r5
            java.lang.Object r8 = r8.mo10564(r7)
            if (r8 != r0) goto L34
            goto L5d
        L34:
            androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰 r8 = new androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰
            long r5 = r7.$offset
            r8.<init>(r5)
            androidx.compose.foundation.interaction.飘花落叶言子楪哲苏兰世 r1 = new androidx.compose.foundation.interaction.飘花落叶言子楪哲苏兰世
            r1.<init>(r8)
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r5 = r7.$interactionSource
            r7.L$0 = r1
            r7.label = r4
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r5 = (androidx.compose.foundation.interaction.C0573) r5
            java.lang.Object r8 = r5.m1354(r8, r7)
            if (r8 != r0) goto L4f
            goto L5d
        L4f:
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r8 = r7.$interactionSource
            r7.L$0 = r2
            r7.label = r3
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r8 = (androidx.compose.foundation.interaction.C0573) r8
            java.lang.Object r7 = r8.m1354(r1, r7)
            if (r7 != r0) goto L5e
        L5d:
            return r0
        L5e:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5176.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
