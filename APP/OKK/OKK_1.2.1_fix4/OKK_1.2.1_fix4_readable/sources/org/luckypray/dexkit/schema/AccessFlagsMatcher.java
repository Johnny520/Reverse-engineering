package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AccessFlagsMatcher */
/* JADX INFO: loaded from: classes.dex */
public final class AccessFlagsMatcher extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AccessFlagsMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: addFlags-Qn1smSk */
        public final void m2675addFlagsQn1smSk(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1922e(0, i2);
        }

        public final void addMatchType(C0733b c0733b, byte b2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1920c(1, b2);
        }

        /* JADX INFO: renamed from: createAccessFlagsMatcher-OsBMiQA */
        public final int m2676createAccessFlagsMatcherOsBMiQA(C0733b c0733b, int i2, byte b2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(2);
            m2675addFlagsQn1smSk(c0733b, i2);
            addMatchType(c0733b, b2);
            return endAccessFlagsMatcher(c0733b);
        }

        public final int endAccessFlagsMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final AccessFlagsMatcher getRootAsAccessFlagsMatcher(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsAccessFlagsMatcher(byteBuffer, new AccessFlagsMatcher());
        }

        public final void startAccessFlagsMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(2);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final AccessFlagsMatcher getRootAsAccessFlagsMatcher(ByteBuffer byteBuffer, AccessFlagsMatcher accessFlagsMatcher) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(accessFlagsMatcher, "obj");
            return accessFlagsMatcher.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final AccessFlagsMatcher __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    /* JADX INFO: renamed from: getFlags-pVg5ArA */
    public final int m2673getFlagspVg5ArA() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f2573bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public final byte getMatchType() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f2573bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: mutateFlags-WZ4Q5Ns */
    public final boolean m2674mutateFlagsWZ4Q5Ns(int i2) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt(i__offset + this.bb_pos, i2);
        return true;
    }

    public final boolean mutateMatchType(byte b2) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.put(i__offset + this.bb_pos, b2);
        return true;
    }
}
