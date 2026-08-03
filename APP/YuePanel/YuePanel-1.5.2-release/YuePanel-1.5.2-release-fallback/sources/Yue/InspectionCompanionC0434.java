package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC5336(29)
public final class InspectionCompanionC0434 implements android.view.inspector.InspectionCompanion {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean f1106;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f1107;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f1108;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f1109;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f1110;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f1111;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f1112;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f1113;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f1114;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡ۟ۤ$ۥ, reason: contains not printable characters */
    public class C0435 implements java.util.function.IntFunction<java.lang.String> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InspectionCompanionC0434 f1115;

        public C0435(Yue.InspectionCompanionC0434 r1) {
                r0 = this;
                r0.f1115 = r1
                r0.<init>()
                return
        }

        @Override // java.util.function.IntFunction
        public /* bridge */ /* synthetic */ java.lang.String apply(int r1) {
                r0 = this;
                java.lang.String r1 = r0.m1643(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.String m1643(int r2) {
                r1 = this;
                if (r2 == 0) goto Ld
                r0 = 1
                if (r2 == r0) goto La
                java.lang.String r2 = java.lang.String.valueOf(r2)
                return r2
            La:
                java.lang.String r2 = "uniform"
                return r2
            Ld:
                java.lang.String r2 = "none"
                return r2
        }
    }

    public InspectionCompanionC0434() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1106 = r0
            return
    }

    public void mapProperties(@Yue.InterfaceC4410 android.view.inspector.PropertyMapper r4) {
            r3 = this;
            java.lang.String r0 = "autoSizeMaxTextSize"
            int r1 = Yue.C5058.C5060.f16597
            int r0 = Yue.C0432.m1640(r4, r0, r1)
            r3.f1107 = r0
            java.lang.String r0 = "autoSizeMinTextSize"
            int r1 = Yue.C5058.C5060.f16598
            int r0 = Yue.C0432.m1640(r4, r0, r1)
            r3.f1108 = r0
            java.lang.String r0 = "autoSizeStepGranularity"
            int r1 = Yue.C5058.C5060.f16600
            int r0 = Yue.C0432.m1640(r4, r0, r1)
            r3.f1109 = r0
            int r0 = Yue.C5058.C5060.f16601
            Yue.ۥ۟ۡ۟ۤ$ۥ r1 = new Yue.ۥ۟ۡ۟ۤ$ۥ
            r1.<init>(r3)
            java.lang.String r2 = "autoSizeTextType"
            int r0 = Yue.C0433.m1641(r4, r2, r0, r1)
            r3.f1110 = r0
            java.lang.String r0 = "backgroundTint"
            int r1 = Yue.C5058.C5060.f16605
            int r0 = Yue.C0425.m1624(r4, r0, r1)
            r3.f1111 = r0
            java.lang.String r0 = "backgroundTintMode"
            int r1 = Yue.C5058.C5060.f16606
            int r0 = Yue.C0425.m1624(r4, r0, r1)
            r3.f1112 = r0
            java.lang.String r0 = "drawableTint"
            int r1 = Yue.C5058.C5060.f16667
            int r0 = Yue.C0425.m1624(r4, r0, r1)
            r3.f1113 = r0
            java.lang.String r0 = "drawableTintMode"
            int r1 = Yue.C5058.C5060.f16668
            int r4 = Yue.C0425.m1624(r4, r0, r1)
            r3.f1114 = r4
            r4 = 1
            r3.f1106 = r4
            return
    }

    public /* bridge */ /* synthetic */ void readProperties(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 android.view.inspector.PropertyReader r2) {
            r0 = this;
            Yue.ۥ۟ۡ۟ۥ r1 = (Yue.C0436) r1
            r0.m1642(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m1642(@Yue.InterfaceC4410 Yue.C0436 r3, @Yue.InterfaceC4410 android.view.inspector.PropertyReader r4) {
            r2 = this;
            boolean r0 = r2.f1106
            if (r0 == 0) goto L4d
            int r0 = r2.f1107
            int r1 = r3.getAutoSizeMaxTextSize()
            Yue.C0430.m1638(r4, r0, r1)
            int r0 = r2.f1108
            int r1 = r3.getAutoSizeMinTextSize()
            Yue.C0430.m1638(r4, r0, r1)
            int r0 = r2.f1109
            int r1 = r3.getAutoSizeStepGranularity()
            Yue.C0430.m1638(r4, r0, r1)
            int r0 = r2.f1110
            int r1 = r3.getAutoSizeTextType()
            Yue.C0431.m1639(r4, r0, r1)
            int r0 = r2.f1111
            android.content.res.ColorStateList r1 = r3.getBackgroundTintList()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1112
            android.graphics.PorterDuff$Mode r1 = r3.getBackgroundTintMode()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1113
            android.content.res.ColorStateList r1 = r3.getCompoundDrawableTintList()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1114
            android.graphics.PorterDuff$Mode r3 = r3.getCompoundDrawableTintMode()
            Yue.C0424.m1623(r4, r0, r3)
            return
        L4d:
            android.view.inspector.InspectionCompanion$UninitializedPropertyMapException r3 = Yue.C0426.m1625()
            throw r3
    }
}
