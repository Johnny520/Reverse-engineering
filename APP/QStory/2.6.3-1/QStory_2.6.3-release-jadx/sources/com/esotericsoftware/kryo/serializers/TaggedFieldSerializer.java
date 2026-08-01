package com.esotericsoftware.kryo.serializers;

import androidx.activity.AbstractC0900;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.p006io.Input;
import com.esotericsoftware.kryo.p006io.InputChunked;
import com.esotericsoftware.kryo.p006io.Output;
import com.esotericsoftware.kryo.p006io.OutputChunked;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.kryo.util.IntMap;
import com.esotericsoftware.kryo.util.Util;
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
        public TaggedFieldSerializerConfig mo7452clone() {
            return (TaggedFieldSerializerConfig) super.mo7452clone();
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
    */
    public T read(Kryo kryo, Input input, Class<? extends T> cls) {
        Input input2;
        Input inputChunked;
        ?? r19;
        IntMap<FieldSerializer.CachedField> intMap;
        int i;
        Input input3 = input;
        boolean z = true;
        int varInt = input3.readVarInt(true);
        if (varInt == 0) {
            return null;
        }
        int i2 = varInt - 1;
        int iPushTypeVariables = pushTypeVariables();
        T tCreate = create(kryo, input, cls);
        kryo.reference(tCreate);
        TaggedFieldSerializerConfig taggedFieldSerializerConfig = this.config;
        boolean z2 = taggedFieldSerializerConfig.chunked;
        boolean z3 = taggedFieldSerializerConfig.readUnknownTagData;
        if (z2) {
            inputChunked = new InputChunked(input3, this.config.chunkSize);
            input2 = inputChunked;
        } else {
            input2 = null;
            inputChunked = input3;
        }
        IntMap<FieldSerializer.CachedField> intMap2 = this.readTags;
        int i3 = 0;
        ?? r13 = input2;
        while (i3 < i2) {
            int i4 = i2;
            int varInt2 = input3.readVarInt(z);
            FieldSerializer.CachedField cachedField = intMap2.get(varInt2);
            boolean z4 = z2;
            boolean z5 = z3;
            if (z5) {
                try {
                    Registration registration = kryo.readClass(inputChunked);
                    if (registration == null) {
                        if (z4) {
                            r13.nextChunk();
                        }
                        r19 = r13;
                        intMap = intMap2;
                        i = i3;
                    } else {
                        r19 = r13;
                        Class type = registration.getType();
                        if (cachedField == null) {
                            intMap = intMap2;
                            if (Log.TRACE) {
                                StringBuilder sbM710 = AbstractC0900.m710(varInt2, "Read unknown tag ", " data, type: ");
                                i = i3;
                                sbM710.append(Util.className(type));
                                Log.trace("kryo", sbM710.toString());
                            } else {
                                i = i3;
                            }
                            try {
                                kryo.readObject(inputChunked, type);
                            } catch (KryoException e) {
                                StringBuilder sbM7102 = AbstractC0900.m710(varInt2, "Unable to read unknown tag ", " data, type: ");
                                sbM7102.append(Util.className(type));
                                sbM7102.append(" (");
                                sbM7102.append(getType().getName());
                                sbM7102.append("#");
                                sbM7102.append(cachedField);
                                sbM7102.append(")");
                                String string = sbM7102.toString();
                                if (!z4) {
                                    throw new KryoException(string, e);
                                }
                                if (Log.DEBUG) {
                                    Log.debug("kryo", string, e);
                                }
                            }
                            if (z4) {
                                r19.nextChunk();
                            }
                        } else {
                            intMap = intMap2;
                            i = i3;
                            cachedField.setCanBeNull(false);
                            cachedField.setValueClass(type);
                            cachedField.setReuseSerializer(false);
                            r19 = r19;
                            if (Log.TRACE) {
                                log("Read", cachedField, input.position());
                            }
                            cachedField.read(inputChunked, tCreate);
                            if (!z4) {
                                r19.nextChunk();
                            }
                        }
                    }
                } catch (KryoException e2) {
                    r19 = r13;
                    intMap = intMap2;
                    i = i3;
                    StringBuilder sbM7103 = AbstractC0900.m710(varInt2, "Unable to read unknown tag ", " data (unknown type). (");
                    sbM7103.append(getType().getName());
                    sbM7103.append("#");
                    sbM7103.append(cachedField);
                    sbM7103.append(")");
                    String string2 = sbM7103.toString();
                    if (!z4) {
                        throw new KryoException(string2, e2);
                    }
                    if (Log.DEBUG) {
                        Log.debug("kryo", string2, e2);
                    }
                    r19.nextChunk();
                }
            } else {
                r19 = r13;
                intMap = intMap2;
                i = i3;
                r19 = r19;
                if (cachedField != null) {
                    if (Log.TRACE) {
                    }
                    cachedField.read(inputChunked, tCreate);
                    if (!z4) {
                    }
                } else {
                    if (!z4) {
                        StringBuilder sbM7104 = AbstractC0900.m710(varInt2, "Unknown field tag: ", " (");
                        sbM7104.append(getType().getName());
                        sbM7104.append(")");
                        throw new KryoException(sbM7104.toString());
                    }
                    if (Log.TRACE) {
                        Log.trace("kryo", "Skip unknown field tag: " + varInt2);
                    }
                    r19.nextChunk();
                }
            }
            i3 = i + 1;
            input3 = input;
            i2 = i4;
            z2 = z4;
            z3 = z5;
            r13 = r19;
            intMap2 = intMap;
            z = true;
        }
        popTypeVariables(iPushTypeVariables);
        return tCreate;
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
