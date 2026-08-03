package com.google.android.material.shape;

import Yue.InterfaceC6391;

/* JADX INFO: loaded from: classes.dex */
public class EdgeTreatment {
    public boolean forceIntersection() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void getEdgePath(float f, float f2, @InterfaceC6391 ShapePath shapePath) {
        getEdgePath(f, f / 2.0f, f2, shapePath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void getEdgePath(float f, float f2, float f3, @InterfaceC6391 ShapePath shapePath) {
        shapePath.lineTo(f, 0.0f);
    }
}
