package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderMisc implements ObjectReader {
    static final long HASH_ADDRESS = Fnv.hashCode64("address");
    static final long HASH_PORT = Fnv.hashCode64("port");
    private final Class objectClass;

    public ObjectReaderMisc(Class cls) {
        this.objectClass = cls;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        InetAddress inetAddress = null;
        if (jSONReader.nextIfNull()) {
            return null;
        }
        Class cls = this.objectClass;
        if (cls != InetSocketAddress.class) {
            C1569c.m6258a(jSONReader.info("not support : ".concat(cls.getName())));
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
