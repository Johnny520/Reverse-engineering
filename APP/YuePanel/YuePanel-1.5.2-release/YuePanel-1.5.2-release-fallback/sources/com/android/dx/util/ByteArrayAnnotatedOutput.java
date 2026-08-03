package com.android.dx.util;

/* JADX INFO: loaded from: classes.dex */
public final class ByteArrayAnnotatedOutput implements com.android.dx.util.AnnotatedOutput, com.android.dex.util.ByteOutput {
    private static final int DEFAULT_SIZE = 1000;
    private int annotationWidth;
    private java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput.Annotation> annotations;
    private int cursor;
    private byte[] data;
    private int hexCols;
    private final boolean stretchy;
    private boolean verbose;

    public static class Annotation {
        private int end;
        private final int start;
        private final java.lang.String text;

        public Annotation(int r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.start = r1
                r0.end = r2
                r0.text = r3
                return
        }

        public Annotation(int r2, java.lang.String r3) {
                r1 = this;
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1.<init>(r2, r0, r3)
                return
        }

        public int getEnd() {
                r1 = this;
                int r0 = r1.end
                return r0
        }

        public int getStart() {
                r1 = this;
                int r0 = r1.start
                return r0
        }

        public java.lang.String getText() {
                r1 = this;
                java.lang.String r0 = r1.text
                return r0
        }

        public void setEnd(int r1) {
                r0 = this;
                r0.end = r1
                return
        }

        public void setEndIfUnset(int r3) {
                r2 = this;
                int r0 = r2.end
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L9
                r2.end = r3
            L9:
                return
        }
    }

    public ByteArrayAnnotatedOutput() {
            r1 = this;
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.<init>(r0)
            return
    }

