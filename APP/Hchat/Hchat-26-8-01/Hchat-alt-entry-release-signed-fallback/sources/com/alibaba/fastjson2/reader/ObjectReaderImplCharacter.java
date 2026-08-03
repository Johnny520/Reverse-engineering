package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplCharacter extends com.alibaba.fastjson2.reader.ObjectReaderPrimitive {
    static final com.alibaba.fastjson2.reader.ObjectReaderImplCharacter INSTANCE = null;

    static {
            com.alibaba.fastjson2.reader.ObjectReaderImplCharacter r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplCharacter
            r0.<init>()
            com.alibaba.fastjson2.reader.ObjectReaderImplCharacter.INSTANCE = r0
            return
    }

    public ObjectReaderImplCharacter() {
            r1 = this;
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            r1.<init>(r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            boolean r2 = r1.nextIfNull()
            if (r2 == 0) goto L8
            r1 = 0
            return r1
        L8:
            char r1 = r1.readCharValue()
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.String r1 = r1.readString()
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r2 = 0
            char r1 = r1.charAt(r2)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            return r1
    }
}
