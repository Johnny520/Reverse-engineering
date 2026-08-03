package com.google.android.material.shape;

import Yue.InterfaceC6391;

/* JADX INFO: loaded from: classes.dex */
public class CutCornerTreatment extends CornerTreatment {
    float size;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@InterfaceC6391 ShapePath shapePath, float f, float f2, float f3) {
        shapePath.reset(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = f3;
        double d2 = f2;
        shapePath.lineTo((float) (Math.sin(Math.toRadians(f)) * d * d2), (float) (Math.sin(Math.toRadians(90.0f - f)) * d * d2));
    }

    @Deprecated
    public CutCornerTreatment(float f) {
        this.size = f;
    }
}