    public ByteArrayAnnotatedOutput(int r2) {
            r1 = this;
            byte[] r2 = new byte[r2]
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public ByteArrayAnnotatedOutput(byte[] r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    private ByteArrayAnnotatedOutput(byte[] r1, boolean r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L16
            r0.stretchy = r2
            r0.data = r1
            r1 = 0
            r0.cursor = r1
            r0.verbose = r1
            r2 = 0
            r0.annotations = r2
            r0.annotationWidth = r1
            r0.hexCols = r1
            return
        L16:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "data == null"
            r1.<init>(r2)
            throw r1
    }

    private void ensureCapacity(int r4) {
            r3 = this;
            byte[] r0 = r3.data
            int r1 = r0.length
            if (r1 >= r4) goto L13
            int r4 = r4 * 2
            int r4 = r4 + 1000
            byte[] r4 = new byte[r4]
            int r1 = r3.cursor
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            r3.data = r4
        L13:
            return
    }

    private static void throwBounds() {
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "attempt to write past the end"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.android.dx.util.Output
    public void alignTo(int r4) {
            r3 = this;
            int r0 = r4 + (-1)
            if (r4 < 0) goto L28
            r4 = r4 & r0
            if (r4 != 0) goto L28
            int r4 = r3.cursor
            int r4 = r4 + r0
            int r0 = ~r0
            r4 = r4 & r0
            boolean r0 = r3.stretchy
            if (r0 == 0) goto L14
            r3.ensureCapacity(r4)
            goto L1d
        L14:
            byte[] r0 = r3.data
            int r0 = r0.length
            if (r4 <= r0) goto L1d
            throwBounds()
            return
        L1d:
            byte[] r0 = r3.data
            int r1 = r3.cursor
            r2 = 0
            java.util.Arrays.fill(r0, r1, r4, r2)
            r3.cursor = r4
            return
        L28:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bogus alignment"
            r4.<init>(r0)
            throw r4
    }

    @Override // com.android.dx.util.AnnotatedOutput
    public void annotate(int r4, java.lang.String r5) {
            r3 = this;
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r0 = r3.annotations
            if (r0 != 0) goto L5
            return
        L5:
            r3.endAnnotation()
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r0 = r3.annotations
            int r0 = r0.size()
            if (r0 != 0) goto L12
            r0 = 0
            goto L20
        L12:
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r1 = r3.annotations
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.get(r0)
            com.android.dx.util.ByteArrayAnnotatedOutput$Annotation r0 = (com.android.dx.util.ByteArrayAnnotatedOutput.Annotation) r0
            int r0 = r0.getEnd()
        L20:
            int r1 = r3.cursor
            if (r0 > r1) goto L25
            r0 = r1
        L25:
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r1 = r3.annotations
            com.android.dx.util.ByteArrayAnnotatedOutput$Annotation r2 = new com.android.dx.util.ByteArrayAnnotatedOutput$Annotation
            int r4 = r4 + r0
            r2.<init>(r0, r4, r5)
            r1.add(r2)
            return
    }

    @Override // com.android.dx.util.AnnotatedOutput
    public void annotate(java.lang.String r4) {
            r3 = this;
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r0 = r3.annotations
            if (r0 != 0) goto L5
            return
        L5:
            r3.endAnnotation()
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r0 = r3.annotations
            com.android.dx.util.ByteArrayAnnotatedOutput$Annotation r1 = new com.android.dx.util.ByteArrayAnnotatedOutput$Annotation
            int r2 = r3.cursor
            r1.<init>(r2, r4)
            r0.add(r1)
            return
    }

    @Override // com.android.dx.util.AnnotatedOutput
    public boolean annotates() {
            r1 = this;
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r0 = r1.annotations
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // com.android.dx.util.Output
    public void assertCursor(int r4) {
            r3 = this;
            int r0 = r3.cursor
            if (r0 != r4) goto L5
            return
        L5:
            com.android.dex.util.ExceptionWithContext r0 = new com.android.dex.util.ExceptionWithContext
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "expected cursor "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "; actual value: "
            r1.append(r4)
            int r4 = r3.cursor
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public void enableAnnotations(int r4, boolean r5) {
            r3 = this;
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r0 = r3.annotations
            if (r0 != 0) goto L36
            int r0 = r3.cursor
            if (r0 != 0) goto L36
            r0 = 40
            if (r4 < r0) goto L2e
            int r0 = r4 + (-7)
            int r0 = r0 / 15
            int r0 = r0 + 1
            r0 = r0 & (-2)
            r1 = 6
            if (r0 >= r1) goto L19
        L17:
            r0 = r1
            goto L1e
        L19:
            r1 = 10
            if (r0 <= r1) goto L1e
            goto L17
        L1e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 1000(0x3e8, float:1.401E-42)
            r1.<init>(r2)
            r3.annotations = r1
            r3.annotationWidth = r4
            r3.hexCols = r0
            r3.verbose = r5
            return
        L2e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "annotationWidth < 40"
            r4.<init>(r5)
            throw r4
        L36:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "cannot enable annotations"
            r4.<init>(r5)
            throw r4
    }

    @Override // com.android.dx.util.AnnotatedOutput
    public void endAnnotation() {
            r2 = this;
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r0 = r2.annotations
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.size()
            if (r0 == 0) goto L1a
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r1 = r2.annotations
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.get(r0)
            com.android.dx.util.ByteArrayAnnotatedOutput$Annotation r0 = (com.android.dx.util.ByteArrayAnnotatedOutput.Annotation) r0
            int r1 = r2.cursor
            r0.setEndIfUnset(r1)
        L1a:
            return
    }

    public void finishAnnotating() {
            r5 = this;
            r5.endAnnotation()
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r0 = r5.annotations
            if (r0 == 0) goto L32
            int r0 = r0.size()
        Lb:
            if (r0 <= 0) goto L32
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r1 = r5.annotations
            int r2 = r0 + (-1)
            java.lang.Object r1 = r1.get(r2)
            com.android.dx.util.ByteArrayAnnotatedOutput$Annotation r1 = (com.android.dx.util.ByteArrayAnnotatedOutput.Annotation) r1
            int r3 = r1.getStart()
            int r4 = r5.cursor
            if (r3 <= r4) goto L27
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r1 = r5.annotations
            r1.remove(r2)
            int r0 = r0 + (-1)
            goto Lb
        L27:
            int r0 = r1.getEnd()
            int r2 = r5.cursor
            if (r0 <= r2) goto L32
            r1.setEnd(r2)
        L32:
            return
    }

    @Override // com.android.dx.util.AnnotatedOutput
    public int getAnnotationWidth() {
            r2 = this;
            int r0 = r2.hexCols
            int r1 = r0 * 2
            int r1 = r1 + 8
            int r0 = r0 / 2
            int r1 = r1 + r0
            int r0 = r2.annotationWidth
            int r0 = r0 - r1
            return r0
    }

    public byte[] getArray() {
            r1 = this;
            byte[] r0 = r1.data
            return r0
    }

    @Override // com.android.dx.util.Output
    public int getCursor() {
            r1 = this;
            int r0 = r1.cursor
            return r0
    }

    @Override // com.android.dx.util.AnnotatedOutput
    public boolean isVerbose() {
            r1 = this;
            boolean r0 = r1.verbose
            return r0
    }

    public byte[] toByteArray() {
            r4 = this;
            int r0 = r4.cursor
            byte[] r1 = new byte[r0]
            byte[] r2 = r4.data
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
    }

    @Override // com.android.dx.util.Output
    public void write(com.android.dx.util.ByteArray r4) {
            r3 = this;
            int r0 = r4.size()
            int r1 = r3.cursor
            int r0 = r0 + r1
            boolean r2 = r3.stretchy
            if (r2 == 0) goto Lf
            r3.ensureCapacity(r0)
            goto L18
        Lf:
            byte[] r2 = r3.data
            int r2 = r2.length
            if (r0 <= r2) goto L18
            throwBounds()
            return
        L18:
            byte[] r2 = r3.data
            r4.getBytes(r2, r1)
            r3.cursor = r0
            return
    }

    @Override // com.android.dx.util.Output
    public void write(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.write(r3, r1, r0)
            return
    }

    @Override // com.android.dx.util.Output
    public void write(byte[] r5, int r6, int r7) {
            r4 = this;
            int r0 = r4.cursor
            int r1 = r0 + r7
            int r2 = r6 + r7
            r3 = r6 | r7
            r3 = r3 | r1
            if (r3 < 0) goto L27
            int r3 = r5.length
            if (r2 > r3) goto L27
            boolean r2 = r4.stretchy
            if (r2 == 0) goto L16
            r4.ensureCapacity(r1)
            goto L1f
        L16:
            byte[] r2 = r4.data
            int r2 = r2.length
            if (r1 <= r2) goto L1f
            throwBounds()
            return
        L1f:
            byte[] r2 = r4.data
            java.lang.System.arraycopy(r5, r6, r2, r0, r7)
            r4.cursor = r1
            return
        L27:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "bytes.length "
            r0.append(r2)
            int r5 = r5.length
            r0.append(r5)
            java.lang.String r5 = "; "
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = "..!"
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            r7.<init>(r5)
            throw r7
    }

    public void writeAnnotationsTo(java.io.Writer r13) throws java.io.IOException {
            r12 = this;
            int r0 = r12.getAnnotationWidth()
            int r1 = r12.annotationWidth
            int r1 = r1 - r0
            int r1 = r1 + (-1)
            com.android.dx.util.TwoColumnOutput r2 = new com.android.dx.util.TwoColumnOutput
            java.lang.String r3 = "|"
            r2.<init>(r13, r1, r0, r3)
            java.io.Writer r13 = r2.getLeft()
            java.io.Writer r0 = r2.getRight()
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r1 = r12.annotations
            int r1 = r1.size()
            r3 = 0
            r7 = r3
        L20:
            int r4 = r12.cursor
            if (r7 >= r4) goto L5c
            if (r3 >= r1) goto L5c
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r4 = r12.annotations
            java.lang.Object r4 = r4.get(r3)
            com.android.dx.util.ByteArrayAnnotatedOutput$Annotation r4 = (com.android.dx.util.ByteArrayAnnotatedOutput.Annotation) r4
            int r5 = r4.getStart()
            if (r7 >= r5) goto L39
            java.lang.String r4 = ""
            r11 = r5
            r8 = r7
            goto L45
        L39:
            int r6 = r4.getEnd()
            java.lang.String r4 = r4.getText()
            int r3 = r3 + 1
            r8 = r5
            r11 = r6
        L45:
            byte[] r5 = r12.data
            int r7 = r11 - r8
            int r9 = r12.hexCols
            r10 = 6
            r6 = r8
            java.lang.String r5 = com.android.dx.util.Hex.dump(r5, r6, r7, r8, r9, r10)
            r13.write(r5)
            r0.write(r4)
            r2.flush()
            r7 = r11
            goto L20
        L5c:
            if (r7 >= r4) goto L6e
            byte[] r5 = r12.data
            int r6 = r4 - r7
            int r8 = r12.hexCols
            r9 = 6
            r4 = r5
            r5 = r7
            java.lang.String r4 = com.android.dx.util.Hex.dump(r4, r5, r6, r7, r8, r9)
            r13.write(r4)
        L6e:
            if (r3 >= r1) goto L82
            java.util.ArrayList<com.android.dx.util.ByteArrayAnnotatedOutput$Annotation> r13 = r12.annotations
            java.lang.Object r13 = r13.get(r3)
            com.android.dx.util.ByteArrayAnnotatedOutput$Annotation r13 = (com.android.dx.util.ByteArrayAnnotatedOutput.Annotation) r13
            java.lang.String r13 = r13.getText()
            r0.write(r13)
            int r3 = r3 + 1
            goto L6e
        L82:
            r2.flush()
            return
    }

    @Override // com.android.dx.util.Output, com.android.dex.util.ByteOutput
    public void writeByte(int r4) {
            r3 = this;
            int r0 = r3.cursor
            int r1 = r0 + 1
            boolean r2 = r3.stretchy
            if (r2 == 0) goto Lc
            r3.ensureCapacity(r1)
            goto L15
        Lc:
            byte[] r2 = r3.data
            int r2 = r2.length
            if (r1 <= r2) goto L15
            throwBounds()
            return
        L15:
            byte[] r2 = r3.data
            byte r4 = (byte) r4
            r2[r0] = r4
            r3.cursor = r1
            return
    }

    @Override // com.android.dx.util.Output
    public void writeInt(int r6) {
            r5 = this;
            int r0 = r5.cursor
            int r1 = r0 + 4
            boolean r2 = r5.stretchy
            if (r2 == 0) goto Lc
            r5.ensureCapacity(r1)
            goto L15
        Lc:
            byte[] r2 = r5.data
            int r2 = r2.length
            if (r1 <= r2) goto L15
            throwBounds()
            return
        L15:
            byte[] r2 = r5.data
            byte r3 = (byte) r6
            r2[r0] = r3
            int r3 = r0 + 1
            int r4 = r6 >> 8
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 2
            int r4 = r6 >> 16
            byte r4 = (byte) r4
            r2[r3] = r4
            int r0 = r0 + 3
            int r6 = r6 >> 24
            byte r6 = (byte) r6
            r2[r0] = r6
            r5.cursor = r1
            return
    }

    @Override // com.android.dx.util.Output
    public void writeLong(long r7) {
            r6 = this;
            int r0 = r6.cursor
            int r1 = r0 + 8
            boolean r2 = r6.stretchy
            if (r2 == 0) goto Lc
            r6.ensureCapacity(r1)
            goto L15
        Lc:
            byte[] r2 = r6.data
            int r2 = r2.length
            if (r1 <= r2) goto L15
            throwBounds()
            return
        L15:
            int r2 = (int) r7
            byte[] r3 = r6.data
            byte r4 = (byte) r2
            r3[r0] = r4
            int r4 = r0 + 1
            int r5 = r2 >> 8
            byte r5 = (byte) r5
            r3[r4] = r5
            int r4 = r0 + 2
            int r5 = r2 >> 16
            byte r5 = (byte) r5
            r3[r4] = r5
            int r4 = r0 + 3
            int r2 = r2 >> 24
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 32
            long r7 = r7 >> r2
            int r7 = (int) r7
            int r8 = r0 + 4
            byte r2 = (byte) r7
            r3[r8] = r2
            int r8 = r0 + 5
            int r2 = r7 >> 8
            byte r2 = (byte) r2
            r3[r8] = r2
            int r8 = r0 + 6
            int r2 = r7 >> 16
            byte r2 = (byte) r2
            r3[r8] = r2
            int r0 = r0 + 7
            int r7 = r7 >> 24
            byte r7 = (byte) r7
            r3[r0] = r7
            r6.cursor = r1
            return
    }

    @Override // com.android.dx.util.Output
    public void writeShort(int r5) {
            r4 = this;
            int r0 = r4.cursor
            int r1 = r0 + 2
            boolean r2 = r4.stretchy
            if (r2 == 0) goto Lc
            r4.ensureCapacity(r1)
            goto L15
        Lc:
            byte[] r2 = r4.data
            int r2 = r2.length
            if (r1 <= r2) goto L15
            throwBounds()
            return
        L15:
            byte[] r2 = r4.data
            byte r3 = (byte) r5
            r2[r0] = r3
            int r0 = r0 + 1
            int r5 = r5 >> 8
            byte r5 = (byte) r5
            r2[r0] = r5
            r4.cursor = r1
            return
    }

    @Override // com.android.dx.util.Output
    public int writeSleb128(int r2) {
            r1 = this;
            boolean r0 = r1.stretchy
            if (r0 == 0) goto Lb
            int r0 = r1.cursor
            int r0 = r0 + 5
            r1.ensureCapacity(r0)
        Lb:
            int r0 = r1.cursor
            com.android.dex.Leb128.writeSignedLeb128(r1, r2)
            int r2 = r1.cursor
            int r2 = r2 - r0
            return r2
    }

    @Override // com.android.dx.util.Output
    public int writeUleb128(int r2) {
            r1 = this;
            boolean r0 = r1.stretchy
            if (r0 == 0) goto Lb
            int r0 = r1.cursor
            int r0 = r0 + 5
            r1.ensureCapacity(r0)
        Lb:
            int r0 = r1.cursor
            com.android.dex.Leb128.writeUnsignedLeb128(r1, r2)
            int r2 = r1.cursor
            int r2 = r2 - r0
            return r2
    }

    @Override // com.android.dx.util.Output
    public void writeZeroes(int r4) {
            r3 = this;
            if (r4 < 0) goto L21
            int r0 = r3.cursor
            int r0 = r0 + r4
            boolean r4 = r3.stretchy
            if (r4 == 0) goto Ld
            r3.ensureCapacity(r0)
            goto L16
        Ld:
            byte[] r4 = r3.data
            int r4 = r4.length
            if (r0 <= r4) goto L16
            throwBounds()
            return
        L16:
            byte[] r4 = r3.data
            int r1 = r3.cursor
            r2 = 0
            java.util.Arrays.fill(r4, r1, r0, r2)
            r3.cursor = r0
            return
        L21:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "count < 0"
            r4.<init>(r0)
            throw r4
    }
}
