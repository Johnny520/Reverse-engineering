package okio;

/* JADX INFO: compiled from: ForwardingFileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0010\u001a\u00020\bH\u0016J \u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010&\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010(\u001a\u00020 H\u0016R\u0013\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0004¨\u0006)"}, m115d2 = {"Lokio/ForwardingFileSystem;", "Lokio/FileSystem;", "delegate", "(Lokio/FileSystem;)V", "()Lokio/FileSystem;", "appendingSink", "Lokio/Sink;", "file", "Lokio/Path;", "mustExist", "", "atomicMove", "", "source", "target", "canonicalize", "path", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "", "listOrNull", "listRecursively", "Lkotlin/sequences/Sequence;", "followSymlinks", "metadataOrNull", "Lokio/FileMetadata;", "onPathParameter", "functionName", "", "parameterName", "onPathResult", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toString", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public abstract class ForwardingFileSystem extends okio.FileSystem {
    private final okio.FileSystem delegate;


    public ForwardingFileSystem(okio.FileSystem r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.delegate = r2
            return
    }

    @Override // okio.FileSystem
    public okio.Sink appendingSink(okio.Path r3, boolean r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = "appendingSink"
            okio.Path r0 = r2.onPathParameter(r3, r1, r0)
            okio.FileSystem r1 = r2.delegate
            okio.Sink r1 = r1.appendingSink(r0, r4)
            return r1
    }

    @Override // okio.FileSystem
    public void atomicMove(okio.Path r4, okio.Path r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r1 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            java.lang.String r2 = "atomicMove"
            okio.Path r0 = r3.onPathParameter(r4, r2, r0)
            okio.Path r1 = r3.onPathParameter(r5, r2, r1)
            okio.FileSystem r2 = r3.delegate
            r2.atomicMove(r0, r1)
            return
    }

    @Override // okio.FileSystem
    public okio.Path canonicalize(okio.Path r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r1 = "canonicalize"
            okio.Path r0 = r3.onPathParameter(r4, r1, r0)
            okio.FileSystem r2 = r3.delegate
            okio.Path r2 = r2.canonicalize(r0)
            okio.Path r1 = r3.onPathResult(r2, r1)
            return r1
    }

    @Override // okio.FileSystem
    public void createDirectory(okio.Path r3, boolean r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = "createDirectory"
            okio.Path r0 = r2.onPathParameter(r3, r1, r0)
            okio.FileSystem r1 = r2.delegate
            r1.createDirectory(r0, r4)
            return
    }

    @Override // okio.FileSystem
    public void createSymlink(okio.Path r4, okio.Path r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r1 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            java.lang.String r2 = "createSymlink"
            okio.Path r0 = r3.onPathParameter(r4, r2, r0)
            okio.Path r1 = r3.onPathParameter(r5, r2, r1)
            okio.FileSystem r2 = r3.delegate
            r2.createSymlink(r0, r1)
            return
    }

    public final okio.FileSystem delegate() {
            r1 = this;
            okio.FileSystem r0 = r1.delegate
            return r0
    }

    @Override // okio.FileSystem
    public void delete(okio.Path r3, boolean r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = "delete"
            okio.Path r0 = r2.onPathParameter(r3, r1, r0)
            okio.FileSystem r1 = r2.delegate
            r1.delete(r0, r4)
            return
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> list(okio.Path r11) throws java.io.IOException {
            r10 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r1 = "list"
            okio.Path r0 = r10.onPathParameter(r11, r1, r0)
            okio.FileSystem r2 = r10.delegate
            java.util.List r2 = r2.list(r0)
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = 0
            java.util.Iterator r6 = r3.iterator()
        L22:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L38
            java.lang.Object r7 = r6.next()
            r8 = r7
            okio.Path r8 = (okio.Path) r8
            r9 = 0
            okio.Path r8 = r10.onPathResult(r8, r1)
            r4.add(r8)
            goto L22
        L38:
            r1 = r4
            java.util.List r1 = (java.util.List) r1
            kotlin.collections.CollectionsKt.sort(r1)
            return r1
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> listOrNull(okio.Path r11) {
            r10 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r1 = "listOrNull"
            okio.Path r0 = r10.onPathParameter(r11, r1, r0)
            okio.FileSystem r2 = r10.delegate
            java.util.List r2 = r2.listOrNull(r0)
            if (r2 != 0) goto L15
            r1 = 0
            return r1
        L15:
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = 0
            java.util.Iterator r6 = r3.iterator()
        L26:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L3c
            java.lang.Object r7 = r6.next()
            r8 = r7
            okio.Path r8 = (okio.Path) r8
            r9 = 0
            okio.Path r8 = r10.onPathResult(r8, r1)
            r4.add(r8)
            goto L26
        L3c:
            r1 = r4
            java.util.List r1 = (java.util.List) r1
            kotlin.collections.CollectionsKt.sort(r1)
            return r1
    }

    @Override // okio.FileSystem
    public kotlin.sequences.Sequence<okio.Path> listRecursively(okio.Path r4, boolean r5) {
            r3 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r1 = "listRecursively"
            okio.Path r0 = r3.onPathParameter(r4, r1, r0)
            okio.FileSystem r1 = r3.delegate
            kotlin.sequences.Sequence r1 = r1.listRecursively(r0, r5)
            okio.ForwardingFileSystem$listRecursively$1 r2 = new okio.ForwardingFileSystem$listRecursively$1
            r2.<init>(r3)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.map(r1, r2)
            return r2
    }

    @Override // okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path r15) throws java.io.IOException {
            r14 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r1 = "metadataOrNull"
            okio.Path r0 = r14.onPathParameter(r15, r1, r0)
            okio.FileSystem r2 = r14.delegate
            okio.FileMetadata r2 = r2.metadataOrNull(r0)
            if (r2 != 0) goto L15
            r1 = 0
            return r1
        L15:
            r13 = r2
            okio.Path r2 = r13.getSymlinkTarget()
            if (r2 != 0) goto L1d
            return r13
        L1d:
            okio.Path r2 = r13.getSymlinkTarget()
            okio.Path r1 = r14.onPathResult(r2, r1)
            r11 = 251(0xfb, float:3.52E-43)
            r12 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r2 = r13
            r5 = r1
            okio.FileMetadata r2 = okio.FileMetadata.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
    }

    public okio.Path onPathParameter(okio.Path r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "functionName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "parameterName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            return r2
    }

    public okio.Path onPathResult(okio.Path r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "functionName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            return r2
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = "openReadOnly"
            okio.Path r0 = r2.onPathParameter(r3, r1, r0)
            okio.FileSystem r1 = r2.delegate
            okio.FileHandle r1 = r1.openReadOnly(r0)
            return r1
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path r3, boolean r4, boolean r5) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = "openReadWrite"
            okio.Path r0 = r2.onPathParameter(r3, r1, r0)
            okio.FileSystem r1 = r2.delegate
            okio.FileHandle r1 = r1.openReadWrite(r0, r4, r5)
            return r1
    }

    @Override // okio.FileSystem
    public okio.Sink sink(okio.Path r3, boolean r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = "sink"
            okio.Path r0 = r2.onPathParameter(r3, r1, r0)
            okio.FileSystem r1 = r2.delegate
            okio.Sink r1 = r1.sink(r0, r4)
            return r1
    }

    @Override // okio.FileSystem
    public okio.Source source(okio.Path r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = "source"
            okio.Path r0 = r2.onPathParameter(r3, r1, r0)
            okio.FileSystem r1 = r2.delegate
            okio.Source r1 = r1.source(r0)
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            java.lang.String r1 = r1.getSimpleName()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
            okio.FileSystem r1 = r2.delegate
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
