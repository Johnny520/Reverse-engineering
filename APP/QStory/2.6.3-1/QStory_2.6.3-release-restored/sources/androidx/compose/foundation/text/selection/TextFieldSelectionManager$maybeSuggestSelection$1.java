package androidx.compose.foundation.text.selection;

import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.input.InterfaceC2856;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1", m556f = "TextFieldSelectionManager.kt", m557l = {571}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TextFieldSelectionManager$maybeSuggestSelection$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2856 $offsetMapping;
    final /* synthetic */ InterfaceC1755 $platformSelectionBehaviors;
    final /* synthetic */ C2869 $selection;
    final /* synthetic */ String $text;
    final /* synthetic */ long $transformedSelection;
    int label;
    final /* synthetic */ C1720 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$maybeSuggestSelection$1(InterfaceC1755 interfaceC1755, String str, long j, C2869 c2869, C1720 c1720, InterfaceC2856 interfaceC2856, InterfaceC5189<? super TextFieldSelectionManager$maybeSuggestSelection$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$platformSelectionBehaviors = interfaceC1755;
        this.$text = str;
        this.$transformedSelection = j;
        this.$selection = c2869;
        this.this$0 = c1720;
        this.$offsetMapping = interfaceC2856;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new TextFieldSelectionManager$maybeSuggestSelection$1(this.$platformSelectionBehaviors, this.$text, this.$transformedSelection, this.$selection, this.this$0, this.$offsetMapping, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TextFieldSelectionManager$maybeSuggestSelection$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC1755 interfaceC1755 = this.$platformSelectionBehaviors;
            String str = this.$text;
            long j = this.$transformedSelection;
            this.label = 1;
            obj = ((C1760) interfaceC1755).m2420(str, j, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        C2869 c2869 = (C2869) obj;
        C6008 c6008 = C6008.f15084;
        if (c2869 != null) {
            InterfaceC2856 interfaceC2856 = this.$offsetMapping;
            long j2 = c2869.f6349;
            int i2 = (int) (j2 >> 32);
            interfaceC2856.mo2443(i2);
            int i3 = (int) (j2 & 4294967295L);
            interfaceC2856.mo2443(i3);
            long jM4330 = AbstractC2882.m4330(i2, i3);
            if (!C2869.m4314(this.$selection, jM4330) && AbstractC5227.m9466(this.this$0.m2319().f6292.f6474, this.$text)) {
                InterfaceC2856 interfaceC28562 = this.$offsetMapping;
                C1720 c1720 = this.this$0;
                if (interfaceC28562 == c1720.f2834) {
                    c1720.f2833.invoke(C1720.m2312(c1720.m2319().f6292, jM4330));
                    this.this$0.f2838 = new C2869(jM4330);
                }
            }
        }
        return c6008;
    }
}
