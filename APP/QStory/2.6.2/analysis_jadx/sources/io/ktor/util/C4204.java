package io.ktor.util;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4204 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f12689;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12690;

    public C4204(String str) {
        str.getClass();
        this.f12690 = str;
        int length = str.length();
        int lowerCase = 0;
        for (int i = 0; i < length; i++) {
            lowerCase = (lowerCase * 31) + Character.toLowerCase(str.charAt(i));
        }
        this.f12689 = lowerCase;
    }

    public final boolean equals(Object obj) {
        String str;
        C4204 c4204 = obj instanceof C4204 ? (C4204) obj : null;
        return (c4204 == null || (str = c4204.f12690) == null || !str.equalsIgnoreCase(this.f12690)) ? false : true;
    }

    public final int hashCode() {
        return this.f12689;
    }

    public final String toString() {
        return this.f12690;
    }
}
