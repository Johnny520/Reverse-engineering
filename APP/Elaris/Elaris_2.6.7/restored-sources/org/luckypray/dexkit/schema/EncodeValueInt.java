package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0000a;
import p000.AbstractC0367od;
import p000.AbstractC0431r2;
import p000.C0038c5;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueInt, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueInt extends AbstractC0367od {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EncodeValueInt __assign(int i, ByteBuffer byteBuffer) {
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
    public final int getValue() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f662bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateValue(int i) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f662bb.putInt(i__offset + this.bb_pos, i);
        return true;
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueInt$Companion */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-EncodeValueInt.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addValue(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m99e(0, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int createEncodeValueInt(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m112r(1);
            addValue(c0038c5, i);
            return endEncodeValueInt(c0038c5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int endEncodeValueInt(C0038c5 c0038c5) {
            c0038c5.getClass();
            return c0038c5.m106l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final EncodeValueInt getRootAsEncodeValueInt(ByteBuffer byteBuffer, EncodeValueInt encodeValueInt) {
            byteBuffer.getClass();
            encodeValueInt.getClass();
            return encodeValueInt.__assign(byteBuffer.position() + AbstractC0000a.m0a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startEncodeValueInt(C0038c5 c0038c5) {
            c0038c5.getClass();
            c0038c5.m112r(1);
        }

        private Companion() {
        }

        public final EncodeValueInt getRootAsEncodeValueInt(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsEncodeValueInt(byteBuffer, new EncodeValueInt());
        }

        public final void validateVersion() {
        }
    }
}
