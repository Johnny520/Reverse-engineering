package p168;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8424 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final byte[] f20932 = new byte[1792];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public char f20933;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f20934;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20935;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final CharSequence f20936;

    static {
        for (int i = 0; i < 1792; i++) {
            f20932[i] = Character.getDirectionality(i);
        }
    }

    public C8424(CharSequence charSequence) {
        this.f20936 = charSequence;
        this.f20935 = charSequence.length();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte m13383() {
        int i = this.f20934 - 1;
        CharSequence charSequence = this.f20936;
        char cCharAt = charSequence.charAt(i);
        this.f20933 = cCharAt;
        boolean zIsLowSurrogate = Character.isLowSurrogate(cCharAt);
        int i2 = this.f20934;
        if (zIsLowSurrogate) {
            int iCodePointBefore = Character.codePointBefore(charSequence, i2);
            this.f20934 -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f20934 = i2 - 1;
        char c = this.f20933;
        return c < 1792 ? f20932[c] : Character.getDirectionality(c);
    }
}
