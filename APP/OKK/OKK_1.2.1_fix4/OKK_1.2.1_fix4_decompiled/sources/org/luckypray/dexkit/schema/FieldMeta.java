package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMeta, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class FieldMeta extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMeta$Companion */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: addAccessFlags-Qn1smSk, reason: not valid java name */
        public final void m2718addAccessFlagsQn1smSk(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1922e(3, i2);
        }

        /* JADX INFO: renamed from: addClassId-Qn1smSk, reason: not valid java name */
        public final void m2719addClassIdQn1smSk(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1922e(2, i2);
        }

        public final void addDexDescriptor(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(4, i2);
        }

        /* JADX INFO: renamed from: addDexId-Qn1smSk, reason: not valid java name */
        public final void m2720addDexIdQn1smSk(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1922e(1, i2);
        }

        /* JADX INFO: renamed from: addId-Qn1smSk, reason: not valid java name */
        public final void m2721addIdQn1smSk(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1922e(0, i2);
        }

        /* JADX INFO: renamed from: addTypeId-Qn1smSk, reason: not valid java name */
        public final void m2722addTypeIdQn1smSk(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1922e(5, i2);
        }

        /* JADX INFO: renamed from: createFieldMeta--riHEuE, reason: not valid java name */
        public final int m2723createFieldMetariHEuE(C0733b c0733b, int i2, int i3, int i4, int i5, int i6, int i7) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(6);
            m2722addTypeIdQn1smSk(c0733b, i7);
            addDexDescriptor(c0733b, i6);
            m2718addAccessFlagsQn1smSk(c0733b, i5);
            m2719addClassIdQn1smSk(c0733b, i4);
            m2720addDexIdQn1smSk(c0733b, i3);
            m2721addIdQn1smSk(c0733b, i2);
            return endFieldMeta(c0733b);
        }

        public final int endFieldMeta(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final FieldMeta getRootAsFieldMeta(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsFieldMeta(byteBuffer, new FieldMeta());
        }

        public final void startFieldMeta(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(6);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final FieldMeta getRootAsFieldMeta(ByteBuffer byteBuffer, FieldMeta fieldMeta) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(fieldMeta, "obj");
            return fieldMeta.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final FieldMeta __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final ByteBuffer dexDescriptorInByteBuffer(ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 12, 1);
        AbstractC0307g.m702d(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 12, 1)");
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX INFO: renamed from: getAccessFlags-pVg5ArA, reason: not valid java name */
    public final int m2708getAccessFlagspVg5ArA() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.f2573bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX INFO: renamed from: getClassId-pVg5ArA, reason: not valid java name */
    public final int m2709getClassIdpVg5ArA() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f2573bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public final String getDexDescriptor() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public final ByteBuffer getDexDescriptorAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(12, 1);
        AbstractC0307g.m702d(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(12, 1)");
        return byteBuffer__vector_as_bytebuffer;
    }

    /* JADX INFO: renamed from: getDexId-pVg5ArA, reason: not valid java name */
    public final int m2710getDexIdpVg5ArA() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f2573bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX INFO: renamed from: getId-pVg5ArA, reason: not valid java name */
    public final int m2711getIdpVg5ArA() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f2573bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX INFO: renamed from: getTypeId-pVg5ArA, reason: not valid java name */
    public final int m2712getTypeIdpVg5ArA() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return this.f2573bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX INFO: renamed from: mutateAccessFlags-WZ4Q5Ns, reason: not valid java name */
    public final boolean m2713mutateAccessFlagsWZ4Q5Ns(int i2) {
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt(i__offset + this.bb_pos, i2);
        return true;
    }

    /* JADX INFO: renamed from: mutateClassId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m2714mutateClassIdWZ4Q5Ns(int i2) {
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt(i__offset + this.bb_pos, i2);
        return true;
    }

    /* JADX INFO: renamed from: mutateDexId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m2715mutateDexIdWZ4Q5Ns(int i2) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt(i__offset + this.bb_pos, i2);
        return true;
    }

    /* JADX INFO: renamed from: mutateId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m2716mutateIdWZ4Q5Ns(int i2) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt(i__offset + this.bb_pos, i2);
        return true;
    }

    /* JADX INFO: renamed from: mutateTypeId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m2717mutateTypeIdWZ4Q5Ns(int i2) {
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt(i__offset + this.bb_pos, i2);
        return true;
    }
}
