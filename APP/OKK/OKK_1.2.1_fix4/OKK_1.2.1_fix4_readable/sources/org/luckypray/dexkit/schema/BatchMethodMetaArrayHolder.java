package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-BatchMethodMetaArrayHolder */
/* JADX INFO: loaded from: classes.dex */
public final class BatchMethodMetaArrayHolder extends AbstractC0735d {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-BatchMethodMetaArrayHolder$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addItems(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1925h(0, i2);
        }

        public final int createBatchMethodMetaArrayHolder(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(1);
            addItems(c0733b, i2);
            return endBatchMethodMetaArrayHolder(c0733b);
        }

        public final int createItemsVector(C0733b c0733b, int[] iArr) {
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

        public final int endBatchMethodMetaArrayHolder(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            return c0733b.m1929l();
        }

        public final BatchMethodMetaArrayHolder getRootAsBatchMethodMetaArrayHolder(ByteBuffer byteBuffer) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            return getRootAsBatchMethodMetaArrayHolder(byteBuffer, new BatchMethodMetaArrayHolder());
        }

        public final void startBatchMethodMetaArrayHolder(C0733b c0733b) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1936s(1);
        }

        public final void startItemsVector(C0733b c0733b, int i2) {
            AbstractC0307g.m703e(c0733b, "builder");
            c0733b.m1937t(4, i2, 4);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final BatchMethodMetaArrayHolder getRootAsBatchMethodMetaArrayHolder(ByteBuffer byteBuffer, BatchMethodMetaArrayHolder batchMethodMetaArrayHolder) {
            AbstractC0307g.m703e(byteBuffer, "_bb");
            AbstractC0307g.m703e(batchMethodMetaArrayHolder, "obj");
            return batchMethodMetaArrayHolder.__assign(byteBuffer.position() + AbstractC0324d.m719b(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }
    }

    public final BatchMethodMetaArrayHolder __assign(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __init(i2, byteBuffer);
        return this;
    }

    public final void __init(int i2, ByteBuffer byteBuffer) {
        AbstractC0307g.m703e(byteBuffer, "_bb");
        __reset(i2, byteBuffer);
    }

    public final int getItemsLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public final BatchMethodMeta items(int i2) {
        return items(new BatchMethodMeta(), i2);
    }

    public final BatchMethodMeta items(BatchMethodMeta batchMethodMeta, int i2) {
        AbstractC0307g.m703e(batchMethodMeta, "obj");
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect((i2 * 4) + __vector(i__offset));
        ByteBuffer byteBuffer = this.f2573bb;
        AbstractC0307g.m702d(byteBuffer, "bb");
        return batchMethodMeta.__assign(i__indirect, byteBuffer);
    }
}
