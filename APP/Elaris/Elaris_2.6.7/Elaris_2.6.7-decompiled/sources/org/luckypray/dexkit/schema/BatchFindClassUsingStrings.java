package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0000a;
import p000.AbstractC0367od;
import p000.AbstractC0431r2;
import p000.C0038c5;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-BatchFindClassUsingStrings, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class BatchFindClassUsingStrings extends AbstractC0367od {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BatchFindClassUsingStrings __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String excludePackages(int i) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        return __string((i * 4) + __vector(i__offset));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getExcludePackagesLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getIgnorePackagesCase() {
        int i__offset = __offset(8);
        return (i__offset == 0 || this.f662bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer getInClassesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(10, 8);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getInClassesLength() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getMatchersLength() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getSearchPackagesLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long inClasses(int i) {
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return 0L;
        }
        return this.f662bb.getLong((i * 8) + __vector(i__offset));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer inClassesInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 10, 8);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BatchUsingStringsMatcher matchers(BatchUsingStringsMatcher batchUsingStringsMatcher, int i) {
        batchUsingStringsMatcher.getClass();
        int i__offset = __offset(12);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return batchUsingStringsMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateIgnorePackagesCase(boolean z) {
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return false;
        }
        this.f662bb.put(i__offset + this.bb_pos, z ? (byte) 1 : (byte) 0);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateInClasses(int i, long j) {
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return false;
        }
        this.f662bb.putLong((i * 8) + __vector(i__offset), j);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String searchPackages(int i) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return null;
        }
        return __string((i * 4) + __vector(i__offset));
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-BatchFindClassUsingStrings$Companion */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-BatchFindClassUsingStrings.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addExcludePackages(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(1, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addIgnorePackagesCase(C0038c5 c0038c5, boolean z) {
            c0038c5.getClass();
            c0038c5.m95a(2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addInClasses(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(3, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addMatchers(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(4, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addSearchPackages(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(0, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int createBatchFindClassUsingStrings(C0038c5 c0038c5, int i, int i2, boolean z, int i3, int i4) {
            c0038c5.getClass();
            c0038c5.m112r(5);
            addMatchers(c0038c5, i4);
            addInClasses(c0038c5, i3);
            addExcludePackages(c0038c5, i2);
            addSearchPackages(c0038c5, i);
            addIgnorePackagesCase(c0038c5, z);
            return endBatchFindClassUsingStrings(c0038c5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000e */
        public final int createExcludePackagesVector(C0038c5 c0038c5, int[] iArr) {
            c0038c5.getClass();
            iArr.getClass();
            c0038c5.m113s(4, iArr.length, 4);
            int length = iArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0038c5.m107m();
                }
                c0038c5.m101g(iArr[length]);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000f */
        public final int createInClassesVector(C0038c5 c0038c5, long[] jArr) {
            c0038c5.getClass();
            jArr.getClass();
            c0038c5.m113s(8, jArr.length, 8);
            int length = jArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0038c5.m107m();
                }
                c0038c5.m100f(jArr[length]);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000e */
        public final int createMatchersVector(C0038c5 c0038c5, int[] iArr) {
            c0038c5.getClass();
            iArr.getClass();
            c0038c5.m113s(4, iArr.length, 4);
            int length = iArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0038c5.m107m();
                }
                c0038c5.m101g(iArr[length]);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000e */
        public final int createSearchPackagesVector(C0038c5 c0038c5, int[] iArr) {
            c0038c5.getClass();
            iArr.getClass();
            c0038c5.m113s(4, iArr.length, 4);
            int length = iArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0038c5.m107m();
                }
                c0038c5.m101g(iArr[length]);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int endBatchFindClassUsingStrings(C0038c5 c0038c5) {
            c0038c5.getClass();
            return c0038c5.m106l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final BatchFindClassUsingStrings getRootAsBatchFindClassUsingStrings(ByteBuffer byteBuffer, BatchFindClassUsingStrings batchFindClassUsingStrings) {
            byteBuffer.getClass();
            batchFindClassUsingStrings.getClass();
            return batchFindClassUsingStrings.__assign(byteBuffer.position() + AbstractC0000a.m0a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startBatchFindClassUsingStrings(C0038c5 c0038c5) {
            c0038c5.getClass();
            c0038c5.m112r(5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startExcludePackagesVector(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m113s(4, i, 4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startInClassesVector(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m113s(8, i, 8);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startMatchersVector(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m113s(4, i, 4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startSearchPackagesVector(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m113s(4, i, 4);
        }

        private Companion() {
        }

        public final BatchFindClassUsingStrings getRootAsBatchFindClassUsingStrings(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsBatchFindClassUsingStrings(byteBuffer, new BatchFindClassUsingStrings());
        }

        public final void validateVersion() {
        }
    }

    public final BatchUsingStringsMatcher matchers(int i) {
        return matchers(new BatchUsingStringsMatcher(), i);
    }
}
