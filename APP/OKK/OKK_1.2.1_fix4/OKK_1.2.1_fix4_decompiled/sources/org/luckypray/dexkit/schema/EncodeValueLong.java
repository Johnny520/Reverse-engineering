package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueLong, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueLong extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueLong$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addValue(C0733b c0733b, long j2) {
            AbstractC0307g.m703e(c0733b, "builder");
            if (j2 != 0) {
                c0733b.m1923f(j2);
                c0733b.m1935r(0);
            }
        }

        public final int createEncodeValueLong(C0733b c0733b, long j2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(1);
            addValue(c0733b, j2);
            return endEncodeValueLong(c0733b);
        }

        public final int endEncodeValueLong(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final EncodeValueLong getRootAsEncodeValueLong(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsEncodeValueLong(byteBuffer, new EncodeValueLong());
        }

        public final void startEncodeValueLong(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(1);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final EncodeValueLong getRootAsEncodeValueLong(ByteBuffer byteBuffer, EncodeValueLong encodeValueLong) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(encodeValueLong, "obj");
            return encodeValueLong.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final EncodeValueLong __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final long getValue() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f2573bb.getLong(i__offset + this.bb_pos);
        }
        return 0L;
    }

    public final boolean mutateValue(long j2) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putLong(i__offset + this.bb_pos, j2);
        return true;
    }
}
