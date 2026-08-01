package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.core.C1177;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2232;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.NumberPickerKt$NumberPicker$8$1", m556f = "NumberPicker.kt", m557l = {180, 183}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class NumberPickerKt$NumberPicker$8$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC2232 $dragOffset$delegate;
    final /* synthetic */ C1177 $flingAnimatable;
    final /* synthetic */ InterfaceC2230 $isDragging$delegate;
    final /* synthetic */ InterfaceC2230 $isUserScrolling$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberPickerKt$NumberPicker$8$1(C1177 c1177, InterfaceC2232 interfaceC2232, InterfaceC2230 interfaceC2230, InterfaceC2230 interfaceC22302, InterfaceC5189<? super NumberPickerKt$NumberPicker$8$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$flingAnimatable = c1177;
        this.$dragOffset$delegate = interfaceC2232;
        this.$isDragging$delegate = interfaceC2230;
        this.$isUserScrolling$delegate = interfaceC22302;
    }

    @Override // p068.InterfaceC7380
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m11929invoked4ec7I((InterfaceC6233) obj, ((C8158) obj2).f19886, (InterfaceC5189) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m11929invoked4ec7I(InterfaceC6233 interfaceC6233, long j, InterfaceC5189<? super C6008> interfaceC5189) {
        return new NumberPickerKt$NumberPicker$8$1(this.$flingAnimatable, this.$dragOffset$delegate, this.$isDragging$delegate, this.$isUserScrolling$delegate, interfaceC5189).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r5.m1591(r1, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C1177 c1177 = this.$flingAnimatable;
            this.label = 1;
            if (c1177.m1596(this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            InterfaceC2230 interfaceC2230 = this.$isDragging$delegate;
            Boolean bool = Boolean.TRUE;
            interfaceC2230.setValue(bool);
            this.$isUserScrolling$delegate.setValue(bool);
            return C6008.f15084;
        }
        AbstractC6017.m10769(obj);
        AbstractC2184 abstractC2184 = (AbstractC2184) this.$dragOffset$delegate;
        abstractC2184.m2995(((Number) this.$flingAnimatable.m1593()).floatValue() + abstractC2184.m2994());
        C1177 c11772 = this.$flingAnimatable;
        Float f = new Float(0.0f);
        this.label = 2;
    }
}
