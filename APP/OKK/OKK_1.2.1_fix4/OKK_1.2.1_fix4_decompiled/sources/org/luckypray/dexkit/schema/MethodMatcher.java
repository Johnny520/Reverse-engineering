package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class MethodMatcher extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addAccessFlags(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(1, i2);
        }

        public final void addAnnotations(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(5, i2);
        }

        public final void addDeclaringClass(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(2, i2);
        }

        public final void addInvokingMethods(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(11, i2);
        }

        public final void addMethodCallers(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(12, i2);
        }

        public final void addMethodName(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(0, i2);
        }

        public final void addOpCodes(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(6, i2);
        }

        public final void addParameters(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(4, i2);
        }

        public final void addProtoShorty(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(13, i2);
        }

        public final void addReturnType(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(3, i2);
        }

        public final void addUsingFields(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(8, i2);
        }

        public final void addUsingNumbers(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(10, i2);
        }

        public final void addUsingNumbersType(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(9, i2);
        }

        public final void addUsingStrings(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(7, i2);
        }

        public final int createMethodMatcher(C0733b c0733b, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(14);
            addProtoShorty(c0733b, i15);
            addMethodCallers(c0733b, i14);
            addInvokingMethods(c0733b, i13);
            addUsingNumbers(c0733b, i12);
            addUsingNumbersType(c0733b, i11);
            addUsingFields(c0733b, i10);
            addUsingStrings(c0733b, i9);
            addOpCodes(c0733b, i8);
            addAnnotations(c0733b, i7);
            addParameters(c0733b, i6);
            addReturnType(c0733b, i5);
            addDeclaringClass(c0733b, i4);
            addAccessFlags(c0733b, i3);
            addMethodName(c0733b, i2);
            return endMethodMatcher(c0733b);
        }

        public final int createUsingFieldsVector(C0733b c0733b, int[] iArr) {
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

        /* JADX INFO: renamed from: createUsingNumbersTypeVector-VU-fvBY, reason: not valid java name */
        public final int m2726createUsingNumbersTypeVectorVUfvBY(C0733b c0733b, byte[] bArr) {
            AbstractC0307g.m703e(c0733b, "builder");
            AbstractC0307g.m703e(bArr, "data");
            c0733b.m1937t(1, bArr.length, 1);
            for (int length = bArr.length - 1; -1 < length; length--) {
                c0733b.m1919b(bArr[length]);
            }
            return c0733b.m1930m();
        }

        public final int createUsingNumbersVector(C0733b c0733b, int[] iArr) {
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

        public final int createUsingStringsVector(C0733b c0733b, int[] iArr) {
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

        public final int endMethodMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final MethodMatcher getRootAsMethodMatcher(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsMethodMatcher(byteBuffer, new MethodMatcher());
        }

        public final void startMethodMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(14);
        }

        public final void startUsingFieldsVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(4, i2, 4);
        }

        public final void startUsingNumbersTypeVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(1, i2, 1);
        }

        public final void startUsingNumbersVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(4, i2, 4);
        }

        public final void startUsingStringsVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(4, i2, 4);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final MethodMatcher getRootAsMethodMatcher(ByteBuffer byteBuffer, MethodMatcher methodMatcher) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(methodMatcher, "obj");
            return methodMatcher.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final MethodMatcher __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final AccessFlagsMatcher accessFlags(AccessFlagsMatcher accessFlagsMatcher) {
        AbstractC0307g.m703e(accessFlagsMatcher, "obj");
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return accessFlagsMatcher.__assign(i__indirect, byteBuffer);
    }

    public final AnnotationsMatcher annotations(AnnotationsMatcher annotationsMatcher) {
        AbstractC0307g.m703e(annotationsMatcher, "obj");
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return annotationsMatcher.__assign(i__indirect, byteBuffer);
    }

    public final ClassMatcher declaringClass(ClassMatcher classMatcher) {
        AbstractC0307g.m703e(classMatcher, "obj");
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return classMatcher.__assign(i__indirect, byteBuffer);
    }

    public final AccessFlagsMatcher getAccessFlags() {
        return accessFlags(new AccessFlagsMatcher());
    }

    public final AnnotationsMatcher getAnnotations() {
        return annotations(new AnnotationsMatcher());
    }

    public final ClassMatcher getDeclaringClass() {
        return declaringClass(new ClassMatcher());
    }

    public final MethodsMatcher getInvokingMethods() {
        return invokingMethods(new MethodsMatcher());
    }

    public final MethodsMatcher getMethodCallers() {
        return methodCallers(new MethodsMatcher());
    }

    public final StringMatcher getMethodName() {
        return methodName(new StringMatcher());
    }

    public final OpCodesMatcher getOpCodes() {
        return opCodes(new OpCodesMatcher());
    }

    public final ParametersMatcher getParameters() {
        return parameters(new ParametersMatcher());
    }

    public final String getProtoShorty() {
        int i__offset = __offset(30);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public final ByteBuffer getProtoShortyAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(30, 1);
        AbstractC0307g.m702d(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(30, 1)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final ClassMatcher getReturnType() {
        return returnType(new ClassMatcher());
    }

    public final int getUsingFieldsLength() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getUsingNumbersLength() {
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final ByteBuffer getUsingNumbersTypeAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(22, 1);
        AbstractC0307g.m702d(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(22, 1)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getUsingNumbersTypeLength() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final int getUsingStringsLength() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final MethodsMatcher invokingMethods(MethodsMatcher methodsMatcher) {
        AbstractC0307g.m703e(methodsMatcher, "obj");
        int i__offset = __offset(26);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return methodsMatcher.__assign(i__indirect, byteBuffer);
    }

    public final MethodsMatcher methodCallers(MethodsMatcher methodsMatcher) {
        AbstractC0307g.m703e(methodsMatcher, "obj");
        int i__offset = __offset(28);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return methodsMatcher.__assign(i__indirect, byteBuffer);
    }

    public final StringMatcher methodName(StringMatcher stringMatcher) {
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

    /* JADX INFO: renamed from: mutateUsingNumbersType-EK-6454, reason: not valid java name */
    public final boolean m2724mutateUsingNumbersTypeEK6454(int i2, byte b2) {
        int i__offset = __offset(22);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.put(__vector(i__offset) + i2, b2);
        return true;
    }

    public final OpCodesMatcher opCodes(OpCodesMatcher opCodesMatcher) {
        AbstractC0307g.m703e(opCodesMatcher, "obj");
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return opCodesMatcher.__assign(i__indirect, byteBuffer);
    }

    public final ParametersMatcher parameters(ParametersMatcher parametersMatcher) {
        AbstractC0307g.m703e(parametersMatcher, "obj");
        int i__offset = __offset(12);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return parametersMatcher.__assign(i__indirect, byteBuffer);
    }

    public final ByteBuffer protoShortyInByteBuffer(ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 30, 1);
        AbstractC0307g.m702d(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 30, 1)");
        return byteBuffer__vector_in_bytebuffer;
    }

    public final ClassMatcher returnType(ClassMatcher classMatcher) {
        AbstractC0307g.m703e(classMatcher, "obj");
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return classMatcher.__assign(i__indirect, byteBuffer);
    }

    public final UsingFieldMatcher usingFields(int i2) {
        return usingFields(new UsingFieldMatcher(), i2);
    }

    public final AbstractC0735d usingNumbers(AbstractC0735d abstractC0735d, int i2) {
        AbstractC0307g.m703e(abstractC0735d, "obj");
        int i__offset = __offset(24);
        if (i__offset == 0) {
            return null;
        }
        return __union(abstractC0735d, (i2 * 4) + __vector(i__offset));
    }

    /* JADX INFO: renamed from: usingNumbersType-Wa3L5BU, reason: not valid java name */
    public final byte m2725usingNumbersTypeWa3L5BU(int i2) {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return this.f2573bb.get(__vector(i__offset) + i2);
        }
        return (byte) 0;
    }

    public final ByteBuffer usingNumbersTypeInByteBuffer(ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 22, 1);
        AbstractC0307g.m702d(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 22, 1)");
        return byteBuffer__vector_in_bytebuffer;
    }

    public final StringMatcher usingStrings(int i2) {
        return usingStrings(new StringMatcher(), i2);
    }

    public final UsingFieldMatcher usingFields(UsingFieldMatcher usingFieldMatcher, int i2) {
        AbstractC0307g.m703e(usingFieldMatcher, "obj");
        int i__offset = __offset(20);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i2 * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return usingFieldMatcher.__assign(i__indirect, byteBuffer);
    }

    public final StringMatcher usingStrings(StringMatcher stringMatcher, int i2) {
        AbstractC0307g.m703e(stringMatcher, "obj");
        int i__offset = __offset(18);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i2 * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return stringMatcher.__assign(i__indirect, byteBuffer);
    }
}
