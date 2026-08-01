package p152;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7594 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final byte[] f20592 = new byte[1792];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public char f20593;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f20594;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20595;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final CharSequence f20596;

    static {
        for (int i = 0; i < 1792; i++) {
            f20592[i] = Character.getDirectionality(i);
        }
    }

    public C7594(CharSequence charSequence) {
        this.f20596 = charSequence;
        this.f20595 = charSequence.length();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte m12795() {
        int i = this.f20594 - 1;
        CharSequence charSequence = this.f20596;
        char cCharAt = charSequence.charAt(i);
        this.f20593 = cCharAt;
        boolean zIsLowSurrogate = Character.isLowSurrogate(cCharAt);
        int i2 = this.f20594;
        if (zIsLowSurrogate) {
            int iCodePointBefore = Character.codePointBefore(charSequence, i2);
            this.f20594 -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f20594 = i2 - 1;
        char c = this.f20593;
        return c < 1792 ? f20592[c] : Character.getDirectionality(c);
    }
}
