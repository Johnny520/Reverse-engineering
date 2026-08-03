package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderMisc implements ObjectReader {
    static final long HASH_ADDRESS = Fnv.hashCode64("address");
    static final long HASH_PORT = Fnv.hashCode64("port");
    private final Class objectClass;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderMisc(Class cls) {
        this.objectClass = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        InetAddress inetAddress = null;
        if (jSONReader.nextIfNull()) {
            return null;
        }
        Class cls = this.objectClass;
        if (cls != InetSocketAddress.class) {
            C0086a.m464w(jSONReader.info("not support : ".concat(cls.getName())));
            return null;
        }
        jSONReader.nextIfObjectStart();
        int iIntValue = 0;
        while (!jSONReader.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode == HASH_ADDRESS) {
                inetAddress = (InetAddress) jSONReader.read(InetAddress.class);
            } else if (fieldNameHashCode == HASH_PORT) {
                iIntValue = jSONReader.readInt32().intValue();
            } else {
                jSONReader.skipValue();
            }
        }
        jSONReader.nextIfComma();
        return new InetSocketAddress(inetAddress, iIntValue);
    }
}
