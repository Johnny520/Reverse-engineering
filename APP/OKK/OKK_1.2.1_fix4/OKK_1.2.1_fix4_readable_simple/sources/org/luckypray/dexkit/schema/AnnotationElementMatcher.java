package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementMatcher */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationElementMatcher extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addName(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(0, r3);
        }

        public final void addValue(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(2, r3);
        }

        /* JADX INFO: renamed from: addValueType-EK-6454 */
        public final void m2679addValueTypeEK6454(C0733b r2, byte r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1920c(1, r3);
        }

        /* JADX INFO: renamed from: createAnnotationElementMatcher-SpDDLgk */
        public final int m2680createAnnotationElementMatcherSpDDLgk(C0733b r2, int r3, byte r4, int r5) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(3);
            addValue(r2, r5);
            addName(r2, r3);
            m2679addValueTypeEK6454(r2, r4);
            return endAnnotationElementMatcher(r2);
        }

        public final int endAnnotationElementMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final AnnotationElementMatcher getRootAsAnnotationElementMatcher(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsAnnotationElementMatcher(r2, new AnnotationElementMatcher());
        }

        public final void startAnnotationElementMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(3);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final AnnotationElementMatcher getRootAsAnnotationElementMatcher(ByteBuffer r3, AnnotationElementMatcher r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public AnnotationElementMatcher() {
    }

    public final AnnotationElementMatcher __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final StringMatcher getName() {
        return name(new StringMatcher());
    }

    /* JADX INFO: renamed from: getValueType-w2LRezQ */
    public final byte m2677getValueTypew2LRezQ() {
        int r02 = __offset(6);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.get(r02 + this.bb_pos);
    }

    /* JADX INFO: renamed from: mutateValueType-7apg3OU */
    public final boolean m2678mutateValueType7apg3OU(byte r4) {
        int r02 = __offset(6);
        if (r02 == 0) goto L5;
        this.f2573bb.put(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    public final StringMatcher name(StringMatcher r4) {
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

    public final AbstractC0735d value(AbstractC0735d r3) {
        AbstractC0307g.m703e(r3, "obj");
        int r02 = __offset(8);
        if (r02 != 0) goto L7;
        return null;
    L7:
        return __union(r3, r02 + this.bb_pos);
    }
}
