package androidx.compose.ui.viewinterop;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {634, 636}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class AndroidViewHolder$onNestedFling$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ boolean $consumed;
    final /* synthetic */ long $viewVelocity;
    int label;
    final /* synthetic */ AbstractC2076 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onNestedFling$1(boolean z, AbstractC2076 abstractC2076, long j, InterfaceC4357<? super AndroidViewHolder$onNestedFling$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$consumed = z;
        this.this$0 = abstractC2076;
        this.$viewVelocity = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new AndroidViewHolder$onNestedFling$1(this.$consumed, this.this$0, this.$viewVelocity, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((AndroidViewHolder$onNestedFling$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            kotlin.AbstractC5185.m10210(r11)
            goto L4b
        L10:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r10)
            r10 = 0
            return r10
        L17:
            kotlin.AbstractC5185.m10210(r11)
            goto L34
        L1b:
            kotlin.AbstractC5185.m10210(r11)
            boolean r11 = r10.$consumed
            androidx.compose.ui.viewinterop.飘花落叶言子楪世哲兰苏 r1 = r10.this$0
            if (r11 != 0) goto L3a
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世苏兰哲 r4 = r1.f6171
            long r7 = r10.$viewVelocity
            r10.label = r3
            r5 = 0
            r9 = r10
            java.lang.Object r11 = r4.m2995(r5, r7, r9)
            if (r11 != r0) goto L34
            goto L4a
        L34:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r11 = (p205.C7902) r11
            r11.getClass()
            goto L50
        L3a:
            r6 = r10
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世苏兰哲 r1 = r1.f6171
            r10 = r2
            long r2 = r6.$viewVelocity
            r6.label = r10
            r4 = 0
            java.lang.Object r11 = r1.m2995(r2, r4, r6)
            if (r11 != r0) goto L4b
        L4a:
            return r0
        L4b:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r11 = (p205.C7902) r11
            r11.getClass()
        L50:
            kotlin.飘花落叶言子楪兰苏哲世 r10 = kotlin.C5176.f14739
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
