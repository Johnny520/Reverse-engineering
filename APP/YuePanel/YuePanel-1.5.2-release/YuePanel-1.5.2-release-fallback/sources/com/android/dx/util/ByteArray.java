package com.android.dx.util;

/* JADX INFO: loaded from: classes.dex */
public final class ByteArray {
    private final byte[] bytes;
    private final int size;
    private final int start;

    public interface GetCursor {
        int getCursor();
    }

    public static class MyDataInputStream extends java.io.DataInputStream {
        private final com.android.dx.util.ByteArray.MyInputStream wrapped;

        public MyDataInputStream(com.android.dx.util.ByteArray.MyInputStream r1) {
                r0 = this;
                r0.<init>(r1)
                r0.wrapped = r1
                return
        }
    }

    public class MyInputStream extends java.io.InputStream {
        private int cursor;
        private int mark;
        final /* synthetic */ com.android.dx.util.ByteArray this$0;

        public MyInputStream(com.android.dx.util.ByteArray r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.cursor = r1
                r0.mark = r1
                return
        }

        @Override // java.io.InputStream
        public int available() {
                r2 = this;
                com.android.dx.util.ByteArray r0 = r2.this$0
                int r0 = com.android.dx.util.ByteArray.access$000(r0)
                int r1 = r2.cursor
                int r0 = r0 - r1
                return r0
        }

        @Override // java.io.InputStream
        public void mark(int r1) {
                r0 = this;
                int r1 = r0.cursor
                r0.mark = r1
                return
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
                r2 = this;
                int r0 = r2.cursor
                com.android.dx.util.ByteArray r1 = r2.this$0
                int r1 = com.android.dx.util.ByteArray.access$000(r1)
                if (r0 < r1) goto Lc
                r0 = -1
                return r0
            Lc:
                com.android.dx.util.ByteArray r0 = r2.this$0
                int r1 = r2.cursor
                int r0 = com.android.dx.util.ByteArray.access$100(r0, r1)
                int r1 = r2.cursor
                int r1 = r1 + 1
                r2.cursor = r1
                return r0
        }

        @Override // java.io.InputStream
        public int read(byte[] r4, int r5, int r6) {
                r3 = this;
                int r0 = r5 + r6
                int r1 = r4.length
                if (r0 <= r1) goto L7
                int r6 = r4.length
                int r6 = r6 - r5
            L7:
                com.android.dx.util.ByteArray r0 = r3.this$0
                int r0 = com.android.dx.util.ByteArray.access$000(r0)
                int r1 = r3.cursor
                int r0 = r0 - r1
                if (r6 <= r0) goto L13
                r6 = r0
            L13:
                com.android.dx.util.ByteArray r0 = r3.this$0
                byte[] r0 = com.android.dx.util.ByteArray.access$200(r0)
                int r1 = r3.cursor
                com.android.dx.util.ByteArray r2 = r3.this$0
                int r2 = com.android.dx.util.ByteArray.access$300(r2)
                int r1 = r1 + r2
                java.lang.System.arraycopy(r0, r1, r4, r5, r6)
                int r4 = r3.cursor
                int r4 = r4 + r6
                r3.cursor = r4
                return r6
        }

        @Override // java.io.InputStream
        public void reset() {
                r1 = this;
                int r0 = r1.mark
                r1.cursor = r0
                return
        }
    }

    public ByteArray(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.<init>(r3, r1, r0)
            return
    }

    public ByteArray(byte[] r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L2c
            if (r3 < 0) goto L24
            if (r4 < r3) goto L1c
            int r0 = r2.length
            if (r4 > r0) goto L14
            r1.bytes = r2
            r1.start = r3
            int r4 = r4 - r3
            r1.size = r4
            return
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "end > bytes.length"
            r2.<init>(r3)
            throw r2
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "end < start"
            r2.<init>(r3)
            throw r2
        L24:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "start < 0"
            r2.<init>(r3)
            throw r2
        L2c:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "bytes == null"
            r2.<init>(r3)
            throw r2
    }

    public static /* synthetic */ int access$000(com.android.dx.util.ByteArray r0) {
            int r0 = r0.size
            return r0
    }

    public static /* synthetic */ int access$100(com.android.dx.util.ByteArray r0, int r1) {
            int r0 = r0.getUnsignedByte0(r1)
            return r0
    }

    public static /* synthetic */ byte[] access$200(com.android.dx.util.ByteArray r0) {
            byte[] r0 = r0.bytes
            return r0
    }

    public static /* synthetic */ int access$300(com.android.dx.util.ByteArray r0) {
            int r0 = r0.start
            return r0
    }

