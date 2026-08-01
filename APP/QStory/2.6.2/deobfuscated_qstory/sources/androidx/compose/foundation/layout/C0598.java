package androidx.compose.foundation.layout;

import androidx.compose.ui.C2115;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0598 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2115 f1677;

    public C0598(C2115 c2115) {
        this.f1677 = c2115;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0598) && AbstractC4394.m8917(this.f1677, ((C0598) obj).f1677);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1677.f6253);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f1677 + ')';
    }
}
