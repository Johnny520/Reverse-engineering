package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
abstract class Splitter {
    protected java.lang.StringBuilder builder;
    protected int count;
    protected int off;
    protected char[] text;

    public Splitter(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.builder = r0
            char[] r2 = r2.toCharArray()
            r1.text = r2
            int r2 = r2.length
            r1.count = r2
            return
    }

    private boolean acronym() {
            r7 = this;
            int r0 = r7.off
            r1 = 0
            r2 = r1
        L4:
            int r3 = r7.count
            if (r0 >= r3) goto L17
            char[] r3 = r7.text
            char r3 = r3[r0]
            boolean r3 = r7.isUpper(r3)
            if (r3 == 0) goto L17
            int r2 = r2 + 1
            int r0 = r0 + 1
            goto L4
        L17:
            r3 = 1
            if (r2 <= r3) goto L37
            int r4 = r7.count
            if (r0 >= r4) goto L2c
            char[] r4 = r7.text
            int r5 = r0 + (-1)
            char r4 = r4[r5]
            boolean r4 = r7.isUpper(r4)
            if (r4 == 0) goto L2c
            int r0 = r0 + (-1)
        L2c:
            char[] r4 = r7.text
            int r5 = r7.off
            int r6 = r0 - r5
            r7.commit(r4, r5, r6)
            r7.off = r0
        L37:
            if (r2 <= r3) goto L3a
            return r3
        L3a:
            return r1
    }

    private boolean isDigit(char r1) {
            r0 = this;
            boolean r0 = java.lang.Character.isDigit(r1)
            return r0
    }

    private boolean isLetter(char r1) {
            r0 = this;
            boolean r0 = java.lang.Character.isLetter(r1)
            return r0
    }

    private boolean isSpecial(char r1) {
            r0 = this;
            boolean r0 = java.lang.Character.isLetterOrDigit(r1)
            r0 = r0 ^ 1
            return r0
    }

    private boolean isUpper(char r1) {
            r0 = this;
            boolean r0 = java.lang.Character.isUpperCase(r1)
            return r0
    }

    private boolean number() {
            r6 = this;
            int r0 = r6.off
            r1 = 0
            r2 = r1
        L4:
            int r3 = r6.count
            if (r0 >= r3) goto L17
            char[] r3 = r6.text
            char r3 = r3[r0]
            boolean r3 = r6.isDigit(r3)
            if (r3 == 0) goto L17
            int r2 = r2 + 1
            int r0 = r0 + 1
            goto L4
        L17:
            if (r2 <= 0) goto L22
            char[] r3 = r6.text
            int r4 = r6.off
            int r5 = r0 - r4
            r6.commit(r3, r4, r5)
        L22:
            r6.off = r0
            if (r2 <= 0) goto L28
            r6 = 1
            return r6
        L28:
            return r1
    }

    private void token() {
            r4 = this;
            int r0 = r4.off
        L2:
            int r1 = r4.count
            if (r0 >= r1) goto L1f
            char[] r1 = r4.text
            char r1 = r1[r0]
            boolean r2 = r4.isLetter(r1)
            if (r2 != 0) goto L11
            goto L1f
        L11:
            int r2 = r4.off
            if (r0 <= r2) goto L1c
            boolean r1 = r4.isUpper(r1)
            if (r1 == 0) goto L1c
            goto L1f
        L1c:
            int r0 = r0 + 1
            goto L2
        L1f:
            int r1 = r4.off
            if (r0 <= r1) goto L33
            char[] r2 = r4.text
            int r3 = r0 - r1
            r4.parse(r2, r1, r3)
            char[] r1 = r4.text
            int r2 = r4.off
            int r3 = r0 - r2
            r4.commit(r1, r2, r3)
        L33:
            r4.off = r0
            return
    }

    public abstract void commit(char[] r1, int r2, int r3);

    public abstract void parse(char[] r1, int r2, int r3);

    public java.lang.String process() {
            r2 = this;
        L0:
            int r0 = r2.off
            int r1 = r2.count
            if (r0 >= r1) goto L2b
        L6:
            int r0 = r2.off
            int r1 = r2.count
            if (r0 >= r1) goto L1e
            char[] r1 = r2.text
            char r0 = r1[r0]
            boolean r0 = r2.isSpecial(r0)
            if (r0 != 0) goto L17
            goto L1e
        L17:
            int r0 = r2.off
            int r0 = r0 + 1
            r2.off = r0
            goto L6
        L1e:
            boolean r0 = r2.acronym()
            if (r0 != 0) goto L0
            r2.token()
            r2.number()
            goto L0
        L2b:
            java.lang.StringBuilder r2 = r2.builder
            java.lang.String r2 = r2.toString()
            return r2
    }

    public char toLower(char r1) {
            r0 = this;
            char r0 = java.lang.Character.toLowerCase(r1)
            return r0
    }

    public char toUpper(char r1) {
            r0 = this;
            char r0 = java.lang.Character.toUpperCase(r1)
            return r0
    }
}
