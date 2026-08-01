package androidx.compose.p001ui.platform;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C1083;
import androidx.compose.foundation.lazy.layout.C1575;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.InterfaceC2959;
import androidx.compose.p001ui.graphics.ViewOnAttachStateChangeListenerC2427;
import androidx.compose.p001ui.node.InterfaceC2636;
import androidx.compose.runtime.AbstractC2207;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2211;
import androidx.compose.runtime.C2218;
import androidx.compose.runtime.InterfaceC2139;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.Recomposer$State;
import androidx.compose.runtime.internal.C2077;
import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.AbstractC3268;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.InterfaceC3254;
import com.bumptech.glide.AbstractC3889;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5043;
import java.lang.ref.WeakReference;
import kotlin.C6008;
import kotlin.InterfaceC6016;
import kotlin.coroutines.C5188;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5192;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6299;
import kotlinx.coroutines.internal.C6183;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p109.AbstractC8029;
import p109.C8030;
import p158.InterfaceC8366;
import p226.AbstractC8765;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2716 extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C2738 f5745;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public AbstractC2207 f5746;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f5747;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f5748;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC7372 f5749;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f5750;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public IBinder f5751;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C2686 f5752;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public WeakReference f5753;

    public AbstractC2716(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        ViewOnAttachStateChangeListenerC2694 viewOnAttachStateChangeListenerC2694 = new ViewOnAttachStateChangeListenerC2694(this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2694);
        C2697 c2697 = new C2697(this);
        AbstractC3889.m7309(this).f21274.add(c2697);
        this.f5749 = new C0212x11b1833b(this, viewOnAttachStateChangeListenerC2694, c2697);
    }

    private final void setParentContext(AbstractC2207 abstractC2207) {
        if (this.f5746 != abstractC2207) {
            this.f5746 = abstractC2207;
            if (abstractC2207 != null) {
                this.f5753 = null;
            }
            C2686 c2686 = this.f5752;
            if (c2686 != null) {
                c2686.dispose();
                this.f5752 = null;
                if (isAttachedToWindow()) {
                    m4054();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f5751 != iBinder) {
            this.f5751 = iBinder;
            this.f5753 = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        m4057();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m4057();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m4052getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(C0328R.id.auto_clear_focus_behavior_tag);
        C2653 c2653 = tag instanceof C2653 ? (C2653) tag : null;
        if (c2653 != null) {
            return c2653.f5643;
        }
        return 1;
    }

    public final C2738 getComposeViewContext$ui() {
        return this.f5745;
    }

    public final boolean getHasComposition() {
        return this.f5752 != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f5750;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f5748 || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1083 c1083 = AbstractC2673.f5685;
        Object objM8873 = AbstractC4765.m8873(this);
        View view = this;
        while (objM8873 instanceof View) {
            View view2 = (View) objM8873;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objM8873 = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new RunnableC2717(this, 0));
        } else {
            m4058();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo4061(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        m4054();
        mo4060(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m4053setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(C0328R.id.auto_clear_focus_behavior_tag, new C2653(i));
    }

    public final void setComposeViewContext$ui(C2738 c2738) {
        if (this.f5745 != c2738) {
            if (c2738 == null) {
                m4055();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC2719 ? (ViewTreeObserverOnGlobalLayoutListenerC2719) childAt : null;
                if (viewTreeObserverOnGlobalLayoutListenerC2719 != null) {
                    if (viewTreeObserverOnGlobalLayoutListenerC2719.getCoroutineContext() != c2738.f5943.mo2894()) {
                        m4055();
                    }
                    viewTreeObserverOnGlobalLayoutListenerC2719.setComposeViewContext(c2738);
                }
            }
            this.f5745 = c2738;
        }
    }

    public final void setParentCompositionContext(AbstractC2207 abstractC2207) {
        setParentContext(abstractC2207);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f5750 = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC2719) ((InterfaceC2636) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.f5748 = true;
    }

    public final void setViewCompositionStrategy(InterfaceC2699 interfaceC2699) {
        InterfaceC7372 interfaceC7372 = this.f5749;
        if (interfaceC7372 != null) {
            interfaceC7372.invoke();
        }
        ((AbstractC2751) interfaceC2699).getClass();
        ViewOnAttachStateChangeListenerC2694 viewOnAttachStateChangeListenerC2694 = new ViewOnAttachStateChangeListenerC2694(this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2694);
        C2697 c2697 = new C2697(this);
        AbstractC3889.m7309(this).f21274.add(c2697);
        this.f5749 = new C0212x11b1833b(this, viewOnAttachStateChangeListenerC2694, c2697);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m4054() {
        if (this.f5752 == null) {
            try {
                this.f5747 = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    C2738 c2738M4063 = this.f5745;
                    if (c2738M4063 == null) {
                        c2738M4063 = m4063();
                    }
                    this.f5752 = AbstractC2685.m4038(this, c2738M4063, new C2077(1003123809, true, new InterfaceC7383() { // from class: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1$1
                        {
                            super(2);
                        }

                        public final void invoke(InterfaceC2208 interfaceC2208, int i) {
                            C2159 c2159 = (C2159) interfaceC2208;
                            if (c2159.m2903(i & 1, (i & 3) != 2)) {
                                this.this$0.mo4059(c2159, 0);
                            } else {
                                c2159.m2899();
                            }
                        }

                        @Override // p068.InterfaceC7383
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                            return C6008.f15084;
                        }
                    }));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.f5747 = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4055() {
        View childAt = getChildAt(0);
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC2719 ? (ViewTreeObserverOnGlobalLayoutListenerC2719) childAt : null;
        if (viewTreeObserverOnGlobalLayoutListenerC2719 != null && viewTreeObserverOnGlobalLayoutListenerC2719.f5793) {
            viewTreeObserverOnGlobalLayoutListenerC2719.getComposeViewContext().m4161();
            viewTreeObserverOnGlobalLayoutListenerC2719.f5793 = false;
        }
        C2686 c2686 = this.f5752;
        if (c2686 != null) {
            c2686.dispose();
        }
        this.f5752 = null;
        requestLayout();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m4056() {
        C2738 c2738;
        View view;
        if (this.f5746 == null && !isAttachedToWindow() && ((c2738 = this.f5745) == null || (view = c2738.f5944) == null || !view.isAttachedToWindow())) {
            C6755.m11870("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            m4054();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4057() {
        if (this.f5747) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4058() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.f5745 == null) {
                ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC2719) {
                        viewTreeObserverOnGlobalLayoutListenerC2719 = (ViewTreeObserverOnGlobalLayoutListenerC2719) childAt;
                    }
                }
                if (viewTreeObserverOnGlobalLayoutListenerC2719 != null) {
                    viewTreeObserverOnGlobalLayoutListenerC2719.setComposeViewContext(m4062(AbstractC2751.m4188(this), viewTreeObserverOnGlobalLayoutListenerC2719.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                m4054();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract void mo4059(InterfaceC2208 interfaceC2208, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void mo4060(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo4061(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C2738 m4062(View view, C2738 c2738) {
        AbstractC2207 abstractC2207M4064 = m4064();
        InterfaceC3221 interfaceC3221M5089 = AbstractC3268.m5089(view);
        InterfaceC3254 interfaceC3254M5088 = AbstractC3268.m5088(view);
        InterfaceC8366 interfaceC8366M7318 = AbstractC3889.m7318(view);
        AbstractC2207 abstractC2207 = c2738.f5943;
        InterfaceC8366 interfaceC8366 = c2738.f5941;
        InterfaceC3221 interfaceC3221 = c2738.f5942;
        if (abstractC2207M4064 == abstractC2207 && interfaceC3221M5089 == interfaceC3221 && interfaceC3254M5088 == c2738.f5940 && interfaceC8366M7318 == interfaceC8366) {
            return c2738;
        }
        if (abstractC2207M4064.mo2894() != c2738.f5943.mo2894()) {
            m4055();
        }
        if (interfaceC3221M5089 == null) {
            interfaceC3221M5089 = interfaceC3221;
        }
        C2738 c27382 = new C2738(c2738, view, abstractC2207M4064, interfaceC3221M5089, interfaceC8366M7318 == null ? interfaceC8366 : interfaceC8366M7318, interfaceC3254M5088);
        view.setTag(C0328R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(c27382));
        return c27382;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2738 m4063() {
        C2738 composeViewContext;
        InterfaceC3254 interfaceC3254;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC2719 ? (ViewTreeObserverOnGlobalLayoutListenerC2719) childAt : null;
            if (viewTreeObserverOnGlobalLayoutListenerC2719 != null) {
                composeViewContext = viewTreeObserverOnGlobalLayoutListenerC2719.getComposeViewContext();
            }
        }
        View viewM4188 = AbstractC2751.m4188(this);
        C2738 c2738M4187 = AbstractC2751.m4187(viewM4188);
        if (c2738M4187 != null) {
            return m4062(viewM4188, c2738M4187);
        }
        AbstractC2207 abstractC2207M4064 = m4064();
        InterfaceC3221 interfaceC3221M5089 = AbstractC3268.m5089(viewM4188);
        if (interfaceC3221M5089 == null) {
            interfaceC3221M5089 = composeViewContext != null ? composeViewContext.f5942 : null;
            if (interfaceC3221M5089 == null) {
                C6755.m11870("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        InterfaceC3221 interfaceC3221 = interfaceC3221M5089;
        InterfaceC8366 interfaceC8366M7318 = AbstractC3889.m7318(viewM4188);
        if (interfaceC8366M7318 == null) {
            interfaceC8366M7318 = composeViewContext != null ? composeViewContext.f5941 : null;
            if (interfaceC8366M7318 == null) {
                C6755.m11870("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        InterfaceC8366 interfaceC8366 = interfaceC8366M7318;
        InterfaceC3254 interfaceC3254M5088 = AbstractC3268.m5088(viewM4188);
        if (interfaceC3254M5088 == null) {
            interfaceC3254 = composeViewContext != null ? composeViewContext.f5940 : null;
        } else {
            interfaceC3254 = interfaceC3254M5088;
        }
        C2738 c2738 = new C2738(AbstractC2751.m4187(AbstractC2751.m4188(viewM4188)), viewM4188, abstractC2207M4064, interfaceC3221, interfaceC8366, interfaceC3254);
        viewM4188.setTag(C0328R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(c2738));
        return c2738;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [kotlin.coroutines.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r7v11, types: [T, androidx.compose.ui.platform.飘花落叶言子哲楪兰苏世] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.coroutines.飘花落叶言子楪苏世兰哲] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final AbstractC2207 m4064() {
        C2218 c2218;
        InterfaceC5192 interfaceC5192;
        InterfaceC5192 interfaceC5192Plus;
        C2211 c2211;
        int i;
        AbstractC2207 abstractC2207M4033 = this.f5746;
        if (abstractC2207M4033 == null) {
            abstractC2207M4033 = AbstractC2673.m4033(this);
            if (abstractC2207M4033 == null) {
                Object parent = getParent();
                while (abstractC2207M4033 == null && (parent instanceof View)) {
                    View view = (View) parent;
                    abstractC2207M4033 = AbstractC2673.m4033(view);
                    parent = AbstractC4765.m8873(view);
                }
            }
            if (abstractC2207M4033 != null) {
                AbstractC2207 abstractC2207 = (!(abstractC2207M4033 instanceof C2218) || ((Recomposer$State) ((C2218) abstractC2207M4033).f4349.getValue()).compareTo(Recomposer$State.ShuttingDown) > 0) ? abstractC2207M4033 : null;
                if (abstractC2207 != null) {
                    this.f5753 = new WeakReference(abstractC2207);
                }
            } else {
                abstractC2207M4033 = null;
            }
            if (abstractC2207M4033 == null) {
                WeakReference weakReference = this.f5753;
                if (weakReference == null || (abstractC2207M4033 = (AbstractC2207) weakReference.get()) == null || ((abstractC2207M4033 instanceof C2218) && ((Recomposer$State) ((C2218) abstractC2207M4033).f4349.getValue()).compareTo(Recomposer$State.ShuttingDown) <= 0)) {
                    abstractC2207M4033 = null;
                }
                if (abstractC2207M4033 == null) {
                    if (!isAttachedToWindow()) {
                        AbstractC8765.m13982("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object objM8873 = AbstractC4765.m8873(this);
                    View view2 = this;
                    while (objM8873 instanceof View) {
                        View view3 = (View) objM8873;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        objM8873 = view3.getParent();
                    }
                    AbstractC2207 abstractC2207M40332 = AbstractC2673.m4033(view2);
                    if (abstractC2207M40332 == null) {
                        ((C2681) AbstractC2682.f5698.get()).getClass();
                        InterfaceC5192 interfaceC51922 = EmptyCoroutineContext.INSTANCE;
                        if (interfaceC51922.get(C5188.f13281) == null || interfaceC51922.get(C2188.f4269) == null) {
                            InterfaceC6016 interfaceC6016 = C2657.f5647;
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                interfaceC5192 = (InterfaceC5192) C2657.f5647.getValue();
                            } else {
                                interfaceC5192 = (InterfaceC5192) C2657.f5646.get();
                                if (interfaceC5192 == null) {
                                    C6755.m11870("no AndroidUiDispatcher for this thread");
                                    return null;
                                }
                            }
                            interfaceC5192Plus = interfaceC5192.plus(interfaceC51922);
                        } else {
                            interfaceC5192Plus = interfaceC51922;
                        }
                        InterfaceC2139 interfaceC2139 = (InterfaceC2139) interfaceC5192Plus.get(C2188.f4269);
                        int i2 = 0;
                        if (interfaceC2139 != null) {
                            c2211 = new C2211(interfaceC2139);
                            C1575 c1575 = c2211.f4326;
                            synchronized (c1575.f2416) {
                                c1575.f2417 = false;
                            }
                        } else {
                            c2211 = null;
                        }
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        InterfaceC2959 interfaceC2959 = (InterfaceC2959) interfaceC5192Plus.get(C2952.f6608);
                        ?? r7 = interfaceC2959;
                        if (interfaceC2959 == null) {
                            ?? c2703 = new C2703(view2.getContext().getApplicationContext());
                            ref$ObjectRef.element = c2703;
                            r7 = c2703;
                        }
                        if (c2211 != null) {
                            interfaceC51922 = c2211;
                        }
                        InterfaceC5192 interfaceC5192Plus2 = interfaceC5192Plus.plus(interfaceC51922).plus(r7);
                        c2218 = new C2218(interfaceC5192Plus2);
                        synchronized (c2218.f4341) {
                            i = 1;
                            c2218.f4348 = true;
                        }
                        C6183 c6183M11048 = AbstractC6231.m11048(interfaceC5192Plus2);
                        InterfaceC3221 interfaceC3221M5089 = AbstractC3268.m5089(view2);
                        AbstractC3235 lifecycle = interfaceC3221M5089 != null ? interfaceC3221M5089.getLifecycle() : null;
                        if (lifecycle == null) {
                            AbstractC8765.m13981("ViewTreeLifecycleOwner not found from " + view2);
                            C5043.m9161();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2676(i2, view2, c2218));
                        lifecycle.mo5063(new C2678(c6183M11048, c2211, c2218, ref$ObjectRef));
                        view2.setTag(C0328R.id.androidx_compose_ui_view_composition_context, c2218);
                        C6299 c6299 = C6299.f15471;
                        Handler handler = view2.getHandler();
                        int i3 = AbstractC8029.f19557;
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2427(AbstractC6231.m11036(c6299, new C8030(handler, "windowRecomposer cleanup", false).f19558, null, new C0215xbfd085b3(c2218, view2, null), 2), i));
                    } else {
                        if (!(abstractC2207M40332 instanceof C2218)) {
                            C6755.m11870("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        c2218 = (C2218) abstractC2207M40332;
                    }
                    C2218 c22182 = ((Recomposer$State) c2218.f4349.getValue()).compareTo(Recomposer$State.ShuttingDown) > 0 ? c2218 : null;
                    if (c22182 != null) {
                        this.f5753 = new WeakReference(c22182);
                    }
                    return c2218;
                }
            }
        }
        return abstractC2207M4033;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        m4057();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        m4057();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        m4057();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m4057();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m4057();
        super.addView(view, i, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
