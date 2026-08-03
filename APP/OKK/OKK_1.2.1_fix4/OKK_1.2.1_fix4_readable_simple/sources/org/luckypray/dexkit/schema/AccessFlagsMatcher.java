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
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AccessFlagsMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: addFlags-Qn1smSk */
        public final void m2675addFlagsQn1smSk(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1922e(0, r3);
        }

        public final void addMatchType(C0733b r2, byte r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1920c(1, r3);
        }

        /* JADX INFO: renamed from: createAccessFlagsMatcher-OsBMiQA */
        public final int m2676createAccessFlagsMatcherOsBMiQA(C0733b r2, int r3, byte r4) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(2);
            m2675addFlagsQn1smSk(r2, r3);
            addMatchType(r2, r4);
            return endAccessFlagsMatcher(r2);
        }

        public final int endAccessFlagsMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final AccessFlagsMatcher getRootAsAccessFlagsMatcher(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsAccessFlagsMatcher(r2, new AccessFlagsMatcher());
        }

        public final void startAccessFlagsMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(2);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final AccessFlagsMatcher getRootAsAccessFlagsMatcher(ByteBuffer r3, AccessFlagsMatcher r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public AccessFlagsMatcher() {
    }

    public final AccessFlagsMatcher __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    /* JADX INFO: renamed from: getFlags-pVg5ArA */
    public final int m2673getFlagspVg5ArA() {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.getInt(r02 + this.bb_pos);
    }

    public final byte getMatchType() {
        int r02 = __offset(6);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.get(r02 + this.bb_pos);
    }

    /* JADX INFO: renamed from: mutateFlags-WZ4Q5Ns */
    public final boolean m2674mutateFlagsWZ4Q5Ns(int r4) {
        int r02 = __offset(4);
        if (r02 == 0) goto L5;
        this.f2573bb.putInt(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    public final boolean mutateMatchType(byte r4) {
        int r02 = __offset(6);
        if (r02 == 0) goto L5;
        this.f2573bb.put(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }
}
