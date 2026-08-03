package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۣۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,396:1\n1789#2,3:397\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n19#1:397,3\n*E\n"})
public final class C5292 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۦۣۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,396:1\n*E\n"})
    public static final class C5293<T> extends Yue.AbstractC3560 implements Yue.InterfaceC2825<T, java.lang.Boolean> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ int f19817;

        public C5293(int r1) {
                r0 = this;
                r0.f19817 = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Object r1) {
                r0 = this;
                java.lang.Enum r1 = (java.lang.Enum) r1
                java.lang.Boolean r1 = r0.m19986(r1)
                return r1
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.Boolean m19986(java.lang.Enum r3) {
                r2 = this;
                int r0 = r2.f19817
                Yue.ۥ۠ۢۡۨ r3 = (Yue.InterfaceC2429) r3
                int r1 = r3.getMask()
                r0 = r0 & r1
                int r3 = r3.getValue()
                if (r0 != r3) goto L11
                r3 = 1
                goto L12
            L11:
                r3 = 0
            L12:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                return r3
        }
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC3916 m19975(java.util.regex.Matcher r0, int r1, java.lang.CharSequence r2) {
            Yue.ۥۡ۟۟ r0 = m19980(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC3916 m19976(java.util.regex.Matcher r0, java.lang.CharSequence r1) {
            Yue.ۥۡ۟۟ r0 = m19982(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C3279 m19977(java.util.regex.MatchResult r0) {
            Yue.ۥ۠ۥۣۨ r0 = m19983(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C3279 m19978(java.util.regex.MatchResult r0, int r1) {
            Yue.ۥ۠ۥۣۨ r0 = m19984(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ int m19979(java.lang.Iterable r0) {
            int r0 = m19985(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Yue.InterfaceC3916 m19980(java.util.regex.Matcher r0, int r1, java.lang.CharSequence r2) {
            boolean r1 = r0.find(r1)
            if (r1 != 0) goto L8
            r0 = 0
            goto Le
        L8:
            Yue.ۥۡ۟۟۟ r1 = new Yue.ۥۡ۟۟۟
            r1.<init>(r0, r2)
            r0 = r1
        Le:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ <T extends java.lang.Enum<T> & Yue.InterfaceC2429> java.util.Set<T> m19981(int r2) {
            r0 = 4
            java.lang.String r1 = "T"
            Yue.C3329.m13915(r0, r1)
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            java.util.EnumSet r0 = java.util.EnumSet.allOf(r0)
            java.lang.String r1 = "fromInt$lambda$1"
            Yue.C3329.m13905(r0, r1)
            Yue.C3329.m13913()
            Yue.ۥۡۦۣۤ$ۥ r1 = new Yue.ۥۡۦۣۤ$ۥ
            r1.<init>(r2)
            Yue.C1216.m6272(r0, r1)
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r0)
            java.lang.String r0 = "unmodifiableSet(EnumSet.…mask == it.value }\n    })"
            Yue.C3329.m13905(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Yue.InterfaceC3916 m19982(java.util.regex.Matcher r1, java.lang.CharSequence r2) {
            boolean r0 = r1.matches()
            if (r0 != 0) goto L8
            r1 = 0
            goto Le
        L8:
            Yue.ۥۡ۟۟۟ r0 = new Yue.ۥۡ۟۟۟
            r0.<init>(r1, r2)
            r1 = r0
        Le:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final Yue.C3279 m19983(java.util.regex.MatchResult r1) {
            int r0 = r1.start()
            int r1 = r1.end()
            Yue.ۥ۠ۥۣۨ r1 = Yue.C5196.m19646(r0, r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final Yue.C3279 m19984(java.util.regex.MatchResult r1, int r2) {
            int r0 = r1.start(r2)
            int r1 = r1.end(r2)
            Yue.ۥ۠ۥۣۨ r1 = Yue.C5196.m19646(r0, r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int m19985(java.lang.Iterable<? extends Yue.InterfaceC2429> r2) {
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L5:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r2.next()
            Yue.ۥ۠ۢۡۨ r1 = (Yue.InterfaceC2429) r1
            int r1 = r1.getValue()
            r0 = r0 | r1
            goto L5
        L17:
            return r0
    }
}
