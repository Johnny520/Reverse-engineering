package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC5336(29)
public final class InspectionCompanionC0467 implements android.view.inspector.InspectionCompanion {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean f1183;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f1184;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f1185;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f1186;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f1187;

    public InspectionCompanionC0467() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1183 = r0
            return
    }

    public void mapProperties(@Yue.InterfaceC4410 android.view.inspector.PropertyMapper r3) {
            r2 = this;
            java.lang.String r0 = "backgroundTint"
            int r1 = Yue.C5058.C5060.f16605
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1184 = r0
            java.lang.String r0 = "backgroundTintMode"
            int r1 = Yue.C5058.C5060.f16606
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1185 = r0
            java.lang.String r0 = "tint"
            int r1 = Yue.C5058.C5060.f16793
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1186 = r0
            java.lang.String r0 = "tintMode"
            int r1 = Yue.C5058.C5060.f16794
            int r3 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1187 = r3
            r3 = 1
            r2.f1183 = r3
            return
    }

    public /* bridge */ /* synthetic */ void readProperties(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 android.view.inspector.PropertyReader r2) {
            r0 = this;
            Yue.ۥ۟ۡۢۢ r1 = (Yue.C0468) r1
            r0.m1719(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m1719(@Yue.InterfaceC4410 Yue.C0468 r3, @Yue.InterfaceC4410 android.view.inspector.PropertyReader r4) {
            r2 = this;
            boolean r0 = r2.f1183
            if (r0 == 0) goto L29
            int r0 = r2.f1184
            android.content.res.ColorStateList r1 = r3.getBackgroundTintList()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1185
            android.graphics.PorterDuff$Mode r1 = r3.getBackgroundTintMode()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1186
            android.content.res.ColorStateList r1 = r3.getImageTintList()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1187
            android.graphics.PorterDuff$Mode r3 = r3.getImageTintMode()
            Yue.C0424.m1623(r4, r0, r3)
            return
        L29:
            android.view.inspector.InspectionCompanion$UninitializedPropertyMapException r3 = Yue.C0426.m1625()
            throw r3
    }
}
