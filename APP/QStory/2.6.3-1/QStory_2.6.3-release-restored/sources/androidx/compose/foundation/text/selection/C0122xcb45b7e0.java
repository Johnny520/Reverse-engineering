package androidx.compose.foundation.text.selection;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import androidx.activity.AbstractC0892;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.runtime.AbstractC2182;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.C6212;
import kotlinx.coroutines.sync.InterfaceC6215;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2", m556f = "PlatformSelectionBehaviors.android.kt", m557l = {369, 159}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroid/view/textclassifier/TextClassifier;", "Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;", "<anonymous>", "(Landroid/view/textclassifier/TextClassifier;)Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;"}, m152k = 3, m153mv = {2, 1, 0})
final class C0122xcb45b7e0 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ long $selection;
    final /* synthetic */ CharSequence $text;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C1760 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0122xcb45b7e0(CharSequence charSequence, long j, C1760 c1760, InterfaceC5189<? super C0122xcb45b7e0> interfaceC5189) {
        super(2, interfaceC5189);
        this.$text = charSequence;
        this.$selection = j;
        this.this$0 = c1760;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        C0122xcb45b7e0 c0122xcb45b7e0 = new C0122xcb45b7e0(this.$text, this.$selection, this.this$0, interfaceC5189);
        c0122xcb45b7e0.L$0 = obj;
        return c0122xcb45b7e0;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(TextClassifier textClassifier, InterfaceC5189<? super C2869> interfaceC5189) {
        return ((C0122xcb45b7e0) create(textClassifier, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        CharSequence charSequence;
        TextSelection textSelection;
        C1760 c1760;
        InterfaceC6215 interfaceC6215;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            TextClassifier textClassifier = (TextClassifier) this.L$0;
            AbstractC0892.m667();
            TextSelection.Request.Builder defaultLocales = AbstractC0892.m681(this.$text, C2869.m4317(this.$selection), C2869.m4310(this.$selection)).setDefaultLocales(this.this$0.m2422());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jM4330 = AbstractC2882.m4330(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                C1760 c17602 = this.this$0;
                CharSequence charSequence2 = this.$text;
                this.J$0 = jM4330;
                this.label = 2;
                if (C1760.m2419(c17602, charSequence2, jM4330, textClassifier, this) != coroutineSingletons) {
                    j = jM4330;
                }
            } else {
                C1760 c17603 = this.this$0;
                C6212 c6212 = c17603.f2961;
                charSequence = this.$text;
                this.L$0 = textSelectionSuggestSelection;
                this.L$1 = c6212;
                this.L$2 = c17603;
                this.L$3 = charSequence;
                this.J$0 = jM4330;
                this.label = 1;
                if (c6212.m10986(this) != coroutineSingletons) {
                    textSelection = textSelectionSuggestSelection;
                    c1760 = c17603;
                    j = jM4330;
                    interfaceC6215 = c6212;
                    TextClassification textClassification = textSelection.getTextClassification();
                    textClassification.getClass();
                    ((AbstractC2182) c1760.f2967).setValue(new C1729(charSequence, j, textClassification));
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            j = this.J$0;
            charSequence = (CharSequence) this.L$3;
            c1760 = (C1760) this.L$2;
            InterfaceC6215 interfaceC62152 = (InterfaceC6215) this.L$1;
            textSelection = (TextSelection) this.L$0;
            AbstractC6017.m10769(obj);
            interfaceC6215 = interfaceC62152;
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                ((AbstractC2182) c1760.f2967).setValue(new C1729(charSequence, j, textClassification2));
            } finally {
                ((C6212) interfaceC6215).m10991(null);
            }
        } else {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            AbstractC6017.m10769(obj);
        }
        return new C2869(j);
    }
}
