package kotlin.p001io;

/* JADX INFO: compiled from: FileReadWrite.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a!\u0010\n\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0087\b\u001a!\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0087\b\u001aB\u0010\u0010\u001a\u00020\u0001*\u00020\u000226\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001aJ\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\r26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001a7\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00010\u0019\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0002H\u0087\b\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0017\u0010\u001f\u001a\u00020 *\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u001a\n\u0010!\u001a\u00020\u0004*\u00020\u0002\u001a\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0014\u0010$\u001a\u00020\u0007*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010%\u001a\u00020&*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u001a?\u0010'\u001a\u0002H(\"\u0004\b\u0000\u0010(*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070*\u0012\u0004\u0012\u0002H(0\u0019H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010+\u001a\u0012\u0010,\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010.\u001a\u00020/*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00060"}, m115d2 = {"appendBytes", "", "Ljava/io/File;", "array", "", "appendText", "text", "", "charset", "Ljava/nio/charset/Charset;", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "bufferedWriter", "Ljava/io/BufferedWriter;", "forEachBlock", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "buffer", "bytesRead", "blockSize", "forEachLine", "Lkotlin/Function1;", "line", "inputStream", "Ljava/io/FileInputStream;", "outputStream", "Ljava/io/FileOutputStream;", "printWriter", "Ljava/io/PrintWriter;", "readBytes", "readLines", "", "readText", "reader", "Ljava/io/InputStreamReader;", "useLines", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeBytes", "writeText", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, m116k = 5, m117mv = {1, 9, 0}, m119xi = 49, m120xs = "kotlin/io/FilesKt")
class FilesKt__FileReadWriteKt extends kotlin.p001io.FilesKt__FilePathComponentsKt {


    public FilesKt__FileReadWriteKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final void appendBytes(java.io.File r3, byte[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r3, r1)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            java.io.FileOutputStream r1 = (java.io.FileOutputStream) r1     // Catch: java.lang.Throwable -> L20
            r2 = 0
            r1.write(r4)     // Catch: java.lang.Throwable -> L20
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L20
            r1 = 0
            kotlin.p001io.CloseableKt.closeFinally(r0, r1)
            return
        L20:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L22
        L22:
            r2 = move-exception
            kotlin.p001io.CloseableKt.closeFinally(r0, r1)
            throw r2
    }

    public static final void appendText(java.io.File r2, java.lang.String r3, java.nio.charset.Charset r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            byte[] r0 = r3.getBytes(r4)
            java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.p001io.FilesKt.appendBytes(r2, r0)
            return
    }

    public static /* synthetic */ void appendText$default(java.io.File r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            kotlin.p001io.FilesKt.appendText(r0, r1, r2)
            return
    }

    private static final java.io.BufferedReader bufferedReader(java.io.File r2, java.nio.charset.Charset r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            java.io.InputStream r1 = (java.io.InputStream) r1
            r0.<init>(r1, r3)
            java.io.Reader r0 = (java.io.Reader) r0
            boolean r1 = r0 instanceof java.io.BufferedReader
            if (r1 == 0) goto L1f
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            goto L25
        L1f:
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r1.<init>(r0, r4)
            r0 = r1
        L25:
            return r0
    }

    static /* synthetic */ java.io.BufferedReader bufferedReader$default(java.io.File r0, java.nio.charset.Charset r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 8192(0x2000, float:1.148E-41)
        Lc:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.io.FileInputStream r4 = new java.io.FileInputStream
            r4.<init>(r0)
            java.io.InputStream r4 = (java.io.InputStream) r4
            r3.<init>(r4, r1)
            java.io.Reader r3 = (java.io.Reader) r3
            boolean r4 = r3 instanceof java.io.BufferedReader
            if (r4 == 0) goto L2b
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            goto L31
        L2b:
            java.io.BufferedReader r4 = new java.io.BufferedReader
            r4.<init>(r3, r2)
            r3 = r4
        L31:
            return r3
    }

    private static final java.io.BufferedWriter bufferedWriter(java.io.File r2, java.nio.charset.Charset r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r2)
            java.io.OutputStream r1 = (java.io.OutputStream) r1
            r0.<init>(r1, r3)
            java.io.Writer r0 = (java.io.Writer) r0
            boolean r1 = r0 instanceof java.io.BufferedWriter
            if (r1 == 0) goto L1f
            java.io.BufferedWriter r0 = (java.io.BufferedWriter) r0
            goto L25
        L1f:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter
            r1.<init>(r0, r4)
            r0 = r1
        L25:
            return r0
    }

    static /* synthetic */ java.io.BufferedWriter bufferedWriter$default(java.io.File r0, java.nio.charset.Charset r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 8192(0x2000, float:1.148E-41)
        Lc:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r4 = new java.io.FileOutputStream
            r4.<init>(r0)
            java.io.OutputStream r4 = (java.io.OutputStream) r4
            r3.<init>(r4, r1)
            java.io.Writer r3 = (java.io.Writer) r3
            boolean r4 = r3 instanceof java.io.BufferedWriter
            if (r4 == 0) goto L2b
            java.io.BufferedWriter r3 = (java.io.BufferedWriter) r3
            goto L31
        L2b:
            java.io.BufferedWriter r4 = new java.io.BufferedWriter
            r4.<init>(r3, r2)
            r3 = r4
        L31:
            return r3
    }

    public static final void forEachBlock(java.io.File r6, int r7, kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Integer, kotlin.Unit> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 512(0x200, float:7.17E-43)
            int r0 = kotlin.ranges.RangesKt.coerceAtLeast(r7, r0)
            byte[] r0 = new byte[r0]
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r6)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r2 = r1
            java.io.FileInputStream r2 = (java.io.FileInputStream) r2     // Catch: java.lang.Throwable -> L35
            r3 = 0
        L1d:
            int r4 = r2.read(r0)     // Catch: java.lang.Throwable -> L35
            if (r4 > 0) goto L2c
        L25:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L35
            r2 = 0
            kotlin.p001io.CloseableKt.closeFinally(r1, r2)
            return
        L2c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L35
            r8.invoke(r0, r5)     // Catch: java.lang.Throwable -> L35
            goto L1d
        L35:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L37
        L37:
            r3 = move-exception
            kotlin.p001io.CloseableKt.closeFinally(r1, r2)
            throw r3
    }

    public static final void forEachBlock(java.io.File r1, kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Integer, kotlin.Unit> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 4096(0x1000, float:5.74E-42)
            kotlin.p001io.FilesKt.forEachBlock(r1, r0, r2)
            return
    }

    public static final void forEachLine(java.io.File r3, java.nio.charset.Charset r4, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r3)
            java.io.InputStream r2 = (java.io.InputStream) r2
            r1.<init>(r2, r4)
            java.io.Reader r1 = (java.io.Reader) r1
            r0.<init>(r1)
            java.io.Reader r0 = (java.io.Reader) r0
            kotlin.p001io.TextStreamsKt.forEachLine(r0, r5)
            return
    }

    public static /* synthetic */ void forEachLine$default(java.io.File r0, java.nio.charset.Charset r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            kotlin.p001io.FilesKt.forEachLine(r0, r1, r2)
            return
    }

    private static final java.io.FileInputStream inputStream(java.io.File r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            return r0
    }

    private static final java.io.FileOutputStream outputStream(java.io.File r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            return r0
    }

    private static final java.io.PrintWriter printWriter(java.io.File r4, java.nio.charset.Charset r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.io.PrintWriter r0 = new java.io.PrintWriter
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r4)
            java.io.OutputStream r2 = (java.io.OutputStream) r2
            r1.<init>(r2, r5)
            java.io.Writer r1 = (java.io.Writer) r1
            boolean r2 = r1 instanceof java.io.BufferedWriter
            if (r2 == 0) goto L21
            java.io.BufferedWriter r1 = (java.io.BufferedWriter) r1
            goto L29
        L21:
            java.io.BufferedWriter r2 = new java.io.BufferedWriter
            r3 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r1, r3)
            r1 = r2
        L29:
            java.io.Writer r1 = (java.io.Writer) r1
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ java.io.PrintWriter printWriter$default(java.io.File r2, java.nio.charset.Charset r3, int r4, java.lang.Object r5) {
            r4 = r4 & 1
            if (r4 == 0) goto L6
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            java.io.PrintWriter r4 = new java.io.PrintWriter
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r2)
            java.io.OutputStream r0 = (java.io.OutputStream) r0
            r5.<init>(r0, r3)
            java.io.Writer r5 = (java.io.Writer) r5
            boolean r0 = r5 instanceof java.io.BufferedWriter
            if (r0 == 0) goto L27
            java.io.BufferedWriter r5 = (java.io.BufferedWriter) r5
            goto L2f
        L27:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r5, r1)
            r5 = r0
        L2f:
            java.io.Writer r5 = (java.io.Writer) r5
            r4.<init>(r5)
            return r4
    }

    public static final byte[] readBytes(java.io.File r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r15)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            java.io.FileInputStream r1 = (java.io.FileInputStream) r1     // Catch: java.lang.Throwable -> Lc1
            r2 = 0
            r3 = 0
            long r4 = r15.length()     // Catch: java.lang.Throwable -> Lc1
            r6 = r4
            r8 = 0
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            java.lang.String r10 = "File "
            if (r9 > 0) goto L9a
        L22:
            int r4 = (int) r4
            byte[] r5 = new byte[r4]     // Catch: java.lang.Throwable -> Lc1
        L26:
            if (r4 <= 0) goto L31
            int r6 = r1.read(r5, r3, r4)     // Catch: java.lang.Throwable -> Lc1
            if (r6 < 0) goto L31
            int r4 = r4 - r6
            int r3 = r3 + r6
            goto L26
        L31:
            java.lang.String r6 = "copyOf(this, newSize)"
            r7 = 0
            if (r4 <= 0) goto L3f
            byte[] r8 = java.util.Arrays.copyOf(r5, r3)     // Catch: java.lang.Throwable -> Lc1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)     // Catch: java.lang.Throwable -> Lc1
            r5 = r8
            goto L79
        L3f:
            int r8 = r1.read()     // Catch: java.lang.Throwable -> Lc1
            r9 = -1
            if (r8 != r9) goto L47
            goto L79
        L47:
            kotlin.io.ExposingBufferByteArrayOutputStream r9 = new kotlin.io.ExposingBufferByteArrayOutputStream     // Catch: java.lang.Throwable -> Lc1
            r11 = 8193(0x2001, float:1.1481E-41)
            r9.<init>(r11)     // Catch: java.lang.Throwable -> Lc1
            r9.write(r8)     // Catch: java.lang.Throwable -> Lc1
            r11 = r1
            java.io.InputStream r11 = (java.io.InputStream) r11     // Catch: java.lang.Throwable -> Lc1
            r12 = r9
            java.io.OutputStream r12 = (java.io.OutputStream) r12     // Catch: java.lang.Throwable -> Lc1
            r13 = 2
            r14 = 0
            kotlin.p001io.ByteStreamsKt.copyTo$default(r11, r12, r14, r13, r7)     // Catch: java.lang.Throwable -> Lc1
            int r11 = r5.length     // Catch: java.lang.Throwable -> Lc1
            int r12 = r9.size()     // Catch: java.lang.Throwable -> Lc1
            int r11 = r11 + r12
            if (r11 < 0) goto L7d
            byte[] r10 = r9.getBuffer()     // Catch: java.lang.Throwable -> Lc1
            byte[] r12 = java.util.Arrays.copyOf(r5, r11)     // Catch: java.lang.Throwable -> Lc1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r6)     // Catch: java.lang.Throwable -> Lc1
            int r6 = r5.length     // Catch: java.lang.Throwable -> Lc1
            int r13 = r9.size()     // Catch: java.lang.Throwable -> Lc1
            byte[] r6 = kotlin.collections.ArraysKt.copyInto(r10, r12, r6, r14, r13)     // Catch: java.lang.Throwable -> Lc1
            r5 = r6
        L79:
            kotlin.p001io.CloseableKt.closeFinally(r0, r7)
            return r5
        L7d:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> Lc1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
            r7.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.lang.StringBuilder r7 = r7.append(r10)     // Catch: java.lang.Throwable -> Lc1
            java.lang.StringBuilder r7 = r7.append(r15)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r10 = " is too big to fit in memory."
            java.lang.StringBuilder r7 = r7.append(r10)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lc1
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lc1
            throw r6     // Catch: java.lang.Throwable -> Lc1
        L9a:
            java.lang.OutOfMemoryError r4 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> Lc1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
            r5.<init>()     // Catch: java.lang.Throwable -> Lc1
            java.lang.StringBuilder r5 = r5.append(r10)     // Catch: java.lang.Throwable -> Lc1
            java.lang.StringBuilder r5 = r5.append(r15)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r9 = " is too big ("
            java.lang.StringBuilder r5 = r5.append(r9)     // Catch: java.lang.Throwable -> Lc1
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r9 = " bytes) to fit in memory."
            java.lang.StringBuilder r5 = r5.append(r9)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lc1
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lc1
            throw r4     // Catch: java.lang.Throwable -> Lc1
        Lc1:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r2 = move-exception
            kotlin.p001io.CloseableKt.closeFinally(r0, r1)
            throw r2
    }

    public static final java.util.List<java.lang.String> readLines(java.io.File r2, java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.io.FilesKt__FileReadWriteKt$readLines$1 r1 = new kotlin.io.FilesKt__FileReadWriteKt$readLines$1
            r1.<init>(r0)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            kotlin.p001io.FilesKt.forEachLine(r2, r3, r1)
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static /* synthetic */ java.util.List readLines$default(java.io.File r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.util.List r0 = kotlin.p001io.FilesKt.readLines(r0, r1)
            return r0
    }

    public static final java.lang.String readText(java.io.File r4, java.nio.charset.Charset r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r4)
            java.io.InputStream r1 = (java.io.InputStream) r1
            r0.<init>(r1, r5)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            java.io.InputStreamReader r1 = (java.io.InputStreamReader) r1     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r3 = r1
            java.io.Reader r3 = (java.io.Reader) r3     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = kotlin.p001io.TextStreamsKt.readText(r3)     // Catch: java.lang.Throwable -> L28
            r1 = 0
            kotlin.p001io.CloseableKt.closeFinally(r0, r1)
            return r3
        L28:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L2a
        L2a:
            r2 = move-exception
            kotlin.p001io.CloseableKt.closeFinally(r0, r1)
            throw r2
    }

    public static /* synthetic */ java.lang.String readText$default(java.io.File r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r0 = kotlin.p001io.FilesKt.readText(r0, r1)
            return r0
    }

    private static final java.io.InputStreamReader reader(java.io.File r2, java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            java.io.InputStream r1 = (java.io.InputStream) r1
            r0.<init>(r1, r3)
            return r0
    }

    static /* synthetic */ java.io.InputStreamReader reader$default(java.io.File r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r0)
            java.io.InputStream r3 = (java.io.InputStream) r3
            r2.<init>(r3, r1)
            return r2
    }

    public static final <T> T useLines(java.io.File r6, java.nio.charset.Charset r7, kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<java.lang.String>, ? extends T> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r6)
            java.io.InputStream r2 = (java.io.InputStream) r2
            r1.<init>(r2, r7)
            java.io.Reader r1 = (java.io.Reader) r1
            boolean r2 = r1 instanceof java.io.BufferedReader
            if (r2 == 0) goto L25
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1
            goto L2d
        L25:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r3 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r1, r3)
            r1 = r2
        L2d:
            java.io.Closeable r1 = (java.io.Closeable) r1
            r2 = 1
            r3 = r1
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3     // Catch: java.lang.Throwable -> L47
            r4 = 0
            kotlin.sequences.Sequence r5 = kotlin.p001io.TextStreamsKt.lineSequence(r3)     // Catch: java.lang.Throwable -> L47
            java.lang.Object r5 = r8.invoke(r5)     // Catch: java.lang.Throwable -> L47
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r3 = 0
            kotlin.p001io.CloseableKt.closeFinally(r1, r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return r5
        L47:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L49
        L49:
            r4 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlin.p001io.CloseableKt.closeFinally(r1, r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r4
    }

    public static /* synthetic */ java.lang.Object useLines$default(java.io.File r6, java.nio.charset.Charset r7, kotlin.jvm.functions.Function1 r8, int r9, java.lang.Object r10) {
            r10 = 1
            r9 = r9 & r10
            if (r9 == 0) goto L6
            java.nio.charset.Charset r7 = kotlin.text.Charsets.UTF_8
        L6:
            r9 = r7
            r0 = r6
            r1 = 0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r0)
            java.io.InputStream r3 = (java.io.InputStream) r3
            r2.<init>(r3, r9)
            java.io.Reader r2 = (java.io.Reader) r2
            boolean r3 = r2 instanceof java.io.BufferedReader
            if (r3 == 0) goto L1e
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            goto L26
        L1e:
            java.io.BufferedReader r3 = new java.io.BufferedReader
            r4 = 8192(0x2000, float:1.148E-41)
            r3.<init>(r2, r4)
            r2 = r3
        L26:
            java.io.Closeable r2 = (java.io.Closeable) r2
            r3 = r2
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3     // Catch: java.lang.Throwable -> L3f
            r4 = 0
            kotlin.sequences.Sequence r5 = kotlin.p001io.TextStreamsKt.lineSequence(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r5 = r8.invoke(r5)     // Catch: java.lang.Throwable -> L3f
            kotlin.jvm.internal.InlineMarker.finallyStart(r10)
            r3 = 0
            kotlin.p001io.CloseableKt.closeFinally(r2, r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r10)
            return r5
        L3f:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L41
        L41:
            r4 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r10)
            kotlin.p001io.CloseableKt.closeFinally(r2, r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r10)
            throw r4
    }

    public static final void writeBytes(java.io.File r3, byte[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r3)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            java.io.FileOutputStream r1 = (java.io.FileOutputStream) r1     // Catch: java.lang.Throwable -> L1f
            r2 = 0
            r1.write(r4)     // Catch: java.lang.Throwable -> L1f
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            kotlin.p001io.CloseableKt.closeFinally(r0, r1)
            return
        L1f:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L21
        L21:
            r2 = move-exception
            kotlin.p001io.CloseableKt.closeFinally(r0, r1)
            throw r2
    }

    public static final void writeText(java.io.File r2, java.lang.String r3, java.nio.charset.Charset r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            byte[] r0 = r3.getBytes(r4)
            java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.p001io.FilesKt.writeBytes(r2, r0)
            return
    }

    public static /* synthetic */ void writeText$default(java.io.File r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            kotlin.p001io.FilesKt.writeText(r0, r1, r2)
            return
    }

    private static final java.io.OutputStreamWriter writer(java.io.File r2, java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r2)
            java.io.OutputStream r1 = (java.io.OutputStream) r1
            r0.<init>(r1, r3)
            return r0
    }

    static /* synthetic */ java.io.OutputStreamWriter writer$default(java.io.File r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r3 = new java.io.FileOutputStream
            r3.<init>(r0)
            java.io.OutputStream r3 = (java.io.OutputStream) r3
            r2.<init>(r3, r1)
            return r2
    }
}
