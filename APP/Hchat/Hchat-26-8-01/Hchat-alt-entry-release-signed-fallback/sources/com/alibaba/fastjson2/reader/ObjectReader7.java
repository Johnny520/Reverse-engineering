package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReader7<T> extends com.alibaba.fastjson2.reader.ObjectReaderAdapter<T> {
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader0;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader1;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader2;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader3;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader4;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader5;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader6;
    final long hashCode0;
    final long hashCode0LCase;
    final long hashCode1;
    final long hashCode1LCase;
    final long hashCode2;
    final long hashCode2LCase;
    final long hashCode3;
    final long hashCode3LCase;
    final long hashCode4;
    final long hashCode4LCase;
    final long hashCode5;
    final long hashCode5LCase;
    final long hashCode6;
    final long hashCode6LCase;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader0;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader1;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader2;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader3;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader4;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader5;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader6;

    public ObjectReader7(java.lang.Class r13, java.lang.String r14, java.lang.String r15, long r16, java.util.function.Supplier<T> r18, java.util.function.Function r19, com.alibaba.fastjson2.reader.FieldReader... r20) {
            r12 = this;
            r9 = 0
            r10 = 0
            r8 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            r11 = r20
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            r13 = 0
            r13 = r20[r13]
            r12.fieldReader0 = r13
            r14 = 1
            r14 = r20[r14]
            r12.fieldReader1 = r14
            r15 = 2
            r15 = r20[r15]
            r12.fieldReader2 = r15
            r1 = 3
            r1 = r20[r1]
            r12.fieldReader3 = r1
            r2 = 4
            r2 = r20[r2]
            r12.fieldReader4 = r2
            r3 = 5
            r3 = r20[r3]
            r12.fieldReader5 = r3
            r4 = 6
            r4 = r20[r4]
            r12.fieldReader6 = r4
            long r5 = r13.fieldNameHash
            r12.hashCode0 = r5
            long r5 = r14.fieldNameHash
            r12.hashCode1 = r5
            long r5 = r15.fieldNameHash
            r12.hashCode2 = r5
            long r5 = r1.fieldNameHash
            r12.hashCode3 = r5
            long r5 = r2.fieldNameHash
            r12.hashCode4 = r5
            long r5 = r3.fieldNameHash
            r12.hashCode5 = r5
            long r5 = r4.fieldNameHash
            r12.hashCode6 = r5
            long r5 = r13.fieldNameHashLCase
            r12.hashCode0LCase = r5
            long r13 = r14.fieldNameHashLCase
            r12.hashCode1LCase = r13
            long r13 = r15.fieldNameHashLCase
            r12.hashCode2LCase = r13
            long r13 = r1.fieldNameHashLCase
            r12.hashCode3LCase = r13
            long r13 = r2.fieldNameHashLCase
            r12.hashCode4LCase = r13
            long r13 = r3.fieldNameHashLCase
            r12.hashCode5LCase = r13
            long r13 = r4.fieldNameHashLCase
            r12.hashCode6LCase = r13
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public com.alibaba.fastjson2.reader.FieldReader getFieldReader(long r3) {
            r2 = this;
            long r0 = r2.hashCode0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L9
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader0
            return r3
        L9:
            long r0 = r2.hashCode1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L12
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader1
            return r3
        L12:
            long r0 = r2.hashCode2
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L1b
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader2
            return r3
        L1b:
            long r0 = r2.hashCode3
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L24
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader3
            return r3
        L24:
            long r0 = r2.hashCode4
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L2d
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader4
            return r3
        L2d:
            long r0 = r2.hashCode5
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L36
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader5
            return r3
        L36:
            long r0 = r2.hashCode6
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L3f
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader6
            return r3
        L3f:
            r3 = 0
            return r3
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public com.alibaba.fastjson2.reader.FieldReader getFieldReaderLCase(long r3) {
            r2 = this;
            long r0 = r2.hashCode0LCase
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L9
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader0
            return r3
        L9:
            long r0 = r2.hashCode1LCase
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L12
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader1
            return r3
        L12:
            long r0 = r2.hashCode2LCase
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L1b
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader2
            return r3
        L1b:
            long r0 = r2.hashCode3LCase
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L24
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader3
            return r3
        L24:
            long r0 = r2.hashCode4LCase
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L2d
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader4
            return r3
        L2d:
            long r0 = r2.hashCode5LCase
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L36
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader5
            return r3
        L36:
            long r0 = r2.hashCode6LCase
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L3f
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader6
            return r3
        L3f:
            r3 = 0
            return r3
    }
}
