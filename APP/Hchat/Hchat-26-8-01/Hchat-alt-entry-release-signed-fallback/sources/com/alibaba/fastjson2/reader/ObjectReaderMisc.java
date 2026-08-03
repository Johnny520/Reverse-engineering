package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderMisc implements com.alibaba.fastjson2.reader.ObjectReader {
    static final long HASH_ADDRESS = 0;
    static final long HASH_PORT = 0;
    private final java.lang.Class objectClass;

    static {
            java.lang.String r0 = "address"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderMisc.HASH_ADDRESS = r0
            java.lang.String r0 = "port"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderMisc.HASH_PORT = r0
            return
    }

    public ObjectReaderMisc(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.objectClass = r1
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r3, java.lang.reflect.Type r4, java.lang.Object r5, long r6) {
            r2 = this;
            boolean r4 = r3.nextIfNull()
            r5 = 0
            if (r4 == 0) goto L8
            return r5
        L8:
            java.lang.Class r4 = r2.objectClass
            java.lang.Class<java.net.InetSocketAddress> r6 = java.net.InetSocketAddress.class
            if (r4 != r6) goto L47
            r3.nextIfObjectStart()
            r4 = 0
        L12:
            boolean r6 = r3.nextIfObjectEnd()
            if (r6 == 0) goto L21
            r3.nextIfComma()
            java.net.InetSocketAddress r3 = new java.net.InetSocketAddress
            r3.<init>(r5, r4)
            return r3
        L21:
            long r6 = r3.readFieldNameHashCode()
            long r0 = com.alibaba.fastjson2.reader.ObjectReaderMisc.HASH_ADDRESS
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L34
            java.lang.Class<java.net.InetAddress> r5 = java.net.InetAddress.class
            java.lang.Object r5 = r3.read(r5)
            java.net.InetAddress r5 = (java.net.InetAddress) r5
            goto L12
        L34:
            long r0 = com.alibaba.fastjson2.reader.ObjectReaderMisc.HASH_PORT
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L43
            java.lang.Integer r4 = r3.readInt32()
            int r4 = r4.intValue()
            goto L12
        L43:
            r3.skipValue()
            goto L12
        L47:
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "not support : "
            java.lang.String r4 = r5.concat(r4)
            java.lang.String r3 = r3.info(r4)
            ah.a.w(r3)
            r3 = 0
            return r3
    }
}
