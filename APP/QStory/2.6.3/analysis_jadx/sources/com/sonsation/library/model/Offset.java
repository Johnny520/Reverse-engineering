package com.sonsation.library.model;

import android.graphics.RectF;
import androidx.activity.AbstractC0053;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sonsation/library/model/Offset;", "Landroid/graphics/RectF;", "library_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Offset extends RectF {
    @Override // android.graphics.RectF
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Offset) && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0;
    }

    @Override // android.graphics.RectF
    public final int hashCode() {
        return Float.hashCode(0.0f) + AbstractC0053.m145(AbstractC0053.m145(Float.hashCode(0.0f) * 31, 0.0f, 31), 0.0f, 31);
    }

    @Override // android.graphics.RectF
    public final String toString() {
        return "Offset(left=0.0, top=0.0, right=0.0, bottom=0.0)";
    }
}
