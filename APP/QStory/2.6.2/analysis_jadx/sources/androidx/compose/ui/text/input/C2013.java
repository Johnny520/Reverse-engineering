package androidx.compose.ui.text.input;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2068;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2035 f5944;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f5945;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2068 f5946;

    public C2013(C2068 c2068, long j, C2035 c2035) {
        C2035 c20352;
        this.f5946 = c2068;
        this.f5945 = AbstractC2048.m3759(c2068.f6128.length(), j);
        if (c2035 != null) {
            c20352 = new C2035(AbstractC2048.m3759(c2068.f6128.length(), c2035.f6003));
        } else {
            c20352 = null;
        }
        this.f5944 = c20352;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2013 m3705(C2013 c2013, C2068 c2068, long j, int i) {
        if ((i & 1) != 0) {
            c2068 = c2013.f5946;
        }
        if ((i & 2) != 0) {
            j = c2013.f5945;
        }
        C2035 c2035 = (i & 4) != 0 ? c2013.f5944 : null;
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
        return C2035.m3743(this.f5945, c2013.f5945) && AbstractC4394.m8917(this.f5944, c2013.f5944) && AbstractC4394.m8917(this.f5946, c2013.f5946);
    }

    public final int hashCode() {
        int iHashCode = this.f5946.hashCode() * 31;
        int i = C2035.f6001;
        int iM141 = AbstractC0053.m141(iHashCode, 31, this.f5945);
        C2035 c2035 = this.f5944;
        return iM141 + (c2035 != null ? Long.hashCode(c2035.f6003) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f5946) + "', selection=" + ((Object) C2035.m3748(this.f5945)) + ", composition=" + this.f5944 + ')';
    }

    public C2013(int i, long j, String str) {
        this(new C2068((i & 1) != 0 ? "" : str), (i & 2) != 0 ? C2035.f6002 : j, (C2035) null);
    }
}
