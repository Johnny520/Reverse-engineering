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
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-TargetElementTypesMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addMatchType(C0733b c0733b, byte b2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1920c(1, b2);
        }

        public final void addTypes(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(0, i2);
        }

        public final int createTargetElementTypesMatcher(C0733b c0733b, int i2, byte b2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(2);
            addTypes(c0733b, i2);
            addMatchType(c0733b, b2);
            return endTargetElementTypesMatcher(c0733b);
        }

        public final int createTypesVector(C0733b c0733b, byte[] bArr) {
            AbstractC0307g.m703e(c0733b, "builder");
            AbstractC0307g.m703e(bArr, "data");
            c0733b.m1937t(1, bArr.length, 1);
            for (int length = bArr.length - 1; -1 < length; length--) {
                c0733b.m1919b(bArr[length]);
            }
            return c0733b.m1930m();
        }

        public final int endTargetElementTypesMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final TargetElementTypesMatcher getRootAsTargetElementTypesMatcher(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsTargetElementTypesMatcher(byteBuffer, new TargetElementTypesMatcher());
        }

        public final void startTargetElementTypesMatcher(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(2);
        }

        public final void startTypesVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(1, i2, 1);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final TargetElementTypesMatcher getRootAsTargetElementTypesMatcher(ByteBuffer byteBuffer, TargetElementTypesMatcher targetElementTypesMatcher) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(targetElementTypesMatcher, "obj");
            return targetElementTypesMatcher.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final TargetElementTypesMatcher __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final byte getMatchType() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f2573bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public final ByteBuffer getTypesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(4, 1);
        AbstractC0307g.m702d(byteBuffer__vector_as_bytebuffer, "__vector_as_bytebuffer(4, 1)");
        return byteBuffer__vector_as_bytebuffer;
    }

    public final int getTypesLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final boolean mutateMatchType(byte b2) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.put(i__offset + this.bb_pos, b2);
        return true;
    }

    public final boolean mutateTypes(int i2, byte b2) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return false;
        }
        this.f2573bb.put(__vector(i__offset) + i2, b2);
        return true;
    }

    public final byte types(int i2) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f2573bb.get(__vector(i__offset) + i2);
        }
        return (byte) 0;
    }

    public final ByteBuffer typesInByteBuffer(ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 4, 1);
        AbstractC0307g.m702d(byteBuffer__vector_in_bytebuffer, "__vector_in_bytebuffer(_bb, 4, 1)");
        return byteBuffer__vector_in_bytebuffer;
    }
}
