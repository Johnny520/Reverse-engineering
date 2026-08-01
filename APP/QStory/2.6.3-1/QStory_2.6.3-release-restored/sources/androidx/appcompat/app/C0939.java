package androidx.appcompat.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AbstractC0995;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.InterfaceC1066;
import androidx.core.view.AbstractC3022;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3058;
import androidx.core.view.InterfaceC3038;
import com.alibaba.fastjson2.AbstractC3738;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p206.InterfaceC8618;
import p206.MenuC8631;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0939 implements InterfaceC3038, InterfaceC1066, InterfaceC8618 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C0915 f608;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f609;

    public /* synthetic */ C0939(LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915, int i) {
        this.f609 = i;
        this.f608 = layoutInflaterFactory2C0915;
    }

    @Override // p206.InterfaceC8618
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo750(MenuC8631 menuC8631, boolean z) {
        C0916 c0916;
        int i = this.f609;
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = this.f608;
        switch (i) {
            case 2:
                layoutInflaterFactory2C0915.m792(menuC8631);
                break;
            default:
                MenuC8631 menuC8631Mo13690 = menuC8631.mo13690();
                int i2 = 0;
                boolean z2 = menuC8631Mo13690 != menuC8631;
                if (z2) {
                    menuC8631 = menuC8631Mo13690;
                }
                C0916[] c0916Arr = layoutInflaterFactory2C0915.f544;
                int length = c0916Arr != null ? c0916Arr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        c0916 = null;
                    } else {
                        c0916 = c0916Arr[i2];
                        if (c0916 == null || c0916.f558 != menuC8631) {
                            i2++;
                        }
                    }
                }
                if (c0916 != null) {
                    if (!z2) {
                        layoutInflaterFactory2C0915.m791(c0916, z);
                    } else {
                        layoutInflaterFactory2C0915.m797(c0916.f553, c0916, menuC8631Mo13690);
                        layoutInflaterFactory2C0915.m791(c0916, true);
                    }
                }
                break;
        }
    }

    @Override // p206.InterfaceC8618
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public boolean mo757(MenuC8631 menuC8631) {
        Window.Callback callback;
        int i = this.f609;
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = this.f608;
        switch (i) {
            case 2:
                Window.Callback callback2 = layoutInflaterFactory2C0915.f513.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC8631);
                }
                break;
            default:
                if (menuC8631 == menuC8631.mo13690() && layoutInflaterFactory2C0915.f498 && (callback = layoutInflaterFactory2C0915.f513.getCallback()) != null && !layoutInflaterFactory2C0915.f526) {
                    callback.onMenuOpened(108, menuC8631);
                }
                break;
        }
        return true;
    }

    @Override // androidx.core.view.InterfaceC3038
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C3058 mo863(View view, C3058 c3058) {
        boolean z;
        boolean z2;
        int iM4625 = c3058.m4625();
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = this.f608;
        Context context = layoutInflaterFactory2C0915.f514;
        int iM46252 = c3058.m4625();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0915.f507;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0915.f507.getLayoutParams();
            if (layoutInflaterFactory2C0915.f507.isShown()) {
                if (layoutInflaterFactory2C0915.f530 == null) {
                    layoutInflaterFactory2C0915.f530 = new Rect();
                    layoutInflaterFactory2C0915.f533 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0915.f530;
                Rect rect2 = layoutInflaterFactory2C0915.f533;
                rect.set(c3058.m4627(), c3058.m4625(), c3058.m4626(), c3058.m4628());
                ViewGroup viewGroup = layoutInflaterFactory2C0915.f505;
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC0995.m1162(viewGroup, rect, rect2);
                } else {
                    if (!AbstractC3738.f9593) {
                        AbstractC3738.f9593 = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            AbstractC3738.f9591 = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                AbstractC3738.f9591.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = AbstractC3738.f9591;
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
                ViewGroup viewGroup2 = layoutInflaterFactory2C0915.f505;
                WeakHashMap weakHashMap = AbstractC3103.f6939;
                C3058 c3058M4553 = AbstractC3022.m4553(viewGroup2);
                int iM4627 = c3058M4553 == null ? 0 : c3058M4553.m4627();
                int iM4626 = c3058M4553 == null ? 0 : c3058M4553.m4626();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || layoutInflaterFactory2C0915.f500 != null) {
                    View view2 = layoutInflaterFactory2C0915.f500;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iM4627 || marginLayoutParams2.rightMargin != iM4626) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iM4627;
                            marginLayoutParams2.rightMargin = iM4626;
                            layoutInflaterFactory2C0915.f500.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0915.f500 = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM4627;
                    layoutParams.rightMargin = iM4626;
                    layoutInflaterFactory2C0915.f505.addView(layoutInflaterFactory2C0915.f500, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0915.f500;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0915.f500;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(C0328R.color.abc_decor_view_status_guard_light) : context.getColor(C0328R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0915.f543 && z) {
                    iM46252 = 0;
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
                layoutInflaterFactory2C0915.f507.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0915.f500;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        return AbstractC3103.m4810(view, iM4625 != iM46252 ? c3058.m4624(c3058.m4627(), iM46252, c3058.m4626(), c3058.m4628()) : c3058);
    }
}
