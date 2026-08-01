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
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.utils.MiuixIndication$MiuixIndicationInstance$updateStates$1", m556f = "MiuixIndication.kt", m557l = {75, 76}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class MiuixIndication$MiuixIndicationInstance$updateStates$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Ref$FloatRef $targetAlpha;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6890 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiuixIndication$MiuixIndicationInstance$updateStates$1(C6890 c6890, Ref$FloatRef ref$FloatRef, InterfaceC5189<? super MiuixIndication$MiuixIndicationInstance$updateStates$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c6890;
        this.$targetAlpha = ref$FloatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        MiuixIndication$MiuixIndicationInstance$updateStates$1 miuixIndication$MiuixIndicationInstance$updateStates$1 = new MiuixIndication$MiuixIndicationInstance$updateStates$1(this.this$0, this.$targetAlpha, interfaceC5189);
        miuixIndication$MiuixIndicationInstance$updateStates$1.L$0 = obj;
        return miuixIndication$MiuixIndicationInstance$updateStates$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MiuixIndication$MiuixIndicationInstance$updateStates$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (androidx.compose.animation.core.C1177.m1589(r6, r7, r8, null, null, r13, 12) != r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            if (AbstractC6231.m11053(interfaceC6233.mo2990())) {
                C6249 c6249 = this.this$0.f16907;
                if (c6249 != null) {
                    this.L$0 = null;
                    this.label = 1;
                    if (c6249.mo11123(this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                C1177 c1177 = this.this$0.f16909;
                Float f = new Float(this.$targetAlpha.element);
                C1208 c1208M1573 = AbstractC1176.m1573(120, 2, AbstractC1182.f1486);
                this.L$0 = null;
                this.label = 2;
            }
            return C6008.f15084;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C1177 c11772 = this.this$0.f16909;
        Float f2 = new Float(this.$targetAlpha.element);
        C1208 c1208M15732 = AbstractC1176.m1573(120, 2, AbstractC1182.f1486);
        this.L$0 = null;
        this.label = 2;
    }
}
