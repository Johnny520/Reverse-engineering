package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import io.github.cherrywechat.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yw */
/* JADX INFO: loaded from: classes.dex */
public final class C2776yw {

    /* JADX INFO: renamed from: g */
    public static C2776yw f9427g;

    /* JADX INFO: renamed from: a */
    public WeakHashMap f9429a;

    /* JADX INFO: renamed from: b */
    public final WeakHashMap f9430b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public TypedValue f9431c;

    /* JADX INFO: renamed from: d */
    public boolean f9432d;

    /* JADX INFO: renamed from: e */
    public C0252Fu f9433e;

    /* JADX INFO: renamed from: f */
    public static final PorterDuff.Mode f9426f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h */
    public static final C2733xw f9428h = new C2733xw(6);

    /* JADX INFO: renamed from: b */
    public static synchronized C2776yw m5347b() {
        try {
            if (f9427g == null) {
                f9427g = new C2776yw();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f9427g;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized PorterDuffColorFilter m5348e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C2733xw c2733xw = f9428h;
        c2733xw.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c2733xw.m307f(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m5349a(Context context, int i) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f9431c == null) {
            this.f9431c = new TypedValue();
        }
        TypedValue typedValue = this.f9431c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            C2640vp c2640vp = (C2640vp) this.f9430b.get(context);
            drawableNewDrawable = null;
            if (c2640vp != null && (weakReference = (WeakReference) c2640vp.m5167b(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    c2640vp.m5171f(j);
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableM526f = null;
        if (this.f9433e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableM526f = new LayerDrawable(new Drawable[]{m5350c(context, R.drawable.abc_cab_background_internal_bg), m5350c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableM526f = C0252Fu.m526f(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM526f = C0252Fu.m526f(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM526f = C0252Fu.m526f(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM526f == null) {
            return layerDrawableM526f;
        }
        layerDrawableM526f.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM526f.getConstantState();
                if (constantState2 != null) {
                    C2640vp c2640vp2 = (C2640vp) this.f9430b.get(context);
                    if (c2640vp2 == null) {
                        c2640vp2 = new C2640vp();
                        this.f9430b.put(context, c2640vp2);
                    }
                    c2640vp2.m5170e(j, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableM526f;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Drawable m5350c(Context context, int i) {
        return m5351d(context, i, false);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Drawable m5351d(Context context, int i, boolean z) {
        Drawable drawableM5349a;
        try {
            if (!this.f9432d) {
                this.f9432d = true;
                Drawable drawableM5350c = m5350c(context, R.drawable.abc_vector_test);
                if (drawableM5350c == null || (!(drawableM5350c instanceof C0530MD) && !"android.graphics.drawable.VectorDrawable".equals(drawableM5350c.getClass().getName()))) {
                    this.f9432d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM5349a = m5349a(context, i);
            if (drawableM5349a == null) {
                drawableM5349a = context.getDrawable(i);
            }
            if (drawableM5349a != null) {
                drawableM5349a = m5353g(context, i, z, drawableM5349a);
            }
            if (drawableM5349a != null) {
                AbstractC0107Ce.m159a(drawableM5349a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM5349a;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized ColorStateList m5352f(Context context, int i) {
        ColorStateList colorStateList;
        C0471Ky c0471Ky;
        WeakHashMap weakHashMap = this.f9429a;
        ColorStateList colorStateListM530g = null;
        colorStateList = (weakHashMap == null || (c0471Ky = (C0471Ky) weakHashMap.get(context)) == null) ? null : (ColorStateList) c0471Ky.m919b(i);
        if (colorStateList == null) {
            C0252Fu c0252Fu = this.f9433e;
            if (c0252Fu != null) {
                colorStateListM530g = c0252Fu.m530g(context, i);
            }
            if (colorStateListM530g != null) {
                if (this.f9429a == null) {
                    this.f9429a = new WeakHashMap();
                }
                C0471Ky c0471Ky2 = (C0471Ky) this.f9429a.get(context);
                if (c0471Ky2 == null) {
                    c0471Ky2 = new C0471Ky();
                    this.f9429a.put(context, c0471Ky2);
                }
                c0471Ky2.m918a(i, colorStateListM530g);
            }
            colorStateList = colorStateListM530g;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m5353g(Context context, int i, boolean z, Drawable drawable) {
        int i2;
        boolean z2;
        int iRound;
        ColorStateList colorStateListM5352f = m5352f(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListM5352f != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListM5352f);
            if (this.f9433e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        if (this.f9433e != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iM1989c = AbstractC1042YA.m1989c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0262G3.f842b;
                C0252Fu.m527j(drawableFindDrawableByLayerId, iM1989c, mode2);
                C0252Fu.m527j(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC1042YA.m1989c(context, R.attr.colorControlNormal), mode2);
                C0252Fu.m527j(layerDrawable.findDrawableByLayerId(android.R.id.progress), AbstractC1042YA.m1989c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iM1988b = AbstractC1042YA.m1988b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0262G3.f842b;
                C0252Fu.m527j(drawableFindDrawableByLayerId2, iM1988b, mode3);
                C0252Fu.m527j(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC1042YA.m1989c(context, R.attr.colorControlActivated), mode3);
                C0252Fu.m527j(layerDrawable2.findDrawableByLayerId(android.R.id.progress), AbstractC1042YA.m1989c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C0252Fu c0252Fu = this.f9433e;
        boolean z3 = false;
        if (c0252Fu != null) {
            PorterDuff.Mode mode4 = C0262G3.f842b;
            if (C0252Fu.m523b((int[]) c0252Fu.f819a, i)) {
                i2 = R.attr.colorControlNormal;
            } else if (C0252Fu.m523b((int[]) c0252Fu.f821c, i)) {
                i2 = R.attr.colorControlActivated;
            } else {
                if (C0252Fu.m523b((int[]) c0252Fu.f822d, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                    iRound = Math.round(40.8f);
                    i2 = 16842800;
                    z2 = true;
                    if (z2) {
                        Drawable drawableMutate2 = drawable.mutate();
                        drawableMutate2.setColorFilter(C0262G3.m540c(AbstractC1042YA.m1989c(context, i2), mode4));
                        if (iRound != -1) {
                            drawableMutate2.setAlpha(iRound);
                        }
                        z3 = true;
                    }
                } else if (i != R.drawable.abc_dialog_material_background) {
                    i2 = 0;
                    z2 = false;
                    iRound = -1;
                    if (z2) {
                    }
                }
                i2 = 16842801;
            }
            z2 = true;
            iRound = -1;
            if (z2) {
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
