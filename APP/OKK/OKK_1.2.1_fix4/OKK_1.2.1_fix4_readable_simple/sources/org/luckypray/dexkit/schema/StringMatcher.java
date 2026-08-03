package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-StringMatcher */
/* JADX INFO: loaded from: classes.dex */
public final class StringMatcher extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-StringMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addIgnoreCase(C0733b r2, boolean r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1918a(2, r3);
        }

        public final void addMatchType(C0733b r2, byte r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1920c(1, r3);
        }

        public final void addValue(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(0, r3);
        }

        public final int createStringMatcher(C0733b r2, int r3, byte r4, boolean r5) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(3);
            addValue(r2, r3);
            addIgnoreCase(r2, r5);
            addMatchType(r2, r4);
            return endStringMatcher(r2);
        }

        public final int endStringMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final StringMatcher getRootAsStringMatcher(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsStringMatcher(r2, new StringMatcher());
        }

        public final void startStringMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(3);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final StringMatcher getRootAsStringMatcher(ByteBuffer r3, StringMatcher r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public StringMatcher() {
    }

    public final StringMatcher __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final boolean getIgnoreCase() {
        int r02 = __offset(8);
        if (r02 != 0) goto L5;
        return false;
    L5:
        if (((byte) 0) == this.f2573bb.get(r02 + this.bb_pos)) goto L9;
        return true;
    L9:
        return false;
    }

    public final byte getMatchType() {
        int r02 = __offset(6);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.get(r02 + this.bb_pos);
    }

    public final String getValue() {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return null;
    L7:
        return __string(r02 + this.bb_pos);
    }

    public final ByteBuffer getValueAsByteBuffer() {
        ByteBuffer r02 = __vector_as_bytebuffer(4, 1);
        AbstractC0307g.m702d(r02, "__vector_as_bytebuffer(4, 1)");
        return r02;
    }

    public final boolean mutateIgnoreCase(boolean r4) {
        int r02 = __offset(8);
        if (r02 == 0) goto L5;
        this.f2573bb.put(r02 + this.bb_pos, r4 ? 1 : 0);
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

    public final ByteBuffer valueInByteBuffer(ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        ByteBuffer r32 = __vector_in_bytebuffer(r3, 4, 1);
        AbstractC0307g.m702d(r32, "__vector_in_bytebuffer(_bb, 4, 1)");
        return r32;
    }
}
