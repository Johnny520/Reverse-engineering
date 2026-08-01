package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.ljx.wechatmod.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w00 {

    /* JADX INFO: renamed from: g */
    public static w00 f4894g;

    /* JADX INFO: renamed from: a */
    public WeakHashMap f4896a;

    /* JADX INFO: renamed from: b */
    public final WeakHashMap f4897b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public TypedValue f4898c;

    /* JADX INFO: renamed from: d */
    public boolean f4899d;

    /* JADX INFO: renamed from: e */
    public C0731t3 f4900e;

    /* JADX INFO: renamed from: f */
    public static final PorterDuff.Mode f4893f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h */
    public static final v00 f4895h = new v00(6);

    /* JADX INFO: renamed from: b */
    public static synchronized w00 m2537b() {
        try {
            if (f4894g == null) {
                f4894g = new w00();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4894g;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized PorterDuffColorFilter m2538e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        v00 v00Var = f4895h;
        v00Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) v00Var.m957a(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m2539a(Context context, int i) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f4898c == null) {
            this.f4898c = new TypedValue();
        }
        TypedValue typedValue = this.f4898c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            C0079bs c0079bs = (C0079bs) this.f4897b.get(context);
            drawableNewDrawable = null;
            if (c0079bs != null && (weakReference = (WeakReference) c0079bs.m566c(j, null)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iM1185d = AbstractC0222ff.m1185d(c0079bs.f825b, c0079bs.f827d, j);
                    if (iM1185d >= 0) {
                        Object[] objArr = c0079bs.f826c;
                        Object obj = objArr[iM1185d];
                        Object obj2 = C0079bs.f823e;
                        if (obj != obj2) {
                            objArr[iM1185d] = obj2;
                            c0079bs.f824a = true;
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableM2355c = null;
        if (this.f4900e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableM2355c = new LayerDrawable(new Drawable[]{m2540c(context, R.drawable.abc_cab_background_internal_bg), m2540c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableM2355c = C0731t3.m2355c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM2355c = C0731t3.m2355c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM2355c = C0731t3.m2355c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM2355c == null) {
            return layerDrawableM2355c;
        }
        layerDrawableM2355c.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM2355c.getConstantState();
                if (constantState2 != null) {
                    C0079bs c0079bs2 = (C0079bs) this.f4897b.get(context);
                    if (c0079bs2 == null) {
                        c0079bs2 = new C0079bs();
                        this.f4897b.put(context, c0079bs2);
                    }
                    c0079bs2.m567d(j, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableM2355c;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Drawable m2540c(Context context, int i) {
        return m2541d(context, i, false);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Drawable m2541d(Context context, int i, boolean z) {
        Drawable drawableM2539a;
        try {
            if (!this.f4899d) {
                this.f4899d = true;
                Drawable drawableM2540c = m2540c(context, R.drawable.abc_vector_test);
                if (drawableM2540c == null || (!(drawableM2540c instanceof e90) && !"android.graphics.drawable.VectorDrawable".equals(drawableM2540c.getClass().getName()))) {
                    this.f4899d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM2539a = m2539a(context, i);
            if (drawableM2539a == null) {
                drawableM2539a = AbstractC0257gd.m1270b(context, i);
            }
            if (drawableM2539a != null) {
                drawableM2539a = m2543g(context, i, z, drawableM2539a);
            }
            if (drawableM2539a != null) {
                AbstractC0187eh.m1027a(drawableM2539a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM2539a;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized ColorStateList m2542f(Context context, int i) {
        ColorStateList colorStateList;
        e40 e40Var;
        WeakHashMap weakHashMap = this.f4896a;
        ColorStateList colorStateListM2357d = null;
        colorStateList = (weakHashMap == null || (e40Var = (e40) weakHashMap.get(context)) == null) ? null : (ColorStateList) e40Var.m984b(i, null);
        if (colorStateList == null) {
            C0731t3 c0731t3 = this.f4900e;
            if (c0731t3 != null) {
                colorStateListM2357d = c0731t3.m2357d(context, i);
            }
            if (colorStateListM2357d != null) {
                if (this.f4896a == null) {
                    this.f4896a = new WeakHashMap();
                }
                e40 e40Var2 = (e40) this.f4896a.get(context);
                if (e40Var2 == null) {
                    e40Var2 = new e40();
                    this.f4896a.put(context, e40Var2);
                }
                e40Var2.m983a(i, colorStateListM2357d);
            }
            colorStateList = colorStateListM2357d;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable m2543g(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w00.m2543g(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
