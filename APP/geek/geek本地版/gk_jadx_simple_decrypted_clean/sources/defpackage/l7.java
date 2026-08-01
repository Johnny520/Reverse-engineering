package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l7 {
    public static final byte[] e = null;
    public final CharSequence a;
    public final int b;
    public int c;
    public char d;

    static {
        e = new byte[1792];
        int r1 = 0;
    L3:
        if (r1 >= 1792) goto L5;
        e[r1] = Character.getDirectionality(r1);
        r1 = r1 + 1;
        goto L3
    }

    public l7(CharSequence r1) {
        this.a = r1;
        this.b = r1.length();
    }

    public final byte a() {
        int r0 = this.c - 1;
        CharSequence r1 = this.a;
        char r02 = r1.charAt(r0);
        this.d = r02;
        if (Character.isLowSurrogate(r02) == false) goto L6;
        int r03 = Character.codePointBefore(r1, this.c);
        this.c -= Character.charCount(r03);
        return Character.getDirectionality(r03);
    L6:
        this.c--;
        char r04 = this.d;
        if (r04 >= 1792) goto L10;
        return e[r04];
    L10:
        return Character.getDirectionality(r04);
    }
}
