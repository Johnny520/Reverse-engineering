package yyds;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.SeekBar;

/* JADX INFO: renamed from: yyds.ᛳᛴᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0565 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public View f2728;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f2729;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public double f2730;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f2731;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C0052 f2732;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public float f2733;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public boolean f2734;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f2735;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int f2736;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f2737;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f2738;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C0912 f2739;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public float f2740;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Rect f2741 = new Rect();

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C0675 f2742;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static boolean m1432(View view) {
        if (view instanceof C1213) {
            AbstractC2551 layoutManager = ((C1213) view).getLayoutManager();
            if (layoutManager == null) {
                return false;
            }
            if (!layoutManager.mo174() && !layoutManager.mo206()) {
                return false;
            }
        }
        return view.isEnabled();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static boolean m1433(C0675 c0675, View view, MotionEvent motionEvent) {
        motionEvent.offsetLocation(c0675.getScrollX() - view.getLeft(), c0675.getScrollY() - view.getTop());
        return view.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static View m1434(ViewGroup viewGroup, MotionEvent motionEvent) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            int[] iArr = new int[2];
            childAt.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            int i3 = iArr[1];
            int width = childAt.getWidth() + i2;
            int height = childAt.getHeight() + i3;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (rawX >= i2 && rawX <= width && rawY >= i3 && rawY <= height) {
                boolean z = childAt instanceof ViewGroup;
                boolean zM1432 = ((z && childAt.isScrollContainer()) || (childAt instanceof InterfaceC1163) || (childAt instanceof InterfaceC2742) || (childAt instanceof WebView) || (childAt instanceof ScrollView) || (childAt instanceof ListView) || (childAt instanceof SeekBar)) ? m1432(childAt) : childAt.getClass().isAssignableFrom(Class.forName("androidx.viewpager2.widget.ViewPager2")) ? m1432(childAt) : false;
                if (zM1432) {
                    return childAt;
                }
                if (z) {
                    return m1434((ViewGroup) childAt, motionEvent);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0056, code lost:
    
        if (r7 != 3) goto L78;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0052 c0052;
        View view2;
        C0912 c0912 = this.f2739;
        C0675 c0675 = this.f2742;
        if (c0912 == null || c0675 == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            m1436();
            m1437();
            m1435();
            this.f2728 = null;
            View viewM1434 = m1434(c0675, motionEvent);
            if (viewM1434 != null && m1433(c0675, viewM1434, motionEvent)) {
                this.f2728 = viewM1434;
                return true;
            }
        } else {
            if ((action == 1 || action == 3) && (view2 = this.f2728) != null) {
                try {
                    return m1433(c0675, view2, motionEvent);
                } finally {
                    this.f2728 = null;
                }
            }
            View view3 = this.f2728;
            if (view3 != null) {
                return m1433(c0675, view3, motionEvent);
            }
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            if (action2 != 1) {
                if (action2 == 2) {
                    float rawX = motionEvent.getRawX() - this.f2731;
                    float rawY = motionEvent.getRawY() - this.f2738;
                    float fMax = rawX - this.f2733;
                    float fMax2 = rawY - this.f2740;
                    C0912 c09122 = this.f2739;
                    if (c09122 == null || (c09122.f4149.flags & 512) == 0) {
                        fMax = Math.max(fMax, 0.0f);
                        fMax2 = Math.max(fMax2, 0.0f);
                    }
                    int i = (int) fMax;
                    int i2 = (int) fMax2;
                    C0912 c09123 = this.f2739;
                    if (c09123 != null) {
                        WindowManager.LayoutParams layoutParams = c09123.f4149;
                        if (layoutParams.gravity != 51 || layoutParams.x != i || layoutParams.y != i2) {
                            layoutParams.x = i;
                            layoutParams.y = i2;
                            layoutParams.gravity = 51;
                            c09123.m2030();
                            m1435();
                        }
                    }
                    if (!this.f2734) {
                        float f = this.f2733;
                        float x = motionEvent.getX();
                        float f2 = this.f2740;
                        float y = motionEvent.getY();
                        float fM1438 = m1438();
                        if (Math.abs(f - x) >= fM1438 || Math.abs(f2 - y) >= fM1438) {
                            this.f2734 = true;
                        }
                    }
                }
            }
            if (this.f2734 && this.f2739 != null && (c0052 = this.f2732) != null) {
                AbstractC2328.m4341(-174469734368110L);
                C0093 c0093 = (C0093) c0052.f551;
                c0093.m498();
                c0093.f706.performHapticFeedback(4);
            }
            try {
                return this.f2734;
            } finally {
                this.f2734 = false;
            }
        }
        this.f2733 = motionEvent.getX();
        this.f2740 = motionEvent.getY();
        return this.f2734;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m1435() {
        C0675 c0675 = this.f2742;
        if (c0675 == null) {
            return;
        }
        int[] iArr = new int[2];
        c0675.getLocationOnScreen(iArr);
        this.f2736 = iArr[0];
        this.f2737 = iArr[1];
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m1436() {
        Activity activity;
        C0912 c0912 = this.f2739;
        if (c0912 == null || (activity = c0912.f4151) == null) {
            return;
        }
        View decorView = this.f2742;
        if (decorView == null) {
            decorView = activity.getWindow().getDecorView();
        }
        if (decorView == null) {
            return;
        }
        Rect rect = this.f2741;
        decorView.getWindowVisibleDisplayFrame(rect);
        int i = rect.right;
        int i2 = rect.left;
        this.f2735 = i - i2;
        this.f2729 = rect.bottom - rect.top;
        this.f2731 = Math.max(i2, 0);
        this.f2738 = Math.max(rect.top, 0);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m1437() {
        Display defaultDisplay;
        C0912 c0912 = this.f2739;
        if (c0912 == null || (defaultDisplay = c0912.f4158.getDefaultDisplay()) == null) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        defaultDisplay.getRealSize(new Point());
        this.f2730 = Math.sqrt(Math.pow(r2.y / displayMetrics.ydpi, 2.0d) + Math.pow(r2.x / displayMetrics.xdpi, 2.0d));
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final float m1438() {
        return TypedValue.applyDimension(1, this.f2730 > 0.0d ? (int) Math.ceil(r0 / 15.0d) : 1, Resources.getSystem().getDisplayMetrics());
    }
}
