package p000;

/* JADX INFO: renamed from: l7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0438l7 {

    /* JADX INFO: renamed from: e */
    public static final byte[] f3023e = new byte[1792];

    /* JADX INFO: renamed from: a */
    public final CharSequence f3024a;

    /* JADX INFO: renamed from: b */
    public final int f3025b;

    /* JADX INFO: renamed from: c */
    public int f3026c;

    /* JADX INFO: renamed from: d */
    public char f3027d;

    static {
        for (int i = 0; i < 1792; i++) {
            f3023e[i] = Character.getDirectionality(i);
        }
    }

    public C0438l7(CharSequence charSequence) {
        this.f3024a = charSequence;
        this.f3025b = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final byte m1752a() {
        int i = this.f3026c - 1;
        CharSequence charSequence = this.f3024a;
        char cCharAt = charSequence.charAt(i);
        this.f3027d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f3026c);
            this.f3026c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f3026c--;
        char c = this.f3027d;
        return c < 1792 ? f3023e[c] : Character.getDirectionality(c);
    }
}
