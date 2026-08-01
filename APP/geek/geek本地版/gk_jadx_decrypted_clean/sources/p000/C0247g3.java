package p000;

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
import com.github.megatronking.stringfog.Base64;
import com.ljx.wechatmod.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: g3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0247g3 implements InterfaceC0649qw, InterfaceC0925yc, InterfaceC0128cv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2011a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0657r3 f2012b;

    public /* synthetic */ C0247g3(LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3, int i) {
        this.f2011a = i;
        this.f2012b = layoutInflaterFactory2C0657r3;
    }

    @Override // p000.InterfaceC0128cv
    /* JADX INFO: renamed from: a */
    public void mo829a(MenuC0424ku menuC0424ku, boolean z) {
        C0620q3 c0620q3;
        switch (this.f2011a) {
            case Base64.NO_WRAP /* 2 */:
                this.f2012b.m2205r(menuC0424ku);
                break;
            default:
                MenuC0424ku menuC0424kuMo633k = menuC0424ku.mo633k();
                int i = 0;
                boolean z2 = menuC0424kuMo633k != menuC0424ku;
                if (z2) {
                    menuC0424ku = menuC0424kuMo633k;
                }
                LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = this.f2012b;
                C0620q3[] c0620q3Arr = layoutInflaterFactory2C0657r3.f4154L;
                int length = c0620q3Arr != null ? c0620q3Arr.length : 0;
                while (true) {
                    if (i >= length) {
                        c0620q3 = null;
                    } else {
                        c0620q3 = c0620q3Arr[i];
                        if (c0620q3 == null || c0620q3.f3984h != menuC0424ku) {
                            i++;
                        }
                    }
                }
                if (c0620q3 != null) {
                    if (!z2) {
                        layoutInflaterFactory2C0657r3.m2206s(c0620q3, z);
                    } else {
                        layoutInflaterFactory2C0657r3.m2204q(c0620q3.f3977a, c0620q3, menuC0424kuMo633k);
                        layoutInflaterFactory2C0657r3.m2206s(c0620q3, true);
                    }
                }
                break;
        }
    }

    @Override // p000.InterfaceC0649qw
    /* JADX INFO: renamed from: d */
    public wc0 mo474d(View view, wc0 wc0Var) {
        boolean z;
        wc0 wc0VarMo1433b;
        boolean z2;
        int iM2567d = wc0Var.m2567d();
        LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = this.f2012b;
        Context context = layoutInflaterFactory2C0657r3.f4177k;
        int iM2567d2 = wc0Var.m2567d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0657r3.f4188v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0657r3.f4188v.getLayoutParams();
            if (layoutInflaterFactory2C0657r3.f4188v.isShown()) {
                if (layoutInflaterFactory2C0657r3.f4171c0 == null) {
                    layoutInflaterFactory2C0657r3.f4171c0 = new Rect();
                    layoutInflaterFactory2C0657r3.f4172d0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0657r3.f4171c0;
                Rect rect2 = layoutInflaterFactory2C0657r3.f4172d0;
                rect.set(wc0Var.m2565b(), wc0Var.m2567d(), wc0Var.m2566c(), wc0Var.m2564a());
                ViewGroup viewGroup = layoutInflaterFactory2C0657r3.f4143A;
                Method method = cb0.f942a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C0657r3.f4143A;
                WeakHashMap weakHashMap = ja0.f2600a;
                wc0 wc0VarM2782a = z90.m2782a(viewGroup2);
                int iM2565b = wc0VarM2782a == null ? 0 : wc0VarM2782a.m2565b();
                int iM2566c = wc0VarM2782a == null ? 0 : wc0VarM2782a.m2566c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || layoutInflaterFactory2C0657r3.f4145C != null) {
                    View view2 = layoutInflaterFactory2C0657r3.f4145C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iM2565b || marginLayoutParams2.rightMargin != iM2566c) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iM2565b;
                            marginLayoutParams2.rightMargin = iM2566c;
                            layoutInflaterFactory2C0657r3.f4145C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0657r3.f4145C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM2565b;
                    layoutParams.rightMargin = iM2566c;
                    layoutInflaterFactory2C0657r3.f4143A.addView(layoutInflaterFactory2C0657r3.f4145C, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0657r3.f4145C;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0657r3.f4145C;
                    view5.setBackgroundColor((s90.m2315g(view5) & 8192) != 0 ? AbstractC0294hd.m1354a(context, R.color.abc_decor_view_status_guard_light) : AbstractC0294hd.m1354a(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0657r3.f4150H && z) {
                    iM2567d2 = 0;
                }
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
                z2 = true;
            } else {
                z2 = false;
                z = false;
            }
            if (z2) {
                layoutInflaterFactory2C0657r3.f4188v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0657r3.f4145C;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        if (iM2567d != iM2567d2) {
            int iM2565b2 = wc0Var.m2565b();
            int iM2566c2 = wc0Var.m2566c();
            int iM2564a = wc0Var.m2564a();
            int i6 = Build.VERSION.SDK_INT;
            mc0 lc0Var = i6 >= 30 ? new lc0(wc0Var) : i6 >= 29 ? new kc0(wc0Var) : new ic0(wc0Var);
            lc0Var.mo1435g(C0195ep.m1050b(iM2565b2, iM2567d2, iM2566c2, iM2564a));
            wc0VarMo1433b = lc0Var.mo1433b();
        } else {
            wc0VarMo1433b = wc0Var;
        }
        WeakHashMap weakHashMap2 = ja0.f2600a;
        WindowInsets windowInsetsM2568f = wc0VarMo1433b.m2568f();
        if (windowInsetsM2568f == null) {
            return wc0VarMo1433b;
        }
        WindowInsets windowInsetsM2551b = w90.m2551b(view, windowInsetsM2568f);
        return !windowInsetsM2551b.equals(windowInsetsM2568f) ? wc0.m2563g(view, windowInsetsM2551b) : wc0VarMo1433b;
    }

    @Override // p000.InterfaceC0128cv
    /* JADX INFO: renamed from: q */
    public boolean mo830q(MenuC0424ku menuC0424ku) {
        Window.Callback callback;
        switch (this.f2011a) {
            case Base64.NO_WRAP /* 2 */:
                Window.Callback callback2 = this.f2012b.f4178l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0424ku);
                }
                break;
            default:
                if (menuC0424ku == menuC0424ku.mo633k()) {
                    LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = this.f2012b;
                    if (layoutInflaterFactory2C0657r3.f4148F && (callback = layoutInflaterFactory2C0657r3.f4178l.getCallback()) != null && !layoutInflaterFactory2C0657r3.f4159Q) {
                        callback.onMenuOpened(108, menuC0424ku);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
