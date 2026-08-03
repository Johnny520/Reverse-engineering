package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC5336(29)
public final class InspectionCompanionC3605 implements android.view.inspector.InspectionCompanion {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean f11475;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f11476;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f11477;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f11478;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f11479;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f11480;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f11481;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f11482;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f11483;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f11484;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۡۢ$ۥ, reason: contains not printable characters */
    public class C3606 implements java.util.function.IntFunction<java.lang.String> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InspectionCompanionC3605 f11485;

        public C3606(Yue.InspectionCompanionC3605 r1) {
                r0 = this;
                r0.f11485 = r1
                r0.<init>()
                return
        }

        @Override // java.util.function.IntFunction
        public /* bridge */ /* synthetic */ java.lang.String apply(int r1) {
                r0 = this;
                java.lang.String r1 = r0.m14555(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.String m14555(int r2) {
                r1 = this;
                if (r2 == 0) goto Ld
                r0 = 1
                if (r2 == r0) goto La
                java.lang.String r2 = java.lang.String.valueOf(r2)
                return r2
            La:
                java.lang.String r2 = "vertical"
                return r2
            Ld:
                java.lang.String r2 = "horizontal"
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۡۢ$ۥ۟, reason: contains not printable characters */
    public class C3607 implements java.util.function.IntFunction<java.util.Set<java.lang.String>> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InspectionCompanionC3605 f11486;

        public C3607(Yue.InspectionCompanionC3605 r1) {
                r0 = this;
                r0.f11486 = r1
                r0.<init>()
                return
        }

        @Override // java.util.function.IntFunction
        public /* bridge */ /* synthetic */ java.util.Set<java.lang.String> apply(int r1) {
                r0 = this;
                java.util.Set r1 = r0.m14556(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.util.Set<java.lang.String> m14556(int r3) {
                r2 = this;
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                if (r3 != 0) goto Lc
                java.lang.String r1 = "none"
                r0.add(r1)
            Lc:
                r1 = 1
                if (r3 != r1) goto L14
                java.lang.String r1 = "beginning"
                r0.add(r1)
            L14:
                r1 = 2
                if (r3 != r1) goto L1c
                java.lang.String r1 = "middle"
                r0.add(r1)
            L1c:
                r1 = 4
                if (r3 != r1) goto L24
                java.lang.String r3 = "end"
                r0.add(r3)
            L24:
                return r0
        }
    }

    public InspectionCompanionC3605() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f11475 = r0
            return
    }

    public void mapProperties(@Yue.InterfaceC4410 android.view.inspector.PropertyMapper r4) {
            r3 = this;
            java.lang.String r0 = "baselineAligned"
            r1 = 16843046(0x1010126, float:2.3694382E-38)
            int r0 = Yue.C3597.m14546(r4, r0, r1)
            r3.f11476 = r0
            java.lang.String r0 = "baselineAlignedChildIndex"
            r1 = 16843047(0x1010127, float:2.3694385E-38)
            int r0 = Yue.C0432.m1640(r4, r0, r1)
            r3.f11477 = r0
            java.lang.String r0 = "gravity"
            r1 = 16842927(0x10100af, float:2.3694048E-38)
            int r0 = Yue.C3598.m14547(r4, r0, r1)
            r3.f11478 = r0
            Yue.ۥ۠ۧۡۢ$ۥ r0 = new Yue.ۥ۠ۧۡۢ$ۥ
            r0.<init>(r3)
            java.lang.String r1 = "orientation"
            r2 = 16842948(0x10100c4, float:2.3694107E-38)
            int r0 = Yue.C0433.m1641(r4, r1, r2, r0)
            r3.f11479 = r0
            java.lang.String r0 = "weightSum"
            r1 = 16843048(0x1010128, float:2.3694388E-38)
            int r0 = Yue.C3599.m14548(r4, r0, r1)
            r3.f11480 = r0
            java.lang.String r0 = "divider"
            int r1 = Yue.C5058.C5060.f16657
            int r0 = Yue.C0425.m1624(r4, r0, r1)
            r3.f11481 = r0
            java.lang.String r0 = "dividerPadding"
            int r1 = Yue.C5058.C5060.f16659
            int r0 = Yue.C0432.m1640(r4, r0, r1)
            r3.f11482 = r0
            java.lang.String r0 = "measureWithLargestChild"
            int r1 = Yue.C5058.C5060.f16718
            int r0 = Yue.C3597.m14546(r4, r0, r1)
            r3.f11483 = r0
            int r0 = Yue.C5058.C5060.f16752
            Yue.ۥ۠ۧۡۢ$ۥ۟ r1 = new Yue.ۥ۠ۧۡۢ$ۥ۟
            r1.<init>(r3)
            java.lang.String r2 = "showDividers"
            int r4 = Yue.C3600.m14549(r4, r2, r0, r1)
            r3.f11484 = r4
            r4 = 1
            r3.f11475 = r4
            return
    }

    public /* bridge */ /* synthetic */ void readProperties(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 android.view.inspector.PropertyReader r2) {
            r0 = this;
            androidx.appcompat.widget.ۥ۟۟۟ r1 = (androidx.appcompat.widget.C7431) r1
            r0.m14554(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m14554(@Yue.InterfaceC4410 androidx.appcompat.widget.C7431 r3, @Yue.InterfaceC4410 android.view.inspector.PropertyReader r4) {
            r2 = this;
            boolean r0 = r2.f11475
            if (r0 == 0) goto L56
            int r0 = r2.f11476
            boolean r1 = r3.isBaselineAligned()
            Yue.C3601.m14550(r4, r0, r1)
            int r0 = r2.f11477
            int r1 = r3.getBaselineAlignedChildIndex()
            Yue.C0430.m1638(r4, r0, r1)
            int r0 = r2.f11478
            int r1 = r3.getGravity()
            Yue.C3602.m14551(r4, r0, r1)
            int r0 = r2.f11479
            int r1 = r3.getOrientation()
            Yue.C0431.m1639(r4, r0, r1)
            int r0 = r2.f11480
            float r1 = r3.getWeightSum()
            Yue.C3603.m14552(r4, r0, r1)
            int r0 = r2.f11481
            android.graphics.drawable.Drawable r1 = r3.getDividerDrawable()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f11482
            int r1 = r3.getDividerPadding()
            Yue.C0430.m1638(r4, r0, r1)
            int r0 = r2.f11483
            boolean r1 = r3.isMeasureWithLargestChildEnabled()
            Yue.C3601.m14550(r4, r0, r1)
            int r0 = r2.f11484
            int r3 = r3.getShowDividers()
            Yue.C3604.m14553(r4, r0, r3)
            return
        L56:
            android.view.inspector.InspectionCompanion$UninitializedPropertyMapException r3 = Yue.C0426.m1625()
            throw r3
    }
}
