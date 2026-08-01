package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class Formatter {
    private static final char[] AND = null;
    private static final char[] CLOSE = null;
    private static final char[] DOUBLE = null;
    private static final char[] GREATER = null;
    private static final char[] LESS = null;
    private static final char[] NAMESPACE = null;
    private static final char[] OPEN = null;
    private static final char[] SINGLE = null;
    private org.simpleframework.xml.stream.OutputBuffer buffer;
    private org.simpleframework.xml.stream.Indenter indenter;
    private org.simpleframework.xml.stream.Formatter.Tag last;
    private java.lang.String prolog;
    private java.io.Writer result;

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public enum Tag extends java.lang.Enum<org.simpleframework.xml.stream.Formatter.Tag> {
        private static final /* synthetic */ org.simpleframework.xml.stream.Formatter.Tag[] $VALUES = null;
        public static final org.simpleframework.xml.stream.Formatter.Tag COMMENT = null;
        public static final org.simpleframework.xml.stream.Formatter.Tag END = null;
        public static final org.simpleframework.xml.stream.Formatter.Tag START = null;
        public static final org.simpleframework.xml.stream.Formatter.Tag TEXT = null;

        static {
                org.simpleframework.xml.stream.Formatter$Tag r0 = new org.simpleframework.xml.stream.Formatter$Tag
                java.lang.String r1 = "COMMENT"
                r2 = 0
                r0.<init>(r1, r2)
                org.simpleframework.xml.stream.Formatter.Tag.COMMENT = r0
                org.simpleframework.xml.stream.Formatter$Tag r1 = new org.simpleframework.xml.stream.Formatter$Tag
                java.lang.String r2 = "START"
                r3 = 1
                r1.<init>(r2, r3)
                org.simpleframework.xml.stream.Formatter.Tag.START = r1
                org.simpleframework.xml.stream.Formatter$Tag r2 = new org.simpleframework.xml.stream.Formatter$Tag
                java.lang.String r3 = "TEXT"
                r4 = 2
                r2.<init>(r3, r4)
                org.simpleframework.xml.stream.Formatter.Tag.TEXT = r2
                org.simpleframework.xml.stream.Formatter$Tag r3 = new org.simpleframework.xml.stream.Formatter$Tag
                java.lang.String r4 = "END"
                r5 = 3
                r3.<init>(r4, r5)
                org.simpleframework.xml.stream.Formatter.Tag.END = r3
                org.simpleframework.xml.stream.Formatter$Tag[] r0 = new org.simpleframework.xml.stream.Formatter.Tag[]{r0, r1, r2, r3}
                org.simpleframework.xml.stream.Formatter.Tag.$VALUES = r0
                return
        }

        Tag(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.simpleframework.xml.stream.Formatter.Tag valueOf(java.lang.String r1) {
                java.lang.Class<org.simpleframework.xml.stream.Formatter$Tag> r0 = org.simpleframework.xml.stream.Formatter.Tag.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.simpleframework.xml.stream.Formatter$Tag r1 = (org.simpleframework.xml.stream.Formatter.Tag) r1
                return r1
        }

        public static org.simpleframework.xml.stream.Formatter.Tag[] values() {
                org.simpleframework.xml.stream.Formatter$Tag[] r0 = org.simpleframework.xml.stream.Formatter.Tag.$VALUES
                java.lang.Object r0 = r0.clone()
                org.simpleframework.xml.stream.Formatter$Tag[] r0 = (org.simpleframework.xml.stream.Formatter.Tag[]) r0
                return r0
        }
    }

    static {
            r0 = 5
            char[] r1 = new char[r0]
            r1 = {x003c: FILL_ARRAY_DATA , data: [120, 109, 108, 110, 115} // fill-array
            org.simpleframework.xml.stream.Formatter.NAMESPACE = r1
            r1 = 4
            char[] r2 = new char[r1]
            r2 = {x0046: FILL_ARRAY_DATA , data: [38, 108, 116, 59} // fill-array
            org.simpleframework.xml.stream.Formatter.LESS = r2
            char[] r2 = new char[r1]
            r2 = {x004e: FILL_ARRAY_DATA , data: [38, 103, 116, 59} // fill-array
            org.simpleframework.xml.stream.Formatter.GREATER = r2
            r2 = 6
            char[] r3 = new char[r2]
            r3 = {x0056: FILL_ARRAY_DATA , data: [38, 113, 117, 111, 116, 59} // fill-array
            org.simpleframework.xml.stream.Formatter.DOUBLE = r3
            char[] r2 = new char[r2]
            r2 = {x0060: FILL_ARRAY_DATA , data: [38, 97, 112, 111, 115, 59} // fill-array
            org.simpleframework.xml.stream.Formatter.SINGLE = r2
            char[] r2 = new char[r0]
            r2 = {x006a: FILL_ARRAY_DATA , data: [38, 97, 109, 112, 59} // fill-array
            org.simpleframework.xml.stream.Formatter.AND = r2
            char[] r0 = new char[r0]
            r0 = {x0074: FILL_ARRAY_DATA , data: [60, 33, 45, 45, 32} // fill-array
            org.simpleframework.xml.stream.Formatter.OPEN = r0
            char[] r0 = new char[r1]
            r0 = {x007e: FILL_ARRAY_DATA , data: [32, 45, 45, 62} // fill-array
            org.simpleframework.xml.stream.Formatter.CLOSE = r0
            return
    }

    public Formatter(java.io.Writer r3, org.simpleframework.xml.stream.Format r4) {
            r2 = this;
            r2.<init>()
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            r1 = 1024(0x400, float:1.435E-42)
            r0.<init>(r3, r1)
            r2.result = r0
            org.simpleframework.xml.stream.Indenter r3 = new org.simpleframework.xml.stream.Indenter
            r3.<init>(r4)
            r2.indenter = r3
            org.simpleframework.xml.stream.OutputBuffer r3 = new org.simpleframework.xml.stream.OutputBuffer
            r3.<init>()
            r2.buffer = r3
            java.lang.String r3 = r4.getProlog()
            r2.prolog = r3
            return
    }

    private void append(char r1) {
            r0 = this;
            org.simpleframework.xml.stream.OutputBuffer r0 = r0.buffer
            r0.append(r1)
            return
    }

    private void append(java.lang.String r1) {
            r0 = this;
            org.simpleframework.xml.stream.OutputBuffer r0 = r0.buffer
            r0.append(r1)
            return
    }

    private void append(char[] r1) {
            r0 = this;
            org.simpleframework.xml.stream.OutputBuffer r0 = r0.buffer
            r0.append(r1)
            return
    }

    private void data(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<![CDATA["
            r1.write(r0)
            r1.write(r2)
            java.lang.String r2 = "]]>"
            r1.write(r2)
            return
    }

    private void escape(char r2) {
            r1 = this;
            char[] r0 = r1.symbol(r2)
            if (r0 == 0) goto La
            r1.write(r0)
            return
        La:
            r1.write(r2)
            return
    }

    private void escape(java.lang.String r4) {
            r3 = this;
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L11
            char r2 = r4.charAt(r1)
            r3.escape(r2)
            int r1 = r1 + 1
            goto L5
        L11:
            return
    }

    private boolean isEmpty(java.lang.String r1) {
            r0 = this;
            r0 = 1
            if (r1 == 0) goto Lb
            int r1 = r1.length()
            if (r1 != 0) goto La
            return r0
        La:
            r0 = 0
        Lb:
            return r0
    }

    private boolean isText(char r3) {
            r2 = this;
            r2 = 9
            r0 = 1
            if (r3 == r2) goto L1e
            r2 = 10
            if (r3 == r2) goto L1e
            r2 = 13
            if (r3 == r2) goto L1e
            r2 = 32
            if (r3 == r2) goto L1e
            r1 = 0
            if (r3 <= r2) goto L1d
            r2 = 126(0x7e, float:1.77E-43)
            if (r3 > r2) goto L1d
            r2 = 247(0xf7, float:3.46E-43)
            if (r3 == r2) goto L1d
            return r0
        L1d:
            return r1
        L1e:
            return r0
    }

    private char[] symbol(char r1) {
            r0 = this;
            r0 = 34
            if (r1 == r0) goto L22
            r0 = 60
            if (r1 == r0) goto L1f
            r0 = 62
            if (r1 == r0) goto L1c
            r0 = 38
            if (r1 == r0) goto L19
            r0 = 39
            if (r1 == r0) goto L16
            r0 = 0
            return r0
        L16:
            char[] r0 = org.simpleframework.xml.stream.Formatter.SINGLE
            return r0
        L19:
            char[] r0 = org.simpleframework.xml.stream.Formatter.AND
            return r0
        L1c:
            char[] r0 = org.simpleframework.xml.stream.Formatter.GREATER
            return r0
        L1f:
            char[] r0 = org.simpleframework.xml.stream.Formatter.LESS
            return r0
        L22:
            char[] r0 = org.simpleframework.xml.stream.Formatter.DOUBLE
            return r0
    }

    private java.lang.String unicode(char r1) {
            r0 = this;
            java.lang.String r0 = java.lang.Integer.toString(r1)
            return r0
    }

    private void write(char r3) {
            r2 = this;
            org.simpleframework.xml.stream.OutputBuffer r0 = r2.buffer
            java.io.Writer r1 = r2.result
            r0.write(r1)
            org.simpleframework.xml.stream.OutputBuffer r0 = r2.buffer
            r0.clear()
            java.io.Writer r2 = r2.result
            r2.write(r3)
            return
    }

    private void write(java.lang.String r3) {
            r2 = this;
            org.simpleframework.xml.stream.OutputBuffer r0 = r2.buffer
            java.io.Writer r1 = r2.result
            r0.write(r1)
            org.simpleframework.xml.stream.OutputBuffer r0 = r2.buffer
            r0.clear()
            java.io.Writer r2 = r2.result
            r2.write(r3)
            return
    }

    private void write(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            org.simpleframework.xml.stream.OutputBuffer r0 = r2.buffer
            java.io.Writer r1 = r2.result
            r0.write(r1)
            org.simpleframework.xml.stream.OutputBuffer r0 = r2.buffer
            r0.clear()
            boolean r0 = r2.isEmpty(r4)
            if (r0 != 0) goto L1e
            java.io.Writer r0 = r2.result
            r0.write(r4)
            java.io.Writer r4 = r2.result
            r0 = 58
            r4.write(r0)
        L1e:
            java.io.Writer r2 = r2.result
            r2.write(r3)
            return
    }

    private void write(char[] r3) {
            r2 = this;
            org.simpleframework.xml.stream.OutputBuffer r0 = r2.buffer
            java.io.Writer r1 = r2.result
            r0.write(r1)
            org.simpleframework.xml.stream.OutputBuffer r0 = r2.buffer
            r0.clear()
            java.io.Writer r2 = r2.result
            r2.write(r3)
            return
    }

    public void flush() {
            r2 = this;
            org.simpleframework.xml.stream.OutputBuffer r0 = r2.buffer
            java.io.Writer r1 = r2.result
            r0.write(r1)
            org.simpleframework.xml.stream.OutputBuffer r0 = r2.buffer
            r0.clear()
            java.io.Writer r2 = r2.result
            r2.flush()
            return
    }

    public void writeAttribute(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            org.simpleframework.xml.stream.Formatter$Tag r0 = r2.last
            org.simpleframework.xml.stream.Formatter$Tag r1 = org.simpleframework.xml.stream.Formatter.Tag.START
            if (r0 != r1) goto L1f
            r0 = 32
            r2.write(r0)
            r2.write(r3, r5)
            r3 = 61
            r2.write(r3)
            r3 = 34
            r2.write(r3)
            r2.escape(r4)
            r2.write(r3)
            return
        L1f:
            org.simpleframework.xml.stream.NodeException r2 = new org.simpleframework.xml.stream.NodeException
            java.lang.String r3 = "Start element required"
            r2.<init>(r3)
            throw r2
    }

    public void writeComment(java.lang.String r4) {
            r3 = this;
            org.simpleframework.xml.stream.Indenter r0 = r3.indenter
            java.lang.String r0 = r0.top()
            org.simpleframework.xml.stream.Formatter$Tag r1 = r3.last
            org.simpleframework.xml.stream.Formatter$Tag r2 = org.simpleframework.xml.stream.Formatter.Tag.START
            if (r1 != r2) goto L11
            r1 = 62
            r3.append(r1)
        L11:
            if (r0 == 0) goto L23
            r3.append(r0)
            char[] r0 = org.simpleframework.xml.stream.Formatter.OPEN
            r3.append(r0)
            r3.append(r4)
            char[] r4 = org.simpleframework.xml.stream.Formatter.CLOSE
            r3.append(r4)
        L23:
            org.simpleframework.xml.stream.Formatter$Tag r4 = org.simpleframework.xml.stream.Formatter.Tag.COMMENT
            r3.last = r4
            return
    }

    public void writeEnd(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            org.simpleframework.xml.stream.Indenter r0 = r6.indenter
            java.lang.String r0 = r0.pop()
            org.simpleframework.xml.stream.Formatter$Tag r1 = r6.last
            org.simpleframework.xml.stream.Formatter$Tag r2 = org.simpleframework.xml.stream.Formatter.Tag.START
            r3 = 62
            r4 = 47
            if (r1 != r2) goto L17
            r6.write(r4)
            r6.write(r3)
            goto L30
        L17:
            org.simpleframework.xml.stream.Formatter$Tag r5 = org.simpleframework.xml.stream.Formatter.Tag.TEXT
            if (r1 == r5) goto L1e
            r6.write(r0)
        L1e:
            org.simpleframework.xml.stream.Formatter$Tag r0 = r6.last
            if (r0 == r2) goto L30
            r0 = 60
            r6.write(r0)
            r6.write(r4)
            r6.write(r7, r8)
            r6.write(r3)
        L30:
            org.simpleframework.xml.stream.Formatter$Tag r7 = org.simpleframework.xml.stream.Formatter.Tag.END
            r6.last = r7
            return
    }

    public void writeNamespace(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            org.simpleframework.xml.stream.Formatter$Tag r0 = r2.last
            org.simpleframework.xml.stream.Formatter$Tag r1 = org.simpleframework.xml.stream.Formatter.Tag.START
            if (r0 != r1) goto L2f
            r0 = 32
            r2.write(r0)
            char[] r0 = org.simpleframework.xml.stream.Formatter.NAMESPACE
            r2.write(r0)
            boolean r0 = r2.isEmpty(r4)
            if (r0 != 0) goto L1e
            r0 = 58
            r2.write(r0)
            r2.write(r4)
        L1e:
            r4 = 61
            r2.write(r4)
            r4 = 34
            r2.write(r4)
            r2.escape(r3)
            r2.write(r4)
            return
        L2f:
            org.simpleframework.xml.stream.NodeException r2 = new org.simpleframework.xml.stream.NodeException
            java.lang.String r3 = "Start element required"
            r2.<init>(r3)
            throw r2
    }

    public void writeProlog() {
            r1 = this;
            java.lang.String r0 = r1.prolog
            if (r0 == 0) goto Lc
            r1.write(r0)
            java.lang.String r0 = "\n"
            r1.write(r0)
        Lc:
            return
    }

    public void writeStart(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            org.simpleframework.xml.stream.Indenter r0 = r3.indenter
            java.lang.String r0 = r0.push()
            org.simpleframework.xml.stream.Formatter$Tag r1 = r3.last
            org.simpleframework.xml.stream.Formatter$Tag r2 = org.simpleframework.xml.stream.Formatter.Tag.START
            if (r1 != r2) goto L11
            r1 = 62
            r3.append(r1)
        L11:
            r3.flush()
            r3.append(r0)
            r0 = 60
            r3.append(r0)
            boolean r0 = r3.isEmpty(r5)
            if (r0 != 0) goto L2a
            r3.append(r5)
            r5 = 58
            r3.append(r5)
        L2a:
            r3.append(r4)
            r3.last = r2
            return
    }

    public void writeText(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.stream.Mode r0 = org.simpleframework.xml.stream.Mode.ESCAPE
            r1.writeText(r2, r0)
            return
    }

    public void writeText(java.lang.String r3, org.simpleframework.xml.stream.Mode r4) {
            r2 = this;
            org.simpleframework.xml.stream.Formatter$Tag r0 = r2.last
            org.simpleframework.xml.stream.Formatter$Tag r1 = org.simpleframework.xml.stream.Formatter.Tag.START
            if (r0 != r1) goto Lb
            r0 = 62
            r2.write(r0)
        Lb:
            org.simpleframework.xml.stream.Mode r0 = org.simpleframework.xml.stream.Mode.DATA
            if (r4 != r0) goto L13
            r2.data(r3)
            goto L16
        L13:
            r2.escape(r3)
        L16:
            org.simpleframework.xml.stream.Formatter$Tag r3 = org.simpleframework.xml.stream.Formatter.Tag.TEXT
            r2.last = r3
            return
    }
}
