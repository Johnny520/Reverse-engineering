package com.google.android.material.shape;

import Yue.InterfaceC6391;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes.dex */
public class MaterialShapeUtils {
    private MaterialShapeUtils() {
    }

    @InterfaceC6391
    public static CornerTreatment createCornerTreatment(int i) {
        return i != 0 ? i != 1 ? createDefaultCornerTreatment() : new CutCornerTreatment() : new RoundedCornerTreatment();
    }

    @InterfaceC6391
    public static CornerTreatment createDefaultCornerTreatment() {
        return new RoundedCornerTreatment();
    }

    @InterfaceC6391
    public static EdgeTreatment createDefaultEdgeTreatment() {
        return new EdgeTreatment();
    }

    public static void setElevation(@InterfaceC6391 View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).setElevation(f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setParentAbsoluteElevation(@InterfaceC6391 View view) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            setParentAbsoluteElevation(view, (MaterialShapeDrawable) background);
        }
    }

    public static void setParentAbsoluteElevation(@InterfaceC6391 View view, @InterfaceC6391 MaterialShapeDrawable materialShapeDrawable) {
        if (materialShapeDrawable.isElevationOverlayEnabled()) {
            materialShapeDrawable.setParentAbsoluteElevation(ViewUtils.getParentAbsoluteElevation(view));
        }
    }
}
