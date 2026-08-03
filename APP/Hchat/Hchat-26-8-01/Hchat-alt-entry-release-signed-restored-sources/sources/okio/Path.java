package okio;

import gg.AbstractC1411g;
import gg.AbstractC1416l;
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p136j8.C2104o;
import tf.AbstractC4167n;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Path implements Comparable<Path> {
    public static final Companion Companion = new Companion(null);
    public static final String DIRECTORY_SEPARATOR;
    private final ByteString bytes;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String str = File.separator;
        str.getClass();
        DIRECTORY_SEPARATOR = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Path(ByteString byteString) {
        byteString.getClass();
        this.bytes = byteString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Path get(File file) {
        return Companion.get(file);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Path resolve$default(Path path, String str, boolean z9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return path.resolve(str, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(Path path) {
        path.getClass();
        return getBytes$okio().compareTo(path.getBytes$okio());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        return (obj instanceof Path) && AbstractC1416l.m3825a(((Path) obj).getBytes$okio(), getBytes$okio());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteString getBytes$okio() {
        return this.bytes;
    }

    /* JADX DEBUG: Class process forced to load method for inline: okio.internal.-Path.access$rootLength(okio.Path):int */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Path getRoot() {
        int iRootLength = okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            return null;
        }
        return new Path(getBytes$okio().substring(0, iRootLength));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> getSegments() {
        ArrayList arrayList = new ArrayList();
        int iRootLength = okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes$okio().size() && getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes$okio().size();
        int i9 = iRootLength;
        while (iRootLength < size) {
            if (getBytes$okio().getByte(iRootLength) == 47 || getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(getBytes$okio().substring(i9, iRootLength));
                i9 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i9 < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(i9, getBytes$okio().size()));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<ByteString> getSegmentsBytes() {
        ArrayList arrayList = new ArrayList();
        int iRootLength = okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes$okio().size() && getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes$okio().size();
        int i9 = iRootLength;
        while (iRootLength < size) {
            if (getBytes$okio().getByte(iRootLength) == 47 || getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(getBytes$okio().substring(i9, iRootLength));
                i9 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i9 < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(i9, getBytes$okio().size()));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return getBytes$okio().hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isAbsolute() {
        return okio.internal.Path.rootLength(this) != -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isRelative() {
        return okio.internal.Path.rootLength(this) == -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isRoot() {
        return okio.internal.Path.rootLength(this) == getBytes$okio().size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String name() {
        return nameBytes().utf8();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteString nameBytes() {
        int indexOfLastSlash = okio.internal.Path.getIndexOfLastSlash(this);
        return indexOfLastSlash != -1 ? ByteString.substring$default(getBytes$okio(), indexOfLastSlash + 1, 0, 2, null) : (volumeLetter() == null || getBytes$okio().size() != 2) ? getBytes$okio() : ByteString.EMPTY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Path normalized() {
        return Companion.get(toString(), true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Path parent() {
        if (AbstractC1416l.m3825a(getBytes$okio(), okio.internal.Path.DOT) || AbstractC1416l.m3825a(getBytes$okio(), okio.internal.Path.SLASH) || AbstractC1416l.m3825a(getBytes$okio(), okio.internal.Path.BACKSLASH) || okio.internal.Path.lastSegmentIsDotDot(this)) {
            return null;
        }
        int indexOfLastSlash = okio.internal.Path.getIndexOfLastSlash(this);
        if (indexOfLastSlash == 2 && volumeLetter() != null) {
            if (getBytes$okio().size() == 3) {
                return null;
            }
            return new Path(ByteString.substring$default(getBytes$okio(), 0, 3, 1, null));
        }
        if (indexOfLastSlash == 1 && getBytes$okio().startsWith(okio.internal.Path.BACKSLASH)) {
            return null;
        }
        if (indexOfLastSlash != -1 || volumeLetter() == null) {
            return indexOfLastSlash == -1 ? new Path(okio.internal.Path.DOT) : indexOfLastSlash == 0 ? new Path(ByteString.substring$default(getBytes$okio(), 0, 1, 1, null)) : new Path(ByteString.substring$default(getBytes$okio(), 0, indexOfLastSlash, 1, null));
        }
        if (getBytes$okio().size() == 2) {
            return null;
        }
        return new Path(ByteString.substring$default(getBytes$okio(), 0, 2, 1, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Path relativeTo(Path path) {
        path.getClass();
        if (!AbstractC1416l.m3825a(getRoot(), path.getRoot())) {
            C2104o.m5293s(this, "Paths of different roots cannot be relative to each other: ", path);
            return null;
        }
        List<ByteString> segmentsBytes = getSegmentsBytes();
        List<ByteString> segmentsBytes2 = path.getSegmentsBytes();
        int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i9 = 0;
        while (i9 < iMin && AbstractC1416l.m3825a(segmentsBytes.get(i9), segmentsBytes2.get(i9))) {
            i9++;
        }
        if (i9 == iMin && getBytes$okio().size() == path.getBytes$okio().size()) {
            return Companion.get$default(Companion, ".", false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i9, segmentsBytes2.size()).indexOf(okio.internal.Path.DOT_DOT) != -1) {
            C2104o.m5293s(this, "Impossible relative path to resolve: ", path);
            return null;
        }
        Buffer buffer = new Buffer();
        ByteString slash = okio.internal.Path.getSlash(path);
        if (slash == null && (slash = okio.internal.Path.getSlash(this)) == null) {
            slash = okio.internal.Path.toSlash(DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i10 = i9; i10 < size; i10++) {
            buffer.write(okio.internal.Path.DOT_DOT);
            buffer.write(slash);
        }
        int size2 = segmentsBytes.size();
        while (i9 < size2) {
            buffer.write(segmentsBytes.get(i9));
            buffer.write(slash);
            i9++;
        }
        return okio.internal.Path.toPath(buffer, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Path resolve(String str) {
        str.getClass();
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().writeUtf8(str), false), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final File toFile() {
        return new File(toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final java.nio.file.Path toNioPath() {
        java.nio.file.Path path = Paths.get(toString(), new String[0]);
        path.getClass();
        return path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return getBytes$okio().utf8();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Character volumeLetter() {
        if (ByteString.indexOf$default(getBytes$okio(), okio.internal.Path.SLASH, 0, 2, (Object) null) != -1 || getBytes$okio().size() < 2 || getBytes$okio().getByte(1) != 58) {
            return null;
        }
        char c10 = (char) getBytes$okio().getByte(0);
        if (('a' > c10 || c10 >= '{') && ('A' > c10 || c10 >= '[')) {
            return null;
        }
        return Character.valueOf(c10);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okio.Path.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ Path get$default(Companion companion, String str, boolean z9, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                z9 = false;
            }
            return companion.get(str, z9);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Path get(File file, boolean z9) {
            file.getClass();
            String string = file.toString();
            string.getClass();
            return get(string, z9);
        }

        private Companion() {
        }

        public static /* synthetic */ Path get$default(Companion companion, File file, boolean z9, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                z9 = false;
            }
            return companion.get(file, z9);
        }

        public static /* synthetic */ Path get$default(Companion companion, java.nio.file.Path path, boolean z9, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                z9 = false;
            }
            return companion.get(path, z9);
        }

        public final Path get(String str) {
            str.getClass();
            return get$default(this, str, false, 1, (Object) null);
        }

        public final Path get(java.nio.file.Path path) {
            path.getClass();
            return get$default(this, path, false, 1, (Object) null);
        }

        public final Path get(String str, boolean z9) {
            str.getClass();
            return okio.internal.Path.commonToPath(str, z9);
        }

        public final Path get(File file) {
            file.getClass();
            return get$default(this, file, false, 1, (Object) null);
        }

        public final Path get(java.nio.file.Path path, boolean z9) {
            path.getClass();
            return get(path.toString(), z9);
        }
    }

    public static final Path get(File file, boolean z9) {
        return Companion.get(file, z9);
    }

    public static final Path get(String str) {
        return Companion.get(str);
    }

    public static final Path get(String str, boolean z9) {
        return Companion.get(str, z9);
    }

    public static final Path get(java.nio.file.Path path) {
        return Companion.get(path);
    }

    public static /* synthetic */ Path resolve$default(Path path, ByteString byteString, boolean z9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return path.resolve(byteString, z9);
    }

    public static final Path get(java.nio.file.Path path, boolean z9) {
        return Companion.get(path, z9);
    }

    public static /* synthetic */ Path resolve$default(Path path, Path path2, boolean z9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return path.resolve(path2, z9);
    }

    public final Path resolve(Path path, boolean z9) {
        path.getClass();
        return okio.internal.Path.commonResolve(this, path, z9);
    }

    public final Path resolve(Path path) {
        path.getClass();
        return okio.internal.Path.commonResolve(this, path, false);
    }

    public final Path resolve(ByteString byteString) {
        byteString.getClass();
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().write(byteString), false), false);
    }

    public final Path resolve(String str, boolean z9) {
        str.getClass();
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().writeUtf8(str), false), z9);
    }

    public final Path resolve(ByteString byteString, boolean z9) {
        byteString.getClass();
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().write(byteString), false), z9);
    }
}
