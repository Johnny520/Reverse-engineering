package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FindField */
/* JADX INFO: loaded from: classes.dex */
public final class FindField extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FindField$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addExcludePackages(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(1, i2);
        }

        public final void addFindFirst(C0733b c0733b, boolean z2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1918a(5, z2);
        }

        public final void addIgnorePackagesCase(C0733b c0733b, boolean z2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1918a(2, z2);
        }

        public final void addInClasses(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(3, i2);
        }

        public final void addInFields(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(4, i2);
        }

        public final void addMatcher(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(6, i2);
        }

        public final void addSearchPackages(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(0, i2);
        }

        public final int createExcludePackagesVector(C0733b c0733b, int[] iArr) {
            AbstractC0307g.m703e(c0733b, "builder");
            AbstractC0307g.m703e(iArr, "data");
            c0733b.m1937t(4, iArr.length, 4);
            int length = iArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0733b.m1930m();
                }
                c0733b.m1924g(iArr[length]);
            }
        }

        public final int createFindField(C0733b c0733b, int i2, int i3, boolean z2, int i4, int i5, boolean z3, int i6) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(7);
            addMatcher(c0733b, i6);
            addInFields(c0733b, i5);
            addInClasses(c0733b, i4);
            addExcludePackages(c0733b, i3);
            addSearchPackages(c0733b, i2);
            addFindFirst(c0733b, z3);
            addIgnorePackagesCase(c0733b, z2);
            return endFindField(c0733b);
        }

        public final int createInClassesVector(C0733b c0733b, long[] jArr) {
            AbstractC0307g.m703e(c0733b, "builder");
            AbstractC0307g.m703e(jArr, "data");
            c0733b.m1937t(8, jArr.length, 8);
            int length = jArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0733b.m1930m();
                }
                c0733b.m1923f(jArr[length]);
            }
        }

        public final int createInFieldsVector(C0733b c0733b, long[] jArr) {
            AbstractC0307g.m703e(c0733b, "builder");
            AbstractC0307g.m703e(jArr, "data");
            c0733b.m1937t(8, jArr.length, 8);
            int length = jArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0733b.m1930m();
                }
                c0733b.m1923f(jArr[length]);
            }
        }

        public final int createSearchPackagesVector(C0733b c0733b, int[] iArr) {
            AbstractC0307g.m703e(c0733b, "builder");
            AbstractC0307g.m703e(iArr, "data");
            c0733b.m1937t(4, iArr.length, 4);
            int length = iArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0733b.m1930m();
                }
                c0733b.m1924g(iArr[length]);
            }
        }

        public final int endFindField(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final FindField getRootAsFindField(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsFindField(byteBuffer, new FindField());
        }

        public final void startExcludePackagesVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(4, i2, 4);
        }

        public final void startFindField(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(7);
        }

        public final void startInClassesVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(8, i2, 8);
        }

        public final void startInFieldsVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(8, i2, 8);
        }

        public final void startSearchPackagesVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(4, i2, 4);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final FindField getRootAsFindField(ByteBuffer byteBuffer, FindField findField) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(findField, "obj");
            return findField.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final FindField __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final String excludePackages(int i2) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        return __string((i2 * 4) + __vector(i__offset));
    }

    public final int getExcludePackagesLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final boolean getFindFirst() {
        int i__offset = __offset(14);
        return (i__offset == 0 || ((byte) 0) == this.f2573bb.get(i__offset + this.bb_pos)) ? false : true;
    }

    public final boolean getIgnorePackagesCase() {
        int i__offset = __offset(8);
        return (i__offset == 0 || ((byte) 0) == this.f2573bb.get(i__offset + this.bb_pos)) ? false : true;
    }

    public final ByteBuffer getInClassesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(10, 8);
        AbstractC0307g.m702d(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(10, 8)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getInClassesLength() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final ByteBuffer getInFieldsAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(12, 8);
        AbstractC0307g.m702d(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(12, 8)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getInFieldsLength() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final FieldMatcher getMatcher() {
        return matcher(new FieldMatcher());
    }

    public final int getSearchPackagesLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final long inClasses(int i2) {
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return 0L;
        }
        return this.f2573bb.getLong((i2 * 8) + __vector(i__offset));
    }

    public final ByteBuffer inClassesInByteBuffer(ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 10, 8);
        AbstractC0307g.m702d(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 10, 8)");
        return byteBuffer__vector_in_bytebuffer;
    }

    public final long inFields(int i2) {
        int i__offset = __offset(12);
        if (i__offset == 0) {
            return 0L;
        }
        return this.f2573bb.getLong((i2 * 8) + __vector(i__offset));
    }

    public final ByteBuffer inFieldsInByteBuffer(ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 12, 8);
        AbstractC0307g.m702d(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 12, 8)");
        return byteBuffer__vector_in_bytebuffer;
    }

    public final FieldMatcher matcher(FieldMatcher fieldMatcher) {
        AbstractC0307g.m703e(fieldMatcher, "obj");
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return fieldMatcher.__assign(i__indirect, byteBuffer);
    }

    public final boolean mutateFindFirst(boolean z2) {
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.put(i__offset + this.bb_pos, z2 ? (byte) 1 : (byte) 0);
        return true;
    }

    public final boolean mutateIgnorePackagesCase(boolean z2) {
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.put(i__offset + this.bb_pos, z2 ? (byte) 1 : (byte) 0);
        return true;
    }

    public final boolean mutateInClasses(int i2, long j2) {
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putLong((i2 * 8) + __vector(i__offset), j2);
        return true;
    }

    public final boolean mutateInFields(int i2, long j2) {
        int i__offset = __offset(12);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putLong((i2 * 8) + __vector(i__offset), j2);
        return true;
    }

    public final String searchPackages(int i2) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return null;
        }
        return __string((i2 * 4) + __vector(i__offset));
    }
}
