package androidx.compose.material3.internal;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.InterfaceC5206;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p181.C7755;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1", f = "AnimatedShape.kt", l = {140}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class AnimatedShapeKt$rememberAnimatedShape$3$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5206 $channel;
    final /* synthetic */ AbstractC1132 $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6861(c = "androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1$1", f = "AnimatedShape.kt", l = {142}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ C7755 $newTarget;
        final /* synthetic */ AbstractC1132 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC1132 abstractC1132, C7755 c7755, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$newTarget = c7755;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(null, this.$newTarget, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                this.label = 1;
                throw null;
            }
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return C5175.f14739;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedShapeKt$rememberAnimatedShape$3$1(InterfaceC5206 interfaceC5206, AbstractC1132 abstractC1132, InterfaceC4356<? super AnimatedShapeKt$rememberAnimatedShape$3$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$channel = interfaceC5206;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        AnimatedShapeKt$rememberAnimatedShape$3$1 animatedShapeKt$rememberAnimatedShape$3$1 = new AnimatedShapeKt$rememberAnimatedShape$3$1(this.$channel, null, interfaceC4356);
        animatedShapeKt$rememberAnimatedShape$3$1.L$0 = obj;
        return animatedShapeKt$rememberAnimatedShape$3$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((AnimatedShapeKt$rememberAnimatedShape$3$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0036 -> B:12:0x0039). Please report as a decompilation issue!!! */
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
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L16
            java.lang.Object r1 = r6.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r1 = (kotlinx.coroutines.channels.InterfaceC5211) r1
            java.lang.Object r4 = r6.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r4 = (kotlinx.coroutines.InterfaceC5400) r4
            kotlin.AbstractC5184.m10206(r7)
            goto L39
        L16:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r2
        L1c:
            kotlin.AbstractC5184.m10206(r7)
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r7 = (kotlinx.coroutines.InterfaceC5400) r7
            kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r1 = r6.$channel
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r1 = r1.iterator()
            r4 = r7
        L2a:
            r6.L$0 = r4
            r6.L$1 = r1
            r6.label = r3
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r1 = (kotlinx.coroutines.channels.C5190) r1
            java.lang.Object r7 = r1.m10260(r6)
            if (r7 != r0) goto L39
            return r0
        L39:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L63
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r1 = (kotlinx.coroutines.channels.C5190) r1
            java.lang.Object r7 = r1.m10258()
            飘花落叶言子楪兰苏哲世.飘花落叶言子楪世兰苏哲 r7 = (p181.C7755) r7
            kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r5 = r6.$channel
            java.lang.Object r5 = r5.mo10251()
            java.lang.Object r5 = kotlinx.coroutines.channels.C5201.m10268(r5)
            飘花落叶言子楪兰苏哲世.飘花落叶言子楪世兰苏哲 r5 = (p181.C7755) r5
            if (r5 != 0) goto L58
            goto L59
        L58:
            r7 = r5
        L59:
            androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1$1 r5 = new androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1$1
            r5.<init>(r2, r7, r2)
            r7 = 3
            kotlinx.coroutines.AbstractC5398.m10473(r4, r2, r2, r5, r7)
            goto L2a
        L63:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
