package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationMatcher */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationMatcher extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addElements(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(3, i2);
        }

        public final void addPolicy(C0733b c0733b, byte b2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1920c(2, b2);
        }

        public final void addTargetElementTypes(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(1, i2);
        }

        public final void addType(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(0, i2);
        }

        public final void addUsingStrings(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(4, i2);
        }

        public final int createAnnotationMatcher(C0733b c0733b, int i2, int i3, byte b2, int i4, int i5) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(5);
            addUsingStrings(c0733b, i5);
            addElements(c0733b, i4);
            addTargetElementTypes(c0733b, i3);
            addType(c0733b, i2);
            addPolicy(c0733b, b2);
            return endAnnotationMatcher(c0733b);
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

        public final int endAnnotationMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final AnnotationMatcher getRootAsAnnotationMatcher(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsAnnotationMatcher(byteBuffer, new AnnotationMatcher());
        }

        public final void startAnnotationMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(5);
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

        public final AnnotationMatcher getRootAsAnnotationMatcher(ByteBuffer byteBuffer, AnnotationMatcher annotationMatcher) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(annotationMatcher, "obj");
            return annotationMatcher.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final AnnotationMatcher __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final AnnotationElementsMatcher elements(AnnotationElementsMatcher annotationElementsMatcher) {
        AbstractC0307g.m703e(annotationElementsMatcher, "obj");
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return annotationElementsMatcher.__assign(i__indirect, byteBuffer);
    }

    public final AnnotationElementsMatcher getElements() {
        return elements(new AnnotationElementsMatcher());
    }

    public final byte getPolicy() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f2573bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public final TargetElementTypesMatcher getTargetElementTypes() {
        return targetElementTypes(new TargetElementTypesMatcher());
    }

    public final ClassMatcher getType() {
        return type(new ClassMatcher());
    }

    public final int getUsingStringsLength() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final boolean mutatePolicy(byte b2) {
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.put(i__offset + this.bb_pos, b2);
        return true;
    }

    public final TargetElementTypesMatcher targetElementTypes(TargetElementTypesMatcher targetElementTypesMatcher) {
        AbstractC0307g.m703e(targetElementTypesMatcher, "obj");
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return targetElementTypesMatcher.__assign(i__indirect, byteBuffer);
    }

    public final ClassMatcher type(ClassMatcher classMatcher) {
        AbstractC0307g.m703e(classMatcher, "obj");
        int i__offset = __offset(4);
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
        int i__offset = __offset(12);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i2 * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return stringMatcher.__assign(i__indirect, byteBuffer);
    }
}
