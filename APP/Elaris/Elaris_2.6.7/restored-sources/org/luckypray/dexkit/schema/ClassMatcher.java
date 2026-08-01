package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0000a;
import p000.AbstractC0367od;
import p000.AbstractC0431r2;
import p000.C0038c5;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMatcher, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ClassMatcher extends AbstractC0367od {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher __assign(int i, ByteBuffer byteBuffer) {
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
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return accessFlagsMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher allOf(ClassMatcher classMatcher, int i) {
        classMatcher.getClass();
        int i__offset = __offset(22);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return classMatcher.__assign(i__indirect, byteBuffer);
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
    public final ClassMatcher anyOf(ClassMatcher classMatcher, int i) {
        classMatcher.getClass();
        int i__offset = __offset(24);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return classMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher className(StringMatcher stringMatcher) {
        stringMatcher.getClass();
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return stringMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldsMatcher fields(FieldsMatcher fieldsMatcher) {
        fieldsMatcher.getClass();
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return fieldsMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AccessFlagsMatcher getAccessFlags() {
        return accessFlags(new AccessFlagsMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getAllOfLength() {
        int i__offset = __offset(22);
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
        int i__offset = __offset(24);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher getClassName() {
        return className(new StringMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldsMatcher getFields() {
        return fields(new FieldsMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfacesMatcher getInterfaces() {
        return interfaces(new InterfacesMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodsMatcher getMethods() {
        return methods(new MethodsMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getNoneOfLength() {
        int i__offset = __offset(26);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher getSmaliSource() {
        return smaliSource(new StringMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher getSuperClass() {
        return superClass(new ClassMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getUsingStringsLength() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfacesMatcher interfaces(InterfacesMatcher interfacesMatcher) {
        interfacesMatcher.getClass();
        int i__offset = __offset(12);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return interfacesMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodsMatcher methods(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        int i__offset = __offset(18);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return methodsMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMatcher noneOf(ClassMatcher classMatcher, int i) {
        classMatcher.getClass();
        int i__offset = __offset(26);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return classMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StringMatcher smaliSource(StringMatcher stringMatcher) {
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
    public final ClassMatcher superClass(ClassMatcher classMatcher) {
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
    public final StringMatcher usingStrings(StringMatcher stringMatcher, int i) {
        stringMatcher.getClass();
        int i__offset = __offset(20);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f662bb;
        byteBuffer.getClass();
        return stringMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMatcher$Companion */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-ClassMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addAccessFlags(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(2, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addAllOf(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(9, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addAnnotations(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(5, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addAnyOf(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(10, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addClassName(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(1, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addFields(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(6, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addInterfaces(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(4, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addMethods(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(7, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addNoneOf(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(11, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addSmaliSource(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(0, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addSuperClass(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(3, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addUsingStrings(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(8, i);
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
        public final int createClassMatcher(C0038c5 c0038c5, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            c0038c5.getClass();
            c0038c5.m112r(12);
            addNoneOf(c0038c5, i12);
            addAnyOf(c0038c5, i11);
            addAllOf(c0038c5, i10);
            addUsingStrings(c0038c5, i9);
            addMethods(c0038c5, i8);
            addFields(c0038c5, i7);
            addAnnotations(c0038c5, i6);
            addInterfaces(c0038c5, i5);
            addSuperClass(c0038c5, i4);
            addAccessFlags(c0038c5, i3);
            addClassName(c0038c5, i2);
            addSmaliSource(c0038c5, i);
            return endClassMatcher(c0038c5);
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
        public final int endClassMatcher(C0038c5 c0038c5) {
            c0038c5.getClass();
            return c0038c5.m106l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ClassMatcher getRootAsClassMatcher(ByteBuffer byteBuffer, ClassMatcher classMatcher) {
            byteBuffer.getClass();
            classMatcher.getClass();
            return classMatcher.__assign(byteBuffer.position() + AbstractC0000a.m0a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
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
        public final void startClassMatcher(C0038c5 c0038c5) {
            c0038c5.getClass();
            c0038c5.m112r(12);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startNoneOfVector(C0038c5 c0038c5, int i) {
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

        public final ClassMatcher getRootAsClassMatcher(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsClassMatcher(byteBuffer, new ClassMatcher());
        }

        public final void validateVersion() {
        }
    }

    public final ClassMatcher allOf(int i) {
        return allOf(new ClassMatcher(), i);
    }

    public final ClassMatcher anyOf(int i) {
        return anyOf(new ClassMatcher(), i);
    }

    public final ClassMatcher noneOf(int i) {
        return noneOf(new ClassMatcher(), i);
    }

    public final StringMatcher usingStrings(int i) {
        return usingStrings(new StringMatcher(), i);
    }
}
