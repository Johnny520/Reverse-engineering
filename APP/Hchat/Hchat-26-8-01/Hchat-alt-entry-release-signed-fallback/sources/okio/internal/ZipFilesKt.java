package okio.internal;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
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

    /* JADX INFO: renamed from: okio.internal.ZipFilesKt$openZip$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class AnonymousClass1 extends gg.m implements fg.l {
        public static final okio.internal.ZipFilesKt.AnonymousClass1 INSTANCE = null;

        static {
                okio.internal.ZipFilesKt$openZip$1 r0 = new okio.internal.ZipFilesKt$openZip$1
                r0.<init>()
                okio.internal.ZipFilesKt.AnonymousClass1.INSTANCE = r0
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        public final java.lang.Boolean invoke(okio.internal.ZipEntry r1) {
                r0 = this;
                r1.getClass()
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                return r1
        }

        @Override // fg.l
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                okio.internal.ZipEntry r1 = (okio.internal.ZipEntry) r1
                java.lang.Boolean r1 = r0.invoke(r1)
                return r1
        }
    }

    /* JADX INFO: renamed from: okio.internal.ZipFilesKt$readEntry$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class C00071 extends gg.m implements fg.p {
        final /* synthetic */ gg.t $compressedSize;
        final /* synthetic */ gg.q $hasZip64Extra;
        final /* synthetic */ gg.t $offset;
        final /* synthetic */ long $requiredZip64ExtraSize;
        final /* synthetic */ gg.t $size;
        final /* synthetic */ okio.BufferedSource $this_readEntry;

        public C00071(gg.q r1, long r2, gg.t r4, okio.BufferedSource r5, gg.t r6, gg.t r7) {
                r0 = this;
                r0.$hasZip64Extra = r1
                r0.$requiredZip64ExtraSize = r2
                r0.$size = r4
                r0.$this_readEntry = r5
                r0.$compressedSize = r6
                r0.$offset = r7
                r1 = 2
                r0.<init>(r1)
                return
        }

        @Override // fg.p
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                java.lang.Number r4 = (java.lang.Number) r4
                long r0 = r4.longValue()
                r2.invoke(r3, r0)
                sf.n r3 = sf.n.f12433a
                return r3
        }

        public final void invoke(int r5, long r6) {
                r4 = this;
                r0 = 1
                if (r5 != r0) goto L56
                gg.q r5 = r4.$hasZip64Extra
                boolean r1 = r5.f4560g
                if (r1 != 0) goto L51
                r5.f4560g = r0
                long r0 = r4.$requiredZip64ExtraSize
                int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r5 < 0) goto L4b
                gg.t r5 = r4.$size
                long r6 = r5.f4563g
                r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 != 0) goto L24
                okio.BufferedSource r6 = r4.$this_readEntry
                long r6 = r6.readLongLe()
            L24:
                r5.f4563g = r6
                gg.t r5 = r4.$compressedSize
                long r6 = r5.f4563g
                int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                r2 = 0
                if (r6 != 0) goto L37
                okio.BufferedSource r6 = r4.$this_readEntry
                long r6 = r6.readLongLe()
                goto L38
            L37:
                r6 = r2
            L38:
                r5.f4563g = r6
                gg.t r5 = r4.$offset
                long r6 = r5.f4563g
                int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r6 != 0) goto L48
                okio.BufferedSource r6 = r4.$this_readEntry
                long r2 = r6.readLongLe()
            L48:
                r5.f4563g = r2
                return
            L4b:
                java.lang.String r5 = "bad zip: zip64 extra too short"
                j8.o.y(r5)
                return
            L51:
                java.lang.String r5 = "bad zip: zip64 extra repeated"
                j8.o.y(r5)
            L56:
                return
        }
    }

    /* JADX INFO: renamed from: okio.internal.ZipFilesKt$readOrSkipLocalHeader$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class C00081 extends gg.m implements fg.p {
        final /* synthetic */ gg.u $createdAtMillis;
        final /* synthetic */ gg.u $lastAccessedAtMillis;
        final /* synthetic */ gg.u $lastModifiedAtMillis;
        final /* synthetic */ okio.BufferedSource $this_readOrSkipLocalHeader;

        public C00081(okio.BufferedSource r1, gg.u r2, gg.u r3, gg.u r4) {
                r0 = this;
                r0.$this_readOrSkipLocalHeader = r1
                r0.$lastModifiedAtMillis = r2
                r0.$lastAccessedAtMillis = r3
                r0.$createdAtMillis = r4
                r1 = 2
                r0.<init>(r1)
                return
        }

        @Override // fg.p
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                java.lang.Number r4 = (java.lang.Number) r4
                long r0 = r4.longValue()
                r2.invoke(r3, r0)
                sf.n r3 = sf.n.f12433a
                return r3
        }

        public final void invoke(int r10, long r11) {
                r9 = this;
                r0 = 21589(0x5455, float:3.0253E-41)
                if (r10 != r0) goto L78
                r0 = 1
                int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                java.lang.String r2 = "bad zip: extended timestamp extra too short"
                if (r10 < 0) goto L75
                okio.BufferedSource r10 = r9.$this_readOrSkipLocalHeader
                byte r10 = r10.readByte()
                r3 = r10 & 1
                r4 = 0
                r5 = 1
                if (r3 != r5) goto L1a
                r3 = r5
                goto L1b
            L1a:
                r3 = r4
            L1b:
                r6 = r10 & 2
                r7 = 2
                if (r6 != r7) goto L22
                r6 = r5
                goto L23
            L22:
                r6 = r4
            L23:
                r7 = 4
                r10 = r10 & r7
                if (r10 != r7) goto L28
                r4 = r5
            L28:
                okio.BufferedSource r10 = r9.$this_readOrSkipLocalHeader
                if (r3 == 0) goto L2e
                r0 = 5
            L2e:
                r7 = 4
                if (r6 == 0) goto L33
                long r0 = r0 + r7
            L33:
                if (r4 == 0) goto L36
                long r0 = r0 + r7
            L36:
                int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r11 < 0) goto L71
                r11 = 1000(0x3e8, double:4.94E-321)
                if (r3 == 0) goto L4c
                gg.u r0 = r9.$lastModifiedAtMillis
                int r10 = r10.readIntLe()
                long r1 = (long) r10
                long r1 = r1 * r11
                java.lang.Long r10 = java.lang.Long.valueOf(r1)
                r0.f4564g = r10
            L4c:
                if (r6 == 0) goto L5e
                gg.u r10 = r9.$lastAccessedAtMillis
                okio.BufferedSource r0 = r9.$this_readOrSkipLocalHeader
                int r0 = r0.readIntLe()
                long r0 = (long) r0
                long r0 = r0 * r11
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r10.f4564g = r0
            L5e:
                if (r4 == 0) goto L78
                gg.u r10 = r9.$createdAtMillis
                okio.BufferedSource r0 = r9.$this_readOrSkipLocalHeader
                int r0 = r0.readIntLe()
                long r0 = (long) r0
                long r0 = r0 * r11
                java.lang.Long r11 = java.lang.Long.valueOf(r0)
                r10.f4564g = r11
                return
            L71:
                j8.o.y(r2)
                return
            L75:
                j8.o.y(r2)
            L78:
                return
        }
    }

    private static final java.util.Map<okio.Path, okio.internal.ZipEntry> buildIndex(java.util.List<okio.internal.ZipEntry> r21) {
            okio.Path$Companion r0 = okio.Path.Companion
            r1 = 0
            java.lang.String r2 = "/"
            r3 = 0
            r4 = 1
            okio.Path r6 = okio.Path.Companion.get$default(r0, r2, r3, r4, r1)
            okio.internal.ZipEntry r5 = new okio.internal.ZipEntry
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
            r5.<init>(r6, r7, r8, r9, r11, r13, r15, r16, r17, r19, r20)
            sf.e r0 = new sf.e
            r0.<init>(r6, r5)
            sf.e[] r0 = new sf.e[]{r0}
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r2 = tf.y.a0(r4)
            r1.<init>(r2)
            tf.y.d0(r1, r0)
            okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1 r0 = new okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
            r0.<init>()
            r2 = r21
            java.util.List r0 = tf.m.K1(r2, r0)
            java.util.Iterator r0 = r0.iterator()
        L45:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La1
            java.lang.Object r2 = r0.next()
            okio.internal.ZipEntry r2 = (okio.internal.ZipEntry) r2
            okio.Path r3 = r2.getCanonicalPath()
            java.lang.Object r3 = r1.put(r3, r2)
            okio.internal.ZipEntry r3 = (okio.internal.ZipEntry) r3
            if (r3 != 0) goto L45
        L5d:
            okio.Path r3 = r2.getCanonicalPath()
            okio.Path r5 = r3.parent()
            if (r5 != 0) goto L68
            goto L45
        L68:
            java.lang.Object r3 = r1.get(r5)
            okio.internal.ZipEntry r3 = (okio.internal.ZipEntry) r3
            if (r3 == 0) goto L7c
            java.util.List r3 = r3.getChildren()
            okio.Path r2 = r2.getCanonicalPath()
            r3.add(r2)
            goto L45
        L7c:
            okio.internal.ZipEntry r4 = new okio.internal.ZipEntry
            r18 = 508(0x1fc, float:7.12E-43)
            r19 = 0
            r6 = 1
            r7 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r4.<init>(r5, r6, r7, r8, r10, r12, r14, r15, r16, r18, r19)
            r1.put(r5, r4)
            java.util.List r3 = r4.getChildren()
            okio.Path r2 = r2.getCanonicalPath()
            r3.add(r2)
            r2 = r4
            goto L5d
        La1:
            return r1
    }

    private static final java.lang.Long dosDateTimeToEpochMillis(int r7, int r8) {
            r0 = -1
            if (r8 != r0) goto L5
            r7 = 0
            return r7
        L5:
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            r0.<init>()
            r1 = 14
            r2 = 0
            r0.set(r1, r2)
            int r1 = r7 >> 9
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r1 = r1 + 1980
            int r2 = r7 >> 5
            r2 = r2 & 15
            r3 = r7 & 31
            int r7 = r8 >> 11
            r4 = r7 & 31
            int r7 = r8 >> 5
            r5 = r7 & 63
            r7 = r8 & 31
            int r6 = r7 << 1
            int r2 = r2 + (-1)
            r0.set(r1, r2, r3, r4, r5, r6)
            java.util.Date r7 = r0.getTime()
            long r7 = r7.getTime()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            return r7
    }

    private static final java.lang.String getHex(int r1) {
            r0 = 16
            a.a.w(r0)
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            r1.getClass()
            java.lang.String r0 = "0x"
            java.lang.String r1 = r0.concat(r1)
            return r1
    }

    public static final okio.ZipFileSystem openZip(okio.Path r17, okio.FileSystem r18, fg.l r19) {
            r0 = r17
            r1 = r18
            java.lang.String r2 = "not a zip: size="
            r0.getClass()
            r1.getClass()
            r19.getClass()
            okio.FileHandle r3 = r1.openReadOnly(r0)
            long r4 = r3.size()     // Catch: java.lang.Throwable -> Lce
            r6 = 22
            long r6 = (long) r6     // Catch: java.lang.Throwable -> Lce
            long r4 = r4 - r6
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L154
            r8 = 65536(0x10000, double:3.2379E-319)
            long r8 = r4 - r8
            long r8 = java.lang.Math.max(r8, r6)     // Catch: java.lang.Throwable -> Lce
        L2a:
            okio.Source r2 = r3.source(r4)     // Catch: java.lang.Throwable -> Lce
            okio.BufferedSource r2 = okio.Okio.buffer(r2)     // Catch: java.lang.Throwable -> Lce
            int r10 = r2.readIntLe()     // Catch: java.lang.Throwable -> L138
            r11 = 101010256(0x6054b50, float:2.506985E-35)
            if (r10 != r11) goto L13a
            okio.internal.EocdRecord r8 = readEocdRecord(r2)     // Catch: java.lang.Throwable -> L138
            int r9 = r8.getCommentByteCount()     // Catch: java.lang.Throwable -> L138
            long r9 = (long) r9     // Catch: java.lang.Throwable -> L138
            java.lang.String r9 = r2.readUtf8(r9)     // Catch: java.lang.Throwable -> L138
            r2.close()     // Catch: java.lang.Throwable -> Lce
            r2 = 20
            long r10 = (long) r2     // Catch: java.lang.Throwable -> Lce
            long r4 = r4 - r10
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r10 = 0
            if (r2 <= 0) goto Ld8
            okio.Source r2 = r3.source(r4)     // Catch: java.lang.Throwable -> Lce
            okio.BufferedSource r2 = okio.Okio.buffer(r2)     // Catch: java.lang.Throwable -> Lce
            int r4 = r2.readIntLe()     // Catch: java.lang.Throwable -> L8f
            r5 = 117853008(0x7064b50, float:1.0103172E-34)
            if (r4 != r5) goto Lca
            int r4 = r2.readIntLe()     // Catch: java.lang.Throwable -> L8f
            long r11 = r2.readLongLe()     // Catch: java.lang.Throwable -> L8f
            int r5 = r2.readIntLe()     // Catch: java.lang.Throwable -> L8f
            r13 = 1
            if (r5 != r13) goto Lc2
            if (r4 != 0) goto Lc2
            okio.Source r4 = r3.source(r11)     // Catch: java.lang.Throwable -> L8f
            okio.BufferedSource r4 = okio.Okio.buffer(r4)     // Catch: java.lang.Throwable -> L8f
            int r5 = r4.readIntLe()     // Catch: java.lang.Throwable -> L92
            r11 = 101075792(0x6064b50, float:2.525793E-35)
            if (r5 != r11) goto L95
            okio.internal.EocdRecord r8 = readZip64EocdRecord(r4, r8)     // Catch: java.lang.Throwable -> L92
            ig.a.i(r4, r10)     // Catch: java.lang.Throwable -> L8f
            goto Lca
        L8f:
            r0 = move-exception
            r1 = r0
            goto Ld2
        L92:
            r0 = move-exception
            r1 = r0
            goto Lbc
        L95:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L92
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
            r1.<init>()     // Catch: java.lang.Throwable -> L92
            java.lang.String r6 = "bad zip: expected "
            r1.append(r6)     // Catch: java.lang.Throwable -> L92
            java.lang.String r6 = getHex(r11)     // Catch: java.lang.Throwable -> L92
            r1.append(r6)     // Catch: java.lang.Throwable -> L92
            java.lang.String r6 = " but was "
            r1.append(r6)     // Catch: java.lang.Throwable -> L92
            java.lang.String r5 = getHex(r5)     // Catch: java.lang.Throwable -> L92
            r1.append(r5)     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L92
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L92
            throw r0     // Catch: java.lang.Throwable -> L92
        Lbc:
            throw r1     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r0 = move-exception
            ig.a.i(r4, r1)     // Catch: java.lang.Throwable -> L8f
            throw r0     // Catch: java.lang.Throwable -> L8f
        Lc2:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = "unsupported zip: spanned"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8f
            throw r0     // Catch: java.lang.Throwable -> L8f
        Lca:
            ig.a.i(r2, r10)     // Catch: java.lang.Throwable -> Lce
            goto Ld8
        Lce:
            r0 = move-exception
            r1 = r0
            goto L16a
        Ld2:
            throw r1     // Catch: java.lang.Throwable -> Ld3
        Ld3:
            r0 = move-exception
            ig.a.i(r2, r1)     // Catch: java.lang.Throwable -> Lce
            throw r0     // Catch: java.lang.Throwable -> Lce
        Ld8:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lce
            r2.<init>()     // Catch: java.lang.Throwable -> Lce
            long r4 = r8.getCentralDirectoryOffset()     // Catch: java.lang.Throwable -> Lce
            okio.Source r4 = r3.source(r4)     // Catch: java.lang.Throwable -> Lce
            okio.BufferedSource r4 = okio.Okio.buffer(r4)     // Catch: java.lang.Throwable -> Lce
            long r11 = r8.getEntryCount()     // Catch: java.lang.Throwable -> L113
        Led:
            int r5 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r5 >= 0) goto L122
            okio.internal.ZipEntry r5 = readEntry(r4)     // Catch: java.lang.Throwable -> L113
            long r13 = r5.getOffset()     // Catch: java.lang.Throwable -> L113
            long r15 = r8.getCentralDirectoryOffset()     // Catch: java.lang.Throwable -> L113
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L11a
            r13 = r19
            java.lang.Object r14 = r13.invoke(r5)     // Catch: java.lang.Throwable -> L113
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> L113
            boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> L113
            if (r14 == 0) goto L116
            r2.add(r5)     // Catch: java.lang.Throwable -> L113
            goto L116
        L113:
            r0 = move-exception
            r1 = r0
            goto L132
        L116:
            r14 = 1
            long r6 = r6 + r14
            goto Led
        L11a:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L113
            java.lang.String r1 = "bad zip: local file header offset >= central directory offset"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L113
            throw r0     // Catch: java.lang.Throwable -> L113
        L122:
            ig.a.i(r4, r10)     // Catch: java.lang.Throwable -> Lce
            java.util.Map r2 = buildIndex(r2)     // Catch: java.lang.Throwable -> Lce
            okio.ZipFileSystem r4 = new okio.ZipFileSystem     // Catch: java.lang.Throwable -> Lce
            r4.<init>(r0, r1, r2, r9)     // Catch: java.lang.Throwable -> Lce
            ig.a.i(r3, r10)
            return r4
        L132:
            throw r1     // Catch: java.lang.Throwable -> L133
        L133:
            r0 = move-exception
            ig.a.i(r4, r1)     // Catch: java.lang.Throwable -> Lce
            throw r0     // Catch: java.lang.Throwable -> Lce
        L138:
            r0 = move-exception
            goto L150
        L13a:
            r13 = r19
            r2.close()     // Catch: java.lang.Throwable -> Lce
            r10 = -1
            long r4 = r4 + r10
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 < 0) goto L148
            goto L2a
        L148:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "not a zip: end of central directory signature not found"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lce
            throw r0     // Catch: java.lang.Throwable -> Lce
        L150:
            r2.close()     // Catch: java.lang.Throwable -> Lce
            throw r0     // Catch: java.lang.Throwable -> Lce
        L154:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lce
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lce
            long r4 = r3.size()     // Catch: java.lang.Throwable -> Lce
            r1.append(r4)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lce
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lce
            throw r0     // Catch: java.lang.Throwable -> Lce
        L16a:
            throw r1     // Catch: java.lang.Throwable -> L16b
        L16b:
            r0 = move-exception
            ig.a.i(r3, r1)
            throw r0
    }

    public static /* synthetic */ okio.ZipFileSystem openZip$default(okio.Path r0, okio.FileSystem r1, fg.l r2, int r3, java.lang.Object r4) {
            r3 = r3 & 4
            if (r3 == 0) goto L6
            okio.internal.ZipFilesKt$openZip$1 r2 = okio.internal.ZipFilesKt.AnonymousClass1.INSTANCE
        L6:
            okio.ZipFileSystem r0 = openZip(r0, r1, r2)
            return r0
    }

    public static final okio.internal.ZipEntry readEntry(okio.BufferedSource r23) {
            r5 = r23
            r5.getClass()
            int r0 = r5.readIntLe()
            r1 = 33639248(0x2014b50, float:9.499037E-38)
            if (r0 != r1) goto L103
            r0 = 4
            r5.skip(r0)
            short r0 = r5.readShortLe()
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r0 & r1
            r8 = 1
            r0 = r0 & r8
            if (r0 != 0) goto Lf9
            short r0 = r5.readShortLe()
            r19 = r0 & r1
            short r0 = r5.readShortLe()
            r0 = r0 & r1
            short r2 = r5.readShortLe()
            r2 = r2 & r1
            java.lang.Long r20 = dosDateTimeToEpochMillis(r2, r0)
            int r0 = r5.readIntLe()
            long r2 = (long) r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r2 & r6
            r2 = r6
            gg.t r6 = new gg.t
            r6.<init>()
            int r0 = r5.readIntLe()
            long r9 = (long) r0
            long r9 = r9 & r2
            r6.f4563g = r9
            gg.t r4 = new gg.t
            r4.<init>()
            int r0 = r5.readIntLe()
            long r9 = (long) r0
            long r9 = r9 & r2
            r4.f4563g = r9
            short r0 = r5.readShortLe()
            r0 = r0 & r1
            short r7 = r5.readShortLe()
            r9 = r7 & r1
            short r7 = r5.readShortLe()
            r10 = r7 & r1
            r11 = 8
            r5.skip(r11)
            gg.t r7 = new gg.t
            r7.<init>()
            int r1 = r5.readIntLe()
            long r11 = (long) r1
            long r11 = r11 & r2
            r7.f4563g = r11
            long r0 = (long) r0
            java.lang.String r11 = r5.readUtf8(r0)
            r12 = 0
            boolean r0 = og.m.i0(r11, r12)
            if (r0 != 0) goto Lf3
            long r0 = r4.f4563g
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r15 = 0
            r1 = 8
            r17 = r2
            if (r0 != 0) goto L9a
            long r2 = (long) r1
        L97:
            r21 = r13
            goto L9c
        L9a:
            r2 = r15
            goto L97
        L9c:
            long r12 = r6.f4563g
            int r0 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r0 != 0) goto La4
            long r12 = (long) r1
            long r2 = r2 + r12
        La4:
            long r12 = r7.f4563g
            int r0 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r0 != 0) goto Lac
            long r0 = (long) r1
            long r2 = r2 + r0
        Lac:
            gg.q r1 = new gg.q
            r1.<init>()
            okio.internal.ZipFilesKt$readEntry$1 r0 = new okio.internal.ZipFilesKt$readEntry$1
            r0.<init>(r1, r2, r4, r5, r6, r7)
            readExtra(r5, r9, r0)
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 <= 0) goto Lc9
            boolean r0 = r1.f4560g
            if (r0 == 0) goto Lc2
            goto Lc9
        Lc2:
            java.lang.String r0 = "bad zip: zip64 extra required but absent"
            j8.o.y(r0)
        Lc7:
            r0 = 0
            return r0
        Lc9:
            long r0 = (long) r10
            java.lang.String r12 = r5.readUtf8(r0)
            okio.Path$Companion r0 = okio.Path.Companion
            java.lang.String r1 = "/"
            r2 = 0
            r14 = 0
            okio.Path r0 = okio.Path.Companion.get$default(r0, r1, r14, r8, r2)
            okio.Path r10 = r0.resolve(r11)
            boolean r11 = og.t.W(r11, r1, r14)
            okio.internal.ZipEntry r9 = new okio.internal.ZipEntry
            long r0 = r6.f4563g
            long r2 = r4.f4563g
            long r4 = r7.f4563g
            r15 = r0
            r17 = r2
            r13 = r21
            r21 = r4
            r9.<init>(r10, r11, r12, r13, r15, r17, r19, r20, r21)
            return r9
        Lf3:
            java.lang.String r0 = "bad zip: filename contains 0x00"
            j8.o.y(r0)
            goto Lc7
        Lf9:
            java.lang.String r0 = "unsupported zip: general purpose bit flag="
            java.lang.String r1 = getHex(r2)
            okio.a.g(r1, r0)
            goto Lc7
        L103:
            java.lang.String r1 = getHex(r1)
            java.lang.String r2 = " but was "
            java.lang.String r0 = getHex(r0)
            java.lang.String r3 = "bad zip: expected "
            okio.a.j(r3, r1, r2, r0)
            goto Lc7
    }

    private static final okio.internal.EocdRecord readEocdRecord(okio.BufferedSource r10) {
            short r0 = r10.readShortLe()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            short r2 = r10.readShortLe()
            r2 = r2 & r1
            short r3 = r10.readShortLe()
            r3 = r3 & r1
            long r5 = (long) r3
            short r3 = r10.readShortLe()
            r3 = r3 & r1
            long r3 = (long) r3
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 != 0) goto L3d
            if (r0 != 0) goto L3d
            if (r2 != 0) goto L3d
            r2 = 4
            r10.skip(r2)
            int r0 = r10.readIntLe()
            long r2 = (long) r0
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r2
            short r10 = r10.readShortLe()
            r9 = r10 & r1
            okio.internal.EocdRecord r4 = new okio.internal.EocdRecord
            r4.<init>(r5, r7, r9)
            return r4
        L3d:
            java.lang.String r10 = "unsupported zip: spanned"
            j8.o.y(r10)
            r10 = 0
            return r10
    }

    private static final void readExtra(okio.BufferedSource r10, int r11, fg.p r12) {
            long r0 = (long) r11
        L1:
            r2 = 0
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 == 0) goto L69
            r4 = 4
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 < 0) goto L64
            short r11 = r10.readShortLe()
            r4 = 65535(0xffff, float:9.1834E-41)
            r11 = r11 & r4
            short r4 = r10.readShortLe()
            long r4 = (long) r4
            r6 = 65535(0xffff, double:3.23786E-319)
            long r4 = r4 & r6
            r6 = 4
            long r6 = (long) r6
            long r0 = r0 - r6
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L5e
            r10.require(r4)
            okio.Buffer r6 = r10.getBuffer()
            long r6 = r6.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            r12.invoke(r8, r9)
            okio.Buffer r8 = r10.getBuffer()
            long r8 = r8.size()
            long r8 = r8 + r4
            long r8 = r8 - r6
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 < 0) goto L54
            if (r2 <= 0) goto L52
            okio.Buffer r11 = r10.getBuffer()
            r11.skip(r8)
        L52:
            long r0 = r0 - r4
            goto L1
        L54:
            java.lang.String r10 = "unsupported zip: too many bytes processed for "
            java.lang.String r10 = eh.a.l(r11, r10)
            j8.o.y(r10)
            return
        L5e:
            java.lang.String r10 = "bad zip: truncated value in extra field"
            j8.o.y(r10)
            return
        L64:
            java.lang.String r10 = "bad zip: truncated header in extra field"
            j8.o.y(r10)
        L69:
            return
    }

    public static final okio.FileMetadata readLocalHeader(okio.BufferedSource r0, okio.FileMetadata r1) {
            r0.getClass()
            r1.getClass()
            okio.FileMetadata r0 = readOrSkipLocalHeader(r0, r1)
            r0.getClass()
            return r0
    }

    private static final okio.FileMetadata readOrSkipLocalHeader(okio.BufferedSource r17, okio.FileMetadata r18) {
            r0 = r17
            gg.u r1 = new gg.u
            r1.<init>()
            r2 = 0
            if (r18 == 0) goto Lf
            java.lang.Long r3 = r18.getLastModifiedAtMillis()
            goto L10
        Lf:
            r3 = r2
        L10:
            r1.f4564g = r3
            gg.u r3 = new gg.u
            r3.<init>()
            gg.u r4 = new gg.u
            r4.<init>()
            int r5 = r0.readIntLe()
            r6 = 67324752(0x4034b50, float:1.5433558E-36)
            if (r5 != r6) goto L8e
            r5 = 2
            r0.skip(r5)
            short r5 = r0.readShortLe()
            r6 = 65535(0xffff, float:9.1834E-41)
            r7 = r5 & r6
            r5 = r5 & 1
            if (r5 != 0) goto L83
            r7 = 18
            r0.skip(r7)
            short r5 = r0.readShortLe()
            long r7 = (long) r5
            r9 = 65535(0xffff, double:3.23786E-319)
            long r7 = r7 & r9
            short r5 = r0.readShortLe()
            r5 = r5 & r6
            r0.skip(r7)
            if (r18 != 0) goto L54
            long r3 = (long) r5
            r0.skip(r3)
            return r2
        L54:
            okio.internal.ZipFilesKt$readOrSkipLocalHeader$1 r2 = new okio.internal.ZipFilesKt$readOrSkipLocalHeader$1
            r2.<init>(r0, r1, r3, r4)
            readExtra(r0, r5, r2)
            okio.FileMetadata r6 = new okio.FileMetadata
            boolean r7 = r18.isRegularFile()
            boolean r8 = r18.isDirectory()
            java.lang.Long r10 = r18.getSize()
            java.lang.Object r0 = r4.f4564g
            r11 = r0
            java.lang.Long r11 = (java.lang.Long) r11
            java.lang.Object r0 = r1.f4564g
            r12 = r0
            java.lang.Long r12 = (java.lang.Long) r12
            java.lang.Object r0 = r3.f4564g
            r13 = r0
            java.lang.Long r13 = (java.lang.Long) r13
            r15 = 128(0x80, float:1.8E-43)
            r16 = 0
            r9 = 0
            r14 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r6
        L83:
            java.lang.String r0 = "unsupported zip: general purpose bit flag="
            java.lang.String r1 = getHex(r7)
            okio.a.g(r1, r0)
        L8c:
            r0 = 0
            return r0
        L8e:
            java.lang.String r0 = getHex(r6)
            java.lang.String r1 = " but was "
            java.lang.String r2 = getHex(r5)
            java.lang.String r3 = "bad zip: expected "
            okio.a.j(r3, r0, r1, r2)
            goto L8c
    }

    private static final okio.internal.EocdRecord readZip64EocdRecord(okio.BufferedSource r8, okio.internal.EocdRecord r9) {
            r0 = 12
            r8.skip(r0)
            int r0 = r8.readIntLe()
            int r1 = r8.readIntLe()
            long r3 = r8.readLongLe()
            long r5 = r8.readLongLe()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L30
            if (r0 != 0) goto L30
            if (r1 != 0) goto L30
            r0 = 8
            r8.skip(r0)
            long r5 = r8.readLongLe()
            okio.internal.EocdRecord r2 = new okio.internal.EocdRecord
            int r7 = r9.getCommentByteCount()
            r2.<init>(r3, r5, r7)
            return r2
        L30:
            java.lang.String r8 = "unsupported zip: spanned"
            j8.o.y(r8)
            r8 = 0
            return r8
    }

    public static final void skipLocalHeader(okio.BufferedSource r1) {
            r1.getClass()
            r0 = 0
            readOrSkipLocalHeader(r1, r0)
            return
    }
}
