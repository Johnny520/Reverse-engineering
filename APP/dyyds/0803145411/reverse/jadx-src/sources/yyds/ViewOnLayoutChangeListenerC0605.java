package yyds;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛳᛵᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC0605 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2898;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup viewGroup;
        EnumC2097 enumC2097;
        Object c2658;
        C2617 c2617;
        C1111 c1111;
        WeakReference weakReference;
        Drawable drawable;
        switch (this.f2898) {
            case 0:
                viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup == null) {
                    return;
                }
                Map map = C1784.f8997;
                AbstractC2328.m4341(-1008384879526766L);
                synchronized (map) {
                    enumC2097 = (EnumC2097) map.get(viewGroup);
                }
                if (enumC2097 == null) {
                    return;
                }
                C1784.f9011.m3567(viewGroup, enumC2097, false, false);
                return;
            case 1:
                C2153 c2153 = C2153.f10615;
                try {
                    viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    if (viewGroup != null) {
                        Map map2 = C2153.f10614;
                        AbstractC2328.m4341(-820742053331822L);
                        synchronized (map2) {
                            c2617 = (C2617) map2.get(viewGroup);
                        }
                        if (c2617 != null && c2617.f12864) {
                            c2153.getClass();
                            C2153.m4104(viewGroup, c2617, false);
                        }
                    }
                    c2658 = C2746.f13459;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 != null) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-820767823135598L), thM4249);
                    return;
                }
                return;
            default:
                viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup == null) {
                    return;
                }
                C0615.f2981.getClass();
                Map map3 = C0615.f2980;
                AbstractC2328.m4341(-997613101548398L);
                synchronized (map3) {
                    c1111 = (C1111) map3.get(viewGroup);
                }
                if (c1111 == null || (weakReference = c1111.f5122) == null || (drawable = (Drawable) weakReference.get()) == null) {
                    return;
                }
                C0615.m1510(viewGroup, drawable);
                viewGroup.invalidate();
                return;
        }
    }
}
