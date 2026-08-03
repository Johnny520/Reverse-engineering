package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeArrayMatcher extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationEncodeArrayMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addMatchType(C0733b r2, byte r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1920c(2, r3);
        }

        public final void addValueCount(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(3, r3);
        }

        public final void addValues(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(1, r3);
        }

        public final void addValuesType(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(0, r3);
        }

        public final int createAnnotationEncodeArrayMatcher(C0733b r2, int r3, int r4, byte r5, int r6) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(4);
            addValueCount(r2, r6);
            addValues(r2, r4);
            addValuesType(r2, r3);
            addMatchType(r2, r5);
            return endAnnotationEncodeArrayMatcher(r2);
        }

        /* JADX INFO: renamed from: createValuesTypeVector-VU-fvBY */
        public final int m2683createValuesTypeVectorVUfvBY(C0733b r3, byte[] r4) {
            AbstractC0307g.m703e(r3, "builder");
            AbstractC0307g.m703e(r4, "data");
            r3.m1937t(1, r4.length, 1);
            int r02 = r4.length - 1;
        L4:
            if ((-1) >= r02) goto L7;
            r3.m1919b(r4[r02]);
            r02 = r02 - 1;
            goto L4
        L7:
            return r3.m1930m();
        }

        public final int createValuesVector(C0733b r3, int[] r4) {
            AbstractC0307g.m703e(r3, "builder");
            AbstractC0307g.m703e(r4, "data");
            r3.m1937t(4, r4.length, 4);
            int r02 = r4.length;
        L3:
            r02 = r02 - 1;
            if ((-1) >= r02) goto L7;
            r3.m1924g(r4[r02]);
            goto L3
        L7:
            return r3.m1930m();
        }

        public final int endAnnotationEncodeArrayMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final AnnotationEncodeArrayMatcher getRootAsAnnotationEncodeArrayMatcher(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsAnnotationEncodeArrayMatcher(r2, new AnnotationEncodeArrayMatcher());
        }

        public final void startAnnotationEncodeArrayMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(4);
        }

        public final void startValuesTypeVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(1, r3, 1);
        }

        public final void startValuesVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(4, r3, 4);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final AnnotationEncodeArrayMatcher getRootAsAnnotationEncodeArrayMatcher(ByteBuffer r3, AnnotationEncodeArrayMatcher r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public AnnotationEncodeArrayMatcher() {
    }

    public final AnnotationEncodeArrayMatcher __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final byte getMatchType() {
        int r02 = __offset(8);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.get(r02 + this.bb_pos);
    }

    public final IntRange getValueCount() {
        return valueCount(new IntRange());
    }

    public final int getValuesLength() {
        int r02 = __offset(6);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final ByteBuffer getValuesTypeAsByteBuffer() {
        ByteBuffer r02 = __vector_as_bytebuffer(4, 1);
        AbstractC0307g.m702d(r02, "__vector_as_bytebuffer(4, 1)");
        return r02;
    }

    public final int getValuesTypeLength() {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final boolean mutateMatchType(byte r4) {
        int r02 = __offset(8);
        if (r02 == 0) goto L5;
        this.f2573bb.put(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: mutateValuesType-EK-6454 */
    public final boolean m2681mutateValuesTypeEK6454(int r3, byte r4) {
        int r02 = __offset(4);
        if (r02 == 0) goto L5;
        this.f2573bb.put(__vector(r02) + r3, r4);
        return true;
    L5:
        return false;
    }

    public final IntRange valueCount(IntRange r4) {
        AbstractC0307g.m703e(r4, "obj");
        int r02 = __offset(10);
        if (r02 == 0) goto L5;
        int r03 = __indirect(r02 + this.bb_pos);
        ByteBuffer r1 = this.f2573bb;
        AbstractC0307g.m702d(r1, "bb");
        return r4.__assign(r03, r1);
    L5:
        return null;
    }

    public final AbstractC0735d values(AbstractC0735d r2, int r3) {
        AbstractC0307g.m703e(r2, "obj");
        int r02 = __offset(6);
        if (r02 == 0) goto L5;
        int r32 = r3 * 4;
        return __union(r2, r32 + __vector(r02));
    L5:
        return null;
    }

    /* JADX INFO: renamed from: valuesType-Wa3L5BU */
    public final byte m2682valuesTypeWa3L5BU(int r3) {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.get(__vector(r02) + r3);
    }

    public final ByteBuffer valuesTypeInByteBuffer(ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        ByteBuffer r32 = __vector_in_bytebuffer(r3, 4, 1);
        AbstractC0307g.m702d(r32, "__vector_in_bytebuffer(_bb, 4, 1)");
        return r32;
    }
}
