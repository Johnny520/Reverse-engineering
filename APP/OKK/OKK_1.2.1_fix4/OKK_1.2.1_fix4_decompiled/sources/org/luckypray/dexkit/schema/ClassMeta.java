package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMeta, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class ClassMeta extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMeta$Companion */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: addAccessFlags-Qn1smSk, reason: not valid java name */
        public final void m2703addAccessFlagsQn1smSk(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1922e(3, i2);
        }

        public final void addDexDescriptor(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(4, i2);
        }

        /* JADX INFO: renamed from: addDexId-Qn1smSk, reason: not valid java name */
        public final void m2704addDexIdQn1smSk(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1922e(1, i2);
        }

        public final void addFields(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(8, i2);
        }

        /* JADX INFO: renamed from: addId-Qn1smSk, reason: not valid java name */
        public final void m2705addIdQn1smSk(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1922e(0, i2);
        }

        public final void addInterfaces(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(6, i2);
        }

        public final void addMethods(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(7, i2);
        }

        public final void addSourceFile(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(2, i2);
        }

        /* JADX INFO: renamed from: addSuperClass-Qn1smSk, reason: not valid java name */
        public final void m2706addSuperClassQn1smSk(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1922e(5, i2);
        }

        /* JADX INFO: renamed from: createClassMeta-uFWppp4, reason: not valid java name */
        public final int m2707createClassMetauFWppp4(C0733b c0733b, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(9);
            addFields(c0733b, i10);
            addMethods(c0733b, i9);
            addInterfaces(c0733b, i8);
            m2706addSuperClassQn1smSk(c0733b, i7);
            addDexDescriptor(c0733b, i6);
            m2703addAccessFlagsQn1smSk(c0733b, i5);
            addSourceFile(c0733b, i4);
            m2704addDexIdQn1smSk(c0733b, i3);
            m2705addIdQn1smSk(c0733b, i2);
            return endClassMeta(c0733b);
        }

        public final int createFieldsVector(C0733b c0733b, int[] iArr) {
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

        public final int createInterfacesVector(C0733b c0733b, int[] iArr) {
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

        public final int createMethodsVector(C0733b c0733b, int[] iArr) {
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

        public final int endClassMeta(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final ClassMeta getRootAsClassMeta(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsClassMeta(byteBuffer, new ClassMeta());
        }

        public final void startClassMeta(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(9);
        }

        public final void startFieldsVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(4, i2, 4);
        }

        public final void startInterfacesVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(4, i2, 4);
        }

        public final void startMethodsVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(4, i2, 4);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final ClassMeta getRootAsClassMeta(ByteBuffer byteBuffer, ClassMeta classMeta) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(classMeta, "obj");
            return classMeta.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final ClassMeta __assign(int i2, ByteBuffer byteBuffer) {
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

    public final int fields(int i2) {
        int i__offset = __offset(20);
        if (i__offset == 0) {
            return 0;
        }
        return this.f2573bb.getInt((i2 * 4) + __vector(i__offset));
    }

    public final ByteBuffer fieldsInByteBuffer(ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 20, 4);
        AbstractC0307g.m702d(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 20, 4)");
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX INFO: renamed from: getAccessFlags-pVg5ArA, reason: not valid java name */
    public final int m2695getAccessFlagspVg5ArA() {
        int i__offset = __offset(10);
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
    public final int m2696getDexIdpVg5ArA() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f2573bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public final ByteBuffer getFieldsAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(20, 4);
        AbstractC0307g.m702d(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(20, 4)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getFieldsLength() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX INFO: renamed from: getId-pVg5ArA, reason: not valid java name */
    public final int m2697getIdpVg5ArA() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f2573bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public final ByteBuffer getInterfacesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(16, 4);
        AbstractC0307g.m702d(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(16, 4)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getInterfacesLength() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final ByteBuffer getMethodsAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(18, 4);
        AbstractC0307g.m702d(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(18, 4)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getMethodsLength() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final String getSourceFile() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public final ByteBuffer getSourceFileAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(8, 1);
        AbstractC0307g.m702d(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(8, 1)");
        return byteBuffer__vector_as_bytebuffer;
    }

    /* JADX INFO: renamed from: getSuperClass-pVg5ArA, reason: not valid java name */
    public final int m2698getSuperClasspVg5ArA() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return this.f2573bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public final int interfaces(int i2) {
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return 0;
        }
        return this.f2573bb.getInt((i2 * 4) + __vector(i__offset));
    }

    public final ByteBuffer interfacesInByteBuffer(ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 16, 4);
        AbstractC0307g.m702d(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 16, 4)");
        return byteBuffer__vector_in_bytebuffer;
    }

    public final int methods(int i2) {
        int i__offset = __offset(18);
        if (i__offset == 0) {
            return 0;
        }
        return this.f2573bb.getInt((i2 * 4) + __vector(i__offset));
    }

    public final ByteBuffer methodsInByteBuffer(ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 18, 4);
        AbstractC0307g.m702d(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 18, 4)");
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX INFO: renamed from: mutateAccessFlags-WZ4Q5Ns, reason: not valid java name */
    public final boolean m2699mutateAccessFlagsWZ4Q5Ns(int i2) {
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt(i__offset + this.bb_pos, i2);
        return true;
    }

    /* JADX INFO: renamed from: mutateDexId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m2700mutateDexIdWZ4Q5Ns(int i2) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt(i__offset + this.bb_pos, i2);
        return true;
    }

    public final boolean mutateFields(int i2, int i3) {
        int i__offset = __offset(20);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt((i2 * 4) + __vector(i__offset), i3);
        return true;
    }

    /* JADX INFO: renamed from: mutateId-WZ4Q5Ns, reason: not valid java name */
    public final boolean m2701mutateIdWZ4Q5Ns(int i2) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt(i__offset + this.bb_pos, i2);
        return true;
    }

    public final boolean mutateInterfaces(int i2, int i3) {
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt((i2 * 4) + __vector(i__offset), i3);
        return true;
    }

    public final boolean mutateMethods(int i2, int i3) {
        int i__offset = __offset(18);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt((i2 * 4) + __vector(i__offset), i3);
        return true;
    }

    /* JADX INFO: renamed from: mutateSuperClass-WZ4Q5Ns, reason: not valid java name */
    public final boolean m2702mutateSuperClassWZ4Q5Ns(int i2) {
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt(i__offset + this.bb_pos, i2);
        return true;
    }

    public final ByteBuffer sourceFileInByteBuffer(ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 8, 1);
        AbstractC0307g.m702d(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 8, 1)");
        return byteBuffer__vector_in_bytebuffer;
    }
}
