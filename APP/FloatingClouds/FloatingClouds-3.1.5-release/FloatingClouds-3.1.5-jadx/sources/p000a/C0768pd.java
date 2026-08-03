package p000a;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.appcompat.C0983R;
import androidx.appcompat.resources.C0990R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p000a.C0434Y0;
import p000a.C0437Y3;
import p000a.C0893w5;

/* JADX INFO: renamed from: a.pd */
/* JADX INFO: loaded from: classes.dex */
public final class C0768pd {

    /* JADX INFO: renamed from: g */
    public static C0768pd f3035g;

    /* JADX INFO: renamed from: a */
    public WeakHashMap<Context, C0750oe<ColorStateList>> f3037a;

    /* JADX INFO: renamed from: b */
    public final WeakHashMap<Context, C0371U9<WeakReference<Drawable.ConstantState>>> f3038b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c */
    public TypedValue f3039c;

    /* JADX INFO: renamed from: d */
    public boolean f3040d;

    /* JADX INFO: renamed from: e */
    public C0434Y0.a f3041e;

    /* JADX INFO: renamed from: f */
    public static final PorterDuff.Mode f3034f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h */
    public static final a f3036h = new a(6);

    /* JADX INFO: renamed from: a.pd$a */
    public static class a extends C0407W9<Integer, PorterDuffColorFilter> {
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C0768pd m1806b() {
        try {
            if (f3035g == null) {
                f3035g = new C0768pd();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3035g;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized PorterDuffColorFilter m1807e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM1052a;
        a aVar = f3036h;
        aVar.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilterM1052a = aVar.m1052a(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilterM1052a == null) {
            porterDuffColorFilterM1052a = new PorterDuffColorFilter(i, mode);
            aVar.m1053b(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilterM1052a);
        }
        return porterDuffColorFilterM1052a;
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m1808a(Context context, int i) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.f3039c == null) {
            this.f3039c = new TypedValue();
        }
        TypedValue typedValue = this.f3039c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            C0371U9<WeakReference<Drawable.ConstantState>> c0371u9 = this.f3038b.get(context);
            drawableNewDrawable = null;
            if (c0371u9 != null && (weakReference = (WeakReference) c0371u9.m990c(j, null)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iM2142b = C0889w1.m2142b(c0371u9.f1388b, c0371u9.f1390d, j);
                    if (iM2142b >= 0) {
                        Object[] objArr = c0371u9.f1389c;
                        Object obj = objArr[iM2142b];
                        Object obj2 = C0371U9.f1386e;
                        if (obj != obj2) {
                            objArr[iM2142b] = obj2;
                            c0371u9.f1387a = true;
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableM1087c = null;
        if (this.f3041e != null) {
            if (i == C0983R.drawable.abc_cab_background_top_material) {
                layerDrawableM1087c = new LayerDrawable(new Drawable[]{m1809c(context, C0983R.drawable.abc_cab_background_internal_bg), m1809c(context, C0983R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == C0983R.drawable.abc_ratingbar_material) {
                layerDrawableM1087c = C0434Y0.a.m1087c(this, context, C0983R.dimen.abc_star_big);
            } else if (i == C0983R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM1087c = C0434Y0.a.m1087c(this, context, C0983R.dimen.abc_star_medium);
            } else if (i == C0983R.drawable.abc_ratingbar_small_material) {
                layerDrawableM1087c = C0434Y0.a.m1087c(this, context, C0983R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM1087c == null) {
            return layerDrawableM1087c;
        }
        layerDrawableM1087c.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM1087c.getConstantState();
                if (constantState2 != null) {
                    C0371U9<WeakReference<Drawable.ConstantState>> c0371u92 = this.f3038b.get(context);
                    if (c0371u92 == null) {
                        c0371u92 = new C0371U9<>();
                        this.f3038b.put(context, c0371u92);
                    }
                    c0371u92.m991d(j, new WeakReference<>(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableM1087c;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Drawable m1809c(Context context, int i) {
        return m1810d(context, i, false);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Drawable m1810d(Context context, int i, boolean z) {
        Drawable drawableM1808a;
        try {
            if (!this.f3040d) {
                this.f3040d = true;
                Drawable drawableM1809c = m1809c(context, C0990R.drawable.abc_vector_test);
                if (drawableM1809c == null || (!(drawableM1809c instanceof C0543dg) && !"android.graphics.drawable.VectorDrawable".equals(drawableM1809c.getClass().getName()))) {
                    this.f3040d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM1808a = m1808a(context, i);
            if (drawableM1808a == null) {
                drawableM1808a = C0437Y3.a.m1093b(context, i);
            }
            if (drawableM1808a != null) {
                drawableM1808a = m1812g(context, i, z, drawableM1808a);
            }
            if (drawableM1808a != null) {
                C0912x5.m2198a(drawableM1808a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM1808a;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized ColorStateList m1811f(Context context, int i) {
        ColorStateList colorStateList;
        C0750oe<ColorStateList> c0750oe;
        WeakHashMap<Context, C0750oe<ColorStateList>> weakHashMap = this.f3037a;
        ColorStateList colorStateListM1089d = null;
        colorStateList = (weakHashMap == null || (c0750oe = weakHashMap.get(context)) == null) ? null : (ColorStateList) c0750oe.m1766b(i, null);
        if (colorStateList == null) {
            C0434Y0.a aVar = this.f3041e;
            if (aVar != null) {
                colorStateListM1089d = aVar.m1089d(context, i);
            }
            if (colorStateListM1089d != null) {
                if (this.f3037a == null) {
                    this.f3037a = new WeakHashMap<>();
                }
                C0750oe<ColorStateList> c0750oe2 = this.f3037a.get(context);
                if (c0750oe2 == null) {
                    c0750oe2 = new C0750oe<>();
                    this.f3037a.put(context, c0750oe2);
                }
                c0750oe2.m1765a(i, colorStateListM1089d);
            }
            colorStateList = colorStateListM1089d;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m1812g(Context context, int i, boolean z, Drawable drawable) {
        int i2;
        boolean z2;
        int iRound;
        ColorStateList colorStateListM1811f = m1811f(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListM1811f != null) {
            Drawable drawableMutate = drawable.mutate();
            C0893w5.a.m2176h(drawableMutate, colorStateListM1811f);
            if (this.f3041e != null && i == C0983R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                C0893w5.a.m2177i(drawableMutate, mode);
            }
            return drawableMutate;
        }
        if (this.f3041e != null) {
            if (i == C0983R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int iM1313c = C0542df.m1313c(context, C0983R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0434Y0.f1630b;
                C0434Y0.a.m1088e(drawableFindDrawableByLayerId, iM1313c, mode2);
                C0434Y0.a.m1088e(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), C0542df.m1313c(context, C0983R.attr.colorControlNormal), mode2);
                C0434Y0.a.m1088e(layerDrawable.findDrawableByLayerId(R.id.progress), C0542df.m1313c(context, C0983R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == C0983R.drawable.abc_ratingbar_material || i == C0983R.drawable.abc_ratingbar_indicator_material || i == C0983R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
                int iM1312b = C0542df.m1312b(context, C0983R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0434Y0.f1630b;
                C0434Y0.a.m1088e(drawableFindDrawableByLayerId2, iM1312b, mode3);
                C0434Y0.a.m1088e(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), C0542df.m1313c(context, C0983R.attr.colorControlActivated), mode3);
                C0434Y0.a.m1088e(layerDrawable2.findDrawableByLayerId(R.id.progress), C0542df.m1313c(context, C0983R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C0434Y0.a aVar = this.f3041e;
        boolean z3 = false;
        if (aVar != null) {
            PorterDuff.Mode mode4 = C0434Y0.f1630b;
            if (C0434Y0.a.m1085a(aVar.f1633a, i)) {
                i2 = C0983R.attr.colorControlNormal;
            } else if (C0434Y0.a.m1085a(aVar.f1635c, i)) {
                i2 = C0983R.attr.colorControlActivated;
            } else {
                if (C0434Y0.a.m1085a(aVar.f1636d, i)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i == C0983R.drawable.abc_list_divider_mtrl_alpha) {
                    iRound = Math.round(40.8f);
                    i2 = 16842800;
                    z2 = true;
                    if (z2) {
                        Drawable drawableMutate2 = drawable.mutate();
                        drawableMutate2.setColorFilter(C0434Y0.m1081c(C0542df.m1313c(context, i2), mode4));
                        if (iRound != -1) {
                            drawableMutate2.setAlpha(iRound);
                        }
                        z3 = true;
                    }
                } else if (i != C0983R.drawable.abc_dialog_material_background) {
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
