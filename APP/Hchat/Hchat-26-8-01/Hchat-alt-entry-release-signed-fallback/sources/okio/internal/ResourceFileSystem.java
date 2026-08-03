package okio.internal;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ResourceFileSystem extends okio.FileSystem {
    private static final okio.internal.ResourceFileSystem.Companion Companion = null;
    private static final okio.Path ROOT = null;
    private final java.lang.ClassLoader classLoader;
    private final sf.c roots$delegate;
    private final okio.FileSystem systemFileSystem;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ boolean access$keepPath(okio.internal.ResourceFileSystem.Companion r0, okio.Path r1) {
                boolean r0 = r0.keepPath(r1)
                return r0
        }

        private final boolean keepPath(okio.Path r3) {
                r2 = this;
                java.lang.String r3 = r3.name()
                java.lang.String r0 = ".class"
                r1 = 1
                boolean r3 = og.t.W(r3, r0, r1)
                r3 = r3 ^ r1
                return r3
        }

        public final okio.Path getROOT() {
                r1 = this;
                okio.Path r0 = okio.internal.ResourceFileSystem.access$getROOT$cp()
                return r0
        }

        public final okio.Path removeBase(okio.Path r3, okio.Path r4) {
                r2 = this;
                r3.getClass()
                r4.getClass()
                java.lang.String r4 = r4.toString()
                okio.Path r0 = r2.getROOT()
                java.lang.String r3 = r3.toString()
                java.lang.String r3 = og.m.A0(r3, r4)
                r4 = 92
                r1 = 47
                java.lang.String r3 = r3.replace(r4, r1)
                r3.getClass()
                okio.Path r3 = r0.resolve(r3)
                return r3
        }
    }

    static {
            okio.internal.ResourceFileSystem$Companion r0 = new okio.internal.ResourceFileSystem$Companion
            r1 = 0
            r0.<init>(r1)
            okio.internal.ResourceFileSystem.Companion = r0
            okio.Path$Companion r0 = okio.Path.Companion
            r2 = 0
            r3 = 1
            java.lang.String r4 = "/"
            okio.Path r0 = okio.Path.Companion.get$default(r0, r4, r2, r3, r1)
            okio.internal.ResourceFileSystem.ROOT = r0
            return
    }

    public ResourceFileSystem(java.lang.ClassLoader r1, boolean r2, okio.FileSystem r3) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r0.<init>()
            r0.classLoader = r1
            r0.systemFileSystem = r3
            okio.internal.ResourceFileSystem$roots$2 r1 = new okio.internal.ResourceFileSystem$roots$2
            r1.<init>(r0)
            sf.i r3 = new sf.i
            r3.<init>(r1)
            r0.roots$delegate = r3
            if (r2 == 0) goto L22
            java.util.List r1 = r0.getRoots()
            r1.size()
        L22:
            return
    }

    public /* synthetic */ ResourceFileSystem(java.lang.ClassLoader r1, boolean r2, okio.FileSystem r3, int r4, gg.g r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L6
            okio.FileSystem r3 = okio.FileSystem.SYSTEM
        L6:
            r0.<init>(r1, r2, r3)
            return
    }

    public static final /* synthetic */ java.lang.ClassLoader access$getClassLoader$p(okio.internal.ResourceFileSystem r0) {
            java.lang.ClassLoader r0 = r0.classLoader
            return r0
    }

    public static final /* synthetic */ okio.internal.ResourceFileSystem.Companion access$getCompanion$p() {
            okio.internal.ResourceFileSystem$Companion r0 = okio.internal.ResourceFileSystem.Companion
            return r0
    }

    public static final /* synthetic */ okio.Path access$getROOT$cp() {
            okio.Path r0 = okio.internal.ResourceFileSystem.ROOT
            return r0
    }

    public static final /* synthetic */ java.util.List access$toClasspathRoots(okio.internal.ResourceFileSystem r0, java.lang.ClassLoader r1) {
            java.util.List r0 = r0.toClasspathRoots(r1)
            return r0
    }

    private final okio.Path canonicalizeInternal(okio.Path r3) {
            r2 = this;
            okio.Path r0 = okio.internal.ResourceFileSystem.ROOT
            r1 = 1
            okio.Path r3 = r0.resolve(r3, r1)
            return r3
    }

    private final java.util.List<sf.e> getRoots() {
            r1 = this;
            sf.c r0 = r1.roots$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private final java.util.List<sf.e> toClasspathRoots(java.lang.ClassLoader r4) {
            r3 = this;
            java.lang.String r0 = ""
            java.util.Enumeration r0 = r4.getResources(r0)
            r0.getClass()
            java.util.ArrayList r0 = java.util.Collections.list(r0)
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r0.next()
            java.net.URL r2 = (java.net.URL) r2
            r2.getClass()
            sf.e r2 = r3.toFileRoot(r2)
            if (r2 == 0) goto L19
            r1.add(r2)
            goto L19
        L32:
            java.lang.String r0 = "META-INF/MANIFEST.MF"
            java.util.Enumeration r4 = r4.getResources(r0)
            r4.getClass()
            java.util.ArrayList r4 = java.util.Collections.list(r4)
            r4.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L4b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r2 = r4.next()
            java.net.URL r2 = (java.net.URL) r2
            r2.getClass()
            sf.e r2 = r3.toJarRoot(r2)
            if (r2 == 0) goto L4b
            r0.add(r2)
            goto L4b
        L64:
            java.util.ArrayList r4 = tf.m.F1(r1, r0)
            return r4
    }

    private final sf.e toFileRoot(java.net.URL r6) {
            r5 = this;
            java.lang.String r0 = r6.getProtocol()
            java.lang.String r1 = "file"
            boolean r0 = gg.l.a(r0, r1)
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            okio.FileSystem r0 = r5.systemFileSystem
            okio.Path$Companion r2 = okio.Path.Companion
            java.io.File r3 = new java.io.File
            java.net.URI r6 = r6.toURI()
            r3.<init>(r6)
            r6 = 0
            r4 = 1
            okio.Path r6 = okio.Path.Companion.get$default(r2, r3, r6, r4, r1)
            sf.e r1 = new sf.e
            r1.<init>(r0, r6)
            return r1
    }

    private final sf.e toJarRoot(java.net.URL r7) {
            r6 = this;
            java.lang.String r7 = r7.toString()
            r7.getClass()
            java.lang.String r0 = "jar:file:"
            r1 = 0
            boolean r0 = og.t.d0(r7, r0, r1)
            r2 = 0
            if (r0 != 0) goto L12
            goto L1c
        L12:
            java.lang.String r0 = "!"
            r3 = 6
            int r0 = og.m.v0(r3, r7, r0)
            r3 = -1
            if (r0 != r3) goto L1d
        L1c:
            return r2
        L1d:
            okio.Path$Companion r3 = okio.Path.Companion
            java.io.File r4 = new java.io.File
            r5 = 4
            java.lang.String r7 = r7.substring(r5, r0)
            java.net.URI r7 = java.net.URI.create(r7)
            r4.<init>(r7)
            r7 = 1
            okio.Path r7 = okio.Path.Companion.get$default(r3, r4, r1, r7, r2)
            okio.FileSystem r0 = r6.systemFileSystem
            okio.internal.ResourceFileSystem$toJarRoot$zip$1 r1 = okio.internal.ResourceFileSystem$toJarRoot$zip$1.INSTANCE
            okio.ZipFileSystem r7 = okio.internal.ZipFilesKt.openZip(r7, r0, r1)
            okio.Path r0 = okio.internal.ResourceFileSystem.ROOT
            sf.e r1 = new sf.e
            r1.<init>(r7, r0)
            return r1
    }

    private final java.lang.String toRelativePath(okio.Path r2) {
            r1 = this;
            okio.Path r2 = r1.canonicalizeInternal(r2)
            okio.Path r0 = okio.internal.ResourceFileSystem.ROOT
            okio.Path r2 = r2.relativeTo(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    @Override // okio.FileSystem
    public okio.Sink appendingSink(okio.Path r2, boolean r3) {
            r1 = this;
            r2.getClass()
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r0 = " is read-only"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public void atomicMove(okio.Path r2, okio.Path r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r0 = " is read-only"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public okio.Path canonicalize(okio.Path r1) {
            r0 = this;
            r1.getClass()
            okio.Path r1 = r0.canonicalizeInternal(r1)
            return r1
    }

    @Override // okio.FileSystem
    public void createDirectory(okio.Path r2, boolean r3) {
            r1 = this;
            r2.getClass()
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r0 = " is read-only"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public void createSymlink(okio.Path r2, okio.Path r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r0 = " is read-only"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public void delete(okio.Path r2, boolean r3) {
            r1 = this;
            r2.getClass()
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r0 = " is read-only"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> list(okio.Path r11) {
            r10 = this;
            r11.getClass()
            java.lang.String r0 = r10.toRelativePath(r11)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.List r2 = r10.getRoots()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L15:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r2.next()
            sf.e r4 = (sf.e) r4
            java.lang.Object r5 = r4.f12418g
            okio.FileSystem r5 = (okio.FileSystem) r5
            java.lang.Object r4 = r4.f12419h
            okio.Path r4 = (okio.Path) r4
            okio.Path r6 = r4.resolve(r0)     // Catch: java.io.IOException -> L15
            java.util.List r5 = r5.list(r6)     // Catch: java.io.IOException -> L15
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.io.IOException -> L15
            r6.<init>()     // Catch: java.io.IOException -> L15
            java.util.Iterator r5 = r5.iterator()     // Catch: java.io.IOException -> L15
        L3a:
            boolean r7 = r5.hasNext()     // Catch: java.io.IOException -> L15
            if (r7 == 0) goto L53
            java.lang.Object r7 = r5.next()     // Catch: java.io.IOException -> L15
            r8 = r7
            okio.Path r8 = (okio.Path) r8     // Catch: java.io.IOException -> L15
            okio.internal.ResourceFileSystem$Companion r9 = okio.internal.ResourceFileSystem.Companion     // Catch: java.io.IOException -> L15
            boolean r8 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r9, r8)     // Catch: java.io.IOException -> L15
            if (r8 == 0) goto L3a
            r6.add(r7)     // Catch: java.io.IOException -> L15
            goto L3a
        L53:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.io.IOException -> L15
            int r7 = tf.n.e1(r6)     // Catch: java.io.IOException -> L15
            r5.<init>(r7)     // Catch: java.io.IOException -> L15
            java.util.Iterator r6 = r6.iterator()     // Catch: java.io.IOException -> L15
        L60:
            boolean r7 = r6.hasNext()     // Catch: java.io.IOException -> L15
            if (r7 == 0) goto L76
            java.lang.Object r7 = r6.next()     // Catch: java.io.IOException -> L15
            okio.Path r7 = (okio.Path) r7     // Catch: java.io.IOException -> L15
            okio.internal.ResourceFileSystem$Companion r8 = okio.internal.ResourceFileSystem.Companion     // Catch: java.io.IOException -> L15
            okio.Path r7 = r8.removeBase(r7, r4)     // Catch: java.io.IOException -> L15
            r5.add(r7)     // Catch: java.io.IOException -> L15
            goto L60
        L76:
            tf.r.h1(r1, r5)     // Catch: java.io.IOException -> L15
            r3 = 1
            goto L15
        L7b:
            if (r3 == 0) goto L82
            java.util.List r11 = tf.m.P1(r1)
            return r11
        L82:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "file not found: "
            java.lang.String r11 = j8.b.m(r11, r1)
            r0.<init>(r11)
            throw r0
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> listOrNull(okio.Path r10) {
            r9 = this;
            r10.getClass()
            java.lang.String r10 = r9.toRelativePath(r10)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List r1 = r9.getRoots()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L15:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L81
            java.lang.Object r3 = r1.next()
            sf.e r3 = (sf.e) r3
            java.lang.Object r5 = r3.f12418g
            okio.FileSystem r5 = (okio.FileSystem) r5
            java.lang.Object r3 = r3.f12419h
            okio.Path r3 = (okio.Path) r3
            okio.Path r6 = r3.resolve(r10)
            java.util.List r5 = r5.listOrNull(r6)
            if (r5 == 0) goto L7a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
        L3d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L56
            java.lang.Object r6 = r5.next()
            r7 = r6
            okio.Path r7 = (okio.Path) r7
            okio.internal.ResourceFileSystem$Companion r8 = okio.internal.ResourceFileSystem.Companion
            boolean r7 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r8, r7)
            if (r7 == 0) goto L3d
            r4.add(r6)
            goto L3d
        L56:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = tf.n.e1(r4)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L63:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L79
            java.lang.Object r6 = r4.next()
            okio.Path r6 = (okio.Path) r6
            okio.internal.ResourceFileSystem$Companion r7 = okio.internal.ResourceFileSystem.Companion
            okio.Path r6 = r7.removeBase(r6, r3)
            r5.add(r6)
            goto L63
        L79:
            r4 = r5
        L7a:
            if (r4 == 0) goto L15
            tf.r.h1(r0, r4)
            r2 = 1
            goto L15
        L81:
            if (r2 == 0) goto L88
            java.util.List r10 = tf.m.P1(r0)
            return r10
        L88:
            return r4
    }

    @Override // okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path r5) {
            r4 = this;
            r5.getClass()
            okio.internal.ResourceFileSystem$Companion r0 = okio.internal.ResourceFileSystem.Companion
            boolean r0 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r0, r5)
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.lang.String r5 = r4.toRelativePath(r5)
            java.util.List r0 = r4.getRoots()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()
            sf.e r2 = (sf.e) r2
            java.lang.Object r3 = r2.f12418g
            okio.FileSystem r3 = (okio.FileSystem) r3
            java.lang.Object r2 = r2.f12419h
            okio.Path r2 = (okio.Path) r2
            okio.Path r2 = r2.resolve(r5)
            okio.FileMetadata r2 = r3.metadataOrNull(r2)
            if (r2 != 0) goto L38
            goto L19
        L38:
            return r2
        L39:
            return r1
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path r6) {
            r5 = this;
            r6.getClass()
            okio.internal.ResourceFileSystem$Companion r0 = okio.internal.ResourceFileSystem.Companion
            boolean r0 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r0, r6)
            java.lang.String r1 = "file not found: "
            if (r0 == 0) goto L40
            java.lang.String r0 = r5.toRelativePath(r6)
            java.util.List r2 = r5.getRoots()
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L36
            java.lang.Object r3 = r2.next()
            sf.e r3 = (sf.e) r3
            java.lang.Object r4 = r3.f12418g
            okio.FileSystem r4 = (okio.FileSystem) r4
            java.lang.Object r3 = r3.f12419h
            okio.Path r3 = (okio.Path) r3
            okio.Path r3 = r3.resolve(r0)     // Catch: java.io.FileNotFoundException -> L19
            okio.FileHandle r6 = r4.openReadOnly(r3)     // Catch: java.io.FileNotFoundException -> L19
            return r6
        L36:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r6 = j8.b.m(r6, r1)
            r0.<init>(r6)
            throw r0
        L40:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r6 = j8.b.m(r6, r1)
            r0.<init>(r6)
            throw r0
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path r1, boolean r2, boolean r3) {
            r0 = this;
            r1.getClass()
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "resources are not writable"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public okio.Sink sink(okio.Path r2, boolean r3) {
            r1 = this;
            r2.getClass()
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r0 = " is read-only"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public okio.Source source(okio.Path r6) {
            r5 = this;
            r6.getClass()
            okio.internal.ResourceFileSystem$Companion r0 = okio.internal.ResourceFileSystem.Companion
            boolean r0 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r0, r6)
            java.lang.String r1 = "file not found: "
            if (r0 == 0) goto L37
            okio.Path r0 = okio.internal.ResourceFileSystem.ROOT
            r2 = 2
            r3 = 0
            r4 = 0
            okio.Path r2 = okio.Path.resolve$default(r0, r6, r4, r2, r3)
            okio.Path r0 = r2.relativeTo(r0)
            java.lang.ClassLoader r2 = r5.classLoader
            java.lang.String r0 = r0.toString()
            java.io.InputStream r0 = r2.getResourceAsStream(r0)
            if (r0 == 0) goto L2d
            okio.Source r0 = okio.Okio.source(r0)
            if (r0 == 0) goto L2d
            return r0
        L2d:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r6 = j8.b.m(r6, r1)
            r0.<init>(r6)
            throw r0
        L37:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r6 = j8.b.m(r6, r1)
            r0.<init>(r6)
            throw r0
    }
}
