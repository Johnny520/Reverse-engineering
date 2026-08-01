package top.yukonga.miuix.kmp.utils;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.utils.MiuixOverscrollEffect$startSpringAnimationX$1", f = "OverscrollFactory.kt", l = {154}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class MiuixOverscrollEffect$startSpringAnimationX$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ float $initialVelocity;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C6078 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiuixOverscrollEffect$startSpringAnimationX$1(C6078 c6078, float f, InterfaceC4357<? super MiuixOverscrollEffect$startSpringAnimationX$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c6078;
        this.$initialVelocity = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, C6078 c6078, long j) {
        if (ref$LongRef.element == -1) {
            ref$LongRef.element = j;
            return false;
        }
        ref$LongRef.element = j;
        boolean zM11410 = c6078.f16621.m11410((j - r0) / 1.0E9f);
        c6078.m11433((float) c6078.f16621.f16533);
        c6078.f16614 = AbstractC6053.m11414(c6078.f16617, c6078.f16622) * Math.signum(c6078.f16617);
        return zM11410;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        MiuixOverscrollEffect$startSpringAnimationX$1 miuixOverscrollEffect$startSpringAnimationX$1 = new MiuixOverscrollEffect$startSpringAnimationX$1(this.this$0, this.$initialVelocity, interfaceC4357);
        miuixOverscrollEffect$startSpringAnimationX$1.L$0 = obj;
        return miuixOverscrollEffect$startSpringAnimationX$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((MiuixOverscrollEffect$startSpringAnimationX$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[Catch: all -> 0x0019, TRY_ENTER, TryCatch #0 {all -> 0x0019, blocks: (B:6:0x0015, B:19:0x0061, B:14:0x003d, B:16:0x0043), top: B:30:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005e -> B:19:0x0061). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r0 = (kotlinx.coroutines.InterfaceC5401) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r9.label
            r3 = 0
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1
            if (r2 == 0) goto L22
            if (r2 != r6) goto L1b
            java.lang.Object r2 = r9.L$1
            kotlin.jvm.internal.Ref$LongRef r2 = (kotlin.jvm.internal.Ref$LongRef) r2
            kotlin.AbstractC5185.m10210(r10)     // Catch: java.lang.Throwable -> L19
            goto L61
        L19:
            r10 = move-exception
            goto L68
        L1b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r9)
            r9 = 0
            return r9
        L22:
            kotlin.AbstractC5185.m10210(r10)
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰 r10 = r9.this$0
            top.yukonga.miuix.kmp.utils.飘花落叶言子世楪兰哲苏 r2 = r10.f16621
            float r10 = r10.f16617
            float r7 = r9.$initialVelocity
            r2.m11411(r10, r7)
            kotlin.jvm.internal.Ref$LongRef r10 = new kotlin.jvm.internal.Ref$LongRef
            r10.<init>()
            r7 = -1
            r10.element = r7
            r2 = r10
            r10 = r3
        L3b:
            if (r10 != 0) goto L81
            boolean r7 = kotlinx.coroutines.AbstractC5399.m10495(r0)     // Catch: java.lang.Throwable -> L19
            if (r7 == 0) goto L81
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰 r7 = r9.this$0     // Catch: java.lang.Throwable -> L19
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪世兰哲苏 r8 = new top.yukonga.miuix.kmp.utils.飘花落叶言子楪世兰哲苏     // Catch: java.lang.Throwable -> L19
            r8.<init>(r2, r7, r3)     // Catch: java.lang.Throwable -> L19
            r9.L$0 = r0     // Catch: java.lang.Throwable -> L19
            r9.L$1 = r2     // Catch: java.lang.Throwable -> L19
            r9.I$0 = r10     // Catch: java.lang.Throwable -> L19
            r9.label = r6     // Catch: java.lang.Throwable -> L19
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r10 = r9.getContext()     // Catch: java.lang.Throwable -> L19
            androidx.compose.runtime.飘花落叶言子世兰楪苏哲 r10 = androidx.compose.runtime.AbstractC1367.m2492(r10)     // Catch: java.lang.Throwable -> L19
            java.lang.Object r10 = r10.mo2305(r8, r9)     // Catch: java.lang.Throwable -> L19
            if (r10 != r1) goto L61
            return r1
        L61:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L19
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L19
            goto L3b
        L68:
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰 r0 = r9.this$0
            float r0 = r0.f16617
            float r0 = java.lang.Math.abs(r0)
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰 r1 = r9.this$0
            r1.getClass()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto L80
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰 r9 = r9.this$0
            r9.m11433(r4)
            r9.f16614 = r4
        L80:
            throw r10
        L81:
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰 r10 = r9.this$0
            float r10 = r10.f16617
            float r10 = java.lang.Math.abs(r10)
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰 r0 = r9.this$0
            r0.getClass()
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 > 0) goto L99
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰 r9 = r9.this$0
            r9.m11433(r4)
            r9.f16614 = r4
        L99:
            kotlin.飘花落叶言子楪兰苏哲世 r9 = kotlin.C5176.f14739
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.utils.MiuixOverscrollEffect$startSpringAnimationX$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
