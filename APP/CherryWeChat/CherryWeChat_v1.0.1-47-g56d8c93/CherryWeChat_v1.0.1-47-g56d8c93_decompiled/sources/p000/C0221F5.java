package p000;

/* JADX INFO: renamed from: F5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0221F5 {

    /* JADX INFO: renamed from: e */
    public static final byte[] f646e = new byte[1792];

    /* JADX INFO: renamed from: a */
    public final CharSequence f647a;

    /* JADX INFO: renamed from: b */
    public final int f648b;

    /* JADX INFO: renamed from: c */
    public int f649c;

    /* JADX INFO: renamed from: d */
    public char f650d;

    static {
        for (int i = 0; i < 1792; i++) {
            f646e[i] = Character.getDirectionality(i);
        }
    }

    public C0221F5(CharSequence charSequence) {
        this.f647a = charSequence;
        this.f648b = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final byte m435a() {
        int i = this.f649c - 1;
        CharSequence charSequence = this.f647a;
        char cCharAt = charSequence.charAt(i);
        this.f650d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f649c);
            this.f649c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f649c--;
        char c = this.f650d;
        return c < 1792 ? f646e[c] : Character.getDirectionality(c);
    }
}
