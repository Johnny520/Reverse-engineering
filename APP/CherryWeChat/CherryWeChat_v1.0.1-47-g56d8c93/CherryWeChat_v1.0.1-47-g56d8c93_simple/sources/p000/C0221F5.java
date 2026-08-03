package p000;

/* JADX INFO: renamed from: F5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0221F5 {

    /* JADX INFO: renamed from: e */
    public static final byte[] f646e = null;

    /* JADX INFO: renamed from: a */
    public final CharSequence f647a;

    /* JADX INFO: renamed from: b */
    public final int f648b;

    /* JADX INFO: renamed from: c */
    public int f649c;

    /* JADX INFO: renamed from: d */
    public char f650d;

    static {
        f646e = new byte[1792];
        int r1 = 0;
    L3:
        if (r1 >= 1792) goto L5;
        f646e[r1] = Character.getDirectionality(r1);
        r1 = r1 + 1;
        goto L3
    }

    public C0221F5(CharSequence r1) {
        this.f647a = r1;
        this.f648b = r1.length();
    }

    /* JADX INFO: renamed from: a */
    public final byte m435a() {
        int r0 = this.f649c - 1;
        CharSequence r1 = this.f647a;
        char r02 = r1.charAt(r0);
        this.f650d = r02;
        if (Character.isLowSurrogate(r02) == false) goto L6;
        int r03 = Character.codePointBefore(r1, this.f649c);
        this.f649c -= Character.charCount(r03);
        return Character.getDirectionality(r03);
    L6:
        this.f649c--;
        char r04 = this.f650d;
        if (r04 >= 1792) goto L10;
        return f646e[r04];
    L10:
        return Character.getDirectionality(r04);
    }
}
