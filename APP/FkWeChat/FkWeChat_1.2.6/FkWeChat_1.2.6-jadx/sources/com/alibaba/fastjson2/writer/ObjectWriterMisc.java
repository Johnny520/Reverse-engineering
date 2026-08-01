package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterMisc implements ObjectWriter {
    static final ObjectWriterMisc INSTANCE = new ObjectWriterMisc();

    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
        /*
            r0 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            java.lang.Class r3 = r2.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "java.util.regex.Pattern"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto La1
            java.lang.String r4 = "net.sf.json.JSONNull"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L9d
            java.lang.String r4 = "java.net.Inet6Address"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L96
            java.lang.String r4 = "com.fasterxml.jackson.databind.node.ArrayNode"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L7e
            java.lang.String r4 = "java.net.Inet4Address"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L96
            java.lang.String r4 = "java.text.SimpleDateFormat"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L77
            java.lang.String r4 = "java.net.InetSocketAddress"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L6d
            java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2
            r1.startObject()
            java.lang.String r3 = "address"
            r1.writeName(r3)
            r1.writeColon()
            java.net.InetAddress r3 = r2.getAddress()
            r1.writeAny(r3)
            java.lang.String r3 = "port"
            r1.writeName(r3)
            r1.writeColon()
            int r2 = r2.getPort()
            r1.writeInt32(r2)
            r1.endObject()
            return
        L6d:
            java.lang.String r1 = "not support class : "
            java.lang.String r1 = r1.concat(r3)
            com.alibaba.fastjson2.C1569c.m6258a(r1)
            return
        L77:
            java.text.SimpleDateFormat r2 = (java.text.SimpleDateFormat) r2
            java.lang.String r2 = r2.toPattern()
            goto La7
        L7e:
            java.lang.String r2 = r2.toString()
            boolean r3 = r1.isUTF8()
            if (r3 == 0) goto L92
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r2 = r2.getBytes(r3)
            r1.writeRaw(r2)
            return
        L92:
            r1.writeRaw(r2)
            return
        L96:
            java.net.InetAddress r2 = (java.net.InetAddress) r2
            java.lang.String r2 = r2.getHostName()
            goto La7
        L9d:
            r1.writeNull()
            return
        La1:
            java.util.regex.Pattern r2 = (java.util.regex.Pattern) r2
            java.lang.String r2 = r2.pattern()
        La7:
            r1.writeString(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.ObjectWriterMisc.write(com.alibaba.fastjson2.JSONWriter, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }
}
