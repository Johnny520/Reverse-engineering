package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0000a;
import p000.AbstractC0367od;
import p000.AbstractC0431r2;
import p000.C0038c5;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMeta, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ClassMeta extends AbstractC0367od {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassMeta __assign(int i, ByteBuffer byteBuffer) {
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
    public final int fields(int i) {
        int i__offset = __offset(20);
        if (i__offset == 0) {
            return 0;
        }
        return this.f662bb.getInt((i * 4) + __vector(i__offset));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer fieldsInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 20, 4);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getAccessFlags-pVg5ArA, reason: not valid java name */
    public final int m1256getAccessFlagspVg5ArA() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.f662bb.getInt(i__offset + this.bb_pos);
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
    public final int m1257getDexIdpVg5ArA() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f662bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer getFieldsAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(20, 4);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getFieldsLength() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getId-pVg5ArA, reason: not valid java name */
    public final int m1258getIdpVg5ArA() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f662bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer getInterfacesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(16, 4);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getInterfacesLength() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer getMethodsAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(18, 4);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getMethodsLength() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getSourceFile() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer getSourceFileAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(8, 1);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getSuperClass-pVg5ArA, reason: not valid java name */
    public final int m1259getSuperClasspVg5ArA() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return this.f662bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int interfaces(int i) {
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return 0;
        }
        return this.f662bb.getInt((i * 4) + __vector(i__offset));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer interfacesInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 16, 4);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int methods(int i) {
        int i__offset = __offset(18);
        if (i__offset == 0) {
            return 0;
        }
        return this.f662bb.getInt((i * 4) + __vector(i__offset));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer methodsInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 18, 4);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: mutateAccessFlags-WZ4Q5Ns, reason: not valid java name */
    public final boolean m1260mutateAccessFlagsWZ4Q5Ns(int i) {
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return false;
        }
        this.f662bb.putInt(i__offset + this.bb_pos, i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: mutateDexId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m1261mutateDexIdWZ4Q5Ns(int i) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f662bb.putInt(i__offset + this.bb_pos, i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateFields(int i, int i2) {
        int i__offset = __offset(20);
        if (i__offset == 0) {
            return false;
        }
        this.f662bb.putInt((i * 4) + __vector(i__offset), i2);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: mutateId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m1262mutateIdWZ4Q5Ns(int i) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f662bb.putInt(i__offset + this.bb_pos, i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateInterfaces(int i, int i2) {
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return false;
        }
        this.f662bb.putInt((i * 4) + __vector(i__offset), i2);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateMethods(int i, int i2) {
        int i__offset = __offset(18);
        if (i__offset == 0) {
            return false;
        }
        this.f662bb.putInt((i * 4) + __vector(i__offset), i2);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: mutateSuperClass-WZ4Q5Ns, reason: not valid java name */
    public final boolean m1263mutateSuperClassWZ4Q5Ns(int i) {
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return false;
        }
        this.f662bb.putInt(i__offset + this.bb_pos, i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer sourceFileInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 8, 1);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMeta$Companion */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-ClassMeta.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: addAccessFlags-Qn1smSk, reason: not valid java name */
        public final void m1264addAccessFlagsQn1smSk(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m99e(3, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addDexDescriptor(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(4, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: addDexId-Qn1smSk, reason: not valid java name */
        public final void m1265addDexIdQn1smSk(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m99e(1, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addFields(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(8, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: addId-Qn1smSk, reason: not valid java name */
        public final void m1266addIdQn1smSk(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m99e(0, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addInterfaces(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(6, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addMethods(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(7, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addSourceFile(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m102h(2, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: addSuperClass-Qn1smSk, reason: not valid java name */
        public final void m1267addSuperClassQn1smSk(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m99e(5, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: createClassMeta-uFWppp4, reason: not valid java name */
        public final int m1268createClassMetauFWppp4(C0038c5 c0038c5, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            c0038c5.getClass();
            c0038c5.m112r(9);
            addFields(c0038c5, i9);
            addMethods(c0038c5, i8);
            addInterfaces(c0038c5, i7);
            m1267addSuperClassQn1smSk(c0038c5, i6);
            addDexDescriptor(c0038c5, i5);
            m1264addAccessFlagsQn1smSk(c0038c5, i4);
            addSourceFile(c0038c5, i3);
            m1265addDexIdQn1smSk(c0038c5, i2);
            m1266addIdQn1smSk(c0038c5, i);
            return endClassMeta(c0038c5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000e */
        public final int createFieldsVector(C0038c5 c0038c5, int[] iArr) {
            c0038c5.getClass();
            iArr.getClass();
            c0038c5.m113s(4, iArr.length, 4);
            int length = iArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0038c5.m107m();
                }
                c0038c5.m98d(iArr[length]);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000e */
        public final int createInterfacesVector(C0038c5 c0038c5, int[] iArr) {
            c0038c5.getClass();
            iArr.getClass();
            c0038c5.m113s(4, iArr.length, 4);
            int length = iArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0038c5.m107m();
                }
                c0038c5.m98d(iArr[length]);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000e */
        public final int createMethodsVector(C0038c5 c0038c5, int[] iArr) {
            c0038c5.getClass();
            iArr.getClass();
            c0038c5.m113s(4, iArr.length, 4);
            int length = iArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0038c5.m107m();
                }
                c0038c5.m98d(iArr[length]);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int endClassMeta(C0038c5 c0038c5) {
            c0038c5.getClass();
            return c0038c5.m106l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ClassMeta getRootAsClassMeta(ByteBuffer byteBuffer, ClassMeta classMeta) {
            byteBuffer.getClass();
            classMeta.getClass();
            return classMeta.__assign(byteBuffer.position() + AbstractC0000a.m0a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startClassMeta(C0038c5 c0038c5) {
            c0038c5.getClass();
            c0038c5.m112r(9);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startFieldsVector(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m113s(4, i, 4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startInterfacesVector(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m113s(4, i, 4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startMethodsVector(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m113s(4, i, 4);
        }

        private Companion() {
        }

        public final ClassMeta getRootAsClassMeta(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsClassMeta(byteBuffer, new ClassMeta());
        }

        public final void validateVersion() {
        }
    }
}
