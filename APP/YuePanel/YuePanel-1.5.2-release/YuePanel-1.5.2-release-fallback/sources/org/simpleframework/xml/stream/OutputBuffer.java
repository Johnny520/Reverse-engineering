package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
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

    public void append(char r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.text
            r0.append(r2)
            return
    }

    public void append(java.lang.String r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.text
            r0.append(r2)
            return
    }

    public void append(java.lang.String r2, int r3, int r4) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.text
            r0.append(r2, r3, r4)
            return
    }

    public void append(char[] r4) {
            r3 = this;
            java.lang.StringBuilder r0 = r3.text
            int r1 = r4.length
            r2 = 0
            r0.append(r4, r2, r1)
            return
    }

    public void append(char[] r2, int r3, int r4) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.text
            r0.append(r2, r3, r4)
            return
    }

    public void clear() {
            r2 = this;
            java.lang.StringBuilder r0 = r2.text
            r1 = 0
            r0.setLength(r1)
            return
    }

    public void write(java.io.Writer r2) throws java.io.IOException {
            r1 = this;
            java.lang.StringBuilder r0 = r1.text
            r2.append(r0)
            return
    }
}
