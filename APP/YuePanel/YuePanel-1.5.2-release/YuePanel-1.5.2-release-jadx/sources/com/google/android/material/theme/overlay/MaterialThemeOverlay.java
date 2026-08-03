package com.google.android.material.theme.overlay;

import Yue.C4198;
import Yue.InterfaceC3451;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7651;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.C1980R;

/* JADX INFO: loaded from: classes.dex */
public class MaterialThemeOverlay {
    private static final int[] ANDROID_THEME_OVERLAY_ATTRS = {R.attr.theme, C1980R.attr.theme};
    private static final int[] MATERIAL_THEME_OVERLAY_ATTR = {C1980R.attr.materialThemeOverlay};

    private MaterialThemeOverlay() {
    }

    @InterfaceC7651
    private static int obtainAndroidThemeOverlayId(@InterfaceC6391 Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ANDROID_THEME_OVERLAY_ATTRS);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @InterfaceC7651
    private static int obtainMaterialThemeOverlayId(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, @InterfaceC3451 int i, @InterfaceC7651 int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MATERIAL_THEME_OVERLAY_ATTR, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    @InterfaceC6391
    public static Context wrap(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, @InterfaceC3451 int i, @InterfaceC7651 int i2) {
        int iObtainMaterialThemeOverlayId = obtainMaterialThemeOverlayId(context, attributeSet, i, i2);
        boolean z = (context instanceof C4198) && ((C4198) context).m12089() == iObtainMaterialThemeOverlayId;
        if (iObtainMaterialThemeOverlayId == 0 || z) {
            return context;
        }
        C4198 c4198 = new C4198(context, iObtainMaterialThemeOverlayId);
        int iObtainAndroidThemeOverlayId = obtainAndroidThemeOverlayId(context, attributeSet);
        if (iObtainAndroidThemeOverlayId != 0) {
            c4198.getTheme().applyStyle(iObtainAndroidThemeOverlayId, true);
        }
        return c4198;
    }
}
