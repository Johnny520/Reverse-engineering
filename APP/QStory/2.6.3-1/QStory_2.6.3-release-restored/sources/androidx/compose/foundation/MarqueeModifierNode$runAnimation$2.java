package androidx.compose.foundation;

import androidx.compose.runtime.AbstractC2202;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.C6116;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", m556f = "BasicMarquee.kt", m557l = {413}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class MarqueeModifierNode$runAnimation$2 extends SuspendLambda implements InterfaceC7383 {
    int label;
    final /* synthetic */ AbstractC1928 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"", "contentWithSpacingWidth", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(F)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", m556f = "BasicMarquee.kt", m557l = {427, 429, 433, 433}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00292 extends SuspendLambda implements InterfaceC7383 {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AbstractC1928 this$0;

        public C00292(AbstractC1928 abstractC1928, InterfaceC5189<? super C00292> interfaceC5189) {
            super(2, interfaceC5189);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00292 c00292 = new C00292(null, interfaceC5189);
            c00292.L$0 = obj;
            return c00292;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(Float f, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00292) create(f, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C6008 c6008 = C6008.f15084;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                if (((Float) this.L$0) == null) {
                    return c6008;
                }
                throw null;
            }
            if (i == 1) {
                AbstractC6017.m10769(obj);
                throw null;
            }
            if (i == 2) {
                AbstractC6017.m10769(obj);
                throw null;
            }
            if (i == 3) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            if (i != 4) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Throwable th = (Throwable) this.L$0;
            AbstractC6017.m10769(obj);
            throw th;
        }
    }

    public MarqueeModifierNode$runAnimation$2(AbstractC1928 abstractC1928, InterfaceC5189<? super MarqueeModifierNode$runAnimation$2> interfaceC5189) {
        super(2, interfaceC5189);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float invokeSuspend$lambda$0(AbstractC1928 abstractC1928) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new MarqueeModifierNode$runAnimation$2(null, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MarqueeModifierNode$runAnimation$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C6116 c6116M3030 = AbstractC2202.m3030(new C1912(0));
            C00292 c00292 = new C00292(null, null);
            this.label = 1;
            if (AbstractC6154.m10894(c6116M3030, c00292, this) == coroutineSingletons) {
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
