package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import androidx.activity.AbstractC0045;
import io.ktor.util.C4211;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Landroid/view/textclassifier/TextClassifier;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Landroid/view/textclassifier/TextClassifier;"}, k = 3, mv = {2, 1, 0})
@InterfaceC6862(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1", f = "PlatformSelectionBehaviors.android.kt", l = {}, m = "invokeSuspend", v = 1)
public final class PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1 extends SuspendLambda implements InterfaceC6554 {
    int label;
    final /* synthetic */ C0922 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1(C0922 c0922, InterfaceC4357<? super PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c0922;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1(this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super TextClassifier> interfaceC4357) {
        return ((PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C0922 c0922 = this.this$0;
        Context context = c0922.f2619;
        SelectedTextType selectedTextType = c0922.f2618;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int i = AbstractC0887.f2517[selectedTextType.ordinal()];
        if (i == 1) {
            str = "edittext";
        } else {
            if (i != 2) {
                C4211.m8611();
                return null;
            }
            str = "textview";
        }
        AbstractC0045.m103();
        TextClassifier textClassifierCreateTextClassificationSession = textClassificationManager.createTextClassificationSession(AbstractC0045.m132(context.getPackageName(), str).build());
        this.this$0.f2615 = textClassifierCreateTextClassificationSession;
        return textClassifierCreateTextClassificationSession;
    }
}
