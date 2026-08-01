package androidx.compose.ui.text;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2036 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2047 f6004;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2047 f6005;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2047 f6006;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2047 f6007;

    public C2036(C2047 c2047, C2047 c20472, C2047 c20473, C2047 c20474) {
        this.f6007 = c2047;
        this.f6006 = c20472;
        this.f6005 = c20473;
        this.f6004 = c20474;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2036)) {
            return false;
        }
        C2036 c2036 = (C2036) obj;
        return AbstractC4394.m8917(this.f6007, c2036.f6007) && AbstractC4394.m8917(this.f6006, c2036.f6006) && AbstractC4394.m8917(this.f6005, c2036.f6005) && AbstractC4394.m8917(this.f6004, c2036.f6004);
    }

    public final int hashCode() {
        C2047 c2047 = this.f6007;
        int iHashCode = (c2047 != null ? c2047.hashCode() : 0) * 31;
        C2047 c20472 = this.f6006;
        int iHashCode2 = (iHashCode + (c20472 != null ? c20472.hashCode() : 0)) * 31;
        C2047 c20473 = this.f6005;
        int iHashCode3 = (iHashCode2 + (c20473 != null ? c20473.hashCode() : 0)) * 31;
        C2047 c20474 = this.f6004;
        return iHashCode3 + (c20474 != null ? c20474.hashCode() : 0);
    }
}
