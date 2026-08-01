package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0619pl;
import p000.AbstractC0748t1;
import p000.C0938xt;
import p000.c61;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueFloat, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueFloat extends c61 {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EncodeValueFloat __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float getValue() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f715bb.getFloat(i__offset + this.bb_pos);
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateValue(float f) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f715bb.putFloat(i__offset + this.bb_pos, f);
        return true;
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueFloat$Companion */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-EncodeValueFloat.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addValue(C0938xt c0938xt, float f) {
            c0938xt.getClass();
            if (f != 0.0d) {
                c0938xt.m5167p(4, 0);
                ByteBuffer byteBuffer = c0938xt.f7410a;
                int i = c0938xt.f7411b - 4;
                c0938xt.f7411b = i;
                byteBuffer.putFloat(i, f);
                c0938xt.m5168q(0);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int createEncodeValueFloat(C0938xt c0938xt, float f) {
            c0938xt.getClass();
            c0938xt.m5169r(1);
            addValue(c0938xt, f);
            return endEncodeValueFloat(c0938xt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int endEncodeValueFloat(C0938xt c0938xt) {
            c0938xt.getClass();
            return c0938xt.m5163l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final EncodeValueFloat getRootAsEncodeValueFloat(ByteBuffer byteBuffer, EncodeValueFloat encodeValueFloat) {
            byteBuffer.getClass();
            encodeValueFloat.getClass();
            return encodeValueFloat.__assign(byteBuffer.position() + AbstractC0748t1.m4148f(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startEncodeValueFloat(C0938xt c0938xt) {
            c0938xt.getClass();
            c0938xt.m5169r(1);
        }

        private Companion() {
        }

        public final EncodeValueFloat getRootAsEncodeValueFloat(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsEncodeValueFloat(byteBuffer, new EncodeValueFloat());
        }

        public final void validateVersion() {
        }
    }
}
