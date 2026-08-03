package com.google.android.material.color;

import Yue.C3913;
import Yue.C4187;
import Yue.InterfaceC3451;
import Yue.InterfaceC3897;
import Yue.InterfaceC4885;
import Yue.InterfaceC5459;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.C1980R;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;

/* JADX INFO: loaded from: classes.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    private static final int CHROMA_NEUTRAL = 6;
    private static final int TONE_ACCENT_CONTAINER_DARK = 30;
    private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    private static final int TONE_ACCENT_DARK = 80;
    private static final int TONE_ACCENT_LIGHT = 40;
    private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    private static final int TONE_ON_ACCENT_DARK = 20;
    private static final int TONE_ON_ACCENT_LIGHT = 100;
    private static final int TONE_SURFACE_CONTAINER_DARK = 12;
    private static final int TONE_SURFACE_CONTAINER_HIGH_DARK = 17;
    private static final int TONE_SURFACE_CONTAINER_HIGH_LIGHT = 92;
    private static final int TONE_SURFACE_CONTAINER_LIGHT = 94;

    private MaterialColors() {
    }

    @InterfaceC3897
    public static int compositeARGBWithAlpha(@InterfaceC3897 int i, @InterfaceC5459(from = 0, m2228to = 255) int i2) {
        return C3913.m11173(i, (Color.alpha(i) * i2) / 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3897
    public static int getColor(@InterfaceC6391 View view, @InterfaceC3451 int i) {
        return resolveColor(view.getContext(), MaterialAttributes.resolveTypedValueOrThrow(view, i));
    }

    @InterfaceC3897
    @InterfaceC6490
    public static Integer getColorOrNull(@InterfaceC6391 Context context, @InterfaceC3451 int i) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i);
        if (typedValueResolve != null) {
            return Integer.valueOf(resolveColor(context, typedValueResolve));
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3897
    private static int getColorRole(@InterfaceC3897 int i, @InterfaceC5459(from = 0, m2228to = 100) int i2) {
        Hct hctFromInt = Hct.fromInt(i);
        hctFromInt.setTone(i2);
        return hctFromInt.toInt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static ColorRoles getColorRoles(@InterfaceC6391 Context context, @InterfaceC3897 int i) {
        return getColorRoles(i, isLightTheme(context));
    }

    @InterfaceC6391
    public static ColorStateList getColorStateList(@InterfaceC6391 Context context, @InterfaceC3451 int i, @InterfaceC6391 ColorStateList colorStateList) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i);
        ColorStateList colorStateListResolveColorStateList = typedValueResolve != null ? resolveColorStateList(context, typedValueResolve) : null;
        return colorStateListResolveColorStateList == null ? colorStateList : colorStateListResolveColorStateList;
    }

    @InterfaceC6490
    public static ColorStateList getColorStateListOrNull(@InterfaceC6391 Context context, @InterfaceC3451 int i) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i);
        if (typedValueResolve == null) {
            return null;
        }
        int i2 = typedValueResolve.resourceId;
        if (i2 != 0) {
            return C4187.m12061(context, i2);
        }
        int i3 = typedValueResolve.data;
        if (i3 != 0) {
            return ColorStateList.valueOf(i3);
        }
        return null;
    }

    @InterfaceC3897
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public static int getSurfaceContainerFromSeed(@InterfaceC6391 Context context, @InterfaceC3897 int i) {
        return getColorRole(i, isLightTheme(context) ? 94 : 12, 6);
    }

    @InterfaceC3897
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public static int getSurfaceContainerHighFromSeed(@InterfaceC6391 Context context, @InterfaceC3897 int i) {
        return getColorRole(i, isLightTheme(context) ? 92 : 17, 6);
    }

    @InterfaceC3897
    public static int harmonize(@InterfaceC3897 int i, @InterfaceC3897 int i2) {
        return Blend.harmonize(i, i2);
    }

    @InterfaceC3897
    public static int harmonizeWithPrimary(@InterfaceC6391 Context context, @InterfaceC3897 int i) {
        return harmonize(i, getColor(context, C1980R.attr.colorPrimary, MaterialColors.class.getCanonicalName()));
    }

    public static boolean isColorLight(@InterfaceC3897 int i) {
        return i != 0 && C3913.m11157(i) > 0.5d;
    }

    public static boolean isLightTheme(@InterfaceC6391 Context context) {
        return MaterialAttributes.resolveBoolean(context, C1980R.attr.isLightTheme, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3897
    public static int layer(@InterfaceC6391 View view, @InterfaceC3451 int i, @InterfaceC3451 int i2) {
        return layer(view, i, i2, 1.0f);
    }

    private static int resolveColor(@InterfaceC6391 Context context, @InterfaceC6391 TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? C4187.m12060(context, i) : typedValue.data;
    }

    private static ColorStateList resolveColorStateList(@InterfaceC6391 Context context, @InterfaceC6391 TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? C4187.m12061(context, i) : ColorStateList.valueOf(typedValue.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static ColorRoles getColorRoles(@InterfaceC3897 int i, boolean z) {
        return z ? new ColorRoles(getColorRole(i, 40), getColorRole(i, 100), getColorRole(i, 90), getColorRole(i, 10)) : new ColorRoles(getColorRole(i, 80), getColorRole(i, 20), getColorRole(i, 30), getColorRole(i, 90));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC3897
    public static int layer(@InterfaceC6391 View view, @InterfaceC3451 int i, @InterfaceC3451 int i2, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f) {
        return layer(getColor(view, i), getColor(view, i2), f);
    }

    @InterfaceC3897
    public static int getColor(Context context, @InterfaceC3451 int i, String str) {
        return resolveColor(context, MaterialAttributes.resolveTypedValueOrThrow(context, i, str));
    }

    @InterfaceC3897
    private static int getColorRole(@InterfaceC3897 int i, @InterfaceC5459(from = 0, m2228to = 100) int i2, int i3) {
        Hct hctFromInt = Hct.fromInt(getColorRole(i, i2));
        hctFromInt.setChroma(i3);
        return hctFromInt.toInt();
    }

    @InterfaceC3897
    public static int layer(@InterfaceC3897 int i, @InterfaceC3897 int i2, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f) {
        return layer(i, C3913.m11173(i2, Math.round(Color.alpha(i2) * f)));
    }

    @InterfaceC3897
    public static int getColor(@InterfaceC6391 View view, @InterfaceC3451 int i, @InterfaceC3897 int i2) {
        return getColor(view.getContext(), i, i2);
    }

    @InterfaceC3897
    public static int getColor(@InterfaceC6391 Context context, @InterfaceC3451 int i, @InterfaceC3897 int i2) {
        Integer colorOrNull = getColorOrNull(context, i);
        return colorOrNull != null ? colorOrNull.intValue() : i2;
    }

    @InterfaceC3897
    public static int layer(@InterfaceC3897 int i, @InterfaceC3897 int i2) {
        return C3913.m11165(i2, i);
    }
}
