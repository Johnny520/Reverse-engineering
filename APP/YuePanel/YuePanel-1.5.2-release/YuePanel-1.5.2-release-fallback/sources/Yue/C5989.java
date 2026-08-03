package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n79#1,22:1487\n113#1,5:1509\n130#1,5:1514\n79#1,22:1519\n107#1:1541\n79#1,22:1542\n113#1,5:1564\n124#1:1569\n113#1,5:1570\n130#1,5:1575\n141#1:1580\n130#1,5:1581\n79#1,22:1586\n113#1,5:1608\n130#1,5:1613\n12554#2,2:1618\n12554#2,2:1620\n288#3,2:1622\n288#3,2:1624\n1549#3:1627\n1620#3,3:1628\n1549#3:1631\n1620#3,3:1632\n1#4:1626\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n107#1:1487,22\n124#1:1509,5\n141#1:1514,5\n146#1:1519,22\n151#1:1541\n151#1:1542,22\n156#1:1564,5\n161#1:1569\n161#1:1570,5\n166#1:1575,5\n171#1:1580\n171#1:1581,5\n176#1:1586,22\n187#1:1608,5\n198#1:1613,5\n940#1:1618,2\n964#1:1620,2\n1003#1:1622,2\n1009#1:1624,2\n1309#1:1627\n1309#1:1628,3\n1334#1:1631\n1334#1:1632,3\n*E\n"})
public class C5989 extends Yue.C5988 {

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۢۥ$ۥ, reason: contains not printable characters */
    public static final class C5990 extends Yue.AbstractC1084 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f21760;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ java.lang.CharSequence f21761;

