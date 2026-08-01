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
public final class C0247g3 implements InterfaceC0945yw, InterfaceC0331id, InterfaceC0425kv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0656r3 f1866b;

    public /* synthetic */ C0247g3(LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3, int i) {
        this.f1865a = i;
        this.f1866b = layoutInflaterFactory2C0656r3;
    }

    @Override // p000.InterfaceC0425kv
    /* JADX INFO: renamed from: a */
    public void mo1134a(MenuC0646qu menuC0646qu, boolean z) {
        C0619q3 c0619q3;
        switch (this.f1865a) {
            case Base64.NO_WRAP /* 2 */:
                this.f1866b.m2216r(menuC0646qu);
                break;
            default:
                MenuC0646qu menuC0646quMo1570k = menuC0646qu.mo1570k();
                int i = 0;
                boolean z2 = menuC0646quMo1570k != menuC0646qu;
                if (z2) {
                    menuC0646qu = menuC0646quMo1570k;
                }
                LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = this.f1866b;
                C0619q3[] c0619q3Arr = layoutInflaterFactory2C0656r3.f4015L;
                int length = c0619q3Arr != null ? c0619q3Arr.length : 0;
                while (true) {
                    if (i >= length) {
                        c0619q3 = null;
                    } else {
                        c0619q3 = c0619q3Arr[i];
                        if (c0619q3 == null || c0619q3.f3781h != menuC0646qu) {
                            i++;
                        }
                    }
                }
                if (c0619q3 != null) {
                    if (!z2) {
                        layoutInflaterFactory2C0656r3.m2217s(c0619q3, z);
                    } else {
                        layoutInflaterFactory2C0656r3.m2215q(c0619q3.f3774a, c0619q3, menuC0646quMo1570k);
                        layoutInflaterFactory2C0656r3.m2217s(c0619q3, true);
                    }
                }
                break;
        }
    }

    @Override // p000.InterfaceC0945yw
    /* JADX INFO: renamed from: e */
    public bd0 mo844e(View view, bd0 bd0Var) {
        boolean z;
        bd0 bd0VarMo1944b;
        boolean z2;
        int iM519d = bd0Var.m519d();
        LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = this.f1866b;
        Context context = layoutInflaterFactory2C0656r3.f4038k;
        int iM519d2 = bd0Var.m519d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0656r3.f4049v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0656r3.f4049v.getLayoutParams();
            if (layoutInflaterFactory2C0656r3.f4049v.isShown()) {
                if (layoutInflaterFactory2C0656r3.f4032c0 == null) {
                    layoutInflaterFactory2C0656r3.f4032c0 = new Rect();
                    layoutInflaterFactory2C0656r3.f4033d0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0656r3.f4032c0;
                Rect rect2 = layoutInflaterFactory2C0656r3.f4033d0;
                rect.set(bd0Var.m517b(), bd0Var.m519d(), bd0Var.m518c(), bd0Var.m516a());
                ViewGroup viewGroup = layoutInflaterFactory2C0656r3.f4004A;
                Method method = hb0.f2214a;
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
                ViewGroup viewGroup2 = layoutInflaterFactory2C0656r3.f4004A;
                WeakHashMap weakHashMap = oa0.f3426a;
                bd0 bd0VarM981a = ea0.m981a(viewGroup2);
                int iM517b = bd0VarM981a == null ? 0 : bd0VarM981a.m517b();
                int iM518c = bd0VarM981a == null ? 0 : bd0VarM981a.m518c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || layoutInflaterFactory2C0656r3.f4006C != null) {
                    View view2 = layoutInflaterFactory2C0656r3.f4006C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iM517b || marginLayoutParams2.rightMargin != iM518c) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iM517b;
                            marginLayoutParams2.rightMargin = iM518c;
                            layoutInflaterFactory2C0656r3.f4006C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0656r3.f4006C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM517b;
                    layoutParams.rightMargin = iM518c;
                    layoutInflaterFactory2C0656r3.f4004A.addView(layoutInflaterFactory2C0656r3.f4006C, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0656r3.f4006C;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0656r3.f4006C;
                    view5.setBackgroundColor((x90.m2659g(view5) & 8192) != 0 ? AbstractC0666rd.m2288a(context, R.color.abc_decor_view_status_guard_light) : AbstractC0666rd.m2288a(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0656r3.f4011H && z) {
                    iM519d2 = 0;
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
                layoutInflaterFactory2C0656r3.f4049v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0656r3.f4006C;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        if (iM519d != iM519d2) {
            int iM517b2 = bd0Var.m517b();
            int iM518c2 = bd0Var.m518c();
            int iM516a = bd0Var.m516a();
            int i6 = Build.VERSION.SDK_INT;
            rc0 qc0Var = i6 >= 30 ? new qc0(bd0Var) : i6 >= 29 ? new pc0(bd0Var) : new nc0(bd0Var);
            qc0Var.mo1946g(C0346ip.m1524b(iM517b2, iM519d2, iM518c2, iM516a));
            bd0VarMo1944b = qc0Var.mo1944b();
        } else {
            bd0VarMo1944b = bd0Var;
        }
        WeakHashMap weakHashMap2 = oa0.f3426a;
        WindowInsets windowInsetsM520f = bd0VarMo1944b.m520f();
        if (windowInsetsM520f == null) {
            return bd0VarMo1944b;
        }
        WindowInsets windowInsetsM505b = ba0.m505b(view, windowInsetsM520f);
        return !windowInsetsM505b.equals(windowInsetsM520f) ? bd0.m515g(view, windowInsetsM505b) : bd0VarMo1944b;
    }

    @Override // p000.InterfaceC0425kv
    /* JADX INFO: renamed from: q */
    public boolean mo1135q(MenuC0646qu menuC0646qu) {
        Window.Callback callback;
        switch (this.f1865a) {
            case Base64.NO_WRAP /* 2 */:
                Window.Callback callback2 = this.f1866b.f4039l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0646qu);
                }
                break;
            default:
                if (menuC0646qu == menuC0646qu.mo1570k()) {
                    LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = this.f1866b;
                    if (layoutInflaterFactory2C0656r3.f4009F && (callback = layoutInflaterFactory2C0656r3.f4039l.getCallback()) != null && !layoutInflaterFactory2C0656r3.f4020Q) {
                        callback.onMenuOpened(108, menuC0646qu);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
