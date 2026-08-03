package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldsMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class FieldsMatcher extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FieldsMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addFieldCount(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(2, i2);
        }

        public final void addFields(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(0, i2);
        }

        public final void addMatchType(C0733b c0733b, byte b2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1920c(1, b2);
        }

        public final int createFieldsMatcher(C0733b c0733b, int i2, byte b2, int i3) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(3);
            addFieldCount(c0733b, i3);
            addFields(c0733b, i2);
            addMatchType(c0733b, b2);
            return endFieldsMatcher(c0733b);
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
                c0733b.m1924g(iArr[length]);
            }
        }

        public final int endFieldsMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final FieldsMatcher getRootAsFieldsMatcher(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsFieldsMatcher(byteBuffer, new FieldsMatcher());
        }

        public final void startFieldsMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(3);
        }

        public final void startFieldsVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(4, i2, 4);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final FieldsMatcher getRootAsFieldsMatcher(ByteBuffer byteBuffer, FieldsMatcher fieldsMatcher) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(fieldsMatcher, "obj");
            return fieldsMatcher.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final FieldsMatcher __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final IntRange fieldCount(IntRange intRange) {
        AbstractC0307g.m703e(intRange, "obj");
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return intRange.__assign(i__indirect, byteBuffer);
    }

    public final FieldMatcher fields(int i2) {
        return fields(new FieldMatcher(), i2);
    }

    public final IntRange getFieldCount() {
        return fieldCount(new IntRange());
    }

    public final int getFieldsLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final byte getMatchType() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f2573bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public final boolean mutateMatchType(byte b2) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.put(i__offset + this.bb_pos, b2);
        return true;
    }

    public final FieldMatcher fields(FieldMatcher fieldMatcher, int i2) {
        AbstractC0307g.m703e(fieldMatcher, "obj");
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i2 * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return fieldMatcher.__assign(i__indirect, byteBuffer);
    }
}
