package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassifier;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2", f = "PlatformSelectionBehaviors.android.kt", l = {172}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/textclassifier/TextClassifier;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroid/view/textclassifier/TextClassifier;)V"}, k = 3, mv = {2, 1, 0})
final class PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ long $selection;
    final /* synthetic */ CharSequence $text;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C0922 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(C0922 c0922, CharSequence charSequence, long j, InterfaceC4356<? super PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0922;
        this.$text = charSequence;
        this.$selection = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2 platformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2 = new PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(this.this$0, this.$text, this.$selection, interfaceC4356);
        platformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2.L$0 = obj;
        return platformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(TextClassifier textClassifier, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2) create(textClassifier, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            TextClassifier textClassifier = (TextClassifier) this.L$0;
            C0922 c0922 = this.this$0;
            CharSequence charSequence = this.$text;
            long j = this.$selection;
            this.label = 1;
            if (C0922.m1849(c0922, charSequence, j, textClassifier, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
