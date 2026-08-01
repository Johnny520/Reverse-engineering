package com.sonsation.library.model;

import android.graphics.RectF;
import androidx.activity.AbstractC0053;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        return Float.hashCode(0.0f) + AbstractC0053.m144(AbstractC0053.m144(Float.hashCode(0.0f) * 31, 0.0f, 31), 0.0f, 31);
    }

    @Override // android.graphics.RectF
    public final String toString() {
        return "Offset(left=0.0, top=0.0, right=0.0, bottom=0.0)";
    }
}
