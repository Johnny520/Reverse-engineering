package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplOptional extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplOptional INSTANCE = null;
    final java.lang.String format;
    final java.lang.Class itemClass;
    com.alibaba.fastjson2.reader.ObjectReader itemObjectReader;
    final java.lang.reflect.Type itemType;
    final java.util.Locale locale;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplOptional r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplOptional
            r1 = 0
            r0.<init>(r1, r1, r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplOptional.INSTANCE = r0
            return
    }

    public ObjectReaderImplOptional(java.lang.reflect.Type r3, java.lang.String r4, java.util.Locale r5) {
            r2 = this;
            java.lang.Class<java.util.Optional> r0 = java.util.Optional.class
            r2.<init>(r0)
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L17
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            int r0 = r3.length
            r1 = 1
            if (r0 != r1) goto L17
            r0 = 0
            r3 = r3[r0]
            goto L18
        L17:
            r3 = 0
        L18:
            r2.itemType = r3
            java.lang.Class r3 = com.alibaba.fastjson2.util.TypeUtils.getClass(r3)
            r2.itemClass = r3
            r2.format = r4
            r2.locale = r5
            return
    }

    public static com.alibaba.fastjson2.reader.ObjectReaderImplOptional of(java.lang.reflect.Type r1, java.lang.String r2, java.util.Locale r3) {
            if (r1 != 0) goto L5
            com.alibaba.fastjson2.reader.ObjectReaderImplOptional r1 = com.alibaba.fastjson2.reader.ObjectReaderImplOptional.INSTANCE
            return r1
        L5:
            com.alibaba.fastjson2.reader.ObjectReaderImplOptional r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplOptional
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r7, java.lang.reflect.Type r8, java.lang.Object r9, long r10) {
            r6 = this;
            java.lang.reflect.Type r8 = r6.itemType
            if (r8 != 0) goto L9
            java.lang.Object r7 = r7.readAny()
            goto L34
        L9:
            com.alibaba.fastjson2.reader.ObjectReader r10 = r6.itemObjectReader
            if (r10 != 0) goto L28
            java.lang.String r10 = r6.format
            if (r10 == 0) goto L1a
            java.lang.Class r11 = r6.itemClass
            java.util.Locale r0 = r6.locale
            com.alibaba.fastjson2.reader.ObjectReader r8 = com.alibaba.fastjson2.reader.FieldReader.createFormattedObjectReader(r8, r11, r10, r0)
            goto L1b
        L1a:
            r8 = 0
        L1b:
            if (r8 != 0) goto L26
            java.lang.reflect.Type r8 = r6.itemType
            com.alibaba.fastjson2.reader.ObjectReader r8 = r7.getObjectReader(r8)
            r6.itemObjectReader = r8
            goto L28
        L26:
            r6.itemObjectReader = r8
        L28:
            com.alibaba.fastjson2.reader.ObjectReader r0 = r6.itemObjectReader
            java.lang.reflect.Type r2 = r6.itemType
            r4 = 0
            r1 = r7
            r3 = r9
            java.lang.Object r7 = r0.readJSONBObject(r1, r2, r3, r4)
        L34:
            if (r7 != 0) goto L3b
            java.util.Optional r7 = java.util.Optional.empty()
            return r7
        L3b:
            java.util.Optional r7 = java.util.Optional.of(r7)
            return r7
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r7, java.lang.reflect.Type r8, java.lang.Object r9, long r10) {
            r6 = this;
            java.lang.reflect.Type r8 = r6.itemType
            if (r8 != 0) goto L9
            java.lang.Object r7 = r7.readAny()
            goto L34
        L9:
            com.alibaba.fastjson2.reader.ObjectReader r10 = r6.itemObjectReader
            if (r10 != 0) goto L28
            java.lang.String r10 = r6.format
            if (r10 == 0) goto L1a
            java.lang.Class r11 = r6.itemClass
            java.util.Locale r0 = r6.locale
            com.alibaba.fastjson2.reader.ObjectReader r8 = com.alibaba.fastjson2.reader.FieldReader.createFormattedObjectReader(r8, r11, r10, r0)
            goto L1b
        L1a:
            r8 = 0
        L1b:
            if (r8 != 0) goto L26
            java.lang.reflect.Type r8 = r6.itemType
            com.alibaba.fastjson2.reader.ObjectReader r8 = r7.getObjectReader(r8)
            r6.itemObjectReader = r8
            goto L28
        L26:
            r6.itemObjectReader = r8
        L28:
            com.alibaba.fastjson2.reader.ObjectReader r0 = r6.itemObjectReader
            java.lang.reflect.Type r2 = r6.itemType
            r4 = 0
            r1 = r7
            r3 = r9
            java.lang.Object r7 = r0.readObject(r1, r2, r3, r4)
        L34:
            if (r7 != 0) goto L3b
            java.util.Optional r7 = java.util.Optional.empty()
            return r7
        L3b:
            java.util.Optional r7 = java.util.Optional.of(r7)
            return r7
    }
}
