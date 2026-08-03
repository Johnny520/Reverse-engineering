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
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMeta$Companion */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: addAccessFlags-Qn1smSk */
        public final void m2737addAccessFlagsQn1smSk(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1922e(3, i2);
        }

        /* JADX INFO: renamed from: addClassId-Qn1smSk */
        public final void m2738addClassIdQn1smSk(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1922e(2, i2);
        }

        public final void addDexDescriptor(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(4, i2);
        }

        /* JADX INFO: renamed from: addDexId-Qn1smSk */
        public final void m2739addDexIdQn1smSk(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1922e(1, i2);
        }

        /* JADX INFO: renamed from: addId-Qn1smSk */
        public final void m2740addIdQn1smSk(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1922e(0, i2);
        }

        public final void addParameterTypes(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(6, i2);
        }

        /* JADX INFO: renamed from: addReturnType-Qn1smSk */
        public final void m2741addReturnTypeQn1smSk(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1922e(5, i2);
        }

        /* JADX INFO: renamed from: createMethodMeta-gTuLvDU */
        public final int m2742createMethodMetagTuLvDU(C0733b c0733b, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(7);
            addParameterTypes(c0733b, i8);
            m2741addReturnTypeQn1smSk(c0733b, i7);
            addDexDescriptor(c0733b, i6);
            m2737addAccessFlagsQn1smSk(c0733b, i5);
            m2738addClassIdQn1smSk(c0733b, i4);
            m2739addDexIdQn1smSk(c0733b, i3);
            m2740addIdQn1smSk(c0733b, i2);
            return endMethodMeta(c0733b);
        }

        public final int createParameterTypesVector(C0733b c0733b, int[] iArr) {
            AbstractC0307g.m703e(c0733b, "builder");
            AbstractC0307g.m703e(iArr, "data");
            c0733b.m1937t(4, iArr.length, 4);
            int length = iArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0733b.m1930m();
                }
                c0733b.m1921d(iArr[length]);
            }
        }

        public final int endMethodMeta(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final MethodMeta getRootAsMethodMeta(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsMethodMeta(byteBuffer, new MethodMeta());
        }

        public final void startMethodMeta(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(7);
        }

        public final void startParameterTypesVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(4, i2, 4);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final MethodMeta getRootAsMethodMeta(ByteBuffer byteBuffer, MethodMeta methodMeta) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(methodMeta, "obj");
            return methodMeta.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final MethodMeta __assign(int i2, ByteBuffer byteBuffer) {
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

    /* JADX INFO: renamed from: getAccessFlags-pVg5ArA */
    public final int m2727getAccessFlagspVg5ArA() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.f2573bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX INFO: renamed from: getClassId-pVg5ArA */
    public final int m2728getClassIdpVg5ArA() {
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

    /* JADX INFO: renamed from: getDexId-pVg5ArA */
    public final int m2729getDexIdpVg5ArA() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f2573bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX INFO: renamed from: getId-pVg5ArA */
    public final int m2730getIdpVg5ArA() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f2573bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public final ByteBuffer getParameterTypesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(16, 4);
        AbstractC0307g.m702d(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(16, 4)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getParameterTypesLength() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX INFO: renamed from: getReturnType-pVg5ArA */
    public final int m2731getReturnTypepVg5ArA() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return this.f2573bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX INFO: renamed from: mutateAccessFlags-WZ4Q5Ns */
    public final boolean m2732mutateAccessFlagsWZ4Q5Ns(int i2) {
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt(i__offset + this.bb_pos, i2);
        return true;
    }

    /* JADX INFO: renamed from: mutateClassId-WZ4Q5Ns */
    public final boolean m2733mutateClassIdWZ4Q5Ns(int i2) {
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt(i__offset + this.bb_pos, i2);
        return true;
    }

    /* JADX INFO: renamed from: mutateDexId-WZ4Q5Ns */
    public final boolean m2734mutateDexIdWZ4Q5Ns(int i2) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt(i__offset + this.bb_pos, i2);
        return true;
    }

    /* JADX INFO: renamed from: mutateId-WZ4Q5Ns */
    public final boolean m2735mutateIdWZ4Q5Ns(int i2) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt(i__offset + this.bb_pos, i2);
        return true;
    }

    public final boolean mutateParameterTypes(int i2, int i3) {
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt((i2 * 4) + __vector(i__offset), i3);
        return true;
    }

    /* JADX INFO: renamed from: mutateReturnType-WZ4Q5Ns */
    public final boolean m2736mutateReturnTypeWZ4Q5Ns(int i2) {
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt(i__offset + this.bb_pos, i2);
        return true;
    }

    public final int parameterTypes(int i2) {
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return 0;
        }
        return this.f2573bb.getInt((i2 * 4) + __vector(i__offset));
    }

    public final ByteBuffer parameterTypesInByteBuffer(ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 16, 4);
        AbstractC0307g.m702d(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 16, 4)");
        return byteBuffer__vector_in_bytebuffer;
    }
}
