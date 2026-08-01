package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0000a;
import p000.AbstractC0367od;
import p000.AbstractC0431r2;
import p000.C0038c5;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-IntRange, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class IntRange extends AbstractC0367od {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IntRange __assign(int i, ByteBuffer byteBuffer) {
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
    public final int getMax() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f662bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getMin() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f662bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateMax(int i) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f662bb.putInt(i__offset + this.bb_pos, i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateMin(int i) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f662bb.putInt(i__offset + this.bb_pos, i);
        return true;
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-IntRange$Companion */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-IntRange.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addMax(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m99e(1, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addMin(C0038c5 c0038c5, int i) {
            c0038c5.getClass();
            c0038c5.m99e(0, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int createIntRange(C0038c5 c0038c5, int i, int i2) {
            c0038c5.getClass();
            c0038c5.m112r(2);
            addMax(c0038c5, i2);
            addMin(c0038c5, i);
            return endIntRange(c0038c5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int endIntRange(C0038c5 c0038c5) {
            c0038c5.getClass();
            return c0038c5.m106l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final IntRange getRootAsIntRange(ByteBuffer byteBuffer, IntRange intRange) {
            byteBuffer.getClass();
            intRange.getClass();
            return intRange.__assign(byteBuffer.position() + AbstractC0000a.m0a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startIntRange(C0038c5 c0038c5) {
            c0038c5.getClass();
            c0038c5.m112r(2);
        }

        private Companion() {
        }

        public final IntRange getRootAsIntRange(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsIntRange(byteBuffer, new IntRange());
        }

        public final void validateVersion() {
        }
    }
}
