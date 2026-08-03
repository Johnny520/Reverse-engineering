package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMeta */
/* JADX INFO: loaded from: classes.dex */
public final class FieldMeta extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMeta$Companion */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: addAccessFlags-Qn1smSk */
        public final void m2718addAccessFlagsQn1smSk(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1922e(3, r3);
        }

        /* JADX INFO: renamed from: addClassId-Qn1smSk */
        public final void m2719addClassIdQn1smSk(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1922e(2, r3);
        }

        public final void addDexDescriptor(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(4, r3);
        }

        /* JADX INFO: renamed from: addDexId-Qn1smSk */
        public final void m2720addDexIdQn1smSk(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1922e(1, r3);
        }

        /* JADX INFO: renamed from: addId-Qn1smSk */
        public final void m2721addIdQn1smSk(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1922e(0, r3);
        }

        /* JADX INFO: renamed from: addTypeId-Qn1smSk */
        public final void m2722addTypeIdQn1smSk(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1922e(5, r3);
        }

        /* JADX INFO: renamed from: createFieldMeta--riHEuE */
        public final int m2723createFieldMetariHEuE(C0733b r2, int r3, int r4, int r5, int r6, int r7, int r8) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(6);
            m2722addTypeIdQn1smSk(r2, r8);
            addDexDescriptor(r2, r7);
            m2718addAccessFlagsQn1smSk(r2, r6);
            m2719addClassIdQn1smSk(r2, r5);
            m2720addDexIdQn1smSk(r2, r4);
            m2721addIdQn1smSk(r2, r3);
            return endFieldMeta(r2);
        }

        public final int endFieldMeta(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final FieldMeta getRootAsFieldMeta(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsFieldMeta(r2, new FieldMeta());
        }

        public final void startFieldMeta(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(6);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final FieldMeta getRootAsFieldMeta(ByteBuffer r3, FieldMeta r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public FieldMeta() {
    }

    public final FieldMeta __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final ByteBuffer dexDescriptorInByteBuffer(ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        ByteBuffer r32 = __vector_in_bytebuffer(r3, 12, 1);
        AbstractC0307g.m702d(r32, "__vector_in_bytebuffer(_bb, 12, 1)");
        return r32;
    }

    /* JADX INFO: renamed from: getAccessFlags-pVg5ArA */
    public final int m2708getAccessFlagspVg5ArA() {
        int r02 = __offset(10);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.getInt(r02 + this.bb_pos);
    }

    /* JADX INFO: renamed from: getClassId-pVg5ArA */
    public final int m2709getClassIdpVg5ArA() {
        int r02 = __offset(8);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.getInt(r02 + this.bb_pos);
    }

    public final String getDexDescriptor() {
        int r02 = __offset(12);
        if (r02 != 0) goto L7;
        return null;
    L7:
        return __string(r02 + this.bb_pos);
    }

    public final ByteBuffer getDexDescriptorAsByteBuffer() {
        ByteBuffer r02 = __vector_as_bytebuffer(12, 1);
        AbstractC0307g.m702d(r02, "__vector_as_bytebuffer(12, 1)");
        return r02;
    }

    /* JADX INFO: renamed from: getDexId-pVg5ArA */
    public final int m2710getDexIdpVg5ArA() {
        int r02 = __offset(6);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.getInt(r02 + this.bb_pos);
    }

    /* JADX INFO: renamed from: getId-pVg5ArA */
    public final int m2711getIdpVg5ArA() {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.getInt(r02 + this.bb_pos);
    }

    /* JADX INFO: renamed from: getTypeId-pVg5ArA */
    public final int m2712getTypeIdpVg5ArA() {
        int r02 = __offset(14);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.getInt(r02 + this.bb_pos);
    }

    /* JADX INFO: renamed from: mutateAccessFlags-WZ4Q5Ns */
    public final boolean m2713mutateAccessFlagsWZ4Q5Ns(int r4) {
        int r02 = __offset(10);
        if (r02 == 0) goto L5;
        this.f2573bb.putInt(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: mutateClassId-WZ4Q5Ns */
    public final boolean m2714mutateClassIdWZ4Q5Ns(int r4) {
        int r02 = __offset(8);
        if (r02 == 0) goto L5;
        this.f2573bb.putInt(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: mutateDexId-WZ4Q5Ns */
    public final boolean m2715mutateDexIdWZ4Q5Ns(int r4) {
        int r02 = __offset(6);
        if (r02 == 0) goto L5;
        this.f2573bb.putInt(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: mutateId-WZ4Q5Ns */
    public final boolean m2716mutateIdWZ4Q5Ns(int r4) {
        int r02 = __offset(4);
        if (r02 == 0) goto L5;
        this.f2573bb.putInt(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: mutateTypeId-WZ4Q5Ns */
    public final boolean m2717mutateTypeIdWZ4Q5Ns(int r4) {
        int r02 = __offset(14);
        if (r02 == 0) goto L5;
        this.f2573bb.putInt(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }
}
