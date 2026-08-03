package Yue;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4116 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C4116.C4117 f12664 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f12665 = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f12666 = "\"([^\"]*)\"";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.util.regex.Pattern f12667 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.util.regex.Pattern f12668 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String f12669;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String f12670;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String f12671;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String[] f12672;

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۥۨ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nMediaType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,181:1\n1#2:182\n37#3,2:183\n*S KotlinDebug\n*F\n+ 1 MediaType.kt\nokhttp3/MediaType$Companion\n*L\n148#1:183,2\n*E\n"})
    public static final class C4117 {
        public C4117() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C4117(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to extension function", replaceWith = @Yue.InterfaceC5313(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        @Yue.InterfaceC3421(name = "-deprecated_get")
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C4116 m16150(@Yue.InterfaceC4418 java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "mediaType"
                Yue.C3329.m13906(r2, r0)
                Yue.ۥۡ۠ۥۨ r2 = r1.m16152(r2)
                return r2
        }

        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to extension function", replaceWith = @Yue.InterfaceC5313(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        @Yue.InterfaceC3421(name = "-deprecated_parse")
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.C4116 m16151(@Yue.InterfaceC4418 java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "mediaType"
                Yue.C3329.m13906(r2, r0)
                Yue.ۥۡ۠ۥۨ r2 = r1.m16153(r2)
                return r2
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        @Yue.InterfaceC3421(name = "get")
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C4116 m16152(@Yue.InterfaceC4418 java.lang.String r14) {
                r13 = this;
                java.lang.String r0 = "<this>"
                Yue.C3329.m13906(r14, r0)
                java.util.regex.Pattern r0 = Yue.C4116.m16139()
                java.util.regex.Matcher r0 = r0.matcher(r14)
                boolean r1 = r0.lookingAt()
                r2 = 34
                if (r1 == 0) goto Lee
                r1 = 1
                java.lang.String r3 = r0.group(r1)
                java.lang.String r4 = "typeSubtype.group(1)"
                Yue.C3329.m13905(r3, r4)
                java.util.Locale r4 = java.util.Locale.US
                java.lang.String r5 = "US"
                Yue.C3329.m13905(r4, r5)
                java.lang.String r8 = r3.toLowerCase(r4)
                java.lang.String r3 = "this as java.lang.String).toLowerCase(locale)"
                Yue.C3329.m13905(r8, r3)
                r6 = 2
                java.lang.String r7 = r0.group(r6)
                java.lang.String r9 = "typeSubtype.group(2)"
                Yue.C3329.m13905(r7, r9)
                Yue.C3329.m13905(r4, r5)
                java.lang.String r9 = r7.toLowerCase(r4)
                Yue.C3329.m13905(r9, r3)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.regex.Pattern r4 = Yue.C4116.m16138()
                java.util.regex.Matcher r4 = r4.matcher(r14)
                int r0 = r0.end()
            L54:
                int r5 = r14.length()
                r7 = 0
                if (r0 >= r5) goto Ldc
                int r5 = r14.length()
                r4.region(r0, r5)
                boolean r5 = r4.lookingAt()
                if (r5 == 0) goto Lad
                java.lang.String r0 = r4.group(r1)
                if (r0 != 0) goto L73
                int r0 = r4.end()
                goto L54
            L73:
                java.lang.String r5 = r4.group(r6)
                if (r5 != 0) goto L7f
                r5 = 3
                java.lang.String r5 = r4.group(r5)
                goto La2
            L7f:
                java.lang.String r10 = "'"
                r11 = 0
                boolean r12 = Yue.C5988.m22315(r5, r10, r7, r6, r11)
                if (r12 == 0) goto La2
                boolean r7 = Yue.C5988.m22280(r5, r10, r7, r6, r11)
                if (r7 == 0) goto La2
                int r7 = r5.length()
                if (r7 <= r6) goto La2
                int r7 = r5.length()
                int r7 = r7 - r1
                java.lang.String r5 = r5.substring(r1, r7)
                java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
                Yue.C3329.m13905(r5, r7)
            La2:
                r3.add(r0)
                r3.add(r5)
                int r0 = r4.end()
                goto L54
            Lad:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Parameter is not formatted correctly: \""
                r1.append(r3)
                java.lang.String r0 = r14.substring(r0)
                java.lang.String r3 = "this as java.lang.String).substring(startIndex)"
                Yue.C3329.m13905(r0, r3)
                r1.append(r0)
                java.lang.String r0 = "\" for: \""
                r1.append(r0)
                r1.append(r14)
                r1.append(r2)
                java.lang.String r14 = r1.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r14 = r14.toString()
                r0.<init>(r14)
                throw r0
            Ldc:
                Yue.ۥۡ۠ۥۨ r0 = new Yue.ۥۡ۠ۥۨ
                java.lang.String[] r1 = new java.lang.String[r7]
                java.lang.Object[] r1 = r3.toArray(r1)
                r10 = r1
                java.lang.String[] r10 = (java.lang.String[]) r10
                r11 = 0
                r6 = r0
                r7 = r14
                r6.<init>(r7, r8, r9, r10, r11)
                return r0
            Lee:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "No subtype found for: \""
                r0.append(r1)
                r0.append(r14)
                r0.append(r2)
                java.lang.String r14 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r14 = r14.toString()
                r0.<init>(r14)
                throw r0
        }

        @Yue.InterfaceC3427
        @Yue.InterfaceC3421(name = "parse")
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Yue.C4116 m16153(@Yue.InterfaceC4418 java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                Yue.C3329.m13906(r2, r0)
                Yue.ۥۡ۠ۥۨ r2 = r1.m16152(r2)     // Catch: java.lang.IllegalArgumentException -> La
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }
    }

    static {
            Yue.ۥۡ۠ۥۨ$ۥ r0 = new Yue.ۥۡ۠ۥۨ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C4116.f12664 = r0
            java.lang.String r0 = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            Yue.C4116.f12667 = r0
            java.lang.String r0 = ";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            Yue.C4116.f12668 = r0
            return
    }

    public C4116(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            r0.<init>()
            r0.f12669 = r1
            r0.f12670 = r2
            r0.f12671 = r3
            r0.f12672 = r4
            return
    }

    public /* synthetic */ C4116(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String[] r4, Yue.C1769 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.regex.Pattern m16138() {
            java.util.regex.Pattern r0 = Yue.C4116.f12668
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.regex.Pattern m16139() {
            java.util.regex.Pattern r0 = Yue.C4116.f12667
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ java.nio.charset.Charset m16140(Yue.C4116 r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.nio.charset.Charset r0 = r0.m16146(r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    @Yue.InterfaceC3421(name = "get")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Yue.C4116 m16141(@Yue.InterfaceC4418 java.lang.String r1) {
            Yue.ۥۡ۠ۥۨ$ۥ r0 = Yue.C4116.f12664
            Yue.ۥۡ۠ۥۨ r1 = r0.m16152(r1)
            return r1
    }

    @Yue.InterfaceC3427
    @Yue.InterfaceC3421(name = "parse")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final Yue.C4116 m16142(@Yue.InterfaceC4418 java.lang.String r1) {
            Yue.ۥۡ۠ۥۨ$ۥ r0 = Yue.C4116.f12664
            Yue.ۥۡ۠ۥۨ r1 = r0.m16153(r1)
            return r1
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C4116
            if (r0 == 0) goto L12
            Yue.ۥۡ۠ۥۨ r2 = (Yue.C4116) r2
            java.lang.String r2 = r2.f12669
            java.lang.String r0 = r1.f12669
            boolean r2 = Yue.C3329.m13897(r2, r0)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f12669
            int r0 = r0.hashCode()
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f12669
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "subtype", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_subtype")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.String m16143() {
            r1 = this;
            java.lang.String r0 = r1.f12671
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "type", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_type")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.String m16144() {
            r1 = this;
            java.lang.String r0 = r1.f12670
            return r0
    }

    @Yue.InterfaceC3422
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.nio.charset.Charset m16145() {
            r2 = this;
            r0 = 0
            r1 = 1
            java.nio.charset.Charset r0 = m16140(r2, r0, r1, r0)
            return r0
    }

    @Yue.InterfaceC3422
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final java.nio.charset.Charset m16146(@Yue.InterfaceC4543 java.nio.charset.Charset r2) {
            r1 = this;
            java.lang.String r0 = "charset"
            java.lang.String r0 = r1.m16147(r0)
            if (r0 != 0) goto L9
            return r2
        L9:
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> Ld
        Ld:
            return r2
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final java.lang.String m16147(@Yue.InterfaceC4418 java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r5, r0)
            java.lang.String[] r0 = r4.f12672
            int r0 = r0.length
            int r0 = r0 + (-1)
            r1 = 2
            r2 = 0
            int r0 = Yue.C4968.m19395(r2, r0, r1)
            if (r0 < 0) goto L28
        L12:
            java.lang.String[] r1 = r4.f12672
            r1 = r1[r2]
            r3 = 1
            boolean r1 = Yue.C5988.m22281(r1, r5, r3)
            if (r1 == 0) goto L23
            java.lang.String[] r5 = r4.f12672
            int r2 = r2 + r3
            r5 = r5[r2]
            return r5
        L23:
            if (r2 == r0) goto L28
            int r2 = r2 + 2
            goto L12
        L28:
            r5 = 0
            return r5
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "subtype")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final java.lang.String m16148() {
            r1 = this;
            java.lang.String r0 = r1.f12671
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "type")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final java.lang.String m16149() {
            r1 = this;
            java.lang.String r0 = r1.f12670
            return r0
    }
}
