package androidx.compose.foundation.text.selection;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6558;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2", f = "TextFieldSelectionManager.kt", l = {241, 243}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
final class TextFieldSelectionManager$contextMenuAreaModifier$2 extends SuspendLambda implements InterfaceC6558 {
    int label;
    final /* synthetic */ C0882 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$contextMenuAreaModifier$2(C0882 c0882, InterfaceC4357<? super TextFieldSelectionManager$contextMenuAreaModifier$2> interfaceC4357) {
        super(1, interfaceC4357);
        this.this$0 = c0882;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(InterfaceC4357<?> interfaceC4357) {
        return new TextFieldSelectionManager$contextMenuAreaModifier$2(this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TextFieldSelectionManager$contextMenuAreaModifier$2) create(interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r9 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            kotlin.飘花落叶言子楪兰苏哲世 r2 = kotlin.C5176.f14739
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L12
            kotlin.AbstractC5185.m10210(r9)
            goto L56
        L12:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r8)
            r8 = 0
            return r8
        L19:
            kotlin.AbstractC5185.m10210(r9)
            goto L2b
        L1d:
            kotlin.AbstractC5185.m10210(r9)
            androidx.compose.foundation.text.selection.飘花落叶言子世兰哲苏楪 r9 = r8.this$0
            r8.label = r4
            java.lang.Object r9 = r9.m1754(r8)
            if (r9 != r0) goto L2b
            goto L55
        L2b:
            androidx.compose.foundation.text.selection.飘花落叶言子世兰哲苏楪 r9 = r8.this$0
            kotlin.Pair r9 = androidx.compose.foundation.text.selection.C0882.m1751(r9)
            if (r9 == 0) goto L56
            androidx.compose.foundation.text.selection.飘花落叶言子世兰哲苏楪 r1 = r8.this$0
            java.lang.Object r5 = r9.component1()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r9 = r9.component2()
            androidx.compose.ui.text.飘花落叶言子世哲苏兰楪 r9 = (androidx.compose.ui.text.C2035) r9
            long r6 = r9.f6004
            androidx.compose.foundation.text.selection.飘花落叶言子楪哲世兰苏 r9 = r1.f2507
            if (r9 == 0) goto L56
            r8.label = r3
            androidx.compose.foundation.text.selection.飘花落叶言子楪哲苏兰世 r9 = (androidx.compose.foundation.text.selection.C0922) r9
            java.lang.Object r9 = r9.m1861(r5, r6, r8)
            if (r9 != r0) goto L52
            goto L53
        L52:
            r9 = r2
        L53:
            if (r9 != r0) goto L56
        L55:
            return r0
        L56:
            androidx.compose.foundation.text.selection.飘花落叶言子世兰哲苏楪 r8 = r8.this$0
            r8.f2481 = r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
