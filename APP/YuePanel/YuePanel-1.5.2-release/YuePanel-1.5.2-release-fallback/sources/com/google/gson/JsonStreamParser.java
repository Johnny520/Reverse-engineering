package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonStreamParser implements java.util.Iterator<com.google.gson.JsonElement> {
    private final java.lang.Object lock;
    private final com.google.gson.stream.JsonReader parser;

    public JsonStreamParser(java.io.Reader r2) {
            r1 = this;
            r1.<init>()
            com.google.gson.stream.JsonReader r0 = new com.google.gson.stream.JsonReader
            r0.<init>(r2)
            r1.parser = r0
            com.google.gson.Strictness r2 = com.google.gson.Strictness.LENIENT
            r0.setStrictness(r2)
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.lock = r2
            return
    }

    public JsonStreamParser(java.lang.String r2) {
            r1 = this;
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            com.google.gson.stream.JsonReader r1 = r3.parser     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L14 com.google.gson.stream.MalformedJsonException -> L16
            com.google.gson.stream.JsonToken r1 = r1.peek()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L14 com.google.gson.stream.MalformedJsonException -> L16
            com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L14 com.google.gson.stream.MalformedJsonException -> L16
            if (r1 == r2) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = move-exception
            goto L24
        L14:
            r1 = move-exception
            goto L18
        L16:
            r1 = move-exception
            goto L1e
        L18:
            com.google.gson.JsonIOException r2 = new com.google.gson.JsonIOException     // Catch: java.lang.Throwable -> L12
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L12
            throw r2     // Catch: java.lang.Throwable -> L12
        L1e:
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L12
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L12
            throw r2     // Catch: java.lang.Throwable -> L12
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public com.google.gson.JsonElement next() throws com.google.gson.JsonParseException {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L18
            com.google.gson.stream.JsonReader r0 = r3.parser     // Catch: java.lang.OutOfMemoryError -> Ld java.lang.StackOverflowError -> Lf
            com.google.gson.JsonElement r0 = com.google.gson.internal.Streams.parse(r0)     // Catch: java.lang.OutOfMemoryError -> Ld java.lang.StackOverflowError -> Lf
            return r0
        Ld:
            r0 = move-exception
            goto L10
        Lf:
            r0 = move-exception
        L10:
            com.google.gson.JsonParseException r1 = new com.google.gson.JsonParseException
            java.lang.String r2 = "Failed parsing JSON source to Json"
            r1.<init>(r2, r0)
            throw r1
        L18:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ com.google.gson.JsonElement next() {
            r1 = this;
            com.google.gson.JsonElement r0 = r1.next()
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
