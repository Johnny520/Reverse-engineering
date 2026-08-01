package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.interaction.C1410;
import androidx.compose.foundation.interaction.C1411;
import androidx.compose.foundation.interaction.C1414;
import androidx.compose.foundation.interaction.C1416;
import androidx.compose.foundation.interaction.C1417;
import androidx.compose.foundation.interaction.C1418;
import androidx.compose.foundation.interaction.C1422;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.foundation.interaction.InterfaceC1423;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.C6119;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1", m556f = "Label.kt", m557l = {112}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class LabelKt$HandleInteractions$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1421 $interactionSource;
    final /* synthetic */ InterfaceC2000 $state;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.LabelKt$HandleInteractions$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Landroidx/compose/foundation/interaction/飘花落叶言子楪苏哲兰世;", "interaction", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/interaction/飘花落叶言子楪苏哲兰世;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1$1", m556f = "Label.kt", m557l = {117}, m558m = "invokeSuspend")
    public static final class C01441 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC2000 $state;
        /* synthetic */ Object L$0;
        int label;

        public C01441(InterfaceC2000 interfaceC2000, InterfaceC5189<? super C01441> interfaceC5189) {
            super(2, interfaceC5189);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C01441 c01441 = new C01441(null, interfaceC5189);
            c01441.L$0 = obj;
            return c01441;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC1423 interfaceC1423, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01441) create(interfaceC1423, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC1423 interfaceC1423 = (InterfaceC1423) this.L$0;
                if ((interfaceC1423 instanceof C1416) || (interfaceC1423 instanceof C1411) || (interfaceC1423 instanceof C1418)) {
                    MutatePriority mutatePriority = MutatePriority.Default;
                    this.label = 1;
                    throw null;
                }
                if ((interfaceC1423 instanceof C1417) || (interfaceC1423 instanceof C1410) || (interfaceC1423 instanceof C1422)) {
                    throw null;
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
    public LabelKt$HandleInteractions$1$1(InterfaceC1421 interfaceC1421, InterfaceC2000 interfaceC2000, InterfaceC5189<? super LabelKt$HandleInteractions$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$interactionSource = interfaceC1421;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new LabelKt$HandleInteractions$1$1(this.$interactionSource, null, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((LabelKt$HandleInteractions$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C6119 c6119 = ((C1414) this.$interactionSource).f1970;
            C01441 c01441 = new C01441(null, null);
            this.label = 1;
            if (AbstractC6154.m10894(c6119, c01441, this) == coroutineSingletons) {
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
