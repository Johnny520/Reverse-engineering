package net.bytebuddy.utility;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class StreamDrainer {
    public static final net.bytebuddy.utility.StreamDrainer DEFAULT = null;
    public static final int DEFAULT_BUFFER_SIZE = 1024;
    private static final int END_OF_STREAM = -1;
    private static final int FROM_BEGINNING = 0;
    private final int bufferSize;

    static {
            net.bytebuddy.utility.StreamDrainer r0 = new net.bytebuddy.utility.StreamDrainer
            r0.<init>()
            net.bytebuddy.utility.StreamDrainer.DEFAULT = r0
            return
    }

    public StreamDrainer() {
            r1 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r1.<init>(r0)
            return
    }

    public StreamDrainer(int r1) {
            r0 = this;
            r0.<init>()
            r0.bufferSize = r1
            return
    }

    public byte[] drain(java.io.InputStream r9) throws java.io.IOException {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.bufferSize
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = r2
        Lb:
            int r4 = r8.bufferSize
            int r4 = r4 - r3
            int r4 = r9.read(r1, r3, r4)
            int r5 = java.lang.Math.max(r4, r2)
            int r3 = r3 + r5
            int r5 = r8.bufferSize
            if (r3 != r5) goto L23
            r0.add(r1)
            int r1 = r8.bufferSize
            byte[] r1 = new byte[r1]
            r3 = r2
        L23:
            r5 = -1
            if (r4 != r5) goto Lb
            int r9 = r0.size()
            int r4 = r8.bufferSize
            int r9 = r9 * r4
            int r9 = r9 + r3
            byte[] r9 = new byte[r9]
            java.util.Iterator r0 = r0.iterator()
            r4 = r2
        L35:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L4b
            java.lang.Object r5 = r0.next()
            byte[] r5 = (byte[]) r5
            int r6 = r4 + 1
            int r7 = r8.bufferSize
            int r4 = r4 * r7
            java.lang.System.arraycopy(r5, r2, r9, r4, r7)
            r4 = r6
            goto L35
        L4b:
            int r0 = r8.bufferSize
            int r4 = r4 * r0
            java.lang.System.arraycopy(r1, r2, r9, r4, r3)
            return r9
    }

    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            int r2 = r4.bufferSize
            net.bytebuddy.utility.StreamDrainer r5 = (net.bytebuddy.utility.StreamDrainer) r5
            int r5 = r5.bufferSize
            if (r2 == r5) goto L1c
            return r1
        L1c:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.bufferSize
            int r0 = r0 + r1
            return r0
    }
}
