package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.ui.platform.C1899;
import androidx.compose.ui.platform.C1924;
import androidx.compose.ui.platform.InterfaceC1921;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2068;
import com.bumptech.glide.AbstractC3065;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p176.AbstractC7740;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", l = {891}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TextFieldSelectionManager$copy$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ boolean $cancelSelection;
    int label;
    final /* synthetic */ C0882 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$copy$1(C0882 c0882, boolean z, InterfaceC4357<? super TextFieldSelectionManager$copy$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c0882;
        this.$cancelSelection = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new TextFieldSelectionManager$copy$1(this.this$0, this.$cancelSelection, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TextFieldSelectionManager$copy$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC1921 interfaceC1921;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C2068 c2068M6829 = null;
        C5176 c5176 = C5176.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return c5176;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C0882 c0882 = this.this$0;
        boolean z = this.$cancelSelection;
        if (!C2035.m3752(c0882.m1759().f5946)) {
            c2068M6829 = AbstractC3065.m6829(c0882.m1759());
            if (z) {
                int iM3750 = C2035.m3750(c0882.m1759().f5946);
                c0882.f2488.invoke(C0882.m1752(c0882.m1759().f5947, AbstractC2048.m3770(iM3750, iM3750)));
                c0882.m1762(HandleState.None);
            }
        }
        if (c2068M6829 != null && (interfaceC1921 = this.this$0.f2504) != null) {
            C1924 c1924M13092 = AbstractC7740.m13092(c2068M6829);
            this.label = 1;
            ((C1899) interfaceC1921).m3593(c1924M13092);
            if (c5176 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c5176;
    }
}
