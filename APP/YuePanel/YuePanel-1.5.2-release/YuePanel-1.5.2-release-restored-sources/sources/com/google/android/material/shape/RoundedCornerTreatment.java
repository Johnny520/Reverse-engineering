package com.google.android.material.shape;

import Yue.InterfaceC6391;

/* JADX INFO: loaded from: classes.dex */
public class RoundedCornerTreatment extends CornerTreatment {
    float radius;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RoundedCornerTreatment() {
        this.radius = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@InterfaceC6391 ShapePath shapePath, float f, float f2, float f3) {
        shapePath.reset(0.0f, f3 * f2, 180.0f, 180.0f - f);
        float f4 = f3 * 2.0f * f2;
        shapePath.addArc(0.0f, 0.0f, f4, f4, 180.0f, f);
    }

    @Deprecated
    public RoundedCornerTreatment(float f) {
        this.radius = f;
    }
}
