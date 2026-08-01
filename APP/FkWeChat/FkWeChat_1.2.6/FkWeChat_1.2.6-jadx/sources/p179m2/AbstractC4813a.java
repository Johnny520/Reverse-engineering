package p179m2;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0482e0;
import androidx.compose.runtime.C0608v3;
import androidx.compose.runtime.InterfaceC0475d0;
import androidx.compose.runtime.InterfaceC0572r;
import java.lang.ref.WeakReference;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1067w;
import p057e1.AbstractC1984l;
import p165l1.AbstractC4510p;
import p166l2.InterfaceC4580q1;
import p172l8.C4700i0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: m2.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4813a extends ViewGroup {

    /* JADX INFO: renamed from: q */
    public WeakReference f14328q;

    /* JADX INFO: renamed from: r */
    public IBinder f14329r;

    /* JADX INFO: renamed from: s */
    public InterfaceC0475d0 f14330s;

    /* JADX INFO: renamed from: t */
    public AbstractC0482e0 f14331t;

    /* JADX INFO: renamed from: u */
    public InterfaceC0173a f14332u;

    /* JADX INFO: renamed from: v */
    public boolean f14333v;

    /* JADX INFO: renamed from: w */
    public boolean f14334w;

    /* JADX INFO: renamed from: x */
    public boolean f14335x;

    /* JADX INFO: renamed from: m2.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0188p {
        public a() {
            super(2);
        }

        /* JADX INFO: renamed from: a */
        public final void m19273a(InterfaceC0572r interfaceC0572r, int i10) {
            if (!interfaceC0572r.mo2144C((i10 & 3) != 2, i10 & 1)) {
                interfaceC0572r.mo2190z();
                return;
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-656146368, i10, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:264)");
            }
            AbstractC4813a.this.mo19263b(interfaceC0572r, 0);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m19273a((InterfaceC0572r) obj, ((Number) obj2).intValue());
            return C4700i0.f13910a;
        }
    }

    public AbstractC4813a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.f14332u = InterfaceC4842f3.f14394a.m19347a().mo19346a(this);
    }

    private final void setParentContext(AbstractC0482e0 abstractC0482e0) {
        if (this.f14331t != abstractC0482e0) {
            this.f14331t = abstractC0482e0;
            if (abstractC0482e0 != null) {
                this.f14328q = null;
            }
            InterfaceC0475d0 interfaceC0475d0 = this.f14330s;
            if (interfaceC0475d0 != null) {
                interfaceC0475d0.mo1588a();
                this.f14330s = null;
                if (isAttachedToWindow()) {
                    m19268g();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f14329r != iBinder) {
            this.f14329r = iBinder;
            this.f14328q = null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        m19265d();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        m19265d();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo19263b(InterfaceC0572r interfaceC0572r, int i10);

    /* JADX INFO: renamed from: c */
    public final AbstractC0482e0 m19264c(AbstractC0482e0 abstractC0482e0) {
        AbstractC0482e0 abstractC0482e02 = m19271j(abstractC0482e0) ? abstractC0482e0 : null;
        if (abstractC0482e02 != null) {
            this.f14328q = new WeakReference(abstractC0482e02);
        }
        return abstractC0482e0;
    }

    /* JADX INFO: renamed from: d */
    public final void m19265d() {
        if (this.f14334w) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX INFO: renamed from: e */
    public final void m19266e() {
        if (this.f14331t != null || isAttachedToWindow()) {
            m19268g();
        } else {
            C10010p0.m38820a("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m19267f() {
        InterfaceC0475d0 interfaceC0475d0 = this.f14330s;
        if (interfaceC0475d0 != null) {
            interfaceC0475d0.mo1588a();
        }
        this.f14330s = null;
        requestLayout();
    }

    /* JADX INFO: renamed from: g */
    public final void m19268g() {
        if (this.f14330s == null) {
            try {
                this.f14334w = true;
                this.f14330s = AbstractC4927w3.m19912c(this, m19272k(), AbstractC1984l.m7162b(-656146368, true, new a()));
            } finally {
                this.f14334w = false;
            }
        }
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m38863getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(AbstractC4510p.f13106H);
        C4815a1 c4815a1 = tag instanceof C4815a1 ? (C4815a1) tag : null;
        return c4815a1 != null ? c4815a1.m19280g() : C4815a1.f14338b.m19282b();
    }

    public final boolean getHasComposition() {
        return this.f14330s != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f14333v;
    }

    /* JADX INFO: renamed from: h */
    public void mo19269h(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo19270i(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.f14335x || super.isTransitionGroup();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m19271j(AbstractC0482e0 abstractC0482e0) {
        return !(abstractC0482e0 instanceof C0608v3) || ((C0608v3.d) ((C0608v3) abstractC0482e0).m2303q0().getValue()).compareTo(C0608v3.d.f1666r) > 0;
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC0482e0 m19272k() {
        AbstractC0482e0 abstractC0482e0;
        AbstractC0482e0 abstractC0482e0M19264c = this.f14331t;
        if (abstractC0482e0M19264c == null) {
            AbstractC0482e0 abstractC0482e0M19703d = AbstractC4912t3.m19703d(this);
            AbstractC0482e0 abstractC0482e02 = null;
            abstractC0482e0M19264c = abstractC0482e0M19703d != null ? m19264c(abstractC0482e0M19703d) : null;
            if (abstractC0482e0M19264c == null) {
                WeakReference weakReference = this.f14328q;
                if (weakReference != null && (abstractC0482e0 = (AbstractC0482e0) weakReference.get()) != null && m19271j(abstractC0482e0)) {
                    abstractC0482e02 = abstractC0482e0;
                }
                return abstractC0482e02 == null ? m19264c(AbstractC4912t3.m19707h(this)) : abstractC0482e02;
            }
        }
        return abstractC0482e0M19264c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            m19268g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mo19269h(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        m19268g();
        mo19270i(i10, i11);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i10);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m38864setAutoClearFocusBehavior17tfJxM(int i10) {
        setTag(AbstractC4510p.f13106H, C4815a1.m19275b(i10));
    }

    public final void setParentCompositionContext(AbstractC0482e0 abstractC0482e0) {
        setParentContext(abstractC0482e0);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.f14333v = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((InterfaceC4580q1) childAt).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.f14335x = true;
    }

    public final void setViewCompositionStrategy(InterfaceC4842f3 interfaceC4842f3) {
        InterfaceC0173a interfaceC0173a = this.f14332u;
        if (interfaceC0173a != null) {
            interfaceC0173a.invoke();
        }
        this.f14332u = interfaceC4842f3.mo19346a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        m19265d();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        m19265d();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        m19265d();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m19265d();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        m19265d();
        super.addView(view, i10, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public /* synthetic */ AbstractC4813a(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1043k abstractC1043k) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
