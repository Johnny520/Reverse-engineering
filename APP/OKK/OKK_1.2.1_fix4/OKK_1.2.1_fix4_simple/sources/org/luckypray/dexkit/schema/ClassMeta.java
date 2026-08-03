package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMeta */
/* JADX INFO: loaded from: classes.dex */
public final class ClassMeta extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ClassMeta$Companion */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: addAccessFlags-Qn1smSk */
        public final void m2703addAccessFlagsQn1smSk(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1922e(3, r3);
        }

        public final void addDexDescriptor(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(4, r3);
        }

        /* JADX INFO: renamed from: addDexId-Qn1smSk */
        public final void m2704addDexIdQn1smSk(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1922e(1, r3);
        }

        public final void addFields(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(8, r3);
        }

        /* JADX INFO: renamed from: addId-Qn1smSk */
        public final void m2705addIdQn1smSk(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1922e(0, r3);
        }

        public final void addInterfaces(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(6, r3);
        }

        public final void addMethods(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(7, r3);
        }

        public final void addSourceFile(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(2, r3);
        }

        /* JADX INFO: renamed from: addSuperClass-Qn1smSk */
        public final void m2706addSuperClassQn1smSk(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1922e(5, r3);
        }

        /* JADX INFO: renamed from: createClassMeta-uFWppp4 */
        public final int m2707createClassMetauFWppp4(C0733b r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(9);
            addFields(r2, r11);
            addMethods(r2, r10);
            addInterfaces(r2, r9);
            m2706addSuperClassQn1smSk(r2, r8);
            addDexDescriptor(r2, r7);
            m2703addAccessFlagsQn1smSk(r2, r6);
            addSourceFile(r2, r5);
            m2704addDexIdQn1smSk(r2, r4);
            m2705addIdQn1smSk(r2, r3);
            return endClassMeta(r2);
        }

        public final int createFieldsVector(C0733b r3, int[] r4) {
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

        public final int createInterfacesVector(C0733b r3, int[] r4) {
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

        public final int createMethodsVector(C0733b r3, int[] r4) {
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

        public final int endClassMeta(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final ClassMeta getRootAsClassMeta(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsClassMeta(r2, new ClassMeta());
        }

        public final void startClassMeta(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(9);
        }

        public final void startFieldsVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(4, r3, 4);
        }

        public final void startInterfacesVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(4, r3, 4);
        }

        public final void startMethodsVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(4, r3, 4);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final ClassMeta getRootAsClassMeta(ByteBuffer r3, ClassMeta r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public ClassMeta() {
    }

    public final ClassMeta __assign(int r2, ByteBuffer r3) {
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

    public final int fields(int r3) {
        int r02 = __offset(20);
        if (r02 == 0) goto L5;
        int r32 = r3 * 4;
        return this.f2573bb.getInt(r32 + __vector(r02));
    L5:
        return 0;
    }

    public final ByteBuffer fieldsInByteBuffer(ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        ByteBuffer r32 = __vector_in_bytebuffer(r3, 20, 4);
        AbstractC0307g.m702d(r32, "__vector_in_bytebuffer(_bb, 20, 4)");
        return r32;
    }

    /* JADX INFO: renamed from: getAccessFlags-pVg5ArA */
    public final int m2695getAccessFlagspVg5ArA() {
        int r02 = __offset(10);
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
    public final int m2696getDexIdpVg5ArA() {
        int r02 = __offset(6);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.getInt(r02 + this.bb_pos);
    }

    public final ByteBuffer getFieldsAsByteBuffer() {
        ByteBuffer r02 = __vector_as_bytebuffer(20, 4);
        AbstractC0307g.m702d(r02, "__vector_as_bytebuffer(20, 4)");
        return r02;
    }

    public final int getFieldsLength() {
        int r02 = __offset(20);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    /* JADX INFO: renamed from: getId-pVg5ArA */
    public final int m2697getIdpVg5ArA() {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.getInt(r02 + this.bb_pos);
    }

    public final ByteBuffer getInterfacesAsByteBuffer() {
        ByteBuffer r02 = __vector_as_bytebuffer(16, 4);
        AbstractC0307g.m702d(r02, "__vector_as_bytebuffer(16, 4)");
        return r02;
    }

    public final int getInterfacesLength() {
        int r02 = __offset(16);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final ByteBuffer getMethodsAsByteBuffer() {
        ByteBuffer r02 = __vector_as_bytebuffer(18, 4);
        AbstractC0307g.m702d(r02, "__vector_as_bytebuffer(18, 4)");
        return r02;
    }

    public final int getMethodsLength() {
        int r02 = __offset(18);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final String getSourceFile() {
        int r02 = __offset(8);
        if (r02 != 0) goto L7;
        return null;
    L7:
        return __string(r02 + this.bb_pos);
    }

    public final ByteBuffer getSourceFileAsByteBuffer() {
        ByteBuffer r02 = __vector_as_bytebuffer(8, 1);
        AbstractC0307g.m702d(r02, "__vector_as_bytebuffer(8, 1)");
        return r02;
    }

    /* JADX INFO: renamed from: getSuperClass-pVg5ArA */
    public final int m2698getSuperClasspVg5ArA() {
        int r02 = __offset(14);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.getInt(r02 + this.bb_pos);
    }

    public final int interfaces(int r3) {
        int r02 = __offset(16);
        if (r02 == 0) goto L5;
        int r32 = r3 * 4;
        return this.f2573bb.getInt(r32 + __vector(r02));
    L5:
        return 0;
    }

    public final ByteBuffer interfacesInByteBuffer(ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        ByteBuffer r32 = __vector_in_bytebuffer(r3, 16, 4);
        AbstractC0307g.m702d(r32, "__vector_in_bytebuffer(_bb, 16, 4)");
        return r32;
    }

    public final int methods(int r3) {
        int r02 = __offset(18);
        if (r02 == 0) goto L5;
        int r32 = r3 * 4;
        return this.f2573bb.getInt(r32 + __vector(r02));
    L5:
        return 0;
    }

    public final ByteBuffer methodsInByteBuffer(ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        ByteBuffer r32 = __vector_in_bytebuffer(r3, 18, 4);
        AbstractC0307g.m702d(r32, "__vector_in_bytebuffer(_bb, 18, 4)");
        return r32;
    }

    /* JADX INFO: renamed from: mutateAccessFlags-WZ4Q5Ns */
    public final boolean m2699mutateAccessFlagsWZ4Q5Ns(int r4) {
        int r02 = __offset(10);
        if (r02 == 0) goto L5;
        this.f2573bb.putInt(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: mutateDexId-WZ4Q5Ns */
    public final boolean m2700mutateDexIdWZ4Q5Ns(int r4) {
        int r02 = __offset(6);
        if (r02 == 0) goto L5;
        this.f2573bb.putInt(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    public final boolean mutateFields(int r3, int r4) {
        int r02 = __offset(20);
        if (r02 == 0) goto L5;
        int r32 = r3 * 4;
        this.f2573bb.putInt(r32 + __vector(r02), r4);
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: mutateId-WZ4Q5Ns */
    public final boolean m2701mutateIdWZ4Q5Ns(int r4) {
        int r02 = __offset(4);
        if (r02 == 0) goto L5;
        this.f2573bb.putInt(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    public final boolean mutateInterfaces(int r3, int r4) {
        int r02 = __offset(16);
        if (r02 == 0) goto L5;
        int r32 = r3 * 4;
        this.f2573bb.putInt(r32 + __vector(r02), r4);
        return true;
    L5:
        return false;
    }

    public final boolean mutateMethods(int r3, int r4) {
        int r02 = __offset(18);
        if (r02 == 0) goto L5;
        int r32 = r3 * 4;
        this.f2573bb.putInt(r32 + __vector(r02), r4);
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: mutateSuperClass-WZ4Q5Ns */
    public final boolean m2702mutateSuperClassWZ4Q5Ns(int r4) {
        int r02 = __offset(14);
        if (r02 == 0) goto L5;
        this.f2573bb.putInt(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    public final ByteBuffer sourceFileInByteBuffer(ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        ByteBuffer r32 = __vector_in_bytebuffer(r3, 8, 1);
        AbstractC0307g.m702d(r32, "__vector_in_bytebuffer(_bb, 8, 1)");
        return r32;
    }
}
