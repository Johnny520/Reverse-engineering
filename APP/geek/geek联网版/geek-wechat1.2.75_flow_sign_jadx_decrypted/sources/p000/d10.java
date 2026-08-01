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
public final class d10 {

    /* JADX INFO: renamed from: g */
    public static d10 f1285g;

    /* JADX INFO: renamed from: a */
    public WeakHashMap f1287a;

    /* JADX INFO: renamed from: b */
    public final WeakHashMap f1288b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public TypedValue f1289c;

    /* JADX INFO: renamed from: d */
    public boolean f1290d;

    /* JADX INFO: renamed from: e */
    public C0730t3 f1291e;

    /* JADX INFO: renamed from: f */
    public static final PorterDuff.Mode f1284f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h */
    public static final c10 f1286h = new c10(6);

    /* JADX INFO: renamed from: b */
    public static synchronized d10 m817b() {
        try {
            if (f1285g == null) {
                f1285g = new d10();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1285g;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized PorterDuffColorFilter m818e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        c10 c10Var = f1286h;
        c10Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c10Var.m1412a(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m819a(Context context, int i) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f1289c == null) {
            this.f1289c = new TypedValue();
        }
        TypedValue typedValue = this.f1289c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            C0235fs c0235fs = (C0235fs) this.f1288b.get(context);
            drawableNewDrawable = null;
            if (c0235fs != null && (weakReference = (WeakReference) c0235fs.m1109c(j, null)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iM1254l = AbstractC0259gf.m1254l(c0235fs.f1825b, c0235fs.f1827d, j);
                    if (iM1254l >= 0) {
                        Object[] objArr = c0235fs.f1826c;
                        Object obj = objArr[iM1254l];
                        Object obj2 = C0235fs.f1823e;
                        if (obj != obj2) {
                            objArr[iM1254l] = obj2;
                            c0235fs.f1824a = true;
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableM2396c = null;
        if (this.f1291e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableM2396c = new LayerDrawable(new Drawable[]{m820c(context, R.drawable.abc_cab_background_internal_bg), m820c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableM2396c = C0730t3.m2396c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM2396c = C0730t3.m2396c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM2396c = C0730t3.m2396c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM2396c == null) {
            return layerDrawableM2396c;
        }
        layerDrawableM2396c.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM2396c.getConstantState();
                if (constantState2 != null) {
                    C0235fs c0235fs2 = (C0235fs) this.f1288b.get(context);
                    if (c0235fs2 == null) {
                        c0235fs2 = new C0235fs();
                        this.f1288b.put(context, c0235fs2);
                    }
                    c0235fs2.m1110d(j, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableM2396c;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Drawable m820c(Context context, int i) {
        return m821d(context, i, false);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Drawable m821d(Context context, int i, boolean z) {
        Drawable drawableM819a;
        try {
            if (!this.f1290d) {
                this.f1290d = true;
                Drawable drawableM820c = m820c(context, R.drawable.abc_vector_test);
                if (drawableM820c == null || (!(drawableM820c instanceof j90) && !"android.graphics.drawable.VectorDrawable".equals(drawableM820c.getClass().getName()))) {
                    this.f1290d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM819a = m819a(context, i);
            if (drawableM819a == null) {
                drawableM819a = AbstractC0629qd.m2148b(context, i);
            }
            if (drawableM819a != null) {
                drawableM819a = m823g(context, i, z, drawableM819a);
            }
            if (drawableM819a != null) {
                AbstractC0261gh.m1275a(drawableM819a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM819a;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized ColorStateList m822f(Context context, int i) {
        ColorStateList colorStateList;
        l40 l40Var;
        WeakHashMap weakHashMap = this.f1287a;
        ColorStateList colorStateListM2398d = null;
        colorStateList = (weakHashMap == null || (l40Var = (l40) weakHashMap.get(context)) == null) ? null : (ColorStateList) l40Var.m1734b(i, null);
        if (colorStateList == null) {
            C0730t3 c0730t3 = this.f1291e;
            if (c0730t3 != null) {
                colorStateListM2398d = c0730t3.m2398d(context, i);
            }
            if (colorStateListM2398d != null) {
                if (this.f1287a == null) {
                    this.f1287a = new WeakHashMap();
                }
                l40 l40Var2 = (l40) this.f1287a.get(context);
                if (l40Var2 == null) {
                    l40Var2 = new l40();
                    this.f1287a.put(context, l40Var2);
                }
                l40Var2.m1733a(i, colorStateListM2398d);
            }
            colorStateList = colorStateListM2398d;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable m823g(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d10.m823g(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
