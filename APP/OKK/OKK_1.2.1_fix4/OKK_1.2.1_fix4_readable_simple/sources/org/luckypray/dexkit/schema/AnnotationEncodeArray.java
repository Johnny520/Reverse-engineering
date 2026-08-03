package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationEncodeArray */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeArray extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-AnnotationEncodeArray$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addValues(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(0, r3);
        }

        public final int createAnnotationEncodeArray(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(1);
            addValues(r2, r3);
            return endAnnotationEncodeArray(r2);
        }

        public final int createValuesVector(C0733b r3, int[] r4) {
            AbstractC0307g.m703e(r3, "builder");
            AbstractC0307g.m703e(r4, "data");
            r3.m1937t(4, r4.length, 4);
            int r02 = r4.length;
        L3:
            r02 = r02 - 1;
            if ((-1) >= r02) goto L7;
            r3.m1924g(r4[r02]);
            goto L3
        L7:
            return r3.m1930m();
        }

        public final int endAnnotationEncodeArray(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final AnnotationEncodeArray getRootAsAnnotationEncodeArray(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsAnnotationEncodeArray(r2, new AnnotationEncodeArray());
        }

        public final void startAnnotationEncodeArray(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(1);
        }

        public final void startValuesVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(4, r3, 4);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final AnnotationEncodeArray getRootAsAnnotationEncodeArray(ByteBuffer r3, AnnotationEncodeArray r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public AnnotationEncodeArray() {
    }

    public final AnnotationEncodeArray __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final int getValuesLength() {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final AnnotationEncodeValueMeta values(int r2) {
        return values(new AnnotationEncodeValueMeta(), r2);
    }

    public final AnnotationEncodeValueMeta values(AnnotationEncodeValueMeta r3, int r4) {
        AbstractC0307g.m703e(r3, "obj");
        int r1 = __offset(4);
        if (r1 == 0) goto L5;
        int r42 = r4 * 4;
        int r43 = __indirect(r42 + __vector(r1));
        ByteBuffer r02 = this.f2573bb;
        AbstractC0307g.m702d(r02, "bb");
        return r3.__assign(r43, r02);
    L5:
        return null;
    }
}
