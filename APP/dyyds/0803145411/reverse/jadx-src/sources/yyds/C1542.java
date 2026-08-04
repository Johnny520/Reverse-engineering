package yyds;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛷᛴᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1542 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static C1542 f7390;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C1521 f7392;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public WeakHashMap f7393;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final WeakHashMap f7394 = new WeakHashMap(0);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public TypedValue f7395;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f7396;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final PorterDuff.Mode f7391 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final C0264 f7389 = new C0264(6);

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static void m3173(Drawable drawable, C2731 c2731, int[] iArr) {
        int[] state = drawable.getState();
        int[] iArr2 = AbstractC2137.f10562;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = c2731.f13429;
        if (!z && !c2731.f13428) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterM3175 = null;
        ColorStateList colorStateList = z ? (ColorStateList) c2731.f13430 : null;
        PorterDuff.Mode mode = c2731.f13428 ? (PorterDuff.Mode) c2731.f13431 : f7391;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilterM3175 = m3175(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilterM3175);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static synchronized C1542 m3174() {
        C1542 c1542;
        c1542 = f7390;
        if (c1542 == null) {
            c1542 = new C1542();
            f7390 = c1542;
        }
        return c1542;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m3175(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        C0264 c0264 = f7389;
        c0264.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) c0264.m2548(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable m3176(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int iRound;
        PorterDuffColorFilter porterDuffColorFilterM3175;
        ColorStateList colorStateListM3180 = m3180(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListM3180 != null) {
            int[] iArr = AbstractC2137.f10562;
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListM3180);
            if (this.f7392 != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        C1521 c1521 = this.f7392;
        int i2 = R.attr.colorControlNormal;
        if (c1521 != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iM4253 = AbstractC2251.m4253(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C1541.f7386;
                C1521.m3143(drawableFindDrawableByLayerId, iM4253, mode2);
                C1521.m3143(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC2251.m4253(context, R.attr.colorControlNormal), mode2);
                C1521.m3143(layerDrawable.findDrawableByLayerId(android.R.id.progress), AbstractC2251.m4253(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iM4252 = AbstractC2251.m4252(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C1541.f7386;
                C1521.m3143(drawableFindDrawableByLayerId2, iM4252, mode3);
                C1521.m3143(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), AbstractC2251.m4253(context, R.attr.colorControlActivated), mode3);
                C1521.m3143(layerDrawable2.findDrawableByLayerId(android.R.id.progress), AbstractC2251.m4253(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        C1521 c15212 = this.f7392;
        boolean z3 = false;
        if (c15212 != null) {
            PorterDuff.Mode mode4 = C1541.f7386;
            if (C1521.m3141((int[]) c15212.f7342, i)) {
                z2 = true;
                iRound = -1;
                if (z2) {
                }
            } else {
                if (C1521.m3141((int[]) c15212.f7340, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean zM3141 = C1521.m3141((int[]) c15212.f7343, i);
                    i2 = android.R.attr.colorBackground;
                    if (zM3141) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                        if (z2) {
                            int[] iArr2 = AbstractC2137.f10562;
                            Drawable drawableMutate2 = drawable.mutate();
                            int iM42532 = AbstractC2251.m4253(context, i2);
                            synchronized (C1541.class) {
                                porterDuffColorFilterM3175 = m3175(iM42532, mode4);
                            }
                            drawableMutate2.setColorFilter(porterDuffColorFilterM3175);
                            if (iRound != -1) {
                                drawableMutate2.setAlpha(iRound);
                            }
                            z3 = true;
                        }
                    } else {
                        if (i != R.drawable.abc_dialog_material_background) {
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

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final synchronized Drawable m3177(Context context, int i, boolean z) {
        Drawable drawableM3179;
        try {
            if (!this.f7396) {
                this.f7396 = true;
                Drawable drawableM3181 = m3181(context, R.drawable.abc_vector_test);
                if (drawableM3181 == null || !"android.graphics.drawable.VectorDrawable".equals(drawableM3181.getClass().getName())) {
                    this.f7396 = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM3179 = m3179(context, i);
            if (drawableM3179 == null) {
                drawableM3179 = context.getDrawable(i);
            }
            if (drawableM3179 != null) {
                drawableM3179 = m3176(context, i, z, drawableM3179);
            }
            if (drawableM3179 != null) {
                AbstractC2137.m4075(drawableM3179);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM3179;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3178(Context context, int i, ColorStateList colorStateList) {
        int i2;
        WeakHashMap weakHashMap = this.f7393;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            this.f7393 = weakHashMap;
        }
        C0336 c0336 = (C0336) weakHashMap.get(context);
        if (c0336 == null) {
            c0336 = new C0336();
            int i3 = 4;
            while (true) {
                i2 = 40;
                if (i3 >= 32) {
                    break;
                }
                int i4 = (1 << i3) - 12;
                if (40 <= i4) {
                    i2 = i4;
                    break;
                }
                i3++;
            }
            int i5 = i2 / 4;
            c0336.f1757 = new int[i5];
            c0336.f1758 = new Object[i5];
            this.f7393.put(context, c0336);
        }
        int i6 = c0336.f1756;
        if (i6 != 0) {
            int[] iArr = c0336.f1757;
            if (i <= iArr[i6 - 1]) {
                int iM3298 = AbstractC0024.m3298(i6, i, iArr);
                if (iM3298 >= 0) {
                    c0336.f1758[iM3298] = colorStateList;
                    return;
                }
                int i7 = ~iM3298;
                int i8 = c0336.f1756;
                if (i7 < i8) {
                    Object[] objArr = c0336.f1758;
                    if (objArr[i7] == AbstractC0476.f2384) {
                        c0336.f1757[i7] = i;
                        objArr[i7] = colorStateList;
                        return;
                    }
                }
                if (i8 >= c0336.f1757.length) {
                    int i9 = (i8 + 1) * 4;
                    int i10 = 4;
                    while (true) {
                        if (i10 >= 32) {
                            break;
                        }
                        int i11 = (1 << i10) - 12;
                        if (i9 <= i11) {
                            i9 = i11;
                            break;
                        }
                        i10++;
                    }
                    int i12 = i9 / 4;
                    c0336.f1757 = Arrays.copyOf(c0336.f1757, i12);
                    c0336.f1758 = Arrays.copyOf(c0336.f1758, i12);
                }
                int i13 = c0336.f1756;
                if (i13 - i7 != 0) {
                    int[] iArr2 = c0336.f1757;
                    int i14 = i7 + 1;
                    AbstractC2070.m3934(i14, i7, i13, iArr2, iArr2);
                    Object[] objArr2 = c0336.f1758;
                    AbstractC2070.m3939(i14, i7, c0336.f1756, objArr2, objArr2);
                }
                c0336.f1757[i7] = i;
                c0336.f1758[i7] = colorStateList;
                c0336.f1756++;
                return;
            }
        }
        if (i6 >= c0336.f1757.length) {
            int i15 = (i6 + 1) * 4;
            int i16 = 4;
            while (true) {
                if (i16 >= 32) {
                    break;
                }
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
                i16++;
            }
            int i18 = i15 / 4;
            c0336.f1757 = Arrays.copyOf(c0336.f1757, i18);
            c0336.f1758 = Arrays.copyOf(c0336.f1758, i18);
        }
        c0336.f1757[i6] = i;
        c0336.f1758[i6] = colorStateList;
        c0336.f1756 = i6 + 1;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Drawable m3179(Context context, int i) {
        LayerDrawable layerDrawableM3144;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        TypedValue typedValue = this.f7395;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.f7395 = typedValue;
        }
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            C2010 c2010 = (C2010) this.f7394.get(context);
            layerDrawableM3144 = null;
            if (c2010 != null && (weakReference = (WeakReference) c2010.m3885(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iM3303 = AbstractC0024.m3303(c2010.f10069, c2010.f10068, j);
                    if (iM3303 >= 0) {
                        Object[] objArr = c2010.f10066;
                        Object obj = objArr[iM3303];
                        Object obj2 = AbstractC0902.f4114;
                        if (obj != obj2) {
                            objArr[iM3303] = obj2;
                            c2010.f10067 = true;
                        }
                    }
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.f7392 != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableM3144 = new LayerDrawable(new Drawable[]{m3181(context, R.drawable.abc_cab_background_internal_bg), m3181(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableM3144 = C1521.m3144(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM3144 = C1521.m3144(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM3144 = C1521.m3144(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM3144 == null) {
            return layerDrawableM3144;
        }
        layerDrawableM3144.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableM3144.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableM3144;
                }
                C2010 c20102 = (C2010) this.f7394.get(context);
                if (c20102 == null) {
                    c20102 = new C2010();
                    this.f7394.put(context, c20102);
                }
                c20102.m3886(j, new WeakReference(constantState2));
                return layerDrawableM3144;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final synchronized ColorStateList m3180(Context context, int i) {
        ColorStateList colorStateList;
        C0336 c0336;
        Object obj;
        WeakHashMap weakHashMap = this.f7393;
        ColorStateList colorStateListM3147 = null;
        if (weakHashMap == null || (c0336 = (C0336) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int iM3298 = AbstractC0024.m3298(c0336.f1756, i, c0336.f1757);
            if (iM3298 < 0 || (obj = c0336.f1758[iM3298]) == AbstractC0476.f2384) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            C1521 c1521 = this.f7392;
            if (c1521 != null) {
                colorStateListM3147 = c1521.m3147(context, i);
            }
            if (colorStateListM3147 != null) {
                m3178(context, i, colorStateListM3147);
            }
            colorStateList = colorStateListM3147;
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final synchronized Drawable m3181(Context context, int i) {
        return m3177(context, i, false);
    }
}
