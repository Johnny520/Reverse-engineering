package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMatcher */
/* JADX INFO: loaded from: classes.dex */
public final class FieldMatcher extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addAccessFlags(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(1, r3);
        }

        public final void addAnnotations(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(4, r3);
        }

        public final void addDeclaringClass(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(2, r3);
        }

        public final void addFieldName(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(0, r3);
        }

        public final void addGetMethods(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(5, r3);
        }

        public final void addPutMethods(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(6, r3);
        }

        public final void addTypeClass(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(3, r3);
        }

        public final int createFieldMatcher(C0733b r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(7);
            addPutMethods(r2, r9);
            addGetMethods(r2, r8);
            addAnnotations(r2, r7);
            addTypeClass(r2, r6);
            addDeclaringClass(r2, r5);
            addAccessFlags(r2, r4);
            addFieldName(r2, r3);
            return endFieldMatcher(r2);
        }

        public final int endFieldMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final FieldMatcher getRootAsFieldMatcher(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsFieldMatcher(r2, new FieldMatcher());
        }

        public final void startFieldMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(7);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final FieldMatcher getRootAsFieldMatcher(ByteBuffer r3, FieldMatcher r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public FieldMatcher() {
    }

    public final FieldMatcher __assign(int r2, ByteBuffer r3) {
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
        int r02 = __offset(12);
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

    public final StringMatcher fieldName(StringMatcher r4) {
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

    public final AccessFlagsMatcher getAccessFlags() {
        return accessFlags(new AccessFlagsMatcher());
    }

    public final AnnotationsMatcher getAnnotations() {
        return annotations(new AnnotationsMatcher());
    }

    public final ClassMatcher getDeclaringClass() {
        return declaringClass(new ClassMatcher());
    }

    public final StringMatcher getFieldName() {
        return fieldName(new StringMatcher());
    }

    public final MethodsMatcher getGetMethods() {
        return getMethods(new MethodsMatcher());
    }

    public final MethodsMatcher getMethods(MethodsMatcher r4) {
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

    public final MethodsMatcher getPutMethods() {
        return putMethods(new MethodsMatcher());
    }

    public final ClassMatcher getTypeClass() {
        return typeClass(new ClassMatcher());
    }

    public final MethodsMatcher putMethods(MethodsMatcher r4) {
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

    public final ClassMatcher typeClass(ClassMatcher r4) {
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
}
