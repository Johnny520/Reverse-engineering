package androidx.compose.foundation.text.selection;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import androidx.activity.AbstractC0045;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2035;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.C5379;
import kotlinx.coroutines.sync.InterfaceC5382;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 159}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/textclassifier/TextClassifier;", "Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;", "<anonymous>", "(Landroid/view/textclassifier/TextClassifier;)Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;"}, k = 3, mv = {2, 1, 0})
final class PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 extends SuspendLambda implements InterfaceC6553 {
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
    public PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(CharSequence charSequence, long j, C0922 c0922, InterfaceC4356<? super PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$text = charSequence;
        this.$selection = j;
        this.this$0 = c0922;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 = new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(this.$text, this.$selection, this.this$0, interfaceC4356);
        platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2.L$0 = obj;
        return platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(TextClassifier textClassifier, InterfaceC4356<? super C2035> interfaceC4356) {
        return ((PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2) create(textClassifier, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        CharSequence charSequence;
        TextSelection textSelection;
        C0922 c0922;
        InterfaceC5382 interfaceC5382;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            TextClassifier textClassifier = (TextClassifier) this.L$0;
            AbstractC0045.m107();
            TextSelection.Request.Builder defaultLocales = AbstractC0045.m121(this.$text, C2035.m3747(this.$selection), C2035.m3740(this.$selection)).setDefaultLocales(this.this$0.m1852());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jM3760 = AbstractC2048.m3760(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                C0922 c09222 = this.this$0;
                CharSequence charSequence2 = this.$text;
                this.J$0 = jM3760;
                this.label = 2;
                if (C0922.m1849(c09222, charSequence2, jM3760, textClassifier, this) != coroutineSingletons) {
                    j = jM3760;
                }
            } else {
                C0922 c09223 = this.this$0;
                C5379 c5379 = c09223.f2615;
                charSequence = this.$text;
                this.L$0 = textSelectionSuggestSelection;
                this.L$1 = c5379;
                this.L$2 = c09223;
                this.L$3 = charSequence;
                this.J$0 = jM3760;
                this.label = 1;
                if (c5379.m10423(this) != coroutineSingletons) {
                    textSelection = textSelectionSuggestSelection;
                    c0922 = c09223;
                    j = jM3760;
                    interfaceC5382 = c5379;
                    TextClassification textClassification = textSelection.getTextClassification();
                    textClassification.getClass();
                    ((AbstractC1347) c0922.f2621).setValue(new C0891(charSequence, j, textClassification));
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            j = this.J$0;
            charSequence = (CharSequence) this.L$3;
            c0922 = (C0922) this.L$2;
            InterfaceC5382 interfaceC53822 = (InterfaceC5382) this.L$1;
            textSelection = (TextSelection) this.L$0;
            AbstractC5184.m10206(obj);
            interfaceC5382 = interfaceC53822;
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                ((AbstractC1347) c0922.f2621).setValue(new C0891(charSequence, j, textClassification2));
            } finally {
                ((C5379) interfaceC5382).m10428(null);
            }
        } else {
            if (i != 2) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            AbstractC5184.m10206(obj);
        }
        return new C2035(j);
    }
}
