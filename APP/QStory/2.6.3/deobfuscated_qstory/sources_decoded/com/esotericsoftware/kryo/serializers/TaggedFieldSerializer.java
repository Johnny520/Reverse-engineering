package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.io.OutputChunked;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.kryo.util.IntMap;
import com.esotericsoftware.minlog.Log;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class TaggedFieldSerializer<T> extends FieldSerializer<T> {
    private final TaggedFieldSerializerConfig config;
    private IntMap<FieldSerializer.CachedField> readTags;
    private FieldSerializer.CachedField[] writeTags;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Tag {
        int value();
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class TaggedFieldSerializerConfig extends FieldSerializer.FieldSerializerConfig {
        int chunkSize = 1024;
        boolean chunked;
        boolean readUnknownTagData;

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.FieldSerializerConfig
        /* JADX INFO: renamed from: clone */
        public TaggedFieldSerializerConfig mo6893clone() {
            return (TaggedFieldSerializerConfig) super.mo6893clone();
        }

        public int getChunkSize() {
            return this.chunkSize;
        }

        public boolean getChunkedEncoding() {
            return this.chunked;
        }

        public boolean getReadUnknownTagData() {
            return this.readUnknownTagData;
        }

        public void setChunkSize(int i) {
            this.chunkSize = i;
            if (Log.TRACE) {
                Log.trace("kryo", "TaggedFieldSerializerConfig setChunkSize: " + i);
            }
        }

        public void setChunkedEncoding(boolean z) {
            this.chunked = z;
            if (Log.TRACE) {
                Log.trace("kryo", "TaggedFieldSerializerConfig setChunked: " + z);
            }
        }

        public void setReadUnknownTagData(boolean z) {
            this.readUnknownTagData = z;
        }
    }

    public TaggedFieldSerializer(Kryo kryo, Class cls, TaggedFieldSerializerConfig taggedFieldSerializerConfig) {
        super(kryo, cls, taggedFieldSerializerConfig);
        this.config = taggedFieldSerializerConfig;
        setAcceptsNull(true);
    }

    public TaggedFieldSerializerConfig getTaggedFieldSerializerConfig() {
        return this.config;
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer
    public void initializeCachedFields() {
        FieldSerializer.CachedField[] cachedFieldArr = this.cachedFields.fields;
        int length = cachedFieldArr.length;
        for (int i = 0; i < length; i++) {
            if (cachedFieldArr[i].field.getAnnotation(Tag.class) == null) {
                if (Log.TRACE) {
                    Log.trace("kryo", "Ignoring field without tag: " + cachedFieldArr[i]);
                }
                super.removeField(cachedFieldArr[i]);
            }
        }
        FieldSerializer.CachedField[] cachedFieldArr2 = this.cachedFields.fields;
        ArrayList arrayList = new ArrayList(cachedFieldArr2.length);
        this.readTags = new IntMap<>((int) (cachedFieldArr2.length / 0.8f));
        for (FieldSerializer.CachedField cachedField : cachedFieldArr2) {
            Field field = cachedField.field;
            int iValue = ((Tag) field.getAnnotation(Tag.class)).value();
            if (this.readTags.containsKey(iValue)) {
                throw new KryoException(String.format("Duplicate tag %d on fields: %s and %s", Integer.valueOf(iValue), field, arrayList.get(iValue)));
            }
            this.readTags.put(iValue, cachedField);
            if (field.getAnnotation(Deprecated.class) == null) {
                arrayList.add(cachedField);
            }
            cachedField.tag = iValue;
        }
        this.writeTags = (FieldSerializer.CachedField[]) arrayList.toArray(new FieldSerializer.CachedField[arrayList.size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.esotericsoftware.kryo.io.InputChunked] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.esotericsoftware.kryo.io.InputChunked] */
    /* JADX WARN: Type inference failed for: r19v1, types: [com.esotericsoftware.kryo.io.InputChunked] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4, types: [com.esotericsoftware.kryo.io.InputChunked] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6, types: [com.esotericsoftware.kryo.io.InputChunked] */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer, com.esotericsoftware.kryo.Serializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T read(com.esotericsoftware.kryo.Kryo r23, com.esotericsoftware.kryo.io.Input r24, java.lang.Class<? extends T> r25) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.TaggedFieldSerializer.read(com.esotericsoftware.kryo.Kryo, com.esotericsoftware.kryo.io.Input, java.lang.Class):java.lang.Object");
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer
    public void removeField(String str) {
        super.removeField(str);
        initializeCachedFields();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer, com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t) {
        Output outputChunked;
        OutputChunked outputChunked2;
        Object obj;
        if (t == null) {
            output.writeByte((byte) 0);
            return;
        }
        int iPushTypeVariables = pushTypeVariables();
        FieldSerializer.CachedField[] cachedFieldArr = this.writeTags;
        output.writeVarInt(cachedFieldArr.length + 1, true);
        writeHeader(kryo, output, t);
        TaggedFieldSerializerConfig taggedFieldSerializerConfig = this.config;
        boolean z = taggedFieldSerializerConfig.chunked;
        boolean z2 = taggedFieldSerializerConfig.readUnknownTagData;
        if (z) {
            outputChunked = new OutputChunked(output, this.config.chunkSize);
            outputChunked2 = outputChunked;
        } else {
            outputChunked = output;
            outputChunked2 = 0;
        }
        for (FieldSerializer.CachedField cachedField : cachedFieldArr) {
            if (Log.TRACE) {
                log("Write", cachedField, output.position());
            }
            output.writeVarInt(cachedField.tag, true);
            if (z2) {
                try {
                    obj = cachedField.field.get(t);
                } catch (IllegalAccessException unused) {
                }
                Class<?> cls = obj != null ? obj.getClass() : null;
                kryo.writeClass(outputChunked, cls);
                if (cls == null) {
                    if (z) {
                        outputChunked2.endChunk();
                    }
                } else {
                    cachedField.setCanBeNull(false);
                    cachedField.setValueClass(cls);
                    cachedField.setReuseSerializer(false);
                }
            }
            cachedField.write(outputChunked, t);
            if (z) {
                outputChunked2.endChunk();
            }
        }
        popTypeVariables(iPushTypeVariables);
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer
    public void removeField(FieldSerializer.CachedField cachedField) {
        super.removeField(cachedField);
        initializeCachedFields();
    }

    public TaggedFieldSerializer(Kryo kryo, Class cls) {
        this(kryo, cls, new TaggedFieldSerializerConfig());
    }

    public void writeHeader(Kryo kryo, Output output, T t) {
    }
}
