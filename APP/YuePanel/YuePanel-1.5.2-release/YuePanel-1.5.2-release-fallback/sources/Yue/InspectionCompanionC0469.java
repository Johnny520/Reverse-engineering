package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC5336(29)
public final class InspectionCompanionC0469 implements android.view.inspector.InspectionCompanion {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean f1188;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f1189;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f1190;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f1191;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f1192;

    public InspectionCompanionC0469() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1188 = r0
            return
    }

    public void mapProperties(@Yue.InterfaceC4410 android.view.inspector.PropertyMapper r3) {
            r2 = this;
            java.lang.String r0 = "backgroundTint"
            int r1 = Yue.C5058.C5060.f16605
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1189 = r0
            java.lang.String r0 = "backgroundTintMode"
            int r1 = Yue.C5058.C5060.f16606
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1190 = r0
            java.lang.String r0 = "drawableTint"
            int r1 = Yue.C5058.C5060.f16667
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1191 = r0
            java.lang.String r0 = "drawableTintMode"
            int r1 = Yue.C5058.C5060.f16668
            int r3 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1192 = r3
            r3 = 1
            r2.f1188 = r3
            return
    }

    public /* bridge */ /* synthetic */ void readProperties(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 android.view.inspector.PropertyReader r2) {
            r0 = this;
            Yue.ۥ۟ۡۢۤ r1 = (Yue.C0470) r1
            r0.m1720(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m1720(@Yue.InterfaceC4410 Yue.C0470 r3, @Yue.InterfaceC4410 android.view.inspector.PropertyReader r4) {
            r2 = this;
            boolean r0 = r2.f1188
            if (r0 == 0) goto L29
            int r0 = r2.f1189
            android.content.res.ColorStateList r1 = r3.getBackgroundTintList()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1190
            android.graphics.PorterDuff$Mode r1 = r3.getBackgroundTintMode()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1191
            android.content.res.ColorStateList r1 = r3.getCompoundDrawableTintList()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1192
            android.graphics.PorterDuff$Mode r3 = r3.getCompoundDrawableTintMode()
            Yue.C0424.m1623(r4, r0, r3)
            return
        L29:
            android.view.inspector.InspectionCompanion$UninitializedPropertyMapException r3 = Yue.C0426.m1625()
            throw r3
    }
}
