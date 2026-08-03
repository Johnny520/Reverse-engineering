package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1545 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f4962 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f4963 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f4964 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f4965 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f4966 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f4967 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f4968 = 1;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final Yue.C1545.InterfaceC1552 f4969;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(31)
    public static final class C1546 {
        public C1546() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.util.Pair<android.view.ContentInfo, android.view.ContentInfo> m7701(@Yue.InterfaceC4410 android.view.ContentInfo r4, @Yue.InterfaceC4410 java.util.function.Predicate<android.content.ClipData.Item> r5) {
                android.content.ClipData r0 = r4.getClip()
                int r1 = r0.getItemCount()
                r2 = 1
                r3 = 0
                if (r1 != r2) goto L22
                r1 = 0
                android.content.ClipData$Item r0 = r0.getItemAt(r1)
                boolean r5 = r5.test(r0)
                if (r5 == 0) goto L19
                r0 = r4
                goto L1a
            L19:
                r0 = r3
            L1a:
                if (r5 == 0) goto L1d
                r4 = r3
            L1d:
                android.util.Pair r4 = android.util.Pair.create(r0, r4)
                return r4
            L22:
                java.util.Objects.requireNonNull(r5)
                Yue.ۥ۟ۧۡۢ r1 = new Yue.ۥ۟ۧۡۢ
                r1.<init>(r5)
                android.util.Pair r5 = Yue.C1545.m7690(r0, r1)
                java.lang.Object r0 = r5.first
                if (r0 != 0) goto L37
                android.util.Pair r4 = android.util.Pair.create(r3, r4)
                return r4
            L37:
                java.lang.Object r0 = r5.second
                if (r0 != 0) goto L40
                android.util.Pair r4 = android.util.Pair.create(r4, r3)
                return r4
            L40:
                android.view.ContentInfo$Builder r0 = new android.view.ContentInfo$Builder
                r0.<init>(r4)
                java.lang.Object r1 = r5.first
                android.content.ClipData r1 = (android.content.ClipData) r1
                android.view.ContentInfo$Builder r0 = r0.setClip(r1)
                android.view.ContentInfo r0 = r0.build()
                android.view.ContentInfo$Builder r1 = new android.view.ContentInfo$Builder
                r1.<init>(r4)
                java.lang.Object r4 = r5.second
                android.content.ClipData r4 = (android.content.ClipData) r4
                android.view.ContentInfo$Builder r4 = r1.setClip(r4)
                android.view.ContentInfo r4 = r4.build()
                android.util.Pair r4 = android.util.Pair.create(r0, r4)
                return r4
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥ۟, reason: contains not printable characters */
    public static final class C1547 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final Yue.C1545.InterfaceC1549 f4970;

        public C1547(@Yue.InterfaceC4410 Yue.C1545 r3) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 31
                if (r0 < r1) goto L11
                Yue.ۥۣ۟ۧۡ$ۥ۟۟ r0 = new Yue.ۥۣ۟ۧۡ$ۥ۟۟
                r0.<init>(r3)
                r2.f4970 = r0
                goto L18
            L11:
                Yue.ۥۣ۟ۧۡ$ۥ۟۟۟۟ r0 = new Yue.ۥۣ۟ۧۡ$ۥ۟۟۟۟
                r0.<init>(r3)
                r2.f4970 = r0
            L18:
                return
        }

        public C1547(@Yue.InterfaceC4410 android.content.ClipData r3, int r4) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 31
                if (r0 < r1) goto L11
                Yue.ۥۣ۟ۧۡ$ۥ۟۟ r0 = new Yue.ۥۣ۟ۧۡ$ۥ۟۟
                r0.<init>(r3, r4)
                r2.f4970 = r0
                goto L18
            L11:
                Yue.ۥۣ۟ۧۡ$ۥ۟۟۟۟ r0 = new Yue.ۥۣ۟ۧۡ$ۥ۟۟۟۟
                r0.<init>(r3, r4)
                r2.f4970 = r0
            L18:
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C1545 m7702() {
                r1 = this;
                Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ r0 = r1.f4970
                Yue.ۥۣ۟ۧۡ r0 = r0.build()
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C1545.C1547 m7703(@Yue.InterfaceC4410 android.content.ClipData r2) {
                r1 = this;
                Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ r0 = r1.f4970
                r0.mo7712(r2)
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Yue.C1545.C1547 m7704(@Yue.InterfaceC4544 android.os.Bundle r2) {
                r1 = this;
                Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ r0 = r1.f4970
                r0.mo7709(r2)
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Yue.C1545.C1547 m7705(int r2) {
                r1 = this;
                Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ r0 = r1.f4970
                r0.mo7711(r2)
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Yue.C1545.C1547 m7706(@Yue.InterfaceC4544 android.net.Uri r2) {
                r1 = this;
                Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ r0 = r1.f4970
                r0.mo7710(r2)
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public Yue.C1545.C1547 m7707(int r2) {
                r1 = this;
                Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ r0 = r1.f4970
                r0.mo7708(r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(31)
    public static final class C1548 implements Yue.C1545.InterfaceC1549 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final android.view.ContentInfo.Builder f4971;

        public C1548(@Yue.InterfaceC4410 Yue.C1545 r1) {
                r0 = this;
                r0.<init>()
                Yue.C1564.m7726()
                android.view.ContentInfo r1 = r1.m7700()
                android.view.ContentInfo$Builder r1 = Yue.C1563.m7725(r1)
                r0.f4971 = r1
                return
        }

        public C1548(@Yue.InterfaceC4410 android.content.ClipData r1, int r2) {
                r0 = this;
                r0.<init>()
                android.view.ContentInfo$Builder r1 = Yue.C1562.m7724(r1, r2)
                r0.f4971 = r1
                return
        }

        @Override // Yue.C1545.InterfaceC1549
        @Yue.InterfaceC4410
        public Yue.C1545 build() {
                r3 = this;
                Yue.ۥۣ۟ۧۡ r0 = new Yue.ۥۣ۟ۧۡ
                Yue.ۥۣ۟ۧۡ$ۥ۟۟۟۠ r1 = new Yue.ۥۣ۟ۧۡ$ۥ۟۟۟۠
                android.view.ContentInfo$Builder r2 = r3.f4971
                android.view.ContentInfo r2 = Yue.C1557.m7719(r2)
                r1.<init>(r2)
                r0.<init>(r1)
                return r0
        }

        @Override // Yue.C1545.InterfaceC1549
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void mo7708(int r2) {
                r1 = this;
                android.view.ContentInfo$Builder r0 = r1.f4971
                Yue.C1556.m7718(r0, r2)
                return
        }

        @Override // Yue.C1545.InterfaceC1549
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void mo7709(@Yue.InterfaceC4544 android.os.Bundle r2) {
                r1 = this;
                android.view.ContentInfo$Builder r0 = r1.f4971
                Yue.C1561.m7723(r0, r2)
                return
        }

        @Override // Yue.C1545.InterfaceC1549
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo7710(@Yue.InterfaceC4544 android.net.Uri r2) {
                r1 = this;
                android.view.ContentInfo$Builder r0 = r1.f4971
                Yue.C1560.m7722(r0, r2)
                return
        }

        @Override // Yue.C1545.InterfaceC1549
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo7711(int r2) {
                r1 = this;
                android.view.ContentInfo$Builder r0 = r1.f4971
                Yue.C1558.m7720(r0, r2)
                return
        }

        @Override // Yue.C1545.InterfaceC1549
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo7712(@Yue.InterfaceC4410 android.content.ClipData r2) {
                r1 = this;
                android.view.ContentInfo$Builder r0 = r1.f4971
                Yue.C1559.m7721(r0, r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC1549 {
        @Yue.InterfaceC4410
        Yue.C1545 build();

        /* JADX INFO: renamed from: ۥ */
        void mo7708(int r1);

        /* JADX INFO: renamed from: ۥ۟ */
        void mo7709(@Yue.InterfaceC4544 android.os.Bundle r1);

        /* JADX INFO: renamed from: ۥ۟۟ */
        void mo7710(@Yue.InterfaceC4544 android.net.Uri r1);

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo7711(int r1);

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        void mo7712(@Yue.InterfaceC4410 android.content.ClipData r1);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C1550 implements Yue.C1545.InterfaceC1549 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public android.content.ClipData f4972;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f4973;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f4974;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public android.net.Uri f4975;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public android.os.Bundle f4976;

        public C1550(@Yue.InterfaceC4410 Yue.C1545 r2) {
                r1 = this;
                r1.<init>()
                android.content.ClipData r0 = r2.m7694()
                r1.f4972 = r0
                int r0 = r2.m7698()
                r1.f4973 = r0
                int r0 = r2.m7696()
                r1.f4974 = r0
                android.net.Uri r0 = r2.m7697()
                r1.f4975 = r0
                android.os.Bundle r2 = r2.m7695()
                r1.f4976 = r2
                return
        }

        public C1550(@Yue.InterfaceC4410 android.content.ClipData r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f4972 = r1
                r0.f4973 = r2
                return
        }

        @Override // Yue.C1545.InterfaceC1549
        @Yue.InterfaceC4410
        public Yue.C1545 build() {
                r2 = this;
                Yue.ۥۣ۟ۧۡ r0 = new Yue.ۥۣ۟ۧۡ
                Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ۢ r1 = new Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ۢ
                r1.<init>(r2)
                r0.<init>(r1)
                return r0
        }

        @Override // Yue.C1545.InterfaceC1549
        /* JADX INFO: renamed from: ۥ */
        public void mo7708(int r1) {
                r0 = this;
                r0.f4973 = r1
                return
        }

        @Override // Yue.C1545.InterfaceC1549
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo7709(@Yue.InterfaceC4544 android.os.Bundle r1) {
                r0 = this;
                r0.f4976 = r1
                return
        }

        @Override // Yue.C1545.InterfaceC1549
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo7710(@Yue.InterfaceC4544 android.net.Uri r1) {
                r0 = this;
                r0.f4975 = r1
                return
        }

        @Override // Yue.C1545.InterfaceC1549
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo7711(int r1) {
                r0 = this;
                r0.f4974 = r1
                return
        }

        @Override // Yue.C1545.InterfaceC1549
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo7712(@Yue.InterfaceC4410 android.content.ClipData r1) {
                r0 = this;
                r0.f4972 = r1
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC5336(31)
    public static final class C1551 implements Yue.C1545.InterfaceC1552 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final android.view.ContentInfo f4977;

        public C1551(@Yue.InterfaceC4410 android.view.ContentInfo r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = Yue.C4868.m19181(r1)
                android.view.ContentInfo r1 = Yue.C1543.m7687(r1)
                r0.f4977 = r1
                return
        }

        @Override // Yue.C1545.InterfaceC1552
        public int getSource() {
                r1 = this;
                android.view.ContentInfo r0 = r1.f4977
                int r0 = Yue.C1569.m7731(r0)
                return r0
        }

        @Yue.InterfaceC4410
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ContentInfoCompat{"
                r0.append(r1)
                android.view.ContentInfo r1 = r2.f4977
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.C1545.InterfaceC1552
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.net.Uri mo7713() {
                r1 = this;
                android.view.ContentInfo r0 = r1.f4977
                android.net.Uri r0 = Yue.C1567.m7729(r0)
                return r0
        }

        @Override // Yue.C1545.InterfaceC1552
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public android.content.ClipData mo7714() {
                r1 = this;
                android.view.ContentInfo r0 = r1.f4977
                android.content.ClipData r0 = Yue.C1565.m7727(r0)
                return r0
        }

        @Override // Yue.C1545.InterfaceC1552
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int mo7715() {
                r1 = this;
                android.view.ContentInfo r0 = r1.f4977
                int r0 = Yue.C1566.m7728(r0)
                return r0
        }

        @Override // Yue.C1545.InterfaceC1552
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public android.view.ContentInfo mo7716() {
                r1 = this;
                android.view.ContentInfo r0 = r1.f4977
                return r0
        }

        @Override // Yue.C1545.InterfaceC1552
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public android.os.Bundle mo7717() {
                r1 = this;
                android.view.ContentInfo r0 = r1.f4977
                android.os.Bundle r0 = Yue.C1568.m7730(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public interface InterfaceC1552 {
        int getSource();

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ */
        android.net.Uri mo7713();

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟ */
        android.content.ClipData mo7714();

        /* JADX INFO: renamed from: ۥ۟۟ */
        int mo7715();

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        android.view.ContentInfo mo7716();

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        android.os.Bundle mo7717();
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C1553 implements Yue.C1545.InterfaceC1552 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final android.content.ClipData f4978;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int f4979;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f4980;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public final android.net.Uri f4981;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public final android.os.Bundle f4982;

        public C1553(Yue.C1545.C1550 r5) {
                r4 = this;
                r4.<init>()
                android.content.ClipData r0 = r5.f4972
                java.lang.Object r0 = Yue.C4868.m19181(r0)
                android.content.ClipData r0 = (android.content.ClipData) r0
                r4.f4978 = r0
                int r0 = r5.f4973
                r1 = 5
                java.lang.String r2 = "source"
                r3 = 0
                int r0 = Yue.C4868.m19176(r0, r3, r1, r2)
                r4.f4979 = r0
                int r0 = r5.f4974
                r1 = 1
                int r0 = Yue.C4868.m19180(r0, r1)
                r4.f4980 = r0
                android.net.Uri r0 = r5.f4975
                r4.f4981 = r0
                android.os.Bundle r5 = r5.f4976
                r4.f4982 = r5
                return
        }

        @Override // Yue.C1545.InterfaceC1552
        public int getSource() {
                r1 = this;
                int r0 = r1.f4979
                return r0
        }

        @Yue.InterfaceC4410
        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ContentInfoCompat{clip="
                r0.append(r1)
                android.content.ClipData r1 = r4.f4978
                android.content.ClipDescription r1 = r1.getDescription()
                r0.append(r1)
                java.lang.String r1 = ", source="
                r0.append(r1)
                int r1 = r4.f4979
                java.lang.String r1 = Yue.C1545.m7692(r1)
                r0.append(r1)
                java.lang.String r1 = ", flags="
                r0.append(r1)
                int r1 = r4.f4980
                java.lang.String r1 = Yue.C1545.m7689(r1)
                r0.append(r1)
                android.net.Uri r1 = r4.f4981
                java.lang.String r2 = ""
                if (r1 != 0) goto L37
                r1 = r2
                goto L57
            L37:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = ", hasLinkUri("
                r1.append(r3)
                android.net.Uri r3 = r4.f4981
                java.lang.String r3 = r3.toString()
                int r3 = r3.length()
                r1.append(r3)
                java.lang.String r3 = ")"
                r1.append(r3)
                java.lang.String r1 = r1.toString()
            L57:
                r0.append(r1)
                android.os.Bundle r1 = r4.f4982
                if (r1 != 0) goto L5f
                goto L61
            L5f:
                java.lang.String r2 = ", hasExtras"
            L61:
                r0.append(r2)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.C1545.InterfaceC1552
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ */
        public android.net.Uri mo7713() {
                r1 = this;
                android.net.Uri r0 = r1.f4981
                return r0
        }

        @Override // Yue.C1545.InterfaceC1552
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟ */
        public android.content.ClipData mo7714() {
                r1 = this;
                android.content.ClipData r0 = r1.f4978
                return r0
        }

        @Override // Yue.C1545.InterfaceC1552
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo7715() {
                r1 = this;
                int r0 = r1.f4980
                return r0
        }

        @Override // Yue.C1545.InterfaceC1552
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public android.view.ContentInfo mo7716() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // Yue.C1545.InterfaceC1552
        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public android.os.Bundle mo7717() {
                r1 = this;
                android.os.Bundle r0 = r1.f4982
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC1554 {
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC1555 {
    }

    public C1545(@Yue.InterfaceC4410 Yue.C1545.InterfaceC1552 r1) {
            r0 = this;
            r0.<init>()
            r0.f4969 = r1
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.content.ClipData m7688(@Yue.InterfaceC4410 android.content.ClipDescription r2, @Yue.InterfaceC4410 java.util.List<android.content.ClipData.Item> r3) {
            android.content.ClipData r0 = new android.content.ClipData
            android.content.ClipDescription r1 = new android.content.ClipDescription
            r1.<init>(r2)
            r2 = 0
            java.lang.Object r2 = r3.get(r2)
            android.content.ClipData$Item r2 = (android.content.ClipData.Item) r2
            r0.<init>(r1, r2)
            r2 = 1
        L12:
            int r1 = r3.size()
            if (r2 >= r1) goto L24
            java.lang.Object r1 = r3.get(r2)
            android.content.ClipData$Item r1 = (android.content.ClipData.Item) r1
            r0.addItem(r1)
            int r2 = r2 + 1
            goto L12
        L24:
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.String m7689(int r1) {
            r0 = r1 & 1
            if (r0 == 0) goto L7
            java.lang.String r1 = "FLAG_CONVERT_TO_PLAIN_TEXT"
            return r1
        L7:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static android.util.Pair<android.content.ClipData, android.content.ClipData> m7690(@Yue.InterfaceC4410 android.content.ClipData r6, @Yue.InterfaceC4410 Yue.InterfaceC4877<android.content.ClipData.Item> r7) {
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r2
        L4:
            int r4 = r6.getItemCount()
            if (r1 >= r4) goto L2c
            android.content.ClipData$Item r4 = r6.getItemAt(r1)
            boolean r5 = r7.test(r4)
            if (r5 == 0) goto L1f
            if (r2 != 0) goto L1b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L1b:
            r2.add(r4)
            goto L29
        L1f:
            if (r3 != 0) goto L26
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L26:
            r3.add(r4)
        L29:
            int r1 = r1 + 1
            goto L4
        L2c:
            if (r2 != 0) goto L33
            android.util.Pair r6 = android.util.Pair.create(r0, r6)
            return r6
        L33:
            if (r3 != 0) goto L3a
            android.util.Pair r6 = android.util.Pair.create(r6, r0)
            return r6
        L3a:
            android.content.ClipDescription r7 = r6.getDescription()
            android.content.ClipData r7 = m7688(r7, r2)
            android.content.ClipDescription r6 = r6.getDescription()
            android.content.ClipData r6 = m7688(r6, r3)
            android.util.Pair r6 = android.util.Pair.create(r7, r6)
            return r6
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(31)
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static android.util.Pair<android.view.ContentInfo, android.view.ContentInfo> m7691(@Yue.InterfaceC4410 android.view.ContentInfo r0, @Yue.InterfaceC4410 java.util.function.Predicate<android.content.ClipData.Item> r1) {
            android.util.Pair r0 = Yue.C1545.C1546.m7701(r0, r1)
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static java.lang.String m7692(int r1) {
            if (r1 == 0) goto L25
            r0 = 1
            if (r1 == r0) goto L22
            r0 = 2
            if (r1 == r0) goto L1f
            r0 = 3
            if (r1 == r0) goto L1c
            r0 = 4
            if (r1 == r0) goto L19
            r0 = 5
            if (r1 == r0) goto L16
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
        L16:
            java.lang.String r1 = "SOURCE_PROCESS_TEXT"
            return r1
        L19:
            java.lang.String r1 = "SOURCE_AUTOFILL"
            return r1
        L1c:
            java.lang.String r1 = "SOURCE_DRAG_AND_DROP"
            return r1
        L1f:
            java.lang.String r1 = "SOURCE_INPUT_METHOD"
            return r1
        L22:
            java.lang.String r1 = "SOURCE_CLIPBOARD"
            return r1
        L25:
            java.lang.String r1 = "SOURCE_APP"
            return r1
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(31)
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static Yue.C1545 m7693(@Yue.InterfaceC4410 android.view.ContentInfo r2) {
            Yue.ۥۣ۟ۧۡ r0 = new Yue.ۥۣ۟ۧۡ
            Yue.ۥۣ۟ۧۡ$ۥ۟۟۟۠ r1 = new Yue.ۥۣ۟ۧۡ$ۥ۟۟۟۠
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4410
    public java.lang.String toString() {
            r1 = this;
            Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ۡ r0 = r1.f4969
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.content.ClipData m7694() {
            r1 = this;
            Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ۡ r0 = r1.f4969
            android.content.ClipData r0 = r0.mo7714()
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.os.Bundle m7695() {
            r1 = this;
            Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ۡ r0 = r1.f4969
            android.os.Bundle r0 = r0.mo7717()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m7696() {
            r1 = this;
            Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ۡ r0 = r1.f4969
            int r0 = r0.mo7715()
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.net.Uri m7697() {
            r1 = this;
            Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ۡ r0 = r1.f4969
            android.net.Uri r0 = r0.mo7713()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m7698() {
            r1 = this;
            Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ۡ r0 = r1.f4969
            int r0 = r0.getSource()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public android.util.Pair<Yue.C1545, Yue.C1545> m7699(@Yue.InterfaceC4410 Yue.InterfaceC4877<android.content.ClipData.Item> r5) {
            r4 = this;
            Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ۡ r0 = r4.f4969
            android.content.ClipData r0 = r0.mo7714()
            int r1 = r0.getItemCount()
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L25
            r1 = 0
            android.content.ClipData$Item r0 = r0.getItemAt(r1)
            boolean r5 = r5.test(r0)
            if (r5 == 0) goto L1b
            r0 = r4
            goto L1c
        L1b:
            r0 = r3
        L1c:
            if (r5 == 0) goto L1f
            goto L20
        L1f:
            r3 = r4
        L20:
            android.util.Pair r5 = android.util.Pair.create(r0, r3)
            return r5
        L25:
            android.util.Pair r5 = m7690(r0, r5)
            java.lang.Object r0 = r5.first
            if (r0 != 0) goto L32
            android.util.Pair r5 = android.util.Pair.create(r3, r4)
            return r5
        L32:
            java.lang.Object r0 = r5.second
            if (r0 != 0) goto L3b
            android.util.Pair r5 = android.util.Pair.create(r4, r3)
            return r5
        L3b:
            Yue.ۥۣ۟ۧۡ$ۥ۟ r0 = new Yue.ۥۣ۟ۧۡ$ۥ۟
            r0.<init>(r4)
            java.lang.Object r1 = r5.first
            android.content.ClipData r1 = (android.content.ClipData) r1
            Yue.ۥۣ۟ۧۡ$ۥ۟ r0 = r0.m7703(r1)
            Yue.ۥۣ۟ۧۡ r0 = r0.m7702()
            Yue.ۥۣ۟ۧۡ$ۥ۟ r1 = new Yue.ۥۣ۟ۧۡ$ۥ۟
            r1.<init>(r4)
            java.lang.Object r5 = r5.second
            android.content.ClipData r5 = (android.content.ClipData) r5
            Yue.ۥۣ۟ۧۡ$ۥ۟ r5 = r1.m7703(r5)
            Yue.ۥۣ۟ۧۡ r5 = r5.m7702()
            android.util.Pair r5 = android.util.Pair.create(r0, r5)
            return r5
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(31)
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public android.view.ContentInfo m7700() {
            r1 = this;
            Yue.ۥۣ۟ۧۡ$ۥ۟۟۟ۡ r0 = r1.f4969
            android.view.ContentInfo r0 = r0.mo7716()
            java.util.Objects.requireNonNull(r0)
            android.view.ContentInfo r0 = Yue.C1543.m7687(r0)
            return r0
    }
}
