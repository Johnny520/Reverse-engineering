package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.AbstractC6043;
import kotlinx.coroutines.channels.InterfaceC6028;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", m556f = "PipHintTracker.kt", m557l = {86}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Landroid/graphics/Rect;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, InterfaceC5189<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$0(InterfaceC6028 interfaceC6028, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
            return;
        }
        view.getClass();
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        ((AbstractC6043) interfaceC6028).mo8995(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$1(InterfaceC6028 interfaceC6028, View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        ((AbstractC6043) interfaceC6028).mo8995(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$2(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener, ViewOnAttachStateChangeListenerC0864 viewOnAttachStateChangeListenerC0864) {
        view.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        view.removeOnLayoutChangeListener(onLayoutChangeListener);
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0864);
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.$view, interfaceC5189);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.L$0 = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnLayoutChangeListener, androidx.activity.飘花落叶言子世哲兰苏楪] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.ViewTreeObserver$OnScrollChangedListener, androidx.activity.飘花落叶言子世兰楪苏哲] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            final InterfaceC6028 interfaceC6028 = (InterfaceC6028) this.L$0;
            final ?? r1 = new View.OnLayoutChangeListener() { // from class: androidx.activity.飘花落叶言子世哲兰苏楪
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$0(interfaceC6028, view, i2, i3, i4, i5, i6, i7, i8, i9);
                }
            };
            final View view = this.$view;
            final ?? r4 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.飘花落叶言子世兰楪苏哲
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$1(interfaceC6028, view);
                }
            };
            final ViewOnAttachStateChangeListenerC0864 viewOnAttachStateChangeListenerC0864 = new ViewOnAttachStateChangeListenerC0864(interfaceC6028, view, r4, r1);
            if (view.isAttachedToWindow()) {
                View view2 = this.$view;
                Rect rect = new Rect();
                view2.getGlobalVisibleRect(rect);
                ((AbstractC6043) interfaceC6028).mo8995(rect);
                this.$view.getViewTreeObserver().addOnScrollChangedListener(r4);
                this.$view.addOnLayoutChangeListener(r1);
            }
            this.$view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0864);
            final View view3 = this.$view;
            InterfaceC7372 interfaceC7372 = new InterfaceC7372() { // from class: androidx.activity.飘花落叶言子世兰楪哲苏
                @Override // p068.InterfaceC7372
                public final Object invoke() {
                    return PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$2(view3, r4, r1, viewOnAttachStateChangeListenerC0864);
                }
            };
            this.label = 1;
            if (AbstractC6037.m10838(interfaceC6028, interfaceC7372, this) == coroutineSingletons) {
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
