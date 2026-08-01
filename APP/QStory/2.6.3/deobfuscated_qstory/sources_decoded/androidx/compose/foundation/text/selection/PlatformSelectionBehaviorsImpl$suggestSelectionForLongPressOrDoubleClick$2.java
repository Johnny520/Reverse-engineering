package androidx.compose.foundation.text.selection;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import androidx.activity.AbstractC0045;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2035;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.C5380;
import kotlinx.coroutines.sync.InterfaceC5383;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 159}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/textclassifier/TextClassifier;", "Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;", "<anonymous>", "(Landroid/view/textclassifier/TextClassifier;)Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;"}, k = 3, mv = {2, 1, 0})
final class PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ long $selection;
    final /* synthetic */ CharSequence $text;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C0922 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(CharSequence charSequence, long j, C0922 c0922, InterfaceC4357<? super PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$text = charSequence;
        this.$selection = j;
        this.this$0 = c0922;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 = new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(this.$text, this.$selection, this.this$0, interfaceC4357);
        platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2.L$0 = obj;
        return platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(TextClassifier textClassifier, InterfaceC4357<? super C2035> interfaceC4357) {
        return ((PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2) create(textClassifier, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        CharSequence charSequence;
        TextSelection textSelection;
        C0922 c0922;
        InterfaceC5383 interfaceC5383;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            TextClassifier textClassifier = (TextClassifier) this.L$0;
            AbstractC0045.m107();
            TextSelection.Request.Builder defaultLocales = AbstractC0045.m121(this.$text, C2035.m3757(this.$selection), C2035.m3750(this.$selection)).setDefaultLocales(this.this$0.m1862());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jM3770 = AbstractC2048.m3770(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                C0922 c09222 = this.this$0;
                CharSequence charSequence2 = this.$text;
                this.J$0 = jM3770;
                this.label = 2;
                if (C0922.m1859(c09222, charSequence2, jM3770, textClassifier, this) != coroutineSingletons) {
                    j = jM3770;
                }
            } else {
                C0922 c09223 = this.this$0;
                C5380 c5380 = c09223.f2616;
                charSequence = this.$text;
                this.L$0 = textSelectionSuggestSelection;
                this.L$1 = c5380;
                this.L$2 = c09223;
                this.L$3 = charSequence;
                this.J$0 = jM3770;
                this.label = 1;
                if (c5380.m10427(this) != coroutineSingletons) {
                    textSelection = textSelectionSuggestSelection;
                    c0922 = c09223;
                    j = jM3770;
                    interfaceC5383 = c5380;
                    TextClassification textClassification = textSelection.getTextClassification();
                    textClassification.getClass();
                    ((AbstractC1347) c0922.f2622).setValue(new C0891(charSequence, j, textClassification));
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            j = this.J$0;
            charSequence = (CharSequence) this.L$3;
            c0922 = (C0922) this.L$2;
            InterfaceC5383 interfaceC53832 = (InterfaceC5383) this.L$1;
            textSelection = (TextSelection) this.L$0;
            AbstractC5185.m10210(obj);
            interfaceC5383 = interfaceC53832;
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                ((AbstractC1347) c0922.f2622).setValue(new C0891(charSequence, j, textClassification2));
            } finally {
                ((C5380) interfaceC5383).m10432(null);
            }
        } else {
            if (i != 2) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            AbstractC5185.m10210(obj);
        }
        return new C2035(j);
    }
}
