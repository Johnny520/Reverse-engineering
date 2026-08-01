package p061e;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.p055lu.wxmask272.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p068h.InterfaceC0606y;
import p068h.MenuC0594m;
import p069i.AbstractC0718t1;
import p069i.InterfaceC0696m0;
import p082p.AbstractC0784b;
import p085r.C0811c;
import p099y.AbstractC1039C;
import p099y.AbstractC1048L;
import p099y.AbstractC1060Y;
import p099y.AbstractC1094z;
import p099y.C1057V;
import p099y.C1058W;
import p099y.C1059X;
import p099y.C1073f0;
import p099y.C1075g0;
import p099y.InterfaceC1084p;

/* JADX INFO: renamed from: e.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0537m implements InterfaceC1084p, InterfaceC0696m0, InterfaceC0606y {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1759b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LayoutInflaterFactory2C0545u f1760c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0537m(LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u, int i2) {
        this.f1759b = i2;
        this.f1760c = layoutInflaterFactory2C0545u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public C1075g0 m1092a(View view, C1075g0 c1075g0) {
        int i2;
        boolean z2;
        C1075g0 c1075g0Mo2309b;
        boolean z3;
        C1073f0 c1073f0 = c1075g0.f3705a;
        int i3 = c1073f0.mo2316g().f2713b;
        LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = this.f1760c;
        layoutInflaterFactory2C0545u.getClass();
        int i4 = c1073f0.mo2316g().f2713b;
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0545u.f1831p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i2 = 0;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0545u.f1831p.getLayoutParams();
            if (layoutInflaterFactory2C0545u.f1831p.isShown()) {
                if (layoutInflaterFactory2C0545u.f1816W == null) {
                    layoutInflaterFactory2C0545u.f1816W = new Rect();
                    layoutInflaterFactory2C0545u.f1817X = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0545u.f1816W;
                Rect rect2 = layoutInflaterFactory2C0545u.f1817X;
                rect.set(c1073f0.mo2316g().f2712a, c1073f0.mo2316g().f2713b, c1073f0.mo2316g().f2714c, c1073f0.mo2316g().f2715d);
                ViewGroup viewGroup = layoutInflaterFactory2C0545u.f1836u;
                Method method = AbstractC0718t1.f2436a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e2) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                    }
                }
                int i5 = rect.top;
                int i6 = rect.left;
                int i7 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C0545u.f1836u;
                WeakHashMap weakHashMap = AbstractC1048L.f3662a;
                C1075g0 c1075g0M2252a = AbstractC1039C.m2252a(viewGroup2);
                int i8 = c1075g0M2252a == null ? 0 : c1075g0M2252a.f3705a.mo2316g().f2712a;
                int i9 = c1075g0M2252a == null ? 0 : c1075g0M2252a.f3705a.mo2316g().f2714c;
                if (marginLayoutParams.topMargin == i5 && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i7) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.leftMargin = i6;
                    marginLayoutParams.rightMargin = i7;
                    z3 = true;
                }
                Context context = layoutInflaterFactory2C0545u.f1820e;
                if (i5 <= 0 || layoutInflaterFactory2C0545u.f1838w != null) {
                    View view2 = layoutInflaterFactory2C0545u.f1838w;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i10 = marginLayoutParams2.height;
                        int i11 = marginLayoutParams.topMargin;
                        if (i10 != i11 || marginLayoutParams2.leftMargin != i8 || marginLayoutParams2.rightMargin != i9) {
                            marginLayoutParams2.height = i11;
                            marginLayoutParams2.leftMargin = i8;
                            marginLayoutParams2.rightMargin = i9;
                            layoutInflaterFactory2C0545u.f1838w.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0545u.f1838w = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i8;
                    layoutParams.rightMargin = i9;
                    layoutInflaterFactory2C0545u.f1836u.addView(layoutInflaterFactory2C0545u.f1838w, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0545u.f1838w;
                z2 = view4 != null;
                if (z2 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0545u.f1838w;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? AbstractC0784b.m1448a(context, R.color.abc_decor_view_status_guard_light) : AbstractC0784b.m1448a(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0545u.f1795B && z2) {
                    i4 = 0;
                }
                i2 = 0;
            } else {
                i2 = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = false;
                    z3 = true;
                } else {
                    z3 = false;
                    z2 = false;
                }
            }
            if (z3) {
                layoutInflaterFactory2C0545u.f1831p.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0545u.f1838w;
        if (view6 != null) {
            if (!z2) {
                i2 = 8;
            }
            view6.setVisibility(i2);
        }
        if (i3 != i4) {
            int i12 = c1073f0.mo2316g().f2712a;
            int i13 = c1073f0.mo2316g().f2714c;
            int i14 = c1073f0.mo2316g().f2715d;
            int i15 = Build.VERSION.SDK_INT;
            AbstractC1060Y c1059x = i15 >= 30 ? new C1059X(c1075g0) : i15 >= 29 ? new C1058W(c1075g0) : new C1057V(c1075g0);
            c1059x.mo2311d(C0811c.m1479a(i12, i4, i13, i14));
            c1075g0Mo2309b = c1059x.mo2309b();
        } else {
            c1075g0Mo2309b = c1075g0;
        }
        WeakHashMap weakHashMap2 = AbstractC1048L.f3662a;
        WindowInsets windowInsetsM2343b = c1075g0Mo2309b.m2343b();
        if (windowInsetsM2343b == null) {
            return c1075g0Mo2309b;
        }
        WindowInsets windowInsetsM2365b = AbstractC1094z.m2365b(view, windowInsetsM2343b);
        return !windowInsetsM2365b.equals(windowInsetsM2343b) ? C1075g0.m2342c(windowInsetsM2365b, view) : c1075g0Mo2309b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0606y
    /* JADX INFO: renamed from: b */
    public void mo132b(MenuC0594m menuC0594m, boolean z2) {
        C0544t c0544t;
        switch (this.f1759b) {
            case 2:
                this.f1760c.m1110p(menuC0594m);
                break;
            default:
                MenuC0594m menuC0594mMo1164k = menuC0594m.mo1164k();
                int i2 = 0;
                boolean z3 = menuC0594mMo1164k != menuC0594m;
                if (z3) {
                    menuC0594m = menuC0594mMo1164k;
                }
                LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = this.f1760c;
                C0544t[] c0544tArr = layoutInflaterFactory2C0545u.f1799F;
                int length = c0544tArr != null ? c0544tArr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        c0544t = null;
                    } else {
                        c0544t = c0544tArr[i2];
                        if (c0544t == null || c0544t.f1781h != menuC0594m) {
                            i2++;
                        }
                    }
                }
                if (c0544t != null) {
                    if (!z3) {
                        layoutInflaterFactory2C0545u.m1111q(c0544t, z2);
                    } else {
                        layoutInflaterFactory2C0545u.m1109o(c0544t.f1774a, c0544t, menuC0594mMo1164k);
                        layoutInflaterFactory2C0545u.m1111q(c0544t, true);
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0606y
    /* JADX INFO: renamed from: m */
    public boolean mo142m(MenuC0594m menuC0594m) {
        Window.Callback callback;
        switch (this.f1759b) {
            case 2:
                Window.Callback callback2 = this.f1760c.f1821f.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0594m);
                }
                break;
            default:
                if (menuC0594m == menuC0594m.mo1164k()) {
                    LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = this.f1760c;
                    if (layoutInflaterFactory2C0545u.f1841z && (callback = layoutInflaterFactory2C0545u.f1821f.getCallback()) != null && !layoutInflaterFactory2C0545u.f1804K) {
                        callback.onMenuOpened(108, menuC0594m);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
