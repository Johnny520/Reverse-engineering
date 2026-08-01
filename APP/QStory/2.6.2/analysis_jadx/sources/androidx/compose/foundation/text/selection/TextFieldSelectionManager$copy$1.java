package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.ui.platform.C1899;
import androidx.compose.ui.platform.C1924;
import androidx.compose.ui.platform.InterfaceC1921;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2068;
import io.ktor.client.plugins.AbstractC3932;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p176.AbstractC7739;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", l = {891}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TextFieldSelectionManager$copy$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ boolean $cancelSelection;
    int label;
    final /* synthetic */ C0882 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$copy$1(C0882 c0882, boolean z, InterfaceC4356<? super TextFieldSelectionManager$copy$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0882;
        this.$cancelSelection = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new TextFieldSelectionManager$copy$1(this.this$0, this.$cancelSelection, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((TextFieldSelectionManager$copy$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC1921 interfaceC1921;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C2068 c2068M8312 = null;
        C5175 c5175 = C5175.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C0882 c0882 = this.this$0;
        boolean z = this.$cancelSelection;
        if (!C2035.m3742(c0882.m1749().f5945)) {
            c2068M8312 = AbstractC3932.m8312(c0882.m1749());
            if (z) {
                int iM3740 = C2035.m3740(c0882.m1749().f5945);
                c0882.f2487.invoke(C0882.m1742(c0882.m1749().f5946, AbstractC2048.m3760(iM3740, iM3740)));
                c0882.m1752(HandleState.None);
            }
        }
        if (c2068M8312 != null && (interfaceC1921 = this.this$0.f2503) != null) {
            C1924 c1924M13064 = AbstractC7739.m13064(c2068M8312);
            this.label = 1;
            ((C1899) interfaceC1921).m3583(c1924M13064);
            if (c5175 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c5175;
    }
}
