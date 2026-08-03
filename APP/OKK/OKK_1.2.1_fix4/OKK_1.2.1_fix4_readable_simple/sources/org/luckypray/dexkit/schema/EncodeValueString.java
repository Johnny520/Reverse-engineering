package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueString */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueString extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueString$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addValue(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(0, r3);
        }

        public final int createEncodeValueString(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(1);
            addValue(r2, r3);
            return endEncodeValueString(r2);
        }

        public final int endEncodeValueString(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final EncodeValueString getRootAsEncodeValueString(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsEncodeValueString(r2, new EncodeValueString());
        }

        public final void startEncodeValueString(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(1);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final EncodeValueString getRootAsEncodeValueString(ByteBuffer r3, EncodeValueString r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public EncodeValueString() {
    }

    public final EncodeValueString __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final String getValue() {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return null;
    L7:
        return __string(r02 + this.bb_pos);
    }

    public final ByteBuffer getValueAsByteBuffer() {
        ByteBuffer r02 = __vector_as_bytebuffer(4, 1);
        AbstractC0307g.m702d(r02, "__vector_as_bytebuffer(4, 1)");
        return r02;
    }

    public final ByteBuffer valueInByteBuffer(ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        ByteBuffer r32 = __vector_in_bytebuffer(r3, 4, 1);
        AbstractC0307g.m702d(r32, "__vector_in_bytebuffer(_bb, 4, 1)");
        return r32;
    }
}
