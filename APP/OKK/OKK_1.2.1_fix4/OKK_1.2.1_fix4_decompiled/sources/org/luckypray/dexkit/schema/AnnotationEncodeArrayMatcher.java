package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeArrayMatcher extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addMatchType(C0733b c0733b, byte b2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1920c(2, b2);
        }

        public final void addValueCount(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(3, i2);
        }

        public final void addValues(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(1, i2);
        }

        public final void addValuesType(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(0, i2);
        }

        public final int createAnnotationEncodeArrayMatcher(C0733b c0733b, int i2, int i3, byte b2, int i4) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(4);
            addValueCount(c0733b, i4);
            addValues(c0733b, i3);
            addValuesType(c0733b, i2);
            addMatchType(c0733b, b2);
            return endAnnotationEncodeArrayMatcher(c0733b);
        }

        /* JADX INFO: renamed from: createValuesTypeVector-VU-fvBY, reason: not valid java name */
        public final int m2683createValuesTypeVectorVUfvBY(C0733b c0733b, byte[] bArr) {
            AbstractC0307g.m703e(c0733b, "builder");
            AbstractC0307g.m703e(bArr, "data");
            c0733b.m1937t(1, bArr.length, 1);
            for (int length = bArr.length - 1; -1 < length; length--) {
                c0733b.m1919b(bArr[length]);
            }
            return c0733b.m1930m();
        }

        public final int createValuesVector(C0733b c0733b, int[] iArr) {
            AbstractC0307g.m703e(c0733b, "builder");
            AbstractC0307g.m703e(iArr, "data");
            c0733b.m1937t(4, iArr.length, 4);
            int length = iArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0733b.m1930m();
                }
                c0733b.m1924g(iArr[length]);
            }
        }

        public final int endAnnotationEncodeArrayMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final AnnotationEncodeArrayMatcher getRootAsAnnotationEncodeArrayMatcher(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsAnnotationEncodeArrayMatcher(byteBuffer, new AnnotationEncodeArrayMatcher());
        }

        public final void startAnnotationEncodeArrayMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(4);
        }

        public final void startValuesTypeVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(1, i2, 1);
        }

        public final void startValuesVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(4, i2, 4);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final AnnotationEncodeArrayMatcher getRootAsAnnotationEncodeArrayMatcher(ByteBuffer byteBuffer, AnnotationEncodeArrayMatcher annotationEncodeArrayMatcher) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(annotationEncodeArrayMatcher, "obj");
            return annotationEncodeArrayMatcher.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final AnnotationEncodeArrayMatcher __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final byte getMatchType() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f2573bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public final IntRange getValueCount() {
        return valueCount(new IntRange());
    }

    public final int getValuesLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final ByteBuffer getValuesTypeAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(4, 1);
        AbstractC0307g.m702d(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(4, 1)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getValuesTypeLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final boolean mutateMatchType(byte b2) {
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.put(i__offset + this.bb_pos, b2);
        return true;
    }

    /* JADX INFO: renamed from: mutateValuesType-EK-6454, reason: not valid java name */
    public final boolean m2681mutateValuesTypeEK6454(int i2, byte b2) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.put(__vector(i__offset) + i2, b2);
        return true;
    }

    public final IntRange valueCount(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "obj");
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return intRange.__assign(i__indirect, byteBuffer);
    }

    public final AbstractC0735d values(AbstractC0735d abstractC0735d, int i2) {
        AbstractC0307g.m703e(abstractC0735d, "obj");
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        return __union(abstractC0735d, (i2 * 4) + __vector(i__offset));
    }

    /* JADX INFO: renamed from: valuesType-Wa3L5BU, reason: not valid java name */
    public final byte m2682valuesTypeWa3L5BU(int i2) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f2573bb.get(__vector(i__offset) + i2);
        }
        return (byte) 0;
    }

    public final ByteBuffer valuesTypeInByteBuffer(ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 4, 1);
        AbstractC0307g.m702d(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 4, 1)");
        return byteBuffer__vector_in_bytebuffer;
    }
}
