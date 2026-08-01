package androidx.compose.runtime;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", m556f = "Recomposer.kt", m557l = {100, 102}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m151d2 = {"R", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class RecomposerKt$withRunningRecomposer$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7380 $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", m556f = "Recomposer.kt", m557l = {99}, m558m = "invokeSuspend", m559v = 1)
    public static final class C01691 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C2218 $recomposer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01691(C2218 c2218, InterfaceC5189<? super C01691> interfaceC5189) {
            super(2, interfaceC5189);
            this.$recomposer = c2218;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C01691(this.$recomposer, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01691) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
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
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecomposerKt$withRunningRecomposer$2(InterfaceC7380 interfaceC7380, InterfaceC5189<? super RecomposerKt$withRunningRecomposer$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$block = interfaceC7380;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        RecomposerKt$withRunningRecomposer$2 recomposerKt$withRunningRecomposer$2 = new RecomposerKt$withRunningRecomposer$2(this.$block, interfaceC5189);
        recomposerKt$withRunningRecomposer$2.L$0 = obj;
        return recomposerKt$withRunningRecomposer$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<Object> interfaceC5189) {
        return ((RecomposerKt$withRunningRecomposer$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C2218 c2218;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
            c2218 = new C2218(interfaceC6233.mo2990());
            AbstractC6231.m11036(interfaceC6233, null, null, new C01691(c2218, null), 3);
            InterfaceC7380 interfaceC7380 = this.$block;
            this.L$0 = c2218;
            this.label = 1;
            obj = interfaceC7380.invoke(interfaceC6233, c2218, this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj2 = this.L$0;
            AbstractC6017.m10769(obj);
            return obj2;
        }
        c2218 = (C2218) this.L$0;
        AbstractC6017.m10769(obj);
        if (c2218.f4347.m11147(C6008.f15084)) {
            synchronized (c2218.f4341) {
                c2218.f4345 = true;
            }
        }
        this.L$0 = obj;
        this.label = 2;
        return c2218.m3075(this) == coroutineSingletons ? coroutineSingletons : obj;
    }
}
