package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Segment {
    public static final okio.Segment.Companion Companion = null;
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;
    public final byte[] data;
    public int limit;
    public okio.Segment next;
    public boolean owner;
    public int pos;
    public okio.Segment prev;
    public boolean shared;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okio.Segment$Companion r0 = new okio.Segment$Companion
            r1 = 0
            r0.<init>(r1)
            okio.Segment.Companion = r0
            return
    }

    public Segment() {
            r1 = this;
            r1.<init>()
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1.data = r0
            r0 = 1
            r1.owner = r0
            r0 = 0
            r1.shared = r0
            return
    }

    public Segment(byte[] r1, int r2, int r3, boolean r4, boolean r5) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.data = r1
            r0.pos = r2
            r0.limit = r3
            r0.shared = r4
            r0.owner = r5
            return
    }

    public final void compact() {
            r3 = this;
            okio.Segment r0 = r3.prev
            if (r0 == r3) goto L3f
            r0.getClass()
            boolean r0 = r0.owner
            if (r0 != 0) goto Lc
            goto L2f
        Lc:
            int r0 = r3.limit
            int r1 = r3.pos
            int r0 = r0 - r1
            okio.Segment r1 = r3.prev
            r1.getClass()
            int r1 = r1.limit
            int r1 = 8192 - r1
            okio.Segment r2 = r3.prev
            r2.getClass()
            boolean r2 = r2.shared
            if (r2 == 0) goto L25
            r2 = 0
            goto L2c
        L25:
            okio.Segment r2 = r3.prev
            r2.getClass()
            int r2 = r2.pos
        L2c:
            int r1 = r1 + r2
            if (r0 <= r1) goto L30
        L2f:
            return
        L30:
            okio.Segment r1 = r3.prev
            r1.getClass()
            r3.writeTo(r1, r0)
            r3.pop()
            okio.SegmentPool.recycle(r3)
            return
        L3f:
            java.lang.String r0 = "cannot compact"
            j8.o.A(r0)
            return
    }

    public final okio.Segment pop() {
            r4 = this;
            okio.Segment r0 = r4.next
            r1 = 0
            if (r0 == r4) goto L6
            goto L7
        L6:
            r0 = r1
        L7:
            okio.Segment r2 = r4.prev
            r2.getClass()
            okio.Segment r3 = r4.next
            r2.next = r3
            okio.Segment r2 = r4.next
            r2.getClass()
            okio.Segment r3 = r4.prev
            r2.prev = r3
            r4.next = r1
            r4.prev = r1
            return r0
    }

    public final okio.Segment push(okio.Segment r2) {
            r1 = this;
            r2.getClass()
            r2.prev = r1
            okio.Segment r0 = r1.next
            r2.next = r0
            okio.Segment r0 = r1.next
            r0.getClass()
            r0.prev = r2
            r1.next = r2
            return r2
    }

    public final okio.Segment sharedCopy() {
            r7 = this;
            r0 = 1
            r7.shared = r0
            okio.Segment r1 = new okio.Segment
            byte[] r2 = r7.data
            int r3 = r7.pos
            int r4 = r7.limit
            r5 = 1
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    public final okio.Segment split(int r7) {
            r6 = this;
            if (r7 <= 0) goto L35
            int r0 = r6.limit
            int r1 = r6.pos
            int r0 = r0 - r1
            if (r7 > r0) goto L35
            r0 = 1024(0x400, float:1.435E-42)
            if (r7 < r0) goto L12
            okio.Segment r0 = r6.sharedCopy()
            goto L22
        L12:
            okio.Segment r0 = okio.SegmentPool.take()
            byte[] r1 = r6.data
            byte[] r2 = r0.data
            int r3 = r6.pos
            int r4 = r3 + r7
            r5 = 0
            tf.l.o0(r1, r5, r3, r2, r4)
        L22:
            int r1 = r0.pos
            int r1 = r1 + r7
            r0.limit = r1
            int r1 = r6.pos
            int r1 = r1 + r7
            r6.pos = r1
            okio.Segment r7 = r6.prev
            r7.getClass()
            r7.push(r0)
            return r0
        L35:
            java.lang.String r7 = "byteCount out of range"
            j8.o.t(r7)
            r7 = 0
            return r7
    }

    public final okio.Segment unsharedCopy() {
            r6 = this;
            okio.Segment r0 = new okio.Segment
            byte[] r1 = r6.data
            int r2 = r1.length
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            int r2 = r6.pos
            int r3 = r6.limit
            r4 = 0
            r5 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final void writeTo(okio.Segment r6, int r7) {
            r5 = this;
            r6.getClass()
            boolean r0 = r6.owner
            if (r0 == 0) goto L48
            int r0 = r6.limit
            int r1 = r0 + r7
            r2 = 8192(0x2000, float:1.148E-41)
            if (r1 <= r2) goto L30
            boolean r3 = r6.shared
            if (r3 != 0) goto L2c
            int r3 = r6.pos
            int r1 = r1 - r3
            if (r1 > r2) goto L28
            byte[] r1 = r6.data
            r2 = 0
            tf.l.o0(r1, r2, r3, r1, r0)
            int r0 = r6.limit
            int r1 = r6.pos
            int r0 = r0 - r1
            r6.limit = r0
            r6.pos = r2
            goto L30
        L28:
            j8.o.o()
            return
        L2c:
            j8.o.o()
            return
        L30:
            byte[] r0 = r5.data
            byte[] r1 = r6.data
            int r2 = r6.limit
            int r3 = r5.pos
            int r4 = r3 + r7
            tf.l.o0(r0, r2, r3, r1, r4)
            int r0 = r6.limit
            int r0 = r0 + r7
            r6.limit = r0
            int r6 = r5.pos
            int r6 = r6 + r7
            r5.pos = r6
            return
        L48:
            java.lang.String r6 = "only owner can write"
            j8.o.A(r6)
            return
    }
}
