package yyds;

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
import com.p000ss.android.ugc.aweme.yyds.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛵᲁᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1198 implements InterfaceC2208, InterfaceC0215, InterfaceC2407 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f5470;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C2181 f5471;

    public /* synthetic */ C1198(LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181, int i) {
        this.f5470 = i;
        this.f5471 = layoutInflaterFactory2C2181;
    }

    @Override // yyds.InterfaceC2407
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public void mo391(MenuC0836 menuC0836, boolean z) {
        C0182 c0182;
        int i = this.f5470;
        LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = this.f5471;
        switch (i) {
            case 2:
                layoutInflaterFactory2C2181.m4148(menuC0836);
                break;
            default:
                MenuC0836 menuC0836Mo1910 = menuC0836.mo1910();
                int i2 = 0;
                boolean z2 = menuC0836Mo1910 != menuC0836;
                if (z2) {
                    menuC0836 = menuC0836Mo1910;
                }
                C0182[] c0182Arr = layoutInflaterFactory2C2181.f10701;
                int length = c0182Arr != null ? c0182Arr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        c0182 = null;
                    } else {
                        c0182 = c0182Arr[i2];
                        if (c0182 == null || c0182.f1029 != menuC0836) {
                            i2++;
                        }
                    }
                }
                if (c0182 != null) {
                    if (!z2) {
                        layoutInflaterFactory2C2181.m4155(c0182, z);
                    } else {
                        layoutInflaterFactory2C2181.m4149(c0182.f1033, c0182, menuC0836Mo1910);
                        layoutInflaterFactory2C2181.m4155(c0182, true);
                    }
                }
                break;
        }
    }

    @Override // yyds.InterfaceC2407
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public boolean mo404(MenuC0836 menuC0836) {
        Window.Callback callback;
        int i = this.f5470;
        LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = this.f5471;
        switch (i) {
            case 2:
                Window.Callback callback2 = layoutInflaterFactory2C2181.f10676.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0836);
                }
                break;
            default:
                if (menuC0836 == menuC0836.mo1910() && layoutInflaterFactory2C2181.f10707 && (callback = layoutInflaterFactory2C2181.f10676.getCallback()) != null && !layoutInflaterFactory2C2181.f10678) {
                    callback.onMenuOpened(108, menuC0836);
                }
                break;
        }
        return true;
    }

    @Override // yyds.InterfaceC2208
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public C2693 mo1441(View view, C2693 c2693) {
        boolean z;
        C2693 c2693Mo1889;
        boolean z2;
        C2610 c2610 = c2693.f13242;
        int i = c2610.mo4551().f9414;
        LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = this.f5471;
        Context context = layoutInflaterFactory2C2181.f10680;
        int i2 = c2610.mo4551().f9414;
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C2181.f10695;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C2181.f10695.getLayoutParams();
            if (layoutInflaterFactory2C2181.f10695.isShown()) {
                if (layoutInflaterFactory2C2181.f10708 == null) {
                    layoutInflaterFactory2C2181.f10708 = new Rect();
                    layoutInflaterFactory2C2181.f29 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C2181.f10708;
                Rect rect2 = layoutInflaterFactory2C2181.f29;
                rect.set(c2610.mo4551().f9413, c2610.mo4551().f9414, c2610.mo4551().f9415, c2610.mo4551().f9416);
                ViewGroup viewGroup = layoutInflaterFactory2C2181.f10675;
                Method method = AbstractC1603.f8163;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i3 = rect.top;
                int i4 = rect.left;
                int i5 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C2181.f10675;
                WeakHashMap weakHashMap = AbstractC1640.f8352;
                C2693 c2693M3615 = AbstractC1852.m3615(viewGroup2);
                int i6 = c2693M3615 == null ? 0 : c2693M3615.f13242.mo4551().f9413;
                int i7 = c2693M3615 == null ? 0 : c2693M3615.f13242.mo4551().f9415;
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 <= 0 || layoutInflaterFactory2C2181.f10712 != null) {
                    View view2 = layoutInflaterFactory2C2181.f10712;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i8 = marginLayoutParams2.height;
                        int i9 = marginLayoutParams.topMargin;
                        if (i8 != i9 || marginLayoutParams2.leftMargin != i6 || marginLayoutParams2.rightMargin != i7) {
                            marginLayoutParams2.height = i9;
                            marginLayoutParams2.leftMargin = i6;
                            marginLayoutParams2.rightMargin = i7;
                            layoutInflaterFactory2C2181.f10712.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C2181.f10712 = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i6;
                    layoutParams.rightMargin = i7;
                    layoutInflaterFactory2C2181.f10675.addView(layoutInflaterFactory2C2181.f10712, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C2181.f10712;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C2181.f10712;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C2181.f10679 && z) {
                    i2 = 0;
                }
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            if (z2) {
                layoutInflaterFactory2C2181.f10695.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C2181.f10712;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        if (i != i2) {
            int i10 = c2610.mo4551().f9413;
            int i11 = c2610.mo4551().f9415;
            int i12 = c2610.mo4551().f9416;
            int i13 = Build.VERSION.SDK_INT;
            AbstractC0821 c1193 = i13 >= 36 ? new C1193(c2693) : i13 >= 35 ? new C1459(c2693) : i13 >= 34 ? new C0018(c2693) : i13 >= 31 ? new C0021(c2693) : new C1370(c2693);
            c1193.m1890(C1870.m3654(i10, i2, i11, i12));
            c2693Mo1889 = c1193.mo1889();
        } else {
            c2693Mo1889 = c2693;
        }
        WeakHashMap weakHashMap2 = AbstractC1640.f8352;
        WindowInsets windowInsetsM4784 = c2693Mo1889.m4784();
        if (windowInsetsM4784 == null) {
            return c2693Mo1889;
        }
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsM4784);
        return !windowInsetsOnApplyWindowInsets.equals(windowInsetsM4784) ? C2693.m4783(view, windowInsetsOnApplyWindowInsets) : c2693Mo1889;
    }
}
