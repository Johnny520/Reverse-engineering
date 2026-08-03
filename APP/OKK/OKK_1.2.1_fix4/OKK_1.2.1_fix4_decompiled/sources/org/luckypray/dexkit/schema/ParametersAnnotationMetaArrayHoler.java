package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ParametersAnnotationMetaArrayHoler, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class ParametersAnnotationMetaArrayHoler extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ParametersAnnotationMetaArrayHoler$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addAnnotationsArray(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(0, i2);
        }

        public final int createAnnotationsArrayVector(C0733b c0733b, int[] iArr) {
            AbstractC0307g.m703e(c0733b, "builder");
            AbstractC0307g.m703e(iArr, "data");
            c0733b.m1937t(4, iArr.length, 4);
            int length = iArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0733b.m1930m();
                }
                c0733b.m1924g(iArr[length]);
            }
        }

        public final int createParametersAnnotationMetaArrayHoler(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(1);
            addAnnotationsArray(c0733b, i2);
            return endParametersAnnotationMetaArrayHoler(c0733b);
        }

        public final int endParametersAnnotationMetaArrayHoler(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final ParametersAnnotationMetaArrayHoler getRootAsParametersAnnotationMetaArrayHoler(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsParametersAnnotationMetaArrayHoler(byteBuffer, new ParametersAnnotationMetaArrayHoler());
        }

        public final void startAnnotationsArrayVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(4, i2, 4);
        }

        public final void startParametersAnnotationMetaArrayHoler(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(1);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final ParametersAnnotationMetaArrayHoler getRootAsParametersAnnotationMetaArrayHoler(ByteBuffer byteBuffer, ParametersAnnotationMetaArrayHoler parametersAnnotationMetaArrayHoler) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(parametersAnnotationMetaArrayHoler, "obj");
            return parametersAnnotationMetaArrayHoler.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final ParametersAnnotationMetaArrayHoler __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final AnnotationMetaArrayHolder annotationsArray(int i2) {
        return annotationsArray(new AnnotationMetaArrayHolder(), i2);
    }

    public final int getAnnotationsArrayLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final AnnotationMetaArrayHolder annotationsArray(AnnotationMetaArrayHolder annotationMetaArrayHolder, int i2) {
        AbstractC0307g.m703e(annotationMetaArrayHolder, "obj");
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i2 * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return annotationMetaArrayHolder.__assign(i__indirect, byteBuffer);
    }
}
