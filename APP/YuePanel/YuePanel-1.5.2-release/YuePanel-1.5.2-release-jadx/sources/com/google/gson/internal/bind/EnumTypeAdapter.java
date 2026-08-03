package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {
    static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Class<? super T> rawType = typeToken.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new EnumTypeAdapter(rawType);
        }
    };
    private final Map<T, String> constantToName;
    private final Map<String, T> nameToConstant;
    private final Map<String, T> stringToConstant;

    private static int calculateHashMapCapacity(int i) {
        return (int) Math.ceil(i / 0.75f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private EnumTypeAdapter(Class<T> cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            int iCalculateHashMapCapacity = calculateHashMapCapacity(i);
            this.nameToConstant = new HashMap(iCalculateHashMapCapacity);
            this.stringToConstant = new HashMap(iCalculateHashMapCapacity);
            this.constantToName = new HashMap(iCalculateHashMapCapacity);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String strName = r4.name();
                String string = r4.toString();
                SerializedName serializedName = (SerializedName) field2.getAnnotation(SerializedName.class);
                if (serializedName != null) {
                    strName = serializedName.value();
                    for (String str : serializedName.alternate()) {
                        this.nameToConstant.put(str, (T) r4);
                    }
                }
                this.nameToConstant.put(strName, (T) r4);
                this.stringToConstant.put(string, (T) r4);
                this.constantToName.put((T) r4, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object; */
    @Override // com.google.gson.TypeAdapter
    public T read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        T t = this.nameToConstant.get(strNextString);
        return t == null ? this.stringToConstant.get(strNextString) : t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V */
    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t) throws IOException {
        jsonWriter.value(t == null ? null : this.constantToName.get(t));
    }
}
