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
import com.alibaba.fastjson2.AbstractC2905;
import com.davemorrissey.labs.subscaleview.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p190.InterfaceC7789;
import p190.MenuC7802;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0092 implements InterfaceC2205, InterfaceC0219, InterfaceC7789 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C0068 f263;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f264;

    public /* synthetic */ C0092(LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068, int i) {
        this.f264 = i;
        this.f263 = layoutInflaterFactory2C0068;
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo190(MenuC7802 menuC7802, boolean z) {
        C0069 c0069;
        int i = this.f264;
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = this.f263;
        switch (i) {
            case 2:
                layoutInflaterFactory2C0068.m232(menuC7802);
                break;
            default:
                MenuC7802 menuC7802Mo13131 = menuC7802.mo13131();
                int i2 = 0;
                boolean z2 = menuC7802Mo13131 != menuC7802;
                if (z2) {
                    menuC7802 = menuC7802Mo13131;
                }
                C0069[] c0069Arr = layoutInflaterFactory2C0068.f199;
                int length = c0069Arr != null ? c0069Arr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        c0069 = null;
                    } else {
                        c0069 = c0069Arr[i2];
                        if (c0069 == null || c0069.f213 != menuC7802) {
                            i2++;
                        }
                    }
                }
                if (c0069 != null) {
                    if (!z2) {
                        layoutInflaterFactory2C0068.m231(c0069, z);
                    } else {
                        layoutInflaterFactory2C0068.m237(c0069.f208, c0069, menuC7802Mo13131);
                        layoutInflaterFactory2C0068.m231(c0069, true);
                    }
                }
                break;
        }
    }

    @Override // p190.InterfaceC7789
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public boolean mo197(MenuC7802 menuC7802) {
        Window.Callback callback;
        int i = this.f264;
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = this.f263;
        switch (i) {
            case 2:
                Window.Callback callback2 = layoutInflaterFactory2C0068.f168.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC7802);
                }
                break;
            default:
                if (menuC7802 == menuC7802.mo13131() && layoutInflaterFactory2C0068.f153 && (callback = layoutInflaterFactory2C0068.f168.getCallback()) != null && !layoutInflaterFactory2C0068.f181) {
                    callback.onMenuOpened(108, menuC7802);
                }
                break;
        }
        return true;
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C2225 mo303(View view, C2225 c2225) {
        boolean z;
        boolean z2;
        int iM4065 = c2225.m4065();
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = this.f263;
        Context context = layoutInflaterFactory2C0068.f169;
        int iM40652 = c2225.m4065();
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
                rect.set(c2225.m4067(), c2225.m4065(), c2225.m4066(), c2225.m4068());
                ViewGroup viewGroup = layoutInflaterFactory2C0068.f160;
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC0148.m602(viewGroup, rect, rect2);
                } else {
                    if (!AbstractC2905.f9248) {
                        AbstractC2905.f9248 = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            AbstractC2905.f9246 = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                AbstractC2905.f9246.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = AbstractC2905.f9246;
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
                WeakHashMap weakHashMap = AbstractC2270.f6594;
                C2225 c2225M3993 = AbstractC2189.m3993(viewGroup2);
                int iM4067 = c2225M3993 == null ? 0 : c2225M3993.m4067();
                int iM4066 = c2225M3993 == null ? 0 : c2225M3993.m4066();
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
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iM4067 || marginLayoutParams2.rightMargin != iM4066) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iM4067;
                            marginLayoutParams2.rightMargin = iM4066;
                            layoutInflaterFactory2C0068.f155.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0068.f155 = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM4067;
                    layoutParams.rightMargin = iM4066;
                    layoutInflaterFactory2C0068.f160.addView(layoutInflaterFactory2C0068.f155, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0068.f155;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0068.f155;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0068.f198 && z) {
                    iM40652 = 0;
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
        return AbstractC2270.m4250(view, iM4065 != iM40652 ? c2225.m4064(c2225.m4067(), iM40652, c2225.m4066(), c2225.m4068()) : c2225);
    }
}
