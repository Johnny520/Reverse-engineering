package p152;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7595 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final byte[] f20587 = new byte[1792];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public char f20588;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f20589;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20590;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final CharSequence f20591;

    static {
        for (int i = 0; i < 1792; i++) {
            f20587[i] = Character.getDirectionality(i);
        }
    }

    public C7595(CharSequence charSequence) {
        this.f20591 = charSequence;
        this.f20590 = charSequence.length();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte m12824() {
        int i = this.f20589 - 1;
        CharSequence charSequence = this.f20591;
        char cCharAt = charSequence.charAt(i);
        this.f20588 = cCharAt;
        boolean zIsLowSurrogate = Character.isLowSurrogate(cCharAt);
        int i2 = this.f20589;
        if (zIsLowSurrogate) {
            int iCodePointBefore = Character.codePointBefore(charSequence, i2);
            this.f20589 -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f20589 = i2 - 1;
        char c = this.f20588;
        return c < 1792 ? f20587[c] : Character.getDirectionality(c);
    }
}
