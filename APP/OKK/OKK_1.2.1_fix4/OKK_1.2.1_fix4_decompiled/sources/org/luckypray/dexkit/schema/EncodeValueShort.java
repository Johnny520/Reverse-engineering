package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueShort, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueShort extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueShort$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addValue(C0733b c0733b, short s2) {
            AbstractC0307g.m703e(c0733b, "builder");
            if (s2 != 0) {
                c0733b.m1926i(s2);
                c0733b.m1935r(0);
            }
        }

        public final int createEncodeValueShort(C0733b c0733b, short s2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(1);
            addValue(c0733b, s2);
            return endEncodeValueShort(c0733b);
        }

        public final int endEncodeValueShort(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final EncodeValueShort getRootAsEncodeValueShort(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsEncodeValueShort(byteBuffer, new EncodeValueShort());
        }

        public final void startEncodeValueShort(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(1);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final EncodeValueShort getRootAsEncodeValueShort(ByteBuffer byteBuffer, EncodeValueShort encodeValueShort) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(encodeValueShort, "obj");
            return encodeValueShort.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final EncodeValueShort __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final short getValue() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f2573bb.getShort(i__offset + this.bb_pos);
        }
        return (short) 0;
    }

    public final boolean mutateValue(short s2) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putShort(i__offset + this.bb_pos, s2);
        return true;
    }
}
