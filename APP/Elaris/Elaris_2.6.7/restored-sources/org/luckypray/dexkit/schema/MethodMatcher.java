package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0000a;
import p000.AbstractC0367od;
import p000.AbstractC0431r2;
import p000.C0038c5;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMatcher, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class MethodMatcher extends AbstractC0367od {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher __assign(int i, ByteBuffer byteBuffer) {
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
    public final MethodMatcher allOf(MethodMatcher methodMatcher, int i) {
        methodMatcher.getClass();
        int i__offset = __offset(32);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return methodMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationsMatcher annotations(AnnotationsMatcher annotationsMatcher) {
        annotationsMatcher.getClass();
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return annotationsMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher anyOf(MethodMatcher methodMatcher, int i) {
        methodMatcher.getClass();
        int i__offset = __offset(34);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return methodMatcher.__assign(i__indirect, byteBuffer);
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
    public final AccessFlagsMatcher getAccessFlags() {
        return accessFlags(new AccessFlagsMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getAllOfLength() {
        int i__offset = __offset(32);
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
        int i__offset = __offset(34);
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
    public final MethodsMatcher getInvokingMethods() {
        return invokingMethods(new MethodsMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodsMatcher getMethodCallers() {
        return methodCallers(new MethodsMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher getMethodName() {
        return methodName(new StringMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getNoneOfLength() {
        int i__offset = __offset(36);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpCodesMatcher getOpCodes() {
        return opCodes(new OpCodesMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ParametersMatcher getParameters() {
        return parameters(new ParametersMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getProtoShorty() {
        int i__offset = __offset(30);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer getProtoShortyAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(30, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher getReturnType() {
        return returnType(new ClassMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getUsingFieldsLength() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getUsingNumbersLength() {
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer getUsingNumbersTypeAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(22, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getUsingNumbersTypeLength() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getUsingStringsLength() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodsMatcher invokingMethods(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        int i__offset = __offset(26);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return methodsMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodsMatcher methodCallers(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        int i__offset = __offset(28);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return methodsMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher methodName(StringMatcher stringMatcher) {
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
    /* JADX INFO: renamed from: mutateUsingNumbersType-EK-6454, reason: not valid java name */
    public final boolean m1285mutateUsingNumbersTypeEK6454(int i, byte b) {
        int i__offset = __offset(22);
        if (i__offset == 0) {
            return false;
        }
        this.f662bb.put(__vector(i__offset) + i, b);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher noneOf(MethodMatcher methodMatcher, int i) {
        methodMatcher.getClass();
        int i__offset = __offset(36);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return methodMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpCodesMatcher opCodes(OpCodesMatcher opCodesMatcher) {
        opCodesMatcher.getClass();
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return opCodesMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ParametersMatcher parameters(ParametersMatcher parametersMatcher) {
        parametersMatcher.getClass();
        int i__offset = __offset(12);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return parametersMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer protoShortyInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 30, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher returnType(ClassMatcher classMatcher) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UsingFieldMatcher usingFields(UsingFieldMatcher usingFieldMatcher, int i) {
        usingFieldMatcher.getClass();
        int i__offset = __offset(20);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return usingFieldMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0367od usingNumbers(AbstractC0367od abstractC0367od, int i) {
        abstractC0367od.getClass();
        int i__offset = __offset(24);
        if (i__offset == 0) {
            return null;
        }
        return __union(abstractC0367od, (i * 4) + __vector(i__offset));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: usingNumbersType-Wa3L5BU, reason: not valid java name */
    public final byte m1286usingNumbersTypeWa3L5BU(int i) {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return this.f662bb.get(__vector(i__offset) + i);
        }
        return (byte) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer usingNumbersTypeInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 22, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher usingStrings(StringMatcher stringMatcher, int i) {
        stringMatcher.getClass();
        int i__offset = __offset(18);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return stringMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMatcher$Companion */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-MethodMatcher.Companion.<init>():void type: THIS */
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
            c0038c5.m102h(14, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addAnnotations(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(5, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addAnyOf(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(15, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addDeclaringClass(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(2, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addInvokingMethods(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(11, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addMethodCallers(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(12, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addMethodName(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(0, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addNoneOf(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(16, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addOpCodes(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(6, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addParameters(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(4, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addProtoShorty(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(13, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addReturnType(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(3, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addUsingFields(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(8, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addUsingNumbers(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(10, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addUsingNumbersType(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(9, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addUsingStrings(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(7, i);
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
        public final int createMethodMatcher(C0038c5 c0038c5, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            c0038c5.getClass();
            c0038c5.m112r(17);
            addNoneOf(c0038c5, i17);
            addAnyOf(c0038c5, i16);
            addAllOf(c0038c5, i15);
            addProtoShorty(c0038c5, i14);
            addMethodCallers(c0038c5, i13);
            addInvokingMethods(c0038c5, i12);
            addUsingNumbers(c0038c5, i11);
            addUsingNumbersType(c0038c5, i10);
            addUsingFields(c0038c5, i9);
            addUsingStrings(c0038c5, i8);
            addOpCodes(c0038c5, i7);
            addAnnotations(c0038c5, i6);
            addParameters(c0038c5, i5);
            addReturnType(c0038c5, i4);
            addDeclaringClass(c0038c5, i3);
            addAccessFlags(c0038c5, i2);
            addMethodName(c0038c5, i);
            return endMethodMatcher(c0038c5);
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
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000e */
        public final int createUsingFieldsVector(C0038c5 c0038c5, int[] iArr) {
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
        /* JADX INFO: renamed from: createUsingNumbersTypeVector-VU-fvBY, reason: not valid java name */
        public final int m1287createUsingNumbersTypeVectorVUfvBY(C0038c5 c0038c5, byte[] bArr) {
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
        public final int createUsingNumbersVector(C0038c5 c0038c5, int[] iArr) {
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
        public final int endMethodMatcher(C0038c5 c0038c5) {
            c0038c5.getClass();
            return c0038c5.m106l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final MethodMatcher getRootAsMethodMatcher(ByteBuffer byteBuffer, MethodMatcher methodMatcher) {
            byteBuffer.getClass();
            methodMatcher.getClass();
            return methodMatcher.__assign(byteBuffer.position() + AbstractC0000a.m0a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
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
        public final void startMethodMatcher(C0038c5 c0038c5) {
            c0038c5.getClass();
            c0038c5.m112r(17);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startNoneOfVector(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m113s(4, i, 4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startUsingFieldsVector(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m113s(4, i, 4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startUsingNumbersTypeVector(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m113s(1, i, 1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startUsingNumbersVector(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m113s(4, i, 4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startUsingStringsVector(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m113s(4, i, 4);
        }

        private Companion() {
        }

        public final MethodMatcher getRootAsMethodMatcher(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsMethodMatcher(byteBuffer, new MethodMatcher());
        }

        public final void validateVersion() {
        }
    }

    public final MethodMatcher allOf(int i) {
        return allOf(new MethodMatcher(), i);
    }

    public final MethodMatcher anyOf(int i) {
        return anyOf(new MethodMatcher(), i);
    }

    public final MethodMatcher noneOf(int i) {
        return noneOf(new MethodMatcher(), i);
    }

    public final UsingFieldMatcher usingFields(int i) {
        return usingFields(new UsingFieldMatcher(), i);
    }

    public final StringMatcher usingStrings(int i) {
        return usingStrings(new StringMatcher(), i);
    }
}
