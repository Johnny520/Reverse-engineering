package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0619pl;
import p000.AbstractC0748t1;
import p000.C0938xt;
import p000.c61;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementMatcher, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationElementMatcher extends c61 {
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
    public final byte m5669getValueTypew2LRezQ() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f715bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: mutateValueType-7apg3OU, reason: not valid java name */
    public final boolean m5670mutateValueType7apg3OU(byte b) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f715bb.put(i__offset + this.bb_pos, b);
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
        ByteBuffer byteBuffer = this.f715bb;
        byteBuffer.getClass();
        return stringMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final c61 value(c61 c61Var) {
        c61Var.getClass();
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __union(c61Var, i__offset + this.bb_pos);
        }
        return null;
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementMatcher$Companion */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-AnnotationElementMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addName(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5159h(0, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addValue(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5159h(2, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: addValueType-EK-6454, reason: not valid java name */
        public final void m5671addValueTypeEK6454(C0938xt c0938xt, byte b) {
            c0938xt.getClass();
            c0938xt.m5154c(1, b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: createAnnotationElementMatcher-SpDDLgk, reason: not valid java name */
        public final int m5672createAnnotationElementMatcherSpDDLgk(C0938xt c0938xt, int i, byte b, int i2) {
            c0938xt.getClass();
            c0938xt.m5169r(3);
            addValue(c0938xt, i2);
            addName(c0938xt, i);
            m5671addValueTypeEK6454(c0938xt, b);
            return endAnnotationElementMatcher(c0938xt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int endAnnotationElementMatcher(C0938xt c0938xt) {
            c0938xt.getClass();
            return c0938xt.m5163l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationElementMatcher getRootAsAnnotationElementMatcher(ByteBuffer byteBuffer, AnnotationElementMatcher annotationElementMatcher) {
            byteBuffer.getClass();
            annotationElementMatcher.getClass();
            return annotationElementMatcher.__assign(byteBuffer.position() + AbstractC0748t1.m4148f(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startAnnotationElementMatcher(C0938xt c0938xt) {
            c0938xt.getClass();
            c0938xt.m5169r(3);
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
