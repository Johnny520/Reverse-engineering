package top.yukonga.miuix.kmp.utils;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.AbstractC1182;
import androidx.compose.animation.core.C1177;
import androidx.compose.animation.core.C1208;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.utils.MiuixIndication$MiuixIndicationInstance$updateStates$2", m556f = "MiuixIndication.kt", m557l = {87}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class MiuixIndication$MiuixIndicationInstance$updateStates$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Ref$FloatRef $targetAlpha;
    int label;
    final /* synthetic */ C6890 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiuixIndication$MiuixIndicationInstance$updateStates$2(C6890 c6890, Ref$FloatRef ref$FloatRef, InterfaceC5189<? super MiuixIndication$MiuixIndicationInstance$updateStates$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c6890;
        this.$targetAlpha = ref$FloatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new MiuixIndication$MiuixIndicationInstance$updateStates$2(this.this$0, this.$targetAlpha, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MiuixIndication$MiuixIndicationInstance$updateStates$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C1177 c1177 = this.this$0.f16909;
            Float f = new Float(this.$targetAlpha.element);
            C1208 c1208M1573 = AbstractC1176.m1573(120, 2, AbstractC1182.f1486);
            this.label = 1;
            if (C1177.m1589(c1177, f, c1208M1573, null, null, this, 12) == coroutineSingletons) {
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
