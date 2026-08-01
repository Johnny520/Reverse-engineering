package androidx.compose.ui.text;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2036 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2047 f6005;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2047 f6006;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2047 f6007;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2047 f6008;

    public C2036(C2047 c2047, C2047 c20472, C2047 c20473, C2047 c20474) {
        this.f6008 = c2047;
        this.f6007 = c20472;
        this.f6006 = c20473;
        this.f6005 = c20474;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2036)) {
            return false;
        }
        C2036 c2036 = (C2036) obj;
        return AbstractC4395.m8907(this.f6008, c2036.f6008) && AbstractC4395.m8907(this.f6007, c2036.f6007) && AbstractC4395.m8907(this.f6006, c2036.f6006) && AbstractC4395.m8907(this.f6005, c2036.f6005);
    }

    public final int hashCode() {
        C2047 c2047 = this.f6008;
        int iHashCode = (c2047 != null ? c2047.hashCode() : 0) * 31;
        C2047 c20472 = this.f6007;
        int iHashCode2 = (iHashCode + (c20472 != null ? c20472.hashCode() : 0)) * 31;
        C2047 c20473 = this.f6006;
        int iHashCode3 = (iHashCode2 + (c20473 != null ? c20473.hashCode() : 0)) * 31;
        C2047 c20474 = this.f6005;
        return iHashCode3 + (c20474 != null ? c20474.hashCode() : 0);
    }
}
