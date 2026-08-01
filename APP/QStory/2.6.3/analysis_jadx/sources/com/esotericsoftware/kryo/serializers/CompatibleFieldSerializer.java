package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
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
        public CompatibleFieldSerializerConfig mo6893clone() {
            return (CompatibleFieldSerializerConfig) super.mo6893clone();
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
        To view partially-correct add '--show-bad-code' argument
    */
    public T read(com.esotericsoftware.kryo.Kryo r20, com.esotericsoftware.kryo.io.Input r21, java.lang.Class<? extends T> r22) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.CompatibleFieldSerializer.read(com.esotericsoftware.kryo.Kryo, com.esotericsoftware.kryo.io.Input, java.lang.Class):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer, com.esotericsoftware.kryo.Serializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(com.esotericsoftware.kryo.Kryo r17, com.esotericsoftware.kryo.io.Output r18, T r19) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.serializers.CompatibleFieldSerializer.write(com.esotericsoftware.kryo.Kryo, com.esotericsoftware.kryo.io.Output, java.lang.Object):void");
    }

    public CompatibleFieldSerializer(Kryo kryo, Class cls, CompatibleFieldSerializerConfig compatibleFieldSerializerConfig) {
        super(kryo, cls, compatibleFieldSerializerConfig);
        this.config = compatibleFieldSerializerConfig;
    }
}
