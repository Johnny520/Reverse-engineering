package Yue;

import Yue.C3055;
import Yue.C6863;
import Yue.C8301;
import Yue.InterfaceC3070;
import Yue.InterfaceC7144;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4537 extends ViewGroup implements InterfaceC6575 {

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final String f9707 = "DrawerLayout";

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final int f9709 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final int f9710 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final int f9711 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final int f9712 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final int f9713 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final int f9714 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final int f9715 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final int f9716 = 64;

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final int f9717 = -1728053248;

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static final int f9718 = 160;

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static final int f9719 = 400;

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static final boolean f9720 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final boolean f9721 = true;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final float f9722 = 1.0f;

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static final boolean f9724;

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static final boolean f9725;

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static final String f9726 = "androidx.drawerlayout.widget.DrawerLayout";

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static boolean f9727;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final C4539 f9728;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public float f9729;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f9730;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f9731;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public float f9732;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Paint f9733;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final C8301 f9734;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final C8301 f9735;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final C4544 f9736;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final C4544 f9737;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int f9738;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean f9739;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean f9740;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public int f9741;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public int f9742;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public int f9743;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public int f9744;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean f9745;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    @InterfaceC6490
    public InterfaceC4540 f9746;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public List<InterfaceC4540> f9747;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public float f9748;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public float f9749;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public Drawable f9750;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public Drawable f9751;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public Drawable f9752;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public CharSequence f9753;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public CharSequence f9754;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public Object f9755;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public boolean f9756;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Drawable f9757;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Drawable f9758;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public Drawable f9759;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public Drawable f9760;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final ArrayList<View> f9761;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public Rect f9762;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public Matrix f9763;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public final InterfaceC3070 f9764;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final int[] f9708 = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static final int[] f9723 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۢ$ۥ */
    public class C0431 implements InterfaceC3070 {
        public C0431() {
        }

        @Override // Yue.InterfaceC3070
        public boolean perform(@InterfaceC6391 View view, @InterfaceC6490 InterfaceC3070.AbstractC0039 abstractC0039) {
            if (!C4537.this.m13336(view) || C4537.this.m13327(view) == 2) {
                return false;
            }
            C4537.this.m13315(view);
            return true;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۢ$ۥ۟ */
    public class ViewOnApplyWindowInsetsListenerC0432 implements View.OnApplyWindowInsetsListener {
        public ViewOnApplyWindowInsetsListenerC0432() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((C4537) view).m13351(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۢ$ۥ۟۟, reason: contains not printable characters */
    public class C4538 extends C3024 {

        /* JADX INFO: renamed from: ۥ */
        public final Rect f953 = new Rect();

        public C4538() {
        }

        @Override // Yue.C3024
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewM13325 = C4537.this.m13325();
            if (viewM13325 == null) {
                return true;
            }
            CharSequence charSequenceM13328 = C4537.this.m13328(C4537.this.m13329(viewM13325));
            if (charSequenceM13328 == null) {
                return true;
            }
            text.add(charSequenceM13328);
            return true;
        }

        @Override // Yue.C3024
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(C4537.f9726);
        }

        @Override // Yue.C3024
        public void onInitializeAccessibilityNodeInfo(View view, C3055 c3055) {
            if (C4537.f9724) {
                super.onInitializeAccessibilityNodeInfo(view, c3055);
            } else {
                C3055 c3055M5947 = C3055.m5947(c3055);
                super.onInitializeAccessibilityNodeInfo(view, c3055M5947);
                c3055.m6100(view);
                Object objM27368 = C8273.m27368(view);
                if (objM27368 instanceof View) {
                    c3055.m6089((View) objM27368);
                }
                m13362(c3055, c3055M5947);
                c3055M5947.m6041();
                m13361(c3055, (ViewGroup) view);
            }
            c3055.m6057(C4537.f9726);
            c3055.m6070(false);
            c3055.m6071(false);
            c3055.m6043(C3055.C0034.f4508);
            c3055.m6043(C3055.C0034.f4509);
        }

        @Override // Yue.C3024
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (C4537.f9724 || C4537.m13311(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m13361(C3055 c3055, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (C4537.m13311(childAt)) {
                    c3055.m5952(childAt);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m13362(C3055 c3055, C3055 c30552) {
            Rect rect = this.f953;
            c30552.m5968(rect);
            c3055.m6052(rect);
            c3055.m6115(c30552.m6038());
            c3055.m6087(c30552.m5992());
            c3055.m6057(c30552.m5973());
            c3055.m6062(c30552.m5977());
            c3055.m6068(c30552.m6023());
            c3055.m6071(c30552.m6025());
            c3055.m6048(c30552.m6015());
            c3055.m6098(c30552.m6034());
            c3055.m118(c30552.m5964());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۢ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C4539 extends C3024 {
        @Override // Yue.C3024
        public void onInitializeAccessibilityNodeInfo(View view, C3055 c3055) {
            super.onInitializeAccessibilityNodeInfo(view, c3055);
            if (C4537.m13311(view)) {
                return;
            }
            c3055.m6089(null);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۢ$ۥ۟۟۟۟, reason: contains not printable characters */
    public interface InterfaceC4540 {
        void onDrawerClosed(@InterfaceC6391 View view);

        void onDrawerOpened(@InterfaceC6391 View view);

        void onDrawerSlide(@InterfaceC6391 View view, float f);

        void onDrawerStateChanged(int i);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۢ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static abstract class AbstractC4543 implements InterfaceC4540 {
        @Override // Yue.C4537.InterfaceC4540
        public void onDrawerClosed(View view) {
        }

        @Override // Yue.C4537.InterfaceC4540
        public void onDrawerOpened(View view) {
        }

        @Override // Yue.C4537.InterfaceC4540
        public void onDrawerSlide(View view, float f) {
        }

        @Override // Yue.C4537.InterfaceC4540
        public void onDrawerStateChanged(int i) {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۢ$ۥۣ۟۟۟, reason: contains not printable characters */
    public class C4544 extends C8301.AbstractC8302 {

        /* JADX INFO: renamed from: ۥ */
        public final int f957;

        /* JADX INFO: renamed from: ۥ۟ */
        public C8301 f958;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Runnable f9775 = new RunnableC0434();

        /* JADX INFO: renamed from: Yue.ۥ۠۠ۢ$ۥۣ۟۟۟$ۥ */
        public class RunnableC0434 implements Runnable {
            public RunnableC0434() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4544.this.m1480();
            }
        }

        public C4544(int i) {
            this.f957 = i;
        }

        @Override // Yue.C8301.AbstractC8302
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            if (C4537.this.m13312(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = C4537.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // Yue.C8301.AbstractC8302
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // Yue.C8301.AbstractC8302
        public int getViewHorizontalDragRange(View view) {
            if (C4537.this.m13337(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // Yue.C8301.AbstractC8302
        public void onEdgeDragStarted(int i, int i2) {
            View viewM13323 = (i & 1) == 1 ? C4537.this.m13323(3) : C4537.this.m13323(5);
            if (viewM13323 == null || C4537.this.m13327(viewM13323) != 0) {
                return;
            }
            this.f958.m27607(viewM13323, i2);
        }

        @Override // Yue.C8301.AbstractC8302
        public boolean onEdgeLock(int i) {
            return false;
        }

        @Override // Yue.C8301.AbstractC8302
        public void onEdgeTouched(int i, int i2) {
            C4537.this.postDelayed(this.f9775, 160L);
        }

        @Override // Yue.C8301.AbstractC8302
        public void onViewCaptured(View view, int i) {
            ((C4541) view.getLayoutParams()).f9768 = false;
            m1479();
        }

        @Override // Yue.C8301.AbstractC8302
        public void onViewDragStateChanged(int i) {
            C4537.this.m13360(i, this.f958.m27627());
        }

        @Override // Yue.C8301.AbstractC8302
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width = (C4537.this.m13312(view, 3) ? i + r3 : C4537.this.getWidth() - i) / view.getWidth();
            C4537.this.m13357(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            C4537.this.invalidate();
        }

        @Override // Yue.C8301.AbstractC8302
        public void onViewReleased(View view, float f, float f2) {
            int i;
            float fM13330 = C4537.this.m13330(view);
            int width = view.getWidth();
            if (C4537.this.m13312(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && fM13330 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = C4537.this.getWidth();
                if (f < 0.0f || (f == 0.0f && fM13330 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f958.m27649(i, view.getTop());
            C4537.this.invalidate();
        }

        @Override // Yue.C8301.AbstractC8302
        public boolean tryCaptureView(View view, int i) {
            return C4537.this.m13337(view) && C4537.this.m13312(view, this.f957) && C4537.this.m13327(view) == 0;
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m1479() {
            View viewM13323 = C4537.this.m13323(this.f957 == 3 ? 5 : 3);
            if (viewM13323 != null) {
                C4537.this.m13315(viewM13323);
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m1480() {
            View viewM13323;
            int width;
            int iM27629 = this.f958.m27629();
            boolean z = this.f957 == 3;
            if (z) {
                viewM13323 = C4537.this.m13323(3);
                width = (viewM13323 != null ? -viewM13323.getWidth() : 0) + iM27629;
            } else {
                viewM13323 = C4537.this.m13323(5);
                width = C4537.this.getWidth() - iM27629;
            }
            if (viewM13323 != null) {
                if (((!z || viewM13323.getLeft() >= width) && (z || viewM13323.getLeft() <= width)) || C4537.this.m13327(viewM13323) != 0) {
                    return;
                }
                C4541 c4541 = (C4541) viewM13323.getLayoutParams();
                this.f958.m27651(viewM13323, width, viewM13323.getTop());
                c4541.f9768 = true;
                C4537.this.invalidate();
                m1479();
                C4537.this.m1476();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m13364() {
            C4537.this.removeCallbacks(this.f9775);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m13365(C8301 c8301) {
            this.f958 = c8301;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f9724 = true;
        f9725 = true;
        f9727 = i >= 29;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4537(@InterfaceC6391 Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static String m13309(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static boolean m13310(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static boolean m13311(View view) {
        return (C8273.m27351(view) == 4 || C8273.m27351(view) == 2) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!m13337(childAt)) {
                this.f9761.add(childAt);
            } else if (m13336(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
        }
        if (!z) {
            int size = this.f9761.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.f9761.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.f9761.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m13324() != null || m13337(view)) {
            C8273.m27457(view, 4);
        } else {
            C8273.m27457(view, 1);
        }
        if (f9724) {
            return;
        }
        C8273.m27439(view, this.f9728);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C4541) && super.checkLayoutParams(layoutParams);
    }

    @Override // Yue.InterfaceC6575
    public void close() {
        m13313(C5194.f1338);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((C4541) getChildAt(i).getLayoutParams()).f956);
        }
        this.f9732 = fMax;
        boolean zM27618 = this.f9734.m27618(true);
        boolean zM276182 = this.f9735.m27618(true);
        if (zM27618 || zM276182) {
            C8273.m27425(this);
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f9732 <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (m13340(x, y, childAt) && !m13334(childAt) && m13322(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean zM13334 = m13334(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zM13334) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && m13310(childAt) && m13337(childAt) && childAt.getHeight() >= height) {
                    if (m13312(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.f9732;
        if (f > 0.0f && zM13334) {
            this.f9733.setColor((this.f9731 & C8273.f24691) | (((int) ((((-16777216) & r2) >>> 24) * f)) << 24));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.f9733);
        } else if (this.f9751 != null && m13312(view, 3)) {
            int intrinsicWidth = this.f9751.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f9734.m27629(), 1.0f));
            this.f9751.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f9751.setAlpha((int) (fMax * 255.0f));
            this.f9751.draw(canvas);
        } else if (this.f9752 != null && m13312(view, 5)) {
            int intrinsicWidth2 = this.f9752.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f9735.m27629(), 1.0f));
            this.f9752.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f9752.setAlpha((int) (fMax2 * 255.0f));
            this.f9752.draw(canvas);
        }
        return zDrawChild;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C4541(-1, -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4541 ? new C4541((C4541) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C4541((ViewGroup.MarginLayoutParams) layoutParams) : new C4541(layoutParams);
    }

    public float getDrawerElevation() {
        if (f9725) {
            return this.f9729;
        }
        return 0.0f;
    }

    @InterfaceC6490
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f9750;
    }

    @Override // Yue.InterfaceC6575
    public boolean isOpen() {
        return m13335(C5194.f1338);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9740 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9740 = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f9756 || this.f9750 == null) {
            return;
        }
        Object obj = this.f9755;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f9750.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f9750.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewM27623;
        int actionMasked = motionEvent.getActionMasked();
        boolean zM27650 = this.f9734.m27650(motionEvent) | this.f9735.m27650(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f9748 = x;
            this.f9749 = y;
            z = this.f9732 > 0.0f && (viewM27623 = this.f9734.m27623((int) x, (int) y)) != null && m13334(viewM27623);
            this.f9745 = false;
        } else if (actionMasked == 1) {
            m13318(true);
            this.f9745 = false;
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                }
            } else if (this.f9734.m27609(3)) {
                this.f9736.m13364();
                this.f9737.m13364();
            }
            z = false;
        }
        return zM27650 || z || m13332() || this.f9745;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m13333()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewM13325 = m13325();
        if (viewM13325 != null && m13327(viewM13325) == 0) {
            m13317();
        }
        return viewM13325 != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        boolean z2 = true;
        this.f9739 = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C4541 c4541 = (C4541) childAt.getLayoutParams();
                if (m13334(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) c4541).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) c4541).topMargin, childAt.getMeasuredWidth() + i8, ((ViewGroup.MarginLayoutParams) c4541).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m13312(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (c4541.f956 * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i6 - r11) / f3;
                        i5 = i6 - ((int) (c4541.f956 * f3));
                    }
                    boolean z3 = f != c4541.f956 ? z2 : false;
                    int i9 = c4541.f955 & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        int i12 = ((ViewGroup.MarginLayoutParams) c4541).topMargin;
                        if (i11 < i12) {
                            i11 = i12;
                        } else {
                            int i13 = i11 + measuredHeight;
                            int i14 = ((ViewGroup.MarginLayoutParams) c4541).bottomMargin;
                            if (i13 > i10 - i14) {
                                i11 = (i10 - i14) - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        int i15 = ((ViewGroup.MarginLayoutParams) c4541).topMargin;
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight + i15);
                    } else {
                        int i16 = i4 - i2;
                        childAt.layout(i5, (i16 - ((ViewGroup.MarginLayoutParams) c4541).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i16 - ((ViewGroup.MarginLayoutParams) c4541).bottomMargin);
                    }
                    if (z3) {
                        m13357(childAt, f);
                    }
                    int i17 = c4541.f956 > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i17) {
                        childAt.setVisibility(i17);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        if (f9727 && (rootWindowInsets = getRootWindowInsets()) != null) {
            C5450 c5450M28289 = C8472.m28276(rootWindowInsets).m28289();
            C8301 c8301 = this.f9734;
            c8301.m27646(Math.max(c8301.m27628(), c5450M28289.f1520));
            C8301 c83012 = this.f9735;
            c83012.m27646(Math.max(c83012.m27628(), c5450M28289.f13399));
        }
        this.f9739 = false;
        this.f9740 = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z = this.f9755 != null && C8273.m27350(this);
        int iM27356 = C8273.m27356(this);
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C4541 c4541 = (C4541) childAt.getLayoutParams();
                if (z) {
                    int iM15901 = C5194.m15901(c4541.f955, iM27356);
                    if (C8273.m27350(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f9755;
                        if (iM15901 == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iM15901 == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f9755;
                        if (iM15901 == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iM15901 == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) c4541).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) c4541).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) c4541).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) c4541).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m13334(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) c4541).leftMargin) - ((ViewGroup.MarginLayoutParams) c4541).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) c4541).topMargin) - ((ViewGroup.MarginLayoutParams) c4541).bottomMargin, 1073741824));
                } else {
                    if (!m13337(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f9725) {
                        float fM27347 = C8273.m27347(childAt);
                        float f = this.f9729;
                        if (fM27347 != f) {
                            C8273.m27453(childAt, f);
                        }
                    }
                    int iM13329 = m13329(childAt) & 7;
                    boolean z4 = iM13329 == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m13309(iM13329) + " but this " + f9707 + " already has a drawer view along that edge");
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f9730 + ((ViewGroup.MarginLayoutParams) c4541).leftMargin + ((ViewGroup.MarginLayoutParams) c4541).rightMargin, ((ViewGroup.MarginLayoutParams) c4541).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) c4541).topMargin + ((ViewGroup.MarginLayoutParams) c4541).bottomMargin, ((ViewGroup.MarginLayoutParams) c4541).height));
                }
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View viewM13323;
        if (!(parcelable instanceof C4542)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4542 c4542 = (C4542) parcelable;
        super.onRestoreInstanceState(c4542.getSuperState());
        int i = c4542.f9770;
        if (i != 0 && (viewM13323 = m13323(i)) != null) {
            m13345(viewM13323);
        }
        int i2 = c4542.f9771;
        if (i2 != 3) {
            m13352(i2, 3);
        }
        int i3 = c4542.f9772;
        if (i3 != 3) {
            m13352(i3, 5);
        }
        int i4 = c4542.f9773;
        if (i4 != 3) {
            m13352(i4, C5194.f1338);
        }
        int i5 = c4542.f9774;
        if (i5 != 3) {
            m13352(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        m13350();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C4542 c4542 = new C4542(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C4541 c4541 = (C4541) getChildAt(i).getLayoutParams();
            int i2 = c4541.f9769;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                c4542.f9770 = c4541.f955;
                break;
            }
        }
        c4542.f9771 = this.f9741;
        c4542.f9772 = this.f9742;
        c4542.f9773 = this.f9743;
        c4542.f9774 = this.f9744;
        return c4542;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View viewM13324;
        this.f9734.m27640(motionEvent);
        this.f9735.m27640(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z = false;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f9748 = x;
            this.f9749 = y;
            this.f9745 = false;
        } else if (action == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            View viewM27623 = this.f9734.m27623((int) x2, (int) y2);
            if (viewM27623 == null || !m13334(viewM27623)) {
                z = true;
                m13318(z);
            } else {
                float f = x2 - this.f9748;
                float f2 = y2 - this.f9749;
                int iM27632 = this.f9734.m27632();
                if ((f * f) + (f2 * f2) >= iM27632 * iM27632 || (viewM13324 = m13324()) == null || m13327(viewM13324) == 2) {
                }
                m13318(z);
            }
        } else if (action == 3) {
            m13318(true);
            this.f9745 = false;
        }
        return true;
    }

    @Override // Yue.InterfaceC6575
    public void open() {
        m13343(C5194.f1338);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m13318(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f9739) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.f9729 = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m13337(childAt)) {
                C8273.m27453(childAt, this.f9729);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC4540 interfaceC4540) {
        InterfaceC4540 interfaceC45402 = this.f9746;
        if (interfaceC45402 != null) {
            m13347(interfaceC45402);
        }
        if (interfaceC4540 != null) {
            m1475(interfaceC4540);
        }
        this.f9746 = interfaceC4540;
    }

    public void setDrawerLockMode(int i) {
        m13352(i, 3);
        m13352(i, 5);
    }

    public void setScrimColor(@InterfaceC3897 int i) {
        this.f9731 = i;
        invalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStatusBarBackground(@InterfaceC6490 Drawable drawable) {
        this.f9750 = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@InterfaceC3897 int i) {
        this.f9750 = new ColorDrawable(i);
        invalidate();
    }

    /* JADX INFO: renamed from: ۥ */
    public void m1475(@InterfaceC6391 InterfaceC4540 interfaceC4540) {
        if (interfaceC4540 == null) {
            return;
        }
        if (this.f9747 == null) {
            this.f9747 = new ArrayList();
        }
        this.f9747.add(interfaceC4540);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m1476() {
        if (this.f9745) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f9745 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m13312(View view, int i) {
        return (m13329(view) & i) == i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m13313(int i) {
        m13314(i, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m13314(int i, boolean z) {
        View viewM13323 = m13323(i);
        if (viewM13323 != null) {
            m13316(viewM13323, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m13309(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m13315(@InterfaceC6391 View view) {
        m13316(view, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m13316(@InterfaceC6391 View view, boolean z) {
        if (!m13337(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C4541 c4541 = (C4541) view.getLayoutParams();
        if (this.f9740) {
            c4541.f956 = 0.0f;
            c4541.f9769 = 0;
        } else if (z) {
            c4541.f9769 |= 4;
            if (m13312(view, 3)) {
                this.f9734.m27651(view, -view.getWidth(), view.getTop());
            } else {
                this.f9735.m27651(view, getWidth(), view.getTop());
            }
        } else {
            m13342(view, 0.0f);
            m13360(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m13317() {
        m13318(false);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m13318(boolean z) {
        int childCount = getChildCount();
        boolean zM27651 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C4541 c4541 = (C4541) childAt.getLayoutParams();
            if (m13337(childAt) && (!z || c4541.f9768)) {
                zM27651 |= m13312(childAt, 3) ? this.f9734.m27651(childAt, -childAt.getWidth(), childAt.getTop()) : this.f9735.m27651(childAt, getWidth(), childAt.getTop());
                c4541.f9768 = false;
            }
        }
        this.f9736.m13364();
        this.f9737.m13364();
        if (zM27651) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m13319(View view) {
        View rootView;
        C4541 c4541 = (C4541) view.getLayoutParams();
        if ((c4541.f9769 & 1) == 1) {
            c4541.f9769 = 0;
            List<InterfaceC4540> list = this.f9747;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f9747.get(size).onDrawerClosed(view);
                }
            }
            m13359(view, false);
            m13358(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m13320(View view) {
        C4541 c4541 = (C4541) view.getLayoutParams();
        if ((c4541.f9769 & 1) == 0) {
            c4541.f9769 = 1;
            List<InterfaceC4540> list = this.f9747;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f9747.get(size).onDrawerOpened(view);
                }
            }
            m13359(view, true);
            m13358(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m13321(View view, float f) {
        List<InterfaceC4540> list = this.f9747;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f9747.get(size).onDrawerSlide(view, f);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m13322(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventM13331 = m13331(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventM13331);
            motionEventM13331.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public View m13323(int i) {
        int iM15901 = C5194.m15901(i, C8273.m27356(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m13329(childAt) & 7) == iM15901) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public View m13324() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C4541) childAt.getLayoutParams()).f9769 & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public View m13325() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m13337(childAt) && m13339(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int m13326(int i) {
        int iM27356 = C8273.m27356(this);
        if (i == 3) {
            int i2 = this.f9741;
            if (i2 != 3) {
                return i2;
            }
            int i3 = iM27356 == 0 ? this.f9743 : this.f9744;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 5) {
            int i4 = this.f9742;
            if (i4 != 3) {
                return i4;
            }
            int i5 = iM27356 == 0 ? this.f9744 : this.f9743;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i == 8388611) {
            int i6 = this.f9743;
            if (i6 != 3) {
                return i6;
            }
            int i7 = iM27356 == 0 ? this.f9741 : this.f9742;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i8 = this.f9744;
        if (i8 != 3) {
            return i8;
        }
        int i9 = iM27356 == 0 ? this.f9742 : this.f9741;
        if (i9 != 3) {
            return i9;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int m13327(@InterfaceC6391 View view) {
        if (m13337(view)) {
            return m13326(((C4541) view.getLayoutParams()).f955);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public CharSequence m13328(int i) {
        int iM15901 = C5194.m15901(i, C8273.m27356(this));
        if (iM15901 == 3) {
            return this.f9753;
        }
        if (iM15901 == 5) {
            return this.f9754;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int m13329(View view) {
        return C5194.m15901(((C4541) view.getLayoutParams()).f955, C8273.m27356(this));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public float m13330(View view) {
        return ((C4541) view.getLayoutParams()).f956;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final MotionEvent m13331(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f9763 == null) {
                this.f9763 = new Matrix();
            }
            matrix.invert(this.f9763);
            motionEventObtain.transform(this.f9763);
        }
        return motionEventObtain;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final boolean m13332() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C4541) getChildAt(i).getLayoutParams()).f9768) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final boolean m13333() {
        return m13325() != null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean m13334(View view) {
        return ((C4541) view.getLayoutParams()).f955 == 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean m13335(int i) {
        View viewM13323 = m13323(i);
        if (viewM13323 != null) {
            return m13336(viewM13323);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean m13336(@InterfaceC6391 View view) {
        if (m13337(view)) {
            return (((C4541) view.getLayoutParams()).f9769 & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean m13337(View view) {
        int iM15901 = C5194.m15901(((C4541) view.getLayoutParams()).f955, C8273.m27356(view));
        return ((iM15901 & 3) == 0 && (iM15901 & 5) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean m13338(int i) {
        View viewM13323 = m13323(i);
        if (viewM13323 != null) {
            return m13339(viewM13323);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public boolean m13339(@InterfaceC6391 View view) {
        if (m13337(view)) {
            return ((C4541) view.getLayoutParams()).f956 > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final boolean m13340(float f, float f2, View view) {
        if (this.f9762 == null) {
            this.f9762 = new Rect();
        }
        view.getHitRect(this.f9762);
        return this.f9762.contains((int) f, (int) f2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m13341(Drawable drawable, int i) {
        if (drawable == null || !C4520.m13229(drawable)) {
            return;
        }
        C4520.m13234(drawable, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public void m13342(View view, float f) {
        float fM13330 = m13330(view);
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (fM13330 * width));
        if (!m13312(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m13357(view, f);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public void m13343(int i) {
        m13344(i, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public void m13344(int i, boolean z) {
        View viewM13323 = m13323(i);
        if (viewM13323 != null) {
            m13346(viewM13323, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m13309(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public void m13345(@InterfaceC6391 View view) {
        m13346(view, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public void m13346(@InterfaceC6391 View view, boolean z) {
        if (!m13337(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C4541 c4541 = (C4541) view.getLayoutParams();
        if (this.f9740) {
            c4541.f956 = 1.0f;
            c4541.f9769 = 1;
            m13359(view, true);
            m13358(view);
        } else if (z) {
            c4541.f9769 |= 2;
            if (m13312(view, 3)) {
                this.f9734.m27651(view, 0, view.getTop());
            } else {
                this.f9735.m27651(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            m13342(view, 1.0f);
            m13360(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public void m13347(@InterfaceC6391 InterfaceC4540 interfaceC4540) {
        List<InterfaceC4540> list;
        if (interfaceC4540 == null || (list = this.f9747) == null) {
            return;
        }
        list.remove(interfaceC4540);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final Drawable m13348() {
        int iM27356 = C8273.m27356(this);
        if (iM27356 == 0) {
            Drawable drawable = this.f9757;
            if (drawable != null) {
                m13341(drawable, iM27356);
                return this.f9757;
            }
        } else {
            Drawable drawable2 = this.f9758;
            if (drawable2 != null) {
                m13341(drawable2, iM27356);
                return this.f9758;
            }
        }
        return this.f9759;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final Drawable m13349() {
        int iM27356 = C8273.m27356(this);
        if (iM27356 == 0) {
            Drawable drawable = this.f9758;
            if (drawable != null) {
                m13341(drawable, iM27356);
                return this.f9758;
            }
        } else {
            Drawable drawable2 = this.f9757;
            if (drawable2 != null) {
                m13341(drawable2, iM27356);
                return this.f9757;
            }
        }
        return this.f9760;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final void m13350() {
        if (f9725) {
            return;
        }
        this.f9751 = m13348();
        this.f9752 = m13349();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void m13351(Object obj, boolean z) {
        this.f9755 = obj;
        this.f9756 = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public void m13352(int i, int i2) {
        View viewM13323;
        int iM15901 = C5194.m15901(i2, C8273.m27356(this));
        if (i2 == 3) {
            this.f9741 = i;
        } else if (i2 == 5) {
            this.f9742 = i;
        } else if (i2 == 8388611) {
            this.f9743 = i;
        } else if (i2 == 8388613) {
            this.f9744 = i;
        }
        if (i != 0) {
            (iM15901 == 3 ? this.f9734 : this.f9735).m27606();
        }
        if (i != 1) {
            if (i == 2 && (viewM13323 = m13323(iM15901)) != null) {
                m13345(viewM13323);
                return;
            }
            return;
        }
        View viewM133232 = m13323(iM15901);
        if (viewM133232 != null) {
            m13315(viewM133232);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m13353(int i, @InterfaceC6391 View view) {
        if (m13337(view)) {
            m13352(i, ((C4541) view.getLayoutParams()).f955);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m13354(@InterfaceC4525 int i, int i2) {
        m13355(C4187.m12065(getContext(), i), i2);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m13355(Drawable drawable, int i) {
        if (f9725) {
            return;
        }
        if ((i & C5194.f1338) == 8388611) {
            this.f9757 = drawable;
        } else if ((i & 8388613) == 8388613) {
            this.f9758 = drawable;
        } else if ((i & 3) == 3) {
            this.f9759 = drawable;
        } else if ((i & 5) != 5) {
            return;
        } else {
            this.f9760 = drawable;
        }
        m13350();
        invalidate();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m13356(int i, @InterfaceC6490 CharSequence charSequence) {
        int iM15901 = C5194.m15901(i, C8273.m27356(this));
        if (iM15901 == 3) {
            this.f9753 = charSequence;
        } else if (iM15901 == 5) {
            this.f9754 = charSequence;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m13357(View view, float f) {
        C4541 c4541 = (C4541) view.getLayoutParams();
        if (f == c4541.f956) {
            return;
        }
        c4541.f956 = f;
        m13321(view, f);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final void m13358(View view) {
        C3055.C0034 c0034 = C3055.C0034.f4528;
        C8273.m27429(view, c0034.m121());
        if (!m13336(view) || m13327(view) == 2) {
            return;
        }
        C8273.m27432(view, c0034, null, this.f9764);
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final void m13359(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || m13337(childAt)) && !(z && childAt == view)) {
                C8273.m27457(childAt, 4);
            } else {
                C8273.m27457(childAt, 1);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m13360(int i, View view) {
        int i2;
        int iM27633 = this.f9734.m27633();
        int iM276332 = this.f9735.m27633();
        if (iM27633 == 1 || iM276332 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (iM27633 != 2 && iM276332 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((C4541) view.getLayoutParams()).f956;
            if (f == 0.0f) {
                m13319(view);
            } else if (f == 1.0f) {
                m13320(view);
            }
        }
        if (i2 != this.f9738) {
            this.f9738 = i2;
            List<InterfaceC4540> list = this.f9747;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f9747.get(size).onDrawerStateChanged(i2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4537(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C6863.C1101.f2376);
    }

    public C4537(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9728 = new C4539();
        this.f9731 = f9717;
        this.f9733 = new Paint();
        this.f9740 = true;
        this.f9741 = 3;
        this.f9742 = 3;
        this.f9743 = 3;
        this.f9744 = 3;
        this.f9757 = null;
        this.f9758 = null;
        this.f9759 = null;
        this.f9760 = null;
        this.f9764 = new C0431();
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f9730 = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C4544 c4544 = new C4544(3);
        this.f9736 = c4544;
        C4544 c45442 = new C4544(5);
        this.f9737 = c45442;
        C8301 c8301M27604 = C8301.m27604(this, 1.0f, c4544);
        this.f9734 = c8301M27604;
        c8301M27604.m27647(1);
        c8301M27604.m27648(f2);
        c4544.m13365(c8301M27604);
        C8301 c8301M276042 = C8301.m27604(this, 1.0f, c45442);
        this.f9735 = c8301M276042;
        c8301M276042.m27647(2);
        c8301M276042.m27648(f2);
        c45442.m13365(c8301M276042);
        setFocusableInTouchMode(true);
        C8273.m27457(this, 1);
        C8273.m27439(this, new C4538());
        setMotionEventSplittingEnabled(false);
        if (C8273.m27350(this)) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0432());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f9708);
            try {
                this.f9750 = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C6863.C6871.f18051, i, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(C6863.C6871.f18052)) {
                this.f9729 = typedArrayObtainStyledAttributes2.getDimension(C6863.C6871.f18052, 0.0f);
            } else {
                this.f9729 = getResources().getDimension(C6863.C6864.f17946);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f9761 = new ArrayList<>();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setStatusBarBackground(int i) {
        this.f9750 = i != 0 ? C4187.m12065(getContext(), i) : null;
        invalidate();
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۢ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C4541 extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f9765 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f9766 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f9767 = 4;

        /* JADX INFO: renamed from: ۥ */
        public int f955;

        /* JADX INFO: renamed from: ۥ۟ */
        public float f956;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f9768;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f9769;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C4541(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f955 = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4537.f9723);
            this.f955 = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C4541(int i, int i2) {
            super(i, i2);
            this.f955 = 0;
        }

        public C4541(int i, int i2, int i3) {
            this(i, i2);
            this.f955 = i3;
        }

        public C4541(@InterfaceC6391 C4541 c4541) {
            super((ViewGroup.MarginLayoutParams) c4541);
            this.f955 = 0;
            this.f955 = c4541.f955;
        }

        public C4541(@InterfaceC6391 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f955 = 0;
        }

        public C4541(@InterfaceC6391 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f955 = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4541(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۢ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C4542 extends AbstractC2967 {
        public static final Parcelable.Creator<C4542> CREATOR = new C0433();

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f9770;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f9771;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f9772;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f9773;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f9774;

        /* JADX INFO: renamed from: Yue.ۥ۠۠ۢ$ۥ۟۟۟ۡ$ۥ */
        public class C0433 implements Parcelable.ClassLoaderCreator<C4542> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
            public C4542 createFromParcel(Parcel parcel) {
                return new C4542(parcel, null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
            public C4542 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4542(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public C4542[] newArray(int i) {
                return new C4542[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C4542(@InterfaceC6391 Parcel parcel, @InterfaceC6490 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9770 = 0;
            this.f9770 = parcel.readInt();
            this.f9771 = parcel.readInt();
            this.f9772 = parcel.readInt();
            this.f9773 = parcel.readInt();
            this.f9774 = parcel.readInt();
        }

        @Override // Yue.AbstractC2967, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9770);
            parcel.writeInt(this.f9771);
            parcel.writeInt(this.f9772);
            parcel.writeInt(this.f9773);
            parcel.writeInt(this.f9774);
        }

        public C4542(@InterfaceC6391 Parcelable parcelable) {
            super(parcelable);
            this.f9770 = 0;
        }
    }
}
