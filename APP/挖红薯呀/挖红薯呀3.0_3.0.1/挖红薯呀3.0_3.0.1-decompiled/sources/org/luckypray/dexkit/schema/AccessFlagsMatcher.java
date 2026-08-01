package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0619pl;
import p000.AbstractC0748t1;
import p000.C0938xt;
import p000.c61;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AccessFlagsMatcher, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class AccessFlagsMatcher extends c61 {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AccessFlagsMatcher __assign(int i, ByteBuffer byteBuffer) {
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
    /* JADX INFO: renamed from: getFlags-pVg5ArA, reason: not valid java name */
    public final int m5665getFlagspVg5ArA() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f715bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte getMatchType() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f715bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: mutateFlags-WZ4Q5Ns, reason: not valid java name */
    public final boolean m5666mutateFlagsWZ4Q5Ns(int i) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f715bb.putInt(i__offset + this.bb_pos, i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateMatchType(byte b) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f715bb.put(i__offset + this.bb_pos, b);
        return true;
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AccessFlagsMatcher$Companion */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-AccessFlagsMatcher.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: addFlags-Qn1smSk, reason: not valid java name */
        public final void m5667addFlagsQn1smSk(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5156e(0, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addMatchType(C0938xt c0938xt, byte b) {
            c0938xt.getClass();
            c0938xt.m5154c(1, b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: createAccessFlagsMatcher-OsBMiQA, reason: not valid java name */
        public final int m5668createAccessFlagsMatcherOsBMiQA(C0938xt c0938xt, int i, byte b) {
            c0938xt.getClass();
            c0938xt.m5169r(2);
            m5667addFlagsQn1smSk(c0938xt, i);
            addMatchType(c0938xt, b);
            return endAccessFlagsMatcher(c0938xt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int endAccessFlagsMatcher(C0938xt c0938xt) {
            c0938xt.getClass();
            return c0938xt.m5163l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AccessFlagsMatcher getRootAsAccessFlagsMatcher(ByteBuffer byteBuffer, AccessFlagsMatcher accessFlagsMatcher) {
            byteBuffer.getClass();
            accessFlagsMatcher.getClass();
            return accessFlagsMatcher.__assign(byteBuffer.position() + AbstractC0748t1.m4148f(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startAccessFlagsMatcher(C0938xt c0938xt) {
            c0938xt.getClass();
            c0938xt.m5169r(2);
        }

        private Companion() {
        }

        public final AccessFlagsMatcher getRootAsAccessFlagsMatcher(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsAccessFlagsMatcher(byteBuffer, new AccessFlagsMatcher());
        }

        public final void validateVersion() {
        }
    }
}
