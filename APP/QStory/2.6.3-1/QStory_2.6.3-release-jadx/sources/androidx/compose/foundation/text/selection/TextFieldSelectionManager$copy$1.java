package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.p001ui.platform.C2734;
import androidx.compose.p001ui.platform.C2759;
import androidx.compose.p001ui.platform.InterfaceC2756;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2902;
import com.bumptech.glide.AbstractC3897;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p192.AbstractC8569;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", m556f = "TextFieldSelectionManager.kt", m557l = {891}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TextFieldSelectionManager$copy$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ boolean $cancelSelection;
    int label;
    final /* synthetic */ C1720 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$copy$1(C1720 c1720, boolean z, InterfaceC5189<? super TextFieldSelectionManager$copy$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1720;
        this.$cancelSelection = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new TextFieldSelectionManager$copy$1(this.this$0, this.$cancelSelection, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TextFieldSelectionManager$copy$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC2756 interfaceC2756;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C2902 c2902M7389 = null;
        C6008 c6008 = C6008.f15084;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C1720 c1720 = this.this$0;
        boolean z = this.$cancelSelection;
        if (!C2869.m4312(c1720.m2319().f6291)) {
            c2902M7389 = AbstractC3897.m7389(c1720.m2319());
            if (z) {
                int iM4310 = C2869.m4310(c1720.m2319().f6291);
                c1720.f2833.invoke(C1720.m2312(c1720.m2319().f6292, AbstractC2882.m4330(iM4310, iM4310)));
                c1720.m2322(HandleState.None);
            }
        }
        if (c2902M7389 != null && (interfaceC2756 = this.this$0.f2849) != null) {
            C2759 c2759M13651 = AbstractC8569.m13651(c2902M7389);
            this.label = 1;
            ((C2734) interfaceC2756).m4153(c2759M13651);
            if (c6008 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c6008;
    }
}
