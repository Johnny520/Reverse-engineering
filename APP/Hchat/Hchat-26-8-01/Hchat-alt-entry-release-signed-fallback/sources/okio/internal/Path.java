package okio.internal;

/* JADX INFO: renamed from: okio.internal.-Path, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Path {
    private static final okio.ByteString ANY_SLASH = null;
    private static final okio.ByteString BACKSLASH = null;
    private static final okio.ByteString DOT = null;
    private static final okio.ByteString DOT_DOT = null;
    private static final okio.ByteString SLASH = null;

    static {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "/"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okio.internal.Path.SLASH = r1
            java.lang.String r1 = "\\"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okio.internal.Path.BACKSLASH = r1
            java.lang.String r1 = "/\\"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okio.internal.Path.ANY_SLASH = r1
            java.lang.String r1 = "."
            okio.ByteString r1 = r0.encodeUtf8(r1)
            okio.internal.Path.DOT = r1
            java.lang.String r1 = ".."
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okio.internal.Path.DOT_DOT = r0
            return
    }

    public static final /* synthetic */ okio.ByteString access$getBACKSLASH$p() {
            okio.ByteString r0 = okio.internal.Path.BACKSLASH
            return r0
    }

    public static final /* synthetic */ okio.ByteString access$getDOT$p() {
            okio.ByteString r0 = okio.internal.Path.DOT
            return r0
    }

    public static final /* synthetic */ okio.ByteString access$getDOT_DOT$p() {
            okio.ByteString r0 = okio.internal.Path.DOT_DOT
            return r0
    }

    public static final /* synthetic */ int access$getIndexOfLastSlash(okio.Path r0) {
            int r0 = getIndexOfLastSlash(r0)
            return r0
    }

    public static final /* synthetic */ okio.ByteString access$getSLASH$p() {
            okio.ByteString r0 = okio.internal.Path.SLASH
            return r0
    }

    public static final /* synthetic */ okio.ByteString access$getSlash(okio.Path r0) {
            okio.ByteString r0 = getSlash(r0)
            return r0
    }

    public static final /* synthetic */ boolean access$lastSegmentIsDotDot(okio.Path r0) {
            boolean r0 = lastSegmentIsDotDot(r0)
            return r0
    }

    public static final /* synthetic */ int access$rootLength(okio.Path r0) {
            int r0 = rootLength(r0)
            return r0
    }

    public static final /* synthetic */ okio.ByteString access$toSlash(java.lang.String r0) {
            okio.ByteString r0 = toSlash(r0)
            return r0
    }

    public static final int commonCompareTo(okio.Path r0, okio.Path r1) {
            r0.getClass()
            r1.getClass()
            okio.ByteString r0 = r0.getBytes$okio()
            okio.ByteString r1 = r1.getBytes$okio()
            int r0 = r0.compareTo2(r1)
            return r0
    }

    public static final boolean commonEquals(okio.Path r1, java.lang.Object r2) {
            r1.getClass()
            boolean r0 = r2 instanceof okio.Path
            if (r0 == 0) goto L19
            okio.Path r2 = (okio.Path) r2
            okio.ByteString r2 = r2.getBytes$okio()
            okio.ByteString r1 = r1.getBytes$okio()
            boolean r1 = gg.l.a(r2, r1)
            if (r1 == 0) goto L19
            r1 = 1
            return r1
        L19:
            r1 = 0
            return r1
    }

    public static final int commonHashCode(okio.Path r0) {
            r0.getClass()
            okio.ByteString r0 = r0.getBytes$okio()
            int r0 = r0.hashCode()
            return r0
    }

    public static final boolean commonIsAbsolute(okio.Path r1) {
            r1.getClass()
            int r1 = access$rootLength(r1)
            r0 = -1
            if (r1 == r0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static final boolean commonIsRelative(okio.Path r1) {
            r1.getClass()
            int r1 = access$rootLength(r1)
            r0 = -1
            if (r1 != r0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static final boolean commonIsRoot(okio.Path r1) {
            r1.getClass()
            int r0 = access$rootLength(r1)
            okio.ByteString r1 = r1.getBytes$okio()
            int r1 = r1.size()
            if (r0 != r1) goto L13
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    public static final java.lang.String commonName(okio.Path r0) {
            r0.getClass()
            okio.ByteString r0 = r0.nameBytes()
            java.lang.String r0 = r0.utf8()
            return r0
    }

    public static final okio.ByteString commonNameBytes(okio.Path r4) {
            r4.getClass()
            int r0 = access$getIndexOfLastSlash(r4)
            r1 = -1
            r2 = 2
            if (r0 == r1) goto L18
            okio.ByteString r4 = r4.getBytes$okio()
            int r0 = r0 + 1
            r1 = 0
            r3 = 0
            okio.ByteString r4 = okio.ByteString.substring$default(r4, r0, r1, r2, r3)
            return r4
        L18:
            java.lang.Character r0 = r4.volumeLetter()
            if (r0 == 0) goto L2b
            okio.ByteString r0 = r4.getBytes$okio()
            int r0 = r0.size()
            if (r0 != r2) goto L2b
            okio.ByteString r4 = okio.ByteString.EMPTY
            return r4
        L2b:
            okio.ByteString r4 = r4.getBytes$okio()
            return r4
    }

    public static final okio.Path commonNormalized(okio.Path r2) {
            r2.getClass()
            okio.Path$Companion r0 = okio.Path.Companion
            java.lang.String r2 = r2.toString()
            r1 = 1
            okio.Path r2 = r0.get(r2, r1)
            return r2
    }

    public static final okio.Path commonParent(okio.Path r7) {
            r7.getClass()
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r1 = access$getDOT$p()
            boolean r0 = gg.l.a(r0, r1)
            r1 = 0
            if (r0 != 0) goto Lbc
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r2 = access$getSLASH$p()
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto Lbc
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r2 = access$getBACKSLASH$p()
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto Lbc
            boolean r0 = access$lastSegmentIsDotDot(r7)
            if (r0 == 0) goto L36
            goto Lbc
        L36:
            int r0 = access$getIndexOfLastSlash(r7)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 != r2) goto L5f
            java.lang.Character r5 = r7.volumeLetter()
            if (r5 == 0) goto L5f
            okio.ByteString r0 = r7.getBytes$okio()
            int r0 = r0.size()
            r2 = 3
            if (r0 != r2) goto L51
            return r1
        L51:
            okio.Path r0 = new okio.Path
            okio.ByteString r7 = r7.getBytes$okio()
            okio.ByteString r7 = okio.ByteString.substring$default(r7, r3, r2, r4, r1)
            r0.<init>(r7)
            return r0
        L5f:
            if (r0 != r4) goto L70
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r6 = access$getBACKSLASH$p()
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L70
            return r1
        L70:
            r5 = -1
            if (r0 != r5) goto L92
            java.lang.Character r6 = r7.volumeLetter()
            if (r6 == 0) goto L92
            okio.ByteString r0 = r7.getBytes$okio()
            int r0 = r0.size()
            if (r0 != r2) goto L84
            return r1
        L84:
            okio.Path r0 = new okio.Path
            okio.ByteString r7 = r7.getBytes$okio()
            okio.ByteString r7 = okio.ByteString.substring$default(r7, r3, r2, r4, r1)
            r0.<init>(r7)
            return r0
        L92:
            if (r0 != r5) goto L9e
            okio.Path r7 = new okio.Path
            okio.ByteString r0 = access$getDOT$p()
            r7.<init>(r0)
            return r7
        L9e:
            if (r0 != 0) goto Lae
            okio.Path r0 = new okio.Path
            okio.ByteString r7 = r7.getBytes$okio()
            okio.ByteString r7 = okio.ByteString.substring$default(r7, r3, r4, r4, r1)
            r0.<init>(r7)
            return r0
        Lae:
            okio.Path r2 = new okio.Path
            okio.ByteString r7 = r7.getBytes$okio()
            okio.ByteString r7 = okio.ByteString.substring$default(r7, r3, r0, r4, r1)
            r2.<init>(r7)
            return r2
        Lbc:
            return r1
    }

    public static final okio.Path commonRelativeTo(okio.Path r7, okio.Path r8) {
            r7.getClass()
            r8.getClass()
            okio.Path r0 = r7.getRoot()
            okio.Path r1 = r8.getRoot()
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto Lbb
            java.util.List r0 = r7.getSegmentsBytes()
            java.util.List r1 = r8.getSegmentsBytes()
            int r2 = r0.size()
            int r3 = r1.size()
            int r2 = java.lang.Math.min(r2, r3)
            r3 = 0
            r4 = r3
        L2a:
            if (r4 >= r2) goto L3d
            java.lang.Object r5 = r0.get(r4)
            java.lang.Object r6 = r1.get(r4)
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L3d
            int r4 = r4 + 1
            goto L2a
        L3d:
            if (r4 != r2) goto L5c
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            okio.ByteString r5 = r8.getBytes$okio()
            int r5 = r5.size()
            if (r2 != r5) goto L5c
            okio.Path$Companion r7 = okio.Path.Companion
            java.lang.String r8 = "."
            r0 = 0
            r1 = 1
            okio.Path r7 = okio.Path.Companion.get$default(r7, r8, r3, r1, r0)
            return r7
        L5c:
            int r2 = r1.size()
            java.util.List r2 = r1.subList(r4, r2)
            okio.ByteString r5 = access$getDOT_DOT$p()
            int r2 = r2.indexOf(r5)
            r5 = -1
            if (r2 != r5) goto Lb4
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            okio.ByteString r8 = access$getSlash(r8)
            if (r8 != 0) goto L86
            okio.ByteString r8 = access$getSlash(r7)
            if (r8 != 0) goto L86
            java.lang.String r7 = okio.Path.DIRECTORY_SEPARATOR
            okio.ByteString r8 = access$toSlash(r7)
        L86:
            int r7 = r1.size()
            r1 = r4
        L8b:
            if (r1 >= r7) goto L9a
            okio.ByteString r5 = access$getDOT_DOT$p()
            r2.write(r5)
            r2.write(r8)
            int r1 = r1 + 1
            goto L8b
        L9a:
            int r7 = r0.size()
        L9e:
            if (r4 >= r7) goto Laf
            java.lang.Object r1 = r0.get(r4)
            okio.ByteString r1 = (okio.ByteString) r1
            r2.write(r1)
            r2.write(r8)
            int r4 = r4 + 1
            goto L9e
        Laf:
            okio.Path r7 = toPath(r2, r3)
            return r7
        Lb4:
            java.lang.String r0 = "Impossible relative path to resolve: "
            j8.o.s(r7, r0, r8)
            r7 = 0
            return r7
        Lbb:
            java.lang.String r0 = "Paths of different roots cannot be relative to each other: "
            j8.o.s(r7, r0, r8)
            r7 = 0
            return r7
    }

    public static final okio.Path commonResolve(okio.Path r1, java.lang.String r2, boolean r3) {
            r1.getClass()
            r2.getClass()
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r2 = r0.writeUtf8(r2)
            r0 = 0
            okio.Path r2 = toPath(r2, r0)
            okio.Path r1 = commonResolve(r1, r2, r3)
            return r1
    }

    public static final okio.Path commonResolve(okio.Path r1, okio.Buffer r2, boolean r3) {
            r1.getClass()
            r2.getClass()
            r0 = 0
            okio.Path r2 = toPath(r2, r0)
            okio.Path r1 = commonResolve(r1, r2, r3)
            return r1
    }

    public static final okio.Path commonResolve(okio.Path r1, okio.ByteString r2, boolean r3) {
            r1.getClass()
            r2.getClass()
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r2 = r0.write(r2)
            r0 = 0
            okio.Path r2 = toPath(r2, r0)
            okio.Path r1 = commonResolve(r1, r2, r3)
            return r1
    }

    public static final okio.Path commonResolve(okio.Path r6, okio.Path r7, boolean r8) {
            r6.getClass()
            r7.getClass()
            boolean r0 = r7.isAbsolute()
            if (r0 != 0) goto L4a
            java.lang.Character r0 = r7.volumeLetter()
            if (r0 == 0) goto L13
            goto L4a
        L13:
            okio.ByteString r0 = getSlash(r6)
            if (r0 != 0) goto L25
            okio.ByteString r0 = getSlash(r7)
            if (r0 != 0) goto L25
            java.lang.String r0 = okio.Path.DIRECTORY_SEPARATOR
            okio.ByteString r0 = toSlash(r0)
        L25:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.ByteString r6 = r6.getBytes$okio()
            r1.write(r6)
            long r2 = r1.size()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L3e
            r1.write(r0)
        L3e:
            okio.ByteString r6 = r7.getBytes$okio()
            r1.write(r6)
            okio.Path r6 = toPath(r1, r8)
            return r6
        L4a:
            return r7
    }

    public static final okio.Path commonRoot(okio.Path r3) {
            r3.getClass()
            int r0 = access$rootLength(r3)
            r1 = -1
            if (r0 != r1) goto Lc
            r3 = 0
            return r3
        Lc:
            okio.Path r1 = new okio.Path
            okio.ByteString r3 = r3.getBytes$okio()
            r2 = 0
            okio.ByteString r3 = r3.substring(r2, r0)
            r1.<init>(r3)
            return r1
    }

    public static final java.util.List<java.lang.String> commonSegments(okio.Path r7) {
            r7.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = access$rootLength(r7)
            r2 = -1
            r3 = 92
            if (r1 != r2) goto L13
            r1 = 0
            goto L29
        L13:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            if (r1 >= r2) goto L29
            okio.ByteString r2 = r7.getBytes$okio()
            byte r2 = r2.getByte(r1)
            if (r2 != r3) goto L29
            int r1 = r1 + 1
        L29:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            r4 = r1
        L32:
            if (r1 >= r2) goto L5a
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            r6 = 47
            if (r5 == r6) goto L4a
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            if (r5 != r3) goto L57
        L4a:
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r4 = r5.substring(r4, r1)
            r0.add(r4)
            int r4 = r1 + 1
        L57:
            int r1 = r1 + 1
            goto L32
        L5a:
            okio.ByteString r1 = r7.getBytes$okio()
            int r1 = r1.size()
            if (r4 >= r1) goto L77
            okio.ByteString r1 = r7.getBytes$okio()
            okio.ByteString r7 = r7.getBytes$okio()
            int r7 = r7.size()
            okio.ByteString r7 = r1.substring(r4, r7)
            r0.add(r7)
        L77:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r1 = tf.n.e1(r0)
            r7.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L84:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L98
            java.lang.Object r1 = r0.next()
            okio.ByteString r1 = (okio.ByteString) r1
            java.lang.String r1 = r1.utf8()
            r7.add(r1)
            goto L84
        L98:
            return r7
    }

    public static final java.util.List<okio.ByteString> commonSegmentsBytes(okio.Path r7) {
            r7.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = access$rootLength(r7)
            r2 = -1
            r3 = 92
            if (r1 != r2) goto L13
            r1 = 0
            goto L29
        L13:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            if (r1 >= r2) goto L29
            okio.ByteString r2 = r7.getBytes$okio()
            byte r2 = r2.getByte(r1)
            if (r2 != r3) goto L29
            int r1 = r1 + 1
        L29:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            r4 = r1
        L32:
            if (r1 >= r2) goto L5a
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            r6 = 47
            if (r5 == r6) goto L4a
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            if (r5 != r3) goto L57
        L4a:
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r4 = r5.substring(r4, r1)
            r0.add(r4)
            int r4 = r1 + 1
        L57:
            int r1 = r1 + 1
            goto L32
        L5a:
            okio.ByteString r1 = r7.getBytes$okio()
            int r1 = r1.size()
            if (r4 >= r1) goto L77
            okio.ByteString r1 = r7.getBytes$okio()
            okio.ByteString r7 = r7.getBytes$okio()
            int r7 = r7.size()
            okio.ByteString r7 = r1.substring(r4, r7)
            r0.add(r7)
        L77:
            return r0
    }

    public static final okio.Path commonToPath(java.lang.String r1, boolean r2) {
            r1.getClass()
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r1 = r0.writeUtf8(r1)
            okio.Path r1 = toPath(r1, r2)
            return r1
    }

    public static final java.lang.String commonToString(okio.Path r0) {
            r0.getClass()
            okio.ByteString r0 = r0.getBytes$okio()
            java.lang.String r0 = r0.utf8()
            return r0
    }

    public static final java.lang.Character commonVolumeLetter(okio.Path r5) {
            r5.getClass()
            okio.ByteString r0 = r5.getBytes$okio()
            okio.ByteString r1 = access$getSLASH$p()
            r2 = 0
            r3 = 2
            r4 = 0
            int r0 = okio.ByteString.indexOf$default(r0, r1, r2, r3, r4)
            r1 = -1
            if (r0 == r1) goto L16
            return r4
        L16:
            okio.ByteString r0 = r5.getBytes$okio()
            int r0 = r0.size()
            if (r0 >= r3) goto L21
            return r4
        L21:
            okio.ByteString r0 = r5.getBytes$okio()
            r1 = 1
            byte r0 = r0.getByte(r1)
            r1 = 58
            if (r0 == r1) goto L2f
            return r4
        L2f:
            okio.ByteString r5 = r5.getBytes$okio()
            byte r5 = r5.getByte(r2)
            char r5 = (char) r5
            r0 = 97
            if (r0 > r5) goto L41
            r0 = 123(0x7b, float:1.72E-43)
            if (r5 >= r0) goto L41
            goto L49
        L41:
            r0 = 65
            if (r0 > r5) goto L4e
            r0 = 91
            if (r5 >= r0) goto L4e
        L49:
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            return r5
        L4e:
            return r4
    }

    private static /* synthetic */ void getANY_SLASH$annotations() {
            return
    }

    private static /* synthetic */ void getBACKSLASH$annotations() {
            return
    }

    private static /* synthetic */ void getDOT$annotations() {
            return
    }

    private static /* synthetic */ void getDOT_DOT$annotations() {
            return
    }

    private static final int getIndexOfLastSlash(okio.Path r5) {
            okio.ByteString r0 = r5.getBytes$okio()
            okio.ByteString r1 = okio.internal.Path.SLASH
            r2 = 0
            r3 = 2
            r4 = 0
            int r0 = okio.ByteString.lastIndexOf$default(r0, r1, r2, r3, r4)
            r1 = -1
            if (r0 == r1) goto L11
            return r0
        L11:
            okio.ByteString r5 = r5.getBytes$okio()
            okio.ByteString r0 = okio.internal.Path.BACKSLASH
            int r5 = okio.ByteString.lastIndexOf$default(r5, r0, r2, r3, r4)
            return r5
    }

    private static /* synthetic */ void getSLASH$annotations() {
            return
    }

    private static final okio.ByteString getSlash(okio.Path r6) {
            okio.ByteString r0 = r6.getBytes$okio()
            okio.ByteString r1 = okio.internal.Path.SLASH
            r2 = 0
            r3 = 2
            r4 = 0
            int r0 = okio.ByteString.indexOf$default(r0, r1, r2, r3, r4)
            r5 = -1
            if (r0 == r5) goto L11
            return r1
        L11:
            okio.ByteString r6 = r6.getBytes$okio()
            okio.ByteString r0 = okio.internal.Path.BACKSLASH
            int r6 = okio.ByteString.indexOf$default(r6, r0, r2, r3, r4)
            if (r6 == r5) goto L1e
            return r0
        L1e:
            return r4
    }

    private static final boolean lastSegmentIsDotDot(okio.Path r5) {
            okio.ByteString r0 = r5.getBytes$okio()
            okio.ByteString r1 = okio.internal.Path.DOT_DOT
            boolean r0 = r0.endsWith(r1)
            r1 = 0
            if (r0 == 0) goto L48
            okio.ByteString r0 = r5.getBytes$okio()
            int r0 = r0.size()
            r2 = 2
            r3 = 1
            if (r0 != r2) goto L1a
            return r3
        L1a:
            okio.ByteString r0 = r5.getBytes$okio()
            okio.ByteString r2 = r5.getBytes$okio()
            int r2 = r2.size()
            int r2 = r2 + (-3)
            okio.ByteString r4 = okio.internal.Path.SLASH
            boolean r0 = r0.rangeEquals(r2, r4, r1, r3)
            if (r0 == 0) goto L31
            return r3
        L31:
            okio.ByteString r0 = r5.getBytes$okio()
            okio.ByteString r5 = r5.getBytes$okio()
            int r5 = r5.size()
            int r5 = r5 + (-3)
            okio.ByteString r2 = okio.internal.Path.BACKSLASH
            boolean r5 = r0.rangeEquals(r5, r2, r1, r3)
            if (r5 == 0) goto L48
            return r3
        L48:
            return r1
    }

    private static final int rootLength(okio.Path r6) {
            okio.ByteString r0 = r6.getBytes$okio()
            int r0 = r0.size()
            r1 = -1
            if (r0 != 0) goto Lc
            return r1
        Lc:
            okio.ByteString r0 = r6.getBytes$okio()
            r2 = 0
            byte r0 = r0.getByte(r2)
            r3 = 47
            r4 = 1
            if (r0 != r3) goto L1b
            return r4
        L1b:
            okio.ByteString r0 = r6.getBytes$okio()
            byte r0 = r0.getByte(r2)
            r3 = 92
            r5 = 2
            if (r0 != r3) goto L53
            okio.ByteString r0 = r6.getBytes$okio()
            int r0 = r0.size()
            if (r0 <= r5) goto L52
            okio.ByteString r0 = r6.getBytes$okio()
            byte r0 = r0.getByte(r4)
            if (r0 != r3) goto L52
            okio.ByteString r0 = r6.getBytes$okio()
            okio.ByteString r2 = okio.internal.Path.BACKSLASH
            int r0 = r0.indexOf(r2, r5)
            if (r0 != r1) goto L51
            okio.ByteString r6 = r6.getBytes$okio()
            int r6 = r6.size()
            return r6
        L51:
            return r0
        L52:
            return r4
        L53:
            okio.ByteString r0 = r6.getBytes$okio()
            int r0 = r0.size()
            if (r0 <= r5) goto L8f
            okio.ByteString r0 = r6.getBytes$okio()
            byte r0 = r0.getByte(r4)
            r4 = 58
            if (r0 != r4) goto L8f
            okio.ByteString r0 = r6.getBytes$okio()
            byte r0 = r0.getByte(r5)
            if (r0 != r3) goto L8f
            okio.ByteString r6 = r6.getBytes$okio()
            byte r6 = r6.getByte(r2)
            char r6 = (char) r6
            r0 = 97
            if (r0 > r6) goto L85
            r0 = 123(0x7b, float:1.72E-43)
            if (r6 >= r0) goto L85
            goto L8d
        L85:
            r0 = 65
            if (r0 > r6) goto L8f
            r0 = 91
            if (r6 >= r0) goto L8f
        L8d:
            r6 = 3
            return r6
        L8f:
            return r1
    }

    private static final boolean startsWithVolumeLetterAndColon(okio.Buffer r5, okio.ByteString r6) {
            okio.ByteString r0 = okio.internal.Path.BACKSLASH
            boolean r6 = gg.l.a(r6, r0)
            r0 = 0
            if (r6 != 0) goto La
            return r0
        La:
            long r1 = r5.size()
            r3 = 2
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L15
            return r0
        L15:
            r1 = 1
            byte r6 = r5.getByte(r1)
            r1 = 58
            if (r6 == r1) goto L20
            return r0
        L20:
            r1 = 0
            byte r5 = r5.getByte(r1)
            char r5 = (char) r5
            r6 = 97
            if (r6 > r5) goto L30
            r6 = 123(0x7b, float:1.72E-43)
            if (r5 >= r6) goto L30
            goto L38
        L30:
            r6 = 65
            if (r6 > r5) goto L3a
            r6 = 91
            if (r5 >= r6) goto L3a
        L38:
            r5 = 1
            return r5
        L3a:
            return r0
    }

    public static final okio.Path toPath(okio.Buffer r16, boolean r17) {
            r0 = r16
            r0.getClass()
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r2 = 0
            r3 = 0
            r4 = r3
        Ld:
            okio.ByteString r5 = okio.internal.Path.SLASH
            r6 = 0
            boolean r5 = r0.rangeEquals(r6, r5)
            if (r5 != 0) goto L118
            okio.ByteString r5 = okio.internal.Path.BACKSLASH
            boolean r8 = r0.rangeEquals(r6, r5)
            if (r8 == 0) goto L21
            goto L118
        L21:
            r8 = 2
            r9 = 1
            if (r4 < r8) goto L2d
            boolean r5 = gg.l.a(r2, r5)
            if (r5 == 0) goto L2d
            r5 = r9
            goto L2e
        L2d:
            r5 = r3
        L2e:
            r10 = -1
            if (r5 == 0) goto L3c
            r2.getClass()
            r1.write(r2)
            r1.write(r2)
            goto L75
        L3c:
            if (r4 <= 0) goto L45
            r2.getClass()
            r1.write(r2)
            goto L75
        L45:
            okio.ByteString r4 = okio.internal.Path.ANY_SLASH
            long r12 = r0.indexOfElement(r4)
            if (r2 != 0) goto L60
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 != 0) goto L58
            java.lang.String r2 = okio.Path.DIRECTORY_SEPARATOR
            okio.ByteString r2 = toSlash(r2)
            goto L60
        L58:
            byte r2 = r0.getByte(r12)
            okio.ByteString r2 = toSlash(r2)
        L60:
            boolean r4 = startsWithVolumeLetterAndColon(r0, r2)
            if (r4 == 0) goto L75
            r14 = 2
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 != 0) goto L72
            r12 = 3
            r1.write(r0, r12)
            goto L75
        L72:
            r1.write(r0, r14)
        L75:
            long r12 = r1.size()
            int r4 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r4 <= 0) goto L7f
            r4 = r9
            goto L80
        L7f:
            r4 = r3
        L80:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L85:
            boolean r12 = r0.exhausted()
            if (r12 != 0) goto Lea
            okio.ByteString r12 = okio.internal.Path.ANY_SLASH
            long r12 = r0.indexOfElement(r12)
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 != 0) goto L9a
            okio.ByteString r12 = r0.readByteString()
            goto La1
        L9a:
            okio.ByteString r12 = r0.readByteString(r12)
            r0.readByte()
        La1:
            okio.ByteString r13 = okio.internal.Path.DOT_DOT
            boolean r14 = gg.l.a(r12, r13)
            if (r14 == 0) goto Ld6
            if (r4 == 0) goto Lb1
            boolean r14 = r8.isEmpty()
            if (r14 != 0) goto L85
        Lb1:
            if (r17 == 0) goto Ld2
            if (r4 != 0) goto Lc6
            boolean r14 = r8.isEmpty()
            if (r14 != 0) goto Ld2
            java.lang.Object r14 = tf.m.B1(r8)
            boolean r13 = gg.l.a(r14, r13)
            if (r13 == 0) goto Lc6
            goto Ld2
        Lc6:
            if (r5 == 0) goto Lce
            int r12 = r8.size()
            if (r12 == r9) goto L85
        Lce:
            tf.r.j1(r8)
            goto L85
        Ld2:
            r8.add(r12)
            goto L85
        Ld6:
            okio.ByteString r13 = okio.internal.Path.DOT
            boolean r13 = gg.l.a(r12, r13)
            if (r13 != 0) goto L85
            okio.ByteString r13 = okio.ByteString.EMPTY
            boolean r13 = gg.l.a(r12, r13)
            if (r13 != 0) goto L85
            r8.add(r12)
            goto L85
        Lea:
            int r0 = r8.size()
        Lee:
            if (r3 >= r0) goto L101
            if (r3 <= 0) goto Lf5
            r1.write(r2)
        Lf5:
            java.lang.Object r4 = r8.get(r3)
            okio.ByteString r4 = (okio.ByteString) r4
            r1.write(r4)
            int r3 = r3 + 1
            goto Lee
        L101:
            long r2 = r1.size()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L10e
            okio.ByteString r0 = okio.internal.Path.DOT
            r1.write(r0)
        L10e:
            okio.Path r0 = new okio.Path
            okio.ByteString r1 = r1.readByteString()
            r0.<init>(r1)
            return r0
        L118:
            byte r5 = r0.readByte()
            if (r2 != 0) goto L122
            okio.ByteString r2 = toSlash(r5)
        L122:
            int r4 = r4 + 1
            goto Ld
    }

    private static final okio.ByteString toSlash(byte r1) {
            r0 = 47
            if (r1 == r0) goto L16
            r0 = 92
            if (r1 != r0) goto Lb
            okio.ByteString r1 = okio.internal.Path.BACKSLASH
            return r1
        Lb:
            java.lang.String r0 = "not a directory separator: "
            java.lang.String r1 = eh.a.l(r1, r0)
            j8.o.t(r1)
            r1 = 0
            return r1
        L16:
            okio.ByteString r1 = okio.internal.Path.SLASH
            return r1
    }

    private static final okio.ByteString toSlash(java.lang.String r1) {
            java.lang.String r0 = "/"
            boolean r0 = gg.l.a(r1, r0)
            if (r0 == 0) goto Lb
            okio.ByteString r1 = okio.internal.Path.SLASH
            return r1
        Lb:
            java.lang.String r0 = "\\"
            boolean r0 = gg.l.a(r1, r0)
            if (r0 == 0) goto L16
            okio.ByteString r1 = okio.internal.Path.BACKSLASH
            return r1
        L16:
            java.lang.String r0 = "not a directory separator: "
            java.lang.String r1 = wb.en.g(r0, r1)
            j8.o.t(r1)
            r1 = 0
            return r1
    }
}
