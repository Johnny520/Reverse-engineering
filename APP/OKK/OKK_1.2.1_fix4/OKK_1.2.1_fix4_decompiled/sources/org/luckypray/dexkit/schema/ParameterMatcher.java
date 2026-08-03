package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ParameterMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class ParameterMatcher extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ParameterMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addAnnotations(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(0, i2);
        }

        public final void addParameterType(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(1, i2);
        }

        public final int createParameterMatcher(C0733b c0733b, int i2, int i3) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(2);
            addParameterType(c0733b, i3);
            addAnnotations(c0733b, i2);
            return endParameterMatcher(c0733b);
        }

        public final int endParameterMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final ParameterMatcher getRootAsParameterMatcher(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsParameterMatcher(byteBuffer, new ParameterMatcher());
        }

        public final void startParameterMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(2);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final ParameterMatcher getRootAsParameterMatcher(ByteBuffer byteBuffer, ParameterMatcher parameterMatcher) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(parameterMatcher, "obj");
            return parameterMatcher.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final ParameterMatcher __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final AnnotationsMatcher annotations(AnnotationsMatcher annotationsMatcher) {
        AbstractC0307g.m703e(annotationsMatcher, "obj");
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return annotationsMatcher.__assign(i__indirect, byteBuffer);
    }

    public final AnnotationsMatcher getAnnotations() {
        return annotations(new AnnotationsMatcher());
    }

    public final ClassMatcher getParameterType() {
        return parameterType(new ClassMatcher());
    }

    public final ClassMatcher parameterType(ClassMatcher classMatcher) {
        AbstractC0307g.m703e(classMatcher, "obj");
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return classMatcher.__assign(i__indirect, byteBuffer);
    }
}
