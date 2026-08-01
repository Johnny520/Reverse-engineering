package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC2162;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", m556f = "Transition.kt", m557l = {1222}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class Transition$animateTo$1$1$1 extends SuspendLambda implements InterfaceC7383 {
    float F$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C1210 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1$1(C1210 c1210, InterfaceC5189<? super Transition$animateTo$1$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1210;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(C1210 c1210, float f, long j) {
        boolean zM1630 = c1210.m1630();
        AbstractC2162 abstractC2162 = c1210.f1591;
        if (!zM1630) {
            if (abstractC2162.m2957() == Long.MIN_VALUE) {
                abstractC2162.m2958(j);
                ((AbstractC2182) c1210.f1589.f1578).setValue(Boolean.TRUE);
            }
            long jM2957 = j - abstractC2162.m2957();
            if (f != 0.0f) {
                jM2957 = AbstractC7390.m12616(jM2957 / ((double) f));
            }
            if (c1210.f1588 == null) {
                c1210.f1584.m2958(jM2957);
            }
            c1210.m1629(jM2957, f == 0.0f);
        }
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        Transition$animateTo$1$1$1 transition$animateTo$1$1$1 = new Transition$animateTo$1$1$1(this.this$0, interfaceC5189);
        transition$animateTo$1$1$1.L$0 = obj;
        return transition$animateTo$1$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((Transition$animateTo$1$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final float fM1582;
        InterfaceC6233 interfaceC6233;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6233 interfaceC62332 = (InterfaceC6233) this.L$0;
            fM1582 = AbstractC1176.m1582(interfaceC62332.mo2990());
            interfaceC6233 = interfaceC62332;
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fM1582 = this.F$0;
            interfaceC6233 = (InterfaceC6233) this.L$0;
            AbstractC6017.m10769(obj);
        }
        while (AbstractC6231.m11054(interfaceC6233)) {
            final C1210 c1210 = this.this$0;
            InterfaceC7387 interfaceC7387 = new InterfaceC7387() { // from class: androidx.compose.animation.core.飘花落叶言子苏哲楪世兰
                @Override // p068.InterfaceC7387
                public final Object invoke(Object obj2) {
                    return Transition$animateTo$1$1$1.invokeSuspend$lambda$0(c1210, fM1582, ((Long) obj2).longValue());
                }
            };
            this.L$0 = interfaceC6233;
            this.F$0 = fM1582;
            this.label = 1;
            if (AbstractC2202.m3052(getContext()).mo2865(interfaceC7387, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C6008.f15084;
    }
}
