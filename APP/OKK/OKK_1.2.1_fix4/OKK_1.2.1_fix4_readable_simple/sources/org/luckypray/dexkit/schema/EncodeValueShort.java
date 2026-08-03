package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueShort */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueShort extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueShort$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addValue(C0733b r2, short r3) {
            AbstractC0307g.m703e(r2, "builder");
            if (r3 == 0) goto L6;
            r2.m1926i(r3);
            r2.m1935r(0);
            return;
        }

        public final int createEncodeValueShort(C0733b r2, short r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(1);
            addValue(r2, r3);
            return endEncodeValueShort(r2);
        }

        public final int endEncodeValueShort(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final EncodeValueShort getRootAsEncodeValueShort(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsEncodeValueShort(r2, new EncodeValueShort());
        }

        public final void startEncodeValueShort(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(1);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final EncodeValueShort getRootAsEncodeValueShort(ByteBuffer r3, EncodeValueShort r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public EncodeValueShort() {
    }

    public final EncodeValueShort __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final short getValue() {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.getShort(r02 + this.bb_pos);
    }

    public final boolean mutateValue(short r4) {
        int r02 = __offset(4);
        if (r02 == 0) goto L5;
        this.f2573bb.putShort(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }
}
