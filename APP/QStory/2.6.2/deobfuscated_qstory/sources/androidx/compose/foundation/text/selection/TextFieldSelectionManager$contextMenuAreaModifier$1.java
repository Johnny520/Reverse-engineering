package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.C2035;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1", f = "TextFieldSelectionManager.kt", l = {228, 230}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "clickLocation", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class TextFieldSelectionManager$contextMenuAreaModifier$1 extends SuspendLambda implements InterfaceC6553 {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ C0882 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$contextMenuAreaModifier$1(C0882 c0882, InterfaceC4356<? super TextFieldSelectionManager$contextMenuAreaModifier$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0882;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        TextFieldSelectionManager$contextMenuAreaModifier$1 textFieldSelectionManager$contextMenuAreaModifier$1 = new TextFieldSelectionManager$contextMenuAreaModifier$1(this.this$0, interfaceC4356);
        textFieldSelectionManager$contextMenuAreaModifier$1.J$0 = ((C7328) obj).f19546;
        return textFieldSelectionManager$contextMenuAreaModifier$1;
    }

    @Override // p052.InterfaceC6553
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1727invoke3MmeM6k(((C7328) obj).f19546, (InterfaceC4356) obj2);
    }

    /* JADX INFO: renamed from: invoke-3MmeM6k, reason: not valid java name */
    public final Object m1727invoke3MmeM6k(long j, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((TextFieldSelectionManager$contextMenuAreaModifier$1) create(new C7328(j), interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            long j = this.J$0;
            C0882 c0882 = this.this$0;
            this.J$0 = j;
            this.label = 1;
            if (c0882.m1744(this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        Pair pairM1741 = C0882.m1741(this.this$0);
        if (pairM1741 != null) {
            C0882 c08822 = this.this$0;
            String str = (String) pairM1741.component1();
            long j2 = ((C2035) pairM1741.component2()).f6003;
            InterfaceC0917 interfaceC0917 = c08822.f2506;
            if (interfaceC0917 != null) {
                this.label = 2;
                Object objM1851 = ((C0922) interfaceC0917).m1851(str, j2, this);
                if (objM1851 != coroutineSingletons) {
                    objM1851 = c5175;
                }
                if (objM1851 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return c5175;
    }
}
