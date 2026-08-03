package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationElementMatcher extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addName(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(0, i2);
        }

        public final void addValue(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(2, i2);
        }

        /* JADX INFO: renamed from: addValueType-EK-6454, reason: not valid java name */
        public final void m2679addValueTypeEK6454(C0733b c0733b, byte b2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1920c(1, b2);
        }

        /* JADX INFO: renamed from: createAnnotationElementMatcher-SpDDLgk, reason: not valid java name */
        public final int m2680createAnnotationElementMatcherSpDDLgk(C0733b c0733b, int i2, byte b2, int i3) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(3);
            addValue(c0733b, i3);
            addName(c0733b, i2);
            m2679addValueTypeEK6454(c0733b, b2);
            return endAnnotationElementMatcher(c0733b);
        }

        public final int endAnnotationElementMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final AnnotationElementMatcher getRootAsAnnotationElementMatcher(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsAnnotationElementMatcher(byteBuffer, new AnnotationElementMatcher());
        }

        public final void startAnnotationElementMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(3);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final AnnotationElementMatcher getRootAsAnnotationElementMatcher(ByteBuffer byteBuffer, AnnotationElementMatcher annotationElementMatcher) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(annotationElementMatcher, "obj");
            return annotationElementMatcher.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final AnnotationElementMatcher __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final StringMatcher getName() {
        return name(new StringMatcher());
    }

    /* JADX INFO: renamed from: getValueType-w2LRezQ, reason: not valid java name */
    public final byte m2677getValueTypew2LRezQ() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f2573bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: mutateValueType-7apg3OU, reason: not valid java name */
    public final boolean m2678mutateValueType7apg3OU(byte b2) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.put(i__offset + this.bb_pos, b2);
        return true;
    }

    public final StringMatcher name(StringMatcher stringMatcher) {
        AbstractC0307g.m703e(stringMatcher, "obj");
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return stringMatcher.__assign(i__indirect, byteBuffer);
    }

    public final AbstractC0735d value(AbstractC0735d abstractC0735d) {
        AbstractC0307g.m703e(abstractC0735d, "obj");
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __union(abstractC0735d, i__offset + this.bb_pos);
        }
        return null;
    }
}
