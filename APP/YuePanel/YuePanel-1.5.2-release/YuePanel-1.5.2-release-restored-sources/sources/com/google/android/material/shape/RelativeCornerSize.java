package com.google.android.material.shape;

import Yue.InterfaceC4885;
import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.graphics.RectF;
import com.google.android.material.color.utilities.Contrast;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class RelativeCornerSize implements CornerSize {
    private final float percent;

    public RelativeCornerSize(@InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f) {
        this.percent = f;
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public static RelativeCornerSize createFromCornerSize(@InterfaceC6391 RectF rectF, @InterfaceC6391 CornerSize cornerSize) {
        return cornerSize instanceof RelativeCornerSize ? (RelativeCornerSize) cornerSize : new RelativeCornerSize(cornerSize.getCornerSize(rectF) / getMaxCornerSize(rectF));
    }

    private static float getMaxCornerSize(@InterfaceC6391 RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RelativeCornerSize) && this.percent == ((RelativeCornerSize) obj).percent;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@InterfaceC6391 RectF rectF) {
        return this.percent * getMaxCornerSize(rectF);
    }

    @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN)
    public float getRelativePercent() {
        return this.percent;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.percent)});
    }
}
