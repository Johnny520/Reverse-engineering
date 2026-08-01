package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.C0331;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.InterfaceC5206;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContentLayout$3$1", f = "BottomSheetContentLayout.kt", l = {183, 183}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class BottomSheetContentLayoutKt$BottomSheetContentLayout$3$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C0331 $dragOffsetY;
    final /* synthetic */ InterfaceC5206 $dragSnapChannel;
    float F$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetContentLayoutKt$BottomSheetContentLayout$3$1(InterfaceC5206 interfaceC5206, C0331 c0331, InterfaceC4356<? super BottomSheetContentLayoutKt$BottomSheetContentLayout$3$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$dragSnapChannel = interfaceC5206;
        this.$dragOffsetY = c0331;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new BottomSheetContentLayoutKt$BottomSheetContentLayout$3$1(this.$dragSnapChannel, this.$dragOffsetY, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((BottomSheetContentLayoutKt$BottomSheetContentLayout$3$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r4.m1030(r5, r6) == r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[PHI: r1 r7
  0x003b: PHI (r1v1 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) = (r1v12 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世), (r1v13 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) binds: [B:13:0x0038, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r7v3 java.lang.Object) = (r7v11 java.lang.Object), (r7v0 java.lang.Object) binds: [B:13:0x0038, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0060 -> B:7:0x0013). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L15
            java.lang.Object r1 = r6.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r1 = (kotlinx.coroutines.channels.InterfaceC5211) r1
            kotlin.AbstractC5184.m10206(r7)
        L13:
            r7 = r1
            goto L2d
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            r6 = 0
            return r6
        L1c:
            java.lang.Object r1 = r6.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r1 = (kotlinx.coroutines.channels.InterfaceC5211) r1
            kotlin.AbstractC5184.m10206(r7)
            goto L3b
        L24:
            kotlin.AbstractC5184.m10206(r7)
            kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r7 = r6.$dragSnapChannel
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r7 = r7.iterator()
        L2d:
            r6.L$0 = r7
            r6.label = r3
            r1 = r7
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r1 = (kotlinx.coroutines.channels.C5190) r1
            java.lang.Object r7 = r1.m10260(r6)
            if (r7 != r0) goto L3b
            goto L62
        L3b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L63
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r1 = (kotlinx.coroutines.channels.C5190) r1
            java.lang.Object r7 = r1.m10258()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r4 = r6.$dragOffsetY
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r7)
            r6.L$0 = r1
            r6.F$0 = r7
            r6.label = r2
            java.lang.Object r7 = r4.m1030(r5, r6)
            if (r7 != r0) goto L13
        L62:
            return r0
        L63:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContentLayout$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
