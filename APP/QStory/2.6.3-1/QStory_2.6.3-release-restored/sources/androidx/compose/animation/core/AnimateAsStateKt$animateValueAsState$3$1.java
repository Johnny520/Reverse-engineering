package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.InterfaceC2168;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.C6023;
import kotlinx.coroutines.channels.C6034;
import kotlinx.coroutines.channels.InterfaceC6039;
import kotlinx.coroutines.channels.InterfaceC6044;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", m556f = "AnimateAsState.kt", m557l = {430}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class AnimateAsStateKt$animateValueAsState$3$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2168 $animSpec$delegate;
    final /* synthetic */ C1177 $animatable;
    final /* synthetic */ InterfaceC6039 $channel;
    final /* synthetic */ InterfaceC2168 $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", m556f = "AnimateAsState.kt", m557l = {439}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00191 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC2168 $animSpec$delegate;
        final /* synthetic */ C1177 $animatable;
        final /* synthetic */ InterfaceC2168 $listener$delegate;
        final /* synthetic */ Object $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00191(Object obj, C1177 c1177, InterfaceC2168 interfaceC2168, InterfaceC2168 interfaceC21682, InterfaceC5189<? super C00191> interfaceC5189) {
            super(2, interfaceC5189);
            this.$newTarget = obj;
            this.$animatable = c1177;
            this.$animSpec$delegate = interfaceC2168;
            this.$listener$delegate = interfaceC21682;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C00191(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00191) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C00191 c00191;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                if (!AbstractC5227.m9466(this.$newTarget, ((AbstractC2182) this.$animatable.f1470).getValue())) {
                    C1177 c1177 = this.$animatable;
                    Object obj2 = this.$newTarget;
                    InterfaceC2168 interfaceC2168 = this.$animSpec$delegate;
                    int i2 = AbstractC1174.f1448;
                    InterfaceC1195 interfaceC1195 = (InterfaceC1195) interfaceC2168.getValue();
                    this.label = 1;
                    c00191 = this;
                    if (C1177.m1589(c1177, obj2, interfaceC1195, null, null, c00191, 12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return C6008.f15084;
            }
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            c00191 = this;
            InterfaceC2168 interfaceC21682 = c00191.$listener$delegate;
            int i3 = AbstractC1174.f1448;
            InterfaceC7387 interfaceC7387 = (InterfaceC7387) interfaceC21682.getValue();
            if (interfaceC7387 != null) {
                interfaceC7387.invoke(c00191.$animatable.m1593());
            }
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$3$1(InterfaceC6039 interfaceC6039, C1177 c1177, InterfaceC2168 interfaceC2168, InterfaceC2168 interfaceC21682, InterfaceC5189<? super AnimateAsStateKt$animateValueAsState$3$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$channel = interfaceC6039;
        this.$animatable = c1177;
        this.$animSpec$delegate = interfaceC2168;
        this.$listener$delegate = interfaceC21682;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, interfaceC5189);
        animateAsStateKt$animateValueAsState$3$1.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((AnimateAsStateKt$animateValueAsState$3$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
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
                Object objM10821 = c60232.m10821();
                Object objM10831 = C6034.m10831(this.$channel.mo10814());
                AbstractC6231.m11036(interfaceC6233, null, null, new C00191(objM10831 == null ? objM10821 : objM10831, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, null), 3);
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
