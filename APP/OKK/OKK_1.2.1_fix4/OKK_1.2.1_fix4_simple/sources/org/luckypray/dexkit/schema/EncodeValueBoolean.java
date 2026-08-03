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
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueBoolean$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addValue(C0733b r2, boolean r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1918a(0, r3);
        }

        public final int createEncodeValueBoolean(C0733b r2, boolean r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(1);
            addValue(r2, r3);
            return endEncodeValueBoolean(r2);
        }

        public final int endEncodeValueBoolean(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final EncodeValueBoolean getRootAsEncodeValueBoolean(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsEncodeValueBoolean(r2, new EncodeValueBoolean());
        }

        public final void startEncodeValueBoolean(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(1);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final EncodeValueBoolean getRootAsEncodeValueBoolean(ByteBuffer r3, EncodeValueBoolean r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public EncodeValueBoolean() {
    }

    public final EncodeValueBoolean __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final boolean getValue() {
        int r02 = __offset(4);
        if (r02 != 0) goto L5;
        return false;
    L5:
        if (((byte) 0) == this.f2573bb.get(r02 + this.bb_pos)) goto L9;
        return true;
    L9:
        return false;
    }

    public final boolean mutateValue(boolean r4) {
        int r02 = __offset(4);
        if (r02 == 0) goto L5;
        this.f2573bb.put(r02 + this.bb_pos, r4 ? 1 : 0);
        return true;
    L5:
        return false;
    }
}
