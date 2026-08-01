package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0619pl;
import p000.AbstractC0748t1;
import p000.C0938xt;
import p000.c61;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMeta, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldMeta extends c61 {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldMeta __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer dexDescriptorInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 12, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getAccessFlags-pVg5ArA, reason: not valid java name */
    public final int m5700getAccessFlagspVg5ArA() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.f715bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getClassId-pVg5ArA, reason: not valid java name */
    public final int m5701getClassIdpVg5ArA() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f715bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getDexDescriptor() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer getDexDescriptorAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(12, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getDexId-pVg5ArA, reason: not valid java name */
    public final int m5702getDexIdpVg5ArA() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f715bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getId-pVg5ArA, reason: not valid java name */
    public final int m5703getIdpVg5ArA() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f715bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getTypeId-pVg5ArA, reason: not valid java name */
    public final int m5704getTypeIdpVg5ArA() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return this.f715bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: mutateAccessFlags-WZ4Q5Ns, reason: not valid java name */
    public final boolean m5705mutateAccessFlagsWZ4Q5Ns(int i) {
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return false;
        }
        this.f715bb.putInt(i__offset + this.bb_pos, i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: mutateClassId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m5706mutateClassIdWZ4Q5Ns(int i) {
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return false;
        }
        this.f715bb.putInt(i__offset + this.bb_pos, i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: mutateDexId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m5707mutateDexIdWZ4Q5Ns(int i) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f715bb.putInt(i__offset + this.bb_pos, i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: mutateId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m5708mutateIdWZ4Q5Ns(int i) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f715bb.putInt(i__offset + this.bb_pos, i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: mutateTypeId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m5709mutateTypeIdWZ4Q5Ns(int i) {
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return false;
        }
        this.f715bb.putInt(i__offset + this.bb_pos, i);
        return true;
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldMeta$Companion */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-FieldMeta.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: addAccessFlags-Qn1smSk, reason: not valid java name */
        public final void m5710addAccessFlagsQn1smSk(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5156e(3, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: addClassId-Qn1smSk, reason: not valid java name */
        public final void m5711addClassIdQn1smSk(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5156e(2, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addDexDescriptor(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5159h(4, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: addDexId-Qn1smSk, reason: not valid java name */
        public final void m5712addDexIdQn1smSk(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5156e(1, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: addId-Qn1smSk, reason: not valid java name */
        public final void m5713addIdQn1smSk(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5156e(0, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: addTypeId-Qn1smSk, reason: not valid java name */
        public final void m5714addTypeIdQn1smSk(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5156e(5, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: createFieldMeta--riHEuE, reason: not valid java name */
        public final int m5715createFieldMetariHEuE(C0938xt c0938xt, int i, int i2, int i3, int i4, int i5, int i6) {
            c0938xt.getClass();
            c0938xt.m5169r(6);
            m5714addTypeIdQn1smSk(c0938xt, i6);
            addDexDescriptor(c0938xt, i5);
            m5710addAccessFlagsQn1smSk(c0938xt, i4);
            m5711addClassIdQn1smSk(c0938xt, i3);
            m5712addDexIdQn1smSk(c0938xt, i2);
            m5713addIdQn1smSk(c0938xt, i);
            return endFieldMeta(c0938xt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int endFieldMeta(C0938xt c0938xt) {
            c0938xt.getClass();
            return c0938xt.m5163l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final FieldMeta getRootAsFieldMeta(ByteBuffer byteBuffer, FieldMeta fieldMeta) {
            byteBuffer.getClass();
            fieldMeta.getClass();
            return fieldMeta.__assign(byteBuffer.position() + AbstractC0748t1.m4148f(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startFieldMeta(C0938xt c0938xt) {
            c0938xt.getClass();
            c0938xt.m5169r(6);
        }

        private Companion() {
        }

        public final FieldMeta getRootAsFieldMeta(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsFieldMeta(byteBuffer, new FieldMeta());
        }

        public final void validateVersion() {
        }
    }
}
