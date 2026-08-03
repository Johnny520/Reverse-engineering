package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterMisc implements ObjectWriter {
    static final ObjectWriterMisc INSTANCE = new ObjectWriterMisc();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        String strPattern;
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        String name = obj.getClass().getName();
        if (name.equals("java.util.regex.Pattern")) {
            strPattern = ((Pattern) obj).pattern();
        } else {
            if (name.equals("net.sf.json.JSONNull")) {
                jSONWriter.writeNull();
                return;
            }
            if (name.equals("java.net.Inet6Address")) {
                strPattern = ((InetAddress) obj).getHostName();
            } else {
                if (name.equals("com.fasterxml.jackson.databind.node.ArrayNode")) {
                    String string = obj.toString();
                    if (jSONWriter.isUTF8()) {
                        jSONWriter.writeRaw(string.getBytes(StandardCharsets.UTF_8));
                        return;
                    } else {
                        jSONWriter.writeRaw(string);
                        return;
                    }
                }
                if (!name.equals("java.net.Inet4Address")) {
                    if (!name.equals("java.text.SimpleDateFormat")) {
                        if (!name.equals("java.net.InetSocketAddress")) {
                            C0086a.m464w("not support class : ".concat(name));
                            return;
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
                        jSONWriter.startObject();
                        jSONWriter.writeName("address");
                        jSONWriter.writeColon();
                        jSONWriter.writeAny(inetSocketAddress.getAddress());
                        jSONWriter.writeName("port");
                        jSONWriter.writeColon();
                        jSONWriter.writeInt32(inetSocketAddress.getPort());
                        jSONWriter.endObject();
                        return;
                    }
                    strPattern = ((SimpleDateFormat) obj).toPattern();
                }
            }
        }
        jSONWriter.writeString(strPattern);
    }
}
