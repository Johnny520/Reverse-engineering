package okio.internal;

/* JADX INFO: compiled from: ZipFiles.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000j\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017H\u0002\u001a\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u001b\u001a.\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020#0\"H\u0000\u001a\f\u0010$\u001a\u00020\u0015*\u00020%H\u0000\u001a\f\u0010&\u001a\u00020'*\u00020%H\u0002\u001a.\u0010(\u001a\u00020)*\u00020%2\u0006\u0010*\u001a\u00020\u00012\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020)0,H\u0002\u001a\u0014\u0010-\u001a\u00020.*\u00020%2\u0006\u0010/\u001a\u00020.H\u0000\u001a\u0018\u00100\u001a\u0004\u0018\u00010.*\u00020%2\b\u0010/\u001a\u0004\u0018\u00010.H\u0002\u001a\u0014\u00101\u001a\u00020'*\u00020%2\u0006\u00102\u001a\u00020'H\u0002\u001a\f\u00103\u001a\u00020)*\u00020%H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u00064"}, m115d2 = {"BIT_FLAG_ENCRYPTED", "", "BIT_FLAG_UNSUPPORTED_MASK", "CENTRAL_FILE_HEADER_SIGNATURE", "COMPRESSION_METHOD_DEFLATED", "COMPRESSION_METHOD_STORED", "END_OF_CENTRAL_DIRECTORY_SIGNATURE", "HEADER_ID_EXTENDED_TIMESTAMP", "HEADER_ID_ZIP64_EXTENDED_INFO", "LOCAL_FILE_HEADER_SIGNATURE", "MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE", "", "ZIP64_EOCD_RECORD_SIGNATURE", "ZIP64_LOCATOR_SIGNATURE", "hex", "", "getHex", "(I)Ljava/lang/String;", "buildIndex", "", "Lokio/Path;", "Lokio/internal/ZipEntry;", "entries", "", "dosDateTimeToEpochMillis", "date", "time", "(II)Ljava/lang/Long;", "openZip", "Lokio/ZipFileSystem;", "zipPath", "fileSystem", "Lokio/FileSystem;", "predicate", "Lkotlin/Function1;", "", "readEntry", "Lokio/BufferedSource;", "readEocdRecord", "Lokio/internal/EocdRecord;", "readExtra", "", "extraSize", "block", "Lkotlin/Function2;", "readLocalHeader", "Lokio/FileMetadata;", "basicMetadata", "readOrSkipLocalHeader", "readZip64EocdRecord", "regularRecord", "skipLocalHeader", "okio"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class ZipFilesKt {
    private static final int BIT_FLAG_ENCRYPTED = 1;
    private static final int BIT_FLAG_UNSUPPORTED_MASK = 1;
    private static final int CENTRAL_FILE_HEADER_SIGNATURE = 33639248;
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;
    private static final int END_OF_CENTRAL_DIRECTORY_SIGNATURE = 101010256;
    private static final int HEADER_ID_EXTENDED_TIMESTAMP = 21589;
    private static final int HEADER_ID_ZIP64_EXTENDED_INFO = 1;
    private static final int LOCAL_FILE_HEADER_SIGNATURE = 67324752;
    private static final long MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE = 4294967295L;
    private static final int ZIP64_EOCD_RECORD_SIGNATURE = 101075792;
    private static final int ZIP64_LOCATOR_SIGNATURE = 117853008;




    private static final java.util.Map<okio.Path, okio.internal.ZipEntry> buildIndex(java.util.List<okio.internal.ZipEntry> r25) {
            okio.Path$Companion r0 = okio.Path.Companion
            r1 = 0
            java.lang.String r2 = "/"
            r3 = 0
            r4 = 1
            okio.Path r0 = okio.Path.Companion.get$default(r0, r2, r3, r4, r1)
            kotlin.Pair[] r1 = new kotlin.Pair[r4]
            okio.internal.ZipEntry r2 = new okio.internal.ZipEntry
            r19 = 508(0x1fc, float:7.12E-43)
            r20 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r5 = r2
            r6 = r0
            r5.<init>(r6, r7, r8, r9, r11, r13, r15, r16, r17, r19, r20)
            kotlin.Pair r2 = kotlin.TuplesKt.m122to(r0, r2)
            r1[r3] = r2
            java.util.Map r1 = kotlin.collections.MapsKt.mutableMapOf(r1)
            r2 = r25
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1 r4 = new okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
            r4.<init>()
            java.util.Comparator r4 = (java.util.Comparator) r4
            java.util.List r2 = kotlin.collections.CollectionsKt.sortedWith(r2, r4)
            java.util.Iterator r2 = r2.iterator()
        L43:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lae
            java.lang.Object r3 = r2.next()
            okio.internal.ZipEntry r3 = (okio.internal.ZipEntry) r3
            okio.Path r4 = r3.getCanonicalPath()
            java.lang.Object r4 = r1.put(r4, r3)
            okio.internal.ZipEntry r4 = (okio.internal.ZipEntry) r4
            if (r4 != 0) goto L43
            r5 = r3
        L5c:
            okio.Path r6 = r5.getCanonicalPath()
            okio.Path r6 = r6.parent()
            if (r6 != 0) goto L68
            goto L43
        L68:
            java.lang.Object r7 = r1.get(r6)
            r23 = r7
            okio.internal.ZipEntry r23 = (okio.internal.ZipEntry) r23
            if (r23 == 0) goto L80
            java.util.List r7 = r23.getChildren()
            java.util.Collection r7 = (java.util.Collection) r7
            okio.Path r8 = r5.getCanonicalPath()
            r7.add(r8)
            goto L43
        L80:
            okio.internal.ZipEntry r24 = new okio.internal.ZipEntry
            r21 = 508(0x1fc, float:7.12E-43)
            r22 = 0
            r9 = 1
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r7 = r24
            r8 = r6
            r7.<init>(r8, r9, r10, r11, r13, r15, r17, r18, r19, r21, r22)
            r1.put(r6, r7)
            java.util.List r8 = r7.getChildren()
            java.util.Collection r8 = (java.util.Collection) r8
            okio.Path r9 = r5.getCanonicalPath()
            r8.add(r9)
            r5 = r7
            goto L5c
        Lae:
            return r1
    }

    private static final java.lang.Long dosDateTimeToEpochMillis(int r14, int r15) {
            r0 = -1
            if (r15 != r0) goto L5
            r0 = 0
            return r0
        L5:
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            r0.<init>()
            r1 = 14
            r2 = 0
            r0.set(r1, r2)
            int r1 = r14 >> 9
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r8 = r1 + 1980
            int r1 = r14 >> 5
            r9 = r1 & 15
            r10 = r14 & 31
            int r1 = r15 >> 11
            r11 = r1 & 31
            int r1 = r15 >> 5
            r12 = r1 & 63
            r1 = r15 & 31
            int r13 = r1 << 1
            int r3 = r9 + (-1)
            r1 = r0
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r1.set(r2, r3, r4, r5, r6, r7)
            java.util.Date r1 = r0.getTime()
            long r1 = r1.getTime()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
    }

    private static final java.lang.String getHex(int r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "0x"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 16
            int r1 = kotlin.text.CharsKt.checkRadix(r1)
            java.lang.String r1 = java.lang.Integer.toString(r3, r1)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static final okio.ZipFileSystem openZip(okio.Path r33, okio.FileSystem r34, kotlin.jvm.functions.Function1<? super okio.internal.ZipEntry, java.lang.Boolean> r35) throws java.io.IOException {
            r1 = r33
            r2 = r34
            r3 = r35
            java.lang.String r0 = "zipPath"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "fileSystem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.FileHandle r0 = r2.openReadOnly(r1)
            r4 = r0
            java.io.Closeable r4 = (java.io.Closeable) r4
            r0 = r4
            okio.FileHandle r0 = (okio.FileHandle) r0     // Catch: java.lang.Throwable -> L245
            r5 = r0
            r6 = 0
            long r7 = r5.size()     // Catch: java.lang.Throwable -> L245
            r0 = 22
            long r9 = (long) r0     // Catch: java.lang.Throwable -> L245
            long r7 = r7 - r9
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L226
            r11 = 65536(0x10000, double:3.2379E-319)
            long r11 = r7 - r11
            long r11 = java.lang.Math.max(r11, r9)     // Catch: java.lang.Throwable -> L245
            r13 = 0
            r15 = 0
            r0 = 0
            r16 = r0
        L3e:
            okio.Source r0 = r5.source(r7)     // Catch: java.lang.Throwable -> L245
            okio.BufferedSource r0 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> L245
            r17 = r0
            int r0 = r17.readIntLe()     // Catch: java.lang.Throwable -> L21b
            r9 = 101010256(0x6054b50, float:2.506985E-35)
            if (r0 != r9) goto L1f6
            r13 = r7
            okio.internal.EocdRecord r0 = readEocdRecord(r17)     // Catch: java.lang.Throwable -> L1ec
            r15 = r0
            int r0 = r15.getCommentByteCount()     // Catch: java.lang.Throwable -> L1ec
            long r9 = (long) r0
            r20 = r6
            r6 = r17
            java.lang.String r0 = r6.readUtf8(r9)     // Catch: java.lang.Throwable -> L1e6
            r9 = r0
            r6.close()     // Catch: java.lang.Throwable -> L245
            r0 = 20
            r21 = r11
            long r10 = (long) r0     // Catch: java.lang.Throwable -> L245
            long r10 = r13 - r10
            r17 = 0
            int r0 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r0 <= 0) goto L165
            okio.Source r0 = r5.source(r10)     // Catch: java.lang.Throwable -> L245
            okio.BufferedSource r0 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> L245
            r12 = r0
            java.io.Closeable r12 = (java.io.Closeable) r12     // Catch: java.lang.Throwable -> L245
            r0 = r12
            okio.BufferedSource r0 = (okio.BufferedSource) r0     // Catch: java.lang.Throwable -> L158
            r16 = r0
            r17 = 0
            int r0 = r16.readIntLe()     // Catch: java.lang.Throwable -> L158
            r6 = 117853008(0x7064b50, float:1.0103172E-34)
            if (r0 != r6) goto L149
            int r0 = r16.readIntLe()     // Catch: java.lang.Throwable -> L158
            r6 = r0
            long r23 = r16.readLongLe()     // Catch: java.lang.Throwable -> L158
            r25 = r23
            int r0 = r16.readIntLe()     // Catch: java.lang.Throwable -> L158
            r19 = r0
            r0 = 1
            r23 = r10
            r10 = r19
            if (r10 != r0) goto L139
            if (r6 != 0) goto L139
            r19 = r10
            r10 = r25
            okio.Source r0 = r5.source(r10)     // Catch: java.lang.Throwable -> L134
            okio.BufferedSource r0 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> L134
            r25 = r6
            r6 = r0
            java.io.Closeable r6 = (java.io.Closeable) r6     // Catch: java.lang.Throwable -> L134
            r0 = r6
            okio.BufferedSource r0 = (okio.BufferedSource) r0     // Catch: java.lang.Throwable -> L127
            r26 = 0
            int r27 = r0.readIntLe()     // Catch: java.lang.Throwable -> L127
            r28 = r27
            r29 = r10
            r10 = 101075792(0x6064b50, float:2.525793E-35)
            r11 = r28
            if (r11 != r10) goto Led
            okio.internal.EocdRecord r10 = readZip64EocdRecord(r0, r15)     // Catch: java.lang.Throwable -> Le8
            r15 = r10
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Le8
            r0 = 0
            kotlin.p001io.CloseableKt.closeFinally(r6, r0)     // Catch: java.lang.Throwable -> Le2
            r31 = r13
            goto L14d
        Le2:
            r0 = move-exception
            r6 = r0
            r31 = r13
            goto L15e
        Le8:
            r0 = move-exception
            r10 = r0
            r31 = r13
            goto L12d
        Led:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> L122
            r27 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L122
            r0.<init>()     // Catch: java.lang.Throwable -> L122
            r31 = r13
            java.lang.String r13 = "bad zip: expected "
            java.lang.StringBuilder r0 = r0.append(r13)     // Catch: java.lang.Throwable -> L11f
            r13 = 101075792(0x6064b50, float:2.525793E-35)
            java.lang.String r13 = getHex(r13)     // Catch: java.lang.Throwable -> L11f
            java.lang.StringBuilder r0 = r0.append(r13)     // Catch: java.lang.Throwable -> L11f
            java.lang.String r13 = " but was "
            java.lang.StringBuilder r0 = r0.append(r13)     // Catch: java.lang.Throwable -> L11f
            java.lang.String r13 = getHex(r11)     // Catch: java.lang.Throwable -> L11f
            java.lang.StringBuilder r0 = r0.append(r13)     // Catch: java.lang.Throwable -> L11f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L11f
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L11f
            throw r10     // Catch: java.lang.Throwable -> L11f
        L11f:
            r0 = move-exception
            r10 = r0
            goto L12d
        L122:
            r0 = move-exception
            r31 = r13
            r10 = r0
            goto L12d
        L127:
            r0 = move-exception
            r29 = r10
            r31 = r13
            r10 = r0
        L12d:
            throw r10     // Catch: java.lang.Throwable -> L12e
        L12e:
            r0 = move-exception
            r11 = r0
            kotlin.p001io.CloseableKt.closeFinally(r6, r10)     // Catch: java.lang.Throwable -> L155
            throw r11     // Catch: java.lang.Throwable -> L155
        L134:
            r0 = move-exception
            r31 = r13
            r6 = r0
            goto L15e
        L139:
            r19 = r10
            r31 = r13
            r29 = r25
            r25 = r6
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L155
            java.lang.String r6 = "unsupported zip: spanned"
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L155
            throw r0     // Catch: java.lang.Throwable -> L155
        L149:
            r23 = r10
            r31 = r13
        L14d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L155
            r0 = 0
            kotlin.p001io.CloseableKt.closeFinally(r12, r0)     // Catch: java.lang.Throwable -> L245
            goto L169
        L155:
            r0 = move-exception
            r6 = r0
            goto L15e
        L158:
            r0 = move-exception
            r23 = r10
            r31 = r13
            r6 = r0
        L15e:
            throw r6     // Catch: java.lang.Throwable -> L15f
        L15f:
            r0 = move-exception
            r10 = r0
            kotlin.p001io.CloseableKt.closeFinally(r12, r6)     // Catch: java.lang.Throwable -> L245
            throw r10     // Catch: java.lang.Throwable -> L245
        L165:
            r23 = r10
            r31 = r13
        L169:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L245
            r0.<init>()     // Catch: java.lang.Throwable -> L245
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L245
            r6 = r0
            long r10 = r15.getCentralDirectoryOffset()     // Catch: java.lang.Throwable -> L245
            okio.Source r0 = r5.source(r10)     // Catch: java.lang.Throwable -> L245
            okio.BufferedSource r0 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> L245
            r10 = r0
            java.io.Closeable r10 = (java.io.Closeable) r10     // Catch: java.lang.Throwable -> L245
            r0 = r10
            okio.BufferedSource r0 = (okio.BufferedSource) r0     // Catch: java.lang.Throwable -> L1dd
            r11 = 0
            r12 = 0
            long r16 = r15.getEntryCount()     // Catch: java.lang.Throwable -> L1dd
        L18a:
            int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r14 >= 0) goto L1c6
            okio.internal.ZipEntry r14 = readEntry(r0)     // Catch: java.lang.Throwable -> L1dd
            long r25 = r14.getOffset()     // Catch: java.lang.Throwable -> L1dd
            long r27 = r15.getCentralDirectoryOffset()     // Catch: java.lang.Throwable -> L1dd
            int r19 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r19 >= 0) goto L1bc
            java.lang.Object r19 = r3.invoke(r14)     // Catch: java.lang.Throwable -> L1dd
            java.lang.Boolean r19 = (java.lang.Boolean) r19     // Catch: java.lang.Throwable -> L1dd
            boolean r19 = r19.booleanValue()     // Catch: java.lang.Throwable -> L1dd
            if (r19 == 0) goto L1b3
            r19 = r0
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L1dd
            r0.add(r14)     // Catch: java.lang.Throwable -> L1dd
            goto L1b5
        L1b3:
            r19 = r0
        L1b5:
            r25 = 1
            long r12 = r12 + r25
            r0 = r19
            goto L18a
        L1bc:
            r19 = r0
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r3 = "bad zip: local file header offset >= central directory offset"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1dd
            throw r0     // Catch: java.lang.Throwable -> L1dd
        L1c6:
            r19 = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1dd
            r0 = 0
            kotlin.p001io.CloseableKt.closeFinally(r10, r0)     // Catch: java.lang.Throwable -> L245
            java.util.Map r0 = buildIndex(r6)     // Catch: java.lang.Throwable -> L245
            okio.ZipFileSystem r3 = new okio.ZipFileSystem     // Catch: java.lang.Throwable -> L245
            r3.<init>(r1, r2, r0, r9)     // Catch: java.lang.Throwable -> L245
            r0 = 0
            kotlin.p001io.CloseableKt.closeFinally(r4, r0)
            return r3
        L1dd:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch: java.lang.Throwable -> L1e0
        L1e0:
            r0 = move-exception
            r11 = r0
            kotlin.p001io.CloseableKt.closeFinally(r10, r3)     // Catch: java.lang.Throwable -> L245
            throw r11     // Catch: java.lang.Throwable -> L245
        L1e6:
            r0 = move-exception
            r21 = r11
            r31 = r13
            goto L222
        L1ec:
            r0 = move-exception
            r20 = r6
            r21 = r11
            r31 = r13
            r6 = r17
            goto L222
        L1f6:
            r20 = r6
            r21 = r11
            r6 = r17
            r17 = 0
            r6.close()     // Catch: java.lang.Throwable -> L245
            r9 = -1
            long r7 = r7 + r9
            int r0 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r0 < 0) goto L213
            r3 = r35
            r9 = r17
            r6 = r20
            r11 = r21
            goto L3e
        L213:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L245
            java.lang.String r3 = "not a zip: end of central directory signature not found"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L245
            throw r0     // Catch: java.lang.Throwable -> L245
        L21b:
            r0 = move-exception
            r20 = r6
            r21 = r11
            r6 = r17
        L222:
            r6.close()     // Catch: java.lang.Throwable -> L245
            throw r0     // Catch: java.lang.Throwable -> L245
        L226:
            r20 = r6
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L245
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L245
            r3.<init>()     // Catch: java.lang.Throwable -> L245
            java.lang.String r6 = "not a zip: size="
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.lang.Throwable -> L245
            long r9 = r5.size()     // Catch: java.lang.Throwable -> L245
            java.lang.StringBuilder r3 = r3.append(r9)     // Catch: java.lang.Throwable -> L245
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L245
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L245
            throw r0     // Catch: java.lang.Throwable -> L245
        L245:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch: java.lang.Throwable -> L248
        L248:
            r0 = move-exception
            r5 = r0
            kotlin.p001io.CloseableKt.closeFinally(r4, r3)
            throw r5
    }

    public static /* synthetic */ okio.ZipFileSystem openZip$default(okio.Path r0, okio.FileSystem r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 4
            if (r3 == 0) goto L8
            okio.internal.ZipFilesKt$openZip$1 r2 = okio.internal.ZipFilesKt.C10551.INSTANCE
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
        L8:
            okio.ZipFileSystem r0 = openZip(r0, r1, r2)
            return r0
    }

    public static final okio.internal.ZipEntry readEntry(okio.BufferedSource r42) throws java.io.IOException {
            r8 = r42
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r9 = r42.readIntLe()
            r0 = 33639248(0x2014b50, float:9.499037E-38)
            if (r9 != r0) goto L17b
            r0 = 4
            r8.skip(r0)
            short r0 = r42.readShortLe()
            r1 = 65535(0xffff, float:9.1834E-41)
            r10 = r0 & r1
            r0 = r10 & 1
            if (r0 != 0) goto L15c
            short r0 = r42.readShortLe()
            r25 = r0 & r1
            short r0 = r42.readShortLe()
            r15 = r0 & r1
            short r0 = r42.readShortLe()
            r14 = r0 & r1
            java.lang.Long r26 = dosDateTimeToEpochMillis(r14, r15)
            int r0 = r42.readIntLe()
            long r2 = (long) r0
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r27 = r2 & r4
            kotlin.jvm.internal.Ref$LongRef r0 = new kotlin.jvm.internal.Ref$LongRef
            r0.<init>()
            r13 = r0
            int r0 = r42.readIntLe()
            long r2 = (long) r0
            long r2 = r2 & r4
            r13.element = r2
            kotlin.jvm.internal.Ref$LongRef r0 = new kotlin.jvm.internal.Ref$LongRef
            r0.<init>()
            r12 = r0
            int r0 = r42.readIntLe()
            long r2 = (long) r0
            long r2 = r2 & r4
            r12.element = r2
            short r0 = r42.readShortLe()
            r11 = r0 & r1
            short r0 = r42.readShortLe()
            r7 = r0 & r1
            short r0 = r42.readShortLe()
            r6 = r0 & r1
            r0 = 8
            r8.skip(r0)
            kotlin.jvm.internal.Ref$LongRef r0 = new kotlin.jvm.internal.Ref$LongRef
            r0.<init>()
            r2 = r0
            int r0 = r42.readIntLe()
            long r0 = (long) r0
            long r0 = r0 & r4
            r2.element = r0
            long r0 = (long) r11
            java.lang.String r3 = r8.readUtf8(r0)
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            r4 = 2
            r5 = 0
            boolean r0 = kotlin.text.StringsKt.contains$default(r0, r1, r1, r4, r5)
            if (r0 != 0) goto L154
            r0 = r42
            r18 = 0
            r19 = 0
            long r4 = r12.element
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            r5 = 8
            if (r4 != 0) goto Lae
            r4 = r2
            long r1 = (long) r5
            long r19 = r19 + r1
            goto Laf
        Lae:
            r4 = r2
        Laf:
            long r1 = r13.element
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 != 0) goto Lb8
            long r1 = (long) r5
            long r19 = r19 + r1
        Lb8:
            long r1 = r4.element
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 != 0) goto Lc1
            long r1 = (long) r5
            long r19 = r19 + r1
        Lc1:
            r29 = r19
            kotlin.jvm.internal.Ref$BooleanRef r0 = new kotlin.jvm.internal.Ref$BooleanRef
            r0.<init>()
            r5 = r0
            okio.internal.ZipFilesKt$readEntry$1 r16 = new okio.internal.ZipFilesKt$readEntry$1
            r0 = r16
            r2 = 0
            r1 = r5
            r31 = r9
            r17 = r11
            r11 = r2
            r9 = r3
            r2 = r29
            r32 = r4
            r4 = r12
            r11 = r5
            r18 = r14
            r14 = 0
            r5 = r42
            r14 = r6
            r6 = r13
            r34 = r10
            r10 = r7
            r7 = r32
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r0 = r16
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            readExtra(r8, r10, r0)
            r0 = 0
            int r0 = (r29 > r0 ? 1 : (r29 == r0 ? 0 : -1))
            if (r0 <= 0) goto L105
            boolean r0 = r11.element
            if (r0 == 0) goto Lfd
            goto L105
        Lfd:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "bad zip: zip64 extra required but absent"
            r0.<init>(r1)
            throw r0
        L105:
            long r0 = (long) r14
            java.lang.String r0 = r8.readUtf8(r0)
            okio.Path$Companion r1 = okio.Path.Companion
            java.lang.String r2 = "/"
            r3 = 1
            r4 = 0
            r5 = 0
            okio.Path r1 = okio.Path.Companion.get$default(r1, r2, r5, r3, r4)
            okio.Path r1 = r1.resolve(r9)
            r3 = 2
            boolean r2 = kotlin.text.StringsKt.endsWith$default(r9, r2, r5, r3, r4)
            okio.internal.ZipEntry r3 = new okio.internal.ZipEntry
            long r4 = r13.element
            long r6 = r12.element
            r33 = r10
            r8 = r32
            r32 = r9
            long r9 = r8.element
            r36 = r11
            r35 = r17
            r11 = r3
            r37 = r12
            r12 = r1
            r38 = r13
            r13 = r2
            r40 = r14
            r39 = r18
            r14 = r0
            r41 = r15
            r15 = r27
            r17 = r4
            r19 = r6
            r21 = r25
            r22 = r26
            r23 = r9
            r11.<init>(r12, r13, r14, r15, r17, r19, r21, r22, r23)
            return r3
        L154:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "bad zip: filename contains 0x00"
            r0.<init>(r1)
            throw r0
        L15c:
            r34 = r10
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported zip: general purpose bit flag="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = getHex(r34)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L17b:
            r31 = r9
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "bad zip: expected "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r0 = getHex(r0)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " but was "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = getHex(r31)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    private static final okio.internal.EocdRecord readEocdRecord(okio.BufferedSource r17) throws java.io.IOException {
            short r0 = r17.readShortLe()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            short r2 = r17.readShortLe()
            r2 = r2 & r1
            short r3 = r17.readShortLe()
            r3 = r3 & r1
            long r10 = (long) r3
            short r3 = r17.readShortLe()
            r3 = r3 & r1
            long r12 = (long) r3
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 != 0) goto L46
            if (r0 != 0) goto L46
            if (r2 != 0) goto L46
            r3 = 4
            r14 = r17
            r14.skip(r3)
            int r3 = r17.readIntLe()
            long r3 = (long) r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r15 = r3 & r5
            short r3 = r17.readShortLe()
            r1 = r1 & r3
            okio.internal.EocdRecord r3 = new okio.internal.EocdRecord
            r4 = r3
            r5 = r10
            r7 = r15
            r9 = r1
            r4.<init>(r5, r7, r9)
            return r3
        L46:
            r14 = r17
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r3 = "unsupported zip: spanned"
            r1.<init>(r3)
            throw r1
    }

    private static final void readExtra(okio.BufferedSource r12, int r13, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> r14) {
            long r0 = (long) r13
        L1:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L80
            r4 = 4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 < 0) goto L78
            short r4 = r12.readShortLe()
            r5 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r5
            short r5 = r12.readShortLe()
            long r5 = (long) r5
            r7 = 65535(0xffff, double:3.23786E-319)
            long r5 = r5 & r7
            r7 = 4
            long r7 = (long) r7
            long r0 = r0 - r7
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 < 0) goto L70
            r12.require(r5)
            okio.Buffer r7 = r12.getBuffer()
            long r7 = r7.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            java.lang.Long r10 = java.lang.Long.valueOf(r5)
            r14.invoke(r9, r10)
            okio.Buffer r9 = r12.getBuffer()
            long r9 = r9.size()
            long r9 = r9 + r5
            long r9 = r9 - r7
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 < 0) goto L57
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 <= 0) goto L55
            okio.Buffer r2 = r12.getBuffer()
            r2.skip(r9)
        L55:
            long r0 = r0 - r5
            goto L1
        L57:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r11 = "unsupported zip: too many bytes processed for "
            java.lang.StringBuilder r3 = r3.append(r11)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L70:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "bad zip: truncated value in extra field"
            r2.<init>(r3)
            throw r2
        L78:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "bad zip: truncated header in extra field"
            r2.<init>(r3)
            throw r2
        L80:
            return
    }

    public static final okio.FileMetadata readLocalHeader(okio.BufferedSource r1, okio.FileMetadata r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "basicMetadata"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.FileMetadata r0 = readOrSkipLocalHeader(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }

    private static final okio.FileMetadata readOrSkipLocalHeader(okio.BufferedSource r21, okio.FileMetadata r22) {
            r0 = r21
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            r2 = 0
            if (r22 == 0) goto Lf
            java.lang.Long r3 = r22.getLastModifiedAtMillis()
            goto L10
        Lf:
            r3 = r2
        L10:
            r1.element = r3
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            int r5 = r21.readIntLe()
            r6 = 67324752(0x4034b50, float:1.5433558E-36)
            if (r5 != r6) goto La6
            r6 = 2
            r0.skip(r6)
            short r6 = r21.readShortLe()
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            r8 = r6 & 1
            if (r8 != 0) goto L89
            r8 = 18
            r0.skip(r8)
            short r8 = r21.readShortLe()
            long r8 = (long) r8
            r10 = 65535(0xffff, double:3.23786E-319)
            long r8 = r8 & r10
            short r10 = r21.readShortLe()
            r7 = r7 & r10
            r0.skip(r8)
            if (r22 != 0) goto L53
            long r10 = (long) r7
            r0.skip(r10)
            return r2
        L53:
            okio.internal.ZipFilesKt$readOrSkipLocalHeader$1 r2 = new okio.internal.ZipFilesKt$readOrSkipLocalHeader$1
            r2.<init>(r0, r1, r3, r4)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            readExtra(r0, r7, r2)
            okio.FileMetadata r2 = new okio.FileMetadata
            boolean r11 = r22.isRegularFile()
            boolean r12 = r22.isDirectory()
            java.lang.Long r14 = r22.getSize()
            T r10 = r4.element
            r15 = r10
            java.lang.Long r15 = (java.lang.Long) r15
            T r10 = r1.element
            r16 = r10
            java.lang.Long r16 = (java.lang.Long) r16
            T r10 = r3.element
            r17 = r10
            java.lang.Long r17 = (java.lang.Long) r17
            r19 = 128(0x80, float:1.8E-43)
            r20 = 0
            r13 = 0
            r18 = 0
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r2
        L89:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "unsupported zip: general purpose bit flag="
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = getHex(r6)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r2.<init>(r7)
            throw r2
        La6:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "bad zip: expected "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r6 = getHex(r6)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r7 = " but was "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = getHex(r5)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r2.<init>(r6)
            throw r2
    }

    private static final okio.internal.EocdRecord readZip64EocdRecord(okio.BufferedSource r16, okio.internal.EocdRecord r17) throws java.io.IOException {
            r0 = r16
            r1 = 12
            r0.skip(r1)
            int r1 = r16.readIntLe()
            int r2 = r16.readIntLe()
            long r9 = r16.readLongLe()
            long r11 = r16.readLongLe()
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 != 0) goto L37
            if (r1 != 0) goto L37
            if (r2 != 0) goto L37
            r3 = 8
            r0.skip(r3)
            long r13 = r16.readLongLe()
            okio.internal.EocdRecord r15 = new okio.internal.EocdRecord
            int r8 = r17.getCommentByteCount()
            r3 = r15
            r4 = r9
            r6 = r13
            r3.<init>(r4, r6, r8)
            return r15
        L37:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "unsupported zip: spanned"
            r3.<init>(r4)
            throw r3
    }

    public static final void skipLocalHeader(okio.BufferedSource r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 0
            readOrSkipLocalHeader(r1, r0)
            return
    }
}
