package com.google.gson;

import com.google.gson.internal.bind.TypeAdapters;

/* JADX INFO: loaded from: classes2.dex */
public enum LongSerializationPolicy {
    DEFAULT { // from class: com.google.gson.LongSerializationPolicy.1
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l) {
            return l == null ? JsonNull.INSTANCE : new JsonPrimitive(l);
        }

        @Override // com.google.gson.LongSerializationPolicy
        public TypeAdapter<Number> typeAdapter() {
            return TypeAdapters.LONG;
        }
    },
    STRING { // from class: com.google.gson.LongSerializationPolicy.2
        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l) {
            return l == null ? JsonNull.INSTANCE : new JsonPrimitive(l.toString());
        }

        @Override // com.google.gson.LongSerializationPolicy
        public TypeAdapter<Number> typeAdapter() {
            return TypeAdapters.LONG_AS_STRING;
        }
    };

    public abstract JsonElement serialize(Long l);

    public abstract TypeAdapter<Number> typeAdapter();
}
