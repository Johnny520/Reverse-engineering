package com.google.android.material.shape;

import Yue.InterfaceC6391;
import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class AbsoluteCornerSize implements CornerSize {
    private final float size;

    public AbsoluteCornerSize(float f) {
        this.size = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbsoluteCornerSize) && this.size == ((AbsoluteCornerSize) obj).size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@InterfaceC6391 RectF rectF) {
        return this.size;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.size)});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public float getCornerSize() {
        return this.size;
    }
}
