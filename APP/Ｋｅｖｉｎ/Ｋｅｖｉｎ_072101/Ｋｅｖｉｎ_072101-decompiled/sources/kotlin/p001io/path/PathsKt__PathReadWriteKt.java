package kotlin.p001io.path;

/* JADX INFO: compiled from: PathReadWrite.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a%\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a%\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u001e\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a:\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010\u0015\u001a:\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010\u0018\u001a=\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00010\u001bH\u0087\bø\u0001\u0000\u001a&\u0010 \u001a\u00020!*\u00020\u00022\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010\"\u001a&\u0010#\u001a\u00020$*\u00020\u00022\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010%\u001a\r\u0010&\u001a\u00020\u0004*\u00020\u0002H\u0087\b\u001a\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0(*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0016\u0010)\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a0\u0010*\u001a\u00020+*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010,\u001a?\u0010-\u001a\u0002H.\"\u0004\b\u0000\u0010.*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0018\u0010/\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000b\u0012\u0004\u0012\u0002H.0\u001bH\u0087\bø\u0001\u0000¢\u0006\u0002\u00100\u001a.\u00101\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u00102\u001a>\u00103\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u00104\u001a>\u00103\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u00105\u001a7\u00106\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0002\u00107\u001a0\u00108\u001a\u000209*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010:\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;"}, m115d2 = {"appendBytes", "", "Ljava/nio/file/Path;", "array", "", "appendLines", "lines", "", "", "charset", "Ljava/nio/charset/Charset;", "Lkotlin/sequences/Sequence;", "appendText", "text", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "options", "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedReader;", "bufferedWriter", "Ljava/io/BufferedWriter;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedWriter;", "forEachLine", "action", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "line", "inputStream", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;", "readBytes", "readLines", "", "readText", "reader", "Ljava/io/InputStreamReader;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/InputStreamReader;", "useLines", "T", "block", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeBytes", "(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)V", "writeLines", "(Ljava/nio/file/Path;Ljava/lang/Iterable;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "(Ljava/nio/file/Path;Lkotlin/sequences/Sequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "writeText", "(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)V", "writer", "Ljava/io/OutputStreamWriter;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStreamWriter;", "kotlin-stdlib-jdk7"}, m116k = 5, m117mv = {1, 9, 0}, m119xi = 49, m120xs = "kotlin/io/path/PathsKt")
class PathsKt__PathReadWriteKt {
    public PathsKt__PathReadWriteKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final void appendBytes(java.nio.file.Path r3, byte[] r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            r1 = 0
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.APPEND
            r0[r1] = r2
            java.nio.file.Files.write(r3, r4, r0)
            return
    }

    private static final java.nio.file.Path appendLines(java.nio.file.Path r3, java.lang.Iterable<? extends java.lang.CharSequence> r4, java.nio.charset.Charset r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "lines"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            r1 = 0
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.APPEND
            r0[r1] = r2
            java.nio.file.Path r0 = java.nio.file.Files.write(r3, r4, r5, r0)
            java.lang.String r1 = "write(this, lines, chars…tandardOpenOption.APPEND)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.nio.file.Path appendLines(java.nio.file.Path r4, kotlin.sequences.Sequence<? extends java.lang.CharSequence> r5, java.nio.charset.Charset r6) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "lines"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.Iterable r0 = kotlin.sequences.SequencesKt.asIterable(r5)
            r1 = 1
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]
            r2 = 0
            java.nio.file.StandardOpenOption r3 = java.nio.file.StandardOpenOption.APPEND
            r1[r2] = r3
            java.nio.file.Path r0 = java.nio.file.Files.write(r4, r0, r6, r1)
            java.lang.String r1 = "write(this, lines.asIter…tandardOpenOption.APPEND)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    static /* synthetic */ java.nio.file.Path appendLines$default(java.nio.file.Path r1, java.lang.Iterable r2, java.nio.charset.Charset r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "lines"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            r4 = 1
            java.nio.file.OpenOption[] r4 = new java.nio.file.OpenOption[r4]
            r5 = 0
            java.nio.file.StandardOpenOption r0 = java.nio.file.StandardOpenOption.APPEND
            r4[r5] = r0
            java.nio.file.Path r4 = java.nio.file.Files.write(r1, r2, r3, r4)
            java.lang.String r5 = "write(this, lines, chars…tandardOpenOption.APPEND)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
    }

    static /* synthetic */ java.nio.file.Path appendLines$default(java.nio.file.Path r2, kotlin.sequences.Sequence r3, java.nio.charset.Charset r4, int r5, java.lang.Object r6) throws java.io.IOException {
            r5 = r5 & 2
            if (r5 == 0) goto L6
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "lines"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            java.lang.String r5 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            java.lang.Iterable r5 = kotlin.sequences.SequencesKt.asIterable(r3)
            r6 = 1
            java.nio.file.OpenOption[] r6 = new java.nio.file.OpenOption[r6]
            r0 = 0
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.APPEND
            r6[r0] = r1
            java.nio.file.Path r5 = java.nio.file.Files.write(r2, r5, r4, r6)
            java.lang.String r6 = "write(this, lines.asIter…tandardOpenOption.APPEND)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            return r5
    }

    public static final void appendText(java.nio.file.Path r3, java.lang.CharSequence r4, java.nio.charset.Charset r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            r1 = 0
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.APPEND
            r0[r1] = r2
            java.io.OutputStream r0 = java.nio.file.Files.newOutputStream(r3, r0)
            java.lang.String r1 = "newOutputStream(this, StandardOpenOption.APPEND)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            r1.<init>(r0, r5)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r0 = r1
            java.io.OutputStreamWriter r0 = (java.io.OutputStreamWriter) r0     // Catch: java.lang.Throwable -> L33
            r2 = 0
            r0.append(r4)     // Catch: java.lang.Throwable -> L33
            r0 = 0
            kotlin.p001io.CloseableKt.closeFinally(r1, r0)
            return
        L33:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L35
        L35:
            r2 = move-exception
            kotlin.p001io.CloseableKt.closeFinally(r1, r0)
            throw r2
    }

    public static /* synthetic */ void appendText$default(java.nio.file.Path r0, java.lang.CharSequence r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            kotlin.p001io.path.PathsKt.appendText(r0, r1, r2)
            return
    }

    private static final java.io.BufferedReader bufferedReader(java.nio.file.Path r3, java.nio.charset.Charset r4, int r5, java.nio.file.OpenOption... r6) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            int r2 = r6.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r6, r2)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.InputStream r2 = java.nio.file.Files.newInputStream(r3, r2)
            r1.<init>(r2, r4)
            java.io.Reader r1 = (java.io.Reader) r1
            r0.<init>(r1, r5)
            return r0
    }

    static /* synthetic */ java.io.BufferedReader bufferedReader$default(java.nio.file.Path r1, java.nio.charset.Charset r2, int r3, java.nio.file.OpenOption[] r4, int r5, java.lang.Object r6) throws java.io.IOException {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lc
            r3 = 8192(0x2000, float:1.148E-41)
        Lc:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            java.lang.String r5 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            java.io.BufferedReader r5 = new java.io.BufferedReader
            java.io.InputStreamReader r6 = new java.io.InputStreamReader
            int r0 = r4.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.io.InputStream r0 = java.nio.file.Files.newInputStream(r1, r0)
            r6.<init>(r0, r2)
            java.io.Reader r6 = (java.io.Reader) r6
            r5.<init>(r6, r3)
            return r5
    }

    private static final java.io.BufferedWriter bufferedWriter(java.nio.file.Path r3, java.nio.charset.Charset r4, int r5, java.nio.file.OpenOption... r6) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            int r2 = r6.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r6, r2)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.OutputStream r2 = java.nio.file.Files.newOutputStream(r3, r2)
            r1.<init>(r2, r4)
            java.io.Writer r1 = (java.io.Writer) r1
            r0.<init>(r1, r5)
            return r0
    }

    static /* synthetic */ java.io.BufferedWriter bufferedWriter$default(java.nio.file.Path r1, java.nio.charset.Charset r2, int r3, java.nio.file.OpenOption[] r4, int r5, java.lang.Object r6) throws java.io.IOException {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lc
            r3 = 8192(0x2000, float:1.148E-41)
        Lc:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            java.lang.String r5 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            java.io.BufferedWriter r5 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter
            int r0 = r4.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.io.OutputStream r0 = java.nio.file.Files.newOutputStream(r1, r0)
            r6.<init>(r0, r2)
            java.io.Writer r6 = (java.io.Writer) r6
            r5.<init>(r6, r3)
            return r5
    }

    private static final void forEachLine(java.nio.file.Path r12, java.nio.charset.Charset r13, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r14) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.io.BufferedReader r0 = java.nio.file.Files.newBufferedReader(r12, r13)
            java.lang.String r1 = "newBufferedReader(this, charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.io.Reader r0 = (java.io.Reader) r0
            r1 = 0
            r2 = r0
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            java.io.Closeable r2 = (java.io.Closeable) r2
            r3 = 1
            r4 = r2
            java.io.BufferedReader r4 = (java.io.BufferedReader) r4     // Catch: java.lang.Throwable -> L4d
            r5 = 0
            kotlin.sequences.Sequence r6 = kotlin.p001io.TextStreamsKt.lineSequence(r4)     // Catch: java.lang.Throwable -> L4d
            r7 = 0
            r8 = r6
            r9 = 0
            java.util.Iterator r10 = r8.iterator()     // Catch: java.lang.Throwable -> L4d
        L30:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r11 == 0) goto L3e
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> L4d
            r14.invoke(r11)     // Catch: java.lang.Throwable -> L4d
            goto L30
        L3e:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4d
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r4 = 0
            kotlin.p001io.CloseableKt.closeFinally(r2, r4)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            return
        L4d:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L4f
        L4f:
            r5 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            kotlin.p001io.CloseableKt.closeFinally(r2, r4)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r5
    }

    static /* synthetic */ void forEachLine$default(java.nio.file.Path r10, java.nio.charset.Charset r11, kotlin.jvm.functions.Function1 r12, int r13, java.lang.Object r14) throws java.io.IOException {
            r14 = 1
            r13 = r13 & r14
            if (r13 == 0) goto L6
            java.nio.charset.Charset r11 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r13 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r13)
            java.lang.String r13 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r13)
            java.lang.String r13 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r13)
            java.io.BufferedReader r13 = java.nio.file.Files.newBufferedReader(r10, r11)
            java.lang.String r0 = "newBufferedReader(this, charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r0)
            java.io.Reader r13 = (java.io.Reader) r13
            r0 = 0
            r1 = r13
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1
            java.io.Closeable r1 = (java.io.Closeable) r1
            r2 = r1
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch: java.lang.Throwable -> L52
            r3 = 0
            kotlin.sequences.Sequence r4 = kotlin.p001io.TextStreamsKt.lineSequence(r2)     // Catch: java.lang.Throwable -> L52
            r5 = 0
            r6 = r4
            r7 = 0
            java.util.Iterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L52
        L35:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L52
            if (r9 == 0) goto L43
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L52
            r12.invoke(r9)     // Catch: java.lang.Throwable -> L52
            goto L35
        L43:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L52
            kotlin.jvm.internal.InlineMarker.finallyStart(r14)
            r2 = 0
            kotlin.p001io.CloseableKt.closeFinally(r1, r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r14)
            return
        L52:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L54
        L54:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r14)
            kotlin.p001io.CloseableKt.closeFinally(r1, r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r14)
            throw r3
    }

    private static final java.io.InputStream inputStream(java.nio.file.Path r2, java.nio.file.OpenOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.io.InputStream r0 = java.nio.file.Files.newInputStream(r2, r0)
            java.lang.String r1 = "newInputStream(this, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.io.OutputStream outputStream(java.nio.file.Path r2, java.nio.file.OpenOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.io.OutputStream r0 = java.nio.file.Files.newOutputStream(r2, r0)
            java.lang.String r1 = "newOutputStream(this, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final byte[] readBytes(java.nio.file.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r0 = java.nio.file.Files.readAllBytes(r2)
            java.lang.String r1 = "readAllBytes(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.util.List<java.lang.String> readLines(java.nio.file.Path r2, java.nio.charset.Charset r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.List r0 = java.nio.file.Files.readAllLines(r2, r3)
            java.lang.String r1 = "readAllLines(this, charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    static /* synthetic */ java.util.List readLines$default(java.nio.file.Path r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) throws java.io.IOException {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.util.List r2 = java.nio.file.Files.readAllLines(r0, r1)
            java.lang.String r3 = "readAllLines(this, charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    public static final java.lang.String readText(java.nio.file.Path r4, java.nio.charset.Charset r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r0]
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.io.InputStream r0 = java.nio.file.Files.newInputStream(r4, r0)
            r2.<init>(r0, r5)
            java.io.Closeable r2 = (java.io.Closeable) r2
            r0 = r2
            java.io.InputStreamReader r0 = (java.io.InputStreamReader) r0     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            r3 = r0
            java.io.Reader r3 = (java.io.Reader) r3     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = kotlin.p001io.TextStreamsKt.readText(r3)     // Catch: java.lang.Throwable -> L2e
            r0 = 0
            kotlin.p001io.CloseableKt.closeFinally(r2, r0)
            return r3
        L2e:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L30
        L30:
            r1 = move-exception
            kotlin.p001io.CloseableKt.closeFinally(r2, r0)
            throw r1
    }

    public static /* synthetic */ java.lang.String readText$default(java.nio.file.Path r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) throws java.io.IOException {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r0 = kotlin.p001io.path.PathsKt.readText(r0, r1)
            return r0
    }

    private static final java.io.InputStreamReader reader(java.nio.file.Path r2, java.nio.charset.Charset r3, java.nio.file.OpenOption... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            int r1 = r4.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r1)
            java.nio.file.OpenOption[] r1 = (java.nio.file.OpenOption[]) r1
            java.io.InputStream r1 = java.nio.file.Files.newInputStream(r2, r1)
            r0.<init>(r1, r3)
            return r0
    }

    static /* synthetic */ java.io.InputStreamReader reader$default(java.nio.file.Path r0, java.nio.charset.Charset r1, java.nio.file.OpenOption[] r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            int r4 = r2.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r2, r4)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.InputStream r4 = java.nio.file.Files.newInputStream(r0, r4)
            r3.<init>(r4, r1)
            return r3
    }

    private static final <T> T useLines(java.nio.file.Path r5, java.nio.charset.Charset r6, kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<java.lang.String>, ? extends T> r7) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.io.BufferedReader r0 = java.nio.file.Files.newBufferedReader(r5, r6)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = 1
            r2 = r0
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch: java.lang.Throwable -> L32
            r3 = 0
            java.lang.String r4 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)     // Catch: java.lang.Throwable -> L32
            kotlin.sequences.Sequence r4 = kotlin.p001io.TextStreamsKt.lineSequence(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r7.invoke(r4)     // Catch: java.lang.Throwable -> L32
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r2 = 0
            kotlin.p001io.CloseableKt.closeFinally(r0, r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r4
        L32:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L34
        L34:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            kotlin.p001io.CloseableKt.closeFinally(r0, r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r3
    }

    static /* synthetic */ java.lang.Object useLines$default(java.nio.file.Path r3, java.nio.charset.Charset r4, kotlin.jvm.functions.Function1 r5, int r6, java.lang.Object r7) throws java.io.IOException {
            r7 = 1
            r6 = r6 & r7
            if (r6 == 0) goto L6
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r6)
            java.lang.String r6 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            java.lang.String r6 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            java.io.BufferedReader r6 = java.nio.file.Files.newBufferedReader(r3, r4)
            java.io.Closeable r6 = (java.io.Closeable) r6
            r0 = r6
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch: java.lang.Throwable -> L37
            r1 = 0
            java.lang.String r2 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch: java.lang.Throwable -> L37
            kotlin.sequences.Sequence r2 = kotlin.p001io.TextStreamsKt.lineSequence(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.Object r2 = r5.invoke(r2)     // Catch: java.lang.Throwable -> L37
            kotlin.jvm.internal.InlineMarker.finallyStart(r7)
            r0 = 0
            kotlin.p001io.CloseableKt.closeFinally(r6, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r7)
            return r2
        L37:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L39
        L39:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r7)
            kotlin.p001io.CloseableKt.closeFinally(r6, r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r7)
            throw r1
    }

    private static final void writeBytes(java.nio.file.Path r1, byte[] r2, java.nio.file.OpenOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.nio.file.Files.write(r1, r2, r0)
            return
    }

    private static final java.nio.file.Path writeLines(java.nio.file.Path r2, java.lang.Iterable<? extends java.lang.CharSequence> r3, java.nio.charset.Charset r4, java.nio.file.OpenOption... r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "lines"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.nio.file.Path r0 = java.nio.file.Files.write(r2, r3, r4, r0)
            java.lang.String r1 = "write(this, lines, charset, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.nio.file.Path writeLines(java.nio.file.Path r2, kotlin.sequences.Sequence<? extends java.lang.CharSequence> r3, java.nio.charset.Charset r4, java.nio.file.OpenOption... r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "lines"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Iterable r0 = kotlin.sequences.SequencesKt.asIterable(r3)
            int r1 = r5.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r1)
            java.nio.file.OpenOption[] r1 = (java.nio.file.OpenOption[]) r1
            java.nio.file.Path r0 = java.nio.file.Files.write(r2, r0, r4, r1)
            java.lang.String r1 = "write(this, lines.asIterable(), charset, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    static /* synthetic */ java.nio.file.Path writeLines$default(java.nio.file.Path r0, java.lang.Iterable r1, java.nio.charset.Charset r2, java.nio.file.OpenOption[] r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "lines"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            int r4 = r3.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r3, r4)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.nio.file.Path r4 = java.nio.file.Files.write(r0, r1, r2, r4)
            java.lang.String r5 = "write(this, lines, charset, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
    }

    static /* synthetic */ java.nio.file.Path writeLines$default(java.nio.file.Path r0, kotlin.sequences.Sequence r1, java.nio.charset.Charset r2, java.nio.file.OpenOption[] r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "lines"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            java.lang.Iterable r4 = kotlin.sequences.SequencesKt.asIterable(r1)
            int r5 = r3.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r3, r5)
            java.nio.file.OpenOption[] r5 = (java.nio.file.OpenOption[]) r5
            java.nio.file.Path r4 = java.nio.file.Files.write(r0, r4, r2, r5)
            java.lang.String r5 = "write(this, lines.asIterable(), charset, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
    }

    public static final void writeText(java.nio.file.Path r3, java.lang.CharSequence r4, java.nio.charset.Charset r5, java.nio.file.OpenOption... r6) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r6.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r6, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.io.OutputStream r0 = java.nio.file.Files.newOutputStream(r3, r0)
            java.lang.String r1 = "newOutputStream(this, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            r1.<init>(r0, r5)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r0 = r1
            java.io.OutputStreamWriter r0 = (java.io.OutputStreamWriter) r0     // Catch: java.lang.Throwable -> L37
            r2 = 0
            r0.append(r4)     // Catch: java.lang.Throwable -> L37
            r0 = 0
            kotlin.p001io.CloseableKt.closeFinally(r1, r0)
            return
        L37:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L39
        L39:
            r2 = move-exception
            kotlin.p001io.CloseableKt.closeFinally(r1, r0)
            throw r2
    }

    public static /* synthetic */ void writeText$default(java.nio.file.Path r0, java.lang.CharSequence r1, java.nio.charset.Charset r2, java.nio.file.OpenOption[] r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            kotlin.p001io.path.PathsKt.writeText(r0, r1, r2, r3)
            return
    }

    private static final java.io.OutputStreamWriter writer(java.nio.file.Path r2, java.nio.charset.Charset r3, java.nio.file.OpenOption... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            int r1 = r4.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r1)
            java.nio.file.OpenOption[] r1 = (java.nio.file.OpenOption[]) r1
            java.io.OutputStream r1 = java.nio.file.Files.newOutputStream(r2, r1)
            r0.<init>(r1, r3)
            return r0
    }

    static /* synthetic */ java.io.OutputStreamWriter writer$default(java.nio.file.Path r0, java.nio.charset.Charset r1, java.nio.file.OpenOption[] r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter
            int r4 = r2.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r2, r4)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.OutputStream r4 = java.nio.file.Files.newOutputStream(r0, r4)
            r3.<init>(r4, r1)
            return r3
    }
}
