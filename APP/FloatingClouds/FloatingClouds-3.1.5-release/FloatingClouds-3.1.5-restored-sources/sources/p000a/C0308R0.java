package p000a;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.C0983R;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000a.C0289Pg;
import p000a.C0437Y3;
import p000a.C0734nh;
import p000a.C0866ug;

/* JADX INFO: renamed from: a.R0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0308R0 implements InterfaceC0355Tb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f1108a;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.google.android.material.textfield.TextInputLayout.setHintTextAppearance(int):void] */
    public /* synthetic */ C0308R0(Object obj) {
        this.f1108a = obj;
    }

    @Override // p000a.InterfaceC0355Tb
    /* JADX INFO: renamed from: a */
    public C0734nh mo691a(View view, C0734nh c0734nh) {
        int i;
        boolean z;
        C0734nh c0734nhMo1697b;
        boolean z2;
        int iM1694d = c0734nh.m1694d();
        LayoutInflaterFactory2C0291Q0 layoutInflaterFactory2C0291Q0 = (LayoutInflaterFactory2C0291Q0) this.f1108a;
        layoutInflaterFactory2C0291Q0.getClass();
        int iM1694d2 = c0734nh.m1694d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0291Q0.f1037v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0291Q0.f1037v.getLayoutParams();
            if (layoutInflaterFactory2C0291Q0.f1037v.isShown()) {
                if (layoutInflaterFactory2C0291Q0.f1020d0 == null) {
                    layoutInflaterFactory2C0291Q0.f1020d0 = new Rect();
                    layoutInflaterFactory2C0291Q0.f1021e0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0291Q0.f1020d0;
                Rect rect2 = layoutInflaterFactory2C0291Q0.f1021e0;
                rect.set(c0734nh.m1692b(), c0734nh.m1694d(), c0734nh.m1693c(), c0734nh.m1691a());
                ViewGroup viewGroup = layoutInflaterFactory2C0291Q0.f992B;
                if (Build.VERSION.SDK_INT >= 29) {
                    C0289Pg.a.m785a(viewGroup, rect, rect2);
                } else {
                    if (!C0289Pg.f985a) {
                        C0289Pg.f985a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            C0289Pg.f986b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                C0289Pg.f986b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = C0289Pg.f986b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i2 = rect.top;
                int i3 = rect.left;
                int i4 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C0291Q0.f992B;
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                C0734nh c0734nhM2035a = C0866ug.e.m2035a(viewGroup2);
                int iM1692b = c0734nhM2035a == null ? 0 : c0734nhM2035a.m1692b();
                int iM1693c = c0734nhM2035a == null ? 0 : c0734nhM2035a.m1693c();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                Context context = layoutInflaterFactory2C0291Q0.f1026k;
                if (i2 <= 0 || layoutInflaterFactory2C0291Q0.f994D != null) {
                    View view2 = layoutInflaterFactory2C0291Q0.f994D;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != iM1692b || marginLayoutParams2.rightMargin != iM1693c) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = iM1692b;
                            marginLayoutParams2.rightMargin = iM1693c;
                            layoutInflaterFactory2C0291Q0.f994D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0291Q0.f994D = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM1692b;
                    layoutParams.rightMargin = iM1693c;
                    layoutInflaterFactory2C0291Q0.f992B.addView(layoutInflaterFactory2C0291Q0.f994D, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0291Q0.f994D;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0291Q0.f994D;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? C0437Y3.b.m1095a(context, C0983R.color.abc_decor_view_status_guard_light) : C0437Y3.b.m1095a(context, C0983R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0291Q0.f999I && z) {
                    iM1694d2 = 0;
                }
                z = z;
                z = z2;
                i = 0;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z = false;
                } else {
                    z = false;
                    z = false;
                }
            }
            if (z) {
                layoutInflaterFactory2C0291Q0.f1037v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0291Q0.f994D;
        if (view6 != null) {
            view6.setVisibility(z ? i : 8);
        }
        if (iM1694d != iM1694d2) {
            int iM1692b2 = c0734nh.m1692b();
            int iM1693c2 = c0734nh.m1693c();
            int iM1691a = c0734nh.m1691a();
            int i7 = Build.VERSION.SDK_INT;
            C0734nh.e dVar = i7 >= 30 ? new C0734nh.d(c0734nh) : i7 >= 29 ? new C0734nh.c(c0734nh) : new C0734nh.b(c0734nh);
            dVar.mo1699g(C0479a9.m1165b(iM1692b2, iM1694d2, iM1693c2, iM1691a));
            c0734nhMo1697b = dVar.mo1697b();
        } else {
            c0734nhMo1697b = c0734nh;
        }
        WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
        WindowInsets windowInsetsM1695f = c0734nhMo1697b.m1695f();
        if (windowInsetsM1695f == null) {
            return c0734nhMo1697b;
        }
        WindowInsets windowInsetsM2007b = C0866ug.c.m2007b(view, windowInsetsM1695f);
        return !windowInsetsM2007b.equals(windowInsetsM1695f) ? C0734nh.m1690g(view, windowInsetsM2007b) : c0734nhMo1697b;
    }
}
