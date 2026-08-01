// Decompiled by JEB v5.42.0.202606242140

package c.ʾʻ;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class CLS31 {
    public static boolean FLD125;
    public static ThreadLocal FLD126;
    public static final AtomicInteger FLD127;
    public static WeakHashMap FLD128;

    static {
        CLS31.FLD127 = new AtomicInteger(1);
        CLS31.FLD128 = null;
        CLS31.FLD125 = false;
    }

    public static float MTH831(View view0) {
        return Build.VERSION.SDK_INT < 21 ? 0.0f : view0.getElevation();
    }

    public static void MTH832(View view0, int v) {
        int v2;
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 23) {
            view0.offsetLeftAndRight(v);
            return;
        }
        if(v1 >= 21) {
            Rect rect0 = CLS31.MTH836();
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 instanceof View) {
                rect0.set(((View)viewParent0).getLeft(), ((View)viewParent0).getTop(), ((View)viewParent0).getRight(), ((View)viewParent0).getBottom());
                v2 = !rect0.intersects(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom());
            }
            else {
                v2 = 0;
            }
            CLS31.MTH843(view0, v);
            if(v2 != 0 && rect0.intersect(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom())) {
                ((View)viewParent0).invalidate(rect0);
            }
        }
        else {
            CLS31.MTH843(view0, v);
        }
    }

    public static void MTH833(View view0, CLS27 ʾʻ0) {
        view0.setAccessibilityDelegate((ʾʻ0 == null ? null : ʾʻ0.MTH817()));
    }

    public static boolean MTH834(View view0) {
        return Build.VERSION.SDK_INT < 16 ? false : view0.getFitsSystemWindows();
    }

    public static void MTH835(View view0, float f) {
        if(Build.VERSION.SDK_INT >= 21) {
            view0.setElevation(f);
        }
    }

    public static Rect MTH836() {
        if(CLS31.FLD126 == null) {
            CLS31.FLD126 = new ThreadLocal();
        }
        Rect rect0 = (Rect)CLS31.FLD126.get();
        if(rect0 == null) {
            rect0 = new Rect();
            CLS31.FLD126.set(rect0);
        }
        rect0.setEmpty();
        return rect0;
    }

    public static void MTH837(View view0) {
        if(Build.VERSION.SDK_INT >= 16) {
            view0.postInvalidateOnAnimation();
            return;
        }
        view0.postInvalidate();
    }

    public static int MTH838(View view0) {
        return Build.VERSION.SDK_INT < 16 ? 0 : view0.getImportantForAccessibility();
    }

    public static void MTH839(View view0, int v) {
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 19) {
            view0.setImportantForAccessibility(v);
            return;
        }
        if(v1 >= 16) {
            if(v == 4) {
                v = 2;
            }
            view0.setImportantForAccessibility(v);
        }
    }

    public static void MTH840(View view0) {
        float f = view0.getTranslationY();
        view0.setTranslationY(f + 1.0f);
        view0.setTranslationY(f);
    }

    public static ViewParent MTH841(View view0) {
        return Build.VERSION.SDK_INT < 16 ? view0.getParent() : view0.getParentForAccessibility();
    }

    public static void MTH842(View view0, int v) {
        int v2;
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 23) {
            view0.offsetTopAndBottom(v);
            return;
        }
        if(v1 >= 21) {
            Rect rect0 = CLS31.MTH836();
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 instanceof View) {
                rect0.set(((View)viewParent0).getLeft(), ((View)viewParent0).getTop(), ((View)viewParent0).getRight(), ((View)viewParent0).getBottom());
                v2 = !rect0.intersects(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom());
            }
            else {
                v2 = 0;
            }
            CLS31.MTH845(view0, v);
            if(v2 != 0 && rect0.intersect(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom())) {
                ((View)viewParent0).invalidate(rect0);
            }
        }
        else {
            CLS31.MTH845(view0, v);
        }
    }

    public static void MTH843(View view0, int v) {
        view0.offsetLeftAndRight(v);
        if(view0.getVisibility() == 0) {
            CLS31.MTH840(view0);
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 instanceof View) {
                CLS31.MTH840(((View)viewParent0));
            }
        }
    }

    public static int MTH844(View view0) {
        return Build.VERSION.SDK_INT < 17 ? 0 : view0.getLayoutDirection();
    }

    public static void MTH845(View view0, int v) {
        view0.offsetTopAndBottom(v);
        if(view0.getVisibility() == 0) {
            CLS31.MTH840(view0);
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 instanceof View) {
                CLS31.MTH840(((View)viewParent0));
            }
        }
    }
}

