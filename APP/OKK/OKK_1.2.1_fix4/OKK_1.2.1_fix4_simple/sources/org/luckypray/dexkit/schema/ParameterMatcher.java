package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ParameterMatcher */
/* JADX INFO: loaded from: classes.dex */
public final class ParameterMatcher extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ParameterMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addAnnotations(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(0, r3);
        }

        public final void addParameterType(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(1, r3);
        }

        public final int createParameterMatcher(C0733b r2, int r3, int r4) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(2);
            addParameterType(r2, r4);
            addAnnotations(r2, r3);
            return endParameterMatcher(r2);
        }

        public final int endParameterMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final ParameterMatcher getRootAsParameterMatcher(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsParameterMatcher(r2, new ParameterMatcher());
        }

        public final void startParameterMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(2);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final ParameterMatcher getRootAsParameterMatcher(ByteBuffer r3, ParameterMatcher r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public ParameterMatcher() {
    }

    public final ParameterMatcher __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final AnnotationsMatcher annotations(AnnotationsMatcher r4) {
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

    public final AnnotationsMatcher getAnnotations() {
        return annotations(new AnnotationsMatcher());
    }

    public final ClassMatcher getParameterType() {
        return parameterType(new ClassMatcher());
    }

    public final ClassMatcher parameterType(ClassMatcher r4) {
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
}
