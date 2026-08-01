package top.yukonga.miuix.kmp.interfaces;

import androidx.compose.foundation.interaction.C1408;
import androidx.compose.foundation.interaction.C1414;
import androidx.compose.foundation.interaction.InterfaceC1420;
import androidx.compose.runtime.InterfaceC2230;
import java.util.ArrayList;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.C6119;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.interfaces.HoldDownInteractionKt$collectIsHeldDownAsState$1$1", m556f = "HoldDownInteraction.kt", m557l = {54}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class HoldDownInteractionKt$collectIsHeldDownAsState$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2230 $isHeldDown;
    final /* synthetic */ InterfaceC1420 $this_collectIsHeldDownAsState;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoldDownInteractionKt$collectIsHeldDownAsState$1$1(InterfaceC1420 interfaceC1420, InterfaceC2230 interfaceC2230, InterfaceC5189<? super HoldDownInteractionKt$collectIsHeldDownAsState$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_collectIsHeldDownAsState = interfaceC1420;
        this.$isHeldDown = interfaceC2230;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new HoldDownInteractionKt$collectIsHeldDownAsState$1$1(this.$this_collectIsHeldDownAsState, this.$isHeldDown, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((HoldDownInteractionKt$collectIsHeldDownAsState$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            ArrayList arrayList = new ArrayList();
            C6119 c6119 = ((C1414) this.$this_collectIsHeldDownAsState).f1970;
            C1408 c1408 = new C1408(arrayList, this.$isHeldDown, 5);
            this.L$0 = null;
            this.label = 1;
            c6119.getClass();
            if (C6119.m10874(c6119, c1408, this) == coroutineSingletons) {
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
