package com.google.android.material.elevation;

import Yue.InterfaceC3897;
import Yue.InterfaceC4398;
import Yue.InterfaceC4399;
import Yue.InterfaceC6391;
import android.content.Context;
import com.google.android.material.C1980R;
import com.google.android.material.color.MaterialColors;

/* JADX INFO: loaded from: classes.dex */
public enum SurfaceColors {
    SURFACE_0(C1980R.dimen.m3_sys_elevation_level0),
    SURFACE_1(C1980R.dimen.m3_sys_elevation_level1),
    SURFACE_2(C1980R.dimen.m3_sys_elevation_level2),
    SURFACE_3(C1980R.dimen.m3_sys_elevation_level3),
    SURFACE_4(C1980R.dimen.m3_sys_elevation_level4),
    SURFACE_5(C1980R.dimen.m3_sys_elevation_level5);

    private final int elevationResId;

    SurfaceColors(@InterfaceC4398 int i) {
        this.elevationResId = i;
    }

    @InterfaceC3897
    public static int getColorForElevation(@InterfaceC6391 Context context, @InterfaceC4399 float f) {
        return new ElevationOverlayProvider(context).compositeOverlay(MaterialColors.getColor(context, C1980R.attr.colorSurface, 0), f);
    }

    @InterfaceC3897
    public int getColor(@InterfaceC6391 Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }
}
