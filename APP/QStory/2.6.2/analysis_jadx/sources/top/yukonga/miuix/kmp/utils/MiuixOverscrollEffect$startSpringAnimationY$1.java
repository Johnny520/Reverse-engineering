package top.yukonga.miuix.kmp.utils;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.utils.MiuixOverscrollEffect$startSpringAnimationY$1", f = "OverscrollFactory.kt", l = {185}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class MiuixOverscrollEffect$startSpringAnimationY$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ float $initialVelocity;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C6072 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiuixOverscrollEffect$startSpringAnimationY$1(C6072 c6072, float f, InterfaceC4356<? super MiuixOverscrollEffect$startSpringAnimationY$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c6072;
        this.$initialVelocity = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, C6072 c6072, long j) {
        if (ref$LongRef.element == -1) {
            ref$LongRef.element = j;
            return false;
        }
        ref$LongRef.element = j;
        boolean zM11350 = c6072.f16616.m11350((j - r0) / 1.0E9f);
        c6072.m11372((float) c6072.f16616.f16524);
        c6072.f16604 = AbstractC6047.m11354(c6072.f16607, c6072.f16603) * Math.signum(c6072.f16607);
        return zM11350;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        MiuixOverscrollEffect$startSpringAnimationY$1 miuixOverscrollEffect$startSpringAnimationY$1 = new MiuixOverscrollEffect$startSpringAnimationY$1(this.this$0, this.$initialVelocity, interfaceC4356);
        miuixOverscrollEffect$startSpringAnimationY$1.L$0 = obj;
        return miuixOverscrollEffect$startSpringAnimationY$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((MiuixOverscrollEffect$startSpringAnimationY$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[Catch: all -> 0x0018, TRY_ENTER, TryCatch #0 {all -> 0x0018, blocks: (B:6:0x0014, B:20:0x0062, B:14:0x003b, B:16:0x0041), top: B:31:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:20:0x0062). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r0 = (kotlinx.coroutines.InterfaceC5400) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r9.label
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 1
            if (r2 == 0) goto L21
            if (r2 != r5) goto L1a
            java.lang.Object r2 = r9.L$1
            kotlin.jvm.internal.Ref$LongRef r2 = (kotlin.jvm.internal.Ref$LongRef) r2
            kotlin.AbstractC5184.m10206(r10)     // Catch: java.lang.Throwable -> L18
            goto L62
        L18:
            r10 = move-exception
            goto L6c
        L1a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r9)
            r9 = 0
            return r9
        L21:
            kotlin.AbstractC5184.m10206(r10)
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰 r10 = r9.this$0
            top.yukonga.miuix.kmp.utils.飘花落叶言子世楪兰哲苏 r2 = r10.f16616
            float r10 = r10.f16607
            float r6 = r9.$initialVelocity
            r2.m11351(r10, r6)
            kotlin.jvm.internal.Ref$LongRef r10 = new kotlin.jvm.internal.Ref$LongRef
            r10.<init>()
            r6 = -1
            r10.element = r6
            r2 = 0
        L39:
            if (r2 != 0) goto L85
            boolean r6 = kotlinx.coroutines.AbstractC5398.m10491(r0)     // Catch: java.lang.Throwable -> L18
            if (r6 == 0) goto L85
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰 r6 = r9.this$0     // Catch: java.lang.Throwable -> L18
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪世兰哲苏 r7 = new top.yukonga.miuix.kmp.utils.飘花落叶言子楪世兰哲苏     // Catch: java.lang.Throwable -> L18
            r7.<init>(r10, r6, r5)     // Catch: java.lang.Throwable -> L18
            r9.L$0 = r0     // Catch: java.lang.Throwable -> L18
            r9.L$1 = r10     // Catch: java.lang.Throwable -> L18
            r9.I$0 = r2     // Catch: java.lang.Throwable -> L18
            r9.label = r5     // Catch: java.lang.Throwable -> L18
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r2 = r9.getContext()     // Catch: java.lang.Throwable -> L18
            androidx.compose.runtime.飘花落叶言子世兰楪苏哲 r2 = androidx.compose.runtime.AbstractC1367.m2482(r2)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = r2.mo2295(r7, r9)     // Catch: java.lang.Throwable -> L18
            if (r2 != r1) goto L5f
            return r1
        L5f:
            r8 = r2
            r2 = r10
            r10 = r8
        L62:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L18
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L18
            r8 = r2
            r2 = r10
            r10 = r8
            goto L39
        L6c:
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰 r0 = r9.this$0
            float r0 = r0.f16607
            float r0 = java.lang.Math.abs(r0)
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰 r1 = r9.this$0
            r1.getClass()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L84
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰 r9 = r9.this$0
            r9.m11372(r3)
            r9.f16604 = r3
        L84:
            throw r10
        L85:
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰 r10 = r9.this$0
            float r10 = r10.f16607
            float r10 = java.lang.Math.abs(r10)
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰 r0 = r9.this$0
            r0.getClass()
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 > 0) goto L9d
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世哲兰 r9 = r9.this$0
            r9.m11372(r3)
            r9.f16604 = r3
        L9d:
            kotlin.飘花落叶言子楪兰苏哲世 r9 = kotlin.C5175.f14739
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.utils.MiuixOverscrollEffect$startSpringAnimationY$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
