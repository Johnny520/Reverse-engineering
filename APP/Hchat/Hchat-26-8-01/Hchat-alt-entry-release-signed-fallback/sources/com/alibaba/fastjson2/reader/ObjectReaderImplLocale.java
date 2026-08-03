package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplLocale extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplLocale INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplLocale r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplLocale
            r0.<init>()
            com.alibaba.fastjson2.reader.ObjectReaderImplLocale.INSTANCE = r0
            return
    }

    public ObjectReaderImplLocale() {
            r1 = this;
            java.lang.Class<java.util.Locale> r0 = java.util.Locale.class
            r1.<init>(r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.String r1 = r1.readString()
            if (r1 == 0) goto L3a
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Ld
            goto L3a
        Ld:
            java.lang.String r2 = "_"
            java.lang.String[] r1 = r1.split(r2)
            int r2 = r1.length
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L20
            java.util.Locale r2 = new java.util.Locale
            r1 = r1[r3]
            r2.<init>(r1)
            return r2
        L20:
            int r2 = r1.length
            r5 = 2
            if (r2 != r5) goto L2e
            java.util.Locale r2 = new java.util.Locale
            r3 = r1[r3]
            r1 = r1[r4]
            r2.<init>(r3, r1)
            return r2
        L2e:
            java.util.Locale r2 = new java.util.Locale
            r3 = r1[r3]
            r4 = r1[r4]
            r1 = r1[r5]
            r2.<init>(r3, r4, r1)
            return r2
        L3a:
            r1 = 0
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.String r1 = r1.readString()
            if (r1 == 0) goto L3a
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Ld
            goto L3a
        Ld:
            java.lang.String r2 = "_"
            java.lang.String[] r1 = r1.split(r2)
            int r2 = r1.length
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L20
            java.util.Locale r2 = new java.util.Locale
            r1 = r1[r3]
            r2.<init>(r1)
            return r2
        L20:
            int r2 = r1.length
            r5 = 2
            if (r2 != r5) goto L2e
            java.util.Locale r2 = new java.util.Locale
            r3 = r1[r3]
            r1 = r1[r4]
            r2.<init>(r3, r1)
            return r2
        L2e:
            java.util.Locale r2 = new java.util.Locale
            r3 = r1[r3]
            r4 = r1[r4]
            r1 = r1[r5]
            r2.<init>(r3, r4, r1)
            return r2
        L3a:
            r1 = 0
            return r1
    }
}
