package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueFloat */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueFloat extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueFloat$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addValue(C0733b r5, float r6) {
            AbstractC0307g.m703e(r5, "builder");
            if (r6 == 0.0d) goto L6;
            r5.m1933p(4, 0);
            ByteBuffer r2 = r5.f2558a;
            int r3 = r5.f2559b - 4;
            r5.f2559b = r3;
            r2.putFloat(r3, r6);
            r5.m1935r(0);
            return;
        }

        public final int createEncodeValueFloat(C0733b r2, float r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(1);
            addValue(r2, r3);
            return endEncodeValueFloat(r2);
        }

        public final int endEncodeValueFloat(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final EncodeValueFloat getRootAsEncodeValueFloat(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsEncodeValueFloat(r2, new EncodeValueFloat());
        }

        public final void startEncodeValueFloat(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(1);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final EncodeValueFloat getRootAsEncodeValueFloat(ByteBuffer r3, EncodeValueFloat r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public EncodeValueFloat() {
    }

    public final EncodeValueFloat __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final float getValue() {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return 0.0f;
    L7:
        return this.f2573bb.getFloat(r02 + this.bb_pos);
    }

    public final boolean mutateValue(float r4) {
        int r02 = __offset(4);
        if (r02 == 0) goto L5;
        this.f2573bb.putFloat(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }
}
