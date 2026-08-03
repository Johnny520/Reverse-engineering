package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.C0983R;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.view.menu.InterfaceC1002j;
import java.util.WeakHashMap;
import p000a.C0181Jg;
import p000a.C0199Kg;
import p000a.C0230Mb;
import p000a.C0479a9;
import p000a.C0696lh;
import p000a.C0734nh;
import p000a.C0866ug;
import p000a.InterfaceC0194Kb;
import p000a.InterfaceC0212Lb;
import p000a.InterfaceC0223M4;
import p000a.InterfaceC0241N4;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0223M4, InterfaceC0194Kb, InterfaceC0212Lb {

    /* JADX INFO: renamed from: C */
    public static final int[] f3900C = {C0983R.attr.actionBarSize, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: D */
    public static final C0734nh f3901D;

    /* JADX INFO: renamed from: E */
    public static final Rect f3902E;

    /* JADX INFO: renamed from: A */
    public final C0230Mb f3903A;

    /* JADX INFO: renamed from: B */
    public final C1012f f3904B;

    /* JADX INFO: renamed from: a */
    public int f3905a;

    /* JADX INFO: renamed from: b */
    public int f3906b;

    /* JADX INFO: renamed from: c */
    public ContentFrameLayout f3907c;

    /* JADX INFO: renamed from: d */
    public ActionBarContainer f3908d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0241N4 f3909e;

    /* JADX INFO: renamed from: f */
    public Drawable f3910f;

    /* JADX INFO: renamed from: g */
    public boolean f3911g;

    /* JADX INFO: renamed from: h */
    public boolean f3912h;

    /* JADX INFO: renamed from: i */
    public boolean f3913i;

    /* JADX INFO: renamed from: j */
    public boolean f3914j;

    /* JADX INFO: renamed from: k */
    public int f3915k;

    /* JADX INFO: renamed from: l */
    public int f3916l;

    /* JADX INFO: renamed from: m */
    public final Rect f3917m;

    /* JADX INFO: renamed from: n */
    public final Rect f3918n;

    /* JADX INFO: renamed from: o */
    public final Rect f3919o;

    /* JADX INFO: renamed from: p */
    public final Rect f3920p;

    /* JADX INFO: renamed from: q */
    public C0734nh f3921q;

    /* JADX INFO: renamed from: r */
    public C0734nh f3922r;

    /* JADX INFO: renamed from: s */
    public C0734nh f3923s;

    /* JADX INFO: renamed from: t */
    public C0734nh f3924t;

    /* JADX INFO: renamed from: u */
    public InterfaceC1010d f3925u;

    /* JADX INFO: renamed from: v */
    public OverScroller f3926v;

    /* JADX INFO: renamed from: w */
    public ViewPropertyAnimator f3927w;

    /* JADX INFO: renamed from: x */
    public final C1007a f3928x;

    /* JADX INFO: renamed from: y */
    public final RunnableC1008b f3929y;

    /* JADX INFO: renamed from: z */
    public final RunnableC1009c f3930z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C1007a extends AnimatorListenerAdapter {
        public C1007a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3927w = null;
            actionBarOverlayLayout.f3914j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3927w = null;
            actionBarOverlayLayout.f3914j = false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class RunnableC1008b implements Runnable {
        public RunnableC1008b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.m2352q();
            actionBarOverlayLayout.f3927w = actionBarOverlayLayout.f3908d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f3928x);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class RunnableC1009c implements Runnable {
        public RunnableC1009c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.m2352q();
            actionBarOverlayLayout.f3927w = actionBarOverlayLayout.f3908d.animate().translationY(-actionBarOverlayLayout.f3908d.getHeight()).setListener(actionBarOverlayLayout.f3928x);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface InterfaceC1010d {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C1011e extends ViewGroup.MarginLayoutParams {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$f */
    public static final class C1012f extends View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        C0734nh.e dVar = i >= 30 ? new C0734nh.d() : i >= 29 ? new C0734nh.c() : new C0734nh.b();
        dVar.mo1699g(C0479a9.m1165b(0, 1, 0, 1));
        f3901D = dVar.mo1697b();
        f3902E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3906b = 0;
        this.f3917m = new Rect();
        this.f3918n = new Rect();
        this.f3919o = new Rect();
        this.f3920p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C0734nh c0734nh = C0734nh.f2856b;
        this.f3921q = c0734nh;
        this.f3922r = c0734nh;
        this.f3923s = c0734nh;
        this.f3924t = c0734nh;
        this.f3928x = new C1007a();
        this.f3929y = new RunnableC1008b();
        this.f3930z = new RunnableC1009c();
        m2353r(context);
        this.f3903A = new C0230Mb();
        C1012f c1012f = new C1012f(context);
        c1012f.setWillNotDraw(true);
        this.f3904B = c1012f;
        addView(c1012f);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m2351p(View view, Rect rect, boolean z) {
        boolean z2;
        C1011e c1011e = (C1011e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c1011e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c1011e).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c1011e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c1011e).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c1011e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c1011e).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c1011e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c1011e).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // p000a.InterfaceC0223M4
    /* JADX INFO: renamed from: a */
    public final boolean mo607a() {
        m2354s();
        return this.f3909e.mo663a();
    }

    @Override // p000a.InterfaceC0223M4
    /* JADX INFO: renamed from: b */
    public final boolean mo608b() {
        m2354s();
        return this.f3909e.mo664b();
    }

    @Override // p000a.InterfaceC0194Kb
    /* JADX INFO: renamed from: c */
    public final void mo528c(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1011e;
    }

    @Override // p000a.InterfaceC0223M4
    /* JADX INFO: renamed from: d */
    public final boolean mo609d() {
        m2354s();
        return this.f3909e.mo666d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f3910f != null) {
            if (this.f3908d.getVisibility() == 0) {
                translationY = (int) (this.f3908d.getTranslationY() + this.f3908d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f3910f.setBounds(0, translationY, getWidth(), this.f3910f.getIntrinsicHeight() + translationY);
            this.f3910f.draw(canvas);
        }
    }

    @Override // p000a.InterfaceC0223M4
    /* JADX INFO: renamed from: e */
    public final void mo610e(C0998f c0998f, InterfaceC1002j.a aVar) {
        m2354s();
        this.f3909e.mo667e(c0998f, aVar);
    }

    @Override // p000a.InterfaceC0223M4
    /* JADX INFO: renamed from: f */
    public final boolean mo611f() {
        m2354s();
        return this.f3909e.mo668f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // p000a.InterfaceC0223M4
    /* JADX INFO: renamed from: g */
    public final void mo612g() {
        m2354s();
        this.f3909e.mo669g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1011e(-1, -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1011e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f3908d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0230Mb c0230Mb = this.f3903A;
        return c0230Mb.f768b | c0230Mb.f767a;
    }

    public CharSequence getTitle() {
        m2354s();
        return this.f3909e.getTitle();
    }

    @Override // p000a.InterfaceC0223M4
    /* JADX INFO: renamed from: h */
    public final boolean mo613h() {
        m2354s();
        return this.f3909e.mo670h();
    }

    @Override // p000a.InterfaceC0194Kb
    /* JADX INFO: renamed from: i */
    public final void mo529i(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p000a.InterfaceC0194Kb
    /* JADX INFO: renamed from: j */
    public final void mo530j(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // p000a.InterfaceC0223M4
    /* JADX INFO: renamed from: k */
    public final void mo614k(int i) {
        m2354s();
        if (i == 2) {
            this.f3909e.mo677o();
        } else if (i == 5) {
            this.f3909e.mo679q();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // p000a.InterfaceC0223M4
    /* JADX INFO: renamed from: l */
    public final void mo615l() {
        m2354s();
        this.f3909e.mo671i();
    }

    @Override // p000a.InterfaceC0212Lb
    /* JADX INFO: renamed from: m */
    public final void mo591m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo531n(view, i, i2, i3, i4, i5);
    }

    @Override // p000a.InterfaceC0194Kb
    /* JADX INFO: renamed from: n */
    public final void mo531n(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p000a.InterfaceC0194Kb
    /* JADX INFO: renamed from: o */
    public final boolean mo532o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m2354s();
        C0734nh c0734nhM1690g = C0734nh.m1690g(this, windowInsets);
        boolean zM2351p = m2351p(this.f3908d, new Rect(c0734nhM1690g.m1692b(), c0734nhM1690g.m1694d(), c0734nhM1690g.m1693c(), c0734nhM1690g.m1691a()), false);
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        Rect rect = this.f3917m;
        C0866ug.d.m2010b(this, c0734nhM1690g, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        C0734nh.k kVar = c0734nhM1690g.f2857a;
        C0734nh c0734nhMo1712l = kVar.mo1712l(i, i2, i3, i4);
        this.f3921q = c0734nhMo1712l;
        boolean z = true;
        if (!this.f3922r.equals(c0734nhMo1712l)) {
            this.f3922r = this.f3921q;
            zM2351p = true;
        }
        Rect rect2 = this.f3918n;
        if (rect2.equals(rect)) {
            z = zM2351p;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return kVar.mo1723a().f2857a.mo1719c().f2857a.mo1718b().m1695f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m2353r(getContext());
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        C0866ug.c.m2008c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2352q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C1011e c1011e = (C1011e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c1011e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c1011e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        m2354s();
        measureChildWithMargins(this.f3908d, i, 0, i2, 0);
        C1011e c1011e = (C1011e) this.f3908d.getLayoutParams();
        int iMax = Math.max(0, this.f3908d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1011e).leftMargin + ((ViewGroup.MarginLayoutParams) c1011e).rightMargin);
        int iMax2 = Math.max(0, this.f3908d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1011e).topMargin + ((ViewGroup.MarginLayoutParams) c1011e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f3908d.getMeasuredState());
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f3905a;
            if (this.f3912h && this.f3908d.getTabContainer() != null) {
                measuredHeight += this.f3905a;
            }
        } else {
            measuredHeight = this.f3908d.getVisibility() != 8 ? this.f3908d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f3917m;
        Rect rect2 = this.f3919o;
        rect2.set(rect);
        this.f3923s = this.f3921q;
        if (this.f3911g || z) {
            C0479a9 c0479a9M1165b = C0479a9.m1165b(this.f3923s.m1692b(), this.f3923s.m1694d() + measuredHeight, this.f3923s.m1693c(), this.f3923s.m1691a());
            C0734nh c0734nh = this.f3923s;
            int i3 = Build.VERSION.SDK_INT;
            C0734nh.e dVar = i3 >= 30 ? new C0734nh.d(c0734nh) : i3 >= 29 ? new C0734nh.c(c0734nh) : new C0734nh.b(c0734nh);
            dVar.mo1699g(c0479a9M1165b);
            this.f3923s = dVar.mo1697b();
        } else {
            C1012f c1012f = this.f3904B;
            C0734nh c0734nh2 = f3901D;
            Rect rect3 = this.f3920p;
            C0866ug.d.m2010b(c1012f, c0734nh2, rect3);
            if (!rect3.equals(f3902E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f3923s = this.f3923s.f2857a.mo1712l(0, measuredHeight, 0, 0);
            }
        }
        m2351p(this.f3907c, rect2, true);
        if (!this.f3924t.equals(this.f3923s)) {
            C0734nh c0734nh3 = this.f3923s;
            this.f3924t = c0734nh3;
            ContentFrameLayout contentFrameLayout = this.f3907c;
            WindowInsets windowInsetsM1695f = c0734nh3.m1695f();
            if (windowInsetsM1695f != null) {
                WindowInsets windowInsetsM2006a = C0866ug.c.m2006a(contentFrameLayout, windowInsetsM1695f);
                if (!windowInsetsM2006a.equals(windowInsetsM1695f)) {
                    C0734nh.m1690g(contentFrameLayout, windowInsetsM2006a);
                }
            }
        }
        measureChildWithMargins(this.f3907c, i, 0, i2, 0);
        C1011e c1011e2 = (C1011e) this.f3907c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f3907c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1011e2).leftMargin + ((ViewGroup.MarginLayoutParams) c1011e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f3907c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1011e2).topMargin + ((ViewGroup.MarginLayoutParams) c1011e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f3907c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f3913i || !z) {
            return false;
        }
        this.f3926v.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f3926v.getFinalY() > this.f3908d.getHeight()) {
            m2352q();
            this.f3930z.run();
        } else {
            m2352q();
            this.f3929y.run();
        }
        this.f3914j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f3915k + i2;
        this.f3915k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C0696lh c0696lh;
        C0199Kg c0199Kg;
        this.f3903A.f767a = i;
        this.f3915k = getActionBarHideOffset();
        m2352q();
        InterfaceC1010d interfaceC1010d = this.f3925u;
        if (interfaceC1010d == null || (c0199Kg = (c0696lh = (C0696lh) interfaceC1010d).f2621s) == null) {
            return;
        }
        c0199Kg.m551a();
        c0696lh.f2621s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f3908d.getVisibility() != 0) {
            return false;
        }
        return this.f3913i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f3913i || this.f3914j) {
            return;
        }
        if (this.f3915k <= this.f3908d.getHeight()) {
            m2352q();
            postDelayed(this.f3929y, 600L);
        } else {
            m2352q();
            postDelayed(this.f3930z, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m2354s();
        int i2 = this.f3916l ^ i;
        this.f3916l = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC1010d interfaceC1010d = this.f3925u;
        if (interfaceC1010d != null) {
            C0696lh c0696lh = (C0696lh) interfaceC1010d;
            c0696lh.f2617o = !z2;
            if (z || !z2) {
                if (c0696lh.f2618p) {
                    c0696lh.f2618p = false;
                    c0696lh.m1587s(true);
                }
            } else if (!c0696lh.f2618p) {
                c0696lh.f2618p = true;
                c0696lh.m1587s(true);
            }
        }
        if ((i2 & 256) == 0 || this.f3925u == null) {
            return;
        }
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        C0866ug.c.m2008c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f3906b = i;
        InterfaceC1010d interfaceC1010d = this.f3925u;
        if (interfaceC1010d != null) {
            ((C0696lh) interfaceC1010d).f2616n = i;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2352q() {
        removeCallbacks(this.f3929y);
        removeCallbacks(this.f3930z);
        ViewPropertyAnimator viewPropertyAnimator = this.f3927w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2353r(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f3900C);
        this.f3905a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f3910f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f3926v = new OverScroller(context);
    }

    /* JADX INFO: renamed from: s */
    public final void m2354s() {
        InterfaceC0241N4 wrapper;
        if (this.f3907c == null) {
            this.f3907c = (ContentFrameLayout) findViewById(C0983R.id.action_bar_activity_content);
            this.f3908d = (ActionBarContainer) findViewById(C0983R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(C0983R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0241N4) {
                wrapper = (InterfaceC0241N4) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f3909e = wrapper;
        }
    }

    public void setActionBarHideOffset(int i) {
        m2352q();
        this.f3908d.setTranslationY(-Math.max(0, Math.min(i, this.f3908d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1010d interfaceC1010d) {
        this.f3925u = interfaceC1010d;
        if (getWindowToken() != null) {
            ((C0696lh) this.f3925u).f2616n = this.f3906b;
            int i = this.f3916l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                C0866ug.c.m2008c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f3912h = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f3913i) {
            this.f3913i = z;
            if (z) {
                return;
            }
            m2352q();
            setActionBarHideOffset(0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIcon(int i) {
        m2354s();
        this.f3909e.setIcon(i);
    }

    public void setLogo(int i) {
        m2354s();
        this.f3909e.mo676n(i);
    }

    public void setOverlayMode(boolean z) {
        this.f3911g = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // p000a.InterfaceC0223M4
    public void setWindowCallback(Window.Callback callback) {
        m2354s();
        this.f3909e.setWindowCallback(callback);
    }

    @Override // p000a.InterfaceC0223M4
    public void setWindowTitle(CharSequence charSequence) {
        m2354s();
        this.f3909e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1011e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m2354s();
        this.f3909e.setIcon(drawable);
    }
}
