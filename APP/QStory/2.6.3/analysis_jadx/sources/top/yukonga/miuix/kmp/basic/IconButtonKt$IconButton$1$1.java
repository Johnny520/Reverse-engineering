package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.runtime.InterfaceC1395;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.IconButtonKt$IconButton$1$1", f = "IconButton.kt", l = {61, 64}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class IconButtonKt$IconButton$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC1395 $holdDown;
    final /* synthetic */ boolean $holdDownState;
    final /* synthetic */ InterfaceC0580 $interactionSource;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonKt$IconButton$1$1(boolean z, InterfaceC1395 interfaceC1395, InterfaceC0580 interfaceC0580, InterfaceC4357<? super IconButtonKt$IconButton$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$holdDownState = z;
        this.$holdDown = interfaceC1395;
        this.$interactionSource = interfaceC0580;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new IconButtonKt$IconButton$1$1(this.$holdDownState, this.$holdDown, this.$interactionSource, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((IconButtonKt$IconButton$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (((androidx.compose.foundation.interaction.C0573) r1).m1354(r7, r6) == r0) goto L19;
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
            r4 = 0
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            java.lang.Object r0 = r6.L$1
            top.yukonga.miuix.kmp.interfaces.飘花落叶言子楪世苏哲兰 r0 = (top.yukonga.miuix.kmp.interfaces.C6047) r0
            java.lang.Object r6 = r6.L$0
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r6 = (androidx.compose.runtime.InterfaceC1395) r6
            kotlin.AbstractC5185.m10210(r7)
            goto L6b
        L19:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r4
        L1f:
            java.lang.Object r6 = r6.L$0
            top.yukonga.miuix.kmp.interfaces.飘花落叶言子楪世苏哲兰 r6 = (top.yukonga.miuix.kmp.interfaces.C6047) r6
            kotlin.AbstractC5185.m10210(r7)
            goto L6e
        L27:
            kotlin.AbstractC5185.m10210(r7)
            boolean r7 = r6.$holdDownState
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r1 = r6.$holdDown
            if (r7 == 0) goto L47
            top.yukonga.miuix.kmp.interfaces.飘花落叶言子楪世苏哲兰 r7 = new top.yukonga.miuix.kmp.interfaces.飘花落叶言子楪世苏哲兰
            r7.<init>()
            r1.setValue(r7)
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r1 = r6.$interactionSource
            r6.L$0 = r4
            r6.label = r3
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r1 = (androidx.compose.foundation.interaction.C0573) r1
            java.lang.Object r6 = r1.m1354(r7, r6)
            if (r6 != r0) goto L6e
            goto L69
        L47:
            java.lang.Object r7 = r1.getValue()
            top.yukonga.miuix.kmp.interfaces.飘花落叶言子楪世苏哲兰 r7 = (top.yukonga.miuix.kmp.interfaces.C6047) r7
            if (r7 == 0) goto L6e
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r1 = r6.$interactionSource
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r3 = r6.$holdDown
            top.yukonga.miuix.kmp.interfaces.飘花落叶言子楪世苏兰哲 r5 = new top.yukonga.miuix.kmp.interfaces.飘花落叶言子楪世苏兰哲
            r5.<init>(r7)
            r6.L$0 = r3
            r6.L$1 = r4
            r7 = 0
            r6.I$0 = r7
            r6.label = r2
            androidx.compose.foundation.interaction.飘花落叶言子楪哲世苏兰 r1 = (androidx.compose.foundation.interaction.C0573) r1
            java.lang.Object r6 = r1.m1354(r5, r6)
            if (r6 != r0) goto L6a
        L69:
            return r0
        L6a:
            r6 = r3
        L6b:
            r6.setValue(r4)
        L6e:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.basic.IconButtonKt$IconButton$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
