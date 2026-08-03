package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMeta */
/* JADX INFO: loaded from: classes.dex */
public final class MethodMeta extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMeta$Companion */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: addAccessFlags-Qn1smSk */
        public final void m2737addAccessFlagsQn1smSk(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1922e(3, r3);
        }

        /* JADX INFO: renamed from: addClassId-Qn1smSk */
        public final void m2738addClassIdQn1smSk(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1922e(2, r3);
        }

        public final void addDexDescriptor(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(4, r3);
        }

        /* JADX INFO: renamed from: addDexId-Qn1smSk */
        public final void m2739addDexIdQn1smSk(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1922e(1, r3);
        }

        /* JADX INFO: renamed from: addId-Qn1smSk */
        public final void m2740addIdQn1smSk(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1922e(0, r3);
        }

        public final void addParameterTypes(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(6, r3);
        }

        /* JADX INFO: renamed from: addReturnType-Qn1smSk */
        public final void m2741addReturnTypeQn1smSk(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1922e(5, r3);
        }

        /* JADX INFO: renamed from: createMethodMeta-gTuLvDU */
        public final int m2742createMethodMetagTuLvDU(C0733b r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(7);
            addParameterTypes(r2, r9);
            m2741addReturnTypeQn1smSk(r2, r8);
            addDexDescriptor(r2, r7);
            m2737addAccessFlagsQn1smSk(r2, r6);
            m2738addClassIdQn1smSk(r2, r5);
            m2739addDexIdQn1smSk(r2, r4);
            m2740addIdQn1smSk(r2, r3);
            return endMethodMeta(r2);
        }

        public final int createParameterTypesVector(C0733b r3, int[] r4) {
            AbstractC0307g.m703e(r3, "builder");
            AbstractC0307g.m703e(r4, "data");
            r3.m1937t(4, r4.length, 4);
            int r02 = r4.length;
        L3:
            r02 = r02 - 1;
            if ((-1) >= r02) goto L7;
            r3.m1921d(r4[r02]);
            goto L3
        L7:
            return r3.m1930m();
        }

        public final int endMethodMeta(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final MethodMeta getRootAsMethodMeta(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsMethodMeta(r2, new MethodMeta());
        }

        public final void startMethodMeta(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(7);
        }

        public final void startParameterTypesVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(4, r3, 4);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final MethodMeta getRootAsMethodMeta(ByteBuffer r3, MethodMeta r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public MethodMeta() {
    }

    public final MethodMeta __assign(int r2, ByteBuffer r3) {
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
    public final int m2727getAccessFlagspVg5ArA() {
        int r02 = __offset(10);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.getInt(r02 + this.bb_pos);
    }

    /* JADX INFO: renamed from: getClassId-pVg5ArA */
    public final int m2728getClassIdpVg5ArA() {
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
    public final int m2729getDexIdpVg5ArA() {
        int r02 = __offset(6);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.getInt(r02 + this.bb_pos);
    }

    /* JADX INFO: renamed from: getId-pVg5ArA */
    public final int m2730getIdpVg5ArA() {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.getInt(r02 + this.bb_pos);
    }

    public final ByteBuffer getParameterTypesAsByteBuffer() {
        ByteBuffer r02 = __vector_as_bytebuffer(16, 4);
        AbstractC0307g.m702d(r02, "__vector_as_bytebuffer(16, 4)");
        return r02;
    }

    public final int getParameterTypesLength() {
        int r02 = __offset(16);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    /* JADX INFO: renamed from: getReturnType-pVg5ArA */
    public final int m2731getReturnTypepVg5ArA() {
        int r02 = __offset(14);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.getInt(r02 + this.bb_pos);
    }

    /* JADX INFO: renamed from: mutateAccessFlags-WZ4Q5Ns */
    public final boolean m2732mutateAccessFlagsWZ4Q5Ns(int r4) {
        int r02 = __offset(10);
        if (r02 == 0) goto L5;
        this.f2573bb.putInt(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: mutateClassId-WZ4Q5Ns */
    public final boolean m2733mutateClassIdWZ4Q5Ns(int r4) {
        int r02 = __offset(8);
        if (r02 == 0) goto L5;
        this.f2573bb.putInt(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: mutateDexId-WZ4Q5Ns */
    public final boolean m2734mutateDexIdWZ4Q5Ns(int r4) {
        int r02 = __offset(6);
        if (r02 == 0) goto L5;
        this.f2573bb.putInt(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: mutateId-WZ4Q5Ns */
    public final boolean m2735mutateIdWZ4Q5Ns(int r4) {
        int r02 = __offset(4);
        if (r02 == 0) goto L5;
        this.f2573bb.putInt(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    public final boolean mutateParameterTypes(int r3, int r4) {
        int r02 = __offset(16);
        if (r02 == 0) goto L5;
        int r32 = r3 * 4;
        this.f2573bb.putInt(r32 + __vector(r02), r4);
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: mutateReturnType-WZ4Q5Ns */
    public final boolean m2736mutateReturnTypeWZ4Q5Ns(int r4) {
        int r02 = __offset(14);
        if (r02 == 0) goto L5;
        this.f2573bb.putInt(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    public final int parameterTypes(int r3) {
        int r02 = __offset(16);
        if (r02 == 0) goto L5;
        int r32 = r3 * 4;
        return this.f2573bb.getInt(r32 + __vector(r02));
    L5:
        return 0;
    }

    public final ByteBuffer parameterTypesInByteBuffer(ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        ByteBuffer r32 = __vector_in_bytebuffer(r3, 16, 4);
        AbstractC0307g.m702d(r32, "__vector_in_bytebuffer(_bb, 16, 4)");
        return r32;
    }
}
