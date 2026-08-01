package p069i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.p055lu.wxmask272.R;
import java.util.WeakHashMap;
import p099y.AbstractC1048L;
import p099y.AbstractC1049M;
import p099y.AbstractC1051O;

/* JADX INFO: renamed from: i.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLongClickListenerC0706p1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: l */
    public static ViewOnLongClickListenerC0706p1 f2380l;

    /* JADX INFO: renamed from: m */
    public static ViewOnLongClickListenerC0706p1 f2381m;

    /* JADX INFO: renamed from: b */
    public final View f2382b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f2383c;

    /* JADX INFO: renamed from: d */
    public final int f2384d;

    /* JADX INFO: renamed from: e */
    public final RunnableC0703o1 f2385e;

    /* JADX INFO: renamed from: f */
    public final RunnableC0703o1 f2386f;

    /* JADX INFO: renamed from: g */
    public int f2387g;

    /* JADX INFO: renamed from: h */
    public int f2388h;

    /* JADX INFO: renamed from: i */
    public C0709q1 f2389i;

    /* JADX INFO: renamed from: j */
    public boolean f2390j;

    /* JADX INFO: renamed from: k */
    public boolean f2391k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [i.o1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [i.o1] */
    public ViewOnLongClickListenerC0706p1(View view, CharSequence charSequence) {
        final int i2 = 0;
        this.f2385e = new Runnable(this) { // from class: i.o1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ViewOnLongClickListenerC0706p1 f2371b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2371b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f2371b.m1340c(false);
                        break;
                    default:
                        this.f2371b.m1339a();
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f2386f = new Runnable(this) { // from class: i.o1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ViewOnLongClickListenerC0706p1 f2371b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2371b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f2371b.m1340c(false);
                        break;
                    default:
                        this.f2371b.m1339a();
                        break;
                }
            }
        };
        this.f2382b = view;
        this.f2383c = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        int i4 = AbstractC1051O.f3667a;
        this.f2384d = Build.VERSION.SDK_INT >= 28 ? AbstractC1049M.m2292a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f2391k = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1338b(ViewOnLongClickListenerC0706p1 viewOnLongClickListenerC0706p1) {
        ViewOnLongClickListenerC0706p1 viewOnLongClickListenerC0706p12 = f2380l;
        if (viewOnLongClickListenerC0706p12 != null) {
            viewOnLongClickListenerC0706p12.f2382b.removeCallbacks(viewOnLongClickListenerC0706p12.f2385e);
        }
        f2380l = viewOnLongClickListenerC0706p1;
        if (viewOnLongClickListenerC0706p1 != null) {
            viewOnLongClickListenerC0706p1.f2382b.postDelayed(viewOnLongClickListenerC0706p1.f2385e, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1339a() {
        ViewOnLongClickListenerC0706p1 viewOnLongClickListenerC0706p1 = f2381m;
        View view = this.f2382b;
        if (viewOnLongClickListenerC0706p1 == this) {
            f2381m = null;
            C0709q1 c0709q1 = this.f2389i;
            if (c0709q1 != null) {
                View view2 = (View) c0709q1.f2397c;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) c0709q1.f2396b).getSystemService("window")).removeView(view2);
                }
                this.f2389i = null;
                this.f2391k = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f2380l == this) {
            m1338b(null);
        }
        view.removeCallbacks(this.f2386f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1340c(boolean z2) {
        int height;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long longPressTimeout;
        long j2;
        long j3;
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        View view = this.f2382b;
        if (view.isAttachedToWindow()) {
            m1338b(null);
            ViewOnLongClickListenerC0706p1 viewOnLongClickListenerC0706p1 = f2381m;
            if (viewOnLongClickListenerC0706p1 != null) {
                viewOnLongClickListenerC0706p1.m1339a();
            }
            f2381m = this;
            this.f2390j = z2;
            C0709q1 c0709q1 = new C0709q1(view.getContext());
            this.f2389i = c0709q1;
            int width = this.f2387g;
            int i7 = this.f2388h;
            boolean z3 = this.f2390j;
            View view2 = (View) c0709q1.f2397c;
            ViewParent parent = view2.getParent();
            Context context = (Context) c0709q1.f2396b;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) c0709q1.f2395a).setText(this.f2383c);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) c0709q1.f2398d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i7 + dimensionPixelOffset2;
                i2 = i7 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i6 = 1;
            } else {
                Rect rect = (Rect) c0709q1.f2399e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i3 = width;
                    i4 = i2;
                    i5 = 0;
                    i6 = 1;
                } else {
                    Resources resources = context.getResources();
                    i6 = 1;
                    i3 = width;
                    i4 = i2;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i5 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) c0709q1.f2401g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) c0709q1.f2400f;
                view.getLocationOnScreen(iArr2);
                int i8 = iArr2[i5] - iArr[i5];
                iArr2[i5] = i8;
                iArr2[i6] = iArr2[i6] - iArr[i6];
                layoutParams.x = (i8 + i3) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, i5);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i9 = iArr2[i6];
                int i10 = ((i9 + i4) - dimensionPixelOffset3) - measuredHeight;
                int i11 = i9 + height + dimensionPixelOffset3;
                if (z3) {
                    if (i10 >= 0) {
                        layoutParams.y = i10;
                    } else {
                        layoutParams.y = i11;
                    }
                } else if (measuredHeight + i11 <= rect.height()) {
                    layoutParams.y = i11;
                } else {
                    layoutParams.y = i10;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f2390j) {
                j3 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i6) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j3 = j2 - longPressTimeout;
            }
            RunnableC0703o1 runnableC0703o1 = this.f2386f;
            view.removeCallbacks(runnableC0703o1);
            view.postDelayed(runnableC0703o1, j3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2389i == null || !this.f2390j) {
            View view2 = this.f2382b;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f2391k = true;
                        m1339a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f2389i == null) {
                    int x2 = (int) motionEvent.getX();
                    int y2 = (int) motionEvent.getY();
                    if (!this.f2391k) {
                        int iAbs = Math.abs(x2 - this.f2387g);
                        int i2 = this.f2384d;
                        if (iAbs > i2 || Math.abs(y2 - this.f2388h) > i2) {
                            this.f2387g = x2;
                            this.f2388h = y2;
                            this.f2391k = false;
                            m1338b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f2387g = view.getWidth() / 2;
        this.f2388h = view.getHeight() / 2;
        m1340c(true);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m1339a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
