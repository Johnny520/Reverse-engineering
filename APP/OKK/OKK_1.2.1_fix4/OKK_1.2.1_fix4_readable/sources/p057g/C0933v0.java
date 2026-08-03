package p057g;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.luckypray.dexkit.C1031R;
import p045Z.AbstractC0469a;
import p063j.AbstractC0959d;
import p063j.C0960e;
import p063j.C0967l;
import p082t.AbstractC1080a;
import p087w.AbstractC1111a;

/* JADX INFO: renamed from: g.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0933v0 {

    /* JADX INFO: renamed from: g */
    public static C0933v0 f3308g;

    /* JADX INFO: renamed from: a */
    public WeakHashMap f3310a;

    /* JADX INFO: renamed from: b */
    public final WeakHashMap f3311b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public TypedValue f3312c;

    /* JADX INFO: renamed from: d */
    public boolean f3313d;

    /* JADX INFO: renamed from: e */
    public C0924r f3314e;

    /* JADX INFO: renamed from: f */
    public static final PorterDuff.Mode f3307f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h */
    public static final C0931u0 f3309h = new C0931u0(6);

    /* JADX INFO: renamed from: c */
    public static synchronized C0933v0 m2263c() {
        try {
            if (f3308g == null) {
                f3308g = new C0933v0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3308g;
    }

    /* JADX INFO: renamed from: g */
    public static synchronized PorterDuffColorFilter m2264g(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C0931u0 c0931u0 = f3309h;
        c0931u0.getClass();
        int i3 = (31 + i2) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c0931u0.m2313a(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2265a(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C0960e c0960e = (C0960e) this.f3311b.get(context);
                if (c0960e == null) {
                    c0960e = new C0960e();
                    this.f3311b.put(context, c0960e);
                }
                c0960e.m2310e(j2, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Drawable m2266b(Context context, int i2) {
        if (this.f3312c == null) {
            this.f3312c = new TypedValue();
        }
        TypedValue typedValue = this.f3312c;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableM2267d = m2267d(context, j2);
        if (drawableM2267d != null) {
            return drawableM2267d;
        }
        LayerDrawable layerDrawableM2255c = null;
        if (this.f3314e != null) {
            if (i2 == C1031R.drawable.abc_cab_background_top_material) {
                layerDrawableM2255c = new LayerDrawable(new Drawable[]{m2268e(context, C1031R.drawable.abc_cab_background_internal_bg), m2268e(context, C1031R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i2 == C1031R.drawable.abc_ratingbar_material) {
                layerDrawableM2255c = C0924r.m2255c(this, context, C1031R.dimen.abc_star_big);
            } else if (i2 == C1031R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM2255c = C0924r.m2255c(this, context, C1031R.dimen.abc_star_medium);
            } else if (i2 == C1031R.drawable.abc_ratingbar_small_material) {
                layerDrawableM2255c = C0924r.m2255c(this, context, C1031R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM2255c != null) {
            layerDrawableM2255c.setChangingConfigurations(typedValue.changingConfigurations);
            m2265a(context, j2, layerDrawableM2255c);
        }
        return layerDrawableM2255c;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Drawable m2267d(Context context, long j2) {
        C0960e c0960e = (C0960e) this.f3311b.get(context);
        if (c0960e == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c0960e.m2309d(j2, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iM2305b = AbstractC0959d.m2305b(c0960e.f3406b, c0960e.f3408d, j2);
            if (iM2305b >= 0) {
                Object[] objArr = c0960e.f3407c;
                Object obj = objArr[iM2305b];
                Object obj2 = C0960e.f3404e;
                if (obj != obj2) {
                    objArr[iM2305b] = obj2;
                    c0960e.f3405a = true;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized Drawable m2268e(Context context, int i2) {
        return m2269f(context, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7 A[Catch: all -> 0x00d0, TryCatch #0 {, blocks: (B:3:0x0001, B:12:0x0026, B:14:0x002c, B:16:0x0032, B:18:0x0038, B:25:0x004e, B:23:0x004a, B:26:0x0053, B:30:0x006a, B:37:0x00a0, B:38:0x00c7, B:40:0x00cc, B:6:0x0006, B:8:0x0012, B:10:0x0016, B:47:0x00d5, B:48:0x00de), top: B:51:0x0001 }] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Drawable m2269f(Context context, int i2) {
        Drawable drawableM2266b;
        if (!this.f3313d) {
            this.f3313d = true;
            Drawable drawableM2268e = m2268e(context, C1031R.drawable.abc_vector_test);
            if (drawableM2268e == null || (!(drawableM2268e instanceof AbstractC0469a) && !"android.graphics.drawable.VectorDrawable".equals(drawableM2268e.getClass().getName()))) {
                this.f3313d = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        drawableM2266b = m2266b(context, i2);
        if (drawableM2266b == null) {
            drawableM2266b = AbstractC1080a.m2560b(context, i2);
        }
        if (drawableM2266b != null) {
            ColorStateList colorStateListM2270h = m2270h(context, i2);
            if (colorStateListM2270h != null) {
                drawableM2266b = drawableM2266b.mutate();
                AbstractC1111a.m2626h(drawableM2266b, colorStateListM2270h);
                PorterDuff.Mode mode = null;
                if (this.f3314e != null && i2 == C1031R.drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
                if (mode != null) {
                    AbstractC1111a.m2627i(drawableM2266b, mode);
                }
            } else if (this.f3314e == null) {
                m2271i(context, i2, drawableM2266b);
            } else if (i2 == C1031R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawableM2266b;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int iM2161c = AbstractC0849A0.m2161c(context, C1031R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0926s.f3289b;
                C0924r.m2256e(drawableFindDrawableByLayerId, iM2161c);
                C0924r.m2256e(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), AbstractC0849A0.m2161c(context, C1031R.attr.colorControlNormal));
                C0924r.m2256e(layerDrawable.findDrawableByLayerId(R.id.progress), AbstractC0849A0.m2161c(context, C1031R.attr.colorControlActivated));
            } else if (i2 == C1031R.drawable.abc_ratingbar_material || i2 == C1031R.drawable.abc_ratingbar_indicator_material || i2 == C1031R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawableM2266b;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
                int iM2160b = AbstractC0849A0.m2160b(context, C1031R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0926s.f3289b;
                C0924r.m2256e(drawableFindDrawableByLayerId2, iM2160b);
                C0924r.m2256e(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), AbstractC0849A0.m2161c(context, C1031R.attr.colorControlActivated));
                C0924r.m2256e(layerDrawable2.findDrawableByLayerId(R.id.progress), AbstractC0849A0.m2161c(context, C1031R.attr.colorControlActivated));
            }
        }
        if (drawableM2266b != null) {
            AbstractC0886W.m2219a(drawableM2266b);
        }
        return drawableM2266b;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized ColorStateList m2270h(Context context, int i2) {
        ColorStateList colorStateList;
        C0967l c0967l;
        WeakHashMap weakHashMap = this.f3310a;
        ColorStateList colorStateListM2257d = null;
        colorStateList = (weakHashMap == null || (c0967l = (C0967l) weakHashMap.get(context)) == null) ? null : (ColorStateList) c0967l.m2327c(i2, null);
        if (colorStateList == null) {
            C0924r c0924r = this.f3314e;
            if (c0924r != null) {
                colorStateListM2257d = c0924r.m2257d(context, i2);
            }
            if (colorStateListM2257d != null) {
                if (this.f3310a == null) {
                    this.f3310a = new WeakHashMap();
                }
                C0967l c0967l2 = (C0967l) this.f3310a.get(context);
                if (c0967l2 == null) {
                    c0967l2 = new C0967l();
                    this.f3310a.put(context, c0967l2);
                }
                c0967l2.m2325a(i2, colorStateListM2257d);
            }
            colorStateList = colorStateListM2257d;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2271i(Context context, int i2, Drawable drawable) {
        int i3;
        boolean z2;
        int iRound;
        PorterDuffColorFilter porterDuffColorFilterM2264g;
        C0924r c0924r = this.f3314e;
        if (c0924r == null) {
            return false;
        }
        PorterDuff.Mode mode = C0926s.f3289b;
        if (C0924r.m2253a(c0924r.f3283a, i2)) {
            i3 = C1031R.attr.colorControlNormal;
        } else if (C0924r.m2253a(c0924r.f3285c, i2)) {
            i3 = C1031R.attr.colorControlActivated;
        } else {
            if (C0924r.m2253a(c0924r.f3286d, i2)) {
                mode = PorterDuff.Mode.MULTIPLY;
            } else {
                if (i2 == C1031R.drawable.abc_list_divider_mtrl_alpha) {
                    z2 = true;
                    iRound = Math.round(40.8f);
                    i3 = 16842800;
                    if (!z2) {
                        return false;
                    }
                    Drawable drawableMutate = drawable.mutate();
                    int iM2161c = AbstractC0849A0.m2161c(context, i3);
                    synchronized (C0926s.class) {
                        porterDuffColorFilterM2264g = m2264g(iM2161c, mode);
                    }
                    drawableMutate.setColorFilter(porterDuffColorFilterM2264g);
                    if (iRound != -1) {
                        drawableMutate.setAlpha(iRound);
                    }
                    return true;
                }
                if (i2 != C1031R.drawable.abc_dialog_material_background) {
                    i3 = 0;
                    z2 = false;
                    iRound = -1;
                    if (!z2) {
                    }
                }
            }
            i3 = 16842801;
        }
        z2 = true;
        iRound = -1;
        if (!z2) {
        }
    }
}
