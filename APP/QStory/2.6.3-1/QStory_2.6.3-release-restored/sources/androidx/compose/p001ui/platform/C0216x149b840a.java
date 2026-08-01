package androidx.compose.p001ui.platform;

import androidx.compose.runtime.C2218;
import androidx.lifecycle.InterfaceC3221;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", m556f = "WindowRecomposer.android.kt", m557l = {379}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class C0216x149b840a extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Ref$ObjectRef<C2703> $motionDurationScaleImpl;
    final /* synthetic */ C2218 $recomposer;
    final /* synthetic */ C2678 $self;
    final /* synthetic */ InterfaceC3221 $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0216x149b840a(Ref$ObjectRef<C2703> ref$ObjectRef, C2218 c2218, InterfaceC3221 interfaceC3221, C2678 c2678, InterfaceC5189<? super C0216x149b840a> interfaceC5189) {
        super(2, interfaceC5189);
        this.$motionDurationScaleImpl = ref$ObjectRef;
        this.$recomposer = c2218;
        this.$source = interfaceC3221;
        this.$self = c2678;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new C0216x149b840a(this.$motionDurationScaleImpl, this.$recomposer, this.$source, this.$self, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((C0216x149b840a) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.飘花落叶言子楪兰苏哲世] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C2703 c2703 = this.$motionDurationScaleImpl.element;
                if (c2703 != null) {
                    c2703.f5716 = AbstractC6231.m11048(this.$recomposer.f4337);
                }
                C2218 c2218 = this.$recomposer;
                this.label = 1;
                if (c2218.m3073(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
            this.$source.getLifecycle().mo5062(this.$self);
            this = C6008.f15084;
            return this;
        } catch (Throwable th) {
            this.$source.getLifecycle().mo5062(this.$self);
            throw th;
        }
    }
}
