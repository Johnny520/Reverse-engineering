package com.google.gson;

/* JADX INFO: loaded from: classes.dex */
public abstract class TypeAdapter<T> {

    /* JADX INFO: renamed from: com.google.gson.TypeAdapter$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class NullSafeTypeAdapter extends com.google.gson.TypeAdapter<T> {
        final /* synthetic */ com.google.gson.TypeAdapter this$0;

        private NullSafeTypeAdapter(com.google.gson.TypeAdapter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ NullSafeTypeAdapter(com.google.gson.TypeAdapter r1, com.google.gson.TypeAdapter.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.gson.TypeAdapter
        public T read(com.google.gson.stream.JsonReader r3) throws java.io.IOException {
                r2 = this;
                com.google.gson.stream.JsonToken r0 = r3.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto Ld
                r3.nextNull()
                r3 = 0
                return r3
            Ld:
                com.google.gson.TypeAdapter r0 = r2.this$0
                java.lang.Object r3 = r0.read(r3)
                return r3
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "NullSafeTypeAdapter["
                r0.append(r1)
                com.google.gson.TypeAdapter r1 = r2.this$0
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // com.google.gson.TypeAdapter
        public void write(com.google.gson.stream.JsonWriter r2, T r3) throws java.io.IOException {
                r1 = this;
                if (r3 != 0) goto L6
                r2.nullValue()
                goto Lb
            L6:
                com.google.gson.TypeAdapter r0 = r1.this$0
                r0.write(r2, r3)
            Lb:
                return
        }
    }

    public TypeAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public final T fromJson(java.io.Reader r2) throws java.io.IOException {
            r1 = this;
            com.google.gson.stream.JsonReader r0 = new com.google.gson.stream.JsonReader
            r0.<init>(r2)
            java.lang.Object r2 = r1.read(r0)
            return r2
    }

    public final T fromJson(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r2)
            java.lang.Object r2 = r1.fromJson(r0)
            return r2
    }

    public final T fromJsonTree(com.google.gson.JsonElement r2) {
            r1 = this;
            com.google.gson.internal.bind.JsonTreeReader r0 = new com.google.gson.internal.bind.JsonTreeReader     // Catch: java.io.IOException -> La
            r0.<init>(r2)     // Catch: java.io.IOException -> La
            java.lang.Object r2 = r1.read(r0)     // Catch: java.io.IOException -> La
            return r2
        La:
            r2 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>(r2)
            throw r0
    }

    public final com.google.gson.TypeAdapter<T> nullSafe() {
            r2 = this;
            boolean r0 = r2 instanceof com.google.gson.TypeAdapter.NullSafeTypeAdapter
            if (r0 != 0) goto Lb
            com.google.gson.TypeAdapter$NullSafeTypeAdapter r0 = new com.google.gson.TypeAdapter$NullSafeTypeAdapter
            r1 = 0
            r0.<init>(r2, r1)
            return r0
        Lb:
            return r2
    }

    public abstract T read(com.google.gson.stream.JsonReader r1) throws java.io.IOException;

    public final java.lang.String toJson(T r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.Writer r1 = com.google.gson.internal.Streams.writerForAppendable(r0)     // Catch: java.io.IOException -> L11
            r2.toJson(r1, r3)     // Catch: java.io.IOException -> L11
            java.lang.String r3 = r0.toString()
            return r3
        L11:
            r3 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>(r3)
            throw r0
    }

    public final void toJson(java.io.Writer r2, T r3) throws java.io.IOException {
            r1 = this;
            com.google.gson.stream.JsonWriter r0 = new com.google.gson.stream.JsonWriter
            r0.<init>(r2)
            r1.write(r0, r3)
            return
    }

    public final com.google.gson.JsonElement toJsonTree(T r2) {
            r1 = this;
            com.google.gson.internal.bind.JsonTreeWriter r0 = new com.google.gson.internal.bind.JsonTreeWriter     // Catch: java.io.IOException -> Ld
            r0.<init>()     // Catch: java.io.IOException -> Ld
            r1.write(r0, r2)     // Catch: java.io.IOException -> Ld
            com.google.gson.JsonElement r2 = r0.get()     // Catch: java.io.IOException -> Ld
            return r2
        Ld:
            r2 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>(r2)
            throw r0
    }

    public abstract void write(com.google.gson.stream.JsonWriter r1, T r2) throws java.io.IOException;
}
