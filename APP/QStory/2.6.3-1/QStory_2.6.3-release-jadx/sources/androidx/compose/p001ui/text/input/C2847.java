package androidx.compose.p001ui.text.input;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2902;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2847 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2869 f6290;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f6291;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2902 f6292;

    public C2847(C2902 c2902, long j, C2869 c2869) {
        C2869 c28692;
        this.f6292 = c2902;
        this.f6291 = AbstractC2882.m4329(c2902.f6474.length(), j);
        if (c2869 != null) {
            c28692 = new C2869(AbstractC2882.m4329(c2902.f6474.length(), c2869.f6349));
        } else {
            c28692 = null;
        }
        this.f6290 = c28692;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2847 m4275(C2847 c2847, C2902 c2902, long j, int i) {
        if ((i & 1) != 0) {
            c2902 = c2847.f6292;
        }
        if ((i & 2) != 0) {
            j = c2847.f6291;
        }
        C2869 c2869 = (i & 4) != 0 ? c2847.f6290 : null;
        c2847.getClass();
        return new C2847(c2902, j, c2869);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2847)) {
            return false;
        }
        C2847 c2847 = (C2847) obj;
        return C2869.m4313(this.f6291, c2847.f6291) && AbstractC5227.m9466(this.f6290, c2847.f6290) && AbstractC5227.m9466(this.f6292, c2847.f6292);
    }

    public final int hashCode() {
        int iHashCode = this.f6292.hashCode() * 31;
        int i = C2869.f6347;
        int iM702 = AbstractC0900.m702(iHashCode, 31, this.f6291);
        C2869 c2869 = this.f6290;
        return iM702 + (c2869 != null ? Long.hashCode(c2869.f6349) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f6292) + "', selection=" + ((Object) C2869.m4318(this.f6291)) + ", composition=" + this.f6290 + ')';
    }

    public C2847(int i, long j, String str) {
        this(new C2902((i & 1) != 0 ? "" : str), (i & 2) != 0 ? C2869.f6348 : j, (C2869) null);
    }
}
