package io.ktor.util;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5037 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f13038;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13039;

    public C5037(String str) {
        str.getClass();
        this.f13039 = str;
        int length = str.length();
        int lowerCase = 0;
        for (int i = 0; i < length; i++) {
            lowerCase = (lowerCase * 31) + Character.toLowerCase(str.charAt(i));
        }
        this.f13038 = lowerCase;
    }

    public final boolean equals(Object obj) {
        String str;
        C5037 c5037 = obj instanceof C5037 ? (C5037) obj : null;
        return (c5037 == null || (str = c5037.f13039) == null || !str.equalsIgnoreCase(this.f13039)) ? false : true;
    }

    public final int hashCode() {
        return this.f13038;
    }

    public final String toString() {
        return this.f13039;
    }
}
