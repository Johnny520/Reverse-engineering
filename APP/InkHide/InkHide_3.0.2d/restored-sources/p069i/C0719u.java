package p069i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: renamed from: i.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0719u {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f2437b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static C0719u f2438c;

    /* JADX INFO: renamed from: a */
    public C0635N0 f2439a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static synchronized C0719u m1367a() {
        try {
            if (f2438c == null) {
                m1368c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2438c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static synchronized void m1368c() {
        if (f2438c == null) {
            C0719u c0719u = new C0719u();
            f2438c = c0719u;
            c0719u.f2439a = C0635N0.m1251b();
            C0635N0 c0635n0 = f2438c.f2439a;
            C0716t c0716t = new C0716t();
            synchronized (c0635n0) {
                c0635n0.f2181e = c0716t;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m1369d(Drawable drawable, C0676f1 c0676f1, int[] iArr) {
        PorterDuff.Mode mode = C0635N0.f2174f;
        int[] state = drawable.getState();
        int[] iArr2 = AbstractC0705p0.f2378a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = c0676f1.f2290d;
        if (!z2 && !c0676f1.f2289c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterM1252e = null;
        ColorStateList colorStateList = z2 ? c0676f1.f2287a : null;
        PorterDuff.Mode mode2 = c0676f1.f2289c ? c0676f1.f2288b : C0635N0.f2174f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterM1252e = C0635N0.m1252e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterM1252e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized Drawable m1370b(Context context, int i2) {
        return this.f2439a.m1254c(context, i2);
    }
}
