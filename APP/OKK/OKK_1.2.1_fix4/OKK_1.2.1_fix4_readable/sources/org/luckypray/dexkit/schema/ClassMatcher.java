package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMatcher */
/* JADX INFO: loaded from: classes.dex */
public final class ClassMatcher extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addAccessFlags(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(2, i2);
        }

        public final void addAnnotations(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(5, i2);
        }

        public final void addClassName(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(1, i2);
        }

        public final void addFields(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(6, i2);
        }

        public final void addInterfaces(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(4, i2);
        }

        public final void addMethods(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(7, i2);
        }

        public final void addSmaliSource(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(0, i2);
        }

        public final void addSuperClass(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(3, i2);
        }

        public final void addUsingStrings(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(8, i2);
        }

        public final int createClassMatcher(C0733b c0733b, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(9);
            addUsingStrings(c0733b, i10);
            addMethods(c0733b, i9);
            addFields(c0733b, i8);
            addAnnotations(c0733b, i7);
            addInterfaces(c0733b, i6);
            addSuperClass(c0733b, i5);
            addAccessFlags(c0733b, i4);
            addClassName(c0733b, i3);
            addSmaliSource(c0733b, i2);
            return endClassMatcher(c0733b);
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

        public final int endClassMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final ClassMatcher getRootAsClassMatcher(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsClassMatcher(byteBuffer, new ClassMatcher());
        }

        public final void startClassMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(9);
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

        public final ClassMatcher getRootAsClassMatcher(ByteBuffer byteBuffer, ClassMatcher classMatcher) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(classMatcher, "obj");
            return classMatcher.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final ClassMatcher __assign(int i2, ByteBuffer byteBuffer) {
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
        int i__offset = __offset(8);
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

    public final StringMatcher className(StringMatcher stringMatcher) {
        AbstractC0307g.m703e(stringMatcher, "obj");
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return stringMatcher.__assign(i__indirect, byteBuffer);
    }

    public final FieldsMatcher fields(FieldsMatcher fieldsMatcher) {
        AbstractC0307g.m703e(fieldsMatcher, "obj");
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return fieldsMatcher.__assign(i__indirect, byteBuffer);
    }

    public final AccessFlagsMatcher getAccessFlags() {
        return accessFlags(new AccessFlagsMatcher());
    }

    public final AnnotationsMatcher getAnnotations() {
        return annotations(new AnnotationsMatcher());
    }

    public final StringMatcher getClassName() {
        return className(new StringMatcher());
    }

    public final FieldsMatcher getFields() {
        return fields(new FieldsMatcher());
    }

    public final InterfacesMatcher getInterfaces() {
        return interfaces(new InterfacesMatcher());
    }

    public final MethodsMatcher getMethods() {
        return methods(new MethodsMatcher());
    }

    public final StringMatcher getSmaliSource() {
        return smaliSource(new StringMatcher());
    }

    public final ClassMatcher getSuperClass() {
        return superClass(new ClassMatcher());
    }

    public final int getUsingStringsLength() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final InterfacesMatcher interfaces(InterfacesMatcher interfacesMatcher) {
        AbstractC0307g.m703e(interfacesMatcher, "obj");
        int i__offset = __offset(12);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return interfacesMatcher.__assign(i__indirect, byteBuffer);
    }

    public final MethodsMatcher methods(MethodsMatcher methodsMatcher) {
        AbstractC0307g.m703e(methodsMatcher, "obj");
        int i__offset = __offset(18);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return methodsMatcher.__assign(i__indirect, byteBuffer);
    }

    public final StringMatcher smaliSource(StringMatcher stringMatcher) {
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

    public final ClassMatcher superClass(ClassMatcher classMatcher) {
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

    public final StringMatcher usingStrings(int i2) {
        return usingStrings(new StringMatcher(), i2);
    }

    public final StringMatcher usingStrings(StringMatcher stringMatcher, int i2) {
        AbstractC0307g.m703e(stringMatcher, "obj");
        int i__offset = __offset(20);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i2 * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return stringMatcher.__assign(i__indirect, byteBuffer);
    }
}
