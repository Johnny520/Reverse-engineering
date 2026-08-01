package com.google.android.material.elevation;

import android.content.Context;
import com.davemorrissey.labs.subscaleview.R;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p312.C8659;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum SurfaceColors {
    SURFACE_0(R.dimen.m3_sys_elevation_level0),
    SURFACE_1(R.dimen.m3_sys_elevation_level1),
    SURFACE_2(R.dimen.m3_sys_elevation_level2),
    SURFACE_3(R.dimen.m3_sys_elevation_level3),
    SURFACE_4(R.dimen.m3_sys_elevation_level4),
    SURFACE_5(R.dimen.m3_sys_elevation_level5);

    private final int elevationResId;

    SurfaceColors(int i) {
        this.elevationResId = i;
    }

    public static int getColorForElevation(Context context, float f) {
        C8659 c8659 = new C8659(context);
        Integer numM10046 = AbstractC5062.m10046(context, R.attr.colorSurface);
        return c8659.m14358(f, numM10046 != null ? numM10046.intValue() : 0);
    }

    public int getColor(Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }
}
