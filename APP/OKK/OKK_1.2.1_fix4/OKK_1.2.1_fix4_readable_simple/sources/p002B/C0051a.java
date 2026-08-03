package p002B;

/* JADX INFO: renamed from: B.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0051a {

    /* JADX INFO: renamed from: e */
    public static final byte[] f180e = null;

    /* JADX INFO: renamed from: a */
    public final CharSequence f181a;

    /* JADX INFO: renamed from: b */
    public final int f182b;

    /* JADX INFO: renamed from: c */
    public int f183c;

    /* JADX INFO: renamed from: d */
    public char f184d;

    static {
        f180e = new byte[1792];
        int r1 = 0;
    L3:
        if (r1 >= 1792) goto L5;
        f180e[r1] = Character.getDirectionality(r1);
        r1 = r1 + 1;
        goto L3
    }

    public C0051a(CharSequence r1) {
        this.f181a = r1;
        this.f182b = r1.length();
    }

    /* JADX INFO: renamed from: a */
    public final byte m166a() {
        int r02 = this.f183c - 1;
        CharSequence r1 = this.f181a;
        char r03 = r1.charAt(r02);
        this.f184d = r03;
        if (Character.isLowSurrogate(r03) == false) goto L6;
        int r04 = Character.codePointBefore(r1, this.f183c);
        this.f183c -= Character.charCount(r04);
        return Character.getDirectionality(r04);
    L6:
        this.f183c--;
        char r05 = this.f184d;
        if (r05 >= 1792) goto L10;
        return f180e[r05];
    L10:
        return Character.getDirectionality(r05);
    }
}
