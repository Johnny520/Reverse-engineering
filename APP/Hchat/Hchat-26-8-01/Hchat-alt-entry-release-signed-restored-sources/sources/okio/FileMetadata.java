package okio;

import gg.AbstractC1411g;
import gg.C1410f;
import java.util.ArrayList;
import java.util.Map;
import mg.InterfaceC2840b;
import tf.AbstractC4166m;
import tf.AbstractC4178y;
import tf.C4174u;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class FileMetadata {
    private final Long createdAtMillis;
    private final Map<InterfaceC2840b, Object> extras;
    private final boolean isDirectory;
    private final boolean isRegularFile;
    private final Long lastAccessedAtMillis;
    private final Long lastModifiedAtMillis;
    private final Long size;
    private final Path symlinkTarget;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r10v0 int) & (2 int) A[WRAPPED] (LINE:7)) != (0 int)) ? false : (r3v0 boolean))
  (wrap:okio.Path:?: TERNARY null = ((wrap:int:0x000b: ARITH (r10v0 int) & (4 int) A[WRAPPED] (LINE:12)) != (0 int)) ? (null okio.Path) : (r4v0 okio.Path))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0011: ARITH (r10v0 int) & (8 int) A[WRAPPED] (LINE:18)) != (0 int)) ? (null java.lang.Long) : (r5v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (16 int) A[WRAPPED] (LINE:23)) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x001b: ARITH (r10v0 int) & (32 int) A[WRAPPED] (LINE:28)) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0020: ARITH (r10v0 int) & (64 int) A[WRAPPED] (LINE:33)) != (0 int)) ? (null java.lang.Long) : (r8v0 java.lang.Long))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0025: ARITH (r10v0 int) & (128 int) A[WRAPPED] (LINE:38)) != (0 int)) ? (wrap:java.util.Map:0x0029: SGET  A[WRAPPED] (LINE:42) tf.u.g tf.u) : (r9v0 java.util.Map))
 A[MD:(boolean, boolean, okio.Path, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.util.Map<mg.b, ? extends java.lang.Object>):void (m)] (LINE:53) call: okio.FileMetadata.<init>(boolean, boolean, okio.Path, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.util.Map):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ FileMetadata(boolean z9, boolean z10, Path path, Long l10, Long l11, Long l12, Long l13, Map map, int i9, AbstractC1411g abstractC1411g) {
        this((i9 & 1) != 0 ? false : z9, (i9 & 2) != 0 ? false : z10, (i9 & 4) != 0 ? null : path, (i9 & 8) != 0 ? null : l10, (i9 & 16) != 0 ? null : l11, (i9 & 32) != 0 ? null : l12, (i9 & 64) != 0 ? null : l13, (i9 & 128) != 0 ? C4174u.f13711g : map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: okio.FileMetadata */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FileMetadata copy$default(FileMetadata fileMetadata, boolean z9, boolean z10, Path path, Long l10, Long l11, Long l12, Long l13, Map map, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = fileMetadata.isRegularFile;
        }
        if ((i9 & 2) != 0) {
            z10 = fileMetadata.isDirectory;
        }
        if ((i9 & 4) != 0) {
            path = fileMetadata.symlinkTarget;
        }
        if ((i9 & 8) != 0) {
            l10 = fileMetadata.size;
        }
        if ((i9 & 16) != 0) {
            l11 = fileMetadata.createdAtMillis;
        }
        if ((i9 & 32) != 0) {
            l12 = fileMetadata.lastModifiedAtMillis;
        }
        if ((i9 & 64) != 0) {
            l13 = fileMetadata.lastAccessedAtMillis;
        }
        if ((i9 & 128) != 0) {
            map = fileMetadata.extras;
        }
        Long l14 = l13;
        Map map2 = map;
        Long l15 = l11;
        Long l16 = l12;
        return fileMetadata.copy(z9, z10, path, l10, l15, l16, l14, map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FileMetadata copy(boolean z9, boolean z10, Path path, Long l10, Long l11, Long l12, Long l13, Map<InterfaceC2840b, ? extends Object> map) {
        map.getClass();
        return new FileMetadata(z9, z10, path, l10, l11, l12, l13, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <T> T extra(InterfaceC2840b interfaceC2840b) {
        interfaceC2840b.getClass();
        T t9 = (T) this.extras.get(interfaceC2840b);
        if (t9 == null) {
            return null;
        }
        C1410f c1410f = (C1410f) interfaceC2840b;
        if (c1410f.m3821d(t9)) {
            t9.getClass();
            return t9;
        }
        throw new ClassCastException("Value cannot be cast to " + c1410f.m3819b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map<InterfaceC2840b, Object> getExtras() {
        return this.extras;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Long getLastAccessedAtMillis() {
        return this.lastAccessedAtMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Long getLastModifiedAtMillis() {
        return this.lastModifiedAtMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Long getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Path getSymlinkTarget() {
        return this.symlinkTarget;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isDirectory() {
        return this.isDirectory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isRegularFile() {
        return this.isRegularFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.isRegularFile) {
            arrayList.add("isRegularFile");
        }
        if (this.isDirectory) {
            arrayList.add("isDirectory");
        }
        if (this.size != null) {
            arrayList.add("byteCount=" + this.size);
        }
        if (this.createdAtMillis != null) {
            arrayList.add("createdAt=" + this.createdAtMillis);
        }
        if (this.lastModifiedAtMillis != null) {
            arrayList.add("lastModifiedAt=" + this.lastModifiedAtMillis);
        }
        if (this.lastAccessedAtMillis != null) {
            arrayList.add("lastAccessedAt=" + this.lastAccessedAtMillis);
        }
        if (!this.extras.isEmpty()) {
            arrayList.add("extras=" + this.extras);
        }
        return AbstractC4166m.m8392A1(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public FileMetadata(boolean z9, boolean z10, Path path, Long l10, Long l11, Long l12, Long l13, Map<InterfaceC2840b, ? extends Object> map) {
        map.getClass();
        this.isRegularFile = z9;
        this.isDirectory = z10;
        this.symlinkTarget = path;
        this.size = l10;
        this.createdAtMillis = l11;
        this.lastModifiedAtMillis = l12;
        this.lastAccessedAtMillis = l13;
        this.extras = AbstractC4178y.m8443f0(map);
    }

    public FileMetadata() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }
}
