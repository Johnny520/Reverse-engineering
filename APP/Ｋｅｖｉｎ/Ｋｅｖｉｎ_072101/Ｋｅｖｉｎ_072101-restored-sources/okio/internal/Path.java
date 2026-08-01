package okio.internal;

/* JADX INFO: renamed from: okio.internal.-Path, reason: invalid class name */
/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0000\u001a\u0015\u0010\u0014\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0080\b\u001a\u0017\u0010\u0016\u001a\u00020\u0017*\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0018H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\r*\u00020\u000eH\u0080\b\u001a\r\u0010\u001a\u001a\u00020\u0017*\u00020\u000eH\u0080\b\u001a\r\u0010\u001b\u001a\u00020\u0017*\u00020\u000eH\u0080\b\u001a\r\u0010\u001c\u001a\u00020\u0017*\u00020\u000eH\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u000eH\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u0001*\u00020\u000eH\u0080\b\u001a\r\u0010 \u001a\u00020\u000e*\u00020\u000eH\u0080\b\u001a\u000f\u0010!\u001a\u0004\u0018\u00010\u000e*\u00020\u000eH\u0080\b\u001a\u0015\u0010\"\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0080\b\u001a\u001d\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0017H\u0080\b\u001a\u001d\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0017H\u0080\b\u001a\u001d\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0017H\u0080\b\u001a\u001c\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0017H\u0000\u001a\u000f\u0010'\u001a\u0004\u0018\u00010\u000e*\u00020\u000eH\u0080\b\u001a\u0013\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001e0)*\u00020\u000eH\u0080\b\u001a\u0013\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010)*\u00020\u000eH\u0080\b\u001a\u0014\u0010+\u001a\u00020\u000e*\u00020\u001e2\u0006\u0010%\u001a\u00020\u0017H\u0000\u001a\r\u0010,\u001a\u00020\u001e*\u00020\u000eH\u0080\b\u001a\u0014\u0010-\u001a\u0004\u0018\u00010.*\u00020\u000eH\u0080\b¢\u0006\u0002\u0010/\u001a\f\u00100\u001a\u00020\u0017*\u00020\u000eH\u0002\u001a\f\u00101\u001a\u00020\r*\u00020\u000eH\u0002\u001a\u0014\u00102\u001a\u00020\u0017*\u00020&2\u0006\u0010\u0011\u001a\u00020\u0001H\u0002\u001a\u0014\u00103\u001a\u00020\u000e*\u00020&2\u0006\u0010%\u001a\u00020\u0017H\u0000\u001a\f\u00104\u001a\u00020\u0001*\u000205H\u0002\u001a\f\u00104\u001a\u00020\u0001*\u00020\u001eH\u0002\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0016\u0010\b\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003\"\u0016\u0010\n\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003\"\u0018\u0010\f\u001a\u00020\r*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00066"}, m115d2 = {"ANY_SLASH", "Lokio/ByteString;", "getANY_SLASH$annotations", "()V", "BACKSLASH", "getBACKSLASH$annotations", "DOT", "getDOT$annotations", "DOT_DOT", "getDOT_DOT$annotations", "SLASH", "getSLASH$annotations", "indexOfLastSlash", "", "Lokio/Path;", "getIndexOfLastSlash", "(Lokio/Path;)I", "slash", "getSlash", "(Lokio/Path;)Lokio/ByteString;", "commonCompareTo", "other", "commonEquals", "", "", "commonHashCode", "commonIsAbsolute", "commonIsRelative", "commonIsRoot", "commonName", "", "commonNameBytes", "commonNormalized", "commonParent", "commonRelativeTo", "commonResolve", "child", "normalize", "Lokio/Buffer;", "commonRoot", "commonSegments", "", "commonSegmentsBytes", "commonToPath", "commonToString", "commonVolumeLetter", "", "(Lokio/Path;)Ljava/lang/Character;", "lastSegmentIsDotDot", "rootLength", "startsWithVolumeLetterAndColon", "toPath", "toSlash", "", "okio"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class Path {
    private static final okio.ByteString ANY_SLASH = null;
    private static final okio.ByteString BACKSLASH = null;
    private static final okio.ByteString DOT = null;
    private static final okio.ByteString DOT_DOT = null;
    private static final okio.ByteString SLASH = null;

    static {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "/"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okio.internal.Path.SLASH = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "\\"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okio.internal.Path.BACKSLASH = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "/\\"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okio.internal.Path.ANY_SLASH = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "."
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okio.internal.Path.DOT = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
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

    public static final /* synthetic */ int access$getIndexOfLastSlash(okio.Path r1) {
            int r0 = getIndexOfLastSlash(r1)
            return r0
    }

    public static final /* synthetic */ okio.ByteString access$getSLASH$p() {
            okio.ByteString r0 = okio.internal.Path.SLASH
            return r0
    }

    public static final /* synthetic */ okio.ByteString access$getSlash(okio.Path r1) {
            okio.ByteString r0 = getSlash(r1)
            return r0
    }

    public static final /* synthetic */ boolean access$lastSegmentIsDotDot(okio.Path r1) {
            boolean r0 = lastSegmentIsDotDot(r1)
            return r0
    }

    public static final /* synthetic */ int access$rootLength(okio.Path r1) {
            int r0 = rootLength(r1)
            return r0
    }

    public static final /* synthetic */ okio.ByteString access$toSlash(java.lang.String r1) {
            okio.ByteString r0 = toSlash(r1)
            return r0
    }

    public static final int commonCompareTo(okio.Path r3, okio.Path r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            okio.ByteString r1 = r3.getBytes$okio()
            okio.ByteString r2 = r4.getBytes$okio()
            int r1 = r1.compareTo2(r2)
            return r1
    }

    public static final boolean commonEquals(okio.Path r3, java.lang.Object r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            boolean r1 = r4 instanceof okio.Path
            if (r1 == 0) goto L1d
            r1 = r4
            okio.Path r1 = (okio.Path) r1
            okio.ByteString r1 = r1.getBytes$okio()
            okio.ByteString r2 = r3.getBytes$okio()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L1d
            r1 = 1
            goto L1e
        L1d:
            r1 = 0
        L1e:
            return r1
    }

    public static final int commonHashCode(okio.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            okio.ByteString r1 = r2.getBytes$okio()
            int r1 = r1.hashCode()
            return r1
    }

    public static final boolean commonIsAbsolute(okio.Path r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = access$rootLength(r3)
            r2 = -1
            if (r1 == r2) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }

    public static final boolean commonIsRelative(okio.Path r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = access$rootLength(r3)
            r2 = -1
            if (r1 != r2) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }

    public static final boolean commonIsRoot(okio.Path r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = access$rootLength(r3)
            okio.ByteString r2 = r3.getBytes$okio()
            int r2 = r2.size()
            if (r1 != r2) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    public static final java.lang.String commonName(okio.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            okio.ByteString r1 = r2.nameBytes()
            java.lang.String r1 = r1.utf8()
            return r1
    }

    public static final okio.ByteString commonNameBytes(okio.Path r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            int r1 = access$getIndexOfLastSlash(r7)
            r2 = -1
            r3 = 2
            if (r1 == r2) goto L1c
            okio.ByteString r2 = r7.getBytes$okio()
            int r4 = r1 + 1
            r5 = 0
            r6 = 0
            okio.ByteString r2 = okio.ByteString.substring$default(r2, r4, r5, r3, r6)
            goto L33
        L1c:
            java.lang.Character r2 = r7.volumeLetter()
            if (r2 == 0) goto L2f
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            if (r2 != r3) goto L2f
            okio.ByteString r2 = okio.ByteString.EMPTY
            goto L33
        L2f:
            okio.ByteString r2 = r7.getBytes$okio()
        L33:
            return r2
    }

    public static final okio.Path commonNormalized(okio.Path r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            okio.Path$Companion r1 = okio.Path.Companion
            java.lang.String r2 = r4.toString()
            r3 = 1
            okio.Path r1 = r1.get(r2, r3)
            return r1
    }

    public static final okio.Path commonParent(okio.Path r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            okio.ByteString r1 = r8.getBytes$okio()
            okio.ByteString r2 = access$getDOT$p()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r2 = 0
            if (r1 != 0) goto Lc0
            okio.ByteString r1 = r8.getBytes$okio()
            okio.ByteString r3 = access$getSLASH$p()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto Lc0
            okio.ByteString r1 = r8.getBytes$okio()
            okio.ByteString r3 = access$getBACKSLASH$p()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto Lc0
            boolean r1 = access$lastSegmentIsDotDot(r8)
            if (r1 == 0) goto L39
            goto Lc0
        L39:
            int r1 = access$getIndexOfLastSlash(r8)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 != r3) goto L63
            java.lang.Character r6 = r8.volumeLetter()
            if (r6 == 0) goto L63
            okio.ByteString r3 = r8.getBytes$okio()
            int r3 = r3.size()
            r6 = 3
            if (r3 != r6) goto L55
            return r2
        L55:
            okio.Path r3 = new okio.Path
            okio.ByteString r7 = r8.getBytes$okio()
            okio.ByteString r2 = okio.ByteString.substring$default(r7, r4, r6, r5, r2)
            r3.<init>(r2)
            return r3
        L63:
            if (r1 != r5) goto L74
            okio.ByteString r6 = r8.getBytes$okio()
            okio.ByteString r7 = access$getBACKSLASH$p()
            boolean r6 = r6.startsWith(r7)
            if (r6 == 0) goto L74
            return r2
        L74:
            r6 = -1
            if (r1 != r6) goto L96
            java.lang.Character r7 = r8.volumeLetter()
            if (r7 == 0) goto L96
            okio.ByteString r6 = r8.getBytes$okio()
            int r6 = r6.size()
            if (r6 != r3) goto L88
            return r2
        L88:
            okio.Path r6 = new okio.Path
            okio.ByteString r7 = r8.getBytes$okio()
            okio.ByteString r2 = okio.ByteString.substring$default(r7, r4, r3, r5, r2)
            r6.<init>(r2)
            return r6
        L96:
            if (r1 != r6) goto La2
            okio.Path r2 = new okio.Path
            okio.ByteString r3 = access$getDOT$p()
            r2.<init>(r3)
            return r2
        La2:
            if (r1 != 0) goto Lb2
            okio.Path r3 = new okio.Path
            okio.ByteString r6 = r8.getBytes$okio()
            okio.ByteString r2 = okio.ByteString.substring$default(r6, r4, r5, r5, r2)
            r3.<init>(r2)
            return r3
        Lb2:
            okio.Path r3 = new okio.Path
            okio.ByteString r6 = r8.getBytes$okio()
            okio.ByteString r2 = okio.ByteString.substring$default(r6, r4, r1, r5, r2)
            r3.<init>(r2)
            return r3
        Lc0:
            return r2
    }

    public static final okio.Path commonRelativeTo(okio.Path r11, okio.Path r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            okio.Path r1 = r11.getRoot()
            okio.Path r2 = r12.getRoot()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            java.lang.String r2 = " and "
            if (r1 == 0) goto Le6
            java.util.List r1 = r11.getSegmentsBytes()
            java.util.List r3 = r12.getSegmentsBytes()
            r4 = 0
            int r5 = r1.size()
            int r6 = r3.size()
            int r5 = java.lang.Math.min(r5, r6)
        L30:
            if (r4 >= r5) goto L43
            java.lang.Object r6 = r1.get(r4)
            java.lang.Object r7 = r3.get(r4)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 == 0) goto L43
            int r4 = r4 + 1
            goto L30
        L43:
            r6 = 0
            r7 = 1
            if (r4 != r5) goto L63
            okio.ByteString r8 = r11.getBytes$okio()
            int r8 = r8.size()
            okio.ByteString r9 = r12.getBytes$okio()
            int r9 = r9.size()
            if (r8 != r9) goto L63
            okio.Path$Companion r2 = okio.Path.Companion
            java.lang.String r8 = "."
            r9 = 0
            okio.Path r2 = okio.Path.Companion.get$default(r2, r8, r6, r7, r9)
            return r2
        L63:
            int r8 = r3.size()
            java.util.List r8 = r3.subList(r4, r8)
            okio.ByteString r9 = access$getDOT_DOT$p()
            int r8 = r8.indexOf(r9)
            r9 = -1
            if (r8 != r9) goto L77
            goto L78
        L77:
            r7 = r6
        L78:
            if (r7 == 0) goto Lc0
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            okio.ByteString r7 = access$getSlash(r12)
            if (r7 != 0) goto L91
            okio.ByteString r7 = access$getSlash(r11)
            if (r7 != 0) goto L91
            java.lang.String r7 = okio.Path.DIRECTORY_SEPARATOR
            okio.ByteString r7 = access$toSlash(r7)
        L91:
            r8 = r4
            int r9 = r3.size()
        L96:
            if (r8 >= r9) goto La5
            okio.ByteString r10 = access$getDOT_DOT$p()
            r2.write(r10)
            r2.write(r7)
            int r8 = r8 + 1
            goto L96
        La5:
            r8 = r4
            int r9 = r1.size()
        Laa:
            if (r8 >= r9) goto Lbb
            java.lang.Object r10 = r1.get(r8)
            okio.ByteString r10 = (okio.ByteString) r10
            r2.write(r10)
            r2.write(r7)
            int r8 = r8 + 1
            goto Laa
        Lbb:
            okio.Path r6 = toPath(r2, r6)
            return r6
        Lc0:
            r6 = 0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Impossible relative path to resolve: "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r11)
            java.lang.StringBuilder r2 = r7.append(r2)
            java.lang.StringBuilder r2 = r2.append(r12)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r6.<init>(r2)
            throw r6
        Le6:
            r1 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Paths of different roots cannot be relative to each other: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r11)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.StringBuilder r2 = r2.append(r12)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final okio.Path commonResolve(okio.Path r5, java.lang.String r6, boolean r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.Buffer r1 = r1.writeUtf8(r6)
            r2 = r5
            r3 = 0
            r4 = 0
            okio.Path r4 = toPath(r1, r4)
            okio.Path r1 = commonResolve(r2, r4, r7)
            return r1
    }

    public static final okio.Path commonResolve(okio.Path r2, okio.Buffer r3, boolean r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = 0
            okio.Path r1 = toPath(r3, r1)
            okio.Path r1 = commonResolve(r2, r1, r4)
            return r1
    }

    public static final okio.Path commonResolve(okio.Path r5, okio.ByteString r6, boolean r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.Buffer r1 = r1.write(r6)
            r2 = r5
            r3 = 0
            r4 = 0
            okio.Path r4 = toPath(r1, r4)
            okio.Path r1 = commonResolve(r2, r4, r7)
            return r1
    }

    public static final okio.Path commonResolve(okio.Path r6, okio.Path r7, boolean r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = r7.isAbsolute()
            if (r0 != 0) goto L4e
            java.lang.Character r0 = r7.volumeLetter()
            if (r0 == 0) goto L17
            goto L4e
        L17:
            okio.ByteString r0 = getSlash(r6)
            if (r0 != 0) goto L29
            okio.ByteString r0 = getSlash(r7)
            if (r0 != 0) goto L29
            java.lang.String r0 = okio.Path.DIRECTORY_SEPARATOR
            okio.ByteString r0 = toSlash(r0)
        L29:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.ByteString r2 = r6.getBytes$okio()
            r1.write(r2)
            long r2 = r1.size()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L42
            r1.write(r0)
        L42:
            okio.ByteString r2 = r7.getBytes$okio()
            r1.write(r2)
            okio.Path r2 = toPath(r1, r8)
            return r2
        L4e:
            return r7
    }

    public static final okio.Path commonRoot(okio.Path r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            int r1 = access$rootLength(r5)
            r2 = -1
            if (r1 != r2) goto Lf
            r2 = 0
            goto L1d
        Lf:
            okio.Path r2 = new okio.Path
            okio.ByteString r3 = r5.getBytes$okio()
            r4 = 0
            okio.ByteString r3 = r3.substring(r4, r1)
            r2.<init>(r3)
        L1d:
            return r2
    }

    public static final java.util.List<java.lang.String> commonSegments(okio.Path r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = r10
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            int r4 = access$rootLength(r1)
            r5 = -1
            r6 = 92
            if (r4 != r5) goto L1a
            r4 = 0
            goto L30
        L1a:
            okio.ByteString r5 = r1.getBytes$okio()
            int r5 = r5.size()
            if (r4 >= r5) goto L30
            okio.ByteString r5 = r1.getBytes$okio()
            byte r5 = r5.getByte(r4)
            if (r5 != r6) goto L30
            int r4 = r4 + 1
        L30:
            r5 = r4
            okio.ByteString r7 = r1.getBytes$okio()
            int r7 = r7.size()
        L39:
            if (r5 >= r7) goto L64
            okio.ByteString r8 = r1.getBytes$okio()
            byte r8 = r8.getByte(r5)
            r9 = 47
            if (r8 == r9) goto L51
            okio.ByteString r8 = r1.getBytes$okio()
            byte r8 = r8.getByte(r5)
            if (r8 != r6) goto L61
        L51:
            r8 = r3
            java.util.Collection r8 = (java.util.Collection) r8
            okio.ByteString r9 = r1.getBytes$okio()
            okio.ByteString r9 = r9.substring(r4, r5)
            r8.add(r9)
            int r4 = r5 + 1
        L61:
            int r5 = r5 + 1
            goto L39
        L64:
            okio.ByteString r5 = r1.getBytes$okio()
            int r5 = r5.size()
            if (r4 >= r5) goto L84
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
            okio.ByteString r6 = r1.getBytes$okio()
            okio.ByteString r7 = r1.getBytes$okio()
            int r7 = r7.size()
            okio.ByteString r6 = r6.substring(r4, r7)
            r5.add(r6)
        L84:
            r1 = r3
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r4)
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            r4 = r1
            r5 = 0
            java.util.Iterator r6 = r4.iterator()
        L9d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb3
            java.lang.Object r7 = r6.next()
            r8 = r7
            okio.ByteString r8 = (okio.ByteString) r8
            r9 = 0
            java.lang.String r8 = r8.utf8()
            r3.add(r8)
            goto L9d
        Lb3:
            java.util.List r3 = (java.util.List) r3
            return r3
    }

    public static final java.util.List<okio.ByteString> commonSegmentsBytes(okio.Path r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            int r2 = access$rootLength(r8)
            r3 = -1
            r4 = 92
            if (r2 != r3) goto L18
            r2 = 0
            goto L2e
        L18:
            okio.ByteString r3 = r8.getBytes$okio()
            int r3 = r3.size()
            if (r2 >= r3) goto L2e
            okio.ByteString r3 = r8.getBytes$okio()
            byte r3 = r3.getByte(r2)
            if (r3 != r4) goto L2e
            int r2 = r2 + 1
        L2e:
            r3 = r2
            okio.ByteString r5 = r8.getBytes$okio()
            int r5 = r5.size()
        L37:
            if (r3 >= r5) goto L62
            okio.ByteString r6 = r8.getBytes$okio()
            byte r6 = r6.getByte(r3)
            r7 = 47
            if (r6 == r7) goto L4f
            okio.ByteString r6 = r8.getBytes$okio()
            byte r6 = r6.getByte(r3)
            if (r6 != r4) goto L5f
        L4f:
            r6 = r1
            java.util.Collection r6 = (java.util.Collection) r6
            okio.ByteString r7 = r8.getBytes$okio()
            okio.ByteString r7 = r7.substring(r2, r3)
            r6.add(r7)
            int r2 = r3 + 1
        L5f:
            int r3 = r3 + 1
            goto L37
        L62:
            okio.ByteString r3 = r8.getBytes$okio()
            int r3 = r3.size()
            if (r2 >= r3) goto L82
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            okio.ByteString r4 = r8.getBytes$okio()
            okio.ByteString r5 = r8.getBytes$okio()
            int r5 = r5.size()
            okio.ByteString r4 = r4.substring(r2, r5)
            r3.add(r4)
        L82:
            return r1
    }

    public static final okio.Path commonToPath(java.lang.String r1, boolean r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeUtf8(r1)
            okio.Path r0 = toPath(r0, r2)
            return r0
    }

    public static final java.lang.String commonToString(okio.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            okio.ByteString r1 = r2.getBytes$okio()
            java.lang.String r1 = r1.utf8()
            return r1
    }

    public static final java.lang.Character commonVolumeLetter(okio.Path r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            okio.ByteString r1 = r6.getBytes$okio()
            okio.ByteString r2 = access$getSLASH$p()
            r3 = 0
            r4 = 2
            r5 = 0
            int r1 = okio.ByteString.indexOf$default(r1, r2, r3, r4, r5)
            r2 = -1
            if (r1 == r2) goto L19
            return r5
        L19:
            okio.ByteString r1 = r6.getBytes$okio()
            int r1 = r1.size()
            if (r1 >= r4) goto L24
            return r5
        L24:
            okio.ByteString r1 = r6.getBytes$okio()
            r2 = 1
            byte r1 = r1.getByte(r2)
            r4 = 58
            if (r1 == r4) goto L32
            return r5
        L32:
            okio.ByteString r1 = r6.getBytes$okio()
            byte r1 = r1.getByte(r3)
            char r1 = (char) r1
            r4 = 97
            if (r4 > r1) goto L45
            r4 = 123(0x7b, float:1.72E-43)
            if (r1 >= r4) goto L45
            r4 = r2
            goto L46
        L45:
            r4 = r3
        L46:
            if (r4 != 0) goto L54
            r4 = 65
            if (r4 > r1) goto L51
            r4 = 91
            if (r1 >= r4) goto L51
            r3 = r2
        L51:
            if (r3 != 0) goto L54
            return r5
        L54:
            java.lang.Character r2 = java.lang.Character.valueOf(r1)
            return r2
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

    private static final int getIndexOfLastSlash(okio.Path r6) {
            okio.ByteString r0 = r6.getBytes$okio()
            okio.ByteString r1 = okio.internal.Path.SLASH
            r2 = 0
            r3 = 2
            r4 = 0
            int r0 = okio.ByteString.lastIndexOf$default(r0, r1, r2, r3, r4)
            r1 = -1
            if (r0 == r1) goto L11
            return r0
        L11:
            okio.ByteString r1 = r6.getBytes$okio()
            okio.ByteString r5 = okio.internal.Path.BACKSLASH
            int r1 = okio.ByteString.lastIndexOf$default(r1, r5, r2, r3, r4)
            return r1
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
            r1 = -1
            if (r0 == r1) goto L14
            okio.ByteString r4 = okio.internal.Path.SLASH
            goto L24
        L14:
            okio.ByteString r0 = r6.getBytes$okio()
            okio.ByteString r5 = okio.internal.Path.BACKSLASH
            int r0 = okio.ByteString.indexOf$default(r0, r5, r2, r3, r4)
            if (r0 == r1) goto L23
            okio.ByteString r4 = okio.internal.Path.BACKSLASH
            goto L24
        L23:
        L24:
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
            okio.ByteString r2 = r5.getBytes$okio()
            int r2 = r2.size()
            int r2 = r2 + (-3)
            okio.ByteString r4 = okio.internal.Path.BACKSLASH
            boolean r0 = r0.rangeEquals(r2, r4, r1, r3)
            if (r0 == 0) goto L48
            return r3
        L48:
            return r1
    }

    private static final int rootLength(okio.Path r7) {
            okio.ByteString r0 = r7.getBytes$okio()
            int r0 = r0.size()
            r1 = -1
            if (r0 != 0) goto Lc
            return r1
        Lc:
            okio.ByteString r0 = r7.getBytes$okio()
            r2 = 0
            byte r0 = r0.getByte(r2)
            r3 = 47
            r4 = 1
            if (r0 != r3) goto L1b
            return r4
        L1b:
            okio.ByteString r0 = r7.getBytes$okio()
            byte r0 = r0.getByte(r2)
            r3 = 92
            r5 = 2
            if (r0 != r3) goto L52
            okio.ByteString r0 = r7.getBytes$okio()
            int r0 = r0.size()
            if (r0 <= r5) goto L51
            okio.ByteString r0 = r7.getBytes$okio()
            byte r0 = r0.getByte(r4)
            if (r0 != r3) goto L51
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r2 = okio.internal.Path.BACKSLASH
            int r0 = r0.indexOf(r2, r5)
            if (r0 != r1) goto L50
            okio.ByteString r1 = r7.getBytes$okio()
            int r0 = r1.size()
        L50:
            return r0
        L51:
            return r4
        L52:
            okio.ByteString r0 = r7.getBytes$okio()
            int r0 = r0.size()
            if (r0 <= r5) goto L96
            okio.ByteString r0 = r7.getBytes$okio()
            byte r0 = r0.getByte(r4)
            r6 = 58
            if (r0 != r6) goto L96
            okio.ByteString r0 = r7.getBytes$okio()
            byte r0 = r0.getByte(r5)
            if (r0 != r3) goto L96
            okio.ByteString r0 = r7.getBytes$okio()
            byte r0 = r0.getByte(r2)
            char r0 = (char) r0
            r3 = 97
            if (r3 > r0) goto L85
            r3 = 123(0x7b, float:1.72E-43)
            if (r0 >= r3) goto L85
            r3 = r4
            goto L86
        L85:
            r3 = r2
        L86:
            if (r3 != 0) goto L94
            r3 = 65
            if (r3 > r0) goto L91
            r3 = 91
            if (r0 >= r3) goto L91
            r2 = r4
        L91:
            if (r2 != 0) goto L94
            return r1
        L94:
            r1 = 3
            return r1
        L96:
            return r1
    }

    private static final boolean startsWithVolumeLetterAndColon(okio.Buffer r6, okio.ByteString r7) {
            okio.ByteString r0 = okio.internal.Path.BACKSLASH
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            long r2 = r6.size()
            r4 = 2
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L15
            return r1
        L15:
            r2 = 1
            byte r0 = r6.getByte(r2)
            r2 = 58
            if (r0 == r2) goto L20
            return r1
        L20:
            r2 = 0
            byte r0 = r6.getByte(r2)
            char r0 = (char) r0
            r2 = 97
            r3 = 1
            if (r2 > r0) goto L32
            r2 = 123(0x7b, float:1.72E-43)
            if (r0 >= r2) goto L32
            r2 = r3
            goto L33
        L32:
            r2 = r1
        L33:
            if (r2 != 0) goto L42
            r2 = 65
            if (r2 > r0) goto L3f
            r2 = 91
            if (r0 >= r2) goto L3f
            r2 = r3
            goto L40
        L3f:
            r2 = r1
        L40:
            if (r2 == 0) goto L43
        L42:
            r1 = r3
        L43:
            return r1
    }

    public static final okio.Path toPath(okio.Buffer r16, boolean r17) {
            r0 = r16
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            r3 = 0
        Le:
            okio.ByteString r4 = okio.internal.Path.SLASH
            r5 = 0
            boolean r4 = r0.rangeEquals(r5, r4)
            if (r4 != 0) goto L130
            okio.ByteString r4 = okio.internal.Path.BACKSLASH
            boolean r4 = r0.rangeEquals(r5, r4)
            if (r4 == 0) goto L22
            goto L130
        L22:
            r4 = 2
            r7 = 0
            r8 = 1
            if (r3 < r4) goto L31
            okio.ByteString r4 = okio.internal.Path.BACKSLASH
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r4 == 0) goto L31
            r4 = r8
            goto L32
        L31:
            r4 = r7
        L32:
            r9 = -1
            if (r4 == 0) goto L40
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r2.write(r1)
            r2.write(r1)
            goto L7c
        L40:
            if (r3 <= 0) goto L49
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r2.write(r1)
            goto L7c
        L49:
            okio.ByteString r11 = okio.internal.Path.ANY_SLASH
            long r11 = r0.indexOfElement(r11)
            if (r1 != 0) goto L65
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 != 0) goto L5c
            java.lang.String r13 = okio.Path.DIRECTORY_SEPARATOR
            okio.ByteString r13 = toSlash(r13)
            goto L66
        L5c:
            byte r13 = r0.getByte(r11)
            okio.ByteString r13 = toSlash(r13)
            goto L66
        L65:
            r13 = r1
        L66:
            r1 = r13
            boolean r13 = startsWithVolumeLetterAndColon(r0, r1)
            if (r13 == 0) goto L7c
            r13 = 2
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L79
            r13 = 3
            r2.write(r0, r13)
            goto L7c
        L79:
            r2.write(r0, r13)
        L7c:
            long r11 = r2.size()
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 <= 0) goto L85
            r7 = r8
        L85:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List r11 = (java.util.List) r11
        L8c:
            boolean r12 = r16.exhausted()
            if (r12 != 0) goto L101
            okio.ByteString r12 = okio.internal.Path.ANY_SLASH
            long r12 = r0.indexOfElement(r12)
            r14 = 0
            int r15 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r15 != 0) goto La2
            okio.ByteString r14 = r16.readByteString()
            goto La9
        La2:
            okio.ByteString r14 = r0.readByteString(r12)
            r16.readByte()
        La9:
            okio.ByteString r15 = okio.internal.Path.DOT_DOT
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r14, r15)
            if (r15 == 0) goto Le8
            if (r7 == 0) goto Lb9
            boolean r15 = r11.isEmpty()
            if (r15 != 0) goto L8c
        Lb9:
            if (r17 == 0) goto Le2
            if (r7 != 0) goto Ld0
            boolean r15 = r11.isEmpty()
            if (r15 != 0) goto Le2
            java.lang.Object r15 = kotlin.collections.CollectionsKt.last(r11)
            okio.ByteString r9 = okio.internal.Path.DOT_DOT
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r9)
            if (r9 == 0) goto Ld0
            goto Le2
        Ld0:
            if (r4 == 0) goto Ldc
            int r9 = r11.size()
            if (r9 == r8) goto Ld9
            goto Ldc
        Ld9:
            r9 = -1
            goto L8c
        Ldc:
            kotlin.collections.CollectionsKt.removeLastOrNull(r11)
            r9 = -1
            goto L8c
        Le2:
            r11.add(r14)
            r9 = -1
            goto L8c
        Le8:
            okio.ByteString r9 = okio.internal.Path.DOT
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r14, r9)
            if (r9 != 0) goto Lfe
            okio.ByteString r9 = okio.ByteString.EMPTY
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r14, r9)
            if (r9 != 0) goto Lfe
            r11.add(r14)
            r9 = -1
            goto L8c
        Lfe:
            r9 = -1
            goto L8c
        L101:
            r8 = 0
            int r9 = r11.size()
        L106:
            if (r8 >= r9) goto L119
            if (r8 <= 0) goto L10d
            r2.write(r1)
        L10d:
            java.lang.Object r10 = r11.get(r8)
            okio.ByteString r10 = (okio.ByteString) r10
            r2.write(r10)
            int r8 = r8 + 1
            goto L106
        L119:
            long r8 = r2.size()
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 != 0) goto L126
            okio.ByteString r5 = okio.internal.Path.DOT
            r2.write(r5)
        L126:
            okio.Path r5 = new okio.Path
            okio.ByteString r6 = r2.readByteString()
            r5.<init>(r6)
            return r5
        L130:
            byte r4 = r16.readByte()
            if (r1 != 0) goto L13b
            okio.ByteString r5 = toSlash(r4)
            goto L13c
        L13b:
            r5 = r1
        L13c:
            r1 = r5
            int r3 = r3 + 1
            goto Le
    }

    private static final okio.ByteString toSlash(byte r3) {
            switch(r3) {
                case 47: goto L1f;
                case 92: goto L1c;
                default: goto L3;
            }
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not a directory separator: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1c:
            okio.ByteString r0 = okio.internal.Path.BACKSLASH
            goto L21
        L1f:
            okio.ByteString r0 = okio.internal.Path.SLASH
        L21:
            return r0
    }

    private static final okio.ByteString toSlash(java.lang.String r3) {
            java.lang.String r0 = "/"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto Lc
            okio.ByteString r0 = okio.internal.Path.SLASH
            goto L16
        Lc:
            java.lang.String r0 = "\\"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L17
            okio.ByteString r0 = okio.internal.Path.BACKSLASH
        L16:
            return r0
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not a directory separator: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
