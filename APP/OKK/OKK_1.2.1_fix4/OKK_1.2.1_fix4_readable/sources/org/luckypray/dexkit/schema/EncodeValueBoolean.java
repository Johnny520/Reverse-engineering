package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueBoolean */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueBoolean extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueBoolean$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addValue(C0733b c0733b, boolean z2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1918a(0, z2);
        }

        public final int createEncodeValueBoolean(C0733b c0733b, boolean z2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(1);
            addValue(c0733b, z2);
            return endEncodeValueBoolean(c0733b);
        }

        public final int endEncodeValueBoolean(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final EncodeValueBoolean getRootAsEncodeValueBoolean(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsEncodeValueBoolean(byteBuffer, new EncodeValueBoolean());
        }

        public final void startEncodeValueBoolean(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(1);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final EncodeValueBoolean getRootAsEncodeValueBoolean(ByteBuffer byteBuffer, EncodeValueBoolean encodeValueBoolean) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(encodeValueBoolean, "obj");
            return encodeValueBoolean.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final EncodeValueBoolean __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final boolean getValue() {
        int i__offset = __offset(4);
        return (i__offset == 0 || ((byte) 0) == this.f2573bb.get(i__offset + this.bb_pos)) ? false : true;
    }

    public final boolean mutateValue(boolean z2) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.put(i__offset + this.bb_pos, z2 ? (byte) 1 : (byte) 0);
        return true;
    }
}
