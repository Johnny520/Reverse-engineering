package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-UsingFieldMatcher, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class UsingFieldMatcher extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-UsingFieldMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addField(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(0, i2);
        }

        public final void addUsingType(C0733b c0733b, byte b2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1920c(1, b2);
        }

        public final int createUsingFieldMatcher(C0733b c0733b, int i2, byte b2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(2);
            addField(c0733b, i2);
            addUsingType(c0733b, b2);
            return endUsingFieldMatcher(c0733b);
        }

        public final int endUsingFieldMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final UsingFieldMatcher getRootAsUsingFieldMatcher(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsUsingFieldMatcher(byteBuffer, new UsingFieldMatcher());
        }

        public final void startUsingFieldMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(2);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final UsingFieldMatcher getRootAsUsingFieldMatcher(ByteBuffer byteBuffer, UsingFieldMatcher usingFieldMatcher) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(usingFieldMatcher, "obj");
            return usingFieldMatcher.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final UsingFieldMatcher __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final FieldMatcher field(FieldMatcher fieldMatcher) {
        AbstractC0307g.m703e(fieldMatcher, "obj");
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return fieldMatcher.__assign(i__indirect, byteBuffer);
    }

    public final FieldMatcher getField() {
        return field(new FieldMatcher());
    }

    public final byte getUsingType() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f2573bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public final boolean mutateUsingType(byte b2) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.put(i__offset + this.bb_pos, b2);
        return true;
    }
}
