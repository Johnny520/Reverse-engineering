package com.google.android.material.shape;

import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public final class ClampedCornerSize implements CornerSize {
    private final float target;

    public ClampedCornerSize(float f) {
        this.target = f;
    }

    @InterfaceC6391
    public static ClampedCornerSize createFromCornerSize(@InterfaceC6391 AbsoluteCornerSize absoluteCornerSize) {
        return new ClampedCornerSize(absoluteCornerSize.getCornerSize());
    }

    private static float getMaxCornerSize(@InterfaceC6391 RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClampedCornerSize) && this.target == ((ClampedCornerSize) obj).target;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@InterfaceC6391 RectF rectF) {
        return Math.min(this.target, getMaxCornerSize(rectF));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.target)});
    }
}
