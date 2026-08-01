package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes2.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends com.google.gson.TypeAdapter<T> {
    private final com.google.gson.Gson context;
    private final com.google.gson.TypeAdapter<T> delegate;
    private final java.lang.reflect.Type type;

    TypeAdapterRuntimeTypeWrapper(com.google.gson.Gson r1, com.google.gson.TypeAdapter<T> r2, java.lang.reflect.Type r3) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.delegate = r2
            r0.type = r3
            return
    }

    private static java.lang.reflect.Type getRuntimeTypeIfMoreSpecific(java.lang.reflect.Type r1, java.lang.Object r2) {
            if (r2 == 0) goto Le
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 != 0) goto La
            boolean r0 = r1 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto Le
        La:
            java.lang.Class r1 = r2.getClass()
        Le:
            return r1
    }

    private static boolean isReflective(com.google.gson.TypeAdapter<?> r1) {
        L1:
            boolean r0 = r1 instanceof com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
            if (r0 == 0) goto L11
            r0 = r1
            com.google.gson.internal.bind.SerializationDelegatingTypeAdapter r0 = (com.google.gson.internal.bind.SerializationDelegatingTypeAdapter) r0
            com.google.gson.TypeAdapter r0 = r0.getSerializationDelegate()
            if (r0 != r1) goto Lf
            goto L11
        Lf:
            r1 = r0
            goto L1
        L11:
            boolean r0 = r1 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
            return r0
    }

    @Override // com.google.gson.TypeAdapter
    public T read(com.google.gson.stream.JsonReader r2) throws java.io.IOException {
            r1 = this;
            com.google.gson.TypeAdapter<T> r0 = r1.delegate
            java.lang.Object r0 = r0.read(r2)
            return r0
    }

    @Override // com.google.gson.TypeAdapter
    public void write(com.google.gson.stream.JsonWriter r5, T r6) throws java.io.IOException {
            r4 = this;
            com.google.gson.TypeAdapter<T> r0 = r4.delegate
            java.lang.reflect.Type r1 = r4.type
            java.lang.reflect.Type r1 = getRuntimeTypeIfMoreSpecific(r1, r6)
            java.lang.reflect.Type r2 = r4.type
            if (r1 == r2) goto L28
            com.google.gson.Gson r2 = r4.context
            com.google.gson.reflect.TypeToken r3 = com.google.gson.reflect.TypeToken.get(r1)
            com.google.gson.TypeAdapter r2 = r2.getAdapter(r3)
            boolean r3 = r2 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
            if (r3 != 0) goto L1c
            r0 = r2
            goto L28
        L1c:
            com.google.gson.TypeAdapter<T> r3 = r4.delegate
            boolean r3 = isReflective(r3)
            if (r3 != 0) goto L27
            com.google.gson.TypeAdapter<T> r0 = r4.delegate
            goto L28
        L27:
            r0 = r2
        L28:
            r0.write(r5, r6)
            return
    }
}
