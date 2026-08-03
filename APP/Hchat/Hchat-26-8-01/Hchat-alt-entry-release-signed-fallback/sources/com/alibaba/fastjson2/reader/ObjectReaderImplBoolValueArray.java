package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplBoolValueArray extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplBoolValueArray INSTANCE = null;
    static final long TYPE_HASH = 0;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplBoolValueArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplBoolValueArray
            r0.<init>()
            com.alibaba.fastjson2.reader.ObjectReaderImplBoolValueArray.INSTANCE = r0
            java.lang.String r0 = "[Z"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplBoolValueArray.TYPE_HASH = r0
            return
    }

    public ObjectReaderImplBoolValueArray() {
            r1 = this;
            java.lang.Class<boolean[]> r0 = boolean[].class
            r1.<init>(r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            r2 = -110(0xffffffffffffff92, float:NaN)
            boolean r2 = r1.nextIfMatch(r2)
            if (r2 == 0) goto L1e
            long r2 = r1.readTypeHashCode()
            long r4 = com.alibaba.fastjson2.reader.ObjectReaderImplBoolValueArray.TYPE_HASH
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L13
            goto L1e
        L13:
            java.lang.String r2 = "not support autoType : "
            java.lang.String r1 = r1.getString()
            ah.a.i(r1, r2)
            r1 = 0
            return r1
        L1e:
            int r2 = r1.startArray()
            r3 = -1
            if (r2 != r3) goto L27
            r1 = 0
            return r1
        L27:
            boolean[] r3 = new boolean[r2]
            r4 = 0
        L2a:
            if (r4 >= r2) goto L35
            boolean r5 = r1.readBoolValue()
            r3[r4] = r5
            int r4 = r4 + 1
            goto L2a
        L35:
            return r3
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r2, java.lang.reflect.Type r3, java.lang.Object r4, long r5) {
            r1 = this;
            boolean r3 = r2.readIfNull()
            r4 = 0
            if (r3 == 0) goto L8
            return r4
        L8:
            boolean r3 = r2.nextIfArrayStart()
            if (r3 == 0) goto L3d
            r3 = 16
            boolean[] r3 = new boolean[r3]
            r4 = 0
        L13:
            boolean r5 = r2.nextIfArrayEnd()
            if (r5 == 0) goto L21
            r2.nextIfComma()
            boolean[] r2 = java.util.Arrays.copyOf(r3, r4)
            return r2
        L21:
            int r5 = r4 + 1
            int r6 = r3.length
            int r6 = r5 - r6
            if (r6 <= 0) goto L35
            int r6 = r3.length
            int r0 = r6 >> 1
            int r6 = r6 + r0
            int r0 = r6 - r5
            if (r0 >= 0) goto L31
            r6 = r5
        L31:
            boolean[] r3 = java.util.Arrays.copyOf(r3, r6)
        L35:
            boolean r6 = r2.readBoolValue()
            r3[r4] = r6
            r4 = r5
            goto L13
        L3d:
            boolean r3 = r2.isString()
            if (r3 == 0) goto L5d
            java.lang.String r3 = r2.readString()
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L4e
            return r4
        L4e:
            java.lang.String r4 = "not support input "
            java.lang.String r3 = r4.concat(r3)
            java.lang.String r2 = r2.info(r3)
            ah.a.w(r2)
            r2 = 0
            return r2
        L5d:
            java.lang.String r3 = "TODO"
            java.lang.String r2 = r2.info(r3)
            ah.a.w(r2)
            r2 = 0
            return r2
    }
}
