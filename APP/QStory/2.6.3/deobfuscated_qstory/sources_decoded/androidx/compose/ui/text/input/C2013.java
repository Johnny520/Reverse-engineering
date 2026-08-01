package androidx.compose.ui.text.input;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2068;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2035 f5945;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f5946;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2068 f5947;

    public C2013(C2068 c2068, long j, C2035 c2035) {
        C2035 c20352;
        this.f5947 = c2068;
        this.f5946 = AbstractC2048.m3769(c2068.f6129.length(), j);
        if (c2035 != null) {
            c20352 = new C2035(AbstractC2048.m3769(c2068.f6129.length(), c2035.f6004));
        } else {
            c20352 = null;
        }
        this.f5945 = c20352;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2013 m3715(C2013 c2013, C2068 c2068, long j, int i) {
        if ((i & 1) != 0) {
            c2068 = c2013.f5947;
        }
        if ((i & 2) != 0) {
            j = c2013.f5946;
        }
        C2035 c2035 = (i & 4) != 0 ? c2013.f5945 : null;
        c2013.getClass();
        return new C2013(c2068, j, c2035);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2013)) {
            return false;
        }
        C2013 c2013 = (C2013) obj;
        return C2035.m3753(this.f5946, c2013.f5946) && AbstractC4395.m8907(this.f5945, c2013.f5945) && AbstractC4395.m8907(this.f5947, c2013.f5947);
    }

    public final int hashCode() {
        int iHashCode = this.f5947.hashCode() * 31;
        int i = C2035.f6002;
        int iM142 = AbstractC0053.m142(iHashCode, 31, this.f5946);
        C2035 c2035 = this.f5945;
        return iM142 + (c2035 != null ? Long.hashCode(c2035.f6004) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f5947) + "', selection=" + ((Object) C2035.m3758(this.f5946)) + ", composition=" + this.f5945 + ')';
    }

    public C2013(int i, long j, String str) {
        this(new C2068((i & 1) != 0 ? "" : str), (i & 2) != 0 ? C2035.f6003 : j, (C2035) null);
    }
}
