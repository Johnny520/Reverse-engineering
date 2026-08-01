package androidx.compose.ui.node;

import androidx.activity.AbstractC0053;
import p205.C7893;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1777 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1777) && C7893.m13318(10.0f, 10.0f) && C7893.m13318(40.0f, 40.0f) && C7893.m13318(10.0f, 10.0f) && C7893.m13318(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0053.m145(AbstractC0053.m145(AbstractC0053.m145(Float.hashCode(10.0f) * 31, 40.0f, 31), 10.0f, 31), 40.0f, 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) C7893.m13317(10.0f)) + ", top=" + ((Object) C7893.m13317(40.0f)) + ", end=" + ((Object) C7893.m13317(10.0f)) + ", bottom=" + ((Object) C7893.m13317(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
