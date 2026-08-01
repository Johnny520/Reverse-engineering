package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class OutputBuffer {
    private java.lang.StringBuilder text;

    public OutputBuffer() {
            r1 = this;
            r1.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.text = r0
            return
    }

    public void append(char r1) {
            r0 = this;
            java.lang.StringBuilder r0 = r0.text
            r0.append(r1)
            return
    }

    public void append(java.lang.String r1) {
            r0 = this;
            java.lang.StringBuilder r0 = r0.text
            r0.append(r1)
            return
    }

    public void append(java.lang.String r1, int r2, int r3) {
            r0 = this;
            java.lang.StringBuilder r0 = r0.text
            r0.append(r1, r2, r3)
            return
    }

    public void append(char[] r3) {
            r2 = this;
            java.lang.StringBuilder r2 = r2.text
            r0 = 0
            int r1 = r3.length
            r2.append(r3, r0, r1)
            return
    }

    public void append(char[] r1, int r2, int r3) {
            r0 = this;
            java.lang.StringBuilder r0 = r0.text
            r0.append(r1, r2, r3)
            return
    }

    public void clear() {
            r1 = this;
            java.lang.StringBuilder r1 = r1.text
            r0 = 0
            r1.setLength(r0)
            return
    }

    public void write(java.io.Writer r1) {
            r0 = this;
            java.lang.StringBuilder r0 = r0.text
            r1.append(r0)
            return
    }
}
