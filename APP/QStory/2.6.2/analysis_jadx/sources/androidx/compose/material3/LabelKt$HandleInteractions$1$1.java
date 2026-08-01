package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.interaction.C0569;
import androidx.compose.foundation.interaction.C0570;
import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.C0575;
import androidx.compose.foundation.interaction.C0576;
import androidx.compose.foundation.interaction.C0577;
import androidx.compose.foundation.interaction.C0581;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.foundation.interaction.InterfaceC0582;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.AbstractC5321;
import kotlinx.coroutines.flow.C5286;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1", f = "Label.kt", l = {112}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class LabelKt$HandleInteractions$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC0580 $interactionSource;
    final /* synthetic */ InterfaceC1165 $state;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.LabelKt$HandleInteractions$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/飘花落叶言子楪苏哲兰世;", "interaction", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/interaction/飘花落叶言子楪苏哲兰世;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6861(c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1$1", f = "Label.kt", l = {117}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC1165 $state;
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(InterfaceC1165 interfaceC1165, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, interfaceC4356);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC0582 interfaceC0582, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC0582, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                InterfaceC0582 interfaceC0582 = (InterfaceC0582) this.L$0;
                if ((interfaceC0582 instanceof C0575) || (interfaceC0582 instanceof C0570) || (interfaceC0582 instanceof C0577)) {
                    MutatePriority mutatePriority = MutatePriority.Default;
                    this.label = 1;
                    throw null;
                }
                if ((interfaceC0582 instanceof C0576) || (interfaceC0582 instanceof C0569) || (interfaceC0582 instanceof C0581)) {
                    throw null;
                }
            } else {
                if (i != 1) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
            }
            return C5175.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelKt$HandleInteractions$1$1(InterfaceC0580 interfaceC0580, InterfaceC1165 interfaceC1165, InterfaceC4356<? super LabelKt$HandleInteractions$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$interactionSource = interfaceC0580;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new LabelKt$HandleInteractions$1$1(this.$interactionSource, null, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((LabelKt$HandleInteractions$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C5286 c5286 = ((C0573) this.$interactionSource).f1624;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, null);
            this.label = 1;
            if (AbstractC5321.m10331(c5286, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