        public C5990(java.lang.CharSequence r1) {
                r0 = this;
                r0.f21761 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f21760
                java.lang.CharSequence r1 = r2.f21761
                int r1 = r1.length()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // Yue.AbstractC1084
        /* JADX INFO: renamed from: ۥ۟ */
        public char mo1983() {
                r3 = this;
                java.lang.CharSequence r0 = r3.f21761
                int r1 = r3.f21760
                int r2 = r1 + 1
                r3.f21760 = r2
                char r0 = r0.charAt(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۢۥ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
    public static final class C5991 extends Yue.AbstractC3560 implements Yue.InterfaceC2839<java.lang.CharSequence, java.lang.Integer, Yue.C4677<? extends java.lang.Integer, ? extends java.lang.Integer>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ char[] f21762;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ boolean f21763;

        public C5991(char[] r1, boolean r2) {
                r0 = this;
                r0.f21762 = r1
                r0.f21763 = r2
                r1 = 2
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ Yue.C4677<? extends java.lang.Integer, ? extends java.lang.Integer> invoke(java.lang.CharSequence r1, java.lang.Integer r2) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                Yue.ۥۣۡۦ۠ r1 = r0.m22499(r1, r2)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C4677<java.lang.Integer, java.lang.Integer> m22499(@Yue.InterfaceC4418 java.lang.CharSequence r3, int r4) {
                r2 = this;
                java.lang.String r0 = "$this$$receiver"
                Yue.C3329.m13906(r3, r0)
                char[] r0 = r2.f21762
                boolean r1 = r2.f21763
                int r3 = Yue.C5989.m22366(r3, r0, r4, r1)
                if (r3 >= 0) goto L11
                r3 = 0
                goto L1e
            L11:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 1
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                Yue.ۥۣۡۦ۠ r3 = Yue.C6456.m23777(r3, r4)
            L1e:
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۢۥ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
    public static final class C5992 extends Yue.AbstractC3560 implements Yue.InterfaceC2839<java.lang.CharSequence, java.lang.Integer, Yue.C4677<? extends java.lang.Integer, ? extends java.lang.Integer>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.util.List<java.lang.String> f21764;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ boolean f21765;

        public C5992(java.util.List<java.lang.String> r1, boolean r2) {
                r0 = this;
                r0.f21764 = r1
                r0.f21765 = r2
                r1 = 2
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2839
        public /* bridge */ /* synthetic */ Yue.C4677<? extends java.lang.Integer, ? extends java.lang.Integer> invoke(java.lang.CharSequence r1, java.lang.Integer r2) {
                r0 = this;
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                Yue.ۥۣۡۦ۠ r1 = r0.m22500(r1, r2)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C4677<java.lang.Integer, java.lang.Integer> m22500(@Yue.InterfaceC4418 java.lang.CharSequence r4, int r5) {
                r3 = this;
                java.lang.String r0 = "$this$$receiver"
                Yue.C3329.m13906(r4, r0)
                java.util.List<java.lang.String> r0 = r3.f21764
                boolean r1 = r3.f21765
                r2 = 0
                Yue.ۥۣۡۦ۠ r4 = Yue.C5989.m22333(r4, r0, r5, r1, r2)
                if (r4 == 0) goto L27
                java.lang.Object r5 = r4.m18540()
                java.lang.Object r4 = r4.m18541()
                java.lang.String r4 = (java.lang.String) r4
                int r4 = r4.length()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                Yue.ۥۣۡۦ۠ r4 = Yue.C6456.m23777(r5, r4)
                goto L28
            L27:
                r4 = 0
            L28:
                return r4
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۢۥ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C5993 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<Yue.C3279, java.lang.String> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.lang.CharSequence f21766;

        public C5993(java.lang.CharSequence r1) {
                r0 = this;
                r0.f21766 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.String invoke(Yue.C3279 r1) {
                r0 = this;
                Yue.ۥ۠ۥۣۨ r1 = (Yue.C3279) r1
                java.lang.String r1 = r0.m22501(r1)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.String m22501(@Yue.InterfaceC4418 Yue.C3279 r2) {
                r1 = this;
                java.lang.String r0 = "it"
                Yue.C3329.m13906(r2, r0)
                java.lang.CharSequence r0 = r1.f21766
                java.lang.String r2 = Yue.C5989.m22460(r0, r2)
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۢۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C5994 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<Yue.C3279, java.lang.String> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.lang.CharSequence f21767;

        public C5994(java.lang.CharSequence r1) {
                r0 = this;
                r0.f21767 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.String invoke(Yue.C3279 r1) {
                r0 = this;
                Yue.ۥ۠ۥۣۨ r1 = (Yue.C3279) r1
                java.lang.String r1 = r0.m22502(r1)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.String m22502(@Yue.InterfaceC4418 Yue.C3279 r2) {
                r1 = this;
                java.lang.String r0 = "it"
                Yue.C3329.m13906(r2, r0)
                java.lang.CharSequence r0 = r1.f21767
                java.lang.String r2 = Yue.C5989.m22460(r0, r2)
                return r2
        }
    }

    public C5989() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦ۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C4677 m22333(java.lang.CharSequence r0, java.util.Collection r1, int r2, boolean r3, boolean r4) {
            Yue.ۥۣۡۦ۠ r0 = m22350(r0, r1, r2, r3, r4)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۠ۦ۠, reason: contains not printable characters */
    public static final java.lang.String m22334(@Yue.InterfaceC4418 java.lang.CharSequence r5, @Yue.InterfaceC4418 java.lang.CharSequence r6, boolean r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r6, r0)
            int r0 = r5.length()
            int r1 = r6.length()
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            r2 = r1
        L18:
            if (r2 >= r0) goto L2b
            char r3 = r5.charAt(r2)
            char r4 = r6.charAt(r2)
            boolean r3 = Yue.C1097.m5877(r3, r4, r7)
            if (r3 == 0) goto L2b
            int r2 = r2 + 1
            goto L18
        L2b:
            int r7 = r2 + (-1)
            boolean r0 = m22356(r5, r7)
            if (r0 != 0) goto L39
            boolean r6 = m22356(r6, r7)
            if (r6 == 0) goto L3b
        L39:
            int r2 = r2 + (-1)
        L3b:
            java.lang.CharSequence r5 = r5.subSequence(r1, r2)
            java.lang.String r5 = r5.toString()
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۡ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22335(java.lang.CharSequence r0, java.lang.CharSequence r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r0 = m22334(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۠ۦۢ, reason: contains not printable characters */
    public static final java.lang.String m22336(@Yue.InterfaceC4418 java.lang.CharSequence r6, @Yue.InterfaceC4418 java.lang.CharSequence r7, boolean r8) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r7, r0)
            int r0 = r6.length()
            int r1 = r7.length()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
        L17:
            if (r3 >= r2) goto L32
            int r4 = r0 - r3
            int r4 = r4 + (-1)
            char r4 = r6.charAt(r4)
            int r5 = r1 - r3
            int r5 = r5 + (-1)
            char r5 = r7.charAt(r5)
            boolean r4 = Yue.C1097.m5877(r4, r5, r8)
            if (r4 == 0) goto L32
            int r3 = r3 + 1
            goto L17
        L32:
            int r8 = r0 - r3
            int r8 = r8 + (-1)
            boolean r8 = m22356(r6, r8)
            if (r8 != 0) goto L45
            int r1 = r1 - r3
            int r1 = r1 + (-1)
            boolean r7 = m22356(r7, r1)
            if (r7 == 0) goto L47
        L45:
            int r3 = r3 + (-1)
        L47:
            int r7 = r0 - r3
            java.lang.CharSequence r6 = r6.subSequence(r7, r0)
            java.lang.String r6 = r6.toString()
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۣ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22337(java.lang.CharSequence r0, java.lang.CharSequence r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r0 = m22336(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۤ, reason: contains not printable characters */
    public static final boolean m22338(@Yue.InterfaceC4418 java.lang.CharSequence r7, char r8, boolean r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r7
            r2 = r8
            r4 = r9
            int r7 = m22363(r1, r2, r3, r4, r5, r6)
            if (r7 < 0) goto L13
            r7 = 1
            goto L14
        L13:
            r7 = 0
        L14:
            return r7
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۠ۦۥ, reason: contains not printable characters */
    public static final boolean m22339(java.lang.CharSequence r1, Yue.C5283 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "regex"
            Yue.C3329.m13906(r2, r0)
            boolean r1 = r2.m19946(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۦ, reason: contains not printable characters */
    public static final boolean m22340(@Yue.InterfaceC4418 java.lang.CharSequence r11, @Yue.InterfaceC4418 java.lang.CharSequence r12, boolean r13) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r11, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r12, r0)
            boolean r0 = r12 instanceof java.lang.String
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            r4 = r12
            java.lang.String r4 = (java.lang.String) r4
            r7 = 2
            r8 = 0
            r5 = 0
            r3 = r11
            r6 = r13
            int r11 = m22364(r3, r4, r5, r6, r7, r8)
            if (r11 < 0) goto L33
        L1e:
            r1 = r2
            goto L33
        L20:
            int r6 = r11.length()
            r9 = 16
            r10 = 0
            r5 = 0
            r8 = 0
            r3 = r11
            r4 = r12
            r7 = r13
            int r11 = m22362(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r11 < 0) goto L33
            goto L1e
        L33:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۧ, reason: contains not printable characters */
    public static /* synthetic */ boolean m22341(java.lang.CharSequence r0, char r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = m22338(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۨ, reason: contains not printable characters */
    public static /* synthetic */ boolean m22342(java.lang.CharSequence r0, java.lang.CharSequence r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = m22340(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧ, reason: contains not printable characters */
    public static final boolean m22343(@Yue.InterfaceC4543 java.lang.CharSequence r6, @Yue.InterfaceC4543 java.lang.CharSequence r7) {
            boolean r0 = r6 instanceof java.lang.String
            r1 = 1
            if (r0 == 0) goto L12
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L12
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            boolean r6 = Yue.C5988.m22281(r6, r7, r1)
            return r6
        L12:
            if (r6 != r7) goto L15
            return r1
        L15:
            r0 = 0
            if (r6 == 0) goto L3f
            if (r7 == 0) goto L3f
            int r2 = r6.length()
            int r3 = r7.length()
            if (r2 == r3) goto L25
            goto L3f
        L25:
            int r2 = r6.length()
            r3 = r0
        L2a:
            if (r3 >= r2) goto L3e
            char r4 = r6.charAt(r3)
            char r5 = r7.charAt(r3)
            boolean r4 = Yue.C1097.m5877(r4, r5, r1)
            if (r4 != 0) goto L3b
            return r0
        L3b:
            int r3 = r3 + 1
            goto L2a
        L3e:
            return r1
        L3f:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧ۟, reason: contains not printable characters */
    public static final boolean m22344(@Yue.InterfaceC4543 java.lang.CharSequence r6, @Yue.InterfaceC4543 java.lang.CharSequence r7) {
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto Ld
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto Ld
            boolean r6 = Yue.C3329.m13897(r6, r7)
            return r6
        Ld:
            r0 = 1
            if (r6 != r7) goto L11
            return r0
        L11:
            r1 = 0
            if (r6 == 0) goto L37
            if (r7 == 0) goto L37
            int r2 = r6.length()
            int r3 = r7.length()
            if (r2 == r3) goto L21
            goto L37
        L21:
            int r2 = r6.length()
            r3 = r1
        L26:
            if (r3 >= r2) goto L36
            char r4 = r6.charAt(r3)
            char r5 = r7.charAt(r3)
            if (r4 == r5) goto L33
            return r1
        L33:
            int r3 = r3 + 1
            goto L26
        L36:
            return r0
        L37:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧ۠, reason: contains not printable characters */
    public static final boolean m22345(@Yue.InterfaceC4418 java.lang.CharSequence r1, char r2, boolean r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int r0 = r1.length()
            if (r0 <= 0) goto L1b
            int r0 = m22355(r1)
            char r1 = r1.charAt(r0)
            boolean r1 = Yue.C1097.m5877(r1, r2, r3)
            if (r1 == 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۡ, reason: contains not printable characters */
    public static final boolean m22346(@Yue.InterfaceC4418 java.lang.CharSequence r8, @Yue.InterfaceC4418 java.lang.CharSequence r9, boolean r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "suffix"
            Yue.C3329.m13906(r9, r0)
            if (r10 != 0) goto L20
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L20
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L20
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = (java.lang.String) r9
            r10 = 2
            r0 = 0
            r1 = 0
            boolean r8 = Yue.C5988.m22280(r8, r9, r1, r10, r0)
            return r8
        L20:
            int r0 = r8.length()
            int r1 = r9.length()
            int r3 = r0 - r1
            r5 = 0
            int r6 = r9.length()
            r2 = r8
            r4 = r9
            r7 = r10
            boolean r8 = m22399(r2, r3, r4, r5, r6, r7)
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۢ, reason: contains not printable characters */
    public static /* synthetic */ boolean m22347(java.lang.CharSequence r0, char r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = m22345(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ boolean m22348(java.lang.CharSequence r0, java.lang.CharSequence r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = m22346(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۠ۧۤ, reason: contains not printable characters */
    public static final Yue.C4677<java.lang.Integer, java.lang.String> m22349(@Yue.InterfaceC4418 java.lang.CharSequence r1, @Yue.InterfaceC4418 java.util.Collection<java.lang.String> r2, int r3, boolean r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "strings"
            Yue.C3329.m13906(r2, r0)
            r0 = 0
            Yue.ۥۣۡۦ۠ r1 = m22350(r1, r2, r3, r4, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۥ, reason: contains not printable characters */
    public static final Yue.C4677<java.lang.Integer, java.lang.String> m22350(java.lang.CharSequence r10, java.util.Collection<java.lang.String> r11, int r12, boolean r13, boolean r14) {
            r0 = 0
            if (r13 != 0) goto L2d
            int r1 = r11.size()
            r2 = 1
            if (r1 != r2) goto L2d
            java.lang.Object r11 = Yue.C1219.m6495(r11)
            java.lang.String r11 = (java.lang.String) r11
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            if (r14 != 0) goto L1d
            int r10 = m22364(r1, r2, r3, r4, r5, r6)
            goto L21
        L1d:
            int r10 = m22378(r1, r2, r3, r4, r5, r6)
        L21:
            if (r10 >= 0) goto L24
            goto L2c
        L24:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            Yue.ۥۣۡۦ۠ r0 = Yue.C6456.m23777(r10, r11)
        L2c:
            return r0
        L2d:
            r1 = 0
            if (r14 != 0) goto L3e
            Yue.ۥ۠ۥۣۨ r14 = new Yue.ۥ۠ۥۣۨ
            int r12 = Yue.C5196.m19514(r12, r1)
            int r1 = r10.length()
            r14.<init>(r12, r1)
            goto L4a
        L3e:
            int r14 = m22355(r10)
            int r12 = Yue.C5196.m19521(r12, r14)
            Yue.ۥ۠ۥۣۦ r14 = Yue.C5196.m19556(r12, r1)
        L4a:
            boolean r12 = r10 instanceof java.lang.String
            if (r12 == 0) goto L96
            int r12 = r14.m13737()
            int r1 = r14.m13738()
            int r14 = r14.m13739()
            if (r14 <= 0) goto L5e
            if (r12 <= r1) goto L62
        L5e:
            if (r14 >= 0) goto Ldc
            if (r1 > r12) goto Ldc
        L62:
            java.util.Iterator r8 = r11.iterator()
        L66:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r9 = r8.next()
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
            int r6 = r2.length()
            r3 = 0
            r5 = r12
            r7 = r13
            boolean r2 = Yue.C5988.m22298(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L66
            goto L85
        L84:
            r9 = r0
        L85:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L92
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            Yue.ۥۣۡۦ۠ r10 = Yue.C6456.m23777(r10, r9)
            return r10
        L92:
            if (r12 == r1) goto Ldc
            int r12 = r12 + r14
            goto L62
        L96:
            int r12 = r14.m13737()
            int r1 = r14.m13738()
            int r14 = r14.m13739()
            if (r14 <= 0) goto La6
            if (r12 <= r1) goto Laa
        La6:
            if (r14 >= 0) goto Ldc
            if (r1 > r12) goto Ldc
        Laa:
            java.util.Iterator r8 = r11.iterator()
        Lae:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lca
            java.lang.Object r9 = r8.next()
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            int r6 = r2.length()
            r4 = r10
            r5 = r12
            r7 = r13
            boolean r2 = m22399(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto Lae
            goto Lcb
        Lca:
            r9 = r0
        Lcb:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto Ld8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            Yue.ۥۣۡۦ۠ r10 = Yue.C6456.m23777(r10, r9)
            return r10
        Ld8:
            if (r12 == r1) goto Ldc
            int r12 = r12 + r14
            goto Laa
        Ldc:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۦ, reason: contains not printable characters */
    public static /* synthetic */ Yue.C4677 m22351(java.lang.CharSequence r1, java.util.Collection r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = r0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = r0
        Lb:
            Yue.ۥۣۡۦ۠ r1 = m22349(r1, r2, r3, r4)
            return r1
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۠ۧۧ, reason: contains not printable characters */
    public static final Yue.C4677<java.lang.Integer, java.lang.String> m22352(@Yue.InterfaceC4418 java.lang.CharSequence r1, @Yue.InterfaceC4418 java.util.Collection<java.lang.String> r2, int r3, boolean r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "strings"
            Yue.C3329.m13906(r2, r0)
            r0 = 1
            Yue.ۥۣۡۦ۠ r1 = m22350(r1, r2, r3, r4, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۨ, reason: contains not printable characters */
    public static /* synthetic */ Yue.C4677 m22353(java.lang.CharSequence r0, java.util.Collection r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L8
            int r2 = m22355(r0)
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            Yue.ۥۣۡۦ۠ r0 = m22352(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۠ۨ, reason: contains not printable characters */
    public static final Yue.C3279 m22354(@Yue.InterfaceC4418 java.lang.CharSequence r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
            int r2 = r2.length()
            int r2 = r2 + (-1)
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨ۟, reason: contains not printable characters */
    public static int m22355(@Yue.InterfaceC4418 java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int r1 = r1.length()
            int r1 = r1 + (-1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨ۠, reason: contains not printable characters */
    public static final boolean m22356(@Yue.InterfaceC4418 java.lang.CharSequence r3, int r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
            int r1 = r3.length()
            int r1 = r1 + (-2)
            r2 = 0
            r0.<init>(r2, r1)
            boolean r0 = r0.m13745(r4)
            if (r0 == 0) goto L2e
            char r0 = r3.charAt(r4)
            boolean r0 = java.lang.Character.isHighSurrogate(r0)
            if (r0 == 0) goto L2e
            r0 = 1
            int r4 = r4 + r0
            char r3 = r3.charAt(r4)
            boolean r3 = java.lang.Character.isLowSurrogate(r3)
            if (r3 == 0) goto L2e
            r2 = r0
        L2e:
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۠ۨۡ, reason: contains not printable characters */
    public static final <C extends java.lang.CharSequence & R, R> R m22357(C r1, Yue.InterfaceC2823<? extends R> r2) {
            java.lang.String r0 = "defaultValue"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = Yue.C5988.m22289(r1)
            if (r0 == 0) goto Lf
            java.lang.Object r1 = r2.invoke()
        Lf:
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۠ۨۢ, reason: contains not printable characters */
    public static final <C extends java.lang.CharSequence & R, R> R m22358(C r1, Yue.InterfaceC2823<? extends R> r2) {
            java.lang.String r0 = "defaultValue"
            Yue.C3329.m13906(r2, r0)
            int r0 = r1.length()
            if (r0 != 0) goto Lf
            java.lang.Object r1 = r2.invoke()
        Lf:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public static final int m22359(@Yue.InterfaceC4418 java.lang.CharSequence r2, char r3, int r4, boolean r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            if (r5 != 0) goto L13
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto Lc
            goto L13
        Lc:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.indexOf(r3, r4)
            goto L1d
        L13:
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r0[r1] = r3
            int r2 = m22366(r2, r0, r4, r5)
        L1d:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۤ, reason: contains not printable characters */
    public static final int m22360(@Yue.InterfaceC4418 java.lang.CharSequence r8, @Yue.InterfaceC4418 java.lang.String r9, int r10, boolean r11) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "string"
            Yue.C3329.m13906(r9, r0)
            if (r11 != 0) goto L18
            boolean r0 = r8 instanceof java.lang.String
            if (r0 != 0) goto L11
            goto L18
        L11:
            java.lang.String r8 = (java.lang.String) r8
            int r8 = r8.indexOf(r9, r10)
            goto L28
        L18:
            int r3 = r8.length()
            r6 = 16
            r7 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            int r8 = m22362(r0, r1, r2, r3, r4, r5, r6, r7)
        L28:
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۥ, reason: contains not printable characters */
    public static final int m22361(java.lang.CharSequence r6, java.lang.CharSequence r7, int r8, int r9, boolean r10, boolean r11) {
            r0 = 0
            if (r11 != 0) goto L15
            Yue.ۥ۠ۥۣۨ r11 = new Yue.ۥ۠ۥۣۨ
            int r8 = Yue.C5196.m19514(r8, r0)
            int r0 = r6.length()
            int r9 = Yue.C5196.m19521(r9, r0)
            r11.<init>(r8, r9)
            goto L25
        L15:
            int r11 = m22355(r6)
            int r8 = Yue.C5196.m19521(r8, r11)
            int r9 = Yue.C5196.m19514(r9, r0)
            Yue.ۥ۠ۥۣۦ r11 = Yue.C5196.m19556(r8, r9)
        L25:
            boolean r8 = r6 instanceof java.lang.String
            if (r8 == 0) goto L59
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L59
            int r8 = r11.m13737()
            int r9 = r11.m13738()
            int r11 = r11.m13739()
            if (r11 <= 0) goto L3d
            if (r8 <= r9) goto L41
        L3d:
            if (r11 >= 0) goto L81
            if (r9 > r8) goto L81
        L41:
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2
            int r4 = r7.length()
            r1 = 0
            r3 = r8
            r5 = r10
            boolean r0 = Yue.C5988.m22298(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L55
            return r8
        L55:
            if (r8 == r9) goto L81
            int r8 = r8 + r11
            goto L41
        L59:
            int r8 = r11.m13737()
            int r9 = r11.m13738()
            int r11 = r11.m13739()
            if (r11 <= 0) goto L69
            if (r8 <= r9) goto L6d
        L69:
            if (r11 >= 0) goto L81
            if (r9 > r8) goto L81
        L6d:
            int r4 = r7.length()
            r1 = 0
            r0 = r7
            r2 = r6
            r3 = r8
            r5 = r10
            boolean r0 = m22399(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L7d
            return r8
        L7d:
            if (r8 == r9) goto L81
            int r8 = r8 + r11
            goto L6d
        L81:
            r6 = -1
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۦ, reason: contains not printable characters */
    public static /* synthetic */ int m22362(java.lang.CharSequence r6, java.lang.CharSequence r7, int r8, int r9, boolean r10, boolean r11, int r12, java.lang.Object r13) {
            r12 = r12 & 16
            if (r12 == 0) goto L5
            r11 = 0
        L5:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            int r6 = m22361(r0, r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۧ, reason: contains not printable characters */
    public static /* synthetic */ int m22363(java.lang.CharSequence r1, char r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = r0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = r0
        Lb:
            int r1 = m22359(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۨ, reason: contains not printable characters */
    public static /* synthetic */ int m22364(java.lang.CharSequence r1, java.lang.String r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = r0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = r0
        Lb:
            int r1 = m22360(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static final int m22365(@Yue.InterfaceC4418 java.lang.CharSequence r1, @Yue.InterfaceC4418 java.util.Collection<java.lang.String> r2, int r3, boolean r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "strings"
            Yue.C3329.m13906(r2, r0)
            r0 = 0
            Yue.ۥۣۡۦ۠ r1 = m22350(r1, r2, r3, r4, r0)
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r1.m18540()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L1d
        L1c:
            r1 = -1
        L1d:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟, reason: contains not printable characters */
    public static final int m22366(@Yue.InterfaceC4418 java.lang.CharSequence r6, @Yue.InterfaceC4418 char[] r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "chars"
            Yue.C3329.m13906(r7, r0)
            if (r9 != 0) goto L1f
            int r0 = r7.length
            r1 = 1
            if (r0 != r1) goto L1f
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L1f
            char r7 = Yue.C0595.m3684(r7)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.indexOf(r7, r8)
            return r6
        L1f:
            Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
            r1 = 0
            int r8 = Yue.C5196.m19514(r8, r1)
            int r2 = m22355(r6)
            r0.<init>(r8, r2)
            Yue.ۥ۠ۥۣۥ r8 = r0.m13740()
        L31:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L4f
            int r0 = r8.mo2006()
            char r2 = r6.charAt(r0)
            int r3 = r7.length
            r4 = r1
        L41:
            if (r4 >= r3) goto L31
            char r5 = r7[r4]
            boolean r5 = Yue.C1097.m5877(r5, r2, r9)
            if (r5 == 0) goto L4c
            return r0
        L4c:
            int r4 = r4 + 1
            goto L41
        L4f:
            r6 = -1
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟۟, reason: contains not printable characters */
    public static /* synthetic */ int m22367(java.lang.CharSequence r1, java.util.Collection r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = r0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = r0
        Lb:
            int r1 = m22365(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟۠, reason: contains not printable characters */
    public static /* synthetic */ int m22368(java.lang.CharSequence r1, char[] r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = r0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = r0
        Lb:
            int r1 = m22366(r1, r2, r3, r4)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۡ, reason: contains not printable characters */
    public static final boolean m22369(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int r1 = r1.length()
            if (r1 != 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۢ, reason: contains not printable characters */
    public static final boolean m22370(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r1 = Yue.C5988.m22289(r1)
            r1 = r1 ^ 1
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥۣ۟ۡ۟, reason: contains not printable characters */
    public static final boolean m22371(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int r1 = r1.length()
            if (r1 <= 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۤ, reason: contains not printable characters */
    public static final boolean m22372(java.lang.CharSequence r0) {
            if (r0 == 0) goto Lb
            boolean r0 = Yue.C5988.m22289(r0)
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۥ, reason: contains not printable characters */
    public static final boolean m22373(java.lang.CharSequence r0) {
            if (r0 == 0) goto Lb
            int r0 = r0.length()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۦ, reason: contains not printable characters */
    public static final Yue.AbstractC1084 m22374(@Yue.InterfaceC4418 java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۢ۠ۢۥ$ۥ r0 = new Yue.ۥۢ۠ۢۥ$ۥ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟ۧ, reason: contains not printable characters */
    public static final int m22375(@Yue.InterfaceC4418 java.lang.CharSequence r2, char r3, int r4, boolean r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            if (r5 != 0) goto L13
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto Lc
            goto L13
        Lc:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.lastIndexOf(r3, r4)
            goto L1d
        L13:
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r0[r1] = r3
            int r2 = m22380(r2, r0, r4, r5)
        L1d:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟ۨ, reason: contains not printable characters */
    public static final int m22376(@Yue.InterfaceC4418 java.lang.CharSequence r6, @Yue.InterfaceC4418 java.lang.String r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "string"
            Yue.C3329.m13906(r7, r0)
            if (r9 != 0) goto L18
            boolean r0 = r6 instanceof java.lang.String
            if (r0 != 0) goto L11
            goto L18
        L11:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.lastIndexOf(r7, r8)
            goto L22
        L18:
            r3 = 0
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            int r6 = m22361(r0, r1, r2, r3, r4, r5)
        L22:
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠, reason: contains not printable characters */
    public static /* synthetic */ int m22377(java.lang.CharSequence r0, char r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L8
            int r2 = m22355(r0)
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            int r0 = m22375(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠۟, reason: contains not printable characters */
    public static /* synthetic */ int m22378(java.lang.CharSequence r0, java.lang.String r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L8
            int r2 = m22355(r0)
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            int r0 = m22376(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠۠, reason: contains not printable characters */
    public static final int m22379(@Yue.InterfaceC4418 java.lang.CharSequence r1, @Yue.InterfaceC4418 java.util.Collection<java.lang.String> r2, int r3, boolean r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "strings"
            Yue.C3329.m13906(r2, r0)
            r0 = 1
            Yue.ۥۣۡۦ۠ r1 = m22350(r1, r2, r3, r4, r0)
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r1.m18540()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L1d
        L1c:
            r1 = -1
        L1d:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠ۡ, reason: contains not printable characters */
    public static final int m22380(@Yue.InterfaceC4418 java.lang.CharSequence r4, @Yue.InterfaceC4418 char[] r5, int r6, boolean r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "chars"
            Yue.C3329.m13906(r5, r0)
            if (r7 != 0) goto L1f
            int r0 = r5.length
            r1 = 1
            if (r0 != r1) goto L1f
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L1f
            char r5 = Yue.C0595.m3684(r5)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.lastIndexOf(r5, r6)
            return r4
        L1f:
            int r0 = m22355(r4)
            int r6 = Yue.C5196.m19521(r6, r0)
        L27:
            r0 = -1
            if (r0 >= r6) goto L41
            char r0 = r4.charAt(r6)
            int r1 = r5.length
            r2 = 0
        L30:
            if (r2 >= r1) goto L3e
            char r3 = r5[r2]
            boolean r3 = Yue.C1097.m5877(r3, r0, r7)
            if (r3 == 0) goto L3b
            return r6
        L3b:
            int r2 = r2 + 1
            goto L30
        L3e:
            int r6 = r6 + (-1)
            goto L27
        L41:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ int m22381(java.lang.CharSequence r0, java.util.Collection r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L8
            int r2 = m22355(r0)
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            int r0 = m22379(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡ۠, reason: contains not printable characters */
    public static /* synthetic */ int m22382(java.lang.CharSequence r0, char[] r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L8
            int r2 = m22355(r0)
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            int r0 = m22380(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡ۠ۤ, reason: contains not printable characters */
    public static final Yue.InterfaceC5609<java.lang.String> m22383(@Yue.InterfaceC4418 java.lang.CharSequence r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "\n"
            java.lang.String r1 = "\r"
            java.lang.String r2 = "\r\n"
            java.lang.String[] r4 = new java.lang.String[]{r2, r0, r1}
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r3 = r9
            Yue.ۥۡۨۢ r9 = m22450(r3, r4, r5, r6, r7, r8)
            return r9
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡ۠ۥ, reason: contains not printable characters */
    public static final java.util.List<java.lang.String> m22384(@Yue.InterfaceC4418 java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۡۨۢ r1 = m22383(r1)
            java.util.List r1 = Yue.C5629.m21197(r1)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟ۡ۠ۦ, reason: contains not printable characters */
    public static final boolean m22385(java.lang.CharSequence r1, Yue.C5283 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "regex"
            Yue.C3329.m13906(r2, r0)
            boolean r1 = r2.m19953(r1)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟ۡ۠ۧ, reason: contains not printable characters */
    public static final java.lang.String m22386(java.lang.String r0) {
            if (r0 != 0) goto L4
            java.lang.String r0 = ""
        L4:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡ۠ۨ, reason: contains not printable characters */
    public static final java.lang.CharSequence m22387(@Yue.InterfaceC4418 java.lang.CharSequence r2, int r3, char r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            if (r3 < 0) goto L3c
            int r0 = r2.length()
            if (r3 > r0) goto L17
            r3 = 0
            int r4 = r2.length()
            java.lang.CharSequence r2 = r2.subSequence(r3, r4)
            return r2
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r2)
            Yue.ۥ۠ۥۣۨ r1 = new Yue.ۥ۠ۥۣۨ
            int r2 = r2.length()
            int r3 = r3 - r2
            r2 = 1
            r1.<init>(r2, r3)
            Yue.ۥ۠ۥۣۥ r2 = r1.m13740()
        L2e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3b
            r2.mo2006()
            r0.append(r4)
            goto L2e
        L3b:
            return r0
        L3c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Desired length "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = " is less than zero."
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۡ, reason: contains not printable characters */
    public static final java.lang.String m22388(@Yue.InterfaceC4418 java.lang.String r1, int r2, char r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.CharSequence r1 = m22387(r1, r2, r3)
            java.lang.String r1 = r1.toString()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡ۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.CharSequence m22389(java.lang.CharSequence r0, int r1, char r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 32
        L6:
            java.lang.CharSequence r0 = m22387(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡ۠, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22390(java.lang.String r0, int r1, char r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 32
        L6:
            java.lang.String r0 = m22388(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۡۡ, reason: contains not printable characters */
    public static final java.lang.CharSequence m22391(@Yue.InterfaceC4418 java.lang.CharSequence r3, int r4, char r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            if (r4 < 0) goto L3c
            int r0 = r3.length()
            if (r4 > r0) goto L17
            r4 = 0
            int r5 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r4, r5)
            return r3
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            Yue.ۥ۠ۥۣۨ r1 = new Yue.ۥ۠ۥۣۨ
            int r2 = r3.length()
            int r4 = r4 - r2
            r2 = 1
            r1.<init>(r2, r4)
            Yue.ۥ۠ۥۣۥ r4 = r1.m13740()
        L2b:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L38
            r4.mo2006()
            r0.append(r5)
            goto L2b
        L38:
            r0.append(r3)
            return r0
        L3c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Desired length "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = " is less than zero."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۡۢ, reason: contains not printable characters */
    public static java.lang.String m22392(@Yue.InterfaceC4418 java.lang.String r1, int r2, char r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.CharSequence r1 = m22391(r1, r2, r3)
            java.lang.String r1 = r1.toString()
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.CharSequence m22393(java.lang.CharSequence r0, int r1, char r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 32
        L6:
            java.lang.CharSequence r0 = m22391(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡۤ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22394(java.lang.String r0, int r1, char r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 32
        L6:
            java.lang.String r0 = m22392(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡۥ, reason: contains not printable characters */
    public static final Yue.InterfaceC5609<Yue.C3279> m22395(java.lang.CharSequence r2, char[] r3, int r4, boolean r5, int r6) {
            m22437(r6)
            Yue.ۥ۟ۨۨۢ r0 = new Yue.ۥ۟ۨۨۢ
            Yue.ۥۢ۠ۢۥ$ۥ۟ r1 = new Yue.ۥۢ۠ۢۥ$ۥ۟
            r1.<init>(r3, r5)
            r0.<init>(r2, r4, r6, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡۦ, reason: contains not printable characters */
    public static final Yue.InterfaceC5609<Yue.C3279> m22396(java.lang.CharSequence r2, java.lang.String[] r3, int r4, boolean r5, int r6) {
            m22437(r6)
            java.util.List r3 = Yue.C0586.m2116(r3)
            Yue.ۥ۟ۨۨۢ r0 = new Yue.ۥ۟ۨۨۢ
            Yue.ۥۢ۠ۢۥ$ۥ۟۟ r1 = new Yue.ۥۢ۠ۢۥ$ۥ۟۟
            r1.<init>(r3, r5)
            r0.<init>(r2, r4, r6, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡۧ, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC5609 m22397(java.lang.CharSequence r1, char[] r2, int r3, boolean r4, int r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r3 = r0
        L6:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            r4 = r0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            r5 = r0
        L10:
            Yue.ۥۡۨۢ r1 = m22395(r1, r2, r3, r4, r5)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡۨ, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC5609 m22398(java.lang.CharSequence r1, java.lang.String[] r2, int r3, boolean r4, int r5, int r6, java.lang.Object r7) {
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r3 = r0
        L6:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            r4 = r0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            r5 = r0
        L10:
            Yue.ۥۡۨۢ r1 = m22396(r1, r2, r3, r4, r5)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟ۡۢ, reason: contains not printable characters */
    public static final boolean m22399(@Yue.InterfaceC4418 java.lang.CharSequence r4, int r5, @Yue.InterfaceC4418 java.lang.CharSequence r6, int r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r6, r0)
            r0 = 0
            if (r7 < 0) goto L39
            if (r5 < 0) goto L39
            int r1 = r4.length()
            int r1 = r1 - r8
            if (r5 > r1) goto L39
            int r1 = r6.length()
            int r1 = r1 - r8
            if (r7 <= r1) goto L1e
            goto L39
        L1e:
            r1 = r0
        L1f:
            if (r1 >= r8) goto L37
            int r2 = r5 + r1
            char r2 = r4.charAt(r2)
            int r3 = r7 + r1
            char r3 = r6.charAt(r3)
            boolean r2 = Yue.C1097.m5877(r2, r3, r9)
            if (r2 != 0) goto L34
            return r0
        L34:
            int r1 = r1 + 1
            goto L1f
        L37:
            r4 = 1
            return r4
        L39:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۢ۟, reason: contains not printable characters */
    public static final java.lang.CharSequence m22400(@Yue.InterfaceC4418 java.lang.CharSequence r3, @Yue.InterfaceC4418 java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "prefix"
            Yue.C3329.m13906(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            boolean r0 = m22456(r3, r4, r2, r0, r1)
            if (r0 == 0) goto L20
            int r4 = r4.length()
            int r0 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            return r3
        L20:
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r2, r4)
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۢ۠, reason: contains not printable characters */
    public static java.lang.String m22401(@Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "prefix"
            Yue.C3329.m13906(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            boolean r0 = m22456(r3, r4, r2, r0, r1)
            if (r0 == 0) goto L20
            int r4 = r4.length()
            java.lang.String r3 = r3.substring(r4)
            java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
            Yue.C3329.m13905(r3, r4)
        L20:
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۢۡ, reason: contains not printable characters */
    public static final java.lang.CharSequence m22402(@Yue.InterfaceC4418 java.lang.CharSequence r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            if (r6 < r5) goto L32
            r0 = 0
            if (r6 != r5) goto L13
            int r5 = r4.length()
            java.lang.CharSequence r4 = r4.subSequence(r0, r5)
            return r4
        L13:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r4.length()
            int r3 = r6 - r5
            int r2 = r2 - r3
            r1.<init>(r2)
            r1.append(r4, r0, r5)
            java.lang.String r5 = "this.append(value, startIndex, endIndex)"
            Yue.C3329.m13905(r1, r5)
            int r0 = r4.length()
            r1.append(r4, r6, r0)
            Yue.C3329.m13905(r1, r5)
            return r1
        L32:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End index ("
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ") is less than start index ("
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = ")."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۢۢ, reason: contains not printable characters */
    public static final java.lang.CharSequence m22403(@Yue.InterfaceC4418 java.lang.CharSequence r1, @Yue.InterfaceC4418 Yue.C3279 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            java.lang.Integer r0 = r2.m13748()
            int r0 = r0.intValue()
            java.lang.Integer r2 = r2.m13747()
            int r2 = r2.intValue()
            int r2 = r2 + 1
            java.lang.CharSequence r1 = m22402(r1, r0, r2)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥۣ۟ۡۢ, reason: contains not printable characters */
    public static final java.lang.String m22404(java.lang.String r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.CharSequence r1 = m22402(r1, r2, r3)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟ۡۢۤ, reason: contains not printable characters */
    public static final java.lang.String m22405(java.lang.String r1, Yue.C3279 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            java.lang.CharSequence r1 = m22403(r1, r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۢۥ, reason: contains not printable characters */
    public static final java.lang.CharSequence m22406(@Yue.InterfaceC4418 java.lang.CharSequence r3, @Yue.InterfaceC4418 java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "suffix"
            Yue.C3329.m13906(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            boolean r0 = m22348(r3, r4, r2, r0, r1)
            if (r0 == 0) goto L21
            int r0 = r3.length()
            int r4 = r4.length()
            int r0 = r0 - r4
            java.lang.CharSequence r3 = r3.subSequence(r2, r0)
            return r3
        L21:
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r2, r4)
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۢۦ, reason: contains not printable characters */
    public static java.lang.String m22407(@Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "suffix"
            Yue.C3329.m13906(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            boolean r0 = m22348(r3, r4, r2, r0, r1)
            if (r0 == 0) goto L25
            int r0 = r3.length()
            int r4 = r4.length()
            int r0 = r0 - r4
            java.lang.String r3 = r3.substring(r2, r0)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r3, r4)
        L25:
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۢۧ, reason: contains not printable characters */
    public static final java.lang.CharSequence m22408(@Yue.InterfaceC4418 java.lang.CharSequence r1, @Yue.InterfaceC4418 java.lang.CharSequence r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "delimiter"
            Yue.C3329.m13906(r2, r0)
            java.lang.CharSequence r1 = m22409(r1, r2, r2)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۢۨ, reason: contains not printable characters */
    public static final java.lang.CharSequence m22409(@Yue.InterfaceC4418 java.lang.CharSequence r4, @Yue.InterfaceC4418 java.lang.CharSequence r5, @Yue.InterfaceC4418 java.lang.CharSequence r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "prefix"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "suffix"
            Yue.C3329.m13906(r6, r0)
            int r0 = r4.length()
            int r1 = r5.length()
            int r2 = r6.length()
            int r1 = r1 + r2
            r2 = 0
            if (r0 < r1) goto L3f
            r0 = 2
            r1 = 0
            boolean r3 = m22456(r4, r5, r2, r0, r1)
            if (r3 == 0) goto L3f
            boolean r0 = m22348(r4, r6, r2, r0, r1)
            if (r0 == 0) goto L3f
            int r5 = r5.length()
            int r0 = r4.length()
            int r6 = r6.length()
            int r0 = r0 - r6
            java.lang.CharSequence r4 = r4.subSequence(r5, r0)
            return r4
        L3f:
            int r5 = r4.length()
            java.lang.CharSequence r4 = r4.subSequence(r2, r5)
            return r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟ۡ, reason: contains not printable characters */
    public static java.lang.String m22410(@Yue.InterfaceC4418 java.lang.String r1, @Yue.InterfaceC4418 java.lang.CharSequence r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "delimiter"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r1 = m22411(r1, r2, r2)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟ۡ۟, reason: contains not printable characters */
    public static final java.lang.String m22411(@Yue.InterfaceC4418 java.lang.String r4, @Yue.InterfaceC4418 java.lang.CharSequence r5, @Yue.InterfaceC4418 java.lang.CharSequence r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "prefix"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "suffix"
            Yue.C3329.m13906(r6, r0)
            int r0 = r4.length()
            int r1 = r5.length()
            int r2 = r6.length()
            int r1 = r1 + r2
            if (r0 < r1) goto L43
            r0 = 0
            r1 = 2
            r2 = 0
            boolean r3 = m22456(r4, r5, r0, r1, r2)
            if (r3 == 0) goto L43
            boolean r0 = m22348(r4, r6, r0, r1, r2)
            if (r0 == 0) goto L43
            int r5 = r5.length()
            int r0 = r4.length()
            int r6 = r6.length()
            int r0 = r0 - r6
            java.lang.String r4 = r4.substring(r5, r0)
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r4, r5)
        L43:
            return r4
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥۣ۟ۡ۠, reason: contains not printable characters */
    public static final java.lang.String m22412(java.lang.CharSequence r1, Yue.C5283 r2, Yue.InterfaceC2825<? super Yue.InterfaceC3916, ? extends java.lang.CharSequence> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "regex"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r1 = r2.m19955(r1, r3)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥۣ۟ۡۡ, reason: contains not printable characters */
    public static final java.lang.String m22413(java.lang.CharSequence r1, Yue.C5283 r2, java.lang.String r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "regex"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "replacement"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r1 = r2.m19956(r1, r3)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟ۡۢ, reason: contains not printable characters */
    public static final java.lang.String m22414(@Yue.InterfaceC4418 java.lang.String r7, char r8, @Yue.InterfaceC4418 java.lang.String r9, @Yue.InterfaceC4418 java.lang.String r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "replacement"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            Yue.C3329.m13906(r10, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r8 = m22363(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L1d
            goto L2b
        L1d:
            int r8 = r8 + 1
            int r10 = r7.length()
            java.lang.CharSequence r7 = m22433(r7, r8, r10, r9)
            java.lang.String r10 = r7.toString()
        L2b:
            return r10
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣۣ۟ۡ, reason: contains not printable characters */
    public static final java.lang.String m22415(@Yue.InterfaceC4418 java.lang.String r7, @Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 java.lang.String r9, @Yue.InterfaceC4418 java.lang.String r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "delimiter"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "replacement"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            Yue.C3329.m13906(r10, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r0 = m22364(r1, r2, r3, r4, r5, r6)
            r1 = -1
            if (r0 != r1) goto L22
            goto L33
        L22:
            int r8 = r8.length()
            int r0 = r0 + r8
            int r8 = r7.length()
            java.lang.CharSequence r7 = m22433(r7, r0, r8, r9)
            java.lang.String r10 = r7.toString()
        L33:
            return r10
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡۤ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22416(java.lang.String r0, char r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = m22414(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡۥ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22417(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = m22415(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟ۡۦ, reason: contains not printable characters */
    public static final java.lang.String m22418(@Yue.InterfaceC4418 java.lang.String r7, char r8, @Yue.InterfaceC4418 java.lang.String r9, @Yue.InterfaceC4418 java.lang.String r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "replacement"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            Yue.C3329.m13906(r10, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r8 = m22377(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L1d
            goto L2b
        L1d:
            int r8 = r8 + 1
            int r10 = r7.length()
            java.lang.CharSequence r7 = m22433(r7, r8, r10, r9)
            java.lang.String r10 = r7.toString()
        L2b:
            return r10
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟ۡۧ, reason: contains not printable characters */
    public static final java.lang.String m22419(@Yue.InterfaceC4418 java.lang.String r7, @Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 java.lang.String r9, @Yue.InterfaceC4418 java.lang.String r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "delimiter"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "replacement"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            Yue.C3329.m13906(r10, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r0 = m22378(r1, r2, r3, r4, r5, r6)
            r1 = -1
            if (r0 != r1) goto L22
            goto L33
        L22:
            int r8 = r8.length()
            int r0 = r0 + r8
            int r8 = r7.length()
            java.lang.CharSequence r7 = m22433(r7, r0, r8, r9)
            java.lang.String r10 = r7.toString()
        L33:
            return r10
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡۨ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22420(java.lang.String r0, char r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = m22418(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡۤ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22421(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = m22419(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۤ۟, reason: contains not printable characters */
    public static final java.lang.String m22422(@Yue.InterfaceC4418 java.lang.String r7, char r8, @Yue.InterfaceC4418 java.lang.String r9, @Yue.InterfaceC4418 java.lang.String r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "replacement"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            Yue.C3329.m13906(r10, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r8 = m22363(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L1d
            goto L26
        L1d:
            r10 = 0
            java.lang.CharSequence r7 = m22433(r7, r10, r8, r9)
            java.lang.String r10 = r7.toString()
        L26:
            return r10
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۤ۠, reason: contains not printable characters */
    public static final java.lang.String m22423(@Yue.InterfaceC4418 java.lang.String r7, @Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 java.lang.String r9, @Yue.InterfaceC4418 java.lang.String r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "delimiter"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "replacement"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            Yue.C3329.m13906(r10, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r8 = m22364(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L22
            goto L2b
        L22:
            r10 = 0
            java.lang.CharSequence r7 = m22433(r7, r10, r8, r9)
            java.lang.String r10 = r7.toString()
        L2b:
            return r10
    }

    /* JADX INFO: renamed from: ۥ۟ۡۤۡ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22424(java.lang.String r0, char r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = m22422(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡۤۢ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22425(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = m22423(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟ۡۤ, reason: contains not printable characters */
    public static final java.lang.String m22426(@Yue.InterfaceC4418 java.lang.String r7, char r8, @Yue.InterfaceC4418 java.lang.String r9, @Yue.InterfaceC4418 java.lang.String r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "replacement"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            Yue.C3329.m13906(r10, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r8 = m22377(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L1d
            goto L26
        L1d:
            r10 = 0
            java.lang.CharSequence r7 = m22433(r7, r10, r8, r9)
            java.lang.String r10 = r7.toString()
        L26:
            return r10
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۤۤ, reason: contains not printable characters */
    public static final java.lang.String m22427(@Yue.InterfaceC4418 java.lang.String r7, @Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 java.lang.String r9, @Yue.InterfaceC4418 java.lang.String r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "delimiter"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "replacement"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "missingDelimiterValue"
            Yue.C3329.m13906(r10, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r8 = m22378(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L22
            goto L2b
        L22:
            r10 = 0
            java.lang.CharSequence r7 = m22433(r7, r10, r8, r9)
            java.lang.String r10 = r7.toString()
        L2b:
            return r10
    }

    /* JADX INFO: renamed from: ۥ۟ۡۤۥ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22428(java.lang.String r0, char r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = m22426(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡۤۦ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22429(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = r0
        L5:
            java.lang.String r0 = m22427(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟ۡۤۧ, reason: contains not printable characters */
    public static final java.lang.String m22430(java.lang.CharSequence r1, Yue.C5283 r2, java.lang.String r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "regex"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "replacement"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r1 = r2.m19957(r1, r3)
            return r1
    }

    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3421(name = "replaceFirstCharWithChar")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    /* JADX INFO: renamed from: ۥ۟ۡۤۨ, reason: contains not printable characters */
    public static final java.lang.String m22431(java.lang.String r1, Yue.InterfaceC2825<? super java.lang.Character, java.lang.Character> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r2, r0)
            int r0 = r1.length()
            if (r0 <= 0) goto L3c
            r0 = 0
            char r0 = r1.charAt(r0)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object r2 = r2.invoke(r0)
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            r0 = 1
            java.lang.String r1 = r1.substring(r0)
            java.lang.String r0 = "this as java.lang.String).substring(startIndex)"
            Yue.C3329.m13905(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
        L3c:
            return r1
    }

    @Yue.InterfaceC4656
    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3421(name = "replaceFirstCharWithCharSequence")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    /* JADX INFO: renamed from: ۥ۟ۡۥ, reason: contains not printable characters */
    public static final java.lang.String m22432(java.lang.String r2, Yue.InterfaceC2825<? super java.lang.Character, ? extends java.lang.CharSequence> r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "transform"
            Yue.C3329.m13906(r3, r0)
            int r0 = r2.length()
            if (r0 <= 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            char r1 = r2.charAt(r1)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            java.lang.Object r3 = r3.invoke(r1)
            r0.append(r3)
            r3 = 1
            java.lang.String r2 = r2.substring(r3)
            java.lang.String r3 = "this as java.lang.String).substring(startIndex)"
            Yue.C3329.m13905(r2, r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L36:
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۥ۟, reason: contains not printable characters */
    public static final java.lang.CharSequence m22433(@Yue.InterfaceC4418 java.lang.CharSequence r2, int r3, int r4, @Yue.InterfaceC4418 java.lang.CharSequence r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "replacement"
            Yue.C3329.m13906(r5, r0)
            if (r4 < r3) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r0.append(r2, r1, r3)
            java.lang.String r3 = "this.append(value, startIndex, endIndex)"
            Yue.C3329.m13905(r0, r3)
            r0.append(r5)
            int r5 = r2.length()
            r0.append(r2, r4, r5)
            Yue.C3329.m13905(r0, r3)
            return r0
        L28:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "End index ("
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = ") is less than start index ("
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = ")."
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.<init>(r3)
            throw r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۥ۠, reason: contains not printable characters */
    public static final java.lang.CharSequence m22434(@Yue.InterfaceC4418 java.lang.CharSequence r1, @Yue.InterfaceC4418 Yue.C3279 r2, @Yue.InterfaceC4418 java.lang.CharSequence r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "replacement"
            Yue.C3329.m13906(r3, r0)
            java.lang.Integer r0 = r2.m13748()
            int r0 = r0.intValue()
            java.lang.Integer r2 = r2.m13747()
            int r2 = r2.intValue()
            int r2 = r2 + 1
            java.lang.CharSequence r1 = m22433(r1, r0, r2, r3)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟ۡۥۡ, reason: contains not printable characters */
    public static final java.lang.String m22435(java.lang.String r1, int r2, int r3, java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "replacement"
            Yue.C3329.m13906(r4, r0)
            java.lang.CharSequence r1 = m22433(r1, r2, r3, r4)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟ۡۥۢ, reason: contains not printable characters */
    public static final java.lang.String m22436(java.lang.String r1, Yue.C3279 r2, java.lang.CharSequence r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "replacement"
            Yue.C3329.m13906(r3, r0)
            java.lang.CharSequence r1 = m22434(r1, r2, r3)
            java.lang.String r1 = r1.toString()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟ۡۥۣ, reason: contains not printable characters */
    public static final void m22437(int r2) {
            if (r2 < 0) goto L3
            return
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Limit must be non-negative, but was "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟ۡۥۤ, reason: contains not printable characters */
    public static final java.util.List<java.lang.String> m22438(java.lang.CharSequence r1, Yue.C5283 r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "regex"
            Yue.C3329.m13906(r2, r0)
            java.util.List r1 = r2.m19958(r1, r3)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۥۥ, reason: contains not printable characters */
    public static final java.util.List<java.lang.String> m22439(@Yue.InterfaceC4418 java.lang.CharSequence r7, @Yue.InterfaceC4418 char[] r8, boolean r9, int r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "delimiters"
            Yue.C3329.m13906(r8, r0)
            int r0 = r8.length
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = 0
            char r8 = r8[r0]
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.util.List r7 = m22441(r7, r8, r9, r10)
            return r7
        L1a:
            r5 = 2
            r6 = 0
            r2 = 0
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            Yue.ۥۡۨۢ r8 = m22397(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Iterable r8 = Yue.C5629.m21026(r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = Yue.C1210.m6231(r8, r10)
            r9.<init>(r10)
            java.util.Iterator r8 = r8.iterator()
        L38:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L4c
            java.lang.Object r10 = r8.next()
            Yue.ۥ۠ۥۣۨ r10 = (Yue.C3279) r10
            java.lang.String r10 = m22460(r7, r10)
            r9.add(r10)
            goto L38
        L4c:
            return r9
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۥۦ, reason: contains not printable characters */
    public static final java.util.List<java.lang.String> m22440(@Yue.InterfaceC4418 java.lang.CharSequence r7, @Yue.InterfaceC4418 java.lang.String[] r8, boolean r9, int r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "delimiters"
            Yue.C3329.m13906(r8, r0)
            int r0 = r8.length
            r1 = 1
            if (r0 != r1) goto L1d
            r0 = 0
            r0 = r8[r0]
            int r1 = r0.length()
            if (r1 != 0) goto L18
            goto L1d
        L18:
            java.util.List r7 = m22441(r7, r0, r9, r10)
            return r7
        L1d:
            r5 = 2
            r6 = 0
            r2 = 0
            r0 = r7
            r1 = r8
            r3 = r9
            r4 = r10
            Yue.ۥۡۨۢ r8 = m22398(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Iterable r8 = Yue.C5629.m21026(r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = Yue.C1210.m6231(r8, r10)
            r9.<init>(r10)
            java.util.Iterator r8 = r8.iterator()
        L3b:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L4f
            java.lang.Object r10 = r8.next()
            Yue.ۥ۠ۥۣۨ r10 = (Yue.C3279) r10
            java.lang.String r10 = m22460(r7, r10)
            r9.add(r10)
            goto L3b
        L4f:
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟ۡۥۧ, reason: contains not printable characters */
    public static final java.util.List<java.lang.String> m22441(java.lang.CharSequence r7, java.lang.String r8, boolean r9, int r10) {
            m22437(r10)
            r0 = 0
            int r1 = m22360(r7, r8, r0, r9)
            r2 = -1
            if (r1 == r2) goto L51
            r3 = 1
            if (r10 != r3) goto Lf
            goto L51
        Lf:
            if (r10 <= 0) goto L13
            r4 = r3
            goto L14
        L13:
            r4 = r0
        L14:
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            if (r4 == 0) goto L1e
            int r6 = Yue.C5196.m19521(r10, r6)
        L1e:
            r5.<init>(r6)
        L21:
            java.lang.CharSequence r0 = r7.subSequence(r0, r1)
            java.lang.String r0 = r0.toString()
            r5.add(r0)
            int r0 = r8.length()
            int r0 = r0 + r1
            if (r4 == 0) goto L3b
            int r1 = r5.size()
            int r6 = r10 + (-1)
            if (r1 == r6) goto L41
        L3b:
            int r1 = m22360(r7, r8, r0, r9)
            if (r1 != r2) goto L21
        L41:
            int r8 = r7.length()
            java.lang.CharSequence r7 = r7.subSequence(r0, r8)
            java.lang.String r7 = r7.toString()
            r5.add(r7)
            return r5
        L51:
            java.lang.String r7 = r7.toString()
            java.util.List r7 = Yue.C1207.m6190(r7)
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟ۡۥۨ, reason: contains not printable characters */
    public static /* synthetic */ java.util.List m22442(java.lang.CharSequence r0, Yue.C5283 r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r3 = "<this>"
            Yue.C3329.m13906(r0, r3)
            java.lang.String r3 = "regex"
            Yue.C3329.m13906(r1, r3)
            java.util.List r0 = r1.m19958(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦ, reason: contains not printable characters */
    public static /* synthetic */ java.util.List m22443(java.lang.CharSequence r1, char[] r2, boolean r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = r0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = r0
        Lb:
            java.util.List r1 = m22439(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦ۟, reason: contains not printable characters */
    public static /* synthetic */ java.util.List m22444(java.lang.CharSequence r1, java.lang.String[] r2, boolean r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = r0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = r0
        Lb:
            java.util.List r1 = m22440(r1, r2, r3, r4)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟ۡۦ۠, reason: contains not printable characters */
    public static final Yue.InterfaceC5609<java.lang.String> m22445(java.lang.CharSequence r1, Yue.C5283 r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "regex"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۡۨۢ r1 = r2.m19959(r1, r3)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۦۡ, reason: contains not printable characters */
    public static final Yue.InterfaceC5609<java.lang.String> m22446(@Yue.InterfaceC4418 java.lang.CharSequence r8, @Yue.InterfaceC4418 char[] r9, boolean r10, int r11) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "delimiters"
            Yue.C3329.m13906(r9, r0)
            r6 = 2
            r7 = 0
            r3 = 0
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            Yue.ۥۡۨۢ r9 = m22397(r1, r2, r3, r4, r5, r6, r7)
            Yue.ۥۢ۠ۢۥ$ۥ۟۟۟۟ r10 = new Yue.ۥۢ۠ۢۥ$ۥ۟۟۟۟
            r10.<init>(r8)
            Yue.ۥۡۨۢ r8 = Yue.C5629.m21101(r9, r10)
            return r8
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۦۢ, reason: contains not printable characters */
    public static final Yue.InterfaceC5609<java.lang.String> m22447(@Yue.InterfaceC4418 java.lang.CharSequence r8, @Yue.InterfaceC4418 java.lang.String[] r9, boolean r10, int r11) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "delimiters"
            Yue.C3329.m13906(r9, r0)
            r6 = 2
            r7 = 0
            r3 = 0
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            Yue.ۥۡۨۢ r9 = m22398(r1, r2, r3, r4, r5, r6, r7)
            Yue.ۥۢ۠ۢۥ$ۥ۟۟۟ r10 = new Yue.ۥۢ۠ۢۥ$ۥ۟۟۟
            r10.<init>(r8)
            Yue.ۥۡۨۢ r8 = Yue.C5629.m21101(r9, r10)
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦۣ, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC5609 m22448(java.lang.CharSequence r0, Yue.C5283 r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r3 = "<this>"
            Yue.C3329.m13906(r0, r3)
            java.lang.String r3 = "regex"
            Yue.C3329.m13906(r1, r3)
            Yue.ۥۡۨۢ r0 = r1.m19959(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦۤ, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC5609 m22449(java.lang.CharSequence r1, char[] r2, boolean r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = r0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = r0
        Lb:
            Yue.ۥۡۨۢ r1 = m22446(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦۥ, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC5609 m22450(java.lang.CharSequence r1, java.lang.String[] r2, boolean r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = r0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = r0
        Lb:
            Yue.ۥۡۨۢ r1 = m22447(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦۦ, reason: contains not printable characters */
    public static final boolean m22451(@Yue.InterfaceC4418 java.lang.CharSequence r2, char r3, boolean r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.length()
            r1 = 0
            if (r0 <= 0) goto L17
            char r2 = r2.charAt(r1)
            boolean r2 = Yue.C1097.m5877(r2, r3, r4)
            if (r2 == 0) goto L17
            r1 = 1
        L17:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦۧ, reason: contains not printable characters */
    public static final boolean m22452(@Yue.InterfaceC4418 java.lang.CharSequence r7, @Yue.InterfaceC4418 java.lang.CharSequence r8, int r9, boolean r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "prefix"
            Yue.C3329.m13906(r8, r0)
            if (r10 != 0) goto L23
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L23
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L23
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            r2 = r8
            java.lang.String r2 = (java.lang.String) r2
            r5 = 4
            r6 = 0
            r4 = 0
            r3 = r9
            boolean r7 = Yue.C5988.m22314(r1, r2, r3, r4, r5, r6)
            return r7
        L23:
            int r4 = r8.length()
            r3 = 0
            r0 = r7
            r1 = r9
            r2 = r8
            r5 = r10
            boolean r7 = m22399(r0, r1, r2, r3, r4, r5)
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦۨ, reason: contains not printable characters */
    public static final boolean m22453(@Yue.InterfaceC4418 java.lang.CharSequence r6, @Yue.InterfaceC4418 java.lang.CharSequence r7, boolean r8) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "prefix"
            Yue.C3329.m13906(r7, r0)
            if (r8 != 0) goto L20
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L20
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L20
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            r8 = 2
            r0 = 0
            r1 = 0
            boolean r6 = Yue.C5988.m22315(r6, r7, r1, r8, r0)
            return r6
        L20:
            int r4 = r7.length()
            r1 = 0
            r3 = 0
            r0 = r6
            r2 = r7
            r5 = r8
            boolean r6 = m22399(r0, r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟ۡۧ, reason: contains not printable characters */
    public static /* synthetic */ boolean m22454(java.lang.CharSequence r0, char r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = m22451(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡۧ۟, reason: contains not printable characters */
    public static /* synthetic */ boolean m22455(java.lang.CharSequence r0, java.lang.CharSequence r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            boolean r0 = m22452(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡۧ۠, reason: contains not printable characters */
    public static /* synthetic */ boolean m22456(java.lang.CharSequence r0, java.lang.CharSequence r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = m22453(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۧۡ, reason: contains not printable characters */
    public static final java.lang.CharSequence m22457(@Yue.InterfaceC4418 java.lang.CharSequence r1, @Yue.InterfaceC4418 Yue.C3279 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            java.lang.Integer r0 = r2.m13748()
            int r0 = r0.intValue()
            java.lang.Integer r2 = r2.m13747()
            int r2 = r2.intValue()
            int r2 = r2 + 1
            java.lang.CharSequence r1 = r1.subSequence(r0, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC1816(message = "Use parameters named startIndex and endIndex.", replaceWith = @Yue.InterfaceC5313(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟ۡۧۢ, reason: contains not printable characters */
    public static final java.lang.CharSequence m22458(java.lang.String r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥۣ۟ۡۧ, reason: contains not printable characters */
    public static final java.lang.String m22459(java.lang.CharSequence r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۧۤ, reason: contains not printable characters */
    public static final java.lang.String m22460(@Yue.InterfaceC4418 java.lang.CharSequence r1, @Yue.InterfaceC4418 Yue.C3279 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            java.lang.Integer r0 = r2.m13748()
            int r0 = r0.intValue()
            java.lang.Integer r2 = r2.m13747()
            int r2 = r2.intValue()
            int r2 = r2 + 1
            java.lang.CharSequence r1 = r1.subSequence(r0, r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۧۥ, reason: contains not printable characters */
    public static final java.lang.String m22461(@Yue.InterfaceC4418 java.lang.String r1, @Yue.InterfaceC4418 Yue.C3279 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r2, r0)
            java.lang.Integer r0 = r2.m13748()
            int r0 = r0.intValue()
            java.lang.Integer r2 = r2.m13747()
            int r2 = r2.intValue()
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r0, r2)
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟ۡۧۦ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22462(java.lang.CharSequence r0, int r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L8
            int r2 = r0.length()
        L8:
            java.lang.String r3 = "<this>"
            Yue.C3329.m13906(r0, r3)
            java.lang.CharSequence r0 = r0.subSequence(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۧۧ, reason: contains not printable characters */
    public static final java.lang.String m22463(@Yue.InterfaceC4418 java.lang.String r7, char r8, @Yue.InterfaceC4418 java.lang.String r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "missingDelimiterValue"
            Yue.C3329.m13906(r9, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r8 = m22363(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L18
            goto L27
        L18:
            int r8 = r8 + 1
            int r9 = r7.length()
            java.lang.String r9 = r7.substring(r8, r9)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r9, r7)
        L27:
            return r9
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۧۨ, reason: contains not printable characters */
    public static final java.lang.String m22464(@Yue.InterfaceC4418 java.lang.String r7, @Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 java.lang.String r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "delimiter"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "missingDelimiterValue"
            Yue.C3329.m13906(r9, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r0 = m22364(r1, r2, r3, r4, r5, r6)
            r1 = -1
            if (r0 != r1) goto L1d
            goto L2f
        L1d:
            int r8 = r8.length()
            int r0 = r0 + r8
            int r8 = r7.length()
            java.lang.String r9 = r7.substring(r0, r8)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r9, r7)
        L2f:
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟ۡۨ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22465(java.lang.String r0, char r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = m22463(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡۨ۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22466(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = m22464(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۨ۠, reason: contains not printable characters */
    public static java.lang.String m22467(@Yue.InterfaceC4418 java.lang.String r7, char r8, @Yue.InterfaceC4418 java.lang.String r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "missingDelimiterValue"
            Yue.C3329.m13906(r9, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r8 = m22377(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L18
            goto L27
        L18:
            int r8 = r8 + 1
            int r9 = r7.length()
            java.lang.String r9 = r7.substring(r8, r9)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r9, r7)
        L27:
            return r9
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۨۡ, reason: contains not printable characters */
    public static final java.lang.String m22468(@Yue.InterfaceC4418 java.lang.String r7, @Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 java.lang.String r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "delimiter"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "missingDelimiterValue"
            Yue.C3329.m13906(r9, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r0 = m22378(r1, r2, r3, r4, r5, r6)
            r1 = -1
            if (r0 != r1) goto L1d
            goto L2f
        L1d:
            int r8 = r8.length()
            int r0 = r0 + r8
            int r8 = r7.length()
            java.lang.String r9 = r7.substring(r0, r8)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r9, r7)
        L2f:
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟ۡۨۢ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22469(java.lang.String r0, char r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = m22467(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡۨ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22470(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = m22468(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۨۤ, reason: contains not printable characters */
    public static final java.lang.String m22471(@Yue.InterfaceC4418 java.lang.String r7, char r8, @Yue.InterfaceC4418 java.lang.String r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "missingDelimiterValue"
            Yue.C3329.m13906(r9, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r8 = m22363(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L18
            goto L22
        L18:
            r9 = 0
            java.lang.String r9 = r7.substring(r9, r8)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r9, r7)
        L22:
            return r9
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۨۥ, reason: contains not printable characters */
    public static final java.lang.String m22472(@Yue.InterfaceC4418 java.lang.String r7, @Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 java.lang.String r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "delimiter"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "missingDelimiterValue"
            Yue.C3329.m13906(r9, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r8 = m22364(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L1d
            goto L27
        L1d:
            r9 = 0
            java.lang.String r9 = r7.substring(r9, r8)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r9, r7)
        L27:
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟ۡۨۦ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22473(java.lang.String r0, char r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = m22471(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۡۨۧ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22474(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = m22472(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۡۨۨ, reason: contains not printable characters */
    public static final java.lang.String m22475(@Yue.InterfaceC4418 java.lang.String r7, char r8, @Yue.InterfaceC4418 java.lang.String r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "missingDelimiterValue"
            Yue.C3329.m13906(r9, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r8 = m22377(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L18
            goto L22
        L18:
            r9 = 0
            java.lang.String r9 = r7.substring(r9, r8)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r9, r7)
        L22:
            return r9
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static final java.lang.String m22476(@Yue.InterfaceC4418 java.lang.String r7, @Yue.InterfaceC4418 java.lang.String r8, @Yue.InterfaceC4418 java.lang.String r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "delimiter"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "missingDelimiterValue"
            Yue.C3329.m13906(r9, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            int r8 = m22378(r1, r2, r3, r4, r5, r6)
            r0 = -1
            if (r8 != r0) goto L1d
            goto L27
        L1d:
            r9 = 0
            java.lang.String r9 = r7.substring(r9, r8)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r9, r7)
        L27:
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟ۢ۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22477(java.lang.String r0, char r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = m22475(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟ۢ۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m22478(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = r0
        L5:
            java.lang.String r0 = m22476(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟ۢ۟۠, reason: contains not printable characters */
    public static final boolean m22479(@Yue.InterfaceC4418 java.lang.String r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "true"
            boolean r0 = Yue.C3329.m13897(r3, r0)
            if (r0 == 0) goto Lf
            r3 = 1
            goto L18
        Lf:
            java.lang.String r0 = "false"
            boolean r0 = Yue.C3329.m13897(r3, r0)
            if (r0 == 0) goto L19
            r3 = 0
        L18:
            return r3
        L19:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The string doesn't represent a boolean value: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۡ, reason: contains not printable characters */
    public static final java.lang.Boolean m22480(@Yue.InterfaceC4418 java.lang.String r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "true"
            boolean r0 = Yue.C3329.m13897(r1, r0)
            if (r0 == 0) goto L10
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L1c
        L10:
            java.lang.String r0 = "false"
            boolean r1 = Yue.C3329.m13897(r1, r0)
            if (r1 == 0) goto L1b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L1c
        L1b:
            r1 = 0
        L1c:
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۢ, reason: contains not printable characters */
    public static java.lang.CharSequence m22481(@Yue.InterfaceC4418 java.lang.CharSequence r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
        Ld:
            if (r2 > r0) goto L2b
            if (r3 != 0) goto L13
            r4 = r2
            goto L14
        L13:
            r4 = r0
        L14:
            char r4 = r5.charAt(r4)
            boolean r4 = Yue.C1096.m5859(r4)
            if (r3 != 0) goto L25
            if (r4 != 0) goto L22
            r3 = r1
            goto Ld
        L22:
            int r2 = r2 + 1
            goto Ld
        L25:
            if (r4 != 0) goto L28
            goto L2b
        L28:
            int r0 = r0 + (-1)
            goto Ld
        L2b:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            return r5
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟ۢ۟, reason: contains not printable characters */
    public static final java.lang.CharSequence m22482(@Yue.InterfaceC4418 java.lang.CharSequence r5, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Character, java.lang.Boolean> r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r6, r0)
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
        L12:
            if (r2 > r0) goto L3a
            if (r3 != 0) goto L18
            r4 = r2
            goto L19
        L18:
            r4 = r0
        L19:
            char r4 = r5.charAt(r4)
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            java.lang.Object r4 = r6.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r3 != 0) goto L34
            if (r4 != 0) goto L31
            r3 = r1
            goto L12
        L31:
            int r2 = r2 + 1
            goto L12
        L34:
            if (r4 != 0) goto L37
            goto L3a
        L37:
            int r0 = r0 + (-1)
            goto L12
        L3a:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            return r5
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۤ, reason: contains not printable characters */
    public static final java.lang.CharSequence m22483(@Yue.InterfaceC4418 java.lang.CharSequence r5, @Yue.InterfaceC4418 char... r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "chars"
            Yue.C3329.m13906(r6, r0)
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
        L12:
            if (r2 > r0) goto L30
            if (r3 != 0) goto L18
            r4 = r2
            goto L19
        L18:
            r4 = r0
        L19:
            char r4 = r5.charAt(r4)
            boolean r4 = Yue.C0595.m2610(r6, r4)
            if (r3 != 0) goto L2a
            if (r4 != 0) goto L27
            r3 = r1
            goto L12
        L27:
            int r2 = r2 + 1
            goto L12
        L2a:
            if (r4 != 0) goto L2d
            goto L30
        L2d:
            int r0 = r0 + (-1)
            goto L12
        L30:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            return r5
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۥ, reason: contains not printable characters */
    public static final java.lang.String m22484(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.CharSequence r1 = m22481(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۦ, reason: contains not printable characters */
    public static final java.lang.String m22485(@Yue.InterfaceC4418 java.lang.String r5, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Character, java.lang.Boolean> r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r6, r0)
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
        L12:
            if (r2 > r0) goto L3a
            if (r3 != 0) goto L18
            r4 = r2
            goto L19
        L18:
            r4 = r0
        L19:
            char r4 = r5.charAt(r4)
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            java.lang.Object r4 = r6.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r3 != 0) goto L34
            if (r4 != 0) goto L31
            r3 = r1
            goto L12
        L31:
            int r2 = r2 + 1
            goto L12
        L34:
            if (r4 != 0) goto L37
            goto L3a
        L37:
            int r0 = r0 + (-1)
            goto L12
        L3a:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            java.lang.String r5 = r5.toString()
            return r5
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۧ, reason: contains not printable characters */
    public static final java.lang.String m22486(@Yue.InterfaceC4418 java.lang.String r5, @Yue.InterfaceC4418 char... r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "chars"
            Yue.C3329.m13906(r6, r0)
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
        L12:
            if (r2 > r0) goto L30
            if (r3 != 0) goto L18
            r4 = r2
            goto L19
        L18:
            r4 = r0
        L19:
            char r4 = r5.charAt(r4)
            boolean r4 = Yue.C0595.m2610(r6, r4)
            if (r3 != 0) goto L2a
            if (r4 != 0) goto L27
            r3 = r1
            goto L12
        L27:
            int r2 = r2 + 1
            goto L12
        L2a:
            if (r4 != 0) goto L2d
            goto L30
        L2d:
            int r0 = r0 + (-1)
            goto L12
        L30:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            java.lang.String r5 = r5.toString()
            return r5
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۨ, reason: contains not printable characters */
    public static final java.lang.CharSequence m22487(@Yue.InterfaceC4418 java.lang.CharSequence r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L26
        Ld:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            boolean r2 = Yue.C1096.m5859(r2)
            if (r2 != 0) goto L21
            int r0 = r0 + 1
            r1 = 0
            java.lang.CharSequence r3 = r3.subSequence(r1, r0)
            goto L28
        L21:
            if (r1 >= 0) goto L24
            goto L26
        L24:
            r0 = r1
            goto Ld
        L26:
            java.lang.String r3 = ""
        L28:
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۢ۠, reason: contains not printable characters */
    public static final java.lang.CharSequence m22488(@Yue.InterfaceC4418 java.lang.CharSequence r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Character, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r4, r0)
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L35
        L12:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r2 = r4.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L30
            int r0 = r0 + 1
            r4 = 0
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            return r3
        L30:
            if (r1 >= 0) goto L33
            goto L35
        L33:
            r0 = r1
            goto L12
        L35:
            java.lang.String r3 = ""
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۢ۠۟, reason: contains not printable characters */
    public static final java.lang.CharSequence m22489(@Yue.InterfaceC4418 java.lang.CharSequence r3, @Yue.InterfaceC4418 char... r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "chars"
            Yue.C3329.m13906(r4, r0)
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L2b
        L12:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            boolean r2 = Yue.C0595.m2610(r4, r2)
            if (r2 != 0) goto L26
            int r0 = r0 + 1
            r4 = 0
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            goto L2d
        L26:
            if (r1 >= 0) goto L29
            goto L2b
        L29:
            r0 = r1
            goto L12
        L2b:
            java.lang.String r3 = ""
        L2d:
            return r3
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟ۢ۠۠, reason: contains not printable characters */
    public static final java.lang.String m22490(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.CharSequence r1 = m22487(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۡ, reason: contains not printable characters */
    public static final java.lang.String m22491(@Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Character, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r4, r0)
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L35
        L12:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r2 = r4.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L30
            int r0 = r0 + 1
            r4 = 0
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            goto L37
        L30:
            if (r1 >= 0) goto L33
            goto L35
        L33:
            r0 = r1
            goto L12
        L35:
            java.lang.String r3 = ""
        L37:
            java.lang.String r3 = r3.toString()
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۢ, reason: contains not printable characters */
    public static final java.lang.String m22492(@Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 char... r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "chars"
            Yue.C3329.m13906(r4, r0)
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L2b
        L12:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            boolean r2 = Yue.C0595.m2610(r4, r2)
            if (r2 != 0) goto L26
            int r0 = r0 + 1
            r4 = 0
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            goto L2d
        L26:
            if (r1 >= 0) goto L29
            goto L2b
        L29:
            r0 = r1
            goto L12
        L2b:
            java.lang.String r3 = ""
        L2d:
            java.lang.String r3 = r3.toString()
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟ۢ۠, reason: contains not printable characters */
    public static final java.lang.CharSequence m22493(@Yue.InterfaceC4418 java.lang.CharSequence r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.length()
            r1 = 0
        La:
            if (r1 >= r0) goto L22
            char r2 = r3.charAt(r1)
            boolean r2 = Yue.C1096.m5859(r2)
            if (r2 != 0) goto L1f
            int r0 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r0)
            goto L24
        L1f:
            int r1 = r1 + 1
            goto La
        L22:
            java.lang.String r3 = ""
        L24:
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۤ, reason: contains not printable characters */
    public static final java.lang.CharSequence m22494(@Yue.InterfaceC4418 java.lang.CharSequence r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Character, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r4, r0)
            int r0 = r3.length()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L31
            char r2 = r3.charAt(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r2 = r4.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L2e
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r4)
            return r3
        L2e:
            int r1 = r1 + 1
            goto Lf
        L31:
            java.lang.String r3 = ""
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۥ, reason: contains not printable characters */
    public static final java.lang.CharSequence m22495(@Yue.InterfaceC4418 java.lang.CharSequence r3, @Yue.InterfaceC4418 char... r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "chars"
            Yue.C3329.m13906(r4, r0)
            int r0 = r3.length()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L27
            char r2 = r3.charAt(r1)
            boolean r2 = Yue.C0595.m2610(r4, r2)
            if (r2 != 0) goto L24
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r4)
            goto L29
        L24:
            int r1 = r1 + 1
            goto Lf
        L27:
            java.lang.String r3 = ""
        L29:
            return r3
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۦ, reason: contains not printable characters */
    public static final java.lang.String m22496(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.CharSequence r1 = m22493(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۧ, reason: contains not printable characters */
    public static final java.lang.String m22497(@Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Character, java.lang.Boolean> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "predicate"
            Yue.C3329.m13906(r4, r0)
            int r0 = r3.length()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L31
            char r2 = r3.charAt(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r2 = r4.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L2e
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r4)
            goto L33
        L2e:
            int r1 = r1 + 1
            goto Lf
        L31:
            java.lang.String r3 = ""
        L33:
            java.lang.String r3 = r3.toString()
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۨ, reason: contains not printable characters */
    public static final java.lang.String m22498(@Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 char... r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "chars"
            Yue.C3329.m13906(r4, r0)
            int r0 = r3.length()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L27
            char r2 = r3.charAt(r1)
            boolean r2 = Yue.C0595.m2610(r4, r2)
            if (r2 != 0) goto L24
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r4)
            goto L29
        L24:
            int r1 = r1 + 1
            goto Lf
        L27:
            java.lang.String r3 = ""
        L29:
            java.lang.String r3 = r3.toString()
            return r3
    }
}
