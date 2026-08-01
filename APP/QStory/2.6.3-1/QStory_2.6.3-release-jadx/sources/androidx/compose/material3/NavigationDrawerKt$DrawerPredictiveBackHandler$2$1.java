package androidx.compose.material3;

import androidx.compose.animation.C1258;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.InterfaceC6151;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1", m556f = "NavigationDrawer.kt", m557l = {957, 983, 983, 983}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;", "Landroidx/activity/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/material3/internal/BackEventCompat;", "progress", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世哲兰;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class NavigationDrawerKt$DrawerPredictiveBackHandler$2$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC2023 $drawerPredictiveBackState;
    final /* synthetic */ AbstractC2024 $drawerState;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ Ref$FloatRef $maxScaleXDistanceGrow;
    final /* synthetic */ Ref$FloatRef $maxScaleXDistanceShrink;
    final /* synthetic */ Ref$FloatRef $maxScaleYDistance;
    final /* synthetic */ InterfaceC6233 $scope;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2", m556f = "NavigationDrawer.kt", m557l = {974}, m558m = "invokeSuspend")
    public static final class C01482 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ AbstractC2023 $drawerPredictiveBackState;
        int label;

        public C01482(AbstractC2023 abstractC2023, InterfaceC5189<? super C01482> interfaceC5189) {
            super(2, interfaceC5189);
        }

        private static final C6008 invokeSuspend$lambda$0(AbstractC2023 abstractC2023, float f, float f2) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C01482(null, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01482) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC6017.m10769(obj);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$DrawerPredictiveBackHandler$2$1(AbstractC2023 abstractC2023, InterfaceC6233 interfaceC6233, AbstractC2024 abstractC2024, boolean z, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, Ref$FloatRef ref$FloatRef3, InterfaceC5189<? super NavigationDrawerKt$DrawerPredictiveBackHandler$2$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$scope = interfaceC6233;
        this.$isRtl = z;
        this.$maxScaleXDistanceGrow = ref$FloatRef;
        this.$maxScaleXDistanceShrink = ref$FloatRef2;
        this.$maxScaleYDistance = ref$FloatRef3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        NavigationDrawerKt$DrawerPredictiveBackHandler$2$1 navigationDrawerKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawerKt$DrawerPredictiveBackHandler$2$1(null, this.$scope, null, this.$isRtl, this.$maxScaleXDistanceGrow, this.$maxScaleXDistanceShrink, this.$maxScaleYDistance, interfaceC5189);
        navigationDrawerKt$DrawerPredictiveBackHandler$2$1.L$0 = obj;
        return navigationDrawerKt$DrawerPredictiveBackHandler$2$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6151 interfaceC6151, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((NavigationDrawerKt$DrawerPredictiveBackHandler$2$1) create(interfaceC6151, interfaceC5189)).invokeSuspend(C6008.f15084);
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
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC6151 interfaceC6151 = (InterfaceC6151) this.L$0;
                C1258 c1258 = new C1258(this.$isRtl, this.$maxScaleXDistanceGrow, this.$maxScaleXDistanceShrink, this.$maxScaleYDistance);
                this.label = 1;
                if (interfaceC6151.mo9012(c1258, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                throw null;
            }
            if (i == 1) {
                AbstractC6017.m10769(obj);
                throw null;
            }
            if (i == 2 || i == 3) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            if (i != 4) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Throwable th = (Throwable) this.L$0;
            AbstractC6017.m10769(obj);
            throw th;
        } catch (CancellationException unused) {
            throw null;
        }
    }
}
