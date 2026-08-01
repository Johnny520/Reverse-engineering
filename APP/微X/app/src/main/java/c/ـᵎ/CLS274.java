// Decompiled by JEB v5.42.0.202606242140

package c.ـᵎ;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class CLS274 {
    public static WeakHashMap FLD1192;
    public static final AtomicInteger FLD1193;
    public static boolean FLD1194;
    public static ThreadLocal FLD1195;

    static {
        CLS274.FLD1193 = new AtomicInteger(1);
        CLS274.FLD1192 = null;
        CLS274.FLD1194 = false;
    }

    public static void MTH4147(View view0, int v) {
        view0.offsetTopAndBottom(v);
        if(view0.getVisibility() == 0) {
            CLS274.MTH4150(view0);
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 instanceof View) {
                CLS274.MTH4150(((View)viewParent0));
            }
        }
    }

    public static void MTH4148(View view0, CLS276 ـᵎ0) {
        view0.setAccessibilityDelegate((ـᵎ0 == null ? null : ـᵎ0.MTH4179()));
    }

    public static boolean MTH4149(View view0) {
        return Build.VERSION.SDK_INT < 16 ? false : view0.getFitsSystemWindows();
    }

    public static void MTH4150(View view0) {
        float f = view0.getTranslationY();
        view0.setTranslationY(f + 1.0f);
        view0.setTranslationY(f);
    }

    public static void MTH4151(View view0, int v) {
        view0.offsetLeftAndRight(v);
        if(view0.getVisibility() == 0) {
            CLS274.MTH4150(view0);
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 instanceof View) {
                CLS274.MTH4150(((View)viewParent0));
            }
        }
    }

    public static void MTH4152(View view0) {
        if(Build.VERSION.SDK_INT >= 16) {
            view0.postInvalidateOnAnimation();
            return;
        }
        view0.postInvalidate();
    }

    public static void MTH4153(View view0, int v) {
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

    public static void MTH4154(View view0, int v) {
        int v2;
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 23) {
            view0.offsetLeftAndRight(v);
            return;
        }
        if(v1 >= 21) {
            Rect rect0 = CLS274.MTH4161();
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 instanceof View) {
                rect0.set(((View)viewParent0).getLeft(), ((View)viewParent0).getTop(), ((View)viewParent0).getRight(), ((View)viewParent0).getBottom());
                v2 = !rect0.intersects(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom());
            }
            else {
                v2 = 0;
            }
            CLS274.MTH4151(view0, v);
            if(v2 != 0 && rect0.intersect(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom())) {
                ((View)viewParent0).invalidate(rect0);
            }
        }
        else {
            CLS274.MTH4151(view0, v);
        }
    }

    public static void MTH4155(View view0, int v) {
        int v2;
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 23) {
            view0.offsetTopAndBottom(v);
            return;
        }
        if(v1 >= 21) {
            Rect rect0 = CLS274.MTH4161();
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 instanceof View) {
                rect0.set(((View)viewParent0).getLeft(), ((View)viewParent0).getTop(), ((View)viewParent0).getRight(), ((View)viewParent0).getBottom());
                v2 = !rect0.intersects(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom());
            }
            else {
                v2 = 0;
            }
            CLS274.MTH4147(view0, v);
            if(v2 != 0 && rect0.intersect(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom())) {
                ((View)viewParent0).invalidate(rect0);
            }
        }
        else {
            CLS274.MTH4147(view0, v);
        }
    }

    public static void MTH4156(View view0, float f) {
        if(Build.VERSION.SDK_INT >= 21) {
            view0.setElevation(f);
        }
    }

    public static float MTH4157(View view0) {
        return Build.VERSION.SDK_INT < 21 ? 0.0f : view0.getElevation();
    }

    public static int MTH4158(View view0) {
        return Build.VERSION.SDK_INT < 17 ? 0 : view0.getLayoutDirection();
    }

    public static ViewParent MTH4159(View view0) {
        return Build.VERSION.SDK_INT < 16 ? view0.getParent() : view0.getParentForAccessibility();
    }

    public static int MTH4160(View view0) {
        return Build.VERSION.SDK_INT < 16 ? 0 : view0.getImportantForAccessibility();
    }

    public static Rect MTH4161() {
        if(CLS274.FLD1195 == null) {
            CLS274.FLD1195 = new ThreadLocal();
        }
        Rect rect0 = (Rect)CLS274.FLD1195.get();
        if(rect0 == null) {
            rect0 = new Rect();
            CLS274.FLD1195.set(rect0);
        }
        rect0.setEmpty();
        return rect0;
    }
}

