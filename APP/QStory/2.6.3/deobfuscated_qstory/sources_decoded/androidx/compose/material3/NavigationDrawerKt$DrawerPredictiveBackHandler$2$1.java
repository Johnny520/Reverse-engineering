package androidx.compose.material3;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.flow.InterfaceC5319;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1", f = "NavigationDrawer.kt", l = {957, 983, 983, 983}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;", "Landroidx/activity/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/material3/internal/BackEventCompat;", "progress", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;)V"}, k = 3, mv = {2, 0, 0})
final class NavigationDrawerKt$DrawerPredictiveBackHandler$2$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ AbstractC1188 $drawerPredictiveBackState;
    final /* synthetic */ AbstractC1189 $drawerState;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ Ref$FloatRef $maxScaleXDistanceGrow;
    final /* synthetic */ Ref$FloatRef $maxScaleXDistanceShrink;
    final /* synthetic */ Ref$FloatRef $maxScaleYDistance;
    final /* synthetic */ InterfaceC5401 $scope;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6862(c = "androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2", f = "NavigationDrawer.kt", l = {974}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ AbstractC1188 $drawerPredictiveBackState;
        int label;

        public AnonymousClass2(AbstractC1188 abstractC1188, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
        }

        private static final C5176 invokeSuspend$lambda$0(AbstractC1188 abstractC1188, float f, float f2) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass2(null, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5185.m10210(obj);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$DrawerPredictiveBackHandler$2$1(AbstractC1188 abstractC1188, InterfaceC5401 interfaceC5401, AbstractC1189 abstractC1189, boolean z, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, Ref$FloatRef ref$FloatRef3, InterfaceC4357<? super NavigationDrawerKt$DrawerPredictiveBackHandler$2$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$scope = interfaceC5401;
        this.$isRtl = z;
        this.$maxScaleXDistanceGrow = ref$FloatRef;
        this.$maxScaleXDistanceShrink = ref$FloatRef2;
        this.$maxScaleYDistance = ref$FloatRef3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        NavigationDrawerKt$DrawerPredictiveBackHandler$2$1 navigationDrawerKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawerKt$DrawerPredictiveBackHandler$2$1(null, this.$scope, null, this.$isRtl, this.$maxScaleXDistanceGrow, this.$maxScaleXDistanceShrink, this.$maxScaleYDistance, interfaceC4357);
        navigationDrawerKt$DrawerPredictiveBackHandler$2$1.L$0 = obj;
        return navigationDrawerKt$DrawerPredictiveBackHandler$2$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5319 interfaceC5319, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((NavigationDrawerKt$DrawerPredictiveBackHandler$2$1) create(interfaceC5319, interfaceC4357)).invokeSuspend(C5176.f14739);
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
            top.suzhelan.qstory.hook.item.C5925.m11311(r8)
            return r3
        L19:
            java.lang.Object r8 = r8.L$0
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            kotlin.AbstractC5185.m10210(r9)
            throw r8
        L21:
            kotlin.AbstractC5185.m10210(r9)
            kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5176.f14739
            return r8
        L27:
            kotlin.AbstractC5185.m10210(r9)     // Catch: java.util.concurrent.CancellationException -> L49 java.lang.Throwable -> L4a
            goto L48
        L2b:
            kotlin.AbstractC5185.m10210(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.flow.飘花落叶言子楪苏世哲兰 r9 = (kotlinx.coroutines.flow.InterfaceC5319) r9
            androidx.compose.animation.飘花落叶言子楪哲世苏兰 r1 = new androidx.compose.animation.飘花落叶言子楪哲世苏兰     // Catch: java.util.concurrent.CancellationException -> L49 java.lang.Throwable -> L4a
            boolean r4 = r8.$isRtl     // Catch: java.util.concurrent.CancellationException -> L49 java.lang.Throwable -> L4a
            kotlin.jvm.internal.Ref$FloatRef r5 = r8.$maxScaleXDistanceGrow     // Catch: java.util.concurrent.CancellationException -> L49 java.lang.Throwable -> L4a
            kotlin.jvm.internal.Ref$FloatRef r6 = r8.$maxScaleXDistanceShrink     // Catch: java.util.concurrent.CancellationException -> L49 java.lang.Throwable -> L4a
            kotlin.jvm.internal.Ref$FloatRef r7 = r8.$maxScaleYDistance     // Catch: java.util.concurrent.CancellationException -> L49 java.lang.Throwable -> L4a
            r1.<init>(r4, r5, r6, r7)     // Catch: java.util.concurrent.CancellationException -> L49 java.lang.Throwable -> L4a
            r8.label = r2     // Catch: java.util.concurrent.CancellationException -> L49 java.lang.Throwable -> L4a
            java.lang.Object r8 = r9.mo8453(r1, r8)     // Catch: java.util.concurrent.CancellationException -> L49 java.lang.Throwable -> L4a
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
