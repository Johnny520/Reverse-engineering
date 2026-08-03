package okio.internal;

import gg.AbstractC1417m;
import gg.C1421q;
import gg.C1424t;
import gg.C1425u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.p221ws.WebSocketProtocol;
import okio.BufferedSource;
import okio.C3193a;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.ZipFileSystem;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p276sf.C3958e;
import p276sf.C3967n;
import tf.AbstractC4166m;
import tf.AbstractC4178y;

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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final Map<Path, ZipEntry> buildIndex(List<ZipEntry> list) {
        Path path = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
        C3958e[] c3958eArr = {new C3958e(path, new ZipEntry(path, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC4178y.m8438a0(1));
        AbstractC4178y.m8441d0(linkedHashMap, c3958eArr);
        for (ZipEntry zipEntry : AbstractC4166m.m8402K1(list, new Comparator() { // from class: okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t9, T t10) {
                return AbstractC0018a.m249m(((ZipEntry) t9).getCanonicalPath(), ((ZipEntry) t10).getCanonicalPath());
            }
        })) {
            if (((ZipEntry) linkedHashMap.put(zipEntry.getCanonicalPath(), zipEntry)) == null) {
                while (true) {
                    Path pathParent = zipEntry.getCanonicalPath().parent();
                    if (pathParent != null) {
                        ZipEntry zipEntry2 = (ZipEntry) linkedHashMap.get(pathParent);
                        if (zipEntry2 != null) {
                            zipEntry2.getChildren().add(zipEntry.getCanonicalPath());
                            break;
                        }
                        ZipEntry zipEntry3 = new ZipEntry(pathParent, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                        linkedHashMap.put(pathParent, zipEntry3);
                        zipEntry3.getChildren().add(zipEntry.getCanonicalPath());
                        zipEntry = zipEntry3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final Long dosDateTimeToEpochMillis(int i9, int i10) {
        if (i10 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i9 >> 9) & 127) + 1980, ((i9 >> 5) & 15) - 1, i9 & 31, (i10 >> 11) & 31, (i10 >> 5) & 63, (i10 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final String getHex(int i9) {
        AbstractC0000a.m96w(16);
        String string = Integer.toString(i9, 16);
        string.getClass();
        return "0x".concat(string);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX WARN: Finally extract failed */
    public static final ZipFileSystem openZip(Path path, FileSystem fileSystem, InterfaceC1231l interfaceC1231l) {
        long size;
        long j3;
        BufferedSource bufferedSourceBuffer;
        path.getClass();
        fileSystem.getClass();
        interfaceC1231l.getClass();
        FileHandle fileHandleOpenReadOnly = fileSystem.openReadOnly(path);
        try {
            size = fileHandleOpenReadOnly.size() - ((long) 22);
        } finally {
        }
        if (size < 0) {
            throw new IOException("not a zip: size=" + fileHandleOpenReadOnly.size());
        }
        long jMax = Math.max(size - 65536, 0L);
        do {
            BufferedSource bufferedSourceBuffer2 = Okio.buffer(fileHandleOpenReadOnly.source(size));
            try {
                if (bufferedSourceBuffer2.readIntLe() == END_OF_CENTRAL_DIRECTORY_SIGNATURE) {
                    EocdRecord eocdRecord = readEocdRecord(bufferedSourceBuffer2);
                    String utf8 = bufferedSourceBuffer2.readUtf8(eocdRecord.getCommentByteCount());
                    bufferedSourceBuffer2.close();
                    long j4 = size - ((long) 20);
                    if (j4 > 0) {
                        bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(j4));
                        try {
                            if (bufferedSourceBuffer.readIntLe() == ZIP64_LOCATOR_SIGNATURE) {
                                int intLe = bufferedSourceBuffer.readIntLe();
                                long longLe = bufferedSourceBuffer.readLongLe();
                                if (bufferedSourceBuffer.readIntLe() != 1 || intLe != 0) {
                                    throw new IOException("unsupported zip: spanned");
                                }
                                bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(longLe));
                                try {
                                    int intLe2 = bufferedSourceBuffer.readIntLe();
                                    if (intLe2 != ZIP64_EOCD_RECORD_SIGNATURE) {
                                        throw new IOException("bad zip: expected " + getHex(ZIP64_EOCD_RECORD_SIGNATURE) + " but was " + getHex(intLe2));
                                    }
                                    eocdRecord = readZip64EocdRecord(bufferedSourceBuffer, eocdRecord);
                                    AbstractC2043a.m5035i(bufferedSourceBuffer, null);
                                } finally {
                                }
                            }
                            AbstractC2043a.m5035i(bufferedSourceBuffer, null);
                        } finally {
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(eocdRecord.getCentralDirectoryOffset()));
                    try {
                        long entryCount = eocdRecord.getEntryCount();
                        for (j3 = 0; j3 < entryCount; j3++) {
                            ZipEntry entry = readEntry(bufferedSourceBuffer);
                            if (entry.getOffset() >= eocdRecord.getCentralDirectoryOffset()) {
                                throw new IOException("bad zip: local file header offset >= central directory offset");
                            }
                            if (((Boolean) interfaceC1231l.invoke(entry)).booleanValue()) {
                                arrayList.add(entry);
                            }
                        }
                        AbstractC2043a.m5035i(bufferedSourceBuffer, null);
                        ZipFileSystem zipFileSystem = new ZipFileSystem(path, fileSystem, buildIndex(arrayList), utf8);
                        AbstractC2043a.m5035i(fileHandleOpenReadOnly, null);
                        return zipFileSystem;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } finally {
                        }
                    }
                }
                bufferedSourceBuffer2.close();
                size--;
            } finally {
                bufferedSourceBuffer2.close();
            }
        } while (size >= jMax);
        throw new IOException("not a zip: end of central directory signature not found");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ZipFileSystem openZip$default(Path path, FileSystem fileSystem, InterfaceC1231l interfaceC1231l, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            interfaceC1231l = C31961.INSTANCE;
        }
        return openZip(path, fileSystem, interfaceC1231l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ZipEntry readEntry(BufferedSource bufferedSource) throws IOException {
        bufferedSource.getClass();
        int intLe = bufferedSource.readIntLe();
        if (intLe != CENTRAL_FILE_HEADER_SIGNATURE) {
            C3193a.m6821j("bad zip: expected ", getHex(CENTRAL_FILE_HEADER_SIGNATURE), " but was ", getHex(intLe));
            return null;
        }
        bufferedSource.skip(4L);
        short shortLe = bufferedSource.readShortLe();
        int i9 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            C3193a.m6818g(getHex(i9), "unsupported zip: general purpose bit flag=");
            return null;
        }
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        Long lDosDateTimeToEpochMillis = dosDateTimeToEpochMillis(bufferedSource.readShortLe() & 65535, bufferedSource.readShortLe() & 65535);
        long intLe2 = ((long) bufferedSource.readIntLe()) & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        C1424t c1424t = new C1424t();
        c1424t.f4737g = ((long) bufferedSource.readIntLe()) & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        C1424t c1424t2 = new C1424t();
        c1424t2.f4737g = ((long) bufferedSource.readIntLe()) & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        int shortLe3 = bufferedSource.readShortLe() & 65535;
        int shortLe4 = bufferedSource.readShortLe() & 65535;
        int shortLe5 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(8L);
        C1424t c1424t3 = new C1424t();
        c1424t3.f4737g = ((long) bufferedSource.readIntLe()) & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        String utf8 = bufferedSource.readUtf8(shortLe3);
        if (AbstractC3149m.m6710i0(utf8, (char) 0)) {
            C2104o.m5299y("bad zip: filename contains 0x00");
            return null;
        }
        long j3 = c1424t2.f4737g == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? 8 : 0L;
        if (c1424t.f4737g == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j3 += (long) 8;
        }
        if (c1424t3.f4737g == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j3 += (long) 8;
        }
        C1421q c1421q = new C1421q();
        readExtra(bufferedSource, shortLe4, new C31971(c1421q, j3, c1424t2, bufferedSource, c1424t, c1424t3));
        if (j3 <= 0 || c1421q.f4734g) {
            return new ZipEntry(Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null).resolve(utf8), AbstractC3156t.m6733W(utf8, "/", false), bufferedSource.readUtf8(shortLe5), intLe2, c1424t.f4737g, c1424t2.f4737g, shortLe2, lDosDateTimeToEpochMillis, c1424t3.f4737g);
        }
        C2104o.m5299y("bad zip: zip64 extra required but absent");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final EocdRecord readEocdRecord(BufferedSource bufferedSource) throws IOException {
        int shortLe = bufferedSource.readShortLe() & 65535;
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        long shortLe3 = bufferedSource.readShortLe() & 65535;
        if (shortLe3 == (bufferedSource.readShortLe() & 65535) && shortLe == 0 && shortLe2 == 0) {
            bufferedSource.skip(4L);
            return new EocdRecord(shortLe3, MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE & ((long) bufferedSource.readIntLe()), bufferedSource.readShortLe() & 65535);
        }
        C2104o.m5299y("unsupported zip: spanned");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final void readExtra(BufferedSource bufferedSource, int i9, InterfaceC1235p interfaceC1235p) throws IOException {
        long j3 = i9;
        while (j3 != 0) {
            if (j3 < 4) {
                C2104o.m5299y("bad zip: truncated header in extra field");
                return;
            }
            int shortLe = bufferedSource.readShortLe() & 65535;
            long shortLe2 = ((long) bufferedSource.readShortLe()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j4 = j3 - ((long) 4);
            if (j4 < shortLe2) {
                C2104o.m5299y("bad zip: truncated value in extra field");
                return;
            }
            bufferedSource.require(shortLe2);
            long size = bufferedSource.getBuffer().size();
            interfaceC1235p.invoke(Integer.valueOf(shortLe), Long.valueOf(shortLe2));
            long size2 = (bufferedSource.getBuffer().size() + shortLe2) - size;
            if (size2 < 0) {
                C2104o.m5299y(AbstractC0921a.m2249l(shortLe, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (size2 > 0) {
                    bufferedSource.getBuffer().skip(size2);
                }
                j3 = j4 - shortLe2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final FileMetadata readLocalHeader(BufferedSource bufferedSource, FileMetadata fileMetadata) throws IOException {
        bufferedSource.getClass();
        fileMetadata.getClass();
        FileMetadata orSkipLocalHeader = readOrSkipLocalHeader(bufferedSource, fileMetadata);
        orSkipLocalHeader.getClass();
        return orSkipLocalHeader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final FileMetadata readOrSkipLocalHeader(BufferedSource bufferedSource, FileMetadata fileMetadata) throws IOException {
        C1425u c1425u = new C1425u();
        c1425u.f4738g = fileMetadata != null ? fileMetadata.getLastModifiedAtMillis() : null;
        C1425u c1425u2 = new C1425u();
        C1425u c1425u3 = new C1425u();
        int intLe = bufferedSource.readIntLe();
        if (intLe != LOCAL_FILE_HEADER_SIGNATURE) {
            C3193a.m6821j("bad zip: expected ", getHex(LOCAL_FILE_HEADER_SIGNATURE), " but was ", getHex(intLe));
            return null;
        }
        bufferedSource.skip(2L);
        short shortLe = bufferedSource.readShortLe();
        int i9 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            C3193a.m6818g(getHex(i9), "unsupported zip: general purpose bit flag=");
            return null;
        }
        bufferedSource.skip(18L);
        long shortLe2 = ((long) bufferedSource.readShortLe()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int shortLe3 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(shortLe2);
        if (fileMetadata == null) {
            bufferedSource.skip(shortLe3);
            return null;
        }
        readExtra(bufferedSource, shortLe3, new C31981(bufferedSource, c1425u, c1425u2, c1425u3));
        return new FileMetadata(fileMetadata.isRegularFile(), fileMetadata.isDirectory(), null, fileMetadata.getSize(), (Long) c1425u3.f4738g, (Long) c1425u.f4738g, (Long) c1425u2.f4738g, null, 128, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final EocdRecord readZip64EocdRecord(BufferedSource bufferedSource, EocdRecord eocdRecord) throws IOException {
        bufferedSource.skip(12L);
        int intLe = bufferedSource.readIntLe();
        int intLe2 = bufferedSource.readIntLe();
        long longLe = bufferedSource.readLongLe();
        if (longLe == bufferedSource.readLongLe() && intLe == 0 && intLe2 == 0) {
            bufferedSource.skip(8L);
            return new EocdRecord(longLe, bufferedSource.readLongLe(), eocdRecord.getCommentByteCount());
        }
        C2104o.m5299y("unsupported zip: spanned");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void skipLocalHeader(BufferedSource bufferedSource) throws IOException {
        bufferedSource.getClass();
        readOrSkipLocalHeader(bufferedSource, null);
    }

    /* JADX INFO: renamed from: okio.internal.ZipFilesKt$openZip$1 */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class C31961 extends AbstractC1417m implements InterfaceC1231l {
        public static final C31961 INSTANCE = new C31961();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C31961() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p085fg.InterfaceC1231l
        public final Boolean invoke(ZipEntry zipEntry) {
            zipEntry.getClass();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: okio.internal.ZipFilesKt$readEntry$1 */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class C31971 extends AbstractC1417m implements InterfaceC1235p {
        final /* synthetic */ C1424t $compressedSize;
        final /* synthetic */ C1421q $hasZip64Extra;
        final /* synthetic */ C1424t $offset;
        final /* synthetic */ long $requiredZip64ExtraSize;
        final /* synthetic */ C1424t $size;
        final /* synthetic */ BufferedSource $this_readEntry;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31971(C1421q c1421q, long j3, C1424t c1424t, BufferedSource bufferedSource, C1424t c1424t2, C1424t c1424t3) {
            super(2);
            this.$hasZip64Extra = c1421q;
            this.$requiredZip64ExtraSize = j3;
            this.$size = c1424t;
            this.$this_readEntry = bufferedSource;
            this.$compressedSize = c1424t2;
            this.$offset = c1424t3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void invoke(int i9, long j3) throws IOException {
            if (i9 == 1) {
                C1421q c1421q = this.$hasZip64Extra;
                if (c1421q.f4734g) {
                    C2104o.m5299y("bad zip: zip64 extra repeated");
                    return;
                }
                c1421q.f4734g = true;
                if (j3 < this.$requiredZip64ExtraSize) {
                    C2104o.m5299y("bad zip: zip64 extra too short");
                    return;
                }
                C1424t c1424t = this.$size;
                long longLe = c1424t.f4737g;
                if (longLe == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
                    longLe = this.$this_readEntry.readLongLe();
                }
                c1424t.f4737g = longLe;
                C1424t c1424t2 = this.$compressedSize;
                c1424t2.f4737g = c1424t2.f4737g == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? this.$this_readEntry.readLongLe() : 0L;
                C1424t c1424t3 = this.$offset;
                c1424t3.f4737g = c1424t3.f4737g == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? this.$this_readEntry.readLongLe() : 0L;
            }
        }

        @Override // p085fg.InterfaceC1235p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
            return C3967n.f12976a;
        }
    }

    /* JADX INFO: renamed from: okio.internal.ZipFilesKt$readOrSkipLocalHeader$1 */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class C31981 extends AbstractC1417m implements InterfaceC1235p {
        final /* synthetic */ C1425u $createdAtMillis;
        final /* synthetic */ C1425u $lastAccessedAtMillis;
        final /* synthetic */ C1425u $lastModifiedAtMillis;
        final /* synthetic */ BufferedSource $this_readOrSkipLocalHeader;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31981(BufferedSource bufferedSource, C1425u c1425u, C1425u c1425u2, C1425u c1425u3) {
            super(2);
            this.$this_readOrSkipLocalHeader = bufferedSource;
            this.$lastModifiedAtMillis = c1425u;
            this.$lastAccessedAtMillis = c1425u2;
            this.$createdAtMillis = c1425u3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void invoke(int i9, long j3) throws IOException {
            if (i9 == ZipFilesKt.HEADER_ID_EXTENDED_TIMESTAMP) {
                if (j3 < 1) {
                    C2104o.m5299y("bad zip: extended timestamp extra too short");
                    return;
                }
                byte b10 = this.$this_readOrSkipLocalHeader.readByte();
                boolean z9 = (b10 & 1) == 1;
                boolean z10 = (b10 & 2) == 2;
                boolean z11 = (b10 & 4) == 4;
                BufferedSource bufferedSource = this.$this_readOrSkipLocalHeader;
                long j4 = z9 ? 5L : 1L;
                if (z10) {
                    j4 += 4;
                }
                if (z11) {
                    j4 += 4;
                }
                if (j3 < j4) {
                    C2104o.m5299y("bad zip: extended timestamp extra too short");
                    return;
                }
                if (z9) {
                    this.$lastModifiedAtMillis.f4738g = Long.valueOf(((long) bufferedSource.readIntLe()) * 1000);
                }
                if (z10) {
                    this.$lastAccessedAtMillis.f4738g = Long.valueOf(((long) this.$this_readOrSkipLocalHeader.readIntLe()) * 1000);
                }
                if (z11) {
                    this.$createdAtMillis.f4738g = Long.valueOf(((long) this.$this_readOrSkipLocalHeader.readIntLe()) * 1000);
                }
            }
        }

        @Override // p085fg.InterfaceC1235p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
            return C3967n.f12976a;
        }
    }
}
