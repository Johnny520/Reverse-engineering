package com.google.android.material.elevation;

import android.content.Context;
import com.davemorrissey.labs.subscaleview.C0328R;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p328.C9488;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum SurfaceColors {
    SURFACE_0(C0328R.dimen.m3_sys_elevation_level0),
    SURFACE_1(C0328R.dimen.m3_sys_elevation_level1),
    SURFACE_2(C0328R.dimen.m3_sys_elevation_level2),
    SURFACE_3(C0328R.dimen.m3_sys_elevation_level3),
    SURFACE_4(C0328R.dimen.m3_sys_elevation_level4),
    SURFACE_5(C0328R.dimen.m3_sys_elevation_level5);

    private final int elevationResId;

    SurfaceColors(int i) {
        this.elevationResId = i;
    }

    public static int getColorForElevation(Context context, float f) {
        C9488 c9488 = new C9488(context);
        Integer numM10605 = AbstractC5894.m10605(context, C0328R.attr.colorSurface);
        return c9488.m14917(f, numM10605 != null ? numM10605.intValue() : 0);
    }

    public int getColor(Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }
}
