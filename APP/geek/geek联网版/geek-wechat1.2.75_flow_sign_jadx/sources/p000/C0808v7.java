package p000;

/* JADX INFO: renamed from: v7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0808v7 {

    /* JADX INFO: renamed from: e */
    public static final byte[] f4908e = new byte[1792];

    /* JADX INFO: renamed from: a */
    public final CharSequence f4909a;

    /* JADX INFO: renamed from: b */
    public final int f4910b;

    /* JADX INFO: renamed from: c */
    public int f4911c;

    /* JADX INFO: renamed from: d */
    public char f4912d;

    static {
        for (int i = 0; i < 1792; i++) {
            f4908e[i] = Character.getDirectionality(i);
        }
    }

    public C0808v7(CharSequence charSequence) {
        this.f4909a = charSequence;
        this.f4910b = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final byte m2545a() {
        int i = this.f4911c - 1;
        CharSequence charSequence = this.f4909a;
        char cCharAt = charSequence.charAt(i);
        this.f4912d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f4911c);
            this.f4911c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f4911c--;
        char c = this.f4912d;
        return c < 1792 ? f4908e[c] : Character.getDirectionality(c);
    }
}
