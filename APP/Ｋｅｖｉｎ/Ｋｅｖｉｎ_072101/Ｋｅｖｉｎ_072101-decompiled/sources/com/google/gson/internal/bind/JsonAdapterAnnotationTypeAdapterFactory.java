package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;

    public JsonAdapterAnnotationTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor r1) {
            r0 = this;
            r0.<init>()
            r0.constructorConstructor = r1
            return
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r4, com.google.gson.reflect.TypeToken<T> r5) {
            r3 = this;
            java.lang.Class r0 = r5.getRawType()
            java.lang.Class<com.google.gson.annotations.JsonAdapter> r1 = com.google.gson.annotations.JsonAdapter.class
            java.lang.annotation.Annotation r1 = r0.getAnnotation(r1)
            com.google.gson.annotations.JsonAdapter r1 = (com.google.gson.annotations.JsonAdapter) r1
            if (r1 != 0) goto L10
            r2 = 0
            return r2
        L10:
            com.google.gson.internal.ConstructorConstructor r2 = r3.constructorConstructor
            com.google.gson.TypeAdapter r2 = r3.getTypeAdapter(r2, r4, r5, r1)
            return r2
    }

    com.google.gson.TypeAdapter<?> getTypeAdapter(com.google.gson.internal.ConstructorConstructor r11, com.google.gson.Gson r12, com.google.gson.reflect.TypeToken<?> r13, com.google.gson.annotations.JsonAdapter r14) {
            r10 = this;
            java.lang.Class r0 = r14.value()
            com.google.gson.reflect.TypeToken r0 = com.google.gson.reflect.TypeToken.get(r0)
            com.google.gson.internal.ObjectConstructor r0 = r11.get(r0)
            java.lang.Object r0 = r0.construct()
            boolean r8 = r14.nullSafe()
            boolean r1 = r0 instanceof com.google.gson.TypeAdapter
            if (r1 == 0) goto L1d
            r1 = r0
            com.google.gson.TypeAdapter r1 = (com.google.gson.TypeAdapter) r1
            goto L8b
        L1d:
            boolean r1 = r0 instanceof com.google.gson.TypeAdapterFactory
            if (r1 == 0) goto L29
            r1 = r0
            com.google.gson.TypeAdapterFactory r1 = (com.google.gson.TypeAdapterFactory) r1
            com.google.gson.TypeAdapter r1 = r1.create(r12, r13)
            goto L8b
        L29:
            boolean r1 = r0 instanceof com.google.gson.JsonSerializer
            if (r1 != 0) goto L67
            boolean r1 = r0 instanceof com.google.gson.JsonDeserializer
            if (r1 == 0) goto L32
            goto L67
        L32:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid attempt to bind an instance of "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " as a @JsonAdapter for "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r13.toString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L67:
            boolean r1 = r0 instanceof com.google.gson.JsonSerializer
            r3 = 0
            if (r1 == 0) goto L71
            r1 = r0
            com.google.gson.JsonSerializer r1 = (com.google.gson.JsonSerializer) r1
            r2 = r1
            goto L72
        L71:
            r2 = r3
        L72:
            boolean r1 = r0 instanceof com.google.gson.JsonDeserializer
            if (r1 == 0) goto L7c
            r1 = r0
            com.google.gson.JsonDeserializer r1 = (com.google.gson.JsonDeserializer) r1
            r3 = r1
            goto L7d
        L7c:
        L7d:
            com.google.gson.internal.bind.TreeTypeAdapter r9 = new com.google.gson.internal.bind.TreeTypeAdapter
            r6 = 0
            r1 = r9
            r4 = r12
            r5 = r13
            r7 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r4 = r1
            r8 = 0
        L8b:
            if (r1 == 0) goto L93
            if (r8 == 0) goto L93
            com.google.gson.TypeAdapter r1 = r1.nullSafe()
        L93:
            return r1
    }
}
