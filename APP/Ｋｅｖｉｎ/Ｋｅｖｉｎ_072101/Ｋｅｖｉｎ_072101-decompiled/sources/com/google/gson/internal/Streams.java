package com.google.gson.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class Streams {

    /* JADX INFO: renamed from: com.google.gson.internal.Streams$1 */
    static /* synthetic */ class C04141 {
    }

    private static final class AppendableWriter extends java.io.Writer {
        private final java.lang.Appendable appendable;
        private final com.google.gson.internal.Streams.AppendableWriter.CurrentWrite currentWrite;

        private static class CurrentWrite implements java.lang.CharSequence {
            private java.lang.String cachedString;
            private char[] chars;

            private CurrentWrite() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            /* synthetic */ CurrentWrite(com.google.gson.internal.Streams.C04141 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // java.lang.CharSequence
            public char charAt(int r2) {
                    r1 = this;
                    char[] r0 = r1.chars
                    char r0 = r0[r2]
                    return r0
            }

            @Override // java.lang.CharSequence
            public int length() {
                    r1 = this;
                    char[] r0 = r1.chars
                    int r0 = r0.length
                    return r0
            }

            void setChars(char[] r2) {
                    r1 = this;
                    r1.chars = r2
                    r0 = 0
                    r1.cachedString = r0
                    return
            }

            @Override // java.lang.CharSequence
            public java.lang.CharSequence subSequence(int r4, int r5) {
                    r3 = this;
                    java.lang.String r0 = new java.lang.String
                    char[] r1 = r3.chars
                    int r2 = r5 - r4
                    r0.<init>(r1, r4, r2)
                    return r0
            }

            @Override // java.lang.CharSequence
            public java.lang.String toString() {
                    r2 = this;
                    java.lang.String r0 = r2.cachedString
                    if (r0 != 0) goto Ld
                    java.lang.String r0 = new java.lang.String
                    char[] r1 = r2.chars
                    r0.<init>(r1)
                    r2.cachedString = r0
                Ld:
                    java.lang.String r0 = r2.cachedString
                    return r0
            }
        }

        AppendableWriter(java.lang.Appendable r3) {
                r2 = this;
                r2.<init>()
                com.google.gson.internal.Streams$AppendableWriter$CurrentWrite r0 = new com.google.gson.internal.Streams$AppendableWriter$CurrentWrite
                r1 = 0
                r0.<init>(r1)
                r2.currentWrite = r0
                r2.appendable = r3
                return
        }

        @Override // java.io.Writer, java.lang.Appendable
        public java.io.Writer append(java.lang.CharSequence r2) throws java.io.IOException {
                r1 = this;
                java.lang.Appendable r0 = r1.appendable
                r0.append(r2)
                return r1
        }

        @Override // java.io.Writer, java.lang.Appendable
        public java.io.Writer append(java.lang.CharSequence r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.lang.Appendable r0 = r1.appendable
                r0.append(r2, r3, r4)
                return r1
        }

        @Override // java.io.Writer, java.lang.Appendable
        public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1) throws java.io.IOException {
                r0 = this;
                java.io.Writer r1 = r0.append(r1)
                return r1
        }

        @Override // java.io.Writer, java.lang.Appendable
        public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                java.io.Writer r1 = r0.append(r1, r2, r3)
                return r1
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
                return
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
                r0 = this;
                return
        }

        @Override // java.io.Writer
        public void write(int r3) throws java.io.IOException {
                r2 = this;
                java.lang.Appendable r0 = r2.appendable
                char r1 = (char) r3
                r0.append(r1)
                return
        }

        @Override // java.io.Writer
        public void write(java.lang.String r3, int r4, int r5) throws java.io.IOException {
                r2 = this;
                java.util.Objects.requireNonNull(r3)
                java.lang.Appendable r0 = r2.appendable
                int r1 = r4 + r5
                r0.append(r3, r4, r1)
                return
        }

        @Override // java.io.Writer
        public void write(char[] r4, int r5, int r6) throws java.io.IOException {
                r3 = this;
                com.google.gson.internal.Streams$AppendableWriter$CurrentWrite r0 = r3.currentWrite
                r0.setChars(r4)
                java.lang.Appendable r0 = r3.appendable
                com.google.gson.internal.Streams$AppendableWriter$CurrentWrite r1 = r3.currentWrite
                int r2 = r5 + r6
                r0.append(r1, r5, r2)
                return
        }
    }

    private Streams() {
            r1 = this;
            r1.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public static com.google.gson.JsonElement parse(com.google.gson.stream.JsonReader r3) throws com.google.gson.JsonParseException {
            r0 = 1
            r3.peek()     // Catch: java.lang.NumberFormatException -> Le java.io.IOException -> L15 com.google.gson.stream.MalformedJsonException -> L1c java.io.EOFException -> L23
            r0 = 0
            com.google.gson.TypeAdapter<com.google.gson.JsonElement> r1 = com.google.gson.internal.bind.TypeAdapters.JSON_ELEMENT     // Catch: java.lang.NumberFormatException -> Le java.io.IOException -> L15 com.google.gson.stream.MalformedJsonException -> L1c java.io.EOFException -> L23
            java.lang.Object r1 = r1.read(r3)     // Catch: java.lang.NumberFormatException -> Le java.io.IOException -> L15 com.google.gson.stream.MalformedJsonException -> L1c java.io.EOFException -> L23
            com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1     // Catch: java.lang.NumberFormatException -> Le java.io.IOException -> L15 com.google.gson.stream.MalformedJsonException -> L1c java.io.EOFException -> L23
            return r1
        Le:
            r1 = move-exception
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException
            r2.<init>(r1)
            throw r2
        L15:
            r1 = move-exception
            com.google.gson.JsonIOException r2 = new com.google.gson.JsonIOException
            r2.<init>(r1)
            throw r2
        L1c:
            r1 = move-exception
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException
            r2.<init>(r1)
            throw r2
        L23:
            r1 = move-exception
            if (r0 == 0) goto L29
            com.google.gson.JsonNull r2 = com.google.gson.JsonNull.INSTANCE
            return r2
        L29:
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException
            r2.<init>(r1)
            throw r2
    }

    public static void write(com.google.gson.JsonElement r1, com.google.gson.stream.JsonWriter r2) throws java.io.IOException {
            com.google.gson.TypeAdapter<com.google.gson.JsonElement> r0 = com.google.gson.internal.bind.TypeAdapters.JSON_ELEMENT
            r0.write(r2, r1)
            return
    }

    public static java.io.Writer writerForAppendable(java.lang.Appendable r1) {
            boolean r0 = r1 instanceof java.io.Writer
            if (r0 == 0) goto L8
            r0 = r1
            java.io.Writer r0 = (java.io.Writer) r0
            goto Ld
        L8:
            com.google.gson.internal.Streams$AppendableWriter r0 = new com.google.gson.internal.Streams$AppendableWriter
            r0.<init>(r1)
        Ld:
            return r0
    }
}
