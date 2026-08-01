package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC5204;
import kotlinx.coroutines.channels.AbstractC5210;
import kotlinx.coroutines.channels.InterfaceC5195;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", l = {86}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Landroid/graphics/Rect;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 1, 0})
final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, InterfaceC4356<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$0(InterfaceC5195 interfaceC5195, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
            return;
        }
        view.getClass();
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        ((AbstractC5210) interfaceC5195).mo8445(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$1(InterfaceC5195 interfaceC5195, View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        ((AbstractC5210) interfaceC5195).mo8445(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$2(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener, ViewOnAttachStateChangeListenerC0017 viewOnAttachStateChangeListenerC0017) {
        view.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        view.removeOnLayoutChangeListener(onLayoutChangeListener);
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0017);
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.$view, interfaceC4356);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.L$0 = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5195 interfaceC5195, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(interfaceC5195, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnLayoutChangeListener, androidx.activity.飘花落叶言子世哲兰苏楪] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.ViewTreeObserver$OnScrollChangedListener, androidx.activity.飘花落叶言子世兰楪苏哲] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            final InterfaceC5195 interfaceC5195 = (InterfaceC5195) this.L$0;
            final ?? r1 = new View.OnLayoutChangeListener() { // from class: androidx.activity.飘花落叶言子世哲兰苏楪
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$0(interfaceC5195, view, i2, i3, i4, i5, i6, i7, i8, i9);
                }
            };
            final View view = this.$view;
            final ?? r4 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.飘花落叶言子世兰楪苏哲
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$1(interfaceC5195, view);
                }
            };
            final ViewOnAttachStateChangeListenerC0017 viewOnAttachStateChangeListenerC0017 = new ViewOnAttachStateChangeListenerC0017(interfaceC5195, view, r4, r1);
            if (view.isAttachedToWindow()) {
                View view2 = this.$view;
                Rect rect = new Rect();
                view2.getGlobalVisibleRect(rect);
                ((AbstractC5210) interfaceC5195).mo8445(rect);
                this.$view.getViewTreeObserver().addOnScrollChangedListener(r4);
                this.$view.addOnLayoutChangeListener(r1);
            }
            this.$view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0017);
            final View view3 = this.$view;
            InterfaceC6542 interfaceC6542 = new InterfaceC6542() { // from class: androidx.activity.飘花落叶言子世兰楪哲苏
                @Override // p052.InterfaceC6542
                public final Object invoke() {
                    return PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$2(view3, r4, r1, viewOnAttachStateChangeListenerC0017);
                }
            };
            this.label = 1;
            if (AbstractC5204.m10275(interfaceC5195, interfaceC6542, this) == coroutineSingletons) {
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
