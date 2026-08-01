package androidx.compose.foundation.text.selection;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1749 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f2930;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1750 f2931;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1750 f2932;

    public C1749(C1750 c1750, C1750 c17502, boolean z) {
        this.f2932 = c1750;
        this.f2931 = c17502;
        this.f2930 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C1749 m2381(C1749 c1749, C1750 c1750, C1750 c17502, boolean z, int i) {
        if ((i & 1) != 0) {
            c1750 = c1749.f2932;
        }
        if ((i & 2) != 0) {
            c17502 = c1749.f2931;
        }
        c1749.getClass();
        return new C1749(c1750, c17502, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1749)) {
            return false;
        }
        C1749 c1749 = (C1749) obj;
        return AbstractC5227.m9466(this.f2932, c1749.f2932) && AbstractC5227.m9466(this.f2931, c1749.f2931) && this.f2930 == c1749.f2930;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2930) + ((this.f2931.hashCode() + (this.f2932.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.f2932);
        sb.append(", end=");
        sb.append(this.f2931);
        sb.append(", handlesCrossed=");
        return AbstractC0900.m712(sb, this.f2930, ')');
    }
}
