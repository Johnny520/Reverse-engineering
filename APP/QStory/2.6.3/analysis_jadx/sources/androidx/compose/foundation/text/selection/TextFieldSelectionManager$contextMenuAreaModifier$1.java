package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.C2035;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1", f = "TextFieldSelectionManager.kt", l = {228, 230}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "clickLocation", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class TextFieldSelectionManager$contextMenuAreaModifier$1 extends SuspendLambda implements InterfaceC6554 {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ C0882 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$contextMenuAreaModifier$1(C0882 c0882, InterfaceC4357<? super TextFieldSelectionManager$contextMenuAreaModifier$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c0882;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        TextFieldSelectionManager$contextMenuAreaModifier$1 textFieldSelectionManager$contextMenuAreaModifier$1 = new TextFieldSelectionManager$contextMenuAreaModifier$1(this.this$0, interfaceC4357);
        textFieldSelectionManager$contextMenuAreaModifier$1.J$0 = ((C7329) obj).f19541;
        return textFieldSelectionManager$contextMenuAreaModifier$1;
    }

    @Override // p052.InterfaceC6554
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1737invoke3MmeM6k(((C7329) obj).f19541, (InterfaceC4357) obj2);
    }

    /* JADX INFO: renamed from: invoke-3MmeM6k, reason: not valid java name */
    public final Object m1737invoke3MmeM6k(long j, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TextFieldSelectionManager$contextMenuAreaModifier$1) create(new C7329(j), interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            long j = this.J$0;
            C0882 c0882 = this.this$0;
            this.J$0 = j;
            this.label = 1;
            if (c0882.m1754(this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC5185.m10210(obj);
                return c5176;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        Pair pairM1751 = C0882.m1751(this.this$0);
        if (pairM1751 != null) {
            C0882 c08822 = this.this$0;
            String str = (String) pairM1751.component1();
            long j2 = ((C2035) pairM1751.component2()).f6004;
            InterfaceC0917 interfaceC0917 = c08822.f2507;
            if (interfaceC0917 != null) {
                this.label = 2;
                Object objM1861 = ((C0922) interfaceC0917).m1861(str, j2, this);
                if (objM1861 != coroutineSingletons) {
                    objM1861 = c5176;
                }
                if (objM1861 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return c5176;
    }
}
