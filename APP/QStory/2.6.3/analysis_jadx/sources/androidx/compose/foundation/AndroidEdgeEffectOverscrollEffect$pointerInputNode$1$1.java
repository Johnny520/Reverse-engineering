package androidx.compose.foundation;

import androidx.compose.ui.input.pointer.InterfaceC1633;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", l = {788, 792}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C1052 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1(C1052 c1052, InterfaceC4357<? super AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c1052;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1 androidEdgeEffectOverscrollEffect$pointerInputNode$1$1 = new AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1(this.this$0, interfaceC4357);
        androidEdgeEffectOverscrollEffect$pointerInputNode$1$1.L$0 = obj;
        return androidEdgeEffectOverscrollEffect$pointerInputNode$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r13 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004a -> B:17:0x004d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1b
            if (r1 != r2) goto L15
            java.lang.Object r1 = r12.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            kotlin.AbstractC5185.m10210(r13)
            goto L4d
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r12)
            return r3
        L1b:
            java.lang.Object r1 = r12.L$0
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            kotlin.AbstractC5185.m10210(r13)
            goto L36
        L23:
            kotlin.AbstractC5185.m10210(r13)
            java.lang.Object r13 = r12.L$0
            r1 = r13
            androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r1 = (androidx.compose.ui.input.pointer.InterfaceC1633) r1
            r12.L$0 = r1
            r12.label = r4
            java.lang.Object r13 = androidx.compose.foundation.gestures.AbstractC0503.m1275(r1, r3, r12, r2)
            if (r13 != r0) goto L36
            goto L4c
        L36:
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r13 = (androidx.compose.ui.input.pointer.C1643) r13
            androidx.compose.foundation.飘花落叶言子楪世哲兰苏 r4 = r12.this$0
            long r5 = r13.f4809
            r4.f3108 = r5
            long r5 = r13.f4807
            r4.f3106 = r5
        L42:
            r12.L$0 = r1
            r12.label = r2
            java.lang.Object r13 = androidx.compose.ui.input.pointer.InterfaceC1633.m3016(r1, r12)
            if (r13 != r0) goto L4d
        L4c:
            return r0
        L4d:
            androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r13 = (androidx.compose.ui.input.pointer.C1652) r13
            java.util.List r13 = r13.f4852
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r13.size()
            r4.<init>(r5)
            int r5 = r13.size()
            r6 = 0
            r7 = r6
        L60:
            if (r7 >= r5) goto L73
            java.lang.Object r8 = r13.get(r7)
            r9 = r8
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r9 = (androidx.compose.ui.input.pointer.C1643) r9
            boolean r9 = r9.f4806
            if (r9 == 0) goto L70
            r4.add(r8)
        L70:
            int r7 = r7 + 1
            goto L60
        L73:
            androidx.compose.foundation.飘花落叶言子楪世哲兰苏 r13 = r12.this$0
            int r5 = r4.size()
        L79:
            if (r6 >= r5) goto L90
            java.lang.Object r7 = r4.get(r6)
            r8 = r7
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r8 = (androidx.compose.ui.input.pointer.C1643) r8
            long r8 = r8.f4809
            long r10 = r13.f3108
            boolean r8 = androidx.compose.ui.input.pointer.AbstractC1646.m3026(r8, r10)
            if (r8 == 0) goto L8d
            goto L91
        L8d:
            int r6 = r6 + 1
            goto L79
        L90:
            r7 = r3
        L91:
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r7 = (androidx.compose.ui.input.pointer.C1643) r7
            if (r7 != 0) goto L9c
            java.lang.Object r13 = kotlin.collections.AbstractC4344.m8815(r4)
            r7 = r13
            androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r7 = (androidx.compose.ui.input.pointer.C1643) r7
        L9c:
            if (r7 == 0) goto La8
            androidx.compose.foundation.飘花落叶言子楪世哲兰苏 r13 = r12.this$0
            long r5 = r7.f4809
            r13.f3108 = r5
            long r5 = r7.f4807
            r13.f3106 = r5
        La8:
            boolean r13 = r4.isEmpty()
            if (r13 == 0) goto L42
            androidx.compose.foundation.飘花落叶言子楪世哲兰苏 r12 = r12.this$0
            r0 = -1
            r12.f3108 = r0
            kotlin.飘花落叶言子楪兰苏哲世 r12 = kotlin.C5176.f14739
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
