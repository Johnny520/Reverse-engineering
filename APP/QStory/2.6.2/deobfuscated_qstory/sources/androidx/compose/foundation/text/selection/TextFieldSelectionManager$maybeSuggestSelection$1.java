package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.input.InterfaceC2022;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1", f = "TextFieldSelectionManager.kt", l = {571}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TextFieldSelectionManager$maybeSuggestSelection$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC2022 $offsetMapping;
    final /* synthetic */ InterfaceC0917 $platformSelectionBehaviors;
    final /* synthetic */ C2035 $selection;
    final /* synthetic */ String $text;
    final /* synthetic */ long $transformedSelection;
    int label;
    final /* synthetic */ C0882 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$maybeSuggestSelection$1(InterfaceC0917 interfaceC0917, String str, long j, C2035 c2035, C0882 c0882, InterfaceC2022 interfaceC2022, InterfaceC4356<? super TextFieldSelectionManager$maybeSuggestSelection$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$platformSelectionBehaviors = interfaceC0917;
        this.$text = str;
        this.$transformedSelection = j;
        this.$selection = c2035;
        this.this$0 = c0882;
        this.$offsetMapping = interfaceC2022;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new TextFieldSelectionManager$maybeSuggestSelection$1(this.$platformSelectionBehaviors, this.$text, this.$transformedSelection, this.$selection, this.this$0, this.$offsetMapping, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((TextFieldSelectionManager$maybeSuggestSelection$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC0917 interfaceC0917 = this.$platformSelectionBehaviors;
            String str = this.$text;
            long j = this.$transformedSelection;
            this.label = 1;
            obj = ((C0922) interfaceC0917).m1850(str, j, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        C2035 c2035 = (C2035) obj;
        C5175 c5175 = C5175.f14739;
        if (c2035 != null) {
            InterfaceC2022 interfaceC2022 = this.$offsetMapping;
            long j2 = c2035.f6003;
            int i2 = (int) (j2 >> 32);
            interfaceC2022.mo1873(i2);
            int i3 = (int) (j2 & 4294967295L);
            interfaceC2022.mo1873(i3);
            long jM3760 = AbstractC2048.m3760(i2, i3);
            if (!C2035.m3744(this.$selection, jM3760) && AbstractC4394.m8917(this.this$0.m1749().f5946.f6128, this.$text)) {
                InterfaceC2022 interfaceC20222 = this.$offsetMapping;
                C0882 c0882 = this.this$0;
                if (interfaceC20222 == c0882.f2488) {
                    c0882.f2487.invoke(C0882.m1742(c0882.m1749().f5946, jM3760));
                    this.this$0.f2492 = new C2035(jM3760);
                }
            }
        }
        return c5175;
    }
}
