package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.input.InterfaceC2022;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1", f = "TextFieldSelectionManager.kt", l = {571}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TextFieldSelectionManager$maybeSuggestSelection$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC2022 $offsetMapping;
    final /* synthetic */ InterfaceC0917 $platformSelectionBehaviors;
    final /* synthetic */ C2035 $selection;
    final /* synthetic */ String $text;
    final /* synthetic */ long $transformedSelection;
    int label;
    final /* synthetic */ C0882 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$maybeSuggestSelection$1(InterfaceC0917 interfaceC0917, String str, long j, C2035 c2035, C0882 c0882, InterfaceC2022 interfaceC2022, InterfaceC4357<? super TextFieldSelectionManager$maybeSuggestSelection$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$platformSelectionBehaviors = interfaceC0917;
        this.$text = str;
        this.$transformedSelection = j;
        this.$selection = c2035;
        this.this$0 = c0882;
        this.$offsetMapping = interfaceC2022;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new TextFieldSelectionManager$maybeSuggestSelection$1(this.$platformSelectionBehaviors, this.$text, this.$transformedSelection, this.$selection, this.this$0, this.$offsetMapping, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TextFieldSelectionManager$maybeSuggestSelection$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC0917 interfaceC0917 = this.$platformSelectionBehaviors;
            String str = this.$text;
            long j = this.$transformedSelection;
            this.label = 1;
            obj = ((C0922) interfaceC0917).m1860(str, j, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        C2035 c2035 = (C2035) obj;
        C5176 c5176 = C5176.f14739;
        if (c2035 != null) {
            InterfaceC2022 interfaceC2022 = this.$offsetMapping;
            long j2 = c2035.f6004;
            int i2 = (int) (j2 >> 32);
            interfaceC2022.mo1883(i2);
            int i3 = (int) (j2 & 4294967295L);
            interfaceC2022.mo1883(i3);
            long jM3770 = AbstractC2048.m3770(i2, i3);
            if (!C2035.m3754(this.$selection, jM3770) && AbstractC4395.m8907(this.this$0.m1759().f5947.f6129, this.$text)) {
                InterfaceC2022 interfaceC20222 = this.$offsetMapping;
                C0882 c0882 = this.this$0;
                if (interfaceC20222 == c0882.f2489) {
                    c0882.f2488.invoke(C0882.m1752(c0882.m1759().f5947, jM3770));
                    this.this$0.f2493 = new C2035(jM3770);
                }
            }
        }
        return c5176;
    }
}
