package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0000a;
import p000.AbstractC0367od;
import p000.AbstractC0431r2;
import p000.C0038c5;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationMatcher, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationMatcher extends AbstractC0367od {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationMatcher __assign(int i, ByteBuffer byteBuffer) {
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
    public final AnnotationElementsMatcher elements(AnnotationElementsMatcher annotationElementsMatcher) {
        annotationElementsMatcher.getClass();
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return annotationElementsMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationElementsMatcher getElements() {
        return elements(new AnnotationElementsMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte getPolicy() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f662bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final TargetElementTypesMatcher getTargetElementTypes() {
        return targetElementTypes(new TargetElementTypesMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher getType() {
        return type(new ClassMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getUsingStringsLength() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutatePolicy(byte b) {
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return false;
        }
        this.f662bb.put(i__offset + this.bb_pos, b);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final TargetElementTypesMatcher targetElementTypes(TargetElementTypesMatcher targetElementTypesMatcher) {
        targetElementTypesMatcher.getClass();
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return targetElementTypesMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher type(ClassMatcher classMatcher) {
        classMatcher.getClass();
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return classMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher usingStrings(StringMatcher stringMatcher, int i) {
        stringMatcher.getClass();
        int i__offset = __offset(12);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return stringMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationMatcher$Companion */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-AnnotationMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addElements(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(3, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addPolicy(C0038c5 c0038c5, byte b) {
            c0038c5.getClass();
            c0038c5.m97c(2, b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addTargetElementTypes(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(1, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addType(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(0, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addUsingStrings(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(4, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int createAnnotationMatcher(C0038c5 c0038c5, int i, int i2, byte b, int i3, int i4) {
            c0038c5.getClass();
            c0038c5.m112r(5);
            addUsingStrings(c0038c5, i4);
            addElements(c0038c5, i3);
            addTargetElementTypes(c0038c5, i2);
            addType(c0038c5, i);
            addPolicy(c0038c5, b);
            return endAnnotationMatcher(c0038c5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000e */
        public final int createUsingStringsVector(C0038c5 c0038c5, int[] iArr) {
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
        public final int endAnnotationMatcher(C0038c5 c0038c5) {
            c0038c5.getClass();
            return c0038c5.m106l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationMatcher getRootAsAnnotationMatcher(ByteBuffer byteBuffer, AnnotationMatcher annotationMatcher) {
            byteBuffer.getClass();
            annotationMatcher.getClass();
            return annotationMatcher.__assign(byteBuffer.position() + AbstractC0000a.m0a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startAnnotationMatcher(C0038c5 c0038c5) {
            c0038c5.getClass();
            c0038c5.m112r(5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startUsingStringsVector(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m113s(4, i, 4);
        }

        private Companion() {
        }

        public final AnnotationMatcher getRootAsAnnotationMatcher(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsAnnotationMatcher(byteBuffer, new AnnotationMatcher());
        }

        public final void validateVersion() {
        }
    }

    public final StringMatcher usingStrings(int i) {
        return usingStrings(new StringMatcher(), i);
    }
}
