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
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-OpCodesMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addMatchType(C0733b r2, byte r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1920c(1, r3);
        }

        public final void addOpCodeCount(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(2, r3);
        }

        public final void addOpCodes(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(0, r3);
        }

        public final int createOpCodesMatcher(C0733b r2, int r3, byte r4, int r5) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(3);
            addOpCodeCount(r2, r5);
            addOpCodes(r2, r3);
            addMatchType(r2, r4);
            return endOpCodesMatcher(r2);
        }

        public final int createOpCodesVector(C0733b r3, short[] r4) {
            AbstractC0307g.m703e(r3, "builder");
            AbstractC0307g.m703e(r4, "data");
            r3.m1937t(2, r4.length, 2);
            int r02 = r4.length;
        L3:
            r02 = r02 - 1;
            if ((-1) >= r02) goto L7;
            r3.m1926i(r4[r02]);
            goto L3
        L7:
            return r3.m1930m();
        }

        public final int endOpCodesMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final OpCodesMatcher getRootAsOpCodesMatcher(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsOpCodesMatcher(r2, new OpCodesMatcher());
        }

        public final void startOpCodesMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(3);
        }

        public final void startOpCodesVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(2, r3, 2);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final OpCodesMatcher getRootAsOpCodesMatcher(ByteBuffer r3, OpCodesMatcher r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public OpCodesMatcher() {
    }

    public final OpCodesMatcher __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final byte getMatchType() {
        int r02 = __offset(6);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.get(r02 + this.bb_pos);
    }

    public final IntRange getOpCodeCount() {
        return opCodeCount(new IntRange());
    }

    public final ByteBuffer getOpCodesAsByteBuffer() {
        ByteBuffer r02 = __vector_as_bytebuffer(4, 2);
        AbstractC0307g.m702d(r02, "__vector_as_bytebuffer(4, 2)");
        return r02;
    }

    public final int getOpCodesLength() {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final boolean mutateMatchType(byte r4) {
        int r02 = __offset(6);
        if (r02 == 0) goto L5;
        this.f2573bb.put(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    public final boolean mutateOpCodes(int r3, short r4) {
        int r02 = __offset(4);
        if (r02 == 0) goto L5;
        int r32 = r3 * 2;
        this.f2573bb.putShort(r32 + __vector(r02), r4);
        return true;
    L5:
        return false;
    }

    public final IntRange opCodeCount(IntRange r4) {
        AbstractC0307g.m703e(r4, "obj");
        int r02 = __offset(8);
        if (r02 == 0) goto L5;
        int r03 = __indirect(r02 + this.bb_pos);
        ByteBuffer r1 = this.f2573bb;
        AbstractC0307g.m702d(r1, "bb");
        return r4.__assign(r03, r1);
    L5:
        return null;
    }

    public final short opCodes(int r3) {
        int r02 = __offset(4);
        if (r02 == 0) goto L5;
        int r32 = r3 * 2;
        return this.f2573bb.getShort(r32 + __vector(r02));
    L5:
        return 0;
    }

    public final ByteBuffer opCodesInByteBuffer(ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        ByteBuffer r32 = __vector_in_bytebuffer(r3, 4, 2);
        AbstractC0307g.m702d(r32, "__vector_in_bytebuffer(_bb, 4, 2)");
        return r32;
    }
}
