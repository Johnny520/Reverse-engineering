package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0834;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1", f = "TextContextMenuGesturesModifier.kt", l = {107, 108}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TextContextMenuGestureNode$tryShowContextMenu$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C0822 $dataProvider;
    final /* synthetic */ long $localClickOffset;
    final /* synthetic */ InterfaceC0834 $provider;
    int label;
    final /* synthetic */ C0821 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextContextMenuGestureNode$tryShowContextMenu$1(C0821 c0821, long j, InterfaceC0834 interfaceC0834, C0822 c0822, InterfaceC4356<? super TextContextMenuGestureNode$tryShowContextMenu$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0821;
        this.$localClickOffset = j;
        this.$provider = interfaceC0834;
        this.$dataProvider = c0822;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new TextContextMenuGestureNode$tryShowContextMenu$1(this.this$0, this.$localClickOffset, this.$provider, this.$dataProvider, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((TextContextMenuGestureNode$tryShowContextMenu$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7.mo1626(r1, r6) == r0) goto L17;
     */
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
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            kotlin.AbstractC5184.m10206(r7)
            goto L41
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            r6 = 0
            return r6
        L17:
            kotlin.AbstractC5184.m10206(r7)
            goto L34
        L1b:
            kotlin.AbstractC5184.m10206(r7)
            androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏世兰哲 r7 = r6.this$0
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r7 = r7.f2336
            if (r7 == 0) goto L34
            long r4 = r6.$localClickOffset
            飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏兰哲 r1 = new 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏兰哲
            r1.<init>(r4)
            r6.label = r3
            java.lang.Object r7 = r7.invoke(r1, r6)
            if (r7 != r0) goto L34
            goto L40
        L34:
            androidx.compose.foundation.text.contextmenu.provider.飘花落叶言子楪苏世哲兰 r7 = r6.$provider
            androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏世哲兰 r1 = r6.$dataProvider
            r6.label = r2
            java.lang.Object r6 = r7.mo1626(r1, r6)
            if (r6 != r0) goto L41
        L40:
            return r0
        L41:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
