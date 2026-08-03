package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMatcher */
/* JADX INFO: loaded from: classes.dex */
public final class MethodMatcher extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addAccessFlags(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(1, r3);
        }

        public final void addAnnotations(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(5, r3);
        }

        public final void addDeclaringClass(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(2, r3);
        }

        public final void addInvokingMethods(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(11, r3);
        }

        public final void addMethodCallers(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(12, r3);
        }

        public final void addMethodName(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(0, r3);
        }

        public final void addOpCodes(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(6, r3);
        }

        public final void addParameters(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(4, r3);
        }

        public final void addProtoShorty(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(13, r3);
        }

        public final void addReturnType(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(3, r3);
        }

        public final void addUsingFields(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(8, r3);
        }

        public final void addUsingNumbers(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(10, r3);
        }

        public final void addUsingNumbersType(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(9, r3);
        }

        public final void addUsingStrings(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(7, r3);
        }

        public final int createMethodMatcher(C0733b r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18) {
            AbstractC0307g.m703e(r4, "builder");
            r4.m1936s(14);
            addProtoShorty(r4, r18);
            addMethodCallers(r4, r17);
            addInvokingMethods(r4, r16);
            addUsingNumbers(r4, r15);
            addUsingNumbersType(r4, r14);
            addUsingFields(r4, r13);
            addUsingStrings(r4, r12);
            addOpCodes(r4, r11);
            addAnnotations(r4, r10);
            addParameters(r4, r9);
            addReturnType(r4, r8);
            addDeclaringClass(r4, r7);
            addAccessFlags(r4, r6);
            addMethodName(r4, r5);
            return endMethodMatcher(r4);
        }

        public final int createUsingFieldsVector(C0733b r3, int[] r4) {
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

        /* JADX INFO: renamed from: createUsingNumbersTypeVector-VU-fvBY */
        public final int m2726createUsingNumbersTypeVectorVUfvBY(C0733b r3, byte[] r4) {
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

        public final int createUsingNumbersVector(C0733b r3, int[] r4) {
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

        public final int createUsingStringsVector(C0733b r3, int[] r4) {
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

        public final int endMethodMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final MethodMatcher getRootAsMethodMatcher(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsMethodMatcher(r2, new MethodMatcher());
        }

        public final void startMethodMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(14);
        }

        public final void startUsingFieldsVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(4, r3, 4);
        }

        public final void startUsingNumbersTypeVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(1, r3, 1);
        }

        public final void startUsingNumbersVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(4, r3, 4);
        }

        public final void startUsingStringsVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(4, r3, 4);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final MethodMatcher getRootAsMethodMatcher(ByteBuffer r3, MethodMatcher r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public MethodMatcher() {
    }

    public final MethodMatcher __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final AccessFlagsMatcher accessFlags(AccessFlagsMatcher r4) {
        AbstractC0307g.m703e(r4, "obj");
        int r02 = __offset(6);
        if (r02 == 0) goto L5;
        int r03 = __indirect(r02 + this.bb_pos);
        ByteBuffer r1 = this.f2573bb;
        AbstractC0307g.m702d(r1, "bb");
        return r4.__assign(r03, r1);
    L5:
        return null;
    }

    public final AnnotationsMatcher annotations(AnnotationsMatcher r4) {
        AbstractC0307g.m703e(r4, "obj");
        int r02 = __offset(14);
        if (r02 == 0) goto L5;
        int r03 = __indirect(r02 + this.bb_pos);
        ByteBuffer r1 = this.f2573bb;
        AbstractC0307g.m702d(r1, "bb");
        return r4.__assign(r03, r1);
    L5:
        return null;
    }

    public final ClassMatcher declaringClass(ClassMatcher r4) {
        AbstractC0307g.m703e(r4, "obj");
        int r02 = __offset(8);
        if (r02 == 0) goto L5;
        int r03 = __indirect(r02 + this.bb_pos);
        ByteBuffer r1 = this.f2573bb;
        AbstractC0307g.m702d(r1, "bb");
        return r4.__assign(r03, r1);
    L5:
        return null;
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
        int r02 = __offset(30);
        if (r02 != 0) goto L7;
        return null;
    L7:
        return __string(r02 + this.bb_pos);
    }

    public final ByteBuffer getProtoShortyAsByteBuffer() {
        ByteBuffer r02 = __vector_as_bytebuffer(30, 1);
        AbstractC0307g.m702d(r02, "__vector_as_bytebuffer(30, 1)");
        return r02;
    }

    public final ClassMatcher getReturnType() {
        return returnType(new ClassMatcher());
    }

    public final int getUsingFieldsLength() {
        int r02 = __offset(20);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final int getUsingNumbersLength() {
        int r02 = __offset(24);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final ByteBuffer getUsingNumbersTypeAsByteBuffer() {
        ByteBuffer r02 = __vector_as_bytebuffer(22, 1);
        AbstractC0307g.m702d(r02, "__vector_as_bytebuffer(22, 1)");
        return r02;
    }

    public final int getUsingNumbersTypeLength() {
        int r02 = __offset(22);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final int getUsingStringsLength() {
        int r02 = __offset(18);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final MethodsMatcher invokingMethods(MethodsMatcher r4) {
        AbstractC0307g.m703e(r4, "obj");
        int r02 = __offset(26);
        if (r02 == 0) goto L5;
        int r03 = __indirect(r02 + this.bb_pos);
        ByteBuffer r1 = this.f2573bb;
        AbstractC0307g.m702d(r1, "bb");
        return r4.__assign(r03, r1);
    L5:
        return null;
    }

    public final MethodsMatcher methodCallers(MethodsMatcher r4) {
        AbstractC0307g.m703e(r4, "obj");
        int r02 = __offset(28);
        if (r02 == 0) goto L5;
        int r03 = __indirect(r02 + this.bb_pos);
        ByteBuffer r1 = this.f2573bb;
        AbstractC0307g.m702d(r1, "bb");
        return r4.__assign(r03, r1);
    L5:
        return null;
    }

    public final StringMatcher methodName(StringMatcher r4) {
        AbstractC0307g.m703e(r4, "obj");
        int r02 = __offset(4);
        if (r02 == 0) goto L5;
        int r03 = __indirect(r02 + this.bb_pos);
        ByteBuffer r1 = this.f2573bb;
        AbstractC0307g.m702d(r1, "bb");
        return r4.__assign(r03, r1);
    L5:
        return null;
    }

    /* JADX INFO: renamed from: mutateUsingNumbersType-EK-6454 */
    public final boolean m2724mutateUsingNumbersTypeEK6454(int r3, byte r4) {
        int r02 = __offset(22);
        if (r02 == 0) goto L5;
        this.f2573bb.put(__vector(r02) + r3, r4);
        return true;
    L5:
        return false;
    }

    public final OpCodesMatcher opCodes(OpCodesMatcher r4) {
        AbstractC0307g.m703e(r4, "obj");
        int r02 = __offset(16);
        if (r02 == 0) goto L5;
        int r03 = __indirect(r02 + this.bb_pos);
        ByteBuffer r1 = this.f2573bb;
        AbstractC0307g.m702d(r1, "bb");
        return r4.__assign(r03, r1);
    L5:
        return null;
    }

    public final ParametersMatcher parameters(ParametersMatcher r4) {
        AbstractC0307g.m703e(r4, "obj");
        int r02 = __offset(12);
        if (r02 == 0) goto L5;
        int r03 = __indirect(r02 + this.bb_pos);
        ByteBuffer r1 = this.f2573bb;
        AbstractC0307g.m702d(r1, "bb");
        return r4.__assign(r03, r1);
    L5:
        return null;
    }

    public final ByteBuffer protoShortyInByteBuffer(ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        ByteBuffer r32 = __vector_in_bytebuffer(r3, 30, 1);
        AbstractC0307g.m702d(r32, "__vector_in_bytebuffer(_bb, 30, 1)");
        return r32;
    }

    public final ClassMatcher returnType(ClassMatcher r4) {
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

    public final UsingFieldMatcher usingFields(int r2) {
        return usingFields(new UsingFieldMatcher(), r2);
    }

    public final AbstractC0735d usingNumbers(AbstractC0735d r2, int r3) {
        AbstractC0307g.m703e(r2, "obj");
        int r02 = __offset(24);
        if (r02 == 0) goto L5;
        int r32 = r3 * 4;
        return __union(r2, r32 + __vector(r02));
    L5:
        return null;
    }

    /* JADX INFO: renamed from: usingNumbersType-Wa3L5BU */
    public final byte m2725usingNumbersTypeWa3L5BU(int r3) {
        int r02 = __offset(22);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.get(__vector(r02) + r3);
    }

    public final ByteBuffer usingNumbersTypeInByteBuffer(ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        ByteBuffer r32 = __vector_in_bytebuffer(r3, 22, 1);
        AbstractC0307g.m702d(r32, "__vector_in_bytebuffer(_bb, 22, 1)");
        return r32;
    }

    public final StringMatcher usingStrings(int r2) {
        return usingStrings(new StringMatcher(), r2);
    }

    public final UsingFieldMatcher usingFields(UsingFieldMatcher r3, int r4) {
        AbstractC0307g.m703e(r3, "obj");
        int r02 = __offset(20);
        if (r02 == 0) goto L5;
        int r42 = r4 * 4;
        int r43 = __indirect(r42 + __vector(r02));
        ByteBuffer r03 = this.f2573bb;
        AbstractC0307g.m702d(r03, "bb");
        return r3.__assign(r43, r03);
    L5:
        return null;
    }

    public final StringMatcher usingStrings(StringMatcher r3, int r4) {
        AbstractC0307g.m703e(r3, "obj");
        int r02 = __offset(18);
        if (r02 == 0) goto L5;
        int r42 = r4 * 4;
        int r43 = __indirect(r42 + __vector(r02));
        ByteBuffer r03 = this.f2573bb;
        AbstractC0307g.m702d(r03, "bb");
        return r3.__assign(r43, r03);
    L5:
        return null;
    }
}
