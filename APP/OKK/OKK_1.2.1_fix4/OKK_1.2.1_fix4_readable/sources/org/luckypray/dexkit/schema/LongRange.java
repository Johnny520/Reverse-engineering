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
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-LongRange$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addMax(C0733b c0733b, long j2) {
            AbstractC0307g.m703e(c0733b, "builder");
            if (j2 != 0) {
                c0733b.m1923f(j2);
                c0733b.m1935r(1);
            }
        }

        public final void addMin(C0733b c0733b, long j2) {
            AbstractC0307g.m703e(c0733b, "builder");
            if (j2 != 0) {
                c0733b.m1923f(j2);
                c0733b.m1935r(0);
            }
        }

        public final int createLongRange(C0733b c0733b, long j2, long j3) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(2);
            addMax(c0733b, j3);
            addMin(c0733b, j2);
            return endLongRange(c0733b);
        }

        public final int endLongRange(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final LongRange getRootAsLongRange(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsLongRange(byteBuffer, new LongRange());
        }

        public final void startLongRange(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(2);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final LongRange getRootAsLongRange(ByteBuffer byteBuffer, LongRange longRange) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(longRange, "obj");
            return longRange.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final LongRange __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final long getMax() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f2573bb.getLong(i__offset + this.bb_pos);
        }
        return 0L;
    }

    public final long getMin() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f2573bb.getLong(i__offset + this.bb_pos);
        }
        return 0L;
    }

    public final boolean mutateMax(long j2) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putLong(i__offset + this.bb_pos, j2);
        return true;
    }

    public final boolean mutateMin(long j2) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putLong(i__offset + this.bb_pos, j2);
        return true;
    }
}
