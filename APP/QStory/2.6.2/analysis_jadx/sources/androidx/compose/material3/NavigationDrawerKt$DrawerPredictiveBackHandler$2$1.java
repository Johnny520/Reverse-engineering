package androidx.compose.material3;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.InterfaceC5318;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1", f = "NavigationDrawer.kt", l = {957, 983, 983, 983}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;", "Landroidx/activity/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/material3/internal/BackEventCompat;", "progress", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;)V"}, k = 3, mv = {2, 0, 0})
final class NavigationDrawerKt$DrawerPredictiveBackHandler$2$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ AbstractC1188 $drawerPredictiveBackState;
    final /* synthetic */ AbstractC1189 $drawerState;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ Ref$FloatRef $maxScaleXDistanceGrow;
    final /* synthetic */ Ref$FloatRef $maxScaleXDistanceShrink;
    final /* synthetic */ Ref$FloatRef $maxScaleYDistance;
    final /* synthetic */ InterfaceC5400 $scope;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6861(c = "androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2", f = "NavigationDrawer.kt", l = {974}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ AbstractC1188 $drawerPredictiveBackState;
        int label;

        public AnonymousClass2(AbstractC1188 abstractC1188, InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
            super(2, interfaceC4356);
        }

        private static final C5175 invokeSuspend$lambda$0(AbstractC1188 abstractC1188, float f, float f2) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass2(null, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5184.m10206(obj);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$DrawerPredictiveBackHandler$2$1(AbstractC1188 abstractC1188, InterfaceC5400 interfaceC5400, AbstractC1189 abstractC1189, boolean z, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, Ref$FloatRef ref$FloatRef3, InterfaceC4356<? super NavigationDrawerKt$DrawerPredictiveBackHandler$2$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$scope = interfaceC5400;
        this.$isRtl = z;
        this.$maxScaleXDistanceGrow = ref$FloatRef;
        this.$maxScaleXDistanceShrink = ref$FloatRef2;
        this.$maxScaleYDistance = ref$FloatRef3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        NavigationDrawerKt$DrawerPredictiveBackHandler$2$1 navigationDrawerKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawerKt$DrawerPredictiveBackHandler$2$1(null, this.$scope, null, this.$isRtl, this.$maxScaleXDistanceGrow, this.$maxScaleXDistanceShrink, this.$maxScaleYDistance, interfaceC4356);
        navigationDrawerKt$DrawerPredictiveBackHandler$2$1.L$0 = obj;
        return navigationDrawerKt$DrawerPredictiveBackHandler$2$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5318 interfaceC5318, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((NavigationDrawerKt$DrawerPredictiveBackHandler$2$1) create(interfaceC5318, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            r0 = 2
            if (r1 == r0) goto L21
            r0 = 3
            if (r1 == r0) goto L21
            r0 = 4
            if (r1 == r0) goto L19
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r8)
            return r3
        L19:
            java.lang.Object r8 = r8.L$0
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            kotlin.AbstractC5184.m10206(r9)
            throw r8
        L21:
            kotlin.AbstractC5184.m10206(r9)
            kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5175.f14739
            return r8
        L27:
            kotlin.AbstractC5184.m10206(r9)     // Catch: java.util.concurrent.CancellationException -> L49 java.lang.Throwable -> L4a
            goto L48
        L2b:
            kotlin.AbstractC5184.m10206(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r9 = (kotlinx.coroutines.flow.InterfaceC5318) r9
            androidx.compose.animation.飘花落叶言子楪哲世苏兰 r1 = new androidx.compose.animation.飘花落叶言子楪哲世苏兰     // Catch: java.util.concurrent.CancellationException -> L49 java.lang.Throwable -> L4a
            boolean r4 = r8.$isRtl     // Catch: java.util.concurrent.CancellationException -> L49 java.lang.Throwable -> L4a
            kotlin.jvm.internal.Ref$FloatRef r5 = r8.$maxScaleXDistanceGrow     // Catch: java.util.concurrent.CancellationException -> L49 java.lang.Throwable -> L4a
            kotlin.jvm.internal.Ref$FloatRef r6 = r8.$maxScaleXDistanceShrink     // Catch: java.util.concurrent.CancellationException -> L49 java.lang.Throwable -> L4a
            kotlin.jvm.internal.Ref$FloatRef r7 = r8.$maxScaleYDistance     // Catch: java.util.concurrent.CancellationException -> L49 java.lang.Throwable -> L4a
            r1.<init>(r4, r5, r6, r7)     // Catch: java.util.concurrent.CancellationException -> L49 java.lang.Throwable -> L4a
            r8.label = r2     // Catch: java.util.concurrent.CancellationException -> L49 java.lang.Throwable -> L4a
            java.lang.Object r8 = r9.mo8463(r1, r8)     // Catch: java.util.concurrent.CancellationException -> L49 java.lang.Throwable -> L4a
            if (r8 != r0) goto L48
            return r0
        L48:
            throw r3
        L49:
            throw r3     // Catch: java.lang.Throwable -> L4a
        L4a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
