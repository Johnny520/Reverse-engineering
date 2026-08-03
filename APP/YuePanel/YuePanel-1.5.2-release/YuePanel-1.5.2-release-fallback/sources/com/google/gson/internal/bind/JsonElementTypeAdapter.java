package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes2.dex */
public class JsonElementTypeAdapter extends com.google.gson.TypeAdapter<com.google.gson.JsonElement> {
    public static final com.google.gson.internal.bind.JsonElementTypeAdapter ADAPTER = null;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JsonElementTypeAdapter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = null;

        static {
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.gson.internal.bind.JsonElementTypeAdapter.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.gson.internal.bind.JsonElementTypeAdapter.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.gson.internal.bind.JsonElementTypeAdapter.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.gson.internal.bind.JsonElementTypeAdapter.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.gson.internal.bind.JsonElementTypeAdapter.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.gson.internal.bind.JsonElementTypeAdapter.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }
    }

    static {
            com.google.gson.internal.bind.JsonElementTypeAdapter r0 = new com.google.gson.internal.bind.JsonElementTypeAdapter
            r0.<init>()
            com.google.gson.internal.bind.JsonElementTypeAdapter.ADAPTER = r0
            return
    }

    private JsonElementTypeAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    private com.google.gson.JsonElement readTerminal(com.google.gson.stream.JsonReader r3, com.google.gson.stream.JsonToken r4) throws java.io.IOException {
            r2 = this;
            int[] r0 = com.google.gson.internal.bind.JsonElementTypeAdapter.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 3
            if (r0 == r1) goto L4e
            r1 = 4
            if (r0 == r1) goto L3f
            r1 = 5
            if (r0 == r1) goto L31
            r1 = 6
            if (r0 != r1) goto L1a
            r3.nextNull()
            com.google.gson.JsonNull r3 = com.google.gson.JsonNull.INSTANCE
            return r3
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected token: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L31:
            com.google.gson.JsonPrimitive r4 = new com.google.gson.JsonPrimitive
            boolean r3 = r3.nextBoolean()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4.<init>(r3)
            return r4
        L3f:
            java.lang.String r3 = r3.nextString()
            com.google.gson.JsonPrimitive r4 = new com.google.gson.JsonPrimitive
            com.google.gson.internal.LazilyParsedNumber r0 = new com.google.gson.internal.LazilyParsedNumber
            r0.<init>(r3)
            r4.<init>(r0)
            return r4
        L4e:
            com.google.gson.JsonPrimitive r4 = new com.google.gson.JsonPrimitive
            java.lang.String r3 = r3.nextString()
            r4.<init>(r3)
            return r4
    }

    private com.google.gson.JsonElement tryBeginNesting(com.google.gson.stream.JsonReader r2, com.google.gson.stream.JsonToken r3) throws java.io.IOException {
            r1 = this;
            int[] r0 = com.google.gson.internal.bind.JsonElementTypeAdapter.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L19
            r0 = 2
            if (r3 == r0) goto L10
            r2 = 0
            return r2
        L10:
            r2.beginObject()
            com.google.gson.JsonObject r2 = new com.google.gson.JsonObject
            r2.<init>()
            return r2
        L19:
            r2.beginArray()
            com.google.gson.JsonArray r2 = new com.google.gson.JsonArray
            r2.<init>()
            return r2
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public com.google.gson.JsonElement read(com.google.gson.stream.JsonReader r7) throws java.io.IOException {
            r6 = this;
            boolean r0 = r7 instanceof com.google.gson.internal.bind.JsonTreeReader
            if (r0 == 0) goto Lb
            com.google.gson.internal.bind.JsonTreeReader r7 = (com.google.gson.internal.bind.JsonTreeReader) r7
            com.google.gson.JsonElement r7 = r7.nextJsonElement()
            return r7
        Lb:
            com.google.gson.stream.JsonToken r0 = r7.peek()
            com.google.gson.JsonElement r1 = r6.tryBeginNesting(r7, r0)
            if (r1 != 0) goto L1a
            com.google.gson.JsonElement r7 = r6.readTerminal(r7, r0)
            return r7
        L1a:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
        L1f:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L5a
            boolean r2 = r1 instanceof com.google.gson.JsonObject
            if (r2 == 0) goto L2e
            java.lang.String r2 = r7.nextName()
            goto L2f
        L2e:
            r2 = 0
        L2f:
            com.google.gson.stream.JsonToken r3 = r7.peek()
            com.google.gson.JsonElement r4 = r6.tryBeginNesting(r7, r3)
            if (r4 == 0) goto L3b
            r5 = 1
            goto L3c
        L3b:
            r5 = 0
        L3c:
            if (r4 != 0) goto L42
            com.google.gson.JsonElement r4 = r6.readTerminal(r7, r3)
        L42:
            boolean r3 = r1 instanceof com.google.gson.JsonArray
            if (r3 == 0) goto L4d
            r2 = r1
            com.google.gson.JsonArray r2 = (com.google.gson.JsonArray) r2
            r2.add(r4)
            goto L53
        L4d:
            r3 = r1
            com.google.gson.JsonObject r3 = (com.google.gson.JsonObject) r3
            r3.add(r2, r4)
        L53:
            if (r5 == 0) goto L1f
            r0.addLast(r1)
            r1 = r4
            goto L1f
        L5a:
            boolean r2 = r1 instanceof com.google.gson.JsonArray
            if (r2 == 0) goto L62
            r7.endArray()
            goto L65
        L62:
            r7.endObject()
        L65:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L6c
            return r1
        L6c:
            java.lang.Object r1 = r0.removeLast()
            com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1
            goto L1f
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ com.google.gson.JsonElement read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
            r0 = this;
            com.google.gson.JsonElement r1 = r0.read(r1)
            return r1
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public void write2(com.google.gson.stream.JsonWriter r3, com.google.gson.JsonElement r4) throws java.io.IOException {
            r2 = this;
            if (r4 == 0) goto Lb3
            boolean r0 = r4.isJsonNull()
            if (r0 == 0) goto La
            goto Lb3
        La:
            boolean r0 = r4.isJsonPrimitive()
            if (r0 == 0) goto L3b
            com.google.gson.JsonPrimitive r4 = r4.getAsJsonPrimitive()
            boolean r0 = r4.isNumber()
            if (r0 == 0) goto L23
            java.lang.Number r4 = r4.getAsNumber()
            r3.value(r4)
            goto Lb6
        L23:
            boolean r0 = r4.isBoolean()
            if (r0 == 0) goto L32
            boolean r4 = r4.getAsBoolean()
            r3.value(r4)
            goto Lb6
        L32:
            java.lang.String r4 = r4.getAsString()
            r3.value(r4)
            goto Lb6
        L3b:
            boolean r0 = r4.isJsonArray()
            if (r0 == 0) goto L60
            r3.beginArray()
            com.google.gson.JsonArray r4 = r4.getAsJsonArray()
            java.util.Iterator r4 = r4.iterator()
        L4c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r4.next()
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
            r2.write2(r3, r0)
            goto L4c
        L5c:
            r3.endArray()
            goto Lb6
        L60:
            boolean r0 = r4.isJsonObject()
            if (r0 == 0) goto L98
            r3.beginObject()
            com.google.gson.JsonObject r4 = r4.getAsJsonObject()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L75:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r3.name(r1)
            java.lang.Object r0 = r0.getValue()
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
            r2.write2(r3, r0)
            goto L75
        L94:
            r3.endObject()
            goto Lb6
        L98:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Couldn't write "
            r0.append(r1)
            java.lang.Class r4 = r4.getClass()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        Lb3:
            r3.nullValue()
        Lb6:
            return
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, com.google.gson.JsonElement r2) throws java.io.IOException {
            r0 = this;
            com.google.gson.JsonElement r2 = (com.google.gson.JsonElement) r2
            r0.write2(r1, r2)
            return
    }
}
