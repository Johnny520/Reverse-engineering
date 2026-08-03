package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReader12<T> extends com.alibaba.fastjson2.reader.ObjectReaderAdapter<T> {
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader0;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader1;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader10;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader11;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader2;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader3;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader4;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader5;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader6;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader7;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader8;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader9;
    final long hashCode0;
    final long hashCode0LCase;
    final long hashCode1;
    final long hashCode10;
    final long hashCode10LCase;
    final long hashCode11;
    final long hashCode11LCase;
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
    final long hashCode7;
    final long hashCode7LCase;
    final long hashCode8;
    final long hashCode8LCase;
    final long hashCode9;
    final long hashCode9LCase;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader0;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader1;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader10;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader11;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader2;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader3;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader4;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader5;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader6;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader7;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader8;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader9;

    public ObjectReader12(java.lang.Class r16, java.lang.String r17, java.lang.String r18, long r19, java.util.function.Supplier<T> r21, java.util.function.Function r22, com.alibaba.fastjson2.reader.FieldReader... r23) {
            r15 = this;
            r9 = 0
            r10 = 0
            r8 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r6 = r21
            r7 = r22
            r11 = r23
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            r1 = 0
            r1 = r23[r1]
            r15.fieldReader0 = r1
            r2 = 1
            r2 = r23[r2]
            r15.fieldReader1 = r2
            r3 = 2
            r3 = r23[r3]
            r15.fieldReader2 = r3
            r4 = 3
            r4 = r23[r4]
            r15.fieldReader3 = r4
            r5 = 4
            r5 = r23[r5]
            r15.fieldReader4 = r5
            r6 = 5
            r6 = r23[r6]
            r15.fieldReader5 = r6
            r7 = 6
            r7 = r23[r7]
            r15.fieldReader6 = r7
            r8 = 7
            r8 = r23[r8]
            r15.fieldReader7 = r8
            r9 = 8
            r9 = r23[r9]
            r15.fieldReader8 = r9
            r10 = 9
            r10 = r23[r10]
            r15.fieldReader9 = r10
            r11 = 10
            r11 = r23[r11]
            r15.fieldReader10 = r11
            r12 = 11
            r12 = r23[r12]
            r15.fieldReader11 = r12
            long r13 = r1.fieldNameHash
            r15.hashCode0 = r13
            long r13 = r2.fieldNameHash
            r15.hashCode1 = r13
            long r13 = r3.fieldNameHash
            r15.hashCode2 = r13
            long r13 = r4.fieldNameHash
            r15.hashCode3 = r13
            long r13 = r5.fieldNameHash
            r15.hashCode4 = r13
            long r13 = r6.fieldNameHash
            r15.hashCode5 = r13
            long r13 = r7.fieldNameHash
            r15.hashCode6 = r13
            long r13 = r8.fieldNameHash
            r15.hashCode7 = r13
            long r13 = r9.fieldNameHash
            r15.hashCode8 = r13
            long r13 = r10.fieldNameHash
            r15.hashCode9 = r13
            long r13 = r11.fieldNameHash
            r15.hashCode10 = r13
            long r13 = r12.fieldNameHash
            r15.hashCode11 = r13
            long r13 = r1.fieldNameHashLCase
            r15.hashCode0LCase = r13
            long r1 = r2.fieldNameHashLCase
            r15.hashCode1LCase = r1
            long r1 = r3.fieldNameHashLCase
            r15.hashCode2LCase = r1
            long r1 = r4.fieldNameHashLCase
            r15.hashCode3LCase = r1
            long r1 = r5.fieldNameHashLCase
            r15.hashCode4LCase = r1
            long r1 = r6.fieldNameHashLCase
            r15.hashCode5LCase = r1
            long r1 = r7.fieldNameHashLCase
            r15.hashCode6LCase = r1
            long r1 = r8.fieldNameHashLCase
            r15.hashCode7LCase = r1
            long r1 = r9.fieldNameHashLCase
            r15.hashCode8LCase = r1
            long r1 = r10.fieldNameHashLCase
            r15.hashCode9LCase = r1
            long r1 = r11.fieldNameHashLCase
            r15.hashCode10LCase = r1
            long r1 = r12.fieldNameHashLCase
            r15.hashCode11LCase = r1
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
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L3f
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader6
            return r3
        L3f:
            long r0 = r2.hashCode7
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L48
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader7
            return r3
        L48:
            long r0 = r2.hashCode8
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L51
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader8
            return r3
        L51:
            long r0 = r2.hashCode9
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L5a
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader9
            return r3
        L5a:
            long r0 = r2.hashCode10
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L63
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader10
            return r3
        L63:
            long r0 = r2.hashCode11
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L6c
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader11
            return r3
        L6c:
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
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L3f
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader6
            return r3
        L3f:
            long r0 = r2.hashCode7LCase
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L48
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader7
            return r3
        L48:
            long r0 = r2.hashCode8LCase
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L51
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader8
            return r3
        L51:
            long r0 = r2.hashCode9LCase
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L5a
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader9
            return r3
        L5a:
            long r0 = r2.hashCode10LCase
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L63
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader10
            return r3
        L63:
            long r0 = r2.hashCode11LCase
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L6c
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader11
            return r3
        L6c:
            r3 = 0
            return r3
    }
}
