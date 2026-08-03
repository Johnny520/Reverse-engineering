package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-OpCodesMatcher */
/* JADX INFO: loaded from: classes.dex */
public final class OpCodesMatcher extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-OpCodesMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addMatchType(C0733b c0733b, byte b2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1920c(1, b2);
        }

        public final void addOpCodeCount(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(2, i2);
        }

        public final void addOpCodes(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(0, i2);
        }

        public final int createOpCodesMatcher(C0733b c0733b, int i2, byte b2, int i3) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(3);
            addOpCodeCount(c0733b, i3);
            addOpCodes(c0733b, i2);
            addMatchType(c0733b, b2);
            return endOpCodesMatcher(c0733b);
        }

        public final int createOpCodesVector(C0733b c0733b, short[] sArr) {
            AbstractC0307g.m703e(c0733b, "builder");
            AbstractC0307g.m703e(sArr, "data");
            c0733b.m1937t(2, sArr.length, 2);
            int length = sArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0733b.m1930m();
                }
                c0733b.m1926i(sArr[length]);
            }
        }

        public final int endOpCodesMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final OpCodesMatcher getRootAsOpCodesMatcher(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsOpCodesMatcher(byteBuffer, new OpCodesMatcher());
        }

        public final void startOpCodesMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(3);
        }

        public final void startOpCodesVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(2, i2, 2);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final OpCodesMatcher getRootAsOpCodesMatcher(ByteBuffer byteBuffer, OpCodesMatcher opCodesMatcher) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(opCodesMatcher, "obj");
            return opCodesMatcher.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final OpCodesMatcher __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final byte getMatchType() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f2573bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public final IntRange getOpCodeCount() {
        return opCodeCount(new IntRange());
    }

    public final ByteBuffer getOpCodesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(4, 2);
        AbstractC0307g.m702d(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(4, 2)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getOpCodesLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final boolean mutateMatchType(byte b2) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.put(i__offset + this.bb_pos, b2);
        return true;
    }

    public final boolean mutateOpCodes(int i2, short s2) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putShort((i2 * 2) + __vector(i__offset), s2);
        return true;
    }

    public final IntRange opCodeCount(IntRange intRange) {
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

    public final short opCodes(int i2) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return (short) 0;
        }
        return this.f2573bb.getShort((i2 * 2) + __vector(i__offset));
    }

    public final ByteBuffer opCodesInByteBuffer(ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 4, 2);
        AbstractC0307g.m702d(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 4, 2)");
        return byteBuffer__vector_in_bytebuffer;
    }
}
