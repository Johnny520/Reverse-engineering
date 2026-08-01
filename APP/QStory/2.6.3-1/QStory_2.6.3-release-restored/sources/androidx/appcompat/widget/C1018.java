package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.collection.C1110;
import androidx.collection.C1129;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p145.C8324;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1018 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final PorterDuff.Mode f1024 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C1019 f1025 = new C1019(6);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C1018 f1026;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C0978 f1027;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f1028;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public TypedValue f1029;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final WeakHashMap f1030 = new WeakHashMap(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public WeakHashMap f1031;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m1190(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C1019 c1019 = f1025;
        c1019.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c1019.m1392(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static synchronized C1018 m1191() {
        try {
            if (f1026 == null) {
                f1026 = new C1018();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1026;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final synchronized ColorStateList m1192(Context context, int i) {
        ColorStateList colorStateList;
        C1129 c1129;
        WeakHashMap weakHashMap = this.f1031;
        ColorStateList colorStateListM1111 = null;
        colorStateList = (weakHashMap == null || (c1129 = (C1129) weakHashMap.get(context)) == null) ? null : (ColorStateList) c1129.m1419(i);
        if (colorStateList == null) {
            C0978 c0978 = this.f1027;
            if (c0978 != null) {
                colorStateListM1111 = c0978.m1111(context, i);
            }
            if (colorStateListM1111 != null) {
                if (this.f1031 == null) {
                    this.f1031 = new WeakHashMap();
                }
                C1129 c11292 = (C1129) this.f1031.get(context);
                if (c11292 == null) {
                    c11292 = new C1129(0);
                    this.f1031.put(context, c11292);
                }
                c11292.m1421(i, colorStateListM1111);
            }
            colorStateList = colorStateListM1111;
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final synchronized Drawable m1193(Context context, int i, boolean z) {
        Drawable drawableM1195;
        try {
            if (!this.f1028) {
                this.f1028 = true;
                Drawable drawableM1194 = m1194(context, C0328R.drawable.abc_vector_test);
                if (drawableM1194 == null || (!(drawableM1194 instanceof C8324) && !"android.graphics.drawable.VectorDrawable".equals(drawableM1194.getClass().getName()))) {
                    this.f1028 = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM1195 = m1195(context, i);
            if (drawableM1195 == null) {
                drawableM1195 = context.getDrawable(i);
            }
            if (drawableM1195 != null) {
                drawableM1195 = m1196(context, i, z, drawableM1195);
            }
            if (drawableM1195 != null) {
                AbstractC1063.m1283(drawableM1195);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM1195;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final synchronized Drawable m1194(Context context, int i) {
        return m1193(context, i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m1195(Context context, int i) {
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        LayerDrawable layerDrawable;
        if (this.f1029 == null) {
            this.f1029 = new TypedValue();
        }
        TypedValue typedValue = this.f1029;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            C1110 c1110 = (C1110) this.f1030.get(context);
            if (c1110 != null && (weakReference = (WeakReference) c1110.m1386(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    c1110.m1382(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.f1027 != null) {
            layerDrawable = i == C0328R.drawable.abc_cab_background_top_material ? new LayerDrawable(new Drawable[]{m1194(context, C0328R.drawable.abc_cab_background_internal_bg), m1194(context, C0328R.drawable.abc_cab_background_top_mtrl_alpha)}) : i == C0328R.drawable.abc_ratingbar_material ? C0978.m1107(this, context, C0328R.dimen.abc_star_big) : i == C0328R.drawable.abc_ratingbar_indicator_material ? C0978.m1107(this, context, C0328R.dimen.abc_star_medium) : i == C0328R.drawable.abc_ratingbar_small_material ? C0978.m1107(this, context, C0328R.dimen.abc_star_small) : null;
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                if (constantState2 == null) {
                    return layerDrawable;
                }
                C1110 c11102 = (C1110) this.f1030.get(context);
                if (c11102 == null) {
                    c11102 = new C1110((Object) null);
                    this.f1030.put(context, c11102);
                }
                c11102.m1383(new WeakReference(constantState2), j);
                return layerDrawable;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m1196(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int iRound;
        ColorStateList colorStateListM1192 = m1192(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListM1192 != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListM1192);
            if (this.f1027 != null && i == C0328R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        C0978 c0978 = this.f1027;
        int i2 = C0328R.attr.colorControlNormal;
        if (c0978 != null) {
            if (i == C0328R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int iM1165 = AbstractC0999.m1165(context, C0328R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0977.f916;
                C0978.m1106(drawableFindDrawableByLayerId, iM1165, mode2);
                C0978.m1106(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), AbstractC0999.m1165(context, C0328R.attr.colorControlNormal), mode2);
                C0978.m1106(layerDrawable.findDrawableByLayerId(R.id.progress), AbstractC0999.m1165(context, C0328R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == C0328R.drawable.abc_ratingbar_material || i == C0328R.drawable.abc_ratingbar_indicator_material || i == C0328R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
                int iM1166 = AbstractC0999.m1166(context, C0328R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0977.f916;
                C0978.m1106(drawableFindDrawableByLayerId2, iM1166, mode3);
                C0978.m1106(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), AbstractC0999.m1165(context, C0328R.attr.colorControlActivated), mode3);
                C0978.m1106(layerDrawable2.findDrawableByLayerId(R.id.progress), AbstractC0999.m1165(context, C0328R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C0978 c09782 = this.f1027;
        boolean z3 = false;
        if (c09782 != null) {
            PorterDuff.Mode mode4 = C0977.f916;
            if (C0978.m1105((int[]) c09782.f923, i)) {
                z2 = true;
                iRound = -1;
                if (z2) {
                }
            } else {
                if (C0978.m1105((int[]) c09782.f921, i)) {
                    i2 = C0328R.attr.colorControlActivated;
                } else {
                    boolean zM1105 = C0978.m1105((int[]) c09782.f920, i);
                    i2 = R.attr.colorBackground;
                    if (zM1105) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == C0328R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i2 = R.attr.colorForeground;
                        z2 = true;
                        if (z2) {
                            Drawable drawableMutate2 = drawable.mutate();
                            drawableMutate2.setColorFilter(C0977.m1099(AbstractC0999.m1165(context, i2), mode4));
                            if (iRound != -1) {
                                drawableMutate2.setAlpha(iRound);
                            }
                            z3 = true;
                        }
                    } else {
                        if (i != C0328R.drawable.abc_dialog_material_background) {
                            z2 = false;
                            i2 = 0;
                        }
                        iRound = -1;
                        if (z2) {
                        }
                    }
                }
                z2 = true;
                iRound = -1;
                if (z2) {
                }
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
