package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterImplToString extends ObjectWriterPrimitiveImpl {
    private final boolean direct;
    public static final ObjectWriterImplToString INSTANCE = new ObjectWriterImplToString(false);
    public static final ObjectWriterImplToString DIRECT = new ObjectWriterImplToString(true);

    public ObjectWriterImplToString(boolean z10) {
        this.direct = z10;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        String string = obj.toString();
        if (this.direct) {
            jSONWriter.writeRaw(string);
        } else {
            jSONWriter.writeString(string);
        }
    }

    public ObjectWriterImplToString() {
        this(false);
    }
}
