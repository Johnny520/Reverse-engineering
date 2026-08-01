package io.ktor.util;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4205 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f12693;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12694;

    public C4205(String str) {
        str.getClass();
        this.f12694 = str;
        int length = str.length();
        int lowerCase = 0;
        for (int i = 0; i < length; i++) {
            lowerCase = (lowerCase * 31) + Character.toLowerCase(str.charAt(i));
        }
        this.f12693 = lowerCase;
    }

    public final boolean equals(Object obj) {
        String str;
        C4205 c4205 = obj instanceof C4205 ? (C4205) obj : null;
        return (c4205 == null || (str = c4205.f12694) == null || !str.equalsIgnoreCase(this.f12694)) ? false : true;
    }

    public final int hashCode() {
        return this.f12693;
    }

    public final String toString() {
        return this.f12694;
    }
}
