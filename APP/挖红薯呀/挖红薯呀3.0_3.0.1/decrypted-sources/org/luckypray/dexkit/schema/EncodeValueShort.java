package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0619pl;
import p000.AbstractC0748t1;
import p000.C0938xt;
import p000.c61;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueShort, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueShort extends c61 {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EncodeValueShort __assign(int i, ByteBuffer byteBuffer) {
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
    public final short getValue() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f715bb.getShort(i__offset + this.bb_pos);
        }
        return (short) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateValue(short s) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f715bb.putShort(i__offset + this.bb_pos, s);
        return true;
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueShort$Companion */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-EncodeValueShort.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addValue(C0938xt c0938xt, short s) {
            c0938xt.getClass();
            if (s != 0) {
                c0938xt.m5160i(s);
                c0938xt.m5168q(0);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int createEncodeValueShort(C0938xt c0938xt, short s) {
            c0938xt.getClass();
            c0938xt.m5169r(1);
            addValue(c0938xt, s);
            return endEncodeValueShort(c0938xt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int endEncodeValueShort(C0938xt c0938xt) {
            c0938xt.getClass();
            return c0938xt.m5163l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final EncodeValueShort getRootAsEncodeValueShort(ByteBuffer byteBuffer, EncodeValueShort encodeValueShort) {
            byteBuffer.getClass();
            encodeValueShort.getClass();
            return encodeValueShort.__assign(byteBuffer.position() + AbstractC0748t1.m4148f(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startEncodeValueShort(C0938xt c0938xt) {
            c0938xt.getClass();
            c0938xt.m5169r(1);
        }

        private Companion() {
        }

        public final EncodeValueShort getRootAsEncodeValueShort(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsEncodeValueShort(byteBuffer, new EncodeValueShort());
        }

        public final void validateVersion() {
        }
    }
}
