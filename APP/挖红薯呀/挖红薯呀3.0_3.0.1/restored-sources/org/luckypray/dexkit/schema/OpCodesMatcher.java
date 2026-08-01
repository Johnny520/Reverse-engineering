package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0619pl;
import p000.AbstractC0748t1;
import p000.C0938xt;
import p000.c61;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-OpCodesMatcher, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class OpCodesMatcher extends c61 {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final OpCodesMatcher __assign(int i, ByteBuffer byteBuffer) {
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
    public final byte getMatchType() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f715bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IntRange getOpCodeCount() {
        return opCodeCount(new IntRange());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer getOpCodesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(4, 2);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getOpCodesLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateMatchType(byte b) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f715bb.put(i__offset + this.bb_pos, b);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateOpCodes(int i, short s) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f715bb.putShort((i * 2) + __vector(i__offset), s);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IntRange opCodeCount(IntRange intRange) {
        intRange.getClass();
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f715bb;
        byteBuffer.getClass();
        return intRange.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final short opCodes(int i) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return (short) 0;
        }
        return this.f715bb.getShort((i * 2) + __vector(i__offset));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer opCodesInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 4, 2);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-OpCodesMatcher$Companion */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-OpCodesMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addMatchType(C0938xt c0938xt, byte b) {
            c0938xt.getClass();
            c0938xt.m5154c(1, b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addOpCodeCount(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5159h(2, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addOpCodes(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5159h(0, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int createOpCodesMatcher(C0938xt c0938xt, int i, byte b, int i2) {
            c0938xt.getClass();
            c0938xt.m5169r(3);
            addOpCodeCount(c0938xt, i2);
            addOpCodes(c0938xt, i);
            addMatchType(c0938xt, b);
            return endOpCodesMatcher(c0938xt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000e */
        public final int createOpCodesVector(C0938xt c0938xt, short[] sArr) {
            c0938xt.getClass();
            sArr.getClass();
            c0938xt.m5170s(2, sArr.length, 2);
            int length = sArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0938xt.m5164m();
                }
                c0938xt.m5160i(sArr[length]);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int endOpCodesMatcher(C0938xt c0938xt) {
            c0938xt.getClass();
            return c0938xt.m5163l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final OpCodesMatcher getRootAsOpCodesMatcher(ByteBuffer byteBuffer, OpCodesMatcher opCodesMatcher) {
            byteBuffer.getClass();
            opCodesMatcher.getClass();
            return opCodesMatcher.__assign(byteBuffer.position() + AbstractC0748t1.m4148f(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startOpCodesMatcher(C0938xt c0938xt) {
            c0938xt.getClass();
            c0938xt.m5169r(3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startOpCodesVector(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5170s(2, i, 2);
        }

        private Companion() {
        }

        public final OpCodesMatcher getRootAsOpCodesMatcher(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsOpCodesMatcher(byteBuffer, new OpCodesMatcher());
        }

        public final void validateVersion() {
        }
    }
}
