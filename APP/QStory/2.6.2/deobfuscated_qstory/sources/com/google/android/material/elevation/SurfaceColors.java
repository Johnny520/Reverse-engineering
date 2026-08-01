package com.google.android.material.elevation;

import android.content.Context;
import com.davemorrissey.labs.subscaleview.R;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p312.C8667;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        C8667 c8667 = new C8667(context);
        Integer numM9893 = AbstractC4921.m9893(context, R.attr.colorSurface);
        return c8667.m14340(f, numM9893 != null ? numM9893.intValue() : 0);
    }

    public int getColor(Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }
}
