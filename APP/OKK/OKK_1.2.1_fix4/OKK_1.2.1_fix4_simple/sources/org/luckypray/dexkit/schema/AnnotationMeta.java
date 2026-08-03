package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationMeta */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationMeta extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationMeta$Companion */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: addDexId-Qn1smSk */
        public final void m2692addDexIdQn1smSk(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1922e(0, r3);
        }

        public final void addElements(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(4, r3);
        }

        public final void addTypeDescriptor(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(2, r3);
        }

        /* JADX INFO: renamed from: addTypeId-Qn1smSk */
        public final void m2693addTypeIdQn1smSk(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1922e(1, r3);
        }

        public final void addVisibility(C0733b r2, byte r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1920c(3, r3);
        }

        /* JADX INFO: renamed from: createAnnotationMeta-d0p9NHs */
        public final int m2694createAnnotationMetad0p9NHs(C0733b r2, int r3, int r4, int r5, byte r6, int r7) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(5);
            addElements(r2, r7);
            addTypeDescriptor(r2, r5);
            m2693addTypeIdQn1smSk(r2, r4);
            m2692addDexIdQn1smSk(r2, r3);
            addVisibility(r2, r6);
            return endAnnotationMeta(r2);
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

        public final int endAnnotationMeta(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final AnnotationMeta getRootAsAnnotationMeta(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsAnnotationMeta(r2, new AnnotationMeta());
        }

        public final void startAnnotationMeta(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(5);
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

        public final AnnotationMeta getRootAsAnnotationMeta(ByteBuffer r3, AnnotationMeta r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public AnnotationMeta() {
    }

    public final AnnotationMeta __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final AnnotationElementMeta elements(int r2) {
        return elements(new AnnotationElementMeta(), r2);
    }

    /* JADX INFO: renamed from: getDexId-pVg5ArA */
    public final int m2688getDexIdpVg5ArA() {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.getInt(r02 + this.bb_pos);
    }

    public final int getElementsLength() {
        int r02 = __offset(12);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final String getTypeDescriptor() {
        int r02 = __offset(8);
        if (r02 != 0) goto L7;
        return null;
    L7:
        return __string(r02 + this.bb_pos);
    }

    public final ByteBuffer getTypeDescriptorAsByteBuffer() {
        ByteBuffer r02 = __vector_as_bytebuffer(8, 1);
        AbstractC0307g.m702d(r02, "__vector_as_bytebuffer(8, 1)");
        return r02;
    }

    /* JADX INFO: renamed from: getTypeId-pVg5ArA */
    public final int m2689getTypeIdpVg5ArA() {
        int r02 = __offset(6);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.getInt(r02 + this.bb_pos);
    }

    public final byte getVisibility() {
        int r02 = __offset(10);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.get(r02 + this.bb_pos);
    }

    /* JADX INFO: renamed from: mutateDexId-WZ4Q5Ns */
    public final boolean m2690mutateDexIdWZ4Q5Ns(int r4) {
        int r02 = __offset(4);
        if (r02 == 0) goto L5;
        this.f2573bb.putInt(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: mutateTypeId-WZ4Q5Ns */
    public final boolean m2691mutateTypeIdWZ4Q5Ns(int r4) {
        int r02 = __offset(6);
        if (r02 == 0) goto L5;
        this.f2573bb.putInt(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    public final boolean mutateVisibility(byte r4) {
        int r02 = __offset(10);
        if (r02 == 0) goto L5;
        this.f2573bb.put(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    public final ByteBuffer typeDescriptorInByteBuffer(ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        ByteBuffer r32 = __vector_in_bytebuffer(r3, 8, 1);
        AbstractC0307g.m702d(r32, "__vector_in_bytebuffer(_bb, 8, 1)");
        return r32;
    }

    public final AnnotationElementMeta elements(AnnotationElementMeta r3, int r4) {
        AbstractC0307g.m703e(r3, "obj");
        int r02 = __offset(12);
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
