package p069i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.p055lu.wxmask272.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p030P.AbstractC0234a;
import p075l.AbstractC0746d;
import p075l.C0747e;
import p075l.C0754l;
import p082p.AbstractC0783a;
import p087s.AbstractC0962a;

/* JADX INFO: renamed from: i.N0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0635N0 {

    /* JADX INFO: renamed from: g */
    public static C0635N0 f2175g;

    /* JADX INFO: renamed from: a */
    public WeakHashMap f2177a;

    /* JADX INFO: renamed from: b */
    public final WeakHashMap f2178b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public TypedValue f2179c;

    /* JADX INFO: renamed from: d */
    public boolean f2180d;

    /* JADX INFO: renamed from: e */
    public C0716t f2181e;

    /* JADX INFO: renamed from: f */
    public static final PorterDuff.Mode f2174f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h */
    public static final C0633M0 f2176h = new C0633M0(6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static synchronized C0635N0 m1251b() {
        try {
            if (f2175g == null) {
                f2175g = new C0635N0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2175g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static synchronized PorterDuffColorFilter m1252e(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C0633M0 c0633m0 = f2176h;
        c0633m0.getClass();
        int i3 = (31 + i2) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c0633m0.m1410a(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Drawable m1253a(Context context, int i2) {
        Drawable drawableNewDrawable;
        Object obj;
        int i3;
        if (this.f2179c == null) {
            this.f2179c = new TypedValue();
        }
        TypedValue typedValue = this.f2179c;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            C0747e c0747e = (C0747e) this.f2178b.get(context);
            drawableNewDrawable = null;
            if (c0747e != null) {
                int iM1407b = AbstractC0746d.m1407b(c0747e.f2530b, c0747e.f2532d, j2);
                if (iM1407b < 0 || (obj = c0747e.f2531c[iM1407b]) == C0747e.f2528e) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawableNewDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        int iM1407b2 = AbstractC0746d.m1407b(c0747e.f2530b, c0747e.f2532d, j2);
                        if (iM1407b2 >= 0) {
                            Object[] objArr = c0747e.f2531c;
                            Object obj2 = objArr[iM1407b2];
                            Object obj3 = C0747e.f2528e;
                            if (obj2 != obj3) {
                                objArr[iM1407b2] = obj3;
                                c0747e.f2529a = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableM1355j = null;
        if (this.f2181e != null) {
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawableM1355j = new LayerDrawable(new Drawable[]{m1254c(context, R.drawable.abc_cab_background_internal_bg), m1254c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i2 == R.drawable.abc_ratingbar_material) {
                layerDrawableM1355j = C0716t.m1355j(this, context, R.dimen.abc_star_big);
            } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM1355j = C0716t.m1355j(this, context, R.dimen.abc_star_medium);
            } else if (i2 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM1355j = C0716t.m1355j(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM1355j == null) {
            return layerDrawableM1355j;
        }
        layerDrawableM1355j.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM1355j.getConstantState();
                if (constantState2 != null) {
                    C0747e c0747e2 = (C0747e) this.f2178b.get(context);
                    if (c0747e2 == null) {
                        c0747e2 = new C0747e();
                        c0747e2.f2529a = false;
                        int i4 = 4;
                        while (true) {
                            i3 = 80;
                            if (i4 >= 32) {
                                break;
                            }
                            int i5 = (1 << i4) - 12;
                            if (80 <= i5) {
                                i3 = i5;
                                break;
                            }
                            i4++;
                        }
                        int i6 = i3 / 8;
                        c0747e2.f2530b = new long[i6];
                        c0747e2.f2531c = new Object[i6];
                        this.f2178b.put(context, c0747e2);
                    }
                    c0747e2.m1409b(j2, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableM1355j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final synchronized Drawable m1254c(Context context, int i2) {
        return m1255d(context, i2, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final synchronized Drawable m1255d(Context context, int i2, boolean z2) {
        Drawable drawableM1253a;
        try {
            if (!this.f2180d) {
                this.f2180d = true;
                Drawable drawableM1254c = m1254c(context, R.drawable.abc_vector_test);
                if (drawableM1254c == null || (!(drawableM1254c instanceof AbstractC0234a) && !"android.graphics.drawable.VectorDrawable".equals(drawableM1254c.getClass().getName()))) {
                    this.f2180d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM1253a = m1253a(context, i2);
            if (drawableM1253a == null) {
                drawableM1253a = AbstractC0783a.m1446b(context, i2);
            }
            if (drawableM1253a != null) {
                drawableM1253a = m1257g(context, i2, z2, drawableM1253a);
            }
            if (drawableM1253a != null) {
                AbstractC0705p0.m1336a(drawableM1253a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM1253a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final synchronized ColorStateList m1256f(Context context, int i2) {
        ColorStateList colorStateList;
        C0754l c0754l;
        Object obj;
        WeakHashMap weakHashMap = this.f2177a;
        ColorStateList colorStateListM1361k = null;
        if (weakHashMap == null || (c0754l = (C0754l) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int iM1406a = AbstractC0746d.m1406a(c0754l.f2560c, i2, c0754l.f2558a);
            if (iM1406a < 0 || (obj = c0754l.f2559b[iM1406a]) == C0754l.f2557d) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            C0716t c0716t = this.f2181e;
            if (c0716t != null) {
                colorStateListM1361k = c0716t.m1361k(context, i2);
            }
            if (colorStateListM1361k != null) {
                if (this.f2177a == null) {
                    this.f2177a = new WeakHashMap();
                }
                C0754l c0754l2 = (C0754l) this.f2177a.get(context);
                if (c0754l2 == null) {
                    c0754l2 = new C0754l();
                    this.f2177a.put(context, c0754l2);
                }
                c0754l2.m1421a(i2, colorStateListM1361k);
            }
            colorStateList = colorStateListM1361k;
        }
        return colorStateList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m1257g(Context context, int i2, boolean z2, Drawable drawable) {
        boolean z3;
        int iRound;
        PorterDuffColorFilter porterDuffColorFilterM1252e;
        int i3 = R.attr.colorControlNormal;
        int i4 = R.attr.colorControlActivated;
        ColorStateList colorStateListM1256f = m1256f(context, i2);
        PorterDuff.Mode mode = null;
        if (colorStateListM1256f != null) {
            int[] iArr = AbstractC0705p0.f2378a;
            Drawable drawableMutate = drawable.mutate();
            AbstractC0962a.m2143h(drawableMutate, colorStateListM1256f);
            if (this.f2181e != null && i2 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                AbstractC0962a.m2144i(drawableMutate, mode);
            }
            return drawableMutate;
        }
        if (this.f2181e != null) {
            if (i2 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iM1299c = AbstractC0670d1.m1299c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0719u.f2437b;
                C0716t.m1358p(drawableFindDrawableByLayerId, iM1299c, mode2);
                C0716t.m1358p(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC0670d1.m1299c(context, R.attr.colorControlNormal), mode2);
                C0716t.m1358p(layerDrawable.findDrawableByLayerId(android.R.id.progress), AbstractC0670d1.m1299c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iM1298b = AbstractC0670d1.m1298b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0719u.f2437b;
                C0716t.m1358p(drawableFindDrawableByLayerId2, iM1298b, mode3);
                C0716t.m1358p(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC0670d1.m1299c(context, R.attr.colorControlActivated), mode3);
                C0716t.m1358p(layerDrawable2.findDrawableByLayerId(android.R.id.progress), AbstractC0670d1.m1299c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C0716t c0716t = this.f2181e;
        boolean z4 = false;
        if (c0716t != null) {
            PorterDuff.Mode mode4 = C0719u.f2437b;
            if (C0716t.m1350c((int[]) c0716t.f2417a, i2)) {
                z3 = true;
                iRound = -1;
                if (z3) {
                }
            } else {
                if (!C0716t.m1350c((int[]) c0716t.f2419c, i2)) {
                    boolean zM1350c = C0716t.m1350c((int[]) c0716t.f2420d, i2);
                    i4 = android.R.attr.colorBackground;
                    if (zM1350c) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i2 == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i3 = android.R.attr.colorForeground;
                        z3 = true;
                        if (z3) {
                            int[] iArr2 = AbstractC0705p0.f2378a;
                            Drawable drawableMutate2 = drawable.mutate();
                            int iM1299c2 = AbstractC0670d1.m1299c(context, i3);
                            synchronized (C0719u.class) {
                                porterDuffColorFilterM1252e = m1252e(iM1299c2, mode4);
                            }
                            drawableMutate2.setColorFilter(porterDuffColorFilterM1252e);
                            if (iRound != -1) {
                                drawableMutate2.setAlpha(iRound);
                            }
                            z4 = true;
                        }
                    } else if (i2 != R.drawable.abc_dialog_material_background) {
                        i3 = 0;
                        z3 = false;
                        iRound = -1;
                        if (z3) {
                        }
                    }
                }
                i3 = i4;
                z3 = true;
                iRound = -1;
                if (z3) {
                }
            }
        }
        if (z4 || !z2) {
            return drawable;
        }
        return null;
    }
}
