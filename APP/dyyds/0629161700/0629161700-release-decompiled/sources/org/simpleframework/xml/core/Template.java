package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class Template {
    protected char[] buf;
    protected java.lang.String cache;
    protected int count;

    public Template() {
            r1 = this;
            r0 = 16
            r1.<init>(r0)
            return
    }

    public Template(int r1) {
            r0 = this;
            r0.<init>()
            char[] r1 = new char[r1]
            r0.buf = r1
            return
    }

    public void append(char r4) {
            r3 = this;
            int r0 = r3.count
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
            char[] r0 = r3.buf
            int r1 = r3.count
            int r2 = r1 + 1
            r3.count = r2
            r0[r1] = r4
            return
    }

    public void append(java.lang.String r5) {
            r4 = this;
            int r0 = r4.count
            int r1 = r5.length()
            int r1 = r1 + r0
            r4.ensureCapacity(r1)
            int r0 = r5.length()
            char[] r1 = r4.buf
            int r2 = r4.count
            r3 = 0
            r5.getChars(r3, r0, r1, r2)
            int r0 = r4.count
            int r5 = r5.length()
            int r5 = r5 + r0
            r4.count = r5
            return
    }

    public void append(java.lang.String r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.count
            int r0 = r0 + r5
            r2.ensureCapacity(r0)
            char[] r0 = r2.buf
            int r1 = r2.count
            r3.getChars(r4, r5, r0, r1)
            int r3 = r2.count
            int r3 = r3 + r5
            r2.count = r3
            return
    }

    public void append(org.simpleframework.xml.core.Template r3) {
            r2 = this;
            char[] r0 = r3.buf
            r1 = 0
            int r3 = r3.count
            r2.append(r0, r1, r3)
            return
    }

    public void append(org.simpleframework.xml.core.Template r1, int r2, int r3) {
            r0 = this;
            char[] r1 = r1.buf
            r0.append(r1, r2, r3)
            return
    }

    public void append(char[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.count
            int r0 = r0 + r5
            r2.ensureCapacity(r0)
            char[] r0 = r2.buf
            int r1 = r2.count
            java.lang.System.arraycopy(r3, r4, r0, r1, r5)
            int r3 = r2.count
            int r3 = r3 + r5
            r2.count = r3
            return
    }

    public void clear() {
            r1 = this;
            r0 = 0
            r1.cache = r0
            r0 = 0
            r1.count = r0
            return
    }

    public void ensureCapacity(int r4) {
            r3 = this;
            char[] r0 = r3.buf
            int r1 = r0.length
            if (r1 >= r4) goto L18
            int r0 = r0.length
            int r0 = r0 * 2
            int r4 = java.lang.Math.max(r4, r0)
            char[] r4 = new char[r4]
            char[] r0 = r3.buf
            int r1 = r3.count
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            r3.buf = r4
        L18:
            return
    }

    public int length() {
            r0 = this;
            int r0 = r0.count
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = new java.lang.String
            char[] r1 = r3.buf
            r2 = 0
            int r3 = r3.count
            r0.<init>(r1, r2, r3)
            return r0
    }
}
