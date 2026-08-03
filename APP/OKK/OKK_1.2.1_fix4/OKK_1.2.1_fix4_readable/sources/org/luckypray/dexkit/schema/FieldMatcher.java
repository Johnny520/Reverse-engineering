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
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addAccessFlags(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(1, i2);
        }

        public final void addAnnotations(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(4, i2);
        }

        public final void addDeclaringClass(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(2, i2);
        }

        public final void addFieldName(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(0, i2);
        }

        public final void addGetMethods(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(5, i2);
        }

        public final void addPutMethods(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(6, i2);
        }

        public final void addTypeClass(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(3, i2);
        }

        public final int createFieldMatcher(C0733b c0733b, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(7);
            addPutMethods(c0733b, i8);
            addGetMethods(c0733b, i7);
            addAnnotations(c0733b, i6);
            addTypeClass(c0733b, i5);
            addDeclaringClass(c0733b, i4);
            addAccessFlags(c0733b, i3);
            addFieldName(c0733b, i2);
            return endFieldMatcher(c0733b);
        }

        public final int endFieldMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final FieldMatcher getRootAsFieldMatcher(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsFieldMatcher(byteBuffer, new FieldMatcher());
        }

        public final void startFieldMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(7);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final FieldMatcher getRootAsFieldMatcher(ByteBuffer byteBuffer, FieldMatcher fieldMatcher) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(fieldMatcher, "obj");
            return fieldMatcher.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final FieldMatcher __assign(int i2, ByteBuffer byteBuffer) {
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
        int i__offset = __offset(12);
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

    public final StringMatcher fieldName(StringMatcher stringMatcher) {
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

    public final MethodsMatcher getMethods(MethodsMatcher methodsMatcher) {
        AbstractC0307g.m703e(methodsMatcher, "obj");
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return methodsMatcher.__assign(i__indirect, byteBuffer);
    }

    public final MethodsMatcher getPutMethods() {
        return putMethods(new MethodsMatcher());
    }

    public final ClassMatcher getTypeClass() {
        return typeClass(new ClassMatcher());
    }

    public final MethodsMatcher putMethods(MethodsMatcher methodsMatcher) {
        AbstractC0307g.m703e(methodsMatcher, "obj");
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return methodsMatcher.__assign(i__indirect, byteBuffer);
    }

    public final ClassMatcher typeClass(ClassMatcher classMatcher) {
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
}
