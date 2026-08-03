package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMetaArrayHolder, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class MethodMetaArrayHolder extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addMethods(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(0, i2);
        }

        public final int createMethodMetaArrayHolder(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(1);
            addMethods(c0733b, i2);
            return endMethodMetaArrayHolder(c0733b);
        }

        public final int createMethodsVector(C0733b c0733b, int[] iArr) {
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

        public final int endMethodMetaArrayHolder(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final MethodMetaArrayHolder getRootAsMethodMetaArrayHolder(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsMethodMetaArrayHolder(byteBuffer, new MethodMetaArrayHolder());
        }

        public final void startMethodMetaArrayHolder(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(1);
        }

        public final void startMethodsVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(4, i2, 4);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final MethodMetaArrayHolder getRootAsMethodMetaArrayHolder(ByteBuffer byteBuffer, MethodMetaArrayHolder methodMetaArrayHolder) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(methodMetaArrayHolder, "obj");
            return methodMetaArrayHolder.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final MethodMetaArrayHolder __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final int getMethodsLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final MethodMeta methods(int i2) {
        return methods(new MethodMeta(), i2);
    }

    public final MethodMeta methods(MethodMeta methodMeta, int i2) {
        AbstractC0307g.m703e(methodMeta, "obj");
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i2 * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return methodMeta.__assign(i__indirect, byteBuffer);
    }
}
