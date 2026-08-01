package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0000a;
import p000.AbstractC0367od;
import p000.AbstractC0431r2;
import p000.C0038c5;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMatcher, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldMatcher extends AbstractC0367od {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher __assign(int i, ByteBuffer byteBuffer) {
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
    public final AccessFlagsMatcher accessFlags(AccessFlagsMatcher accessFlagsMatcher) {
        accessFlagsMatcher.getClass();
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return accessFlagsMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher allOf(FieldMatcher fieldMatcher, int i) {
        fieldMatcher.getClass();
        int i__offset = __offset(18);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return fieldMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationsMatcher annotations(AnnotationsMatcher annotationsMatcher) {
        annotationsMatcher.getClass();
        int i__offset = __offset(12);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return annotationsMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher anyOf(FieldMatcher fieldMatcher, int i) {
        fieldMatcher.getClass();
        int i__offset = __offset(20);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return fieldMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher declaringClass(ClassMatcher classMatcher) {
        classMatcher.getClass();
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return classMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher fieldName(StringMatcher stringMatcher) {
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
    public final AccessFlagsMatcher getAccessFlags() {
        return accessFlags(new AccessFlagsMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getAllOfLength() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationsMatcher getAnnotations() {
        return annotations(new AnnotationsMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getAnyOfLength() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher getDeclaringClass() {
        return declaringClass(new ClassMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher getFieldName() {
        return fieldName(new StringMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodsMatcher getGetMethods() {
        return getMethods(new MethodsMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodsMatcher getMethods(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return methodsMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getNoneOfLength() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodsMatcher getPutMethods() {
        return putMethods(new MethodsMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher getTypeClass() {
        return typeClass(new ClassMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMatcher noneOf(FieldMatcher fieldMatcher, int i) {
        fieldMatcher.getClass();
        int i__offset = __offset(22);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return fieldMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodsMatcher putMethods(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return methodsMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher typeClass(ClassMatcher classMatcher) {
        classMatcher.getClass();
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return classMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMatcher$Companion */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-FieldMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addAccessFlags(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(1, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addAllOf(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(7, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addAnnotations(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(4, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addAnyOf(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(8, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addDeclaringClass(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(2, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addFieldName(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(0, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addGetMethods(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(5, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addNoneOf(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(9, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addPutMethods(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(6, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addTypeClass(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(3, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000e */
        public final int createAllOfVector(C0038c5 c0038c5, int[] iArr) {
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
        public final int createAnyOfVector(C0038c5 c0038c5, int[] iArr) {
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
        public final int createFieldMatcher(C0038c5 c0038c5, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            c0038c5.getClass();
            c0038c5.m112r(10);
            addNoneOf(c0038c5, i10);
            addAnyOf(c0038c5, i9);
            addAllOf(c0038c5, i8);
            addPutMethods(c0038c5, i7);
            addGetMethods(c0038c5, i6);
            addAnnotations(c0038c5, i5);
            addTypeClass(c0038c5, i4);
            addDeclaringClass(c0038c5, i3);
            addAccessFlags(c0038c5, i2);
            addFieldName(c0038c5, i);
            return endFieldMatcher(c0038c5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000e */
        public final int createNoneOfVector(C0038c5 c0038c5, int[] iArr) {
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
        public final int endFieldMatcher(C0038c5 c0038c5) {
            c0038c5.getClass();
            return c0038c5.m106l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final FieldMatcher getRootAsFieldMatcher(ByteBuffer byteBuffer, FieldMatcher fieldMatcher) {
            byteBuffer.getClass();
            fieldMatcher.getClass();
            return fieldMatcher.__assign(byteBuffer.position() + AbstractC0000a.m0a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startAllOfVector(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m113s(4, i, 4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startAnyOfVector(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m113s(4, i, 4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startFieldMatcher(C0038c5 c0038c5) {
            c0038c5.getClass();
            c0038c5.m112r(10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startNoneOfVector(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m113s(4, i, 4);
        }

        private Companion() {
        }

        public final FieldMatcher getRootAsFieldMatcher(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsFieldMatcher(byteBuffer, new FieldMatcher());
        }

        public final void validateVersion() {
        }
    }

    public final FieldMatcher allOf(int i) {
        return allOf(new FieldMatcher(), i);
    }

    public final FieldMatcher anyOf(int i) {
        return anyOf(new FieldMatcher(), i);
    }

    public final FieldMatcher noneOf(int i) {
        return noneOf(new FieldMatcher(), i);
    }
}
