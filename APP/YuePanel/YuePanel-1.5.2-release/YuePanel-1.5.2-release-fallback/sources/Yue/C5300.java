package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5300 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f19852 = "android.remoteinput.results";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f19853 = "android.remoteinput.resultsData";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.String f19854 = "android.remoteinput.dataTypeResultsData";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.lang.String f19855 = "android.remoteinput.resultsSource";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f19856 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f19857 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f19858 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f19859 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f19860 = 2;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.String f19861;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.CharSequence f19862;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.lang.CharSequence[] f19863;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean f19864;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int f19865;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final android.os.Bundle f19866;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final java.util.Set<java.lang.String> f19867;

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۨ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(20)
    public static class C5301 {
        public C5301() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m20048(java.lang.Object r0, android.content.Intent r1, android.os.Bundle r2) {
                android.app.RemoteInput[] r0 = (android.app.RemoteInput[]) r0
                android.app.RemoteInput.addResultsToIntent(r0, r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.app.RemoteInput m20049(Yue.C5300 r4) {
                android.app.RemoteInput$Builder r0 = new android.app.RemoteInput$Builder
                java.lang.String r1 = r4.m20046()
                r0.<init>(r1)
                java.lang.CharSequence r1 = r4.m20045()
                android.app.RemoteInput$Builder r0 = r0.setLabel(r1)
                java.lang.CharSequence[] r1 = r4.m20042()
                android.app.RemoteInput$Builder r0 = r0.setChoices(r1)
                boolean r1 = r4.m20040()
                android.app.RemoteInput$Builder r0 = r0.setAllowFreeFormInput(r1)
                android.os.Bundle r1 = r4.m20044()
                android.app.RemoteInput$Builder r0 = r0.addExtras(r1)
                java.util.Set r1 = r4.m20041()
                if (r1 == 0) goto L44
                java.util.Iterator r1 = r1.iterator()
            L33:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L44
                java.lang.Object r2 = r1.next()
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                Yue.C5300.C5302.m20055(r0, r2, r3)
                goto L33
            L44:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 29
                if (r1 < r2) goto L51
                int r4 = r4.m20043()
                Yue.C5300.C5304.m20059(r0, r4)
            L51:
                android.app.RemoteInput r4 = r0.build()
                return r4
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Yue.C5300 m20050(java.lang.Object r4) {
                android.app.RemoteInput r4 = (android.app.RemoteInput) r4
                Yue.ۥۡۦۣۨ$ۥ۟۟۟۟ r0 = new Yue.ۥۡۦۣۨ$ۥ۟۟۟۟
                java.lang.String r1 = r4.getResultKey()
                r0.<init>(r1)
                java.lang.CharSequence r1 = r4.getLabel()
                Yue.ۥۡۦۣۨ$ۥ۟۟۟۟ r0 = r0.m20067(r1)
                java.lang.CharSequence[] r1 = r4.getChoices()
                Yue.ۥۡۦۣۨ$ۥ۟۟۟۟ r0 = r0.m20065(r1)
                boolean r1 = r4.getAllowFreeFormInput()
                Yue.ۥۡۦۣۨ$ۥ۟۟۟۟ r0 = r0.m20064(r1)
                android.os.Bundle r1 = r4.getExtras()
                Yue.ۥۡۦۣۨ$ۥ۟۟۟۟ r0 = r0.m20060(r1)
                java.util.Set r1 = Yue.C5300.C5302.m20053(r4)
                if (r1 == 0) goto L46
                java.util.Iterator r1 = r1.iterator()
            L35:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L46
                java.lang.Object r2 = r1.next()
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r0.m20063(r2, r3)
                goto L35
            L46:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 29
                if (r1 < r2) goto L53
                int r4 = Yue.C5300.C5304.m20058(r4)
                r0.m20066(r4)
            L53:
                Yue.ۥۡۦۣۨ r4 = r0.m20061()
                return r4
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static android.os.Bundle m20051(android.content.Intent r0) {
                android.os.Bundle r0 = android.app.RemoteInput.getResultsFromIntent(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۨ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static class C5302 {
        public C5302() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m20052(Yue.C5300 r0, android.content.Intent r1, java.util.Map<java.lang.String, android.net.Uri> r2) {
                android.app.RemoteInput r0 = Yue.C5300.m20031(r0)
                android.app.RemoteInput.addDataResultToIntent(r0, r1, r2)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static java.util.Set<java.lang.String> m20053(java.lang.Object r0) {
                android.app.RemoteInput r0 = (android.app.RemoteInput) r0
                java.util.Set r0 = r0.getAllowedDataTypes()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static java.util.Map<java.lang.String, android.net.Uri> m20054(android.content.Intent r0, java.lang.String r1) {
                java.util.Map r0 = android.app.RemoteInput.getDataResultsFromIntent(r0, r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static android.app.RemoteInput.Builder m20055(android.app.RemoteInput.Builder r0, java.lang.String r1, boolean r2) {
                android.app.RemoteInput$Builder r0 = r0.setAllowDataType(r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۨ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C5303 {
        public C5303() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m20056(android.content.Intent r0) {
                int r0 = android.app.RemoteInput.getResultsSource(r0)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m20057(android.content.Intent r0, int r1) {
                android.app.RemoteInput.setResultsSource(r0, r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۨ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C5304 {
        public C5304() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m20058(java.lang.Object r0) {
                android.app.RemoteInput r0 = (android.app.RemoteInput) r0
                int r0 = r0.getEditChoicesBeforeSending()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.app.RemoteInput.Builder m20059(android.app.RemoteInput.Builder r0, int r1) {
                android.app.RemoteInput$Builder r0 = r0.setEditChoicesBeforeSending(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C5305 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f19868;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.util.Set<java.lang.String> f19869;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final android.os.Bundle f19870;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public java.lang.CharSequence f19871;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public java.lang.CharSequence[] f19872;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f19873;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f19874;

        public C5305(@Yue.InterfaceC4410 java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.f19869 = r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r1.f19870 = r0
                r0 = 1
                r1.f19873 = r0
                r0 = 0
                r1.f19874 = r0
                if (r2 == 0) goto L1c
                r1.f19868 = r2
                return
            L1c:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Result key can't be null"
                r2.<init>(r0)
                throw r2
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C5300.C5305 m20060(@Yue.InterfaceC4410 android.os.Bundle r2) {
                r1 = this;
                if (r2 == 0) goto L7
                android.os.Bundle r0 = r1.f19870
                r0.putAll(r2)
            L7:
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C5300 m20061() {
                r9 = this;
                Yue.ۥۡۦۣۨ r8 = new Yue.ۥۡۦۣۨ
                java.lang.String r1 = r9.f19868
                java.lang.CharSequence r2 = r9.f19871
                java.lang.CharSequence[] r3 = r9.f19872
                boolean r4 = r9.f19873
                int r5 = r9.f19874
                android.os.Bundle r6 = r9.f19870
                java.util.Set<java.lang.String> r7 = r9.f19869
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public android.os.Bundle m20062() {
                r1 = this;
                android.os.Bundle r0 = r1.f19870
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Yue.C5300.C5305 m20063(@Yue.InterfaceC4410 java.lang.String r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto L8
                java.util.Set<java.lang.String> r2 = r0.f19869
                r2.add(r1)
                goto Ld
            L8:
                java.util.Set<java.lang.String> r2 = r0.f19869
                r2.remove(r1)
            Ld:
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Yue.C5300.C5305 m20064(boolean r1) {
                r0 = this;
                r0.f19873 = r1
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public Yue.C5300.C5305 m20065(@Yue.InterfaceC4544 java.lang.CharSequence[] r1) {
                r0 = this;
                r0.f19872 = r1
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public Yue.C5300.C5305 m20066(int r1) {
                r0 = this;
                r0.f19874 = r1
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public Yue.C5300.C5305 m20067(@Yue.InterfaceC4544 java.lang.CharSequence r1) {
                r0 = this;
                r0.f19871 = r1
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۨ$ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC5306 {
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۨ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC5307 {
    }

    public C5300(java.lang.String r1, java.lang.CharSequence r2, java.lang.CharSequence[] r3, boolean r4, int r5, android.os.Bundle r6, java.util.Set<java.lang.String> r7) {
            r0 = this;
            r0.<init>()
            r0.f19861 = r1
            r0.f19862 = r2
            r0.f19863 = r3
            r0.f19864 = r4
            r0.f19865 = r5
            r0.f19866 = r6
            r0.f19867 = r7
            int r1 = r0.m20043()
            r2 = 2
            if (r1 != r2) goto L27
            boolean r1 = r0.m20040()
            if (r1 == 0) goto L1f
            goto L27
        L1f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "setEditChoicesBeforeSending requires setAllowFreeFormInput"
            r1.<init>(r2)
            throw r1
        L27:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m20029(@Yue.InterfaceC4410 Yue.C5300 r0, @Yue.InterfaceC4410 android.content.Intent r1, @Yue.InterfaceC4410 java.util.Map<java.lang.String, android.net.Uri> r2) {
            Yue.C5300.C5302.m20052(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m20030(@Yue.InterfaceC4410 Yue.C5300[] r0, @Yue.InterfaceC4410 android.content.Intent r1, @Yue.InterfaceC4410 android.os.Bundle r2) {
            android.app.RemoteInput[] r0 = m20032(r0)
            Yue.C5300.C5301.m20048(r0, r1, r2)
            return
    }

    @Yue.InterfaceC5336(20)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.app.RemoteInput m20031(Yue.C5300 r0) {
            android.app.RemoteInput r0 = Yue.C5300.C5301.m20049(r0)
            return r0
    }

    @Yue.InterfaceC5336(20)
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static android.app.RemoteInput[] m20032(Yue.C5300[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            android.app.RemoteInput[] r0 = new android.app.RemoteInput[r0]
            r1 = 0
        L8:
            int r2 = r3.length
            if (r1 >= r2) goto L16
            r2 = r3[r1]
            android.app.RemoteInput r2 = m20031(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L16:
            return r0
    }

    @Yue.InterfaceC5336(20)
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Yue.C5300 m20033(android.app.RemoteInput r0) {
            Yue.ۥۡۦۣۨ r0 = Yue.C5300.C5301.m20050(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static android.content.Intent m20034(android.content.Intent r3) {
            android.content.ClipData r3 = r3.getClipData()
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            android.content.ClipDescription r1 = r3.getDescription()
            java.lang.String r2 = "text/vnd.android.intent"
            boolean r2 = r1.hasMimeType(r2)
            if (r2 != 0) goto L15
            return r0
        L15:
            java.lang.CharSequence r1 = r1.getLabel()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "android.remoteinput.results"
            boolean r1 = r1.contentEquals(r2)
            if (r1 != 0) goto L26
            return r0
        L26:
            r0 = 0
            android.content.ClipData$Item r3 = r3.getItemAt(r0)
            android.content.Intent r3 = r3.getIntent()
            return r3
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static java.util.Map<java.lang.String, android.net.Uri> m20035(@Yue.InterfaceC4410 android.content.Intent r0, @Yue.InterfaceC4410 java.lang.String r1) {
            java.util.Map r0 = Yue.C5300.C5302.m20054(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static java.lang.String m20036(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "android.remoteinput.dataTypeResultsData"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static android.os.Bundle m20037(@Yue.InterfaceC4410 android.content.Intent r0) {
            android.os.Bundle r0 = Yue.C5300.C5301.m20051(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static int m20038(@Yue.InterfaceC4410 android.content.Intent r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r2 = Yue.C5300.C5303.m20056(r2)
            return r2
        Lb:
            android.content.Intent r2 = m20034(r2)
            r0 = 0
            if (r2 != 0) goto L13
            return r0
        L13:
            android.os.Bundle r2 = r2.getExtras()
            java.lang.String r1 = "android.remoteinput.resultsSource"
            int r2 = r2.getInt(r1, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static void m20039(@Yue.InterfaceC4410 android.content.Intent r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            Yue.C5300.C5303.m20057(r2, r3)
            goto L23
        La:
            android.content.Intent r0 = m20034(r2)
            if (r0 != 0) goto L15
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
        L15:
            java.lang.String r1 = "android.remoteinput.resultsSource"
            r0.putExtra(r1, r3)
            java.lang.String r3 = "android.remoteinput.results"
            android.content.ClipData r3 = android.content.ClipData.newIntent(r3, r0)
            r2.setClipData(r3)
        L23:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m20040() {
            r1 = this;
            boolean r0 = r1.f19864
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public java.util.Set<java.lang.String> m20041() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.f19867
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.lang.CharSequence[] m20042() {
            r1 = this;
            java.lang.CharSequence[] r0 = r1.f19863
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int m20043() {
            r1 = this;
            int r0 = r1.f19865
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public android.os.Bundle m20044() {
            r1 = this;
            android.os.Bundle r0 = r1.f19866
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public java.lang.CharSequence m20045() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f19862
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public java.lang.String m20046() {
            r1 = this;
            java.lang.String r0 = r1.f19861
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean m20047() {
            r1 = this;
            boolean r0 = r1.m20040()
            if (r0 != 0) goto L25
            java.lang.CharSequence[] r0 = r1.m20042()
            if (r0 == 0) goto L13
            java.lang.CharSequence[] r0 = r1.m20042()
            int r0 = r0.length
            if (r0 != 0) goto L25
        L13:
            java.util.Set r0 = r1.m20041()
            if (r0 == 0) goto L25
            java.util.Set r0 = r1.m20041()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
    }
}
