package p002B;

/* JADX INFO: renamed from: B.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0051a {

    /* JADX INFO: renamed from: e */
    public static final byte[] f180e = new byte[1792];

    /* JADX INFO: renamed from: a */
    public final CharSequence f181a;

    /* JADX INFO: renamed from: b */
    public final int f182b;

    /* JADX INFO: renamed from: c */
    public int f183c;

    /* JADX INFO: renamed from: d */
    public char f184d;

    static {
        for (int i2 = 0; i2 < 1792; i2++) {
            f180e[i2] = Character.getDirectionality(i2);
        }
    }

    public C0051a(CharSequence charSequence) {
        this.f181a = charSequence;
        this.f182b = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final byte m166a() {
        int i2 = this.f183c - 1;
        CharSequence charSequence = this.f181a;
        char cCharAt = charSequence.charAt(i2);
        this.f184d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f183c);
            this.f183c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f183c--;
        char c = this.f184d;
        return c < 1792 ? f180e[c] : Character.getDirectionality(c);
    }
}
