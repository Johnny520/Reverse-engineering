package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: renamed from: u3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0767u3 {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f4621b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static C0767u3 f4622c;

    /* JADX INFO: renamed from: a */
    public d10 f4623a;

    /* JADX INFO: renamed from: a */
    public static synchronized C0767u3 m2425a() {
        try {
            if (f4622c == null) {
                m2427d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4622c;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized PorterDuffColorFilter m2426c(int i, PorterDuff.Mode mode) {
        return d10.m818e(i, mode);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m2427d() {
        if (f4622c == null) {
            C0767u3 c0767u3 = new C0767u3();
            f4622c = c0767u3;
            c0767u3.f4623a = d10.m817b();
            d10 d10Var = f4622c.f4623a;
            C0730t3 c0730t3 = new C0730t3();
            synchronized (d10Var) {
                d10Var.f1291e = c0730t3;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2428e(Drawable drawable, e70 e70Var, int[] iArr) {
        PorterDuff.Mode mode = d10.f1284f;
        int[] state = drawable.getState();
        int[] iArr2 = AbstractC0261gh.f1985a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = e70Var.f1525d;
        if (!z && !e70Var.f1524c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterM818e = null;
        ColorStateList colorStateList = z ? e70Var.f1522a : null;
        PorterDuff.Mode mode2 = e70Var.f1524c ? e70Var.f1523b : d10.f1284f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterM818e = d10.m818e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterM818e);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Drawable m2429b(Context context, int i) {
        return this.f4623a.m820c(context, i);
    }
}
