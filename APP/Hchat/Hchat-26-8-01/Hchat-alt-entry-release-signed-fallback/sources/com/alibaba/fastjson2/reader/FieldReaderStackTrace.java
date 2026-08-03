package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class FieldReaderStackTrace extends com.alibaba.fastjson2.reader.FieldReaderObject {
    public FieldReaderStackTrace(java.lang.String r1, java.lang.reflect.Type r2, java.lang.Class r3, int r4, long r5, java.lang.String r7, java.util.Locale r8, java.lang.Object r9, java.lang.reflect.Method r10, java.lang.reflect.Field r11, java.util.function.BiConsumer r12) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            if (r6 != 0) goto L10
            long r0 = r4.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreSetNullValue
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L10
            return
        L10:
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L3e
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r0 = r6.iterator()
            r1 = 0
            r2 = r1
        L1c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r0.next()
            if (r3 != 0) goto L1c
            int r2 = r2 + 1
            goto L1c
        L2b:
            int r0 = r6.size()
            if (r2 != r0) goto L34
            java.lang.StackTraceElement[] r6 = new java.lang.StackTraceElement[r1]
            goto L3e
        L34:
            int r0 = r6.size()
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r6.toArray(r0)
            r6 = r0
        L3e:
            java.util.function.BiConsumer r0 = r4.function
            r0.accept(r5, r6)
            return
    }
}
