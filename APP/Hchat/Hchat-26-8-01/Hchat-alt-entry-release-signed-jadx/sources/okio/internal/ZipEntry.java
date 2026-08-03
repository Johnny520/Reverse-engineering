package okio.internal;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1411g;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import okio.Path;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ZipEntry {
    private final Path canonicalPath;
    private final List<Path> children;
    private final String comment;
    private final long compressedSize;
    private final int compressionMethod;
    private final long crc;
    private final boolean isDirectory;
    private final Long lastModifiedAtMillis;
    private final long offset;
    private final long size;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0057: CONSTRUCTOR 
  (r14v0 okio.Path)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (2 int) A[WRAPPED] (LINE:3)) != (0 int)) ? false : (r15v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r27v0 int) & (4 int) A[WRAPPED] (LINE:10)) != (0 int)) ? (wrap:??:0x000d: SGET  A[WRAPPED] (LINE:14) okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String) : (r16v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0012: ARITH (r27v0 int) & (8 int) A[WRAPPED] (LINE:19)) != (0 int)) ? (-1 long) : (r17v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001c: ARITH (r27v0 int) & (16 int) A[WRAPPED] (LINE:29)) != (0 int)) ? (-1 long) : (r19v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r27v0 int) & (32 int) A[WRAPPED] (LINE:37)) != (0 int)) ? (-1 long) : (r21v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002c: ARITH (r27v0 int) & (64 int) A[WRAPPED] (LINE:45)) != (0 int)) ? (-1 int) : (r23v0 int))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0034: ARITH (r27v0 int) & (128 int) A[WRAPPED] (LINE:53)) != (0 int)) ? (null java.lang.Long) : (r24v0 java.lang.Long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x003c: ARITH (r27v0 int) & (wrap:??:SGET  A[WRAPPED] bsh.org.objectweb.asm.Opcodes.ACC_NATIVE int) A[WRAPPED] (LINE:61)) != (0 int)) ? (-1 long) : (r25v0 long))
 A[MD:(okio.Path, boolean, java.lang.String, long, long, long, int, java.lang.Long, long):void (m)] (LINE:88) call: okio.internal.ZipEntry.<init>(okio.Path, boolean, java.lang.String, long, long, long, int, java.lang.Long, long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ZipEntry(Path path, boolean z9, String str, long j3, long j4, long j5, int i9, Long l10, long j10, int i10, AbstractC1411g abstractC1411g) {
        this(path, (i10 & 2) != 0 ? false : z9, (i10 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str, (i10 & 8) != 0 ? -1L : j3, (i10 & 16) != 0 ? -1L : j4, (i10 & 32) != 0 ? -1L : j5, (i10 & 64) != 0 ? -1 : i9, (i10 & 128) != 0 ? null : l10, (i10 & Opcodes.ACC_NATIVE) != 0 ? -1L : j10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Path getCanonicalPath() {
        return this.canonicalPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<Path> getChildren() {
        return this.children;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getComment() {
        return this.comment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getCompressedSize() {
        return this.compressedSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getCompressionMethod() {
        return this.compressionMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getCrc() {
        return this.crc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Long getLastModifiedAtMillis() {
        return this.lastModifiedAtMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getOffset() {
        return this.offset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isDirectory() {
        return this.isDirectory;
    }

    public ZipEntry(Path path, boolean z9, String str, long j3, long j4, long j5, int i9, Long l10, long j10) {
        path.getClass();
        str.getClass();
        this.canonicalPath = path;
        this.isDirectory = z9;
        this.comment = str;
        this.crc = j3;
        this.compressedSize = j4;
        this.size = j5;
        this.compressionMethod = i9;
        this.lastModifiedAtMillis = l10;
        this.offset = j10;
        this.children = new ArrayList();
    }
}
