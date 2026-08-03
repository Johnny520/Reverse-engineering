package com.google.android.material.shape;

import Yue.InterfaceC6391;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class CornerTreatment {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void getCornerPath(float f, float f2, @InterfaceC6391 ShapePath shapePath) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void getCornerPath(@InterfaceC6391 ShapePath shapePath, float f, float f2, float f3) {
        getCornerPath(f, f2, shapePath);
    }

    public void getCornerPath(@InterfaceC6391 ShapePath shapePath, float f, float f2, @InterfaceC6391 RectF rectF, @InterfaceC6391 CornerSize cornerSize) {
        getCornerPath(shapePath, f, f2, cornerSize.getCornerSize(rectF));
    }
}
