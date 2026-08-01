package androidx.compose.foundation.layout;

import androidx.compose.ui.C2115;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0598 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2115 f1678;

    public C0598(C2115 c2115) {
        this.f1678 = c2115;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0598) && AbstractC4395.m8907(this.f1678, ((C0598) obj).f1678);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1678.f6254);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f1678 + ')';
    }
}
