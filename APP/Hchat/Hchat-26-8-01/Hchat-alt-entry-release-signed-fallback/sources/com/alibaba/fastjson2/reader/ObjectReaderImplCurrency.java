package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplCurrency extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplCurrency INSTANCE = null;
    static final long TYPE_HASH = 0;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplCurrency r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplCurrency
            r0.<init>()
            com.alibaba.fastjson2.reader.ObjectReaderImplCurrency.INSTANCE = r0
            java.lang.String r0 = "Currency"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderImplCurrency.TYPE_HASH = r0
            return
    }

    public ObjectReaderImplCurrency() {
            r1 = this;
            java.lang.Class<java.util.Currency> r0 = java.util.Currency.class
            r1.<init>(r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            byte r2 = r1.getType()
            r3 = -110(0xffffffffffffff92, float:NaN)
            if (r2 != r3) goto L3a
            r1.next()
            long r2 = r1.readTypeHashCode()
            long r4 = com.alibaba.fastjson2.reader.ObjectReaderImplCurrency.TYPE_HASH
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L3a
            r4 = -7860540621745740270(0x92e9bff392512612, double:-1.458905556894225E-217)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L1f
            goto L3a
        L1f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "currency not support input autoTypeClass "
            r2.<init>(r3)
            java.lang.String r3 = r1.getString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = r1.info(r2)
            ah.a.w(r1)
            r1 = 0
            return r1
        L3a:
            java.lang.String r1 = r1.readString()
            if (r1 == 0) goto L4c
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L47
            goto L4c
        L47:
            java.util.Currency r1 = java.util.Currency.getInstance(r1)
            return r1
        L4c:
            r1 = 0
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            boolean r2 = r1.isObject()
            if (r2 == 0) goto L20
            com.alibaba.fastjson2.JSONObject r2 = new com.alibaba.fastjson2.JSONObject
            r2.<init>()
            r3 = 0
            com.alibaba.fastjson2.JSONReader$Feature[] r3 = new com.alibaba.fastjson2.JSONReader.Feature[r3]
            r1.readObject(r2, r3)
            java.lang.String r1 = "currency"
            java.lang.String r1 = r2.getString(r1)
            if (r1 != 0) goto L24
            java.lang.String r1 = "currencyCode"
            java.lang.String r1 = r2.getString(r1)
            goto L24
        L20:
            java.lang.String r1 = r1.readString()
        L24:
            if (r1 == 0) goto L32
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L2d
            goto L32
        L2d:
            java.util.Currency r1 = java.util.Currency.getInstance(r1)
            return r1
        L32:
            r1 = 0
            return r1
    }
}
