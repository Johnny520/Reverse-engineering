package androidx.compose.foundation.text.input.internal;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.flow.InterfaceC5294;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
@InterfaceC6862(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1", f = "AndroidTextInputSession.android.kt", l = {114, 115}, m = "invokeSuspend", v = 1)
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC0875 $composeImm;
    final /* synthetic */ InterfaceC5294 $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(InterfaceC5294 interfaceC5294, InterfaceC0875 interfaceC0875, InterfaceC4357<? super AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$it = interfaceC5294;
        this.$composeImm = interfaceC0875;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0(long j) {
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(this.$it, this.$composeImm, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r7.mo8453(r1, r6) == r0) goto L15;
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
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 == r3) goto L13
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r2
        L13:
            kotlin.AbstractC5185.m10210(r7)
            goto L4a
        L17:
            kotlin.AbstractC5185.m10210(r7)
            goto L3a
        L1b:
            kotlin.AbstractC5185.m10210(r7)
            androidx.compose.foundation.text.input.internal.飘花落叶言子楪世苏哲兰 r7 = new androidx.compose.foundation.text.input.internal.飘花落叶言子楪世苏哲兰
            r7.<init>(r4)
            r6.label = r4
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r1 = r6.getContext()
            androidx.compose.runtime.飘花落叶言子世兰楪苏哲 r1 = androidx.compose.runtime.AbstractC1367.m2492(r1)
            androidx.compose.runtime.飘花落叶言子世兰楪哲苏 r4 = new androidx.compose.runtime.飘花落叶言子世兰楪哲苏
            r5 = 0
            r4.<init>(r7, r5)
            java.lang.Object r7 = r1.mo2305(r4, r6)
            if (r7 != r0) goto L3a
            goto L49
        L3a:
            kotlinx.coroutines.flow.飘花落叶言子哲苏世兰楪 r7 = r6.$it
            androidx.compose.foundation.text.input.internal.飘花落叶言子楪世兰苏哲 r1 = new androidx.compose.foundation.text.input.internal.飘花落叶言子楪世兰苏哲
            r1.<init>(r2)
            r6.label = r3
            java.lang.Object r6 = r7.mo8453(r1, r6)
            if (r6 != r0) goto L4a
        L49:
            return r0
        L4a:
            io.ktor.util.C4211.m8602()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
