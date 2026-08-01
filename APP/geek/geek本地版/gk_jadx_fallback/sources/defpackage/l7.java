package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l7 {
    public static final byte[] e = null;
    public final java.lang.CharSequence a;
    public final int b;
    public int c;
    public char d;

    static {
            r0 = 1792(0x700, float:2.511E-42)
            byte[] r1 = new byte[r0]
            defpackage.l7.e = r1
            r1 = 0
        L7:
            if (r1 >= r0) goto L14
            byte[] r2 = defpackage.l7.e
            byte r3 = java.lang.Character.getDirectionality(r1)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L7
        L14:
            return
    }

    public l7(java.lang.CharSequence r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            int r1 = r1.length()
            r0.b = r1
            return
    }

    public final byte a() {
            r3 = this;
            int r0 = r3.c
            int r0 = r0 + (-1)
            java.lang.CharSequence r1 = r3.a
            char r0 = r1.charAt(r0)
            r3.d = r0
            boolean r0 = java.lang.Character.isLowSurrogate(r0)
            if (r0 == 0) goto L26
            int r0 = r3.c
            int r0 = java.lang.Character.codePointBefore(r1, r0)
            int r1 = r3.c
            int r2 = java.lang.Character.charCount(r0)
            int r1 = r1 - r2
            r3.c = r1
            byte r0 = java.lang.Character.getDirectionality(r0)
            return r0
        L26:
            int r0 = r3.c
            int r0 = r0 + (-1)
            r3.c = r0
            char r0 = r3.d
            r1 = 1792(0x700, float:2.511E-42)
            if (r0 >= r1) goto L37
            byte[] r1 = defpackage.l7.e
            r0 = r1[r0]
            goto L3b
        L37:
            byte r0 = java.lang.Character.getDirectionality(r0)
        L3b:
            return r0
    }
}
