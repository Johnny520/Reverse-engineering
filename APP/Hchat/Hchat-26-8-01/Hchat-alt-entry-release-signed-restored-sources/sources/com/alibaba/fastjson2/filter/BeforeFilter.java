package com.alibaba.fastjson2.filter;

import com.alibaba.fastjson2.JSONWriter;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BeforeFilter implements Filter {
    private static final ThreadLocal<JSONWriter> serializerLocal = new ThreadLocal<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeBefore(JSONWriter jSONWriter, Object obj) {
        ThreadLocal<JSONWriter> threadLocal = serializerLocal;
        JSONWriter jSONWriter2 = threadLocal.get();
        threadLocal.set(jSONWriter);
        writeBefore(obj);
        threadLocal.set(jSONWriter2);
    }

    public abstract void writeBefore(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeKeyValue(String str, Object obj) {
        JSONWriter jSONWriter = serializerLocal.get();
        boolean zContainsReference = jSONWriter.containsReference(obj);
        jSONWriter.writeName(str);
        jSONWriter.writeColon();
        jSONWriter.writeAny(obj);
        if (zContainsReference) {
            return;
        }
        jSONWriter.removeReference(obj);
    }
}
