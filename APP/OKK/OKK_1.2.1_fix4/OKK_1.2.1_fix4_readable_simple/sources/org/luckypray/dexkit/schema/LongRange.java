package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-LongRange */
/* JADX INFO: loaded from: classes.dex */
public final class LongRange extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-LongRange$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addMax(C0733b r3, long r4) {
            AbstractC0307g.m703e(r3, "builder");
            if (r4 == 0) goto L6;
            r3.m1923f(r4);
            r3.m1935r(1);
            return;
        }

        public final void addMin(C0733b r3, long r4) {
            AbstractC0307g.m703e(r3, "builder");
            if (r4 == 0) goto L6;
            r3.m1923f(r4);
            r3.m1935r(0);
            return;
        }

        public final int createLongRange(C0733b r2, long r3, long r5) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(2);
            addMax(r2, r5);
            addMin(r2, r3);
            return endLongRange(r2);
        }

        public final int endLongRange(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final LongRange getRootAsLongRange(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsLongRange(r2, new LongRange());
        }

        public final void startLongRange(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(2);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final LongRange getRootAsLongRange(ByteBuffer r3, LongRange r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public LongRange() {
    }

    public final LongRange __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final long getMax() {
        int r02 = __offset(6);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.getLong(r02 + this.bb_pos);
    }

    public final long getMin() {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.getLong(r02 + this.bb_pos);
    }

    public final boolean mutateMax(long r4) {
        int r02 = __offset(6);
        if (r02 == 0) goto L5;
        this.f2573bb.putLong(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    public final boolean mutateMin(long r4) {
        int r02 = __offset(4);
        if (r02 == 0) goto L5;
        this.f2573bb.putLong(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }
}
