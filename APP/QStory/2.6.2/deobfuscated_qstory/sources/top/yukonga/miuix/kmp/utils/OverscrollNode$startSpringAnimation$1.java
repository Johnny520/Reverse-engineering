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
@InterfaceC6861(c = "top.yukonga.miuix.kmp.utils.OverscrollNode$startSpringAnimation$1", f = "Overscroll.kt", l = {227}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class OverscrollNode$startSpringAnimation$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ float $initialVelocity;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C6064 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverscrollNode$startSpringAnimation$1(C6064 c6064, float f, InterfaceC4356<? super OverscrollNode$startSpringAnimation$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c6064;
        this.$initialVelocity = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, C6064 c6064, long j) {
        if (ref$LongRef.element == -1) {
            ref$LongRef.element = j;
            return false;
        }
        ref$LongRef.element = j;
        boolean zM11350 = c6064.f16591.m11350((j - r0) / 1.0E9f);
        c6064.m11366((float) c6064.f16591.f16524);
        c6064.f16589 = AbstractC6047.m11354(c6064.f16586, c6064.f16588) * Math.signum(c6064.f16586);
        return zM11350;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        OverscrollNode$startSpringAnimation$1 overscrollNode$startSpringAnimation$1 = new OverscrollNode$startSpringAnimation$1(this.this$0, this.$initialVelocity, interfaceC4356);
        overscrollNode$startSpringAnimation$1.L$0 = obj;
        return overscrollNode$startSpringAnimation$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((OverscrollNode$startSpringAnimation$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[Catch: all -> 0x0016, TRY_ENTER, TryCatch #0 {all -> 0x0016, blocks: (B:6:0x0012, B:19:0x005e, B:14:0x003a, B:16:0x0040), top: B:30:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005b -> B:19:0x005e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r0 = (kotlinx.coroutines.InterfaceC5400) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r7.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1f
            if (r2 != r4) goto L18
            java.lang.Object r2 = r7.L$1
            kotlin.jvm.internal.Ref$LongRef r2 = (kotlin.jvm.internal.Ref$LongRef) r2
            kotlin.AbstractC5184.m10206(r8)     // Catch: java.lang.Throwable -> L16
            goto L5e
        L16:
            r8 = move-exception
            goto L65
        L18:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            r7 = 0
            return r7
        L1f:
            kotlin.AbstractC5184.m10206(r8)
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰苏哲世 r8 = r7.this$0
            top.yukonga.miuix.kmp.utils.飘花落叶言子世楪兰哲苏 r2 = r8.f16591
            float r8 = r8.f16586
            float r5 = r7.$initialVelocity
            r2.m11351(r8, r5)
            kotlin.jvm.internal.Ref$LongRef r8 = new kotlin.jvm.internal.Ref$LongRef
            r8.<init>()
            r5 = -1
            r8.element = r5
            r2 = r8
            r8 = r3
        L38:
            if (r8 != 0) goto L79
            boolean r5 = kotlinx.coroutines.AbstractC5398.m10491(r0)     // Catch: java.lang.Throwable -> L16
            if (r5 == 0) goto L79
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰苏哲世 r5 = r7.this$0     // Catch: java.lang.Throwable -> L16
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰苏世哲 r6 = new top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰苏世哲     // Catch: java.lang.Throwable -> L16
            r6.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L16
            r7.L$0 = r0     // Catch: java.lang.Throwable -> L16
            r7.L$1 = r2     // Catch: java.lang.Throwable -> L16
            r7.I$0 = r8     // Catch: java.lang.Throwable -> L16
            r7.label = r4     // Catch: java.lang.Throwable -> L16
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r8 = r7.getContext()     // Catch: java.lang.Throwable -> L16
            androidx.compose.runtime.飘花落叶言子世兰楪苏哲 r8 = androidx.compose.runtime.AbstractC1367.m2482(r8)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = r8.mo2295(r6, r7)     // Catch: java.lang.Throwable -> L16
            if (r8 != r1) goto L5e
            return r1
        L5e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L16
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L16
            goto L38
        L65:
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰苏哲世 r0 = r7.this$0
            float r0 = r0.f16586
            float r0 = java.lang.Math.abs(r0)
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰苏哲世 r7 = r7.this$0
            float r1 = r7.f16587
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L78
            r7.m11365()
        L78:
            throw r8
        L79:
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰苏哲世 r8 = r7.this$0
            float r8 = r8.f16586
            float r8 = java.lang.Math.abs(r8)
            top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰苏哲世 r7 = r7.this$0
            float r0 = r7.f16587
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 > 0) goto L8c
            r7.m11365()
        L8c:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5175.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.utils.OverscrollNode$startSpringAnimation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
