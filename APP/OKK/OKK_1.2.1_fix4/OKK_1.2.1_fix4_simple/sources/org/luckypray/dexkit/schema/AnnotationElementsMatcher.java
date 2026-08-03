package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementsMatcher */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationElementsMatcher extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationElementsMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addElementCount(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(2, r3);
        }

        public final void addElements(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(0, r3);
        }

        public final void addMatchType(C0733b r2, byte r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1920c(1, r3);
        }

        public final int createAnnotationElementsMatcher(C0733b r2, int r3, byte r4, int r5) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(3);
            addElementCount(r2, r5);
            addElements(r2, r3);
            addMatchType(r2, r4);
            return endAnnotationElementsMatcher(r2);
        }

        public final int createElementsVector(C0733b r3, int[] r4) {
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

        public final int endAnnotationElementsMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final AnnotationElementsMatcher getRootAsAnnotationElementsMatcher(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsAnnotationElementsMatcher(r2, new AnnotationElementsMatcher());
        }

        public final void startAnnotationElementsMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(3);
        }

        public final void startElementsVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(4, r3, 4);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final AnnotationElementsMatcher getRootAsAnnotationElementsMatcher(ByteBuffer r3, AnnotationElementsMatcher r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public AnnotationElementsMatcher() {
    }

    public final AnnotationElementsMatcher __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final IntRange elementCount(IntRange r4) {
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

    public final AnnotationElementMatcher elements(int r2) {
        return elements(new AnnotationElementMatcher(), r2);
    }

    public final IntRange getElementCount() {
        return elementCount(new IntRange());
    }

    public final int getElementsLength() {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final byte getMatchType() {
        int r02 = __offset(6);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.get(r02 + this.bb_pos);
    }

    public final boolean mutateMatchType(byte r4) {
        int r02 = __offset(6);
        if (r02 == 0) goto L5;
        this.f2573bb.put(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    public final AnnotationElementMatcher elements(AnnotationElementMatcher r3, int r4) {
        AbstractC0307g.m703e(r3, "obj");
        int r1 = __offset(4);
        if (r1 == 0) goto L5;
        int r42 = r4 * 4;
        int r43 = __indirect(r42 + __vector(r1));
        ByteBuffer r02 = this.f2573bb;
        AbstractC0307g.m702d(r02, "bb");
        return r3.__assign(r43, r02);
    L5:
        return null;
    }
}
