package okio;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001.B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0000H\u0096\u0002J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\rH\u0087\u0002¢\u0006\u0002\b\"J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b\"J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0002\b\"J\u0013\u0010#\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\u001eH\u0016J\u0006\u0010&\u001a\u00020\u0000J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\bJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\bJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\bJ\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020,J\b\u0010-\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001c¨\u0006/"}, m115d2 = {"Lokio/Path;", "", "bytes", "Lokio/ByteString;", "(Lokio/ByteString;)V", "getBytes$okio", "()Lokio/ByteString;", "isAbsolute", "", "()Z", "isRelative", "isRoot", "name", "", "()Ljava/lang/String;", "nameBytes", "parent", "()Lokio/Path;", "root", "getRoot", "segments", "", "getSegments", "()Ljava/util/List;", "segmentsBytes", "getSegmentsBytes", "volumeLetter", "", "()Ljava/lang/Character;", "compareTo", "", "other", "div", "child", "resolve", "equals", "", "hashCode", "normalized", "relativeTo", "normalize", "toFile", "Ljava/io/File;", "toNioPath", "Ljava/nio/file/Path;", "toString", "Companion", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class Path implements java.lang.Comparable<okio.Path> {
    public static final okio.Path.Companion Companion = null;
    public static final java.lang.String DIRECTORY_SEPARATOR = null;
    private final okio.ByteString bytes;

    /* JADX INFO: compiled from: Path.kt */
    @kotlin.Metadata(m114d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\f\u001a\u00020\u0006*\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m115d2 = {"Lokio/Path$Companion;", "", "()V", "DIRECTORY_SEPARATOR", "", "toOkioPath", "Lokio/Path;", "Ljava/io/File;", "normalize", "", "get", "Ljava/nio/file/Path;", "toPath", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
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

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.io.File r4) {
                r3 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = 1
                r1 = 0
                r2 = 0
                okio.Path r0 = get$default(r3, r4, r2, r0, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.io.File r3, boolean r4) {
                r2 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = r3.toString()
                java.lang.String r1 = "toString(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                okio.Path r0 = r2.get(r0, r4)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = 1
                r1 = 0
                r2 = 0
                okio.Path r0 = get$default(r3, r4, r2, r0, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.lang.String r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okio.Path r0 = okio.internal.Path.commonToPath(r2, r3)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.nio.file.Path r4) {
                r3 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = 1
                r1 = 0
                r2 = 0
                okio.Path r0 = get$default(r3, r4, r2, r0, r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.nio.file.Path r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = r2.toString()
                okio.Path r0 = r1.get(r0, r3)
                return r0
        }
    }

    static {
            okio.Path$Companion r0 = new okio.Path$Companion
            r1 = 0
            r0.<init>(r1)
            okio.Path.Companion = r0
            java.lang.String r0 = java.io.File.separator
            java.lang.String r1 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            okio.Path.DIRECTORY_SEPARATOR = r0
            return
    }

    public Path(okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.bytes = r2
            return
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.io.File r1) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r0 = r0.get(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.io.File r1, boolean r2) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r0 = r0.get(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.lang.String r1) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r0 = r0.get(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.lang.String r1, boolean r2) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r0 = r0.get(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.nio.file.Path r1) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r0 = r0.get(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.nio.file.Path r1, boolean r2) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r0 = r0.get(r1, r2)
            return r0
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
    public /* bridge */ /* synthetic */ int compareTo(okio.Path r2) {
            r1 = this;
            r0 = r2
            okio.Path r0 = (okio.Path) r0
            int r0 = r1.compareTo2(r0)
            return r0
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(okio.Path r5) {
            r4 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            r1 = 0
            okio.ByteString r2 = r0.getBytes$okio()
            okio.ByteString r3 = r5.getBytes$okio()
            int r0 = r2.compareTo2(r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            boolean r2 = r5 instanceof okio.Path
            if (r2 == 0) goto L19
            r2 = r5
            okio.Path r2 = (okio.Path) r2
            okio.ByteString r2 = r2.getBytes$okio()
            okio.ByteString r3 = r0.getBytes$okio()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L19
            r2 = 1
            goto L1a
        L19:
            r2 = 0
        L1a:
            return r2
    }

    public final okio.ByteString getBytes$okio() {
            r1 = this;
            okio.ByteString r0 = r1.bytes
            return r0
    }

    public final okio.Path getRoot() {
            r6 = this;
            r0 = r6
            r1 = 0
            int r2 = okio.internal.Path.access$rootLength(r0)
            r3 = -1
            if (r2 != r3) goto Lb
            r3 = 0
            goto L19
        Lb:
            okio.Path r3 = new okio.Path
            okio.ByteString r4 = r0.getBytes$okio()
            r5 = 0
            okio.ByteString r4 = r4.substring(r5, r2)
            r3.<init>(r4)
        L19:
            return r3
    }

    public final java.util.List<java.lang.String> getSegments() {
            r11 = this;
            r0 = r11
            r1 = 0
            r2 = r0
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            int r5 = okio.internal.Path.access$rootLength(r2)
            r6 = -1
            r7 = 92
            if (r5 != r6) goto L16
            r5 = 0
            goto L2c
        L16:
            okio.ByteString r6 = r2.getBytes$okio()
            int r6 = r6.size()
            if (r5 >= r6) goto L2c
            okio.ByteString r6 = r2.getBytes$okio()
            byte r6 = r6.getByte(r5)
            if (r6 != r7) goto L2c
            int r5 = r5 + 1
        L2c:
            r6 = r5
            okio.ByteString r8 = r2.getBytes$okio()
            int r8 = r8.size()
        L35:
            if (r6 >= r8) goto L60
            okio.ByteString r9 = r2.getBytes$okio()
            byte r9 = r9.getByte(r6)
            r10 = 47
            if (r9 == r10) goto L4d
            okio.ByteString r9 = r2.getBytes$okio()
            byte r9 = r9.getByte(r6)
            if (r9 != r7) goto L5d
        L4d:
            r9 = r4
            java.util.Collection r9 = (java.util.Collection) r9
            okio.ByteString r10 = r2.getBytes$okio()
            okio.ByteString r10 = r10.substring(r5, r6)
            r9.add(r10)
            int r5 = r6 + 1
        L5d:
            int r6 = r6 + 1
            goto L35
        L60:
            okio.ByteString r6 = r2.getBytes$okio()
            int r6 = r6.size()
            if (r5 >= r6) goto L80
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            okio.ByteString r7 = r2.getBytes$okio()
            okio.ByteString r8 = r2.getBytes$okio()
            int r8 = r8.size()
            okio.ByteString r7 = r7.substring(r5, r8)
            r6.add(r7)
        L80:
            r2 = r4
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L99:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Laf
            java.lang.Object r8 = r7.next()
            r9 = r8
            okio.ByteString r9 = (okio.ByteString) r9
            r10 = 0
            java.lang.String r9 = r9.utf8()
            r4.add(r9)
            goto L99
        Laf:
            java.util.List r4 = (java.util.List) r4
            return r4
    }

    public final java.util.List<okio.ByteString> getSegmentsBytes() {
            r9 = this;
            r0 = r9
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            int r3 = okio.internal.Path.access$rootLength(r0)
            r4 = -1
            r5 = 92
            if (r3 != r4) goto L14
            r3 = 0
            goto L2a
        L14:
            okio.ByteString r4 = r0.getBytes$okio()
            int r4 = r4.size()
            if (r3 >= r4) goto L2a
            okio.ByteString r4 = r0.getBytes$okio()
            byte r4 = r4.getByte(r3)
            if (r4 != r5) goto L2a
            int r3 = r3 + 1
        L2a:
            r4 = r3
            okio.ByteString r6 = r0.getBytes$okio()
            int r6 = r6.size()
        L33:
            if (r4 >= r6) goto L5e
            okio.ByteString r7 = r0.getBytes$okio()
            byte r7 = r7.getByte(r4)
            r8 = 47
            if (r7 == r8) goto L4b
            okio.ByteString r7 = r0.getBytes$okio()
            byte r7 = r7.getByte(r4)
            if (r7 != r5) goto L5b
        L4b:
            r7 = r2
            java.util.Collection r7 = (java.util.Collection) r7
            okio.ByteString r8 = r0.getBytes$okio()
            okio.ByteString r8 = r8.substring(r3, r4)
            r7.add(r8)
            int r3 = r4 + 1
        L5b:
            int r4 = r4 + 1
            goto L33
        L5e:
            okio.ByteString r4 = r0.getBytes$okio()
            int r4 = r4.size()
            if (r3 >= r4) goto L7e
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            okio.ByteString r5 = r0.getBytes$okio()
            okio.ByteString r6 = r0.getBytes$okio()
            int r6 = r6.size()
            okio.ByteString r5 = r5.substring(r3, r6)
            r4.add(r5)
        L7e:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = r3
            r1 = 0
            okio.ByteString r2 = r0.getBytes$okio()
            int r0 = r2.hashCode()
            return r0
    }

    public final boolean isAbsolute() {
            r4 = this;
            r0 = r4
            r1 = 0
            int r2 = okio.internal.Path.access$rootLength(r0)
            r3 = -1
            if (r2 == r3) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            return r2
    }

    public final boolean isRelative() {
            r4 = this;
            r0 = r4
            r1 = 0
            int r2 = okio.internal.Path.access$rootLength(r0)
            r3 = -1
            if (r2 != r3) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            return r2
    }

    public final boolean isRoot() {
            r4 = this;
            r0 = r4
            r1 = 0
            int r2 = okio.internal.Path.access$rootLength(r0)
            okio.ByteString r3 = r0.getBytes$okio()
            int r3 = r3.size()
            if (r2 != r3) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public final java.lang.String name() {
            r3 = this;
            r0 = r3
            r1 = 0
            okio.ByteString r2 = r0.nameBytes()
            java.lang.String r0 = r2.utf8()
            return r0
    }

    public final okio.ByteString nameBytes() {
            r8 = this;
            r0 = r8
            r1 = 0
            int r2 = okio.internal.Path.access$getIndexOfLastSlash(r0)
            r3 = -1
            r4 = 2
            if (r2 == r3) goto L18
            okio.ByteString r3 = r0.getBytes$okio()
            int r5 = r2 + 1
            r6 = 0
            r7 = 0
            okio.ByteString r3 = okio.ByteString.substring$default(r3, r5, r6, r4, r7)
            goto L2f
        L18:
            java.lang.Character r3 = r0.volumeLetter()
            if (r3 == 0) goto L2b
            okio.ByteString r3 = r0.getBytes$okio()
            int r3 = r3.size()
            if (r3 != r4) goto L2b
            okio.ByteString r3 = okio.ByteString.EMPTY
            goto L2f
        L2b:
            okio.ByteString r3 = r0.getBytes$okio()
        L2f:
            return r3
    }

    public final okio.Path normalized() {
            r5 = this;
            r0 = r5
            r1 = 0
            okio.Path$Companion r2 = okio.Path.Companion
            java.lang.String r3 = r0.toString()
            r4 = 1
            okio.Path r0 = r2.get(r3, r4)
            return r0
    }

    public final okio.Path parent() {
            r9 = this;
            r0 = r9
            r1 = 0
            okio.ByteString r2 = r0.getBytes$okio()
            okio.ByteString r3 = okio.internal.Path.access$getDOT$p()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            r3 = 0
            if (r2 != 0) goto Lc1
            okio.ByteString r2 = r0.getBytes$okio()
            okio.ByteString r4 = okio.internal.Path.access$getSLASH$p()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 != 0) goto Lc1
            okio.ByteString r2 = r0.getBytes$okio()
            okio.ByteString r4 = okio.internal.Path.access$getBACKSLASH$p()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 != 0) goto Lc1
            boolean r2 = okio.internal.Path.access$lastSegmentIsDotDot(r0)
            if (r2 == 0) goto L35
            goto Lc1
        L35:
            int r2 = okio.internal.Path.access$getIndexOfLastSlash(r0)
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 != r4) goto L61
            java.lang.Character r7 = r0.volumeLetter()
            if (r7 == 0) goto L61
            okio.ByteString r4 = r0.getBytes$okio()
            int r4 = r4.size()
            r7 = 3
            if (r4 != r7) goto L52
            goto Lc2
        L52:
            okio.Path r4 = new okio.Path
            okio.ByteString r8 = r0.getBytes$okio()
            okio.ByteString r3 = okio.ByteString.substring$default(r8, r5, r7, r6, r3)
            r4.<init>(r3)
            r3 = r4
            goto Lc2
        L61:
            if (r2 != r6) goto L72
            okio.ByteString r7 = r0.getBytes$okio()
            okio.ByteString r8 = okio.internal.Path.access$getBACKSLASH$p()
            boolean r7 = r7.startsWith(r8)
            if (r7 == 0) goto L72
            goto Lc2
        L72:
            r7 = -1
            if (r2 != r7) goto L95
            java.lang.Character r8 = r0.volumeLetter()
            if (r8 == 0) goto L95
            okio.ByteString r7 = r0.getBytes$okio()
            int r7 = r7.size()
            if (r7 != r4) goto L86
            goto Lc2
        L86:
            okio.Path r7 = new okio.Path
            okio.ByteString r8 = r0.getBytes$okio()
            okio.ByteString r3 = okio.ByteString.substring$default(r8, r5, r4, r6, r3)
            r7.<init>(r3)
            r3 = r7
            goto Lc2
        L95:
            if (r2 != r7) goto La1
            okio.Path r3 = new okio.Path
            okio.ByteString r4 = okio.internal.Path.access$getDOT$p()
            r3.<init>(r4)
            goto Lc2
        La1:
            if (r2 != 0) goto Lb2
            okio.Path r4 = new okio.Path
            okio.ByteString r7 = r0.getBytes$okio()
            okio.ByteString r3 = okio.ByteString.substring$default(r7, r5, r6, r6, r3)
            r4.<init>(r3)
            r3 = r4
            goto Lc2
        Lb2:
            okio.Path r4 = new okio.Path
            okio.ByteString r7 = r0.getBytes$okio()
            okio.ByteString r3 = okio.ByteString.substring$default(r7, r5, r2, r6, r3)
            r4.<init>(r3)
            r3 = r4
            goto Lc2
        Lc1:
        Lc2:
            return r3
    }

    public final okio.Path relativeTo(okio.Path r13) {
            r12 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = r12
            r1 = 0
            okio.Path r2 = r0.getRoot()
            okio.Path r3 = r13.getRoot()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            java.lang.String r3 = " and "
            if (r2 == 0) goto Le3
            java.util.List r2 = r0.getSegmentsBytes()
            java.util.List r4 = r13.getSegmentsBytes()
            r5 = 0
            int r6 = r2.size()
            int r7 = r4.size()
            int r6 = java.lang.Math.min(r6, r7)
        L2c:
            if (r5 >= r6) goto L3f
            java.lang.Object r7 = r2.get(r5)
            java.lang.Object r8 = r4.get(r5)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
            if (r7 == 0) goto L3f
            int r5 = r5 + 1
            goto L2c
        L3f:
            r7 = 0
            r8 = 1
            if (r5 != r6) goto L5f
            okio.ByteString r9 = r0.getBytes$okio()
            int r9 = r9.size()
            okio.ByteString r10 = r13.getBytes$okio()
            int r10 = r10.size()
            if (r9 != r10) goto L5f
            okio.Path$Companion r3 = okio.Path.Companion
            java.lang.String r9 = "."
            r10 = 0
            okio.Path r3 = okio.Path.Companion.get$default(r3, r9, r7, r8, r10)
            goto Lbc
        L5f:
            int r9 = r4.size()
            java.util.List r9 = r4.subList(r5, r9)
            okio.ByteString r10 = okio.internal.Path.access$getDOT_DOT$p()
            int r9 = r9.indexOf(r10)
            r10 = -1
            if (r9 != r10) goto L73
            goto L74
        L73:
            r8 = r7
        L74:
            if (r8 == 0) goto Lbd
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            okio.ByteString r8 = okio.internal.Path.access$getSlash(r13)
            if (r8 != 0) goto L8d
            okio.ByteString r8 = okio.internal.Path.access$getSlash(r0)
            if (r8 != 0) goto L8d
            java.lang.String r8 = okio.Path.DIRECTORY_SEPARATOR
            okio.ByteString r8 = okio.internal.Path.access$toSlash(r8)
        L8d:
            r9 = r5
            int r10 = r4.size()
        L92:
            if (r9 >= r10) goto La1
            okio.ByteString r11 = okio.internal.Path.access$getDOT_DOT$p()
            r3.write(r11)
            r3.write(r8)
            int r9 = r9 + 1
            goto L92
        La1:
            r9 = r5
            int r10 = r2.size()
        La6:
            if (r9 >= r10) goto Lb7
            java.lang.Object r11 = r2.get(r9)
            okio.ByteString r11 = (okio.ByteString) r11
            r3.write(r11)
            r3.write(r8)
            int r9 = r9 + 1
            goto La6
        Lb7:
            okio.Path r7 = okio.internal.Path.toPath(r3, r7)
            r3 = r7
        Lbc:
            return r3
        Lbd:
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Impossible relative path to resolve: "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.StringBuilder r3 = r8.append(r3)
            java.lang.StringBuilder r3 = r3.append(r13)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r7.<init>(r3)
            throw r7
        Le3:
            r2 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Paths of different roots cannot be relative to each other: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.StringBuilder r3 = r3.append(r13)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public final okio.Path resolve(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            r1 = r7
            r2 = 0
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            okio.Buffer r3 = r3.writeUtf8(r8)
            r4 = r1
            r5 = 0
            r6 = 0
            okio.Path r6 = okio.internal.Path.toPath(r3, r6)
            okio.Path r3 = okio.internal.Path.commonResolve(r4, r6, r0)
            return r3
    }

    public final okio.Path resolve(java.lang.String r7, boolean r8) {
            r6 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r6
            r1 = 0
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            okio.Buffer r2 = r2.writeUtf8(r7)
            r3 = r0
            r4 = 0
            r5 = 0
            okio.Path r5 = okio.internal.Path.toPath(r2, r5)
            okio.Path r2 = okio.internal.Path.commonResolve(r3, r5, r8)
            return r2
    }

    public final okio.Path resolve(okio.ByteString r8) {
            r7 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            r1 = r7
            r2 = 0
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            okio.Buffer r3 = r3.write(r8)
            r4 = r1
            r5 = 0
            r6 = 0
            okio.Path r6 = okio.internal.Path.toPath(r3, r6)
            okio.Path r3 = okio.internal.Path.commonResolve(r4, r6, r0)
            return r3
    }

    public final okio.Path resolve(okio.ByteString r7, boolean r8) {
            r6 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r6
            r1 = 0
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            okio.Buffer r2 = r2.write(r7)
            r3 = r0
            r4 = 0
            r5 = 0
            okio.Path r5 = okio.internal.Path.toPath(r2, r5)
            okio.Path r2 = okio.internal.Path.commonResolve(r3, r5, r8)
            return r2
    }

    public final okio.Path resolve(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            okio.Path r0 = okio.internal.Path.commonResolve(r1, r2, r0)
            return r0
    }

    public final okio.Path resolve(okio.Path r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Path r0 = okio.internal.Path.commonResolve(r1, r2, r3)
            return r0
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
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = r3
            r1 = 0
            okio.ByteString r2 = r0.getBytes$okio()
            java.lang.String r0 = r2.utf8()
            return r0
    }

    public final java.lang.Character volumeLetter() {
            r7 = this;
            r0 = r7
            r1 = 0
            okio.ByteString r2 = r0.getBytes$okio()
            okio.ByteString r3 = okio.internal.Path.access$getSLASH$p()
            r4 = 0
            r5 = 2
            r6 = 0
            int r2 = okio.ByteString.indexOf$default(r2, r3, r4, r5, r6)
            r3 = -1
            if (r2 == r3) goto L15
            goto L54
        L15:
            okio.ByteString r2 = r0.getBytes$okio()
            int r2 = r2.size()
            if (r2 >= r5) goto L20
            goto L54
        L20:
            okio.ByteString r2 = r0.getBytes$okio()
            r3 = 1
            byte r2 = r2.getByte(r3)
            r5 = 58
            if (r2 == r5) goto L2e
            goto L54
        L2e:
            okio.ByteString r2 = r0.getBytes$okio()
            byte r2 = r2.getByte(r4)
            char r2 = (char) r2
            r5 = 97
            if (r5 > r2) goto L41
            r5 = 123(0x7b, float:1.72E-43)
            if (r2 >= r5) goto L41
            r5 = r3
            goto L42
        L41:
            r5 = r4
        L42:
            if (r5 != 0) goto L50
            r5 = 65
            if (r5 > r2) goto L4d
            r5 = 91
            if (r2 >= r5) goto L4d
            r4 = r3
        L4d:
            if (r4 != 0) goto L50
            goto L54
        L50:
            java.lang.Character r6 = java.lang.Character.valueOf(r2)
        L54:
            return r6
    }
}
