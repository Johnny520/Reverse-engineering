package p000;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import io.github.cherrywechat.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: s3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2483s3 implements InterfaceC1470gt, InterfaceC2626vb, InterfaceC0120Cr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8733a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0176E3 f8734b;

    public /* synthetic */ C2483s3(LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3, int i) {
        this.f8733a = i;
        this.f8734b = layoutInflaterFactory2C0176E3;
    }

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: b */
    public void mo193b(MenuC2204lr menuC2204lr, boolean z) {
        C0133D3 c0133d3;
        switch (this.f8733a) {
            case 2:
                this.f8734b.m353r(menuC2204lr);
                break;
            default:
                MenuC2204lr menuC2204lrMo430k = menuC2204lr.mo430k();
                int i = 0;
                boolean z2 = menuC2204lrMo430k != menuC2204lr;
                if (z2) {
                    menuC2204lr = menuC2204lrMo430k;
                }
                LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = this.f8734b;
                C0133D3[] c0133d3Arr = layoutInflaterFactory2C0176E3.f471L;
                int length = c0133d3Arr != null ? c0133d3Arr.length : 0;
                while (true) {
                    if (i >= length) {
                        c0133d3 = null;
                    } else {
                        c0133d3 = c0133d3Arr[i];
                        if (c0133d3 == null || c0133d3.f336h != menuC2204lr) {
                            i++;
                        }
                    }
                }
                if (c0133d3 != null) {
                    if (!z2) {
                        layoutInflaterFactory2C0176E3.m354s(c0133d3, z);
                    } else {
                        layoutInflaterFactory2C0176E3.m352q(c0133d3.f329a, c0133d3, menuC2204lrMo430k);
                        layoutInflaterFactory2C0176E3.m354s(c0133d3, true);
                    }
                }
                break;
        }
    }

    @Override // p000.InterfaceC1470gt
    public C0489LF onApplyWindowInsets(View view, C0489LF c0489lf) {
        boolean z;
        boolean z2;
        int iM943d = c0489lf.m943d();
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = this.f8734b;
        Context context = layoutInflaterFactory2C0176E3.f494k;
        int iM943d2 = c0489lf.m943d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0176E3.f505v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0176E3.f505v.getLayoutParams();
            if (layoutInflaterFactory2C0176E3.f505v.isShown()) {
                if (layoutInflaterFactory2C0176E3.f488c0 == null) {
                    layoutInflaterFactory2C0176E3.f488c0 = new Rect();
                    layoutInflaterFactory2C0176E3.f489d0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0176E3.f488c0;
                Rect rect2 = layoutInflaterFactory2C0176E3.f489d0;
                rect.set(c0489lf.m941b(), c0489lf.m943d(), c0489lf.m942c(), c0489lf.m940a());
                ViewGroup viewGroup = layoutInflaterFactory2C0176E3.f460A;
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC0531ME.m1026a(viewGroup, rect, rect2);
                } else {
                    if (!AbstractC0585Nj.f1903h) {
                        AbstractC0585Nj.f1903h = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            AbstractC0585Nj.f1904i = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                AbstractC0585Nj.f1904i.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = AbstractC0585Nj.f1904i;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C0176E3.f460A;
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                C0489LF c0489lfM2675a = AbstractC1404fE.m2675a(viewGroup2);
                int iM941b = c0489lfM2675a == null ? 0 : c0489lfM2675a.m941b();
                int iM942c = c0489lfM2675a == null ? 0 : c0489lfM2675a.m942c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || layoutInflaterFactory2C0176E3.f462C != null) {
                    View view2 = layoutInflaterFactory2C0176E3.f462C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iM941b || marginLayoutParams2.rightMargin != iM942c) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iM941b;
                            marginLayoutParams2.rightMargin = iM942c;
                            layoutInflaterFactory2C0176E3.f462C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0176E3.f462C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM941b;
                    layoutParams.rightMargin = iM942c;
                    layoutInflaterFactory2C0176E3.f460A.addView(layoutInflaterFactory2C0176E3.f462C, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0176E3.f462C;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0176E3.f462C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0176E3.f467H && z) {
                    iM943d2 = 0;
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
                layoutInflaterFactory2C0176E3.f505v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0176E3.f462C;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        return AbstractC2185lE.m4394g(view, iM943d != iM943d2 ? c0489lf.m944f(c0489lf.m941b(), iM943d2, c0489lf.m942c(), c0489lf.m940a()) : c0489lf);
    }

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: s */
    public boolean mo194s(MenuC2204lr menuC2204lr) {
        Window.Callback callback;
        switch (this.f8733a) {
            case 2:
                Window.Callback callback2 = this.f8734b.f495l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC2204lr);
                }
                break;
            default:
                if (menuC2204lr == menuC2204lr.mo430k()) {
                    LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = this.f8734b;
                    if (layoutInflaterFactory2C0176E3.f465F && (callback = layoutInflaterFactory2C0176E3.f495l.getCallback()) != null && !layoutInflaterFactory2C0176E3.f476Q) {
                        callback.onMenuOpened(108, menuC2204lr);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
