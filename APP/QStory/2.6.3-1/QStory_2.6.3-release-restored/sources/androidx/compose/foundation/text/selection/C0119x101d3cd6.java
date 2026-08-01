package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassifier;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2", m556f = "PlatformSelectionBehaviors.android.kt", m557l = {172}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroid/view/textclassifier/TextClassifier;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroid/view/textclassifier/TextClassifier;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class C0119x101d3cd6 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ long $selection;
    final /* synthetic */ CharSequence $text;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C1760 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0119x101d3cd6(C1760 c1760, CharSequence charSequence, long j, InterfaceC5189<? super C0119x101d3cd6> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1760;
        this.$text = charSequence;
        this.$selection = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        C0119x101d3cd6 c0119x101d3cd6 = new C0119x101d3cd6(this.this$0, this.$text, this.$selection, interfaceC5189);
        c0119x101d3cd6.L$0 = obj;
        return c0119x101d3cd6;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(TextClassifier textClassifier, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((C0119x101d3cd6) create(textClassifier, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            TextClassifier textClassifier = (TextClassifier) this.L$0;
            C1760 c1760 = this.this$0;
            CharSequence charSequence = this.$text;
            long j = this.$selection;
            this.label = 1;
            if (C1760.m2419(c1760, charSequence, j, textClassifier, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
