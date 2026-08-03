package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC5336(29)
public final class InspectionCompanionC0440 implements android.view.inspector.InspectionCompanion {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean f1123;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f1124;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f1125;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f1126;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f1127;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f1128;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f1129;

    public InspectionCompanionC0440() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1123 = r0
            return
    }

    public void mapProperties(@Yue.InterfaceC4410 android.view.inspector.PropertyMapper r3) {
            r2 = this;
            java.lang.String r0 = "backgroundTint"
            int r1 = Yue.C5058.C5060.f16605
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1124 = r0
            java.lang.String r0 = "backgroundTintMode"
            int r1 = Yue.C5058.C5060.f16606
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1125 = r0
            java.lang.String r0 = "checkMarkTint"
            int r1 = Yue.C5058.C5060.f16623
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1126 = r0
            java.lang.String r0 = "checkMarkTintMode"
            int r1 = Yue.C5058.C5060.f16624
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1127 = r0
            java.lang.String r0 = "drawableTint"
            int r1 = Yue.C5058.C5060.f16667
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1128 = r0
            java.lang.String r0 = "drawableTintMode"
            int r1 = Yue.C5058.C5060.f16668
            int r3 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1129 = r3
            r3 = 1
            r2.f1123 = r3
            return
    }

    public /* bridge */ /* synthetic */ void readProperties(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 android.view.inspector.PropertyReader r2) {
            r0 = this;
            Yue.ۥ۟ۡ۠۟ r1 = (Yue.C0441) r1
            r0.m1645(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m1645(@Yue.InterfaceC4410 Yue.C0441 r3, @Yue.InterfaceC4410 android.view.inspector.PropertyReader r4) {
            r2 = this;
            boolean r0 = r2.f1123
            if (r0 == 0) goto L3b
            int r0 = r2.f1124
            android.content.res.ColorStateList r1 = r3.getBackgroundTintList()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1125
            android.graphics.PorterDuff$Mode r1 = r3.getBackgroundTintMode()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1126
            android.content.res.ColorStateList r1 = r3.getCheckMarkTintList()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1127
            android.graphics.PorterDuff$Mode r1 = r3.getCheckMarkTintMode()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1128
            android.content.res.ColorStateList r1 = r3.getCompoundDrawableTintList()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1129
            android.graphics.PorterDuff$Mode r3 = r3.getCompoundDrawableTintMode()
            Yue.C0424.m1623(r4, r0, r3)
            return
        L3b:
            android.view.inspector.InspectionCompanion$UninitializedPropertyMapException r3 = Yue.C0426.m1625()
            throw r3
    }
}
