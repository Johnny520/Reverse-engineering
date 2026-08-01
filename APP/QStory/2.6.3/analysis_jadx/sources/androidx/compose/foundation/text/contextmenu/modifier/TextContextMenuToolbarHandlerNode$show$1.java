package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0834;
import com.android.dx.io.Opcodes;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1", f = "TextContextMenuToolbarHandlerModifier.kt", l = {Opcodes.MUL_DOUBLE_2ADDR, Opcodes.DIV_DOUBLE_2ADDR, Opcodes.ADD_INT_LIT16, Opcodes.ADD_INT_LIT16}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TextContextMenuToolbarHandlerNode$show$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC0834 $provider;
    Object L$0;
    int label;
    final /* synthetic */ C0823 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextContextMenuToolbarHandlerNode$show$1(C0823 c0823, InterfaceC0834 interfaceC0834, InterfaceC4357<? super TextContextMenuToolbarHandlerNode$show$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c0823;
        this.$provider = interfaceC0834;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new TextContextMenuToolbarHandlerNode$show$1(this.this$0, this.$provider, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TextContextMenuToolbarHandlerNode$show$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r7.invoke(r6) == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L25
            if (r1 == r3) goto L21
            if (r1 == r2) goto L19
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            r6 = 0
            return r6
        L19:
            java.lang.Object r6 = r6.L$0
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.AbstractC5185.m10210(r7)
            goto L72
        L21:
            kotlin.AbstractC5185.m10210(r7)
            goto L5d
        L25:
            kotlin.AbstractC5185.m10210(r7)     // Catch: java.lang.Throwable -> L29
            goto L4e
        L29:
            r7 = move-exception
            goto L60
        L2b:
            kotlin.AbstractC5185.m10210(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L2f:
            kotlin.AbstractC5185.m10210(r7)
            androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏兰世哲 r7 = r6.this$0     // Catch: java.lang.Throwable -> L29
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r7 = r7.f2345     // Catch: java.lang.Throwable -> L29
            if (r7 == 0) goto L41
            r6.label = r5     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L29
            if (r7 != r0) goto L41
            goto L70
        L41:
            androidx.compose.foundation.text.contextmenu.provider.飘花落叶言子楪苏世哲兰 r7 = r6.$provider     // Catch: java.lang.Throwable -> L29
            androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏兰世哲 r1 = r6.this$0     // Catch: java.lang.Throwable -> L29
            r6.label = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r7.mo1636(r1, r6)     // Catch: java.lang.Throwable -> L29
            if (r7 != r0) goto L4e
            goto L70
        L4e:
            androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏兰世哲 r7 = r6.this$0
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r7 = r7.f2344
            if (r7 == 0) goto L5d
            r6.label = r3
            java.lang.Object r6 = r7.invoke(r6)
            if (r6 != r0) goto L5d
            goto L70
        L5d:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        L60:
            androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏兰世哲 r1 = r6.this$0
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r1 = r1.f2344
            if (r1 == 0) goto L73
            r6.L$0 = r7
            r6.label = r2
            java.lang.Object r6 = r1.invoke(r6)
            if (r6 != r0) goto L71
        L70:
            return r0
        L71:
            r6 = r7
        L72:
            r7 = r6
        L73:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
