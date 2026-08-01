package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0000a;
import p000.AbstractC0367od;
import p000.AbstractC0431r2;
import p000.C0038c5;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementMatcher, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationElementMatcher extends AbstractC0367od {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementMatcher __assign(int i, ByteBuffer byteBuffer) {
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
    public final StringMatcher getName() {
        return name(new StringMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getValueType-w2LRezQ, reason: not valid java name */
    public final byte m1238getValueTypew2LRezQ() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f662bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: mutateValueType-7apg3OU, reason: not valid java name */
    public final boolean m1239mutateValueType7apg3OU(byte b) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f662bb.put(i__offset + this.bb_pos, b);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher name(StringMatcher stringMatcher) {
        stringMatcher.getClass();
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return stringMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0367od value(AbstractC0367od abstractC0367od) {
        abstractC0367od.getClass();
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __union(abstractC0367od, i__offset + this.bb_pos);
        }
        return null;
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementMatcher$Companion */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-AnnotationElementMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addName(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(0, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addValue(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(2, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: addValueType-EK-6454, reason: not valid java name */
        public final void m1240addValueTypeEK6454(C0038c5 c0038c5, byte b) {
            c0038c5.getClass();
            c0038c5.m97c(1, b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: createAnnotationElementMatcher-SpDDLgk, reason: not valid java name */
        public final int m1241createAnnotationElementMatcherSpDDLgk(C0038c5 c0038c5, int i, byte b, int i2) {
            c0038c5.getClass();
            c0038c5.m112r(3);
            addValue(c0038c5, i2);
            addName(c0038c5, i);
            m1240addValueTypeEK6454(c0038c5, b);
            return endAnnotationElementMatcher(c0038c5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int endAnnotationElementMatcher(C0038c5 c0038c5) {
            c0038c5.getClass();
            return c0038c5.m106l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationElementMatcher getRootAsAnnotationElementMatcher(ByteBuffer byteBuffer, AnnotationElementMatcher annotationElementMatcher) {
            byteBuffer.getClass();
            annotationElementMatcher.getClass();
            return annotationElementMatcher.__assign(byteBuffer.position() + AbstractC0000a.m0a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startAnnotationElementMatcher(C0038c5 c0038c5) {
            c0038c5.getClass();
            c0038c5.m112r(3);
        }

        private Companion() {
        }

        public final AnnotationElementMatcher getRootAsAnnotationElementMatcher(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsAnnotationElementMatcher(byteBuffer, new AnnotationElementMatcher());
        }

        public final void validateVersion() {
        }
    }
}
