package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC5336(29)
public final class InspectionCompanionC0464 implements android.view.inspector.InspectionCompanion {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean f1173;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f1174;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f1175;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f1176;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f1177;

    public InspectionCompanionC0464() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1173 = r0
            return
    }

    public void mapProperties(@Yue.InterfaceC4410 android.view.inspector.PropertyMapper r3) {
            r2 = this;
            java.lang.String r0 = "backgroundTint"
            int r1 = Yue.C5058.C5060.f16605
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1174 = r0
            java.lang.String r0 = "backgroundTintMode"
            int r1 = Yue.C5058.C5060.f16606
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1175 = r0
            java.lang.String r0 = "tint"
            int r1 = Yue.C5058.C5060.f16793
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1176 = r0
            java.lang.String r0 = "tintMode"
            int r1 = Yue.C5058.C5060.f16794
            int r3 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1177 = r3
            r3 = 1
            r2.f1173 = r3
            return
    }

    public /* bridge */ /* synthetic */ void readProperties(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 android.view.inspector.PropertyReader r2) {
            r0 = this;
            Yue.ۥ۟ۡۢ۟ r1 = (Yue.C0465) r1
            r0.m1705(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m1705(@Yue.InterfaceC4410 Yue.C0465 r3, @Yue.InterfaceC4410 android.view.inspector.PropertyReader r4) {
            r2 = this;
            boolean r0 = r2.f1173
            if (r0 == 0) goto L29
            int r0 = r2.f1174
            android.content.res.ColorStateList r1 = r3.getBackgroundTintList()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1175
            android.graphics.PorterDuff$Mode r1 = r3.getBackgroundTintMode()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1176
            android.content.res.ColorStateList r1 = r3.getImageTintList()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1177
            android.graphics.PorterDuff$Mode r3 = r3.getImageTintMode()
            Yue.C0424.m1623(r4, r0, r3)
            return
        L29:
            android.view.inspector.InspectionCompanion$UninitializedPropertyMapException r3 = Yue.C0426.m1625()
            throw r3
    }
}
