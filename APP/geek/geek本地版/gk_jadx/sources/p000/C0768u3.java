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
public final class C0768u3 {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f4653b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static C0768u3 f4654c;

    /* JADX INFO: renamed from: a */
    public w00 f4655a;

    /* JADX INFO: renamed from: a */
    public static synchronized C0768u3 m2404a() {
        try {
            if (f4654c == null) {
                m2406d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4654c;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized PorterDuffColorFilter m2405c(int i, PorterDuff.Mode mode) {
        return w00.m2538e(i, mode);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m2406d() {
        if (f4654c == null) {
            C0768u3 c0768u3 = new C0768u3();
            f4654c = c0768u3;
            c0768u3.f4655a = w00.m2537b();
            w00 w00Var = f4654c.f4655a;
            C0731t3 c0731t3 = new C0731t3();
            synchronized (w00Var) {
                w00Var.f4900e = c0731t3;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2407e(Drawable drawable, y60 y60Var, int[] iArr) {
        PorterDuff.Mode mode = w00.f4893f;
        int[] state = drawable.getState();
        int[] iArr2 = AbstractC0187eh.f1774a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = y60Var.f5282d;
        if (!z && !y60Var.f5281c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterM2538e = null;
        ColorStateList colorStateList = z ? y60Var.f5279a : null;
        PorterDuff.Mode mode2 = y60Var.f5281c ? y60Var.f5280b : w00.f4893f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterM2538e = w00.m2538e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterM2538e);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Drawable m2408b(Context context, int i) {
        return this.f4655a.m2540c(context, i);
    }
}
