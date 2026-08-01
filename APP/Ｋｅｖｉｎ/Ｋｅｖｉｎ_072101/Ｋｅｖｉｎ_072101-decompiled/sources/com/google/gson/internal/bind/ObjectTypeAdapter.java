package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectTypeAdapter extends com.google.gson.TypeAdapter<java.lang.Object> {
    private static final com.google.gson.TypeAdapterFactory DOUBLE_FACTORY = null;
    private final com.google.gson.Gson gson;
    private final com.google.gson.ToNumberStrategy toNumberStrategy;


    /* JADX INFO: renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$2 */
    static /* synthetic */ class C04292 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = null;

        static {
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.gson.internal.bind.ObjectTypeAdapter.C04292.$SwitchMap$com$google$gson$stream$JsonToken = r0
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.C04292.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.C04292.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.C04292.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.C04292.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.C04292.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.C04292.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L56
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r0 = move-exception
            L57:
                return
        }
    }

    static {
            com.google.gson.ToNumberPolicy r0 = com.google.gson.ToNumberPolicy.DOUBLE
            com.google.gson.TypeAdapterFactory r0 = newFactory(r0)
            com.google.gson.internal.bind.ObjectTypeAdapter.DOUBLE_FACTORY = r0
            return
    }

    private ObjectTypeAdapter(com.google.gson.Gson r1, com.google.gson.ToNumberStrategy r2) {
            r0 = this;
            r0.<init>()
            r0.gson = r1
            r0.toNumberStrategy = r2
            return
    }

    /* synthetic */ ObjectTypeAdapter(com.google.gson.Gson r1, com.google.gson.ToNumberStrategy r2, com.google.gson.internal.bind.ObjectTypeAdapter.C04281 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.gson.TypeAdapterFactory getFactory(com.google.gson.ToNumberStrategy r1) {
            com.google.gson.ToNumberPolicy r0 = com.google.gson.ToNumberPolicy.DOUBLE
            if (r1 != r0) goto L7
            com.google.gson.TypeAdapterFactory r0 = com.google.gson.internal.bind.ObjectTypeAdapter.DOUBLE_FACTORY
            return r0
        L7:
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1)
            return r0
    }

    private static com.google.gson.TypeAdapterFactory newFactory(com.google.gson.ToNumberStrategy r1) {
            com.google.gson.internal.bind.ObjectTypeAdapter$1 r0 = new com.google.gson.internal.bind.ObjectTypeAdapter$1
            r0.<init>(r1)
            return r0
    }

    private java.lang.Object readTerminal(com.google.gson.stream.JsonReader r4, com.google.gson.stream.JsonToken r5) throws java.io.IOException {
            r3 = this;
            int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.C04292.$SwitchMap$com$google$gson$stream$JsonToken
            int r1 = r5.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 3: goto L39;
                case 4: goto L32;
                case 5: goto L29;
                case 6: goto L24;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected token: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L24:
            r4.nextNull()
            r0 = 0
            return r0
        L29:
            boolean r0 = r4.nextBoolean()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L32:
            com.google.gson.ToNumberStrategy r0 = r3.toNumberStrategy
            java.lang.Number r0 = r0.readNumber(r4)
            return r0
        L39:
            java.lang.String r0 = r4.nextString()
            return r0
    }

    private java.lang.Object tryBeginNesting(com.google.gson.stream.JsonReader r3, com.google.gson.stream.JsonToken r4) throws java.io.IOException {
            r2 = this;
            int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.C04292.$SwitchMap$com$google$gson$stream$JsonToken
            int r1 = r4.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L16;
                case 2: goto Ld;
                default: goto Lb;
            }
        Lb:
            r0 = 0
            return r0
        Ld:
            r3.beginObject()
            com.google.gson.internal.LinkedTreeMap r0 = new com.google.gson.internal.LinkedTreeMap
            r0.<init>()
            return r0
        L16:
            r3.beginArray()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @Override // com.google.gson.TypeAdapter
    public java.lang.Object read(com.google.gson.stream.JsonReader r8) throws java.io.IOException {
            r7 = this;
            com.google.gson.stream.JsonToken r0 = r8.peek()
            java.lang.Object r1 = r7.tryBeginNesting(r8, r0)
            if (r1 != 0) goto Lf
            java.lang.Object r2 = r7.readTerminal(r8, r0)
            return r2
        Lf:
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
        L14:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L4e
            r3 = 0
            boolean r4 = r1 instanceof java.util.Map
            if (r4 == 0) goto L23
            java.lang.String r3 = r8.nextName()
        L23:
            com.google.gson.stream.JsonToken r0 = r8.peek()
            java.lang.Object r4 = r7.tryBeginNesting(r8, r0)
            if (r4 == 0) goto L2f
            r5 = 1
            goto L30
        L2f:
            r5 = 0
        L30:
            if (r4 != 0) goto L36
            java.lang.Object r4 = r7.readTerminal(r8, r0)
        L36:
            boolean r6 = r1 instanceof java.util.List
            if (r6 == 0) goto L41
            r6 = r1
            java.util.List r6 = (java.util.List) r6
            r6.add(r4)
            goto L47
        L41:
            r6 = r1
            java.util.Map r6 = (java.util.Map) r6
            r6.put(r3, r4)
        L47:
            if (r5 == 0) goto L4d
            r2.addLast(r1)
            r1 = r4
        L4d:
            goto L14
        L4e:
            boolean r3 = r1 instanceof java.util.List
            if (r3 == 0) goto L56
            r8.endArray()
            goto L59
        L56:
            r8.endObject()
        L59:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L60
            return r1
        L60:
            java.lang.Object r1 = r2.removeLast()
            goto L14
    }

    @Override // com.google.gson.TypeAdapter
    public void write(com.google.gson.stream.JsonWriter r3, java.lang.Object r4) throws java.io.IOException {
            r2 = this;
            if (r4 != 0) goto L6
            r3.nullValue()
            return
        L6:
            com.google.gson.Gson r0 = r2.gson
            java.lang.Class r1 = r4.getClass()
            com.google.gson.TypeAdapter r0 = r0.getAdapter(r1)
            boolean r1 = r0 instanceof com.google.gson.internal.bind.ObjectTypeAdapter
            if (r1 == 0) goto L1b
            r3.beginObject()
            r3.endObject()
            return
        L1b:
            r0.write(r3, r4)
            return
    }
}
