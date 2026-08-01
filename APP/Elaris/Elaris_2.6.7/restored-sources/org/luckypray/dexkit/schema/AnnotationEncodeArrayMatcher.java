package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0000a;
import p000.AbstractC0367od;
import p000.AbstractC0431r2;
import p000.C0038c5;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeArrayMatcher extends AbstractC0367od {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayMatcher __assign(int i, ByteBuffer byteBuffer) {
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
    public final byte getMatchType() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f662bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IntRange getValueCount() {
        return valueCount(new IntRange());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getValuesLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer getValuesTypeAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(4, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getValuesTypeLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateMatchType(byte b) {
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return false;
        }
        this.f662bb.put(i__offset + this.bb_pos, b);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: mutateValuesType-EK-6454, reason: not valid java name */
    public final boolean m1242mutateValuesTypeEK6454(int i, byte b) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f662bb.put(__vector(i__offset) + i, b);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IntRange valueCount(IntRange intRange) {
        intRange.getClass();
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return intRange.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0367od values(AbstractC0367od abstractC0367od, int i) {
        abstractC0367od.getClass();
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        return __union(abstractC0367od, (i * 4) + __vector(i__offset));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: valuesType-Wa3L5BU, reason: not valid java name */
    public final byte m1243valuesTypeWa3L5BU(int i) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f662bb.get(__vector(i__offset) + i);
        }
        return (byte) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer valuesTypeInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 4, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher$Companion */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addMatchType(C0038c5 c0038c5, byte b) {
            c0038c5.getClass();
            c0038c5.m97c(2, b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addValueCount(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(3, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addValues(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(1, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addValuesType(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(0, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int createAnnotationEncodeArrayMatcher(C0038c5 c0038c5, int i, int i2, byte b, int i3) {
            c0038c5.getClass();
            c0038c5.m112r(4);
            addValueCount(c0038c5, i3);
            addValues(c0038c5, i2);
            addValuesType(c0038c5, i);
            addMatchType(c0038c5, b);
            return endAnnotationEncodeArrayMatcher(c0038c5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: createValuesTypeVector-VU-fvBY, reason: not valid java name */
        public final int m1244createValuesTypeVectorVUfvBY(C0038c5 c0038c5, byte[] bArr) {
            c0038c5.getClass();
            bArr.getClass();
            c0038c5.m113s(1, bArr.length, 1);
            for (int length = bArr.length - 1; -1 < length; length--) {
                c0038c5.m96b(bArr[length]);
            }
            return c0038c5.m107m();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000e */
        public final int createValuesVector(C0038c5 c0038c5, int[] iArr) {
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
        public final int endAnnotationEncodeArrayMatcher(C0038c5 c0038c5) {
            c0038c5.getClass();
            return c0038c5.m106l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeArrayMatcher getRootAsAnnotationEncodeArrayMatcher(ByteBuffer byteBuffer, AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher) {
            byteBuffer.getClass();
            annotationEncodeArrayMatcher.getClass();
            return annotationEncodeArrayMatcher.__assign(byteBuffer.position() + AbstractC0000a.m0a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startAnnotationEncodeArrayMatcher(C0038c5 c0038c5) {
            c0038c5.getClass();
            c0038c5.m112r(4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startValuesTypeVector(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m113s(1, i, 1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startValuesVector(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m113s(4, i, 4);
        }

        private Companion() {
        }

        public final AnnotationEncodeArrayMatcher getRootAsAnnotationEncodeArrayMatcher(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsAnnotationEncodeArrayMatcher(byteBuffer, new AnnotationEncodeArrayMatcher());
        }

        public final void validateVersion() {
        }
    }
}
