package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.p006io.Input;
import com.esotericsoftware.kryo.p006io.InputChunked;
import com.esotericsoftware.kryo.p006io.Output;
import com.esotericsoftware.kryo.p006io.OutputChunked;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.kryo.util.ObjectMap;
import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class CompatibleFieldSerializer<T> extends FieldSerializer<T> {
    private static final int binarySearchThreshold = 32;
    private final CompatibleFieldSerializerConfig config;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class CompatibleFieldSerializerConfig extends FieldSerializer.FieldSerializerConfig {
        boolean chunked;
        boolean readUnknownFieldData = true;
        int chunkSize = 1024;

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.FieldSerializerConfig
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public CompatibleFieldSerializerConfig mo7452clone() {
            return (CompatibleFieldSerializerConfig) super.mo7452clone();
        }

        public int getChunkSize() {
            return this.chunkSize;
        }

        public boolean getChunkedEncoding() {
            return this.chunked;
        }

        public boolean getReadUnknownTagData() {
            return this.readUnknownFieldData;
        }

        public void setChunkSize(int i) {
            this.chunkSize = i;
            if (Log.TRACE) {
                Log.trace("kryo", "CompatibleFieldSerializerConfig setChunkSize: " + i);
            }
        }

        public void setChunkedEncoding(boolean z) {
            this.chunked = z;
            if (Log.TRACE) {
                Log.trace("kryo", "CompatibleFieldSerializerConfig setChunked: " + z);
            }
        }

        public void setReadUnknownFieldData(boolean z) {
            this.readUnknownFieldData = z;
        }
    }

    public CompatibleFieldSerializer(Kryo kryo, Class cls) {
        this(kryo, cls, new CompatibleFieldSerializerConfig());
    }

    private FieldSerializer.CachedField[] readFields(Kryo kryo, Input input) {
        if (Log.TRACE) {
            Log.trace("kryo", "Read fields for class: ".concat(this.type.getName()));
        }
        int varInt = input.readVarInt(true);
        String[] strArr = new String[varInt];
        for (int i = 0; i < varInt; i++) {
            strArr[i] = input.readString();
            if (Log.TRACE) {
                Log.trace("kryo", "Read field name: " + strArr[i]);
            }
        }
        FieldSerializer.CachedField[] cachedFieldArr = new FieldSerializer.CachedField[varInt];
        FieldSerializer.CachedField[] cachedFieldArr2 = this.cachedFields.fields;
        if (varInt < 32) {
            for (int i2 = 0; i2 < varInt; i2++) {
                String str = strArr[i2];
                int length = cachedFieldArr2.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        if (cachedFieldArr2[i3].name.equals(str)) {
                            cachedFieldArr[i2] = cachedFieldArr2[i3];
                            break;
                        }
                        i3++;
                    } else if (Log.TRACE) {
                        Log.trace("kryo", "Unknown field will be skipped: " + str);
                    }
                }
            }
        } else {
            int length2 = cachedFieldArr2.length - 1;
            for (int i4 = 0; i4 < varInt; i4++) {
                String str2 = strArr[i4];
                int i5 = 0;
                int i6 = length2;
                while (true) {
                    if (i5 <= i6) {
                        int i7 = (i5 + i6) >>> 1;
                        int iCompareTo = str2.compareTo(cachedFieldArr2[i7].name);
                        if (iCompareTo >= 0) {
                            if (iCompareTo <= 0) {
                                cachedFieldArr[i4] = cachedFieldArr2[i7];
                                break;
                            }
                            i5 = i7 + 1;
                        } else {
                            i6 = i7 - 1;
                        }
                    } else if (Log.TRACE) {
                        Log.trace("kryo", "Unknown field will be skipped: " + str2);
                    }
                }
            }
        }
        kryo.getGraphContext().put(this, cachedFieldArr);
        return cachedFieldArr;
    }

    public CompatibleFieldSerializerConfig getCompatibleFieldSerializerConfig() {
        return this.config;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b8 A[SYNTHETIC] */
    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer, com.esotericsoftware.kryo.Serializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T read(Kryo kryo, Input input, Class<? extends T> cls) {
        InputChunked inputChunked;
        Input inputChunked2;
        boolean z;
        boolean z2;
        Kryo kryo2 = kryo;
        int iPushTypeVariables = pushTypeVariables();
        T tCreate = create(kryo, input, cls);
        kryo2.reference(tCreate);
        FieldSerializer.CachedField[] fields = (FieldSerializer.CachedField[]) kryo2.getGraphContext().get(this);
        if (fields == null) {
            fields = readFields(kryo, input);
        }
        FieldSerializer.CachedField[] cachedFieldArr = fields;
        CompatibleFieldSerializerConfig compatibleFieldSerializerConfig = this.config;
        boolean z3 = compatibleFieldSerializerConfig.chunked;
        boolean z4 = compatibleFieldSerializerConfig.readUnknownFieldData;
        if (z3) {
            inputChunked2 = new InputChunked(input, this.config.chunkSize);
            inputChunked = inputChunked2;
        } else {
            inputChunked = 0;
            inputChunked2 = input;
        }
        int length = cachedFieldArr.length;
        int i = 0;
        while (i < length) {
            FieldSerializer.CachedField cachedField = cachedFieldArr[i];
            FieldSerializer.CachedField[] cachedFieldArr2 = cachedFieldArr;
            if (z4) {
                try {
                    Registration registration = kryo2.readClass(inputChunked2);
                    if (registration == null) {
                        if (z3) {
                            inputChunked.nextChunk();
                        }
                        z = z3;
                        z2 = z4;
                    } else {
                        z = z3;
                        Class type = registration.getType();
                        z2 = z4;
                        if (cachedField == null) {
                            if (Log.TRACE) {
                                Log.trace("kryo", "Read unknown data, type: " + Util.className(type) + Util.pos(input.position()));
                            }
                            try {
                                kryo2.readObject(inputChunked2, type);
                            } catch (KryoException e) {
                                String str = "Unable to read unknown data, type: " + Util.className(type) + " (" + getType().getName() + "#" + cachedField + ")";
                                if (!z) {
                                    throw new KryoException(str, e);
                                }
                                if (Log.DEBUG) {
                                    Log.debug("kryo", str, e);
                                }
                            }
                            if (z) {
                                inputChunked.nextChunk();
                            }
                        } else if (cachedField.valueClass == null || Util.isAssignableTo(type, cachedField.field.getType())) {
                            cachedField.setCanBeNull(false);
                            cachedField.setValueClass(type);
                            cachedField.setReuseSerializer(false);
                            if (Log.TRACE) {
                                log("Read", cachedField, input.position());
                            }
                            cachedField.read(inputChunked2, tCreate);
                            if (!z) {
                                inputChunked.nextChunk();
                            }
                        } else {
                            String str2 = "Read type is incompatible with the field type: " + Util.className(type) + " -> " + Util.className(cachedField.valueClass) + " (" + getType().getName() + "#" + cachedField + ")";
                            if (!z) {
                                throw new KryoException(str2);
                            }
                            if (Log.DEBUG) {
                                Log.debug("kryo", str2);
                            }
                            inputChunked.nextChunk();
                        }
                    }
                } catch (KryoException e2) {
                    z = z3;
                    z2 = z4;
                    String str3 = "Unable to read unknown data (unknown type). (" + getType().getName() + "#" + cachedField + ")";
                    if (!z) {
                        throw new KryoException(str3, e2);
                    }
                    if (Log.DEBUG) {
                        Log.debug("kryo", str3, e2);
                    }
                    inputChunked.nextChunk();
                }
            } else {
                z = z3;
                z2 = z4;
                if (cachedField != null) {
                    if (Log.TRACE) {
                    }
                    cachedField.read(inputChunked2, tCreate);
                    if (!z) {
                    }
                } else {
                    if (!z) {
                        throw new KryoException("Unknown field. (" + getType().getName() + ")");
                    }
                    if (Log.TRACE) {
                        Log.trace("kryo", "Skip unknown field.");
                    }
                    inputChunked.nextChunk();
                }
            }
            i++;
            kryo2 = kryo;
            cachedFieldArr = cachedFieldArr2;
            z3 = z;
            z4 = z2;
        }
        popTypeVariables(iPushTypeVariables);
        return tCreate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer, com.esotericsoftware.kryo.Serializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void write(Kryo kryo, Output output, T t) {
        Output outputChunked;
        OutputChunked outputChunked2;
        Object obj;
        int iPushTypeVariables = pushTypeVariables();
        FieldSerializer.CachedField[] cachedFieldArr = this.cachedFields.fields;
        ObjectMap graphContext = kryo.getGraphContext();
        if (!graphContext.containsKey(this)) {
            if (Log.TRACE) {
                Log.trace("kryo", "Write fields for class: ".concat(this.type.getName()));
            }
            graphContext.put(this, null);
            output.writeVarInt(cachedFieldArr.length, true);
            int length = cachedFieldArr.length;
            for (int i = 0; i < length; i++) {
                if (Log.TRACE) {
                    Log.trace("kryo", "Write field name: " + cachedFieldArr[i].name + Util.pos(output.position()));
                }
                output.writeString(cachedFieldArr[i].name);
            }
        }
        CompatibleFieldSerializerConfig compatibleFieldSerializerConfig = this.config;
        boolean z = compatibleFieldSerializerConfig.chunked;
        boolean z2 = compatibleFieldSerializerConfig.readUnknownFieldData;
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
            if (z2) {
                if (t != null) {
                    try {
                        obj = cachedField.field.get(t);
                    } catch (IllegalAccessException unused) {
                    }
                    Class<?> cls = obj != null ? obj.getClass() : null;
                    kryo.writeClass(outputChunked, cls);
                    if (cls != null) {
                        cachedField.setCanBeNull(false);
                        cachedField.setValueClass(cls);
                        cachedField.setReuseSerializer(false);
                    } else if (z) {
                        outputChunked2.endChunk();
                    }
                }
            }
            cachedField.write(outputChunked, t);
            if (z) {
                outputChunked2.endChunk();
            }
        }
        popTypeVariables(iPushTypeVariables);
    }

    public CompatibleFieldSerializer(Kryo kryo, Class cls, CompatibleFieldSerializerConfig compatibleFieldSerializerConfig) {
        super(kryo, cls, compatibleFieldSerializerConfig);
        this.config = compatibleFieldSerializerConfig;
    }
}
