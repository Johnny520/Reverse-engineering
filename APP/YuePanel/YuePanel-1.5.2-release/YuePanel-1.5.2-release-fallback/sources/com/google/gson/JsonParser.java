package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonParser {
    @java.lang.Deprecated
    public JsonParser() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.gson.JsonElement parseReader(com.google.gson.stream.JsonReader r5) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            com.google.gson.Strictness r0 = r5.getStrictness()
            com.google.gson.Strictness r1 = com.google.gson.Strictness.LEGACY_STRICT
            if (r0 != r1) goto Ld
            com.google.gson.Strictness r1 = com.google.gson.Strictness.LENIENT
            r5.setStrictness(r1)
        Ld:
            com.google.gson.JsonElement r1 = com.google.gson.internal.Streams.parse(r5)     // Catch: java.lang.Throwable -> L15 java.lang.OutOfMemoryError -> L17 java.lang.StackOverflowError -> L19
            r5.setStrictness(r0)
            return r1
        L15:
            r1 = move-exception
            goto L36
        L17:
            r1 = move-exception
            goto L1a
        L19:
            r1 = move-exception
        L1a:
            com.google.gson.JsonParseException r2 = new com.google.gson.JsonParseException     // Catch: java.lang.Throwable -> L15
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r3.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r4 = "Failed parsing JSON source: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L15
            r3.append(r5)     // Catch: java.lang.Throwable -> L15
            java.lang.String r4 = " to Json"
            r3.append(r4)     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L15
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L15
            throw r2     // Catch: java.lang.Throwable -> L15
        L36:
            r5.setStrictness(r0)
            throw r1
    }

    public static com.google.gson.JsonElement parseReader(java.io.Reader r2) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            com.google.gson.stream.JsonReader r0 = new com.google.gson.stream.JsonReader     // Catch: java.io.IOException -> L20 java.lang.NumberFormatException -> L22 com.google.gson.stream.MalformedJsonException -> L24
            r0.<init>(r2)     // Catch: java.io.IOException -> L20 java.lang.NumberFormatException -> L22 com.google.gson.stream.MalformedJsonException -> L24
            com.google.gson.JsonElement r2 = parseReader(r0)     // Catch: java.io.IOException -> L20 java.lang.NumberFormatException -> L22 com.google.gson.stream.MalformedJsonException -> L24
            boolean r1 = r2.isJsonNull()     // Catch: java.io.IOException -> L20 java.lang.NumberFormatException -> L22 com.google.gson.stream.MalformedJsonException -> L24
            if (r1 != 0) goto L26
            com.google.gson.stream.JsonToken r0 = r0.peek()     // Catch: java.io.IOException -> L20 java.lang.NumberFormatException -> L22 com.google.gson.stream.MalformedJsonException -> L24
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch: java.io.IOException -> L20 java.lang.NumberFormatException -> L22 com.google.gson.stream.MalformedJsonException -> L24
            if (r0 != r1) goto L18
            goto L26
        L18:
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException     // Catch: java.io.IOException -> L20 java.lang.NumberFormatException -> L22 com.google.gson.stream.MalformedJsonException -> L24
            java.lang.String r0 = "Did not consume the entire document."
            r2.<init>(r0)     // Catch: java.io.IOException -> L20 java.lang.NumberFormatException -> L22 com.google.gson.stream.MalformedJsonException -> L24
            throw r2     // Catch: java.io.IOException -> L20 java.lang.NumberFormatException -> L22 com.google.gson.stream.MalformedJsonException -> L24
        L20:
            r2 = move-exception
            goto L27
        L22:
            r2 = move-exception
            goto L2d
        L24:
            r2 = move-exception
            goto L2d
        L26:
            return r2
        L27:
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>(r2)
            throw r0
        L2d:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r2)
            throw r0
    }

    public static com.google.gson.JsonElement parseString(java.lang.String r1) throws com.google.gson.JsonSyntaxException {
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r1)
            com.google.gson.JsonElement r1 = parseReader(r0)
            return r1
    }

    @com.google.errorprone.annotations.InlineMe(imports = {"com.google.gson.JsonParser"}, replacement = "JsonParser.parseReader(json)")
    @java.lang.Deprecated
    public com.google.gson.JsonElement parse(com.google.gson.stream.JsonReader r1) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            r0 = this;
            com.google.gson.JsonElement r1 = parseReader(r1)
            return r1
    }

    @com.google.errorprone.annotations.InlineMe(imports = {"com.google.gson.JsonParser"}, replacement = "JsonParser.parseReader(json)")
    @java.lang.Deprecated
    public com.google.gson.JsonElement parse(java.io.Reader r1) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            r0 = this;
            com.google.gson.JsonElement r1 = parseReader(r1)
            return r1
    }

    @com.google.errorprone.annotations.InlineMe(imports = {"com.google.gson.JsonParser"}, replacement = "JsonParser.parseString(json)")
    @java.lang.Deprecated
    public com.google.gson.JsonElement parse(java.lang.String r1) throws com.google.gson.JsonSyntaxException {
            r0 = this;
            com.google.gson.JsonElement r1 = parseString(r1)
            return r1
    }
}