    private void checkOffsets(int r4, int r5) {
            r3 = this;
            if (r4 < 0) goto L9
            if (r5 < r4) goto L9
            int r0 = r3.size
            if (r5 > r0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bad range: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ".."
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = "; actual size "
            r1.append(r4)
            int r4 = r3.size
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private int getByte0(int r3) {
            r2 = this;
            byte[] r0 = r2.bytes
            int r1 = r2.start
            int r1 = r1 + r3
            r3 = r0[r1]
            return r3
    }

    private int getUnsignedByte0(int r3) {
            r2 = this;
            byte[] r0 = r2.bytes
            int r1 = r2.start
            int r1 = r1 + r3
            r3 = r0[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            return r3
    }

    public int getByte(int r2) {
            r1 = this;
            int r0 = r2 + 1
            r1.checkOffsets(r2, r0)
            int r2 = r1.getByte0(r2)
            return r2
    }

    public void getBytes(byte[] r4, int r5) {
            r3 = this;
            int r0 = r4.length
            int r0 = r0 - r5
            int r1 = r3.size
            if (r0 < r1) goto Le
            byte[] r0 = r3.bytes
            int r2 = r3.start
            java.lang.System.arraycopy(r0, r2, r4, r5, r1)
            return
        Le:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.String r5 = "(out.length - offset) < size()"
            r4.<init>(r5)
            throw r4
    }

    public int getInt(int r3) {
            r2 = this;
            int r0 = r3 + 4
            r2.checkOffsets(r3, r0)
            int r0 = r2.getByte0(r3)
            int r0 = r0 << 24
            int r1 = r3 + 1
            int r1 = r2.getUnsignedByte0(r1)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r3 + 2
            int r1 = r2.getUnsignedByte0(r1)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 3
            int r3 = r2.getUnsignedByte0(r3)
            r3 = r3 | r0
            return r3
    }

    public long getLong(int r6) {
            r5 = this;
            int r0 = r6 + 8
            r5.checkOffsets(r6, r0)
            int r0 = r5.getByte0(r6)
            int r0 = r0 << 24
            int r1 = r6 + 1
            int r1 = r5.getUnsignedByte0(r1)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r6 + 2
            int r1 = r5.getUnsignedByte0(r1)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r6 + 3
            int r1 = r5.getUnsignedByte0(r1)
            r0 = r0 | r1
            int r1 = r6 + 4
            int r1 = r5.getByte0(r1)
            int r1 = r1 << 24
            int r2 = r6 + 5
            int r2 = r5.getUnsignedByte0(r2)
            int r2 = r2 << 16
            r1 = r1 | r2
            int r2 = r6 + 6
            int r2 = r5.getUnsignedByte0(r2)
            int r2 = r2 << 8
            r1 = r1 | r2
            int r6 = r6 + 7
            int r6 = r5.getUnsignedByte0(r6)
            r6 = r6 | r1
            long r1 = (long) r6
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            long r3 = (long) r0
            r6 = 32
            long r3 = r3 << r6
            long r0 = r1 | r3
            return r0
    }

    public int getShort(int r2) {
            r1 = this;
            int r0 = r2 + 2
            r1.checkOffsets(r2, r0)
            int r0 = r1.getByte0(r2)
            int r0 = r0 << 8
            int r2 = r2 + 1
            int r2 = r1.getUnsignedByte0(r2)
            r2 = r2 | r0
            return r2
    }

    public int getUnsignedByte(int r2) {
            r1 = this;
            int r0 = r2 + 1
            r1.checkOffsets(r2, r0)
            int r2 = r1.getUnsignedByte0(r2)
            return r2
    }

    public int getUnsignedShort(int r2) {
            r1 = this;
            int r0 = r2 + 2
            r1.checkOffsets(r2, r0)
            int r0 = r1.getUnsignedByte0(r2)
            int r0 = r0 << 8
            int r2 = r2 + 1
            int r2 = r1.getUnsignedByte0(r2)
            r2 = r2 | r0
            return r2
    }

    public com.android.dx.util.ByteArray.MyDataInputStream makeDataInputStream() {
            r2 = this;
            com.android.dx.util.ByteArray$MyDataInputStream r0 = new com.android.dx.util.ByteArray$MyDataInputStream
            com.android.dx.util.ByteArray$MyInputStream r1 = r2.makeInputStream()
            r0.<init>(r1)
            return r0
    }

    public com.android.dx.util.ByteArray.MyInputStream makeInputStream() {
            r1 = this;
            com.android.dx.util.ByteArray$MyInputStream r0 = new com.android.dx.util.ByteArray$MyInputStream
            r0.<init>(r1)
            return r0
    }

    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    public com.android.dx.util.ByteArray slice(int r2, int r3) {
            r1 = this;
            r1.checkOffsets(r2, r3)
            byte[] r0 = r1.bytes
            byte[] r2 = java.util.Arrays.copyOfRange(r0, r2, r3)
            com.android.dx.util.ByteArray r3 = new com.android.dx.util.ByteArray
            r3.<init>(r2)
            return r3
    }

    public int underlyingOffset(int r2) {
            r1 = this;
            int r0 = r1.start
            int r0 = r0 + r2
            return r0
    }
}
