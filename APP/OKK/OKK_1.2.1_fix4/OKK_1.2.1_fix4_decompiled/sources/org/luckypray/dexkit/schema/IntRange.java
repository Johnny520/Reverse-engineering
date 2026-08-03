package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-IntRange, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class IntRange extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-IntRange$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addMax(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1922e(1, i2);
        }

        public final void addMin(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1922e(0, i2);
        }

        public final int createIntRange(C0733b c0733b, int i2, int i3) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(2);
            addMax(c0733b, i3);
            addMin(c0733b, i2);
            return endIntRange(c0733b);
        }

        public final int endIntRange(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final IntRange getRootAsIntRange(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsIntRange(byteBuffer, new IntRange());
        }

        public final void startIntRange(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(2);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final IntRange getRootAsIntRange(ByteBuffer byteBuffer, IntRange intRange) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(intRange, "obj");
            return intRange.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final IntRange __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final int getMax() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f2573bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public final int getMin() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f2573bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public final boolean mutateMax(int i2) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt(i__offset + this.bb_pos, i2);
        return true;
    }

    public final boolean mutateMin(int i2) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.putInt(i__offset + this.bb_pos, i2);
        return true;
    }
}
