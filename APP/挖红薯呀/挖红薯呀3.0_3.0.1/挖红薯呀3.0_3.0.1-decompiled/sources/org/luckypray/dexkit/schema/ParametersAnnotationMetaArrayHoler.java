package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0619pl;
import p000.AbstractC0748t1;
import p000.C0938xt;
import p000.c61;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ParametersAnnotationMetaArrayHoler, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ParametersAnnotationMetaArrayHoler extends c61 {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ParametersAnnotationMetaArrayHoler __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationMetaArrayHolder annotationsArray(AnnotationMetaArrayHolder annotationMetaArrayHolder, int i) {
        annotationMetaArrayHolder.getClass();
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f715bb;
        byteBuffer.getClass();
        return annotationMetaArrayHolder.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getAnnotationsArrayLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ParametersAnnotationMetaArrayHoler$Companion */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-ParametersAnnotationMetaArrayHoler.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addAnnotationsArray(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5159h(0, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000e */
        public final int createAnnotationsArrayVector(C0938xt c0938xt, int[] iArr) {
            c0938xt.getClass();
            iArr.getClass();
            c0938xt.m5170s(4, iArr.length, 4);
            int length = iArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0938xt.m5164m();
                }
                c0938xt.m5158g(iArr[length]);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int createParametersAnnotationMetaArrayHoler(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5169r(1);
            addAnnotationsArray(c0938xt, i);
            return endParametersAnnotationMetaArrayHoler(c0938xt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int endParametersAnnotationMetaArrayHoler(C0938xt c0938xt) {
            c0938xt.getClass();
            return c0938xt.m5163l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ParametersAnnotationMetaArrayHoler getRootAsParametersAnnotationMetaArrayHoler(ByteBuffer byteBuffer, ParametersAnnotationMetaArrayHoler parametersAnnotationMetaArrayHoler) {
            byteBuffer.getClass();
            parametersAnnotationMetaArrayHoler.getClass();
            return parametersAnnotationMetaArrayHoler.__assign(byteBuffer.position() + AbstractC0748t1.m4148f(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startAnnotationsArrayVector(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5170s(4, i, 4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startParametersAnnotationMetaArrayHoler(C0938xt c0938xt) {
            c0938xt.getClass();
            c0938xt.m5169r(1);
        }

        private Companion() {
        }

        public final ParametersAnnotationMetaArrayHoler getRootAsParametersAnnotationMetaArrayHoler(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsParametersAnnotationMetaArrayHoler(byteBuffer, new ParametersAnnotationMetaArrayHoler());
        }

        public final void validateVersion() {
        }
    }

    public final AnnotationMetaArrayHolder annotationsArray(int i) {
        return annotationsArray(new AnnotationMetaArrayHolder(), i);
    }
}
