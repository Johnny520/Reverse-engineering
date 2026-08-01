package androidx.compose.foundation;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", l = {382, 386}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class MagnifierNode$onAttach$1 extends SuspendLambda implements InterfaceC6554 {
    int label;
    final /* synthetic */ C1076 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierNode$onAttach$1(C1076 c1076, InterfaceC4357<? super MagnifierNode$onAttach$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c1076;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0(long j) {
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new MagnifierNode$onAttach$1(this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((MagnifierNode$onAttach$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (androidx.compose.runtime.AbstractC1367.m2492(getContext()).mo2305(new androidx.compose.runtime.C1303(r7, r1), r6) == r0) goto L20;
     */
    /* JADX WARN: Path cross not found for [B:13:0x0024, B:16:0x002d], limit reached: 23 */
    /* JADX WARN: Path cross not found for [B:16:0x002d, B:13:0x0024], limit reached: 23 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0031 -> B:11:0x001e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004c -> B:21:0x004f). Please report as a decompilation issue!!! */
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
            kotlin.AbstractC5185.m10210(r7)
            goto L4f
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            r6 = 0
            return r6
        L17:
            kotlin.AbstractC5185.m10210(r7)
            goto L2d
        L1b:
            kotlin.AbstractC5185.m10210(r7)
        L1e:
            androidx.compose.foundation.飘花落叶言子苏世哲兰楪 r7 = r6.this$0
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r7 = r7.f3196
            if (r7 == 0) goto L2d
            r6.label = r3
            java.lang.Object r7 = kotlinx.coroutines.channels.C5190.m10222(r7, r6)
            if (r7 != r0) goto L2d
            goto L4e
        L2d:
            androidx.compose.foundation.飘花落叶言子苏世哲兰楪 r7 = r6.this$0
            androidx.compose.foundation.飘花落叶言子苏兰世哲楪 r7 = r7.f3200
            if (r7 == 0) goto L1e
            androidx.compose.foundation.飘花落叶言子苏世哲楪兰 r7 = new androidx.compose.foundation.飘花落叶言子苏世哲楪兰
            r1 = 0
            r7.<init>(r1)
            r6.label = r2
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r4 = r6.getContext()
            androidx.compose.runtime.飘花落叶言子世兰楪苏哲 r4 = androidx.compose.runtime.AbstractC1367.m2492(r4)
            androidx.compose.runtime.飘花落叶言子世兰楪哲苏 r5 = new androidx.compose.runtime.飘花落叶言子世兰楪哲苏
            r5.<init>(r7, r1)
            java.lang.Object r7 = r4.mo2305(r5, r6)
            if (r7 != r0) goto L4f
        L4e:
            return r0
        L4f:
            androidx.compose.foundation.飘花落叶言子苏世哲兰楪 r7 = r6.this$0
            androidx.compose.foundation.飘花落叶言子苏兰世哲楪 r7 = r7.f3200
            if (r7 == 0) goto L1e
            androidx.compose.foundation.飘花落叶言子苏兰哲世楪 r7 = (androidx.compose.foundation.C1082) r7
            r7.m1998()
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode$onAttach$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
