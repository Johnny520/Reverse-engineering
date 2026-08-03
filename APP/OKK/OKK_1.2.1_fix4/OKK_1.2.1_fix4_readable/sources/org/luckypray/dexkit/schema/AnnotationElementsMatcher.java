package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementsMatcher */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationElementsMatcher extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementsMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addElementCount(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(2, i2);
        }

        public final void addElements(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(0, i2);
        }

        public final void addMatchType(C0733b c0733b, byte b2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1920c(1, b2);
        }

        public final int createAnnotationElementsMatcher(C0733b c0733b, int i2, byte b2, int i3) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(3);
            addElementCount(c0733b, i3);
            addElements(c0733b, i2);
            addMatchType(c0733b, b2);
            return endAnnotationElementsMatcher(c0733b);
        }

        public final int createElementsVector(C0733b c0733b, int[] iArr) {
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

        public final int endAnnotationElementsMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final AnnotationElementsMatcher getRootAsAnnotationElementsMatcher(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsAnnotationElementsMatcher(byteBuffer, new AnnotationElementsMatcher());
        }

        public final void startAnnotationElementsMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(3);
        }

        public final void startElementsVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(4, i2, 4);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final AnnotationElementsMatcher getRootAsAnnotationElementsMatcher(ByteBuffer byteBuffer, AnnotationElementsMatcher annotationElementsMatcher) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(annotationElementsMatcher, "obj");
            return annotationElementsMatcher.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final AnnotationElementsMatcher __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final IntRange elementCount(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "obj");
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return intRange.__assign(i__indirect, byteBuffer);
    }

    public final AnnotationElementMatcher elements(int i2) {
        return elements(new AnnotationElementMatcher(), i2);
    }

    public final IntRange getElementCount() {
        return elementCount(new IntRange());
    }

    public final int getElementsLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final byte getMatchType() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f2573bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public final boolean mutateMatchType(byte b2) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.put(i__offset + this.bb_pos, b2);
        return true;
    }

    public final AnnotationElementMatcher elements(AnnotationElementMatcher annotationElementMatcher, int i2) {
        AbstractC0307g.m703e(annotationElementMatcher, "obj");
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i2 * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return annotationElementMatcher.__assign(i__indirect, byteBuffer);
    }
}
