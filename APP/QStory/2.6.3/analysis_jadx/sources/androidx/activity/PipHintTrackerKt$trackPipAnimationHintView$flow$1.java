package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.AbstractC5211;
import kotlinx.coroutines.channels.InterfaceC5196;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", l = {86}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Landroid/graphics/Rect;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 1, 0})
final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, InterfaceC4357<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$0(InterfaceC5196 interfaceC5196, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
            return;
        }
        view.getClass();
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        ((AbstractC5211) interfaceC5196).mo8436(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$1(InterfaceC5196 interfaceC5196, View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        ((AbstractC5211) interfaceC5196).mo8436(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$2(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener, ViewOnAttachStateChangeListenerC0017 viewOnAttachStateChangeListenerC0017) {
        view.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        view.removeOnLayoutChangeListener(onLayoutChangeListener);
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0017);
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.$view, interfaceC4357);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.L$0 = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5196 interfaceC5196, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(interfaceC5196, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnLayoutChangeListener, androidx.activity.飘花落叶言子世哲兰苏楪] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.ViewTreeObserver$OnScrollChangedListener, androidx.activity.飘花落叶言子世兰楪苏哲] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            final InterfaceC5196 interfaceC5196 = (InterfaceC5196) this.L$0;
            final ?? r1 = new View.OnLayoutChangeListener() { // from class: androidx.activity.飘花落叶言子世哲兰苏楪
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$0(interfaceC5196, view, i2, i3, i4, i5, i6, i7, i8, i9);
                }
            };
            final View view = this.$view;
            final ?? r4 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.飘花落叶言子世兰楪苏哲
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$1(interfaceC5196, view);
                }
            };
            final ViewOnAttachStateChangeListenerC0017 viewOnAttachStateChangeListenerC0017 = new ViewOnAttachStateChangeListenerC0017(interfaceC5196, view, r4, r1);
            if (view.isAttachedToWindow()) {
                View view2 = this.$view;
                Rect rect = new Rect();
                view2.getGlobalVisibleRect(rect);
                ((AbstractC5211) interfaceC5196).mo8436(rect);
                this.$view.getViewTreeObserver().addOnScrollChangedListener(r4);
                this.$view.addOnLayoutChangeListener(r1);
            }
            this.$view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0017);
            final View view3 = this.$view;
            InterfaceC6543 interfaceC6543 = new InterfaceC6543() { // from class: androidx.activity.飘花落叶言子世兰楪哲苏
                @Override // p052.InterfaceC6543
                public final Object invoke() {
                    return PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$2(view3, r4, r1, viewOnAttachStateChangeListenerC0017);
                }
            };
            this.label = 1;
            if (AbstractC5205.m10279(interfaceC5196, interfaceC6543, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
