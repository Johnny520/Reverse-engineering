package androidx.appcompat.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AbstractC0148;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.InterfaceC0219;
import androidx.core.view.AbstractC2189;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2225;
import androidx.core.view.InterfaceC2205;
import com.alibaba.fastjson2.AbstractC2904;
import com.davemorrissey.labs.subscaleview.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p190.InterfaceC7788;
import p190.MenuC7801;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0092 implements InterfaceC2205, InterfaceC0219, InterfaceC7788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C0068 f263;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f264;

    public /* synthetic */ C0092(LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068, int i) {
        this.f264 = i;
        this.f263 = layoutInflaterFactory2C0068;
    }

    @Override // p190.InterfaceC7788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo189(MenuC7801 menuC7801, boolean z) {
        C0069 c0069;
        int i = this.f264;
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = this.f263;
        switch (i) {
            case 2:
                layoutInflaterFactory2C0068.m231(menuC7801);
                break;
            default:
                MenuC7801 menuC7801Mo13103 = menuC7801.mo13103();
                int i2 = 0;
                boolean z2 = menuC7801Mo13103 != menuC7801;
                if (z2) {
                    menuC7801 = menuC7801Mo13103;
                }
                C0069[] c0069Arr = layoutInflaterFactory2C0068.f199;
                int length = c0069Arr != null ? c0069Arr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        c0069 = null;
                    } else {
                        c0069 = c0069Arr[i2];
                        if (c0069 == null || c0069.f213 != menuC7801) {
                            i2++;
                        }
                    }
                }
                if (c0069 != null) {
                    if (!z2) {
                        layoutInflaterFactory2C0068.m230(c0069, z);
                    } else {
                        layoutInflaterFactory2C0068.m236(c0069.f208, c0069, menuC7801Mo13103);
                        layoutInflaterFactory2C0068.m230(c0069, true);
                    }
                }
                break;
        }
    }

    @Override // p190.InterfaceC7788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public boolean mo196(MenuC7801 menuC7801) {
        Window.Callback callback;
        int i = this.f264;
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = this.f263;
        switch (i) {
            case 2:
                Window.Callback callback2 = layoutInflaterFactory2C0068.f168.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC7801);
                }
                break;
            default:
                if (menuC7801 == menuC7801.mo13103() && layoutInflaterFactory2C0068.f153 && (callback = layoutInflaterFactory2C0068.f168.getCallback()) != null && !layoutInflaterFactory2C0068.f181) {
                    callback.onMenuOpened(108, menuC7801);
                }
                break;
        }
        return true;
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C2225 mo302(View view, C2225 c2225) {
        boolean z;
        boolean z2;
        int iM4055 = c2225.m4055();
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = this.f263;
        Context context = layoutInflaterFactory2C0068.f169;
        int iM40552 = c2225.m4055();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0068.f162;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0068.f162.getLayoutParams();
            if (layoutInflaterFactory2C0068.f162.isShown()) {
                if (layoutInflaterFactory2C0068.f185 == null) {
                    layoutInflaterFactory2C0068.f185 = new Rect();
                    layoutInflaterFactory2C0068.f188 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0068.f185;
                Rect rect2 = layoutInflaterFactory2C0068.f188;
                rect.set(c2225.m4057(), c2225.m4055(), c2225.m4056(), c2225.m4058());
                ViewGroup viewGroup = layoutInflaterFactory2C0068.f160;
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC0148.m601(viewGroup, rect, rect2);
                } else {
                    if (!AbstractC2904.f9245) {
                        AbstractC2904.f9245 = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            AbstractC2904.f9244 = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                AbstractC2904.f9244.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = AbstractC2904.f9244;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C0068.f160;
                WeakHashMap weakHashMap = AbstractC2270.f6593;
                C2225 c2225M3983 = AbstractC2189.m3983(viewGroup2);
                int iM4057 = c2225M3983 == null ? 0 : c2225M3983.m4057();
                int iM4056 = c2225M3983 == null ? 0 : c2225M3983.m4056();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || layoutInflaterFactory2C0068.f155 != null) {
                    View view2 = layoutInflaterFactory2C0068.f155;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iM4057 || marginLayoutParams2.rightMargin != iM4056) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iM4057;
                            marginLayoutParams2.rightMargin = iM4056;
                            layoutInflaterFactory2C0068.f155.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0068.f155 = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM4057;
                    layoutParams.rightMargin = iM4056;
                    layoutInflaterFactory2C0068.f160.addView(layoutInflaterFactory2C0068.f155, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0068.f155;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0068.f155;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0068.f198 && z) {
                    iM40552 = 0;
                }
                z = z;
                z = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z = false;
            }
            if (z) {
                layoutInflaterFactory2C0068.f162.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0068.f155;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        return AbstractC2270.m4240(view, iM4055 != iM40552 ? c2225.m4054(c2225.m4057(), iM40552, c2225.m4056(), c2225.m4058()) : c2225);
    }
}
