package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-UsingFieldMeta */
/* JADX INFO: loaded from: classes.dex */
public final class UsingFieldMeta extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-UsingFieldMeta$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addField(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(0, r3);
        }

        public final void addUsingType(C0733b r2, byte r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1920c(1, r3);
        }

        public final int createUsingFieldMeta(C0733b r2, int r3, byte r4) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(2);
            addField(r2, r3);
            addUsingType(r2, r4);
            return endUsingFieldMeta(r2);
        }

        public final int endUsingFieldMeta(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final UsingFieldMeta getRootAsUsingFieldMeta(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsUsingFieldMeta(r2, new UsingFieldMeta());
        }

        public final void startUsingFieldMeta(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(2);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final UsingFieldMeta getRootAsUsingFieldMeta(ByteBuffer r3, UsingFieldMeta r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public UsingFieldMeta() {
    }

    public final UsingFieldMeta __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final FieldMeta field(FieldMeta r4) {
        AbstractC0307g.m703e(r4, "obj");
        int r02 = __offset(4);
        if (r02 == 0) goto L5;
        int r03 = __indirect(r02 + this.bb_pos);
        ByteBuffer r1 = this.f2573bb;
        AbstractC0307g.m702d(r1, "bb");
        return r4.__assign(r03, r1);
    L5:
        return null;
    }

    public final FieldMeta getField() {
        return field(new FieldMeta());
    }

    public final byte getUsingType() {
        int r02 = __offset(6);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return this.f2573bb.get(r02 + this.bb_pos);
    }

    public final boolean mutateUsingType(byte r4) {
        int r02 = __offset(6);
        if (r02 == 0) goto L5;
        this.f2573bb.put(r02 + this.bb_pos, r4);
        return true;
    L5:
        return false;
    }
}
