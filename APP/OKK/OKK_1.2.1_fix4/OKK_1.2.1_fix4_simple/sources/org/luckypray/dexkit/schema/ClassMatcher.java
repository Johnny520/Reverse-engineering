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
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addAccessFlags(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(2, r3);
        }

        public final void addAnnotations(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(5, r3);
        }

        public final void addClassName(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(1, r3);
        }

        public final void addFields(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(6, r3);
        }

        public final void addInterfaces(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(4, r3);
        }

        public final void addMethods(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(7, r3);
        }

        public final void addSmaliSource(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(0, r3);
        }

        public final void addSuperClass(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(3, r3);
        }

        public final void addUsingStrings(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(8, r3);
        }

        public final int createClassMatcher(C0733b r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(9);
            addUsingStrings(r2, r11);
            addMethods(r2, r10);
            addFields(r2, r9);
            addAnnotations(r2, r8);
            addInterfaces(r2, r7);
            addSuperClass(r2, r6);
            addAccessFlags(r2, r5);
            addClassName(r2, r4);
            addSmaliSource(r2, r3);
            return endClassMatcher(r2);
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

        public final int endClassMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final ClassMatcher getRootAsClassMatcher(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsClassMatcher(r2, new ClassMatcher());
        }

        public final void startClassMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(9);
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

        public final ClassMatcher getRootAsClassMatcher(ByteBuffer r3, ClassMatcher r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public ClassMatcher() {
    }

    public final ClassMatcher __assign(int r2, ByteBuffer r3) {
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
        int r02 = __offset(8);
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

    public final StringMatcher className(StringMatcher r4) {
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

    public final FieldsMatcher fields(FieldsMatcher r4) {
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
        int r02 = __offset(20);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final InterfacesMatcher interfaces(InterfacesMatcher r4) {
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

    public final MethodsMatcher methods(MethodsMatcher r4) {
        AbstractC0307g.m703e(r4, "obj");
        int r02 = __offset(18);
        if (r02 == 0) goto L5;
        int r03 = __indirect(r02 + this.bb_pos);
        ByteBuffer r1 = this.f2573bb;
        AbstractC0307g.m702d(r1, "bb");
        return r4.__assign(r03, r1);
    L5:
        return null;
    }

    public final StringMatcher smaliSource(StringMatcher r4) {
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

    public final ClassMatcher superClass(ClassMatcher r4) {
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

    public final StringMatcher usingStrings(int r2) {
        return usingStrings(new StringMatcher(), r2);
    }

    public final StringMatcher usingStrings(StringMatcher r3, int r4) {
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
}
