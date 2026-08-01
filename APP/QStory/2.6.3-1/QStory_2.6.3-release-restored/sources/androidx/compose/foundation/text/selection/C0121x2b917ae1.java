package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import androidx.activity.AbstractC0892;
import io.ktor.util.C5043;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Landroid/view/textclassifier/TextClassifier;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Landroid/view/textclassifier/TextClassifier;"}, m152k = 3, m153mv = {2, 1, 0})
@InterfaceC7691(m555c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1", m556f = "PlatformSelectionBehaviors.android.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
public final class C0121x2b917ae1 extends SuspendLambda implements InterfaceC7383 {
    int label;
    final /* synthetic */ C1760 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0121x2b917ae1(C1760 c1760, InterfaceC5189<? super C0121x2b917ae1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1760;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new C0121x2b917ae1(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super TextClassifier> interfaceC5189) {
        return ((C0121x2b917ae1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C1760 c1760 = this.this$0;
        Context context = c1760.f2964;
        SelectedTextType selectedTextType = c1760.f2963;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int i = AbstractC1725.f2862[selectedTextType.ordinal()];
        if (i == 1) {
            str = "edittext";
        } else {
            if (i != 2) {
                C5043.m9170();
                return null;
            }
            str = "textview";
        }
        AbstractC0892.m663();
        TextClassifier textClassifierCreateTextClassificationSession = textClassificationManager.createTextClassificationSession(AbstractC0892.m692(context.getPackageName(), str).build());
        this.this$0.f2960 = textClassifierCreateTextClassificationSession;
        return textClassifierCreateTextClassificationSession;
    }
}
