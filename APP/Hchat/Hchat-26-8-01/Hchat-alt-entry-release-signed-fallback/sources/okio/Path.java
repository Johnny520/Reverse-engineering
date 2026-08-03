package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Path implements java.lang.Comparable<okio.Path> {
    public static final okio.Path.Companion Companion = null;
    public static final java.lang.String DIRECTORY_SEPARATOR = null;
    private final okio.ByteString bytes;

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

        public static /* synthetic */ okio.Path get$default(okio.Path.Companion r0, java.io.File r1, boolean r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okio.Path r0 = r0.get(r1, r2)
                return r0
        }

        public static /* synthetic */ okio.Path get$default(okio.Path.Companion r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okio.Path r0 = r0.get(r1, r2)
                return r0
        }

        public static /* synthetic */ okio.Path get$default(okio.Path.Companion r0, java.nio.file.Path r1, boolean r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okio.Path r0 = r0.get(r1, r2)
                return r0
        }

        public final okio.Path get(java.io.File r4) {
                r3 = this;
                r4.getClass()
                r0 = 1
                r1 = 0
                r2 = 0
                okio.Path r4 = get$default(r3, r4, r2, r0, r1)
                return r4
        }

        public final okio.Path get(java.io.File r1, boolean r2) {
                r0 = this;
                r1.getClass()
                java.lang.String r1 = r1.toString()
                r1.getClass()
                okio.Path r1 = r0.get(r1, r2)
                return r1
        }

        public final okio.Path get(java.lang.String r4) {
                r3 = this;
                r4.getClass()
                r0 = 1
                r1 = 0
                r2 = 0
                okio.Path r4 = get$default(r3, r4, r2, r0, r1)
                return r4
        }

        public final okio.Path get(java.lang.String r1, boolean r2) {
                r0 = this;
                r1.getClass()
                okio.Path r1 = okio.internal.Path.commonToPath(r1, r2)
                return r1
        }

        public final okio.Path get(java.nio.file.Path r4) {
                r3 = this;
                r4.getClass()
                r0 = 1
                r1 = 0
                r2 = 0
                okio.Path r4 = get$default(r3, r4, r2, r0, r1)
                return r4
        }

        public final okio.Path get(java.nio.file.Path r1, boolean r2) {
                r0 = this;
                r1.getClass()
                java.lang.String r1 = r1.toString()
                okio.Path r1 = r0.get(r1, r2)
                return r1
        }
    }

    static {
            okio.Path$Companion r0 = new okio.Path$Companion
            r1 = 0
            r0.<init>(r1)
            okio.Path.Companion = r0
            java.lang.String r0 = java.io.File.separator
            r0.getClass()
            okio.Path.DIRECTORY_SEPARATOR = r0
            return
    }

    public Path(okio.ByteString r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.bytes = r1
            return
    }

    public static final okio.Path get(java.io.File r1) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r1 = r0.get(r1)
            return r1
    }

    public static final okio.Path get(java.io.File r1, boolean r2) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r1 = r0.get(r1, r2)
            return r1
    }

    public static final okio.Path get(java.lang.String r1) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r1 = r0.get(r1)
            return r1
    }

    public static final okio.Path get(java.lang.String r1, boolean r2) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r1 = r0.get(r1, r2)
            return r1
    }

    public static final okio.Path get(java.nio.file.Path r1) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r1 = r0.get(r1)
            return r1
    }

    public static final okio.Path get(java.nio.file.Path r1, boolean r2) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r1 = r0.get(r1, r2)
            return r1
    }

    public static /* synthetic */ okio.Path resolve$default(okio.Path r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            okio.Path r0 = r0.resolve(r1, r2)
            return r0
    }

    public static /* synthetic */ okio.Path resolve$default(okio.Path r0, okio.ByteString r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            okio.Path r0 = r0.resolve(r1, r2)
            return r0
    }

    public static /* synthetic */ okio.Path resolve$default(okio.Path r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            okio.Path r0 = r0.resolve(r1, r2)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(okio.Path r1) {
            r0 = this;
            okio.Path r1 = (okio.Path) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(okio.Path r2) {
            r1 = this;
            r2.getClass()
            okio.ByteString r0 = r1.getBytes$okio()
            okio.ByteString r2 = r2.getBytes$okio()
            int r2 = r0.compareTo2(r2)
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okio.Path
            if (r0 == 0) goto L16
            okio.Path r2 = (okio.Path) r2
            okio.ByteString r2 = r2.getBytes$okio()
            okio.ByteString r0 = r1.getBytes$okio()
            boolean r2 = gg.l.a(r2, r0)
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public final okio.ByteString getBytes$okio() {
            r1 = this;
            okio.ByteString r0 = r1.bytes
            return r0
    }

    public final okio.Path getRoot() {
            r4 = this;
            int r0 = okio.internal.Path.access$rootLength(r4)
            r1 = -1
            if (r0 != r1) goto L9
            r0 = 0
            return r0
        L9:
            okio.Path r1 = new okio.Path
            okio.ByteString r2 = r4.getBytes$okio()
            r3 = 0
            okio.ByteString r0 = r2.substring(r3, r0)
            r1.<init>(r0)
            return r1
    }

    public final java.util.List<java.lang.String> getSegments() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = okio.internal.Path.access$rootLength(r7)
            r2 = -1
            r3 = 92
            if (r1 != r2) goto L10
            r1 = 0
            goto L26
        L10:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            if (r1 >= r2) goto L26
            okio.ByteString r2 = r7.getBytes$okio()
            byte r2 = r2.getByte(r1)
            if (r2 != r3) goto L26
            int r1 = r1 + 1
        L26:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            r4 = r1
        L2f:
            if (r1 >= r2) goto L57
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            r6 = 47
            if (r5 == r6) goto L47
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            if (r5 != r3) goto L54
        L47:
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r4 = r5.substring(r4, r1)
            r0.add(r4)
            int r4 = r1 + 1
        L54:
            int r1 = r1 + 1
            goto L2f
        L57:
            okio.ByteString r1 = r7.getBytes$okio()
            int r1 = r1.size()
            if (r4 >= r1) goto L74
            okio.ByteString r1 = r7.getBytes$okio()
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            okio.ByteString r1 = r1.substring(r4, r2)
            r0.add(r1)
        L74:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L81:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L95
            java.lang.Object r2 = r0.next()
            okio.ByteString r2 = (okio.ByteString) r2
            java.lang.String r2 = r2.utf8()
            r1.add(r2)
            goto L81
        L95:
            return r1
    }

    public final java.util.List<okio.ByteString> getSegmentsBytes() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = okio.internal.Path.access$rootLength(r7)
            r2 = -1
            r3 = 92
            if (r1 != r2) goto L10
            r1 = 0
            goto L26
        L10:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            if (r1 >= r2) goto L26
            okio.ByteString r2 = r7.getBytes$okio()
            byte r2 = r2.getByte(r1)
            if (r2 != r3) goto L26
            int r1 = r1 + 1
        L26:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            r4 = r1
        L2f:
            if (r1 >= r2) goto L57
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            r6 = 47
            if (r5 == r6) goto L47
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            if (r5 != r3) goto L54
        L47:
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r4 = r5.substring(r4, r1)
            r0.add(r4)
            int r4 = r1 + 1
        L54:
            int r1 = r1 + 1
            goto L2f
        L57:
            okio.ByteString r1 = r7.getBytes$okio()
            int r1 = r1.size()
            if (r4 >= r1) goto L74
            okio.ByteString r1 = r7.getBytes$okio()
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            okio.ByteString r1 = r1.substring(r4, r2)
            r0.add(r1)
        L74:
            return r0
    }

    public int hashCode() {
            r1 = this;
            okio.ByteString r0 = r1.getBytes$okio()
            int r0 = r0.hashCode()
            return r0
    }

    public final boolean isAbsolute() {
            r2 = this;
            int r0 = okio.internal.Path.access$rootLength(r2)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final boolean isRelative() {
            r2 = this;
            int r0 = okio.internal.Path.access$rootLength(r2)
            r1 = -1
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final boolean isRoot() {
            r2 = this;
            int r0 = okio.internal.Path.access$rootLength(r2)
            okio.ByteString r1 = r2.getBytes$okio()
            int r1 = r1.size()
            if (r0 != r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public final java.lang.String name() {
            r1 = this;
            okio.ByteString r0 = r1.nameBytes()
            java.lang.String r0 = r0.utf8()
            return r0
    }

    public final okio.ByteString nameBytes() {
            r5 = this;
            int r0 = okio.internal.Path.access$getIndexOfLastSlash(r5)
            r1 = -1
            r2 = 2
            if (r0 == r1) goto L15
            okio.ByteString r1 = r5.getBytes$okio()
            int r0 = r0 + 1
            r3 = 0
            r4 = 0
            okio.ByteString r0 = okio.ByteString.substring$default(r1, r0, r3, r2, r4)
            return r0
        L15:
            java.lang.Character r0 = r5.volumeLetter()
            if (r0 == 0) goto L28
            okio.ByteString r0 = r5.getBytes$okio()
            int r0 = r0.size()
            if (r0 != r2) goto L28
            okio.ByteString r0 = okio.ByteString.EMPTY
            return r0
        L28:
            okio.ByteString r0 = r5.getBytes$okio()
            return r0
    }

    public final okio.Path normalized() {
            r3 = this;
            okio.Path$Companion r0 = okio.Path.Companion
            java.lang.String r1 = r3.toString()
            r2 = 1
            okio.Path r0 = r0.get(r1, r2)
            return r0
    }

    public final okio.Path parent() {
            r7 = this;
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r1 = okio.internal.Path.access$getDOT$p()
            boolean r0 = gg.l.a(r0, r1)
            r1 = 0
            if (r0 != 0) goto Lb9
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r2 = okio.internal.Path.access$getSLASH$p()
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto Lb9
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r2 = okio.internal.Path.access$getBACKSLASH$p()
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto Lb9
            boolean r0 = okio.internal.Path.access$lastSegmentIsDotDot(r7)
            if (r0 == 0) goto L33
            goto Lb9
        L33:
            int r0 = okio.internal.Path.access$getIndexOfLastSlash(r7)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 != r2) goto L5c
            java.lang.Character r5 = r7.volumeLetter()
            if (r5 == 0) goto L5c
            okio.ByteString r0 = r7.getBytes$okio()
            int r0 = r0.size()
            r2 = 3
            if (r0 != r2) goto L4e
            return r1
        L4e:
            okio.Path r0 = new okio.Path
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r1 = okio.ByteString.substring$default(r5, r3, r2, r4, r1)
            r0.<init>(r1)
            return r0
        L5c:
            if (r0 != r4) goto L6d
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r6 = okio.internal.Path.access$getBACKSLASH$p()
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L6d
            return r1
        L6d:
            r5 = -1
            if (r0 != r5) goto L8f
            java.lang.Character r6 = r7.volumeLetter()
            if (r6 == 0) goto L8f
            okio.ByteString r0 = r7.getBytes$okio()
            int r0 = r0.size()
            if (r0 != r2) goto L81
            return r1
        L81:
            okio.Path r0 = new okio.Path
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r1 = okio.ByteString.substring$default(r5, r3, r2, r4, r1)
            r0.<init>(r1)
            return r0
        L8f:
            if (r0 != r5) goto L9b
            okio.Path r0 = new okio.Path
            okio.ByteString r1 = okio.internal.Path.access$getDOT$p()
            r0.<init>(r1)
            return r0
        L9b:
            if (r0 != 0) goto Lab
            okio.Path r0 = new okio.Path
            okio.ByteString r2 = r7.getBytes$okio()
            okio.ByteString r1 = okio.ByteString.substring$default(r2, r3, r4, r4, r1)
            r0.<init>(r1)
            return r0
        Lab:
            okio.Path r2 = new okio.Path
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r0 = okio.ByteString.substring$default(r5, r3, r0, r4, r1)
            r2.<init>(r0)
            return r2
        Lb9:
            return r1
    }

    public final okio.Path relativeTo(okio.Path r8) {
            r7 = this;
            r8.getClass()
            okio.Path r0 = r7.getRoot()
            okio.Path r1 = r8.getRoot()
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto Lb8
            java.util.List r0 = r7.getSegmentsBytes()
            java.util.List r1 = r8.getSegmentsBytes()
            int r2 = r0.size()
            int r3 = r1.size()
            int r2 = java.lang.Math.min(r2, r3)
            r3 = 0
            r4 = r3
        L27:
            if (r4 >= r2) goto L3a
            java.lang.Object r5 = r0.get(r4)
            java.lang.Object r6 = r1.get(r4)
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L3a
            int r4 = r4 + 1
            goto L27
        L3a:
            if (r4 != r2) goto L59
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            okio.ByteString r5 = r8.getBytes$okio()
            int r5 = r5.size()
            if (r2 != r5) goto L59
            okio.Path$Companion r8 = okio.Path.Companion
            java.lang.String r0 = "."
            r1 = 0
            r2 = 1
            okio.Path r8 = okio.Path.Companion.get$default(r8, r0, r3, r2, r1)
            return r8
        L59:
            int r2 = r1.size()
            java.util.List r2 = r1.subList(r4, r2)
            okio.ByteString r5 = okio.internal.Path.access$getDOT_DOT$p()
            int r2 = r2.indexOf(r5)
            r5 = -1
            if (r2 != r5) goto Lb1
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            okio.ByteString r8 = okio.internal.Path.access$getSlash(r8)
            if (r8 != 0) goto L83
            okio.ByteString r8 = okio.internal.Path.access$getSlash(r7)
            if (r8 != 0) goto L83
            java.lang.String r8 = okio.Path.DIRECTORY_SEPARATOR
            okio.ByteString r8 = okio.internal.Path.access$toSlash(r8)
        L83:
            int r1 = r1.size()
            r5 = r4
        L88:
            if (r5 >= r1) goto L97
            okio.ByteString r6 = okio.internal.Path.access$getDOT_DOT$p()
            r2.write(r6)
            r2.write(r8)
            int r5 = r5 + 1
            goto L88
        L97:
            int r1 = r0.size()
        L9b:
            if (r4 >= r1) goto Lac
            java.lang.Object r5 = r0.get(r4)
            okio.ByteString r5 = (okio.ByteString) r5
            r2.write(r5)
            r2.write(r8)
            int r4 = r4 + 1
            goto L9b
        Lac:
            okio.Path r8 = okio.internal.Path.toPath(r2, r3)
            return r8
        Lb1:
            java.lang.String r0 = "Impossible relative path to resolve: "
            j8.o.s(r7, r0, r8)
            r8 = 0
            return r8
        Lb8:
            java.lang.String r0 = "Paths of different roots cannot be relative to each other: "
            j8.o.s(r7, r0, r8)
            r8 = 0
            return r8
    }

    public final okio.Path resolve(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r2 = r0.writeUtf8(r2)
            r0 = 0
            okio.Path r2 = okio.internal.Path.toPath(r2, r0)
            okio.Path r2 = okio.internal.Path.commonResolve(r1, r2, r0)
            return r2
    }

    public final okio.Path resolve(java.lang.String r2, boolean r3) {
            r1 = this;
            r2.getClass()
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r2 = r0.writeUtf8(r2)
            r0 = 0
            okio.Path r2 = okio.internal.Path.toPath(r2, r0)
            okio.Path r2 = okio.internal.Path.commonResolve(r1, r2, r3)
            return r2
    }

    public final okio.Path resolve(okio.ByteString r2) {
            r1 = this;
            r2.getClass()
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r2 = r0.write(r2)
            r0 = 0
            okio.Path r2 = okio.internal.Path.toPath(r2, r0)
            okio.Path r2 = okio.internal.Path.commonResolve(r1, r2, r0)
            return r2
    }

    public final okio.Path resolve(okio.ByteString r2, boolean r3) {
            r1 = this;
            r2.getClass()
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r2 = r0.write(r2)
            r0 = 0
            okio.Path r2 = okio.internal.Path.toPath(r2, r0)
            okio.Path r2 = okio.internal.Path.commonResolve(r1, r2, r3)
            return r2
    }

    public final okio.Path resolve(okio.Path r2) {
            r1 = this;
            r2.getClass()
            r0 = 0
            okio.Path r2 = okio.internal.Path.commonResolve(r1, r2, r0)
            return r2
    }

    public final okio.Path resolve(okio.Path r1, boolean r2) {
            r0 = this;
            r1.getClass()
            okio.Path r1 = okio.internal.Path.commonResolve(r0, r1, r2)
            return r1
    }

    public final java.io.File toFile() {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            return r0
    }

    public final java.nio.file.Path toNioPath() {
            r2 = this;
            java.lang.String r0 = r2.toString()
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            r0.getClass()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            okio.ByteString r0 = r1.getBytes$okio()
            java.lang.String r0 = r0.utf8()
            return r0
    }

    public final java.lang.Character volumeLetter() {
            r5 = this;
            okio.ByteString r0 = r5.getBytes$okio()
            okio.ByteString r1 = okio.internal.Path.access$getSLASH$p()
            r2 = 0
            r3 = 2
            r4 = 0
            int r0 = okio.ByteString.indexOf$default(r0, r1, r2, r3, r4)
            r1 = -1
            if (r0 == r1) goto L13
            return r4
        L13:
            okio.ByteString r0 = r5.getBytes$okio()
            int r0 = r0.size()
            if (r0 >= r3) goto L1e
            return r4
        L1e:
            okio.ByteString r0 = r5.getBytes$okio()
            r1 = 1
            byte r0 = r0.getByte(r1)
            r1 = 58
            if (r0 == r1) goto L2c
            return r4
        L2c:
            okio.ByteString r0 = r5.getBytes$okio()
            byte r0 = r0.getByte(r2)
            char r0 = (char) r0
            r1 = 97
            if (r1 > r0) goto L3e
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 >= r1) goto L3e
            goto L46
        L3e:
            r1 = 65
            if (r1 > r0) goto L4b
            r1 = 91
            if (r0 >= r1) goto L4b
        L46:
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
        L4b:
            return r4
    }
}
