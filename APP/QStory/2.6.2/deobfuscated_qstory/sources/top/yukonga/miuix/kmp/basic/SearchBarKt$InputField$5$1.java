package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.core.C0331;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.ui.focus.C1468;
import androidx.compose.ui.focus.InterfaceC1485;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.SearchBarKt$InputField$5$1", f = "SearchBar.kt", l = {297, 299, 301}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class SearchBarKt$InputField$5$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC1333 $currentOnQueryChange$delegate;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ InterfaceC1485 $focusManager;
    final /* synthetic */ C1468 $focusRequester;
    final /* synthetic */ boolean $focused;
    final /* synthetic */ String $query;
    final /* synthetic */ C0331 $textAlpha;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$InputField$5$1(boolean z, C1468 c1468, boolean z2, String str, C0331 c0331, InterfaceC1485 interfaceC1485, InterfaceC1333 interfaceC1333, InterfaceC4356<? super SearchBarKt$InputField$5$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$expanded = z;
        this.$focusRequester = c1468;
        this.$focused = z2;
        this.$query = str;
        this.$textAlpha = c0331;
        this.$focusManager = interfaceC1485;
        this.$currentOnQueryChange$delegate = interfaceC1333;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new SearchBarKt$InputField$5$1(this.$expanded, this.$focusRequester, this.$focused, this.$query, this.$textAlpha, this.$focusManager, this.$currentOnQueryChange$delegate, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((SearchBarKt$InputField$5$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r11.m1030(r12, r9) != r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L20
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L14
            kotlin.AbstractC5184.m10206(r12)
            goto L7e
        L14:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r11)
            r11 = 0
            return r11
        L1b:
            kotlin.AbstractC5184.m10206(r12)
            r9 = r11
            goto L5f
        L20:
            kotlin.AbstractC5184.m10206(r12)
            goto L40
        L24:
            kotlin.AbstractC5184.m10206(r12)
            boolean r12 = r11.$expanded
            if (r12 == 0) goto L31
            androidx.compose.ui.focus.飘花落叶言子楪兰世哲苏 r11 = r11.$focusRequester
            androidx.compose.ui.focus.C1468.m2622(r11)
            goto L84
        L31:
            boolean r12 = r11.$focused
            if (r12 == 0) goto L84
            r11.label = r4
            r4 = 100
            java.lang.Object r12 = kotlinx.coroutines.AbstractC5398.m10495(r4, r11)
            if (r12 != r0) goto L40
            goto L7d
        L40:
            java.lang.String r12 = r11.$query
            int r12 = r12.length()
            if (r12 <= 0) goto L7e
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r4 = r11.$textAlpha
            java.lang.Float r5 = new java.lang.Float
            r12 = 0
            r5.<init>(r12)
            r11.label = r3
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 14
            r9 = r11
            java.lang.Object r11 = androidx.compose.animation.core.C0331.m1028(r4, r5, r6, r7, r8, r9, r10)
            if (r11 != r0) goto L5f
            goto L7d
        L5f:
            androidx.compose.runtime.飘花落叶言子哲兰世楪苏 r11 = r9.$currentOnQueryChange$delegate
            java.lang.Object r11 = r11.getValue()
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r11 = (p052.InterfaceC6557) r11
            java.lang.String r12 = ""
            r11.invoke(r12)
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r11 = r9.$textAlpha
            java.lang.Float r12 = new java.lang.Float
            r1 = 1065353216(0x3f800000, float:1.0)
            r12.<init>(r1)
            r9.label = r2
            java.lang.Object r11 = r11.m1030(r12, r9)
            if (r11 != r0) goto L7f
        L7d:
            return r0
        L7e:
            r9 = r11
        L7f:
            androidx.compose.ui.focus.飘花落叶言子楪苏哲兰世 r11 = r9.$focusManager
            androidx.compose.ui.focus.InterfaceC1485.m2645(r11)
        L84:
            kotlin.飘花落叶言子楪兰苏哲世 r11 = kotlin.C5175.f14739
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.basic.SearchBarKt$InputField$5$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
