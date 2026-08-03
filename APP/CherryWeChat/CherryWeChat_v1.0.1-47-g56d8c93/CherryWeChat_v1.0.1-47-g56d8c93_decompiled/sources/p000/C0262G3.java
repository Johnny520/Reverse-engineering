package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: renamed from: G3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0262G3 {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f842b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static C0262G3 f843c;

    /* JADX INFO: renamed from: a */
    public C2776yw f844a;

    /* JADX INFO: renamed from: a */
    public static synchronized C0262G3 m539a() {
        try {
            if (f843c == null) {
                m541d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f843c;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized PorterDuffColorFilter m540c(int i, PorterDuff.Mode mode) {
        return C2776yw.m5348e(i, mode);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m541d() {
        if (f843c == null) {
            C0262G3 c0262g3 = new C0262G3();
            f843c = c0262g3;
            c0262g3.f844a = C2776yw.m5347b();
            C2776yw c2776yw = f843c.f844a;
            C0252Fu c0252Fu = new C0252Fu();
            synchronized (c2776yw) {
                c2776yw.f9433e = c0252Fu;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m542e(Drawable drawable, C2090jB c2090jB, int[] iArr) {
        PorterDuff.Mode mode = C2776yw.f9426f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = c2090jB.f7361d;
            if (!z && !c2090jB.f7360c) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterM5348e = null;
            ColorStateList colorStateList = z ? c2090jB.f7358a : null;
            PorterDuff.Mode mode2 = c2090jB.f7360c ? c2090jB.f7359b : C2776yw.f9426f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterM5348e = C2776yw.m5348e(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterM5348e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Drawable m543b(Context context, int i) {
        return this.f844a.m5350c(context, i);
    }
}
