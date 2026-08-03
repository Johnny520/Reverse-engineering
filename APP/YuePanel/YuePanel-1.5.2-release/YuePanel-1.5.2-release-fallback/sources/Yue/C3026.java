package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,594:1\n1#2:595\n1183#3,3:596\n1183#3,3:599\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n16#1:596,3\n17#1:599,3\n*E\n"})
public final class C3026 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f9725 = "0123456789abcdef";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f9726 = "0123456789ABCDEF";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final int[] f9727 = null;

    static {
            r0 = 128(0x80, float:1.8E-43)
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r0) goto Le
            r4 = -1
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        Le:
            r0 = r2
            r3 = r0
        L10:
            java.lang.String r4 = "0123456789abcdef"
            int r5 = r4.length()
            if (r0 >= r5) goto L24
            char r4 = r4.charAt(r0)
            int r5 = r3 + 1
            r1[r4] = r3
            int r0 = r0 + 1
            r3 = r5
            goto L10
        L24:
            r0 = r2
        L25:
            java.lang.String r3 = "0123456789ABCDEF"
            int r4 = r3.length()
            if (r2 >= r4) goto L39
            char r3 = r3.charAt(r2)
            int r4 = r0 + 1
            r1[r3] = r0
            int r2 = r2 + 1
            r0 = r4
            goto L25
        L39:
            Yue.C3026.f9727 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final long m12787(long r4, int r6, int r7) {
            if (r6 <= 0) goto Lb
            long r0 = (long) r6
            long r4 = r4 * r0
            long r6 = (long) r7
            r2 = 1
            long r0 = r0 - r2
            long r6 = r6 * r0
            long r4 = r4 + r6
            return r4
        Lb:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Failed requirement."
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int m12788(java.lang.String r7, java.lang.String r8, int r9, int r10, java.lang.String r11) {
            int r0 = r8.length()
            int r0 = r0 + r9
            if (r0 > r10) goto L17
            int r5 = r8.length()
            r6 = 1
            r4 = 0
            r1 = r7
            r2 = r9
            r3 = r8
            boolean r1 = Yue.C5988.m22298(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L17
            return r0
        L17:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r11 = " \""
            r2.append(r11)
            r2.append(r8)
            java.lang.String r8 = "\" at index "
            r2.append(r8)
            r2.append(r9)
            java.lang.String r8 = ", but was "
            r2.append(r8)
            int r8 = Yue.C5196.m19521(r0, r10)
            java.lang.String r10 = "null cannot be cast to non-null type java.lang.String"
            Yue.C3329.m13904(r7, r10)
            java.lang.String r7 = r7.substring(r9, r8)
            java.lang.String r8 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r7, r8)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r1.<init>(r7)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m12789(java.lang.String r3, int r4, int r5, int r6, boolean r7) {
            int r0 = r5 - r4
            if (r7 == 0) goto L7
            if (r0 != r6) goto La
            goto L9
        L7:
            if (r0 > r6) goto La
        L9:
            return
        La:
            if (r7 == 0) goto Lf
            java.lang.String r7 = "exactly"
            goto L11
        Lf:
            java.lang.String r7 = "at most"
        L11:
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            Yue.C3329.m13904(r3, r1)
            java.lang.String r3 = r3.substring(r4, r5)
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r3, r5)
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected "
            r1.append(r2)
            r1.append(r7)
            r7 = 32
            r1.append(r7)
            r1.append(r6)
            java.lang.String r6 = " hexadecimal digits at index "
            r1.append(r6)
            r1.append(r4)
            java.lang.String r4 = ", but was "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = " of length "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            r5.<init>(r3)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m12790(java.lang.String r3, int r4, int r5) {
            char r0 = r3.charAt(r4)
            r1 = 13
            r2 = 10
            if (r0 != r1) goto L17
            int r0 = r4 + 1
            if (r0 >= r5) goto L1f
            char r3 = r3.charAt(r0)
            if (r3 != r2) goto L1f
            int r0 = r4 + 2
            goto L1f
        L17:
            char r5 = r3.charAt(r4)
            if (r5 != r2) goto L20
            int r0 = r4 + 1
        L1f:
            return r0
        L20:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected a new line at index "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", but was "
            r0.append(r1)
            char r3 = r3.charAt(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r5.<init>(r3)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m12791(java.lang.String r3, int r4) {
            char r0 = r3.charAt(r4)
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto Lf
            int[] r1 = Yue.C3026.f9727
            r0 = r1[r0]
            if (r0 < 0) goto Lf
            return r0
        Lf:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a hexadecimal digit at index "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", but was "
            r1.append(r2)
            char r3 = r3.charAt(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m12792(int r5, int r6, int r7, int r8, int r9, int r10, int r11) {
            if (r5 <= 0) goto L58
            int r0 = r5 + (-1)
            int r1 = r0 / r6
            int r2 = r6 + (-1)
            int r2 = r2 / r7
            int r3 = r5 % r6
            if (r3 != 0) goto Le
            goto Lf
        Le:
            r6 = r3
        Lf:
            int r6 = r6 + (-1)
            int r6 = r6 / r7
            int r2 = r2 * r1
            int r2 = r2 + r6
            int r0 = r0 - r1
            int r0 = r0 - r2
            long r6 = (long) r1
            long r1 = (long) r2
            long r3 = (long) r8
            long r1 = r1 * r3
            long r6 = r6 + r1
            long r0 = (long) r0
            long r8 = (long) r9
            long r0 = r0 * r8
            long r6 = r6 + r0
            long r8 = (long) r5
            long r0 = (long) r10
            r2 = 2
            long r0 = r0 + r2
            long r10 = (long) r11
            long r0 = r0 + r10
            long r8 = r8 * r0
            long r6 = r6 + r8
            Yue.ۥ۠ۥۣۨ r5 = new Yue.ۥ۠ۥۣۨ
            r8 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            r5.<init>(r8, r9)
            boolean r5 = Yue.C5196.m19582(r5, r6)
            if (r5 == 0) goto L39
            int r5 = (int) r6
            return r5
        L39:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "The resulting string length is too big: "
            r8.append(r9)
            long r6 = Yue.C6539.m25038(r6)
            java.lang.String r6 = Yue.C6539.m25085(r6)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r5.<init>(r6)
            throw r5
        L58:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Failed requirement."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m12793() {
            return
    }

    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final byte m12794(java.lang.String r1, int r2, int r3, Yue.C3027 r4) {
            r0 = 2
            long r1 = m12810(r1, r2, r3, r4, r0)
            int r1 = (int) r1
            byte r1 = (byte) r1
            return r1
    }

    @Yue.InterfaceC5792(version = "1.9")
    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final byte m12795(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 Yue.C3027 r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "format"
            Yue.C3329.m13906(r3, r0)
            int r0 = r2.length()
            r1 = 0
            byte r2 = m12794(r2, r1, r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ byte m12796(java.lang.String r0, int r1, int r2, Yue.C3027 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            Yue.ۥۣ۠ۤۤ$ۥ۟۟ r3 = Yue.C3027.f9728
            Yue.ۥۣ۠ۤۤ r3 = r3.m12865()
        L17:
            byte r0 = m12794(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ byte m12797(java.lang.String r0, Yue.C3027 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            Yue.ۥۣ۠ۤۤ$ۥ۟۟ r1 = Yue.C3027.f9728
            Yue.ۥۣ۠ۤۤ r1 = r1.m12865()
        La:
            byte r0 = m12795(r0, r1)
            return r0
    }

    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final byte[] m12798(java.lang.String r18, int r19, int r20, Yue.C3027 r21) {
            r0 = r18
            r1 = r19
            r2 = r20
            Yue.ۥ۟۟ۡۢ$ۥ r3 = Yue.AbstractC0052.f115
            int r4 = r18.length()
            r3.m398(r1, r2, r4)
            r3 = 0
            if (r1 != r2) goto L15
            byte[] r0 = new byte[r3]
            return r0
        L15:
            Yue.ۥۣ۠ۤۤ$ۥ۟ r4 = r21.m12833()
            int r12 = r4.m12849()
            int r13 = r4.m12848()
            java.lang.String r14 = r4.m12845()
            java.lang.String r15 = r4.m12847()
            java.lang.String r11 = r4.m12846()
            java.lang.String r4 = r4.m12850()
            int r5 = r2 - r1
            int r8 = r4.length()
            int r9 = r11.length()
            int r10 = r14.length()
            int r16 = r15.length()
            r6 = r12
            r7 = r13
            r3 = r11
            r11 = r16
            int r5 = m12816(r5, r6, r7, r8, r9, r10, r11)
            byte[] r6 = new byte[r5]
            r7 = 0
            r8 = 0
            r9 = 0
        L51:
            if (r1 >= r2) goto La0
            if (r8 != r12) goto L5c
            int r1 = m12790(r0, r1, r2)
            r8 = 0
        L5a:
            r9 = 0
            goto L6d
        L5c:
            if (r9 != r13) goto L65
            java.lang.String r9 = "group separator"
            int r1 = m12788(r0, r4, r1, r2, r9)
            goto L5a
        L65:
            if (r9 == 0) goto L6d
            java.lang.String r10 = "byte separator"
            int r1 = m12788(r0, r3, r1, r2, r10)
        L6d:
            r10 = 1
            int r8 = r8 + r10
            int r9 = r9 + r10
            java.lang.String r11 = "byte prefix"
            int r1 = m12788(r0, r14, r1, r2, r11)
            int r11 = r1 + 2
            int r11 = Yue.C5196.m19521(r11, r2)
            r16 = r3
            r3 = 2
            m12789(r0, r1, r11, r3, r10)
            int r10 = r7 + 1
            int r11 = r1 + 1
            int r17 = m12791(r0, r1)
            int r17 = r17 << 4
            int r1 = r1 + r3
            int r3 = m12791(r0, r11)
            r3 = r17 | r3
            byte r3 = (byte) r3
            r6[r7] = r3
            java.lang.String r3 = "byte suffix"
            int r1 = m12788(r0, r15, r1, r2, r3)
            r7 = r10
            r3 = r16
            goto L51
        La0:
            if (r7 != r5) goto La3
            goto Lac
        La3:
            byte[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String r0 = "copyOf(this, newSize)"
            Yue.C3329.m13905(r6, r0)
        Lac:
            return r6
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.9")
    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final byte[] m12799(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 Yue.C3027 r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "format"
            Yue.C3329.m13906(r3, r0)
            int r0 = r2.length()
            r1 = 0
            byte[] r2 = m12798(r2, r1, r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ byte[] m12800(java.lang.String r0, int r1, int r2, Yue.C3027 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            Yue.ۥۣ۠ۤۤ$ۥ۟۟ r3 = Yue.C3027.f9728
            Yue.ۥۣ۠ۤۤ r3 = r3.m12865()
        L17:
            byte[] r0 = m12798(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ byte[] m12801(java.lang.String r0, Yue.C3027 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            Yue.ۥۣ۠ۤۤ$ۥ۟۟ r1 = Yue.C3027.f9728
            Yue.ۥۣ۠ۤۤ r1 = r1.m12865()
        La:
            byte[] r0 = m12799(r0, r1)
            return r0
    }

    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int m12802(java.lang.String r1, int r2, int r3, Yue.C3027 r4) {
            r0 = 8
            long r1 = m12810(r1, r2, r3, r4, r0)
            int r1 = (int) r1
            return r1
    }

    @Yue.InterfaceC5792(version = "1.9")
    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int m12803(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 Yue.C3027 r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "format"
            Yue.C3329.m13906(r3, r0)
            int r0 = r2.length()
            r1 = 0
            int r2 = m12802(r2, r1, r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ int m12804(java.lang.String r0, int r1, int r2, Yue.C3027 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            Yue.ۥۣ۠ۤۤ$ۥ۟۟ r3 = Yue.C3027.f9728
            Yue.ۥۣ۠ۤۤ r3 = r3.m12865()
        L17:
            int r0 = m12802(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ int m12805(java.lang.String r0, Yue.C3027 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            Yue.ۥۣ۠ۤۤ$ۥ۟۟ r1 = Yue.C3027.f9728
            Yue.ۥۣ۠ۤۤ r1 = r1.m12865()
        La:
            int r0 = m12803(r0, r1)
            return r0
    }

    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final long m12806(java.lang.String r1, int r2, int r3, Yue.C3027 r4) {
            r0 = 16
            long r1 = m12810(r1, r2, r3, r4, r0)
            return r1
    }

    @Yue.InterfaceC5792(version = "1.9")
    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final long m12807(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 Yue.C3027 r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "format"
            Yue.C3329.m13906(r3, r0)
            int r0 = r2.length()
            r1 = 0
            long r2 = m12806(r2, r1, r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ long m12808(java.lang.String r0, int r1, int r2, Yue.C3027 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            Yue.ۥۣ۠ۤۤ$ۥ۟۟ r3 = Yue.C3027.f9728
            Yue.ۥۣ۠ۤۤ r3 = r3.m12865()
        L17:
            long r0 = m12806(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static /* synthetic */ long m12809(java.lang.String r0, Yue.C3027 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            Yue.ۥۣ۠ۤۤ$ۥ۟۟ r1 = Yue.C3027.f9728
            Yue.ۥۣ۠ۤۤ r1 = r1.m12865()
        La:
            long r0 = m12807(r0, r1)
            return r0
    }

    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final long m12810(java.lang.String r3, int r4, int r5, Yue.C3027 r6, int r7) {
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r3.length()
            r0.m398(r4, r5, r1)
            Yue.ۥۣ۠ۤۤ$ۥ۟۟۟ r0 = r6.m12834()
            java.lang.String r0 = r0.m12869()
            Yue.ۥۣ۠ۤۤ$ۥ۟۟۟ r6 = r6.m12834()
            java.lang.String r6 = r6.m12871()
            int r1 = r0.length()
            int r2 = r6.length()
            int r1 = r1 + r2
            int r2 = r5 - r4
            if (r1 >= r2) goto L4b
            java.lang.String r1 = "prefix"
            int r4 = m12788(r3, r0, r4, r5, r1)
            int r0 = r6.length()
            int r0 = r5 - r0
            java.lang.String r1 = "suffix"
            m12788(r3, r6, r0, r5, r1)
            r5 = 0
            m12789(r3, r4, r0, r7, r5)
            r5 = 0
        L3d:
            if (r4 >= r0) goto L4a
            r7 = 4
            long r5 = r5 << r7
            int r7 = m12791(r3, r4)
            long r1 = (long) r7
            long r5 = r5 | r1
            int r4 = r4 + 1
            goto L3d
        L4a:
            return r5
        L4b:
            java.lang.NumberFormatException r7 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a hexadecimal number with prefix \""
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "\" and suffix \""
            r1.append(r0)
            r1.append(r6)
            java.lang.String r6 = "\", but was "
            r1.append(r6)
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.String"
            Yue.C3329.m13904(r3, r6)
            java.lang.String r3 = r3.substring(r4, r5)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r3, r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r7.<init>(r3)
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static /* synthetic */ long m12811(java.lang.String r0, int r1, int r2, Yue.C3027 r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L5
            r1 = 0
        L5:
            r5 = r5 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            long r0 = m12810(r0, r1, r2, r3, r4)
            return r0
    }

    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final short m12812(java.lang.String r1, int r2, int r3, Yue.C3027 r4) {
            r0 = 4
            long r1 = m12810(r1, r2, r3, r4, r0)
            int r1 = (int) r1
            short r1 = (short) r1
            return r1
    }

    @Yue.InterfaceC5792(version = "1.9")
    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final short m12813(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 Yue.C3027 r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "format"
            Yue.C3329.m13906(r3, r0)
            int r0 = r2.length()
            r1 = 0
            short r2 = m12812(r2, r1, r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static /* synthetic */ short m12814(java.lang.String r0, int r1, int r2, Yue.C3027 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            Yue.ۥۣ۠ۤۤ$ۥ۟۟ r3 = Yue.C3027.f9728
            Yue.ۥۣ۠ۤۤ r3 = r3.m12865()
        L17:
            short r0 = m12812(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ short m12815(java.lang.String r0, Yue.C3027 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            Yue.ۥۣ۠ۤۤ$ۥ۟۟ r1 = Yue.C3027.f9728
            Yue.ۥۣ۠ۤۤ r1 = r1.m12865()
        La:
            short r0 = m12813(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int m12816(int r17, int r18, int r19, int r20, int r21, int r22, int r23) {
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            if (r0 <= 0) goto L64
            r5 = r22
            long r5 = (long) r5
            r7 = 2
            long r5 = r5 + r7
            r7 = r23
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = m12787(r5, r2, r4)
            if (r1 > r2) goto L21
            long r9 = m12787(r5, r1, r4)
            goto L32
        L21:
            int r9 = r1 / r2
            long r9 = m12787(r7, r9, r3)
            int r11 = r1 % r2
            if (r11 == 0) goto L32
            long r12 = (long) r3
            long r9 = r9 + r12
            long r11 = m12787(r5, r11, r4)
            long r9 = r9 + r11
        L32:
            long r11 = (long) r0
            r0 = 1
            long r13 = m12830(r11, r9, r0)
            r15 = 1
            long r9 = r9 + r15
            long r9 = r9 * r13
            long r11 = r11 - r9
            long r9 = m12830(r11, r7, r3)
            long r0 = (long) r3
            long r7 = r7 + r0
            long r7 = r7 * r9
            long r11 = r11 - r7
            long r0 = m12830(r11, r5, r4)
            long r3 = (long) r4
            long r5 = r5 + r3
            long r5 = r5 * r0
            long r11 = r11 - r5
            r3 = 0
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 <= 0) goto L57
            r4 = r18
            r3 = 1
            goto L5a
        L57:
            r3 = 0
            r4 = r18
        L5a:
            long r4 = (long) r4
            long r13 = r13 * r4
            long r4 = (long) r2
            long r9 = r9 * r4
            long r13 = r13 + r9
            long r13 = r13 + r0
            long r0 = (long) r3
            long r13 = r13 + r0
            int r0 = (int) r13
            return r0
        L64:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.9")
    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String m12817(byte r2, @Yue.InterfaceC4418 Yue.C3027 r3) {
            java.lang.String r0 = "format"
            Yue.C3329.m13906(r3, r0)
            long r0 = (long) r2
            r2 = 8
            java.lang.String r2 = m12829(r0, r3, r2)
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.9")
    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final java.lang.String m12818(int r2, @Yue.InterfaceC4418 Yue.C3027 r3) {
            java.lang.String r0 = "format"
            Yue.C3329.m13906(r3, r0)
            long r0 = (long) r2
            r2 = 32
            java.lang.String r2 = m12829(r0, r3, r2)
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.9")
    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final java.lang.String m12819(long r1, @Yue.InterfaceC4418 Yue.C3027 r3) {
            java.lang.String r0 = "format"
            Yue.C3329.m13906(r3, r0)
            r0 = 64
            java.lang.String r1 = m12829(r1, r3, r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.9")
    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final java.lang.String m12820(short r2, @Yue.InterfaceC4418 Yue.C3027 r3) {
            java.lang.String r0 = "format"
            Yue.C3329.m13906(r3, r0)
            long r0 = (long) r2
            r2 = 16
            java.lang.String r2 = m12829(r0, r3, r2)
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.9")
    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final java.lang.String m12821(@Yue.InterfaceC4418 byte[] r17, int r18, int r19, @Yue.InterfaceC4418 Yue.C3027 r20) {
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "<this>"
            Yue.C3329.m13906(r0, r3)
            java.lang.String r3 = "format"
            r4 = r20
            Yue.C3329.m13906(r4, r3)
            Yue.ۥ۟۟ۡۢ$ۥ r3 = Yue.AbstractC0052.f115
            int r5 = r0.length
            r3.m398(r1, r2, r5)
            if (r1 != r2) goto L1d
            java.lang.String r0 = ""
            return r0
        L1d:
            boolean r3 = r20.m12835()
            if (r3 == 0) goto L26
            java.lang.String r3 = "0123456789ABCDEF"
            goto L28
        L26:
            java.lang.String r3 = "0123456789abcdef"
        L28:
            Yue.ۥۣ۠ۤۤ$ۥ۟ r4 = r20.m12833()
            int r12 = r4.m12849()
            int r13 = r4.m12848()
            java.lang.String r14 = r4.m12845()
            java.lang.String r15 = r4.m12847()
            java.lang.String r11 = r4.m12846()
            java.lang.String r4 = r4.m12850()
            int r5 = r2 - r1
            int r8 = r4.length()
            int r9 = r11.length()
            int r10 = r14.length()
            int r16 = r15.length()
            r6 = r12
            r7 = r13
            r1 = r11
            r11 = r16
            int r5 = m12792(r5, r6, r7, r8, r9, r10, r11)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r8 = r18
            r9 = 0
            r10 = 0
        L68:
            if (r8 >= r2) goto La2
            r11 = r0[r8]
            r7 = r11 & 255(0xff, float:3.57E-43)
            if (r9 != r12) goto L78
            r9 = 10
            r6.append(r9)
            r9 = 0
        L76:
            r10 = 0
            goto L7e
        L78:
            if (r10 != r13) goto L7e
            r6.append(r4)
            goto L76
        L7e:
            if (r10 == 0) goto L83
            r6.append(r1)
        L83:
            r6.append(r14)
            int r7 = r7 >> 4
            char r7 = r3.charAt(r7)
            r6.append(r7)
            r7 = r11 & 15
            char r7 = r3.charAt(r7)
            r6.append(r7)
            r6.append(r15)
            int r10 = r10 + 1
            int r9 = r9 + 1
            int r8 = r8 + 1
            goto L68
        La2:
            int r0 = r6.length()
            if (r5 != r0) goto Lb2
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "StringBuilder(capacity).…builderAction).toString()"
            Yue.C3329.m13905(r0, r1)
            return r0
        Lb2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.9")
    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final java.lang.String m12822(@Yue.InterfaceC4418 byte[] r2, @Yue.InterfaceC4418 Yue.C3027 r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "format"
            Yue.C3329.m13906(r3, r0)
            int r0 = r2.length
            r1 = 0
            java.lang.String r2 = m12821(r2, r1, r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m12823(byte r0, Yue.C3027 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            Yue.ۥۣ۠ۤۤ$ۥ۟۟ r1 = Yue.C3027.f9728
            Yue.ۥۣ۠ۤۤ r1 = r1.m12865()
        La:
            java.lang.String r0 = m12817(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m12824(int r0, Yue.C3027 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            Yue.ۥۣ۠ۤۤ$ۥ۟۟ r1 = Yue.C3027.f9728
            Yue.ۥۣ۠ۤۤ r1 = r1.m12865()
        La:
            java.lang.String r0 = m12818(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m12825(long r0, Yue.C3027 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            Yue.ۥۣ۠ۤۤ$ۥ۟۟ r2 = Yue.C3027.f9728
            Yue.ۥۣ۠ۤۤ r2 = r2.m12865()
        La:
            java.lang.String r0 = m12819(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m12826(short r0, Yue.C3027 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            Yue.ۥۣ۠ۤۤ$ۥ۟۟ r1 = Yue.C3027.f9728
            Yue.ۥۣ۠ۤۤ r1 = r1.m12865()
        La:
            java.lang.String r0 = m12820(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m12827(byte[] r0, int r1, int r2, Yue.C3027 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto La
            int r2 = r0.length
        La:
            r4 = r4 & 4
            if (r4 == 0) goto L14
            Yue.ۥۣ۠ۤۤ$ۥ۟۟ r3 = Yue.C3027.f9728
            Yue.ۥۣ۠ۤۤ r3 = r3.m12865()
        L14:
            java.lang.String r0 = m12821(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m12828(byte[] r0, Yue.C3027 r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            Yue.ۥۣ۠ۤۤ$ۥ۟۟ r1 = Yue.C3027.f9728
            Yue.ۥۣ۠ۤۤ r1 = r1.m12865()
        La:
            java.lang.String r0 = m12822(r0, r1)
            return r0
    }

    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final java.lang.String m12829(long r9, Yue.C3027 r11, int r12) {
            r0 = r12 & 3
            if (r0 != 0) goto L65
            boolean r0 = r11.m12835()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "0123456789ABCDEF"
            goto Lf
        Ld:
            java.lang.String r0 = "0123456789abcdef"
        Lf:
            Yue.ۥۣ۠ۤۤ$ۥ۟۟۟ r1 = r11.m12834()
            java.lang.String r1 = r1.m12869()
            Yue.ۥۣ۠ۤۤ$ۥ۟۟۟ r2 = r11.m12834()
            java.lang.String r2 = r2.m12871()
            int r3 = r1.length()
            int r4 = r12 >> 2
            int r3 = r3 + r4
            int r4 = r2.length()
            int r3 = r3 + r4
            Yue.ۥۣ۠ۤۤ$ۥ۟۟۟ r11 = r11.m12834()
            boolean r11 = r11.m12870()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r1)
        L3b:
            if (r12 <= 0) goto L58
            int r12 = r12 + (-4)
            long r5 = r9 >> r12
            r7 = 15
            long r5 = r5 & r7
            int r1 = (int) r5
            if (r11 == 0) goto L4d
            if (r1 != 0) goto L4d
            if (r12 <= 0) goto L4d
            r11 = 1
            goto L4e
        L4d:
            r11 = 0
        L4e:
            if (r11 != 0) goto L3b
            char r1 = r0.charAt(r1)
            r4.append(r1)
            goto L3b
        L58:
            r4.append(r2)
            java.lang.String r9 = r4.toString()
            java.lang.String r10 = "StringBuilder(capacity).…builderAction).toString()"
            Yue.C3329.m13905(r9, r10)
            return r9
        L65:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Failed requirement."
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final long m12830(long r3, long r5, int r7) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L10
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto Lb
            goto L10
        Lb:
            long r0 = (long) r7
            long r3 = r3 + r0
            long r5 = r5 + r0
            long r0 = r3 / r5
        L10:
            return r0
    }
}
