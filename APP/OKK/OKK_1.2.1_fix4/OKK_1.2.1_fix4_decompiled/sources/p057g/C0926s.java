package p057g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: renamed from: g.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0926s {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f3289b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static C0926s f3290c;

    /* JADX INFO: renamed from: a */
    public C0933v0 f3291a;

    /* JADX INFO: renamed from: b */
    public static synchronized void m2259b() {
        if (f3290c == null) {
            C0926s c0926s = new C0926s();
            f3290c = c0926s;
            c0926s.f3291a = C0933v0.m2263c();
            C0933v0 c0933v0 = f3290c.f3291a;
            C0924r c0924r = new C0924r();
            synchronized (c0933v0) {
                c0933v0.f3314e = c0924r;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2260c(Drawable drawable, C0853C0 c0853c0, int[] iArr) {
        PorterDuff.Mode mode = C0933v0.f3307f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z2 = c0853c0.f3087d;
            if (!z2 && !c0853c0.f3086c) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterM2264g = null;
            ColorStateList colorStateList = z2 ? c0853c0.f3084a : null;
            PorterDuff.Mode mode2 = c0853c0.f3086c ? c0853c0.f3085b : C0933v0.f3307f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterM2264g = C0933v0.m2264g(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterM2264g);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized Drawable m2261a(Context context, int i2) {
        return this.f3291a.m2268e(context, i2);
    }
}
