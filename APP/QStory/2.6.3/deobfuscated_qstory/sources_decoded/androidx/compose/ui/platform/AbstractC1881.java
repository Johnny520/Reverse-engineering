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
import com.bumptech.glide.AbstractC3057;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.util.C4211;
import java.lang.ref.WeakReference;
import kotlin.C5176;
import kotlin.InterfaceC5184;
import kotlin.coroutines.C4356;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5467;
import kotlinx.coroutines.internal.C5351;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p093.AbstractC7200;
import p093.C7201;
import p142.InterfaceC7537;
import p210.AbstractC7936;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1881 extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C1903 f5400;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public AbstractC1372 f5401;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f5402;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f5403;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC6543 f5404;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f5405;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public IBinder f5406;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C1851 f5407;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public WeakReference f5408;

    public AbstractC1881(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        ViewOnAttachStateChangeListenerC1859 viewOnAttachStateChangeListenerC1859 = new ViewOnAttachStateChangeListenerC1859(this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1859);
        C1862 c1862 = new C1862(this);
        AbstractC3057.m6749(this).f20929.add(c1862);
        this.f5404 = new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(this, viewOnAttachStateChangeListenerC1859, c1862);
    }

    private final void setParentContext(AbstractC1372 abstractC1372) {
        if (this.f5401 != abstractC1372) {
            this.f5401 = abstractC1372;
            if (abstractC1372 != null) {
                this.f5408 = null;
            }
            C1851 c1851 = this.f5407;
            if (c1851 != null) {
                c1851.dispose();
                this.f5407 = null;
                if (isAttachedToWindow()) {
                    m3494();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f5406 != iBinder) {
            this.f5406 = iBinder;
            this.f5408 = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        m3497();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m3497();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m3492getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        C1818 c1818 = tag instanceof C1818 ? (C1818) tag : null;
        if (c1818 != null) {
            return c1818.f5298;
        }
        return 1;
    }

    public final C1903 getComposeViewContext$ui() {
        return this.f5400;
    }

    public final boolean getHasComposition() {
        return this.f5407 != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f5405;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f5403 || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0236 c0236 = AbstractC1838.f5340;
        Object objM8314 = AbstractC3933.m8314(this);
        View view = this;
        while (objM8314 instanceof View) {
            View view2 = (View) objM8314;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objM8314 = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new RunnableC1882(this, 0));
        } else {
            m3498();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo3501(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        m3494();
        mo3500(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m3493setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new C1818(i));
    }

    public final void setComposeViewContext$ui(C1903 c1903) {
        if (this.f5400 != c1903) {
            if (c1903 == null) {
                m3495();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC1884 ? (ViewTreeObserverOnGlobalLayoutListenerC1884) childAt : null;
                if (viewTreeObserverOnGlobalLayoutListenerC1884 != null) {
                    if (viewTreeObserverOnGlobalLayoutListenerC1884.getCoroutineContext() != c1903.f5598.mo2334()) {
                        m3495();
                    }
                    viewTreeObserverOnGlobalLayoutListenerC1884.setComposeViewContext(c1903);
                }
            }
            this.f5400 = c1903;
        }
    }

    public final void setParentCompositionContext(AbstractC1372 abstractC1372) {
        setParentContext(abstractC1372);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f5405 = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1884) ((InterfaceC1801) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.f5403 = true;
    }

    public final void setViewCompositionStrategy(InterfaceC1864 interfaceC1864) {
        InterfaceC6543 interfaceC6543 = this.f5404;
        if (interfaceC6543 != null) {
            interfaceC6543.invoke();
        }
        ((AbstractC1916) interfaceC1864).getClass();
        ViewOnAttachStateChangeListenerC1859 viewOnAttachStateChangeListenerC1859 = new ViewOnAttachStateChangeListenerC1859(this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1859);
        C1862 c1862 = new C1862(this);
        AbstractC3057.m6749(this).f20929.add(c1862);
        this.f5404 = new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(this, viewOnAttachStateChangeListenerC1859, c1862);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3494() {
        if (this.f5407 == null) {
            try {
                this.f5402 = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    C1903 c1903M3503 = this.f5400;
                    if (c1903M3503 == null) {
                        c1903M3503 = m3503();
                    }
                    this.f5407 = AbstractC1850.m3478(this, c1903M3503, new C1242(1003123809, true, new InterfaceC6554() { // from class: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1$1
                        {
                            super(2);
                        }

                        public final void invoke(InterfaceC1373 interfaceC1373, int i) {
                            C1324 c1324 = (C1324) interfaceC1373;
                            if (c1324.m2343(i & 1, (i & 3) != 2)) {
                                this.this$0.mo3499(c1324, 0);
                            } else {
                                c1324.m2339();
                            }
                        }

                        @Override // p052.InterfaceC6554
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                            return C5176.f14739;
                        }
                    }));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.f5402 = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3495() {
        View childAt = getChildAt(0);
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC1884 ? (ViewTreeObserverOnGlobalLayoutListenerC1884) childAt : null;
        if (viewTreeObserverOnGlobalLayoutListenerC1884 != null && viewTreeObserverOnGlobalLayoutListenerC1884.f5448) {
            viewTreeObserverOnGlobalLayoutListenerC1884.getComposeViewContext().m3601();
            viewTreeObserverOnGlobalLayoutListenerC1884.f5448 = false;
        }
        C1851 c1851 = this.f5407;
        if (c1851 != null) {
            c1851.dispose();
        }
        this.f5407 = null;
        requestLayout();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3496() {
        C1903 c1903;
        View view;
        if (this.f5401 == null && !isAttachedToWindow() && ((c1903 = this.f5400) == null || (view = c1903.f5599) == null || !view.isAttachedToWindow())) {
            C5925.m11311("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            m3494();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3497() {
        if (this.f5402) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3498() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.f5400 == null) {
                ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC1884) {
                        viewTreeObserverOnGlobalLayoutListenerC1884 = (ViewTreeObserverOnGlobalLayoutListenerC1884) childAt;
                    }
                }
                if (viewTreeObserverOnGlobalLayoutListenerC1884 != null) {
                    viewTreeObserverOnGlobalLayoutListenerC1884.setComposeViewContext(m3502(AbstractC1916.m3628(this), viewTreeObserverOnGlobalLayoutListenerC1884.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                m3494();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract void mo3499(InterfaceC1373 interfaceC1373, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void mo3500(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo3501(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C1903 m3502(View view, C1903 c1903) {
        AbstractC1372 abstractC1372M3504 = m3504();
        InterfaceC2388 interfaceC2388M4529 = AbstractC2435.m4529(view);
        InterfaceC2421 interfaceC2421M4528 = AbstractC2435.m4528(view);
        InterfaceC7537 interfaceC7537M6758 = AbstractC3057.m6758(view);
        AbstractC1372 abstractC1372 = c1903.f5598;
        InterfaceC7537 interfaceC7537 = c1903.f5596;
        InterfaceC2388 interfaceC2388 = c1903.f5597;
        if (abstractC1372M3504 == abstractC1372 && interfaceC2388M4529 == interfaceC2388 && interfaceC2421M4528 == c1903.f5595 && interfaceC7537M6758 == interfaceC7537) {
            return c1903;
        }
        if (abstractC1372M3504.mo2334() != c1903.f5598.mo2334()) {
            m3495();
        }
        if (interfaceC2388M4529 == null) {
            interfaceC2388M4529 = interfaceC2388;
        }
        C1903 c19032 = new C1903(c1903, view, abstractC1372M3504, interfaceC2388M4529, interfaceC7537M6758 == null ? interfaceC7537 : interfaceC7537M6758, interfaceC2421M4528);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(c19032));
        return c19032;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.platform.C1903 m3503() {
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
            android.view.View r4 = androidx.compose.ui.platform.AbstractC1916.m3628(r9)
            androidx.compose.ui.platform.飘花落叶言子苏世哲兰楪 r2 = androidx.compose.ui.platform.AbstractC1916.m3627(r4)
            if (r2 != 0) goto L7c
            androidx.compose.runtime.飘花落叶言子楪苏兰哲世 r5 = r9.m3504()
            androidx.lifecycle.飘花落叶言子世苏哲楪兰 r9 = androidx.lifecycle.AbstractC2435.m4529(r4)
            if (r9 != 0) goto L38
            if (r0 == 0) goto L35
            androidx.lifecycle.飘花落叶言子世苏哲楪兰 r9 = r0.f5597
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
            top.suzhelan.qstory.hook.item.C5925.m11311(r9)
            return r1
        L40:
            飘花落叶言子兰楪哲苏世.飘花落叶言子楪世兰哲苏 r9 = com.bumptech.glide.AbstractC3057.m6758(r4)
            if (r9 != 0) goto L4e
            if (r0 == 0) goto L4b
            飘花落叶言子兰楪哲苏世.飘花落叶言子楪世兰哲苏 r9 = r0.f5596
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
            top.suzhelan.qstory.hook.item.C5925.m11311(r9)
            return r1
        L56:
            androidx.lifecycle.飘花落叶言子苏兰世楪哲 r9 = androidx.lifecycle.AbstractC2435.m4528(r4)
            if (r9 != 0) goto L62
            if (r0 == 0) goto L60
            androidx.lifecycle.飘花落叶言子苏兰世楪哲 r1 = r0.f5595
        L60:
            r8 = r1
            goto L63
        L62:
            r8 = r9
        L63:
            androidx.compose.ui.platform.飘花落叶言子苏世哲兰楪 r2 = new androidx.compose.ui.platform.飘花落叶言子苏世哲兰楪
            android.view.View r9 = androidx.compose.ui.platform.AbstractC1916.m3628(r4)
            androidx.compose.ui.platform.飘花落叶言子苏世哲兰楪 r3 = androidx.compose.ui.platform.AbstractC1916.m3627(r9)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r2)
            r0 = 604569706(0x2409006a, float:2.970749E-17)
            r4.setTag(r0, r9)
            return r2
        L7c:
            androidx.compose.ui.platform.飘花落叶言子苏世哲兰楪 r9 = r9.m3502(r4, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AbstractC1881.m3503():androidx.compose.ui.platform.飘花落叶言子苏世哲兰楪");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [kotlin.coroutines.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r7v11, types: [T, androidx.compose.ui.platform.飘花落叶言子哲楪兰苏世] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.coroutines.飘花落叶言子楪苏世兰哲] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final AbstractC1372 m3504() {
        C1383 c1383;
        InterfaceC4360 interfaceC4360;
        InterfaceC4360 interfaceC4360Plus;
        C1376 c1376;
        int i;
        AbstractC1372 abstractC1372M3473 = this.f5401;
        if (abstractC1372M3473 == null) {
            abstractC1372M3473 = AbstractC1838.m3473(this);
            if (abstractC1372M3473 == null) {
                Object parent = getParent();
                while (abstractC1372M3473 == null && (parent instanceof View)) {
                    View view = (View) parent;
                    abstractC1372M3473 = AbstractC1838.m3473(view);
                    parent = AbstractC3933.m8314(view);
                }
            }
            if (abstractC1372M3473 != null) {
                AbstractC1372 abstractC1372 = (!(abstractC1372M3473 instanceof C1383) || ((Recomposer$State) ((C1383) abstractC1372M3473).f4004.getValue()).compareTo(Recomposer$State.ShuttingDown) > 0) ? abstractC1372M3473 : null;
                if (abstractC1372 != null) {
                    this.f5408 = new WeakReference(abstractC1372);
                }
            } else {
                abstractC1372M3473 = null;
            }
            if (abstractC1372M3473 == null) {
                WeakReference weakReference = this.f5408;
                if (weakReference == null || (abstractC1372M3473 = (AbstractC1372) weakReference.get()) == null || ((abstractC1372M3473 instanceof C1383) && ((Recomposer$State) ((C1383) abstractC1372M3473).f4004.getValue()).compareTo(Recomposer$State.ShuttingDown) <= 0)) {
                    abstractC1372M3473 = null;
                }
                if (abstractC1372M3473 == null) {
                    if (!isAttachedToWindow()) {
                        AbstractC7936.m13423("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object objM8314 = AbstractC3933.m8314(this);
                    View view2 = this;
                    while (objM8314 instanceof View) {
                        View view3 = (View) objM8314;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        objM8314 = view3.getParent();
                    }
                    AbstractC1372 abstractC1372M34732 = AbstractC1838.m3473(view2);
                    if (abstractC1372M34732 == null) {
                        ((C1846) AbstractC1847.f5353.get()).getClass();
                        InterfaceC4360 interfaceC43602 = EmptyCoroutineContext.INSTANCE;
                        if (interfaceC43602.get(C4356.f12936) == null || interfaceC43602.get(C1353.f3924) == null) {
                            InterfaceC5184 interfaceC5184 = C1822.f5302;
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                interfaceC4360 = (InterfaceC4360) C1822.f5302.getValue();
                            } else {
                                interfaceC4360 = (InterfaceC4360) C1822.f5301.get();
                                if (interfaceC4360 == null) {
                                    C5925.m11311("no AndroidUiDispatcher for this thread");
                                    return null;
                                }
                            }
                            interfaceC4360Plus = interfaceC4360.plus(interfaceC43602);
                        } else {
                            interfaceC4360Plus = interfaceC43602;
                        }
                        InterfaceC1304 interfaceC1304 = (InterfaceC1304) interfaceC4360Plus.get(C1353.f3924);
                        int i2 = 0;
                        if (interfaceC1304 != null) {
                            c1376 = new C1376(interfaceC1304);
                            C0734 c0734 = c1376.f3981;
                            synchronized (c0734.f2071) {
                                c0734.f2072 = false;
                            }
                        } else {
                            c1376 = null;
                        }
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        InterfaceC2126 interfaceC2126 = (InterfaceC2126) interfaceC4360Plus.get(C2119.f6263);
                        ?? r7 = interfaceC2126;
                        if (interfaceC2126 == null) {
                            ?? c1868 = new C1868(view2.getContext().getApplicationContext());
                            ref$ObjectRef.element = c1868;
                            r7 = c1868;
                        }
                        if (c1376 != null) {
                            interfaceC43602 = c1376;
                        }
                        InterfaceC4360 interfaceC4360Plus2 = interfaceC4360Plus.plus(interfaceC43602).plus(r7);
                        c1383 = new C1383(interfaceC4360Plus2);
                        synchronized (c1383.f3996) {
                            i = 1;
                            c1383.f4003 = true;
                        }
                        C5351 c5351M10489 = AbstractC5399.m10489(interfaceC4360Plus2);
                        InterfaceC2388 interfaceC2388M4529 = AbstractC2435.m4529(view2);
                        AbstractC2402 lifecycle = interfaceC2388M4529 != null ? interfaceC2388M4529.getLifecycle() : null;
                        if (lifecycle == null) {
                            AbstractC7936.m13422("ViewTreeLifecycleOwner not found from " + view2);
                            C4211.m8602();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1841(i2, view2, c1383));
                        lifecycle.mo4503(new C1843(c5351M10489, c1376, c1383, ref$ObjectRef));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, c1383);
                        C5467 c5467 = C5467.f15126;
                        Handler handler = view2.getHandler();
                        int i3 = AbstractC7200.f19212;
                        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1592(AbstractC5399.m10477(c5467, new C7201(handler, "windowRecomposer cleanup", false).f19213, null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(c1383, view2, null), 2), i));
                    } else {
                        if (!(abstractC1372M34732 instanceof C1383)) {
                            C5925.m11311("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        c1383 = (C1383) abstractC1372M34732;
                    }
                    C1383 c13832 = ((Recomposer$State) c1383.f4004.getValue()).compareTo(Recomposer$State.ShuttingDown) > 0 ? c1383 : null;
                    if (c13832 != null) {
                        this.f5408 = new WeakReference(c13832);
                    }
                    return c1383;
                }
            }
        }
        return abstractC1372M3473;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        m3497();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        m3497();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        m3497();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m3497();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m3497();
        super.addView(view, i, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
