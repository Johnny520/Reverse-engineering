package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-TargetElementTypesMatcher */
/* JADX INFO: loaded from: classes.dex */
public final class TargetElementTypesMatcher extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-TargetElementTypesMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addMatchType(C0733b r2, byte r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1920c(1, r3);
        }

        public final void addTypes(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(0, r3);
        }

        public final int createTargetElementTypesMatcher(C0733b r2, int r3, byte r4) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(2);
            addTypes(r2, r3);
            addMatchType(r2, r4);
            return endTargetElementTypesMatcher(r2);
        }

        public final int createTypesVector(C0733b r3, byte[] r4) {
            AbstractC0307g.m703e(r3, "builder");
            AbstractC0307g.m703e(r4, "data");
            r3.m1937t(1, r4.length, 1);
            int r02 = r4.length - 1;
        L4:
            if ((-1) >= r02) goto L7;
            r3.m1919b(r4[r02]);
            r02 = r02 - 1;
            goto L4
        L7:
            return r3.m1930m();
        }

        public final int endTargetElementTypesMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final TargetElementTypesMatcher getRootAsTargetElementTypesMatcher(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsTargetElementTypesMatcher(r2, new TargetElementTypesMatcher());
        }

        public final void startTargetElementTypesMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(2);
        }

        public final void startTypesVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(1, r3, 1);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final TargetElementTypesMatcher getRootAsTargetElementTypesMatcher(ByteBuffer r3, TargetElementTypesMatcher r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public TargetElementTypesMatcher() {
    }

    public final TargetElementTypesMatcher __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final byte getMatchType() {
        int r02 = __offset(6);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.get(r02 + this.bb_pos);
    }

    public final ByteBuffer getTypesAsByteBuffer() {
        ByteBuffer r02 = __vector_as_bytebuffer(4, 1);
        AbstractC0307g.m702d(r02, "__vector_as_bytebuffer(4, 1)");
        return r02;
    }

    public final int getTypesLength() {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final boolean mutateMatchType(byte r4) {
        int r02 = __offset(6);
        if (r02 == 0) goto L5;
        this.f2573bb.put(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }

    public final boolean mutateTypes(int r3, byte r4) {
        int r02 = __offset(4);
        if (r02 == 0) goto L5;
        this.f2573bb.put(__vector(r02) + r3, r4);
        return true;
    L5:
        return false;
    }

    public final byte types(int r3) {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.get(__vector(r02) + r3);
    }

    public final ByteBuffer typesInByteBuffer(ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        ByteBuffer r32 = __vector_in_bytebuffer(r3, 4, 1);
        AbstractC0307g.m702d(r32, "__vector_in_bytebuffer(_bb, 4, 1)");
        return r32;
    }
}
