package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC5336(29)
public final class InspectionCompanionC0474 implements android.view.inspector.InspectionCompanion {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean f1202;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f1203;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f1204;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f1205;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f1206;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f1207;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f1208;

    public InspectionCompanionC0474() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1202 = r0
            return
    }

    public void mapProperties(@Yue.InterfaceC4410 android.view.inspector.PropertyMapper r3) {
            r2 = this;
            java.lang.String r0 = "backgroundTint"
            int r1 = Yue.C5058.C5060.f16605
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1203 = r0
            java.lang.String r0 = "backgroundTintMode"
            int r1 = Yue.C5058.C5060.f16606
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1204 = r0
            java.lang.String r0 = "buttonTint"
            int r1 = Yue.C5058.C5060.f16620
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1205 = r0
            java.lang.String r0 = "buttonTintMode"
            int r1 = Yue.C5058.C5060.f16621
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1206 = r0
            java.lang.String r0 = "drawableTint"
            int r1 = Yue.C5058.C5060.f16667
            int r0 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1207 = r0
            java.lang.String r0 = "drawableTintMode"
            int r1 = Yue.C5058.C5060.f16668
            int r3 = Yue.C0425.m1624(r3, r0, r1)
            r2.f1208 = r3
            r3 = 1
            r2.f1202 = r3
            return
    }

    public /* bridge */ /* synthetic */ void readProperties(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 android.view.inspector.PropertyReader r2) {
            r0 = this;
            Yue.ۥ۟ۡۢۨ r1 = (Yue.C0475) r1
            r0.m1730(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m1730(@Yue.InterfaceC4410 Yue.C0475 r3, @Yue.InterfaceC4410 android.view.inspector.PropertyReader r4) {
            r2 = this;
            boolean r0 = r2.f1202
            if (r0 == 0) goto L3b
            int r0 = r2.f1203
            android.content.res.ColorStateList r1 = r3.getBackgroundTintList()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1204
            android.graphics.PorterDuff$Mode r1 = r3.getBackgroundTintMode()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1205
            android.content.res.ColorStateList r1 = r3.getButtonTintList()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1206
            android.graphics.PorterDuff$Mode r1 = r3.getButtonTintMode()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1207
            android.content.res.ColorStateList r1 = r3.getCompoundDrawableTintList()
            Yue.C0424.m1623(r4, r0, r1)
            int r0 = r2.f1208
            android.graphics.PorterDuff$Mode r3 = r3.getCompoundDrawableTintMode()
            Yue.C0424.m1623(r4, r0, r3)
            return
        L3b:
            android.view.inspector.InspectionCompanion$UninitializedPropertyMapException r3 = Yue.C0426.m1625()
            throw r3
    }
}
