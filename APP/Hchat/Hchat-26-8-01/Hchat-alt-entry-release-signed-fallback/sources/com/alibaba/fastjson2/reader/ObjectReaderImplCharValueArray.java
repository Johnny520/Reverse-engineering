package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplCharValueArray extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplCharValueArray INSTANCE = null;
    static final long TYPE_HASH = 0;
    final java.util.function.Function<char[], java.lang.Object> builder;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplCharValueArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplCharValueArray
            r1 = 0
            r0.<init>(r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplCharValueArray.INSTANCE = r0
            java.lang.String r0 = "[C"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplCharValueArray.TYPE_HASH = r0
            return
    }

    public ObjectReaderImplCharValueArray(java.util.function.Function<char[], java.lang.Object> r2) {
            r1 = this;
            java.lang.Class<char[]> r0 = char[].class
            r1.<init>(r0)
            r1.builder = r2
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r2, java.lang.reflect.Type r3, java.lang.Object r4, long r5) {
            r1 = this;
            r3 = -110(0xffffffffffffff92, float:NaN)
            boolean r3 = r2.nextIfMatch(r3)
            if (r3 == 0) goto L1e
            long r3 = r2.readTypeHashCode()
            long r5 = com.alibaba.fastjson2.reader.ObjectReaderImplCharValueArray.TYPE_HASH
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L13
            goto L1e
        L13:
            java.lang.String r3 = "not support autoType : "
            java.lang.String r2 = r2.getString()
            ah.a.i(r2, r3)
            r2 = 0
            return r2
        L1e:
            boolean r3 = r2.isString()
            if (r3 == 0) goto L2d
            java.lang.String r2 = r2.readString()
            char[] r2 = r2.toCharArray()
            return r2
        L2d:
            int r3 = r2.startArray()
            r4 = -1
            if (r3 != r4) goto L36
            r2 = 0
            return r2
        L36:
            char[] r4 = new char[r3]
            r5 = 0
            r6 = r5
        L3a:
            if (r6 >= r3) goto L57
            boolean r0 = r2.isInt()
            if (r0 == 0) goto L4a
            int r0 = r2.readInt32Value()
            char r0 = (char) r0
            r4[r6] = r0
            goto L54
        L4a:
            java.lang.String r0 = r2.readString()
            char r0 = r0.charAt(r5)
            r4[r6] = r0
        L54:
            int r6 = r6 + 1
            goto L3a
        L57:
            java.util.function.Function<char[], java.lang.Object> r2 = r1.builder
            if (r2 == 0) goto L60
            java.lang.Object r2 = r2.apply(r4)
            return r2
        L60:
            return r4
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r3, java.lang.reflect.Type r4, java.lang.Object r5, long r6) {
            r2 = this;
            boolean r4 = r3.readIfNull()
            if (r4 == 0) goto L8
            r3 = 0
            return r3
        L8:
            char r4 = r3.current()
            r5 = 34
            if (r4 != r5) goto L21
            java.lang.String r3 = r3.readString()
            char[] r3 = r3.toCharArray()
            java.util.function.Function<char[], java.lang.Object> r4 = r2.builder
            if (r4 == 0) goto L20
            java.lang.Object r3 = r4.apply(r3)
        L20:
            return r3
        L21:
            boolean r4 = r3.nextIfArrayStart()
            if (r4 == 0) goto L75
            r4 = 16
            char[] r4 = new char[r4]
            r5 = 0
            r6 = r5
        L2d:
            boolean r7 = r3.nextIfArrayEnd()
            if (r7 == 0) goto L43
            r3.nextIfComma()
            char[] r3 = java.util.Arrays.copyOf(r4, r6)
            java.util.function.Function<char[], java.lang.Object> r4 = r2.builder
            if (r4 == 0) goto L42
            java.lang.Object r3 = r4.apply(r3)
        L42:
            return r3
        L43:
            int r7 = r6 + 1
            int r0 = r4.length
            int r0 = r7 - r0
            if (r0 <= 0) goto L57
            int r0 = r4.length
            int r1 = r0 >> 1
            int r0 = r0 + r1
            int r1 = r0 - r7
            if (r1 >= 0) goto L53
            r0 = r7
        L53:
            char[] r4 = java.util.Arrays.copyOf(r4, r0)
        L57:
            boolean r0 = r3.isInt()
            if (r0 == 0) goto L66
            int r0 = r3.readInt32Value()
            char r0 = (char) r0
            r4[r6] = r0
        L64:
            r6 = r7
            goto L2d
        L66:
            java.lang.String r0 = r3.readString()
            if (r0 != 0) goto L6e
            r0 = r5
            goto L72
        L6e:
            char r0 = r0.charAt(r5)
        L72:
            r4[r6] = r0
            goto L64
        L75:
            java.lang.String r4 = "TODO"
            java.lang.String r3 = r3.info(r4)
            ah.a.w(r3)
            r3 = 0
            return r3
    }
}
