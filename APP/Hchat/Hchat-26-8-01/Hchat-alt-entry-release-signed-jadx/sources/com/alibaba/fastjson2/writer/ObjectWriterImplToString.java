package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterImplToString extends ObjectWriterPrimitiveImpl {
    private final boolean direct;
    public static final ObjectWriterImplToString INSTANCE = new ObjectWriterImplToString(false);
    public static final ObjectWriterImplToString DIRECT = new ObjectWriterImplToString(true);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplToString(boolean z9) {
        this.direct = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
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
