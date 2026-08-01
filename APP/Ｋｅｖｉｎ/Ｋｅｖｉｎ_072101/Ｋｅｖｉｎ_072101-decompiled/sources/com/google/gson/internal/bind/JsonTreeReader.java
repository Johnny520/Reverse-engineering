package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonTreeReader extends com.google.gson.stream.JsonReader {
    private static final java.lang.Object SENTINEL_CLOSED = null;
    private static final java.io.Reader UNREADABLE_READER = null;
    private int[] pathIndices;
    private java.lang.String[] pathNames;
    private java.lang.Object[] stack;
    private int stackSize;


    /* JADX INFO: renamed from: com.google.gson.internal.bind.JsonTreeReader$2 */
    static /* synthetic */ class C04242 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = null;

        static {
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.gson.internal.bind.JsonTreeReader.C04242.$SwitchMap$com$google$gson$stream$JsonToken = r0
                int[] r0 = com.google.gson.internal.bind.JsonTreeReader.C04242.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NAME     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.gson.internal.bind.JsonTreeReader.C04242.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_ARRAY     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.gson.internal.bind.JsonTreeReader.C04242.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_OBJECT     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.gson.internal.bind.JsonTreeReader.C04242.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                return
        }
    }

    static {
            com.google.gson.internal.bind.JsonTreeReader$1 r0 = new com.google.gson.internal.bind.JsonTreeReader$1
            r0.<init>()
            com.google.gson.internal.bind.JsonTreeReader.UNREADABLE_READER = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.gson.internal.bind.JsonTreeReader.SENTINEL_CLOSED = r0
            return
    }

    public JsonTreeReader(com.google.gson.JsonElement r3) {
            r2 = this;
            java.io.Reader r0 = com.google.gson.internal.bind.JsonTreeReader.UNREADABLE_READER
            r2.<init>(r0)
            r0 = 32
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2.stack = r1
            r1 = 0
            r2.stackSize = r1
            java.lang.String[] r1 = new java.lang.String[r0]
            r2.pathNames = r1
            int[] r0 = new int[r0]
            r2.pathIndices = r0
            r2.push(r3)
            return
    }

    private void expect(com.google.gson.stream.JsonToken r4) throws java.io.IOException {
            r3 = this;
            com.google.gson.stream.JsonToken r0 = r3.peek()
            if (r0 != r4) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " but was "
            java.lang.StringBuilder r1 = r1.append(r2)
            com.google.gson.stream.JsonToken r2 = r3.peek()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.locationString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private java.lang.String getPath(boolean r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 36
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 0
        Lc:
            int r2 = r5.stackSize
            if (r1 >= r2) goto L77
            java.lang.Object[] r2 = r5.stack
            r2 = r2[r1]
            boolean r2 = r2 instanceof com.google.gson.JsonArray
            if (r2 == 0) goto L4c
            int r1 = r1 + 1
            int r2 = r5.stackSize
            if (r1 >= r2) goto L74
            java.lang.Object[] r2 = r5.stack
            r2 = r2[r1]
            boolean r2 = r2 instanceof java.util.Iterator
            if (r2 == 0) goto L74
            int[] r2 = r5.pathIndices
            r2 = r2[r1]
            if (r6 == 0) goto L3c
            if (r2 <= 0) goto L3c
            int r3 = r5.stackSize
            int r3 = r3 + (-1)
            if (r1 == r3) goto L3a
            int r3 = r5.stackSize
            int r3 = r3 + (-2)
            if (r1 != r3) goto L3c
        L3a:
            int r2 = r2 + (-1)
        L3c:
            r3 = 91
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.StringBuilder r3 = r3.append(r2)
            r4 = 93
            r3.append(r4)
            goto L74
        L4c:
            java.lang.Object[] r2 = r5.stack
            r2 = r2[r1]
            boolean r2 = r2 instanceof com.google.gson.JsonObject
            if (r2 == 0) goto L74
            int r1 = r1 + 1
            int r2 = r5.stackSize
            if (r1 >= r2) goto L74
            java.lang.Object[] r2 = r5.stack
            r2 = r2[r1]
            boolean r2 = r2 instanceof java.util.Iterator
            if (r2 == 0) goto L74
            r2 = 46
            r0.append(r2)
            java.lang.String[] r2 = r5.pathNames
            r2 = r2[r1]
            if (r2 == 0) goto L74
            java.lang.String[] r2 = r5.pathNames
            r2 = r2[r1]
            r0.append(r2)
        L74:
            int r1 = r1 + 1
            goto Lc
        L77:
            java.lang.String r1 = r0.toString()
            return r1
    }

    private java.lang.String locationString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " at path "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getPath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private java.lang.String nextName(boolean r7) throws java.io.IOException {
            r6 = this;
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.NAME
            r6.expect(r0)
            java.lang.Object r0 = r6.peekStack()
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String[] r3 = r6.pathNames
            int r4 = r6.stackSize
            int r4 = r4 + (-1)
            if (r7 == 0) goto L22
            java.lang.String r5 = "<skipped>"
            goto L23
        L22:
            r5 = r2
        L23:
            r3[r4] = r5
            java.lang.Object r3 = r1.getValue()
            r6.push(r3)
            return r2
    }

    private java.lang.Object peekStack() {
            r2 = this;
            java.lang.Object[] r0 = r2.stack
            int r1 = r2.stackSize
            int r1 = r1 + (-1)
            r0 = r0[r1]
            return r0
    }

    private java.lang.Object popStack() {
            r4 = this;
            java.lang.Object[] r0 = r4.stack
            int r1 = r4.stackSize
            int r1 = r1 + (-1)
            r4.stackSize = r1
            r0 = r0[r1]
            java.lang.Object[] r1 = r4.stack
            int r2 = r4.stackSize
            r3 = 0
            r1[r2] = r3
            return r0
    }

    private void push(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.stackSize
            java.lang.Object[] r1 = r3.stack
            int r1 = r1.length
            if (r0 != r1) goto L25
            int r0 = r3.stackSize
            int r0 = r0 * 2
            java.lang.Object[] r1 = r3.stack
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.stack = r1
            int[] r1 = r3.pathIndices
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.pathIndices = r1
            java.lang.String[] r1 = r3.pathNames
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r3.pathNames = r1
        L25:
            java.lang.Object[] r0 = r3.stack
            int r1 = r3.stackSize
            int r2 = r1 + 1
            r3.stackSize = r2
            r0[r1] = r4
            return
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws java.io.IOException {
            r4 = this;
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.BEGIN_ARRAY
            r4.expect(r0)
            java.lang.Object r0 = r4.peekStack()
            com.google.gson.JsonArray r0 = (com.google.gson.JsonArray) r0
            java.util.Iterator r1 = r0.iterator()
            r4.push(r1)
            int[] r1 = r4.pathIndices
            int r2 = r4.stackSize
            int r2 = r2 + (-1)
            r3 = 0
            r1[r2] = r3
            return
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws java.io.IOException {
            r2 = this;
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.BEGIN_OBJECT
            r2.expect(r0)
            java.lang.Object r0 = r2.peekStack()
            com.google.gson.JsonObject r0 = (com.google.gson.JsonObject) r0
            java.util.Set r1 = r0.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r2.push(r1)
            return
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.lang.Object r0 = com.google.gson.internal.bind.JsonTreeReader.SENTINEL_CLOSED
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1.stack = r0
            r0 = 1
            r1.stackSize = r0
            return
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws java.io.IOException {
            r3 = this;
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.END_ARRAY
            r3.expect(r0)
            r3.popStack()
            r3.popStack()
            int r0 = r3.stackSize
            if (r0 <= 0) goto L1b
            int[] r0 = r3.pathIndices
            int r1 = r3.stackSize
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
        L1b:
            return
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws java.io.IOException {
            r3 = this;
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.END_OBJECT
            r3.expect(r0)
            java.lang.String[] r0 = r3.pathNames
            int r1 = r3.stackSize
            int r1 = r1 + (-1)
            r2 = 0
            r0[r1] = r2
            r3.popStack()
            r3.popStack()
            int r0 = r3.stackSize
            if (r0 <= 0) goto L24
            int[] r0 = r3.pathIndices
            int r1 = r3.stackSize
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
        L24:
            return
    }

    @Override // com.google.gson.stream.JsonReader
    public java.lang.String getPath() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.getPath(r0)
            return r0
    }

    @Override // com.google.gson.stream.JsonReader
    public java.lang.String getPreviousPath() {
            r1 = this;
            r0 = 1
            java.lang.String r0 = r1.getPath(r0)
            return r0
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws java.io.IOException {
            r2 = this;
            com.google.gson.stream.JsonToken r0 = r2.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_OBJECT
            if (r0 == r1) goto L12
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_ARRAY
            if (r0 == r1) goto L12
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT
            if (r0 == r1) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws java.io.IOException {
            r4 = this;
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.BOOLEAN
            r4.expect(r0)
            java.lang.Object r0 = r4.popStack()
            com.google.gson.JsonPrimitive r0 = (com.google.gson.JsonPrimitive) r0
            boolean r0 = r0.getAsBoolean()
            int r1 = r4.stackSize
            if (r1 <= 0) goto L1f
            int[] r1 = r4.pathIndices
            int r2 = r4.stackSize
            int r2 = r2 + (-1)
            r3 = r1[r2]
            int r3 = r3 + 1
            r1[r2] = r3
        L1f:
            return r0
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws java.io.IOException {
            r6 = this;
            com.google.gson.stream.JsonToken r0 = r6.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER
            if (r0 == r1) goto L3a
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING
            if (r0 != r1) goto Ld
            goto L3a
        Ld:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected "
            java.lang.StringBuilder r2 = r2.append(r3)
            com.google.gson.stream.JsonToken r3 = com.google.gson.stream.JsonToken.NUMBER
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = r6.locationString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L3a:
            java.lang.Object r1 = r6.peekStack()
            com.google.gson.JsonPrimitive r1 = (com.google.gson.JsonPrimitive) r1
            double r1 = r1.getAsDouble()
            boolean r3 = r6.isLenient()
            if (r3 != 0) goto L70
            boolean r3 = java.lang.Double.isNaN(r1)
            if (r3 != 0) goto L57
            boolean r3 = java.lang.Double.isInfinite(r1)
            if (r3 != 0) goto L57
            goto L70
        L57:
            com.google.gson.stream.MalformedJsonException r3 = new com.google.gson.stream.MalformedJsonException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "JSON forbids NaN and infinities: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L70:
            r6.popStack()
            int r3 = r6.stackSize
            if (r3 <= 0) goto L83
            int[] r3 = r6.pathIndices
            int r4 = r6.stackSize
            int r4 = r4 + (-1)
            r5 = r3[r4]
            int r5 = r5 + 1
            r3[r4] = r5
        L83:
            return r1
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws java.io.IOException {
            r5 = this;
            com.google.gson.stream.JsonToken r0 = r5.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER
            if (r0 == r1) goto L3a
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING
            if (r0 != r1) goto Ld
            goto L3a
        Ld:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected "
            java.lang.StringBuilder r2 = r2.append(r3)
            com.google.gson.stream.JsonToken r3 = com.google.gson.stream.JsonToken.NUMBER
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = r5.locationString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L3a:
            java.lang.Object r1 = r5.peekStack()
            com.google.gson.JsonPrimitive r1 = (com.google.gson.JsonPrimitive) r1
            int r1 = r1.getAsInt()
            r5.popStack()
            int r2 = r5.stackSize
            if (r2 <= 0) goto L57
            int[] r2 = r5.pathIndices
            int r3 = r5.stackSize
            int r3 = r3 + (-1)
            r4 = r2[r3]
            int r4 = r4 + 1
            r2[r3] = r4
        L57:
            return r1
    }

    com.google.gson.JsonElement nextJsonElement() throws java.io.IOException {
            r4 = this;
            com.google.gson.stream.JsonToken r0 = r4.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NAME
            if (r0 == r1) goto L1e
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_ARRAY
            if (r0 == r1) goto L1e
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_OBJECT
            if (r0 == r1) goto L1e
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT
            if (r0 == r1) goto L1e
            java.lang.Object r1 = r4.peekStack()
            com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1
            r4.skipValue()
            return r1
        L1e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " when reading a JsonElement."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws java.io.IOException {
            r6 = this;
            com.google.gson.stream.JsonToken r0 = r6.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER
            if (r0 == r1) goto L3a
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING
            if (r0 != r1) goto Ld
            goto L3a
        Ld:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected "
            java.lang.StringBuilder r2 = r2.append(r3)
            com.google.gson.stream.JsonToken r3 = com.google.gson.stream.JsonToken.NUMBER
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = r6.locationString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L3a:
            java.lang.Object r1 = r6.peekStack()
            com.google.gson.JsonPrimitive r1 = (com.google.gson.JsonPrimitive) r1
            long r1 = r1.getAsLong()
            r6.popStack()
            int r3 = r6.stackSize
            if (r3 <= 0) goto L57
            int[] r3 = r6.pathIndices
            int r4 = r6.stackSize
            int r4 = r4 + (-1)
            r5 = r3[r4]
            int r5 = r5 + 1
            r3[r4] = r5
        L57:
            return r1
    }

    @Override // com.google.gson.stream.JsonReader
    public java.lang.String nextName() throws java.io.IOException {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.nextName(r0)
            return r0
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws java.io.IOException {
            r3 = this;
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.NULL
            r3.expect(r0)
            r3.popStack()
            int r0 = r3.stackSize
            if (r0 <= 0) goto L18
            int[] r0 = r3.pathIndices
            int r1 = r3.stackSize
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
        L18:
            return
    }

    @Override // com.google.gson.stream.JsonReader
    public java.lang.String nextString() throws java.io.IOException {
            r5 = this;
            com.google.gson.stream.JsonToken r0 = r5.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING
            if (r0 == r1) goto L3a
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER
            if (r0 != r1) goto Ld
            goto L3a
        Ld:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected "
            java.lang.StringBuilder r2 = r2.append(r3)
            com.google.gson.stream.JsonToken r3 = com.google.gson.stream.JsonToken.STRING
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = r5.locationString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L3a:
            java.lang.Object r1 = r5.popStack()
            com.google.gson.JsonPrimitive r1 = (com.google.gson.JsonPrimitive) r1
            java.lang.String r1 = r1.getAsString()
            int r2 = r5.stackSize
            if (r2 <= 0) goto L54
            int[] r2 = r5.pathIndices
            int r3 = r5.stackSize
            int r3 = r3 + (-1)
            r4 = r2[r3]
            int r4 = r4 + 1
            r2[r3] = r4
        L54:
            return r1
    }

    @Override // com.google.gson.stream.JsonReader
    public com.google.gson.stream.JsonToken peek() throws java.io.IOException {
            r4 = this;
            int r0 = r4.stackSize
            if (r0 != 0) goto L7
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.END_DOCUMENT
            return r0
        L7:
            java.lang.Object r0 = r4.peekStack()
            boolean r1 = r0 instanceof java.util.Iterator
            if (r1 == 0) goto L3b
            java.lang.Object[] r1 = r4.stack
            int r2 = r4.stackSize
            int r2 = r2 + (-2)
            r1 = r1[r2]
            boolean r1 = r1 instanceof com.google.gson.JsonObject
            r2 = r0
            java.util.Iterator r2 = (java.util.Iterator) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L33
            if (r1 == 0) goto L27
            com.google.gson.stream.JsonToken r3 = com.google.gson.stream.JsonToken.NAME
            return r3
        L27:
            java.lang.Object r3 = r2.next()
            r4.push(r3)
            com.google.gson.stream.JsonToken r3 = r4.peek()
            return r3
        L33:
            if (r1 == 0) goto L38
            com.google.gson.stream.JsonToken r3 = com.google.gson.stream.JsonToken.END_OBJECT
            goto L3a
        L38:
            com.google.gson.stream.JsonToken r3 = com.google.gson.stream.JsonToken.END_ARRAY
        L3a:
            return r3
        L3b:
            boolean r1 = r0 instanceof com.google.gson.JsonObject
            if (r1 == 0) goto L42
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT
            return r1
        L42:
            boolean r1 = r0 instanceof com.google.gson.JsonArray
            if (r1 == 0) goto L49
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY
            return r1
        L49:
            boolean r1 = r0 instanceof com.google.gson.JsonPrimitive
            if (r1 == 0) goto L71
            r1 = r0
            com.google.gson.JsonPrimitive r1 = (com.google.gson.JsonPrimitive) r1
            boolean r2 = r1.isString()
            if (r2 == 0) goto L59
            com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.STRING
            return r2
        L59:
            boolean r2 = r1.isBoolean()
            if (r2 == 0) goto L62
            com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.BOOLEAN
            return r2
        L62:
            boolean r2 = r1.isNumber()
            if (r2 == 0) goto L6b
            com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.NUMBER
            return r2
        L6b:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L71:
            boolean r1 = r0 instanceof com.google.gson.JsonNull
            if (r1 == 0) goto L78
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            return r1
        L78:
            java.lang.Object r1 = com.google.gson.internal.bind.JsonTreeReader.SENTINEL_CLOSED
            if (r0 != r1) goto L84
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L84:
            com.google.gson.stream.MalformedJsonException r1 = new com.google.gson.stream.MalformedJsonException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Custom JsonElement subclass "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " is not supported"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public void promoteNameToValue() throws java.io.IOException {
            r4 = this;
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.NAME
            r4.expect(r0)
            java.lang.Object r0 = r4.peekStack()
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            r4.push(r2)
            com.google.gson.JsonPrimitive r2 = new com.google.gson.JsonPrimitive
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r2.<init>(r3)
            r4.push(r2)
            return
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws java.io.IOException {
            r5 = this;
            com.google.gson.stream.JsonToken r0 = r5.peek()
            int[] r1 = com.google.gson.internal.bind.JsonTreeReader.C04242.$SwitchMap$com$google$gson$stream$JsonToken
            int r2 = r0.ordinal()
            r1 = r1[r2]
            r2 = 1
            switch(r1) {
                case 1: goto L2b;
                case 2: goto L27;
                case 3: goto L23;
                case 4: goto L22;
                default: goto L10;
            }
        L10:
            r5.popStack()
            int r1 = r5.stackSize
            if (r1 <= 0) goto L30
            int[] r1 = r5.pathIndices
            int r3 = r5.stackSize
            int r3 = r3 - r2
            r4 = r1[r3]
            int r4 = r4 + r2
            r1[r3] = r4
            goto L30
        L22:
            goto L30
        L23:
            r5.endObject()
            goto L30
        L27:
            r5.endArray()
            goto L30
        L2b:
            java.lang.String r1 = r5.nextName(r2)
        L30:
            return
    }

    @Override // com.google.gson.stream.JsonReader
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.locationString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
