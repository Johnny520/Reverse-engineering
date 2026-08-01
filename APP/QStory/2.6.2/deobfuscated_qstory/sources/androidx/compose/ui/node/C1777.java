package androidx.compose.ui.node;

import androidx.activity.AbstractC0053;
import p205.C7892;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1777 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1777) && C7892.m13290(10.0f, 10.0f) && C7892.m13290(40.0f, 40.0f) && C7892.m13290(10.0f, 10.0f) && C7892.m13290(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(Float.hashCode(10.0f) * 31, 40.0f, 31), 10.0f, 31), 40.0f, 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) C7892.m13289(10.0f)) + ", top=" + ((Object) C7892.m13289(40.0f)) + ", end=" + ((Object) C7892.m13289(10.0f)) + ", bottom=" + ((Object) C7892.m13289(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
