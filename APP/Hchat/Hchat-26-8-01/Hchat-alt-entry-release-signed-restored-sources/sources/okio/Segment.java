package okio;

import gg.AbstractC1411g;
import java.util.Arrays;
import p136j8.C2104o;
import tf.AbstractC4165l;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Segment {
    public static final Companion Companion = new Companion(null);
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;
    public final byte[] data;
    public int limit;
    public Segment next;
    public boolean owner;
    public int pos;
    public Segment prev;
    public boolean shared;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Segment(byte[] bArr, int i9, int i10, boolean z9, boolean z10) {
        bArr.getClass();
        this.data = bArr;
        this.pos = i9;
        this.limit = i10;
        this.shared = z9;
        this.owner = z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void compact() {
        int i9;
        Segment segment = this.prev;
        if (segment == this) {
            C2104o.m5276A("cannot compact");
            return;
        }
        segment.getClass();
        if (segment.owner) {
            int i10 = this.limit - this.pos;
            Segment segment2 = this.prev;
            segment2.getClass();
            int i11 = 8192 - segment2.limit;
            Segment segment3 = this.prev;
            segment3.getClass();
            if (segment3.shared) {
                i9 = 0;
            } else {
                Segment segment4 = this.prev;
                segment4.getClass();
                i9 = segment4.pos;
            }
            if (i10 > i11 + i9) {
                return;
            }
            Segment segment5 = this.prev;
            segment5.getClass();
            writeTo(segment5, i10);
            pop();
            SegmentPool.recycle(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Segment pop() {
        Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.prev;
        segment2.getClass();
        segment2.next = this.next;
        Segment segment3 = this.next;
        segment3.getClass();
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Segment push(Segment segment) {
        segment.getClass();
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        segment2.getClass();
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Segment split(int i9) {
        Segment segmentTake;
        if (i9 <= 0 || i9 > this.limit - this.pos) {
            C2104o.m5294t("byteCount out of range");
            return null;
        }
        if (i9 >= 1024) {
            segmentTake = sharedCopy();
        } else {
            segmentTake = SegmentPool.take();
            byte[] bArr = this.data;
            byte[] bArr2 = segmentTake.data;
            int i10 = this.pos;
            AbstractC4165l.m8380o0(bArr, 0, i10, bArr2, i10 + i9);
        }
        segmentTake.limit = segmentTake.pos + i9;
        this.pos += i9;
        Segment segment = this.prev;
        segment.getClass();
        segment.push(segmentTake);
        return segmentTake;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Segment unsharedCopy() {
        byte[] bArr = this.data;
        return new Segment(Arrays.copyOf(bArr, bArr.length), this.pos, this.limit, false, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeTo(Segment segment, int i9) {
        segment.getClass();
        if (!segment.owner) {
            C2104o.m5276A("only owner can write");
            return;
        }
        int i10 = segment.limit;
        int i11 = i10 + i9;
        if (i11 > 8192) {
            if (segment.shared) {
                C2104o.m5289o();
                return;
            }
            int i12 = segment.pos;
            if (i11 - i12 > 8192) {
                C2104o.m5289o();
                return;
            }
            byte[] bArr = segment.data;
            AbstractC4165l.m8380o0(bArr, 0, i12, bArr, i10);
            segment.limit -= segment.pos;
            segment.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = segment.data;
        int i13 = segment.limit;
        int i14 = this.pos;
        AbstractC4165l.m8380o0(bArr2, i13, i14, bArr3, i14 + i9);
        segment.limit += i9;
        this.pos += i9;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okio.Segment.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        private Companion() {
        }
    }

    public Segment() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }
}
