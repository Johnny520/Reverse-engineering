package com.google.gson.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class Streams {

    /* JADX INFO: renamed from: com.google.gson.internal.Streams$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class AppendableWriter extends java.io.Writer {
        private final java.lang.Appendable appendable;
        private final com.google.gson.internal.Streams.AppendableWriter.CurrentWrite currentWrite;

        public static class CurrentWrite implements java.lang.CharSequence {
            private java.lang.String cachedString;
            private char[] chars;

            private CurrentWrite() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ CurrentWrite(com.google.gson.internal.Streams.AnonymousClass1 r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // java.lang.CharSequence
            public char charAt(int r2) {
                    r1 = this;
                    char[] r0 = r1.chars
                    char r2 = r0[r2]
                    return r2
            }

            @Override // java.lang.CharSequence
            public int length() {
                    r1 = this;
                    char[] r0 = r1.chars
                    int r0 = r0.length
                    return r0
            }

            public void setChars(char[] r1) {
                    r0 = this;
                    r0.chars = r1
                    r1 = 0
                    r0.cachedString = r1
                    return
            }

            @Override // java.lang.CharSequence
            public java.lang.CharSequence subSequence(int r3, int r4) {
                    r2 = this;
                    java.lang.String r0 = new java.lang.String
                    char[] r1 = r2.chars
                    int r4 = r4 - r3
                    r0.<init>(r1, r3, r4)
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

        public AppendableWriter(java.lang.Appendable r3) {
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
        public void close() throws java.io.IOException {
                r2 = this;
                java.lang.Appendable r0 = r2.appendable
                boolean r1 = r0 instanceof java.io.Closeable
                if (r1 == 0) goto Lb
                java.io.Closeable r0 = (java.io.Closeable) r0
                r0.close()
            Lb:
                return
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws java.io.IOException {
                r2 = this;
                java.lang.Appendable r0 = r2.appendable
                boolean r1 = r0 instanceof java.io.Flushable
                if (r1 == 0) goto Lb
                java.io.Flushable r0 = (java.io.Flushable) r0
                r0.flush()
            Lb:
                return
        }

        @Override // java.io.Writer
        public void write(int r2) throws java.io.IOException {
                r1 = this;
                java.lang.Appendable r0 = r1.appendable
                char r2 = (char) r2
                r0.append(r2)
                return
        }

        @Override // java.io.Writer
        public void write(java.lang.String r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.util.Objects.requireNonNull(r2)
                java.lang.Appendable r0 = r1.appendable
                int r4 = r4 + r3
                r0.append(r2, r3, r4)
                return
        }

        @Override // java.io.Writer
        public void write(char[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                com.google.gson.internal.Streams$AppendableWriter$CurrentWrite r0 = r1.currentWrite
                r0.setChars(r2)
                java.lang.Appendable r2 = r1.appendable
                com.google.gson.internal.Streams$AppendableWriter$CurrentWrite r0 = r1.currentWrite
                int r4 = r4 + r3
                r2.append(r0, r3, r4)
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

    public static com.google.gson.JsonElement parse(com.google.gson.stream.JsonReader r2) throws com.google.gson.JsonParseException {
            r2.peek()     // Catch: java.lang.NumberFormatException -> Lb java.io.IOException -> Ld com.google.gson.stream.MalformedJsonException -> Lf java.io.EOFException -> L25
            r0 = 0
            com.google.gson.internal.bind.JsonElementTypeAdapter r1 = com.google.gson.internal.bind.JsonElementTypeAdapter.ADAPTER     // Catch: java.lang.NumberFormatException -> Lb java.io.IOException -> Ld com.google.gson.stream.MalformedJsonException -> Lf java.io.EOFException -> L11
            com.google.gson.JsonElement r2 = r1.read(r2)     // Catch: java.lang.NumberFormatException -> Lb java.io.IOException -> Ld com.google.gson.stream.MalformedJsonException -> Lf java.io.EOFException -> L11
            return r2
        Lb:
            r2 = move-exception
            goto L13
        Ld:
            r2 = move-exception
            goto L19
        Lf:
            r2 = move-exception
            goto L1f
        L11:
            r2 = move-exception
            goto L27
        L13:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r2)
            throw r0
        L19:
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>(r2)
            throw r0
        L1f:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r2)
            throw r0
        L25:
            r2 = move-exception
            r0 = 1
        L27:
            if (r0 == 0) goto L2c
            com.google.gson.JsonNull r2 = com.google.gson.JsonNull.INSTANCE
            return r2
        L2c:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r2)
            throw r0
    }

    public static void write(com.google.gson.JsonElement r1, com.google.gson.stream.JsonWriter r2) throws java.io.IOException {
            com.google.gson.internal.bind.JsonElementTypeAdapter r0 = com.google.gson.internal.bind.JsonElementTypeAdapter.ADAPTER
            r0.write2(r2, r1)
            return
    }

    public static java.io.Writer writerForAppendable(java.lang.Appendable r1) {
            boolean r0 = r1 instanceof java.io.Writer
            if (r0 == 0) goto L7
            java.io.Writer r1 = (java.io.Writer) r1
            goto Ld
        L7:
            com.google.gson.internal.Streams$AppendableWriter r0 = new com.google.gson.internal.Streams$AppendableWriter
            r0.<init>(r1)
            r1 = r0
        Ld:
            return r1
    }
}
