package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0000a;
import p000.AbstractC0367od;
import p000.AbstractC0431r2;
import p000.C0038c5;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueDouble, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueDouble extends AbstractC0367od {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EncodeValueDouble __assign(int i, ByteBuffer byteBuffer) {
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
    public final double getValue() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f662bb.getDouble(i__offset + this.bb_pos);
        }
        return 0.0d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateValue(double d) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f662bb.putDouble(i__offset + this.bb_pos, d);
        return true;
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-EncodeValueDouble$Companion */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-EncodeValueDouble.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addValue(C0038c5 c0038c5, double d) {
            c0038c5.getClass();
            if (d != 0.0d) {
                c0038c5.m110p(8, 0);
                ByteBuffer byteBuffer = c0038c5.f86a;
                int i = c0038c5.f87b - 8;
                c0038c5.f87b = i;
                byteBuffer.putDouble(i, d);
                c0038c5.m111q(0);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int createEncodeValueDouble(C0038c5 c0038c5, double d) {
            c0038c5.getClass();
            c0038c5.m112r(1);
            addValue(c0038c5, d);
            return endEncodeValueDouble(c0038c5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int endEncodeValueDouble(C0038c5 c0038c5) {
            c0038c5.getClass();
            return c0038c5.m106l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final EncodeValueDouble getRootAsEncodeValueDouble(ByteBuffer byteBuffer, EncodeValueDouble encodeValueDouble) {
            byteBuffer.getClass();
            encodeValueDouble.getClass();
            return encodeValueDouble.__assign(byteBuffer.position() + AbstractC0000a.m0a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startEncodeValueDouble(C0038c5 c0038c5) {
            c0038c5.getClass();
            c0038c5.m112r(1);
        }

        private Companion() {
        }

        public final EncodeValueDouble getRootAsEncodeValueDouble(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsEncodeValueDouble(byteBuffer, new EncodeValueDouble());
        }

        public final void validateVersion() {
        }
    }
}
