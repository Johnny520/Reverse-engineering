package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueInt, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueInt extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueInt$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addValue(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1922e(0, i2);
        }

        public final int createEncodeValueInt(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(1);
            addValue(c0733b, i2);
            return endEncodeValueInt(c0733b);
        }

        public final int endEncodeValueInt(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final EncodeValueInt getRootAsEncodeValueInt(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsEncodeValueInt(byteBuffer, new EncodeValueInt());
        }

        public final void startEncodeValueInt(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(1);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final EncodeValueInt getRootAsEncodeValueInt(ByteBuffer byteBuffer, EncodeValueInt encodeValueInt) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(encodeValueInt, "obj");
            return encodeValueInt.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final EncodeValueInt __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final int getValue() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f2573bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public final boolean mutateValue(int i2) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt(i__offset + this.bb_pos, i2);
        return true;
    }
}
