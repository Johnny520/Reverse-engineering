package top.yukonga.miuix.kmp.utils;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.utils.MiuixIndication$MiuixIndicationInstance$updateStates$1", f = "MiuixIndication.kt", l = {75, 76}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class MiuixIndication$MiuixIndicationInstance$updateStates$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ Ref$FloatRef $targetAlpha;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6055 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiuixIndication$MiuixIndicationInstance$updateStates$1(C6055 c6055, Ref$FloatRef ref$FloatRef, InterfaceC4356<? super MiuixIndication$MiuixIndicationInstance$updateStates$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c6055;
        this.$targetAlpha = ref$FloatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        MiuixIndication$MiuixIndicationInstance$updateStates$1 miuixIndication$MiuixIndicationInstance$updateStates$1 = new MiuixIndication$MiuixIndicationInstance$updateStates$1(this.this$0, this.$targetAlpha, interfaceC4356);
        miuixIndication$MiuixIndicationInstance$updateStates$1.L$0 = obj;
        return miuixIndication$MiuixIndicationInstance$updateStates$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((MiuixIndication$MiuixIndicationInstance$updateStates$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (androidx.compose.animation.core.C0331.m1028(r6, r7, r8, null, null, r13, 12) != r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r0 = (kotlinx.coroutines.InterfaceC5400) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r13.label
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L1f
            if (r2 == r3) goto L1b
            if (r2 != r5) goto L15
            kotlin.AbstractC5184.m10206(r14)
            goto L62
        L15:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r13)
            return r4
        L1b:
            kotlin.AbstractC5184.m10206(r14)
            goto L3d
        L1f:
            kotlin.AbstractC5184.m10206(r14)
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r14 = r0.mo2420()
            boolean r14 = kotlinx.coroutines.AbstractC5398.m10490(r14)
            if (r14 == 0) goto L62
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪世哲兰苏 r14 = r13.this$0
            kotlinx.coroutines.飘花落叶言子哲楪世兰苏 r14 = r14.f16553
            if (r14 == 0) goto L3d
            r13.L$0 = r4
            r13.label = r3
            java.lang.Object r14 = r14.mo10558(r13)
            if (r14 != r1) goto L3d
            goto L61
        L3d:
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪世哲兰苏 r14 = r13.this$0
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r6 = r14.f16555
            kotlin.jvm.internal.Ref$FloatRef r14 = r13.$targetAlpha
            float r14 = r14.element
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r14)
            r14 = 120(0x78, float:1.68E-43)
            androidx.collection.飘花落叶言子楪苏世哲兰 r0 = androidx.compose.animation.core.AbstractC0336.f1141
            androidx.compose.animation.core.飘花落叶言子苏兰楪哲世 r8 = androidx.compose.animation.core.AbstractC0330.m1012(r14, r5, r0)
            r13.L$0 = r4
            r13.label = r5
            r9 = 0
            r10 = 0
            r12 = 12
            r11 = r13
            java.lang.Object r13 = androidx.compose.animation.core.C0331.m1028(r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r1) goto L62
        L61:
            return r1
        L62:
            kotlin.飘花落叶言子楪兰苏哲世 r13 = kotlin.C5175.f14739
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.utils.MiuixIndication$MiuixIndicationInstance$updateStates$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
