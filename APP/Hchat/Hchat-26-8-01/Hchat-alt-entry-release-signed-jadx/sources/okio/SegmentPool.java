package okio;

import java.util.concurrent.atomic.AtomicReference;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class SegmentPool {
    private static final int HASH_BUCKET_COUNT;
    private static final AtomicReference<Segment>[] hashBuckets;
    public static final SegmentPool INSTANCE = new SegmentPool();
    private static final int MAX_SIZE = 65536;
    private static final Segment LOCK = new Segment(new byte[0], 0, 0, false, false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        HASH_BUCKET_COUNT = iHighestOneBit;
        AtomicReference<Segment>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i9 = 0; i9 < iHighestOneBit; i9++) {
            atomicReferenceArr[i9] = new AtomicReference<>();
        }
        hashBuckets = atomicReferenceArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private SegmentPool() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final AtomicReference<Segment> firstRef() {
        return hashBuckets[(int) (Thread.currentThread().getId() & (((long) HASH_BUCKET_COUNT) - 1))];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void recycle(Segment segment) {
        AtomicReference<Segment> atomicReferenceFirstRef;
        Segment segment2;
        Segment andSet;
        segment.getClass();
        if (segment.next != null || segment.prev != null) {
            C2104o.m5294t("Failed requirement.");
            return;
        }
        if (segment.shared || (andSet = (atomicReferenceFirstRef = INSTANCE.firstRef()).getAndSet((segment2 = LOCK))) == segment2) {
            return;
        }
        int i9 = andSet != null ? andSet.limit : 0;
        if (i9 >= MAX_SIZE) {
            atomicReferenceFirstRef.set(andSet);
            return;
        }
        segment.next = andSet;
        segment.pos = 0;
        segment.limit = i9 + 8192;
        atomicReferenceFirstRef.set(segment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Segment take() {
        AtomicReference<Segment> atomicReferenceFirstRef = INSTANCE.firstRef();
        Segment segment = LOCK;
        Segment andSet = atomicReferenceFirstRef.getAndSet(segment);
        if (andSet == segment) {
            return new Segment();
        }
        if (andSet == null) {
            atomicReferenceFirstRef.set(null);
            return new Segment();
        }
        atomicReferenceFirstRef.set(andSet.next);
        andSet.next = null;
        andSet.limit = 0;
        return andSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getByteCount() {
        Segment segment = firstRef().get();
        if (segment == null) {
            return 0;
        }
        return segment.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getMAX_SIZE() {
        return MAX_SIZE;
    }
}
