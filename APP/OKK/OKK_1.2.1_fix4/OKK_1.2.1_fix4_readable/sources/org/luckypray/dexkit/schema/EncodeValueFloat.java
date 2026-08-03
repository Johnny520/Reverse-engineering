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
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueFloat$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addValue(C0733b c0733b, float f2) {
            AbstractC0307g.m703e(c0733b, "builder");
            if (f2 != 0.0d) {
                c0733b.m1933p(4, 0);
                ByteBuffer byteBuffer = c0733b.f2558a;
                int i2 = c0733b.f2559b - 4;
                c0733b.f2559b = i2;
                byteBuffer.putFloat(i2, f2);
                c0733b.m1935r(0);
            }
        }

        public final int createEncodeValueFloat(C0733b c0733b, float f2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(1);
            addValue(c0733b, f2);
            return endEncodeValueFloat(c0733b);
        }

        public final int endEncodeValueFloat(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final EncodeValueFloat getRootAsEncodeValueFloat(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsEncodeValueFloat(byteBuffer, new EncodeValueFloat());
        }

        public final void startEncodeValueFloat(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(1);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final EncodeValueFloat getRootAsEncodeValueFloat(ByteBuffer byteBuffer, EncodeValueFloat encodeValueFloat) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(encodeValueFloat, "obj");
            return encodeValueFloat.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final EncodeValueFloat __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final float getValue() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f2573bb.getFloat(i__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public final boolean mutateValue(float f2) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putFloat(i__offset + this.bb_pos, f2);
        return true;
    }
}
