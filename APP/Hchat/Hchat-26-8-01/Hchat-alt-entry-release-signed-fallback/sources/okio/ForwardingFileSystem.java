package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ForwardingFileSystem extends okio.FileSystem {
    private final okio.FileSystem delegate;

    /* JADX INFO: renamed from: okio.ForwardingFileSystem$listRecursively$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class AnonymousClass1 extends gg.m implements fg.l {
        final /* synthetic */ okio.ForwardingFileSystem this$0;

        public AnonymousClass1(okio.ForwardingFileSystem r1) {
                r0 = this;
                r0.this$0 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // fg.l
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                okio.Path r1 = (okio.Path) r1
                okio.Path r1 = r0.invoke(r1)
                return r1
        }

        public final okio.Path invoke(okio.Path r3) {
                r2 = this;
                r3.getClass()
                okio.ForwardingFileSystem r0 = r2.this$0
                java.lang.String r1 = "listRecursively"
                okio.Path r3 = r0.onPathResult(r3, r1)
                return r3
        }
    }

    public ForwardingFileSystem(okio.FileSystem r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.delegate = r1
            return
    }

    @Override // okio.FileSystem
    public okio.Sink appendingSink(okio.Path r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = "appendingSink"
            java.lang.String r1 = "file"
            okio.Path r3 = r2.onPathParameter(r3, r0, r1)
            okio.FileSystem r0 = r2.delegate
            okio.Sink r3 = r0.appendingSink(r3, r4)
            return r3
    }

    @Override // okio.FileSystem
    public void atomicMove(okio.Path r3, okio.Path r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            java.lang.String r0 = "source"
            java.lang.String r1 = "atomicMove"
            okio.Path r3 = r2.onPathParameter(r3, r1, r0)
            java.lang.String r0 = "target"
            okio.Path r4 = r2.onPathParameter(r4, r1, r0)
            okio.FileSystem r0 = r2.delegate
            r0.atomicMove(r3, r4)
            return
    }

    @Override // okio.FileSystem
    public okio.Path canonicalize(okio.Path r3) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = "path"
            java.lang.String r1 = "canonicalize"
            okio.Path r3 = r2.onPathParameter(r3, r1, r0)
            okio.FileSystem r0 = r2.delegate
            okio.Path r3 = r0.canonicalize(r3)
            okio.Path r3 = r2.onPathResult(r3, r1)
            return r3
    }

    @Override // okio.FileSystem
    public void createDirectory(okio.Path r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = "createDirectory"
            java.lang.String r1 = "dir"
            okio.Path r3 = r2.onPathParameter(r3, r0, r1)
            okio.FileSystem r0 = r2.delegate
            r0.createDirectory(r3, r4)
            return
    }

    @Override // okio.FileSystem
    public void createSymlink(okio.Path r3, okio.Path r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            java.lang.String r0 = "source"
            java.lang.String r1 = "createSymlink"
            okio.Path r3 = r2.onPathParameter(r3, r1, r0)
            java.lang.String r0 = "target"
            okio.Path r4 = r2.onPathParameter(r4, r1, r0)
            okio.FileSystem r0 = r2.delegate
            r0.createSymlink(r3, r4)
            return
    }

    public final okio.FileSystem delegate() {
            r1 = this;
            okio.FileSystem r0 = r1.delegate
            return r0
    }

    @Override // okio.FileSystem
    public void delete(okio.Path r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = "delete"
            java.lang.String r1 = "path"
            okio.Path r3 = r2.onPathParameter(r3, r0, r1)
            okio.FileSystem r0 = r2.delegate
            r0.delete(r3, r4)
            return
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> list(okio.Path r4) {
            r3 = this;
            r4.getClass()
            java.lang.String r0 = "dir"
            java.lang.String r1 = "list"
            okio.Path r4 = r3.onPathParameter(r4, r1, r0)
            okio.FileSystem r0 = r3.delegate
            java.util.List r4 = r0.list(r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L1a:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r4.next()
            okio.Path r2 = (okio.Path) r2
            okio.Path r2 = r3.onPathResult(r2, r1)
            r0.add(r2)
            goto L1a
        L2e:
            tf.q.f1(r0)
            return r0
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> listOrNull(okio.Path r4) {
            r3 = this;
            r4.getClass()
            java.lang.String r0 = "dir"
            java.lang.String r1 = "listOrNull"
            okio.Path r4 = r3.onPathParameter(r4, r1, r0)
            okio.FileSystem r0 = r3.delegate
            java.util.List r4 = r0.listOrNull(r4)
            if (r4 != 0) goto L15
            r4 = 0
            return r4
        L15:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L1e:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r4.next()
            okio.Path r2 = (okio.Path) r2
            okio.Path r2 = r3.onPathResult(r2, r1)
            r0.add(r2)
            goto L1e
        L32:
            tf.q.f1(r0)
            return r0
    }

    @Override // okio.FileSystem
    public ng.j listRecursively(okio.Path r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = "listRecursively"
            java.lang.String r1 = "dir"
            okio.Path r3 = r2.onPathParameter(r3, r0, r1)
            okio.FileSystem r0 = r2.delegate
            ng.j r3 = r0.listRecursively(r3, r4)
            okio.ForwardingFileSystem$listRecursively$1 r4 = new okio.ForwardingFileSystem$listRecursively$1
            r4.<init>(r2)
            ng.t r3 = ng.m.W(r3, r4)
            return r3
    }

    @Override // okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path r14) {
            r13 = this;
            r14.getClass()
            java.lang.String r0 = "path"
            java.lang.String r1 = "metadataOrNull"
            okio.Path r14 = r13.onPathParameter(r14, r1, r0)
            okio.FileSystem r0 = r13.delegate
            okio.FileMetadata r2 = r0.metadataOrNull(r14)
            if (r2 != 0) goto L15
            r14 = 0
            return r14
        L15:
            okio.Path r14 = r2.getSymlinkTarget()
            if (r14 != 0) goto L1c
            return r2
        L1c:
            okio.Path r14 = r2.getSymlinkTarget()
            okio.Path r5 = r13.onPathResult(r14, r1)
            r11 = 251(0xfb, float:3.52E-43)
            r12 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            okio.FileMetadata r14 = okio.FileMetadata.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
    }

    public okio.Path onPathParameter(okio.Path r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            return r1
    }

    public okio.Path onPathResult(okio.Path r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            return r1
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path r3) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = "openReadOnly"
            java.lang.String r1 = "file"
            okio.Path r3 = r2.onPathParameter(r3, r0, r1)
            okio.FileSystem r0 = r2.delegate
            okio.FileHandle r3 = r0.openReadOnly(r3)
            return r3
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path r3, boolean r4, boolean r5) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = "openReadWrite"
            java.lang.String r1 = "file"
            okio.Path r3 = r2.onPathParameter(r3, r0, r1)
            okio.FileSystem r0 = r2.delegate
            okio.FileHandle r3 = r0.openReadWrite(r3, r4, r5)
            return r3
    }

    @Override // okio.FileSystem
    public okio.Sink sink(okio.Path r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = "sink"
            java.lang.String r1 = "file"
            okio.Path r3 = r2.onPathParameter(r3, r0, r1)
            okio.FileSystem r0 = r2.delegate
            okio.Sink r3 = r0.sink(r3, r4)
            return r3
    }

    @Override // okio.FileSystem
    public okio.Source source(okio.Path r3) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = "source"
            java.lang.String r1 = "file"
            okio.Path r3 = r2.onPathParameter(r3, r0, r1)
            okio.FileSystem r0 = r2.delegate
            okio.Source r3 = r0.source(r3)
            return r3
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            gg.f r1 = gg.v.a(r1)
            java.lang.String r1 = r1.c()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            okio.FileSystem r1 = r2.delegate
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
