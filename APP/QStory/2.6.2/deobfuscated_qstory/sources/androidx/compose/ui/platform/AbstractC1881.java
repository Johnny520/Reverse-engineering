package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C0236;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.lazy.layout.C0734;
import androidx.compose.runtime.AbstractC1372;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1376;
import androidx.compose.runtime.C1383;
import androidx.compose.runtime.InterfaceC1304;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.Recomposer$State;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.ui.C2119;
import androidx.compose.ui.InterfaceC2126;
import androidx.compose.ui.graphics.ViewOnAttachStateChangeListenerC1592;
import androidx.compose.ui.node.InterfaceC1801;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.AbstractC2435;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.InterfaceC2421;
import com.bumptech.glide.AbstractC3055;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.util.C4210;
import java.lang.ref.WeakReference;
import kotlin.C5175;
import kotlin.InterfaceC5183;
import kotlin.coroutines.C4355;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4359;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5466;
import kotlinx.coroutines.internal.C5350;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p093.AbstractC7199;
import p093.C7200;
import p142.InterfaceC7536;
import p210.AbstractC7935;
import p392.AbstractC9124;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1881 extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C1903 f5399;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public AbstractC1372 f5400;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f5401;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f5402;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC6542 f5403;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f5404;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public IBinder f5405;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C1851 f5406;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public WeakReference f5407;

    public AbstractC1881(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        ViewOnAttachStateChangeListenerC1859 viewOnAttachStateChangeListenerC1859 = new ViewOnAttachStateChangeListenerC1859(this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1859);
        C1862 c1862 = new C1862(this);
        AbstractC0455.m1163(this).f20934.add(c1862);
        this.f5403 = new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(this, viewOnAttachStateChangeListenerC1859, c1862);
    }

    private final void setParentContext(AbstractC1372 abstractC1372) {
        if (this.f5400 != abstractC1372) {
            this.f5400 = abstractC1372;
            if (abstractC1372 != null) {
                this.f5407 = null;
            }
            C1851 c1851 = this.f5406;
            if (c1851 != null) {
                c1851.dispose();
                this.f5406 = null;
                if (isAttachedToWindow()) {
                    m3484();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f5405 != iBinder) {
            this.f5405 = iBinder;
            this.f5407 = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        m3487();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m3487();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m3482getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        C1818 c1818 = tag instanceof C1818 ? (C1818) tag : null;
        if (c1818 != null) {
            return c1818.f5297;
        }
        return 1;
    }

    public final C1903 getComposeViewContext$ui() {
        return this.f5399;
    }

    public final boolean getHasComposition() {
        return this.f5406 != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f5404;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f5402 || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0236 c0236 = AbstractC1838.f5339;
        Object objM6643 = AbstractC3055.m6643(this);
        View view = this;
        while (objM6643 instanceof View) {
            View view2 = (View) objM6643;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objM6643 = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new RunnableC1882(this, 0));
        } else {
            m3488();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo3491(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        m3484();
        mo3490(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m3483setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new C1818(i));
    }

    public final void setComposeViewContext$ui(C1903 c1903) {
        if (this.f5399 != c1903) {
            if (c1903 == null) {
                m3485();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC1884 ? (ViewTreeObserverOnGlobalLayoutListenerC1884) childAt : null;
                if (viewTreeObserverOnGlobalLayoutListenerC1884 != null) {
                    if (viewTreeObserverOnGlobalLayoutListenerC1884.getCoroutineContext() != c1903.f5597.mo2324()) {
                        m3485();
                    }
                    viewTreeObserverOnGlobalLayoutListenerC1884.setComposeViewContext(c1903);
                }
            }
            this.f5399 = c1903;
        }
    }

    public final void setParentCompositionContext(AbstractC1372 abstractC1372) {
        setParentContext(abstractC1372);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f5404 = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1884) ((InterfaceC1801) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.f5402 = true;
    }

    public final void setViewCompositionStrategy(InterfaceC1864 interfaceC1864) {
        InterfaceC6542 interfaceC6542 = this.f5403;
        if (interfaceC6542 != null) {
            interfaceC6542.invoke();
        }
        ((AbstractC1916) interfaceC1864).getClass();
        ViewOnAttachStateChangeListenerC1859 viewOnAttachStateChangeListenerC1859 = new ViewOnAttachStateChangeListenerC1859(this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1859);
        C1862 c1862 = new C1862(this);
        AbstractC0455.m1163(this).f20934.add(c1862);
        this.f5403 = new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(this, viewOnAttachStateChangeListenerC1859, c1862);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3484() {
        if (this.f5406 == null) {
            try {
                this.f5401 = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    C1903 c1903M3493 = this.f5399;
                    if (c1903M3493 == null) {
                        c1903M3493 = m3493();
                    }
                    this.f5406 = AbstractC1850.m3468(this, c1903M3493, new C1242(1003123809, true, new InterfaceC6553() { // from class: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1$1
                        {
                            super(2);
                        }

                        public final void invoke(InterfaceC1373 interfaceC1373, int i) {
                            C1324 c1324 = (C1324) interfaceC1373;
                            if (c1324.m2333(i & 1, (i & 3) != 2)) {
                                this.this$0.mo3489(c1324, 0);
                            } else {
                                c1324.m2329();
                            }
                        }

                        @Override // p052.InterfaceC6553
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                            return C5175.f14739;
                        }
                    }));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.f5401 = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3485() {
        View childAt = getChildAt(0);
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC1884 ? (ViewTreeObserverOnGlobalLayoutListenerC1884) childAt : null;
        if (viewTreeObserverOnGlobalLayoutListenerC1884 != null && viewTreeObserverOnGlobalLayoutListenerC1884.f5447) {
            viewTreeObserverOnGlobalLayoutListenerC1884.getComposeViewContext().m3591();
            viewTreeObserverOnGlobalLayoutListenerC1884.f5447 = false;
        }
        C1851 c1851 = this.f5406;
        if (c1851 != null) {
            c1851.dispose();
        }
        this.f5406 = null;
        requestLayout();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3486() {
        C1903 c1903;
        View view;
        if (this.f5400 == null && !isAttachedToWindow() && ((c1903 = this.f5399) == null || (view = c1903.f5598) == null || !view.isAttachedToWindow())) {
            C5919.m11250("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            m3484();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3487() {
        if (this.f5401) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3488() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.f5399 == null) {
                ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC1884) {
                        viewTreeObserverOnGlobalLayoutListenerC1884 = (ViewTreeObserverOnGlobalLayoutListenerC1884) childAt;
                    }
                }
                if (viewTreeObserverOnGlobalLayoutListenerC1884 != null) {
                    viewTreeObserverOnGlobalLayoutListenerC1884.setComposeViewContext(m3492(AbstractC1916.m3618(this), viewTreeObserverOnGlobalLayoutListenerC1884.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                m3484();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract void mo3489(InterfaceC1373 interfaceC1373, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void mo3490(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo3491(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C1903 m3492(View view, C1903 c1903) {
        AbstractC1372 abstractC1372M3494 = m3494();
        InterfaceC2388 interfaceC2388M4519 = AbstractC2435.m4519(view);
        InterfaceC2421 interfaceC2421M4518 = AbstractC2435.m4518(view);
        InterfaceC7536 interfaceC7536M14675 = AbstractC9124.m14675(view);
        AbstractC1372 abstractC1372 = c1903.f5597;
        InterfaceC7536 interfaceC7536 = c1903.f5595;
        InterfaceC2388 interfaceC2388 = c1903.f5596;
        if (abstractC1372M3494 == abstractC1372 && interfaceC2388M4519 == interfaceC2388 && interfaceC2421M4518 == c1903.f5594 && interfaceC7536M14675 == interfaceC7536) {
            return c1903;
        }
        if (abstractC1372M3494.mo2324() != c1903.f5597.mo2324()) {
            m3485();
        }
        if (interfaceC2388M4519 == null) {
            interfaceC2388M4519 = interfaceC2388;
        }
        C1903 c19032 = new C1903(c1903, view, abstractC1372M3494, interfaceC2388M4519, interfaceC7536M14675 == null ? interfaceC7536 : interfaceC7536M14675, interfaceC2421M4518);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(c19032));
        return c19032;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.platform.C1903 m3493() {
        /*
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L1c
        L9:
            r0 = 0
            android.view.View r0 = r9.getChildAt(r0)
            boolean r2 = r0 instanceof androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884
            if (r2 == 0) goto L15
            androidx.compose.ui.platform.飘花落叶言子楪兰世苏哲 r0 = (androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884) r0
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L7
            androidx.compose.ui.platform.飘花落叶言子苏世哲兰楪 r0 = r0.getComposeViewContext()
        L1c:
            android.view.View r4 = androidx.compose.ui.platform.AbstractC1916.m3618(r9)
            androidx.compose.ui.platform.飘花落叶言子苏世哲兰楪 r2 = androidx.compose.ui.platform.AbstractC1916.m3617(r4)
            if (r2 != 0) goto L7c
            androidx.compose.runtime.飘花落叶言子楪苏兰哲世 r5 = r9.m3494()
            androidx.lifecycle.飘花落叶言子世苏哲楪兰 r9 = androidx.lifecycle.AbstractC2435.m4519(r4)
            if (r9 != 0) goto L38
            if (r0 == 0) goto L35
            androidx.lifecycle.飘花落叶言子世苏哲楪兰 r9 = r0.f5596
            goto L36
        L35:
            r9 = r1
        L36:
            if (r9 == 0) goto L3a
        L38:
            r6 = r9
            goto L40
        L3a:
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            top.suzhelan.qstory.hook.item.C5919.m11250(r9)
            return r1
        L40:
            飘花落叶言子兰楪哲苏世.飘花落叶言子楪世兰哲苏 r9 = p392.AbstractC9124.m14675(r4)
            if (r9 != 0) goto L4e
            if (r0 == 0) goto L4b
            飘花落叶言子兰楪哲苏世.飘花落叶言子楪世兰哲苏 r9 = r0.f5595
            goto L4c
        L4b:
            r9 = r1
        L4c:
            if (r9 == 0) goto L50
        L4e:
            r7 = r9
            goto L56
        L50:
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!"
            top.suzhelan.qstory.hook.item.C5919.m11250(r9)
            return r1
        L56:
            androidx.lifecycle.飘花落叶言子苏兰世楪哲 r9 = androidx.lifecycle.AbstractC2435.m4518(r4)
            if (r9 != 0) goto L62
            if (r0 == 0) goto L60
            androidx.lifecycle.飘花落叶言子苏兰世楪哲 r1 = r0.f5594
        L60:
            r8 = r1
            goto L63
        L62:
            r8 = r9
        L63:
            androidx.compose.ui.platform.飘花落叶言子苏世哲兰楪 r2 = new androidx.compose.ui.platform.飘花落叶言子苏世哲兰楪
            android.view.View r9 = androidx.compose.ui.platform.AbstractC1916.m3618(r4)
            androidx.compose.ui.platform.飘花落叶言子苏世哲兰楪 r3 = androidx.compose.ui.platform.AbstractC1916.m3617(r9)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r2)
            r0 = 604569706(0x2409006a, float:2.970749E-17)
            r4.setTag(r0, r9)
            return r2
        L7c:
            androidx.compose.ui.platform.飘花落叶言子苏世哲兰楪 r9 = r9.m3492(r4, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AbstractC1881.m3493():androidx.compose.ui.platform.飘花落叶言子苏世哲兰楪");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [kotlin.coroutines.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r7v11, types: [T, androidx.compose.ui.platform.飘花落叶言子哲楪兰苏世] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.coroutines.飘花落叶言子楪苏世兰哲] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final AbstractC1372 m3494() {
        C1383 c1383;
        InterfaceC4359 interfaceC4359;
        InterfaceC4359 interfaceC4359Plus;
        C1376 c1376;
        int i;
        AbstractC1372 abstractC1372M3463 = this.f5400;
        if (abstractC1372M3463 == null) {
            abstractC1372M3463 = AbstractC1838.m3463(this);
            if (abstractC1372M3463 == null) {
                Object parent = getParent();
                while (abstractC1372M3463 == null && (parent instanceof View)) {
                    View view = (View) parent;
                    abstractC1372M3463 = AbstractC1838.m3463(view);
                    parent = AbstractC3055.m6643(view);
                }
            }
            if (abstractC1372M3463 != null) {
                AbstractC1372 abstractC1372 = (!(abstractC1372M3463 instanceof C1383) || ((Recomposer$State) ((C1383) abstractC1372M3463).f4003.getValue()).compareTo(Recomposer$State.ShuttingDown) > 0) ? abstractC1372M3463 : null;
                if (abstractC1372 != null) {
                    this.f5407 = new WeakReference(abstractC1372);
                }
            } else {
                abstractC1372M3463 = null;
            }
            if (abstractC1372M3463 == null) {
                WeakReference weakReference = this.f5407;
                if (weakReference == null || (abstractC1372M3463 = (AbstractC1372) weakReference.get()) == null || ((abstractC1372M3463 instanceof C1383) && ((Recomposer$State) ((C1383) abstractC1372M3463).f4003.getValue()).compareTo(Recomposer$State.ShuttingDown) <= 0)) {
                    abstractC1372M3463 = null;
                }
                if (abstractC1372M3463 == null) {
                    if (!isAttachedToWindow()) {
                        AbstractC7935.m13395("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object objM6643 = AbstractC3055.m6643(this);
                    View view2 = this;
                    while (objM6643 instanceof View) {
                        View view3 = (View) objM6643;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        objM6643 = view3.getParent();
                    }
                    AbstractC1372 abstractC1372M34632 = AbstractC1838.m3463(view2);
                    if (abstractC1372M34632 == null) {
                        ((C1846) AbstractC1847.f5352.get()).getClass();
                        InterfaceC4359 interfaceC43592 = EmptyCoroutineContext.INSTANCE;
                        if (interfaceC43592.get(C4355.f12932) == null || interfaceC43592.get(C1353.f3923) == null) {
                            InterfaceC5183 interfaceC5183 = C1822.f5301;
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                interfaceC4359 = (InterfaceC4359) C1822.f5301.getValue();
                            } else {
                                interfaceC4359 = (InterfaceC4359) C1822.f5300.get();
                                if (interfaceC4359 == null) {
                                    C5919.m11250("no AndroidUiDispatcher for this thread");
                                    return null;
                                }
                            }
                            interfaceC4359Plus = interfaceC4359.plus(interfaceC43592);
                        } else {
                            interfaceC4359Plus = interfaceC43592;
                        }
                        InterfaceC1304 interfaceC1304 = (InterfaceC1304) interfaceC4359Plus.get(C1353.f3923);
                        int i2 = 0;
                        if (interfaceC1304 != null) {
                            c1376 = new C1376(interfaceC1304);
                            C0734 c0734 = c1376.f3980;
                            synchronized (c0734.f2070) {
                                c0734.f2071 = false;
                            }
                        } else {
                            c1376 = null;
                        }
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        InterfaceC2126 interfaceC2126 = (InterfaceC2126) interfaceC4359Plus.get(C2119.f6262);
                        ?? r7 = interfaceC2126;
                        if (interfaceC2126 == null) {
                            ?? c1868 = new C1868(view2.getContext().getApplicationContext());
                            ref$ObjectRef.element = c1868;
                            r7 = c1868;
                        }
                        if (c1376 != null) {
                            interfaceC43592 = c1376;
                        }
                        InterfaceC4359 interfaceC4359Plus2 = interfaceC4359Plus.plus(interfaceC43592).plus(r7);
                        c1383 = new C1383(interfaceC4359Plus2);
                        synchronized (c1383.f3995) {
                            i = 1;
                            c1383.f4002 = true;
                        }
                        C5350 c5350M10485 = AbstractC5398.m10485(interfaceC4359Plus2);
                        InterfaceC2388 interfaceC2388M4519 = AbstractC2435.m4519(view2);
                        AbstractC2402 lifecycle = interfaceC2388M4519 != null ? interfaceC2388M4519.getLifecycle() : null;
                        if (lifecycle == null) {
                            AbstractC7935.m13394("ViewTreeLifecycleOwner not found from " + view2);
                            C4210.m8612();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1841(i2, view2, c1383));
                        lifecycle.mo4493(new C1843(c5350M10485, c1376, c1383, ref$ObjectRef));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, c1383);
                        C5466 c5466 = C5466.f15126;
                        Handler handler = view2.getHandler();
                        int i3 = AbstractC7199.f19217;
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1592(AbstractC5398.m10473(c5466, new C7200(handler, "windowRecomposer cleanup", false).f19218, null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(c1383, view2, null), 2), i));
                    } else {
                        if (!(abstractC1372M34632 instanceof C1383)) {
                            C5919.m11250("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        c1383 = (C1383) abstractC1372M34632;
                    }
                    C1383 c13832 = ((Recomposer$State) c1383.f4003.getValue()).compareTo(Recomposer$State.ShuttingDown) > 0 ? c1383 : null;
                    if (c13832 != null) {
                        this.f5407 = new WeakReference(c13832);
                    }
                    return c1383;
                }
            }
        }
        return abstractC1372M3463;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        m3487();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        m3487();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        m3487();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m3487();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m3487();
        super.addView(view, i, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
