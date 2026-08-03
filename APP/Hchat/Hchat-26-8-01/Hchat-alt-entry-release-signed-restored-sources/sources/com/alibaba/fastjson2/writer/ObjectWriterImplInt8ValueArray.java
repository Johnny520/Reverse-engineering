package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.function.Function;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplInt8ValueArray extends ObjectWriterPrimitiveImpl {
    private final Function<Object, byte[]> function;
    static final ObjectWriterImplInt8ValueArray INSTANCE = new ObjectWriterImplInt8ValueArray(null);
    static final byte[] JSONB_TYPE_NAME_BYTES = JSONB.toBytes("[B");
    static final long JSONB_TYPE_HASH = Fnv.hashCode64("[B");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplInt8ValueArray(Function<Object, byte[]> function) {
        this.function = function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        Function<Object, byte[]> function = this.function;
        byte[] bArrApply = function != null ? function.apply(obj) : (byte[]) obj;
        String dateFormat = jSONWriter.context.getDateFormat();
        GZIPOutputStream gZIPOutputStream = null;
        if ("millis".equals(dateFormat)) {
            dateFormat = null;
        }
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0) {
            jSONWriter.writeString(bArrApply);
            return;
        }
        if ("gzip".equals(dateFormat) || "gzip,base64".equals(dateFormat)) {
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    gZIPOutputStream = bArrApply.length < 512 ? new GZIPOutputStream(byteArrayOutputStream, bArrApply.length) : new GZIPOutputStream(byteArrayOutputStream);
                    gZIPOutputStream.write(bArrApply);
                    gZIPOutputStream.finish();
                    bArrApply = byteArrayOutputStream.toByteArray();
                    IOUtils.close(gZIPOutputStream);
                } catch (IOException e6) {
                    throw new JSONException("write gzipBytes error", e6);
                }
            } catch (Throwable th2) {
                IOUtils.close(gZIPOutputStream);
                throw th2;
            }
        }
        if ("base64".equals(dateFormat) || "gzip,base64".equals(dateFormat) || (jSONWriter.getFeatures(j3) & JSONWriter.Feature.WriteByteArrayAsBase64.mask) != 0) {
            jSONWriter.writeBase64(bArrApply);
            return;
        }
        jSONWriter.startArray();
        for (int i9 = 0; i9 < bArrApply.length; i9++) {
            if (i9 != 0) {
                jSONWriter.writeComma();
            }
            jSONWriter.writeInt32(bArrApply[i9]);
        }
        jSONWriter.endArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (jSONWriter.isWriteTypeInfo(obj, type)) {
            if (obj == byte[].class) {
                jSONWriter.writeTypeName(JSONB_TYPE_NAME_BYTES, JSONB_TYPE_HASH);
            } else {
                jSONWriter.writeTypeName(obj.getClass().getName());
            }
        }
        Function<Object, byte[]> function = this.function;
        jSONWriter.writeBinary((function == null || obj == null) ? (byte[]) obj : function.apply(obj));
    }
}
