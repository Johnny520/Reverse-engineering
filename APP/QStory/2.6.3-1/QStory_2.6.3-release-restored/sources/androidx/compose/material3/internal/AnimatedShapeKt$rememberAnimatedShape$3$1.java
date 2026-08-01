package androidx.compose.material3.internal;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.C6023;
import kotlinx.coroutines.channels.C6034;
import kotlinx.coroutines.channels.InterfaceC6039;
import kotlinx.coroutines.channels.InterfaceC6044;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p197.C8585;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1", m556f = "AnimatedShape.kt", m557l = {140}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class AnimatedShapeKt$rememberAnimatedShape$3$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6039 $channel;
    final /* synthetic */ AbstractC1967 $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "androidx.compose.material3.internal.AnimatedShapeKt$rememberAnimatedShape$3$1$1", m556f = "AnimatedShape.kt", m557l = {142}, m558m = "invokeSuspend")
    public static final class C01561 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C8585 $newTarget;
        final /* synthetic */ AbstractC1967 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01561(AbstractC1967 abstractC1967, C8585 c8585, InterfaceC5189<? super C01561> interfaceC5189) {
            super(2, interfaceC5189);
            this.$newTarget = c8585;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C01561(null, this.$newTarget, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01561) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                this.label = 1;
                throw null;
            }
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedShapeKt$rememberAnimatedShape$3$1(InterfaceC6039 interfaceC6039, AbstractC1967 abstractC1967, InterfaceC5189<? super AnimatedShapeKt$rememberAnimatedShape$3$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$channel = interfaceC6039;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        AnimatedShapeKt$rememberAnimatedShape$3$1 animatedShapeKt$rememberAnimatedShape$3$1 = new AnimatedShapeKt$rememberAnimatedShape$3$1(this.$channel, null, interfaceC5189);
        animatedShapeKt$rememberAnimatedShape$3$1.L$0 = obj;
        return animatedShapeKt$rememberAnimatedShape$3$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((AnimatedShapeKt$rememberAnimatedShape$3$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0036 -> B:12:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6233 interfaceC6233;
        Object it;
        InterfaceC6044 interfaceC6044;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            interfaceC6233 = (InterfaceC6233) this.L$0;
            it = this.$channel.iterator();
            this.L$0 = interfaceC6233;
            this.L$1 = it;
            this.label = 1;
            C6023 c6023 = (C6023) it;
            obj = c6023.m10823(this);
            interfaceC6044 = c6023;
            if (obj == coroutineSingletons) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            InterfaceC6044 interfaceC60442 = (InterfaceC6044) this.L$1;
            interfaceC6233 = (InterfaceC6233) this.L$0;
            AbstractC6017.m10769(obj);
            interfaceC6044 = interfaceC60442;
            if (((Boolean) obj).booleanValue()) {
                C6023 c60232 = (C6023) interfaceC6044;
                C8585 c8585 = (C8585) c60232.m10821();
                C8585 c85852 = (C8585) C6034.m10831(this.$channel.mo10814());
                if (c85852 != null) {
                    c8585 = c85852;
                }
                AbstractC6231.m11036(interfaceC6233, null, null, new C01561(null, c8585, null), 3);
                it = c60232;
                this.L$0 = interfaceC6233;
                this.L$1 = it;
                this.label = 1;
                C6023 c60233 = (C6023) it;
                obj = c60233.m10823(this);
                interfaceC6044 = c60233;
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (((Boolean) obj).booleanValue()) {
                    return C6008.f15084;
                }
            }
        }
    }
}
