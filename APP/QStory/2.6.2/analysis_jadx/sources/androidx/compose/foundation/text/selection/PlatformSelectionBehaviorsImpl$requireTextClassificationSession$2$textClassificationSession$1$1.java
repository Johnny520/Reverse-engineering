package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import androidx.activity.AbstractC0045;
import io.ktor.util.C4210;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Landroid/view/textclassifier/TextClassifier;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Landroid/view/textclassifier/TextClassifier;"}, k = 3, mv = {2, 1, 0})
@InterfaceC6861(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1", f = "PlatformSelectionBehaviors.android.kt", l = {}, m = "invokeSuspend", v = 1)
public final class PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1 extends SuspendLambda implements InterfaceC6553 {
    int label;
    final /* synthetic */ C0922 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1(C0922 c0922, InterfaceC4356<? super PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0922;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1(this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super TextClassifier> interfaceC4356) {
        return ((PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C0922 c0922 = this.this$0;
        Context context = c0922.f2618;
        SelectedTextType selectedTextType = c0922.f2617;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int i = AbstractC0887.f2516[selectedTextType.ordinal()];
        if (i == 1) {
            str = "edittext";
        } else {
            if (i != 2) {
                C4210.m8621();
                return null;
            }
            str = "textview";
        }
        AbstractC0045.m103();
        TextClassifier textClassifierCreateTextClassificationSession = textClassificationManager.createTextClassificationSession(AbstractC0045.m132(context.getPackageName(), str).build());
        this.this$0.f2614 = textClassifierCreateTextClassificationSession;
        return textClassifierCreateTextClassificationSession;
    }
}
