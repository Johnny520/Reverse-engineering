package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC5336(29)
public final class InspectionCompanionC5544 implements android.view.inspector.InspectionCompanion {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean f20481;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f20482;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f20483;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f20484;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f20485;

    public InspectionCompanionC5544() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f20481 = r0
            return
    }

    public void mapProperties(@Yue.InterfaceC4410 android.view.inspector.PropertyMapper r3) {
            r2 = this;
            java.lang.String r0 = "imeOptions"
            r1 = 16843364(0x1010264, float:2.3695273E-38)
            int r0 = Yue.C0432.m1640(r3, r0, r1)
            r2.f20482 = r0
            java.lang.String r0 = "maxWidth"
            r1 = 16843039(0x101011f, float:2.3694362E-38)
            int r0 = Yue.C0432.m1640(r3, r0, r1)
            r2.f20483 = r0
            java.lang.String r0 = "iconifiedByDefault"
            int r1 = Yue.C5058.C5060.f16691
            int r0 = Yue.C3597.m14546(r3, r0, r1)
            r2.f20484 = r0
            java.lang.String r0 = "queryHint"
            int r1 = Yue.C5058.C5060.f16740
            int r3 = Yue.C0425.m1624(r3, r0, r1)
            r2.f20485 = r3
            r3 = 1
            r2.f20481 = r3
            return
    }

    public /* bridge */ /* synthetic */ void readProperties(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 android.view.inspector.PropertyReader r2) {
            r0 = this;
            androidx.appcompat.widget.SearchView r1 = (androidx.appcompat.widget.SearchView) r1
            r0.m20802(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m20802(@Yue.InterfaceC4410 androidx.appcompat.widget.SearchView r3, @Yue.InterfaceC4410 android.view.inspector.PropertyReader r4) {
            r2 = this;
            boolean r0 = r2.f20481
            if (r0 == 0) goto L29
            int r0 = r2.f20482
            int r1 = r3.getImeOptions()
            Yue.C0430.m1638(r4, r0, r1)
            int r0 = r2.f20483
            int r1 = r3.getMaxWidth()
            Yue.C0430.m1638(r4, r0, r1)
            int r0 = r2.f20484
            boolean r1 = r3.m28332()
            Yue.C3601.m14550(r4, r0, r1)
            int r0 = r2.f20485
            java.lang.CharSequence r3 = r3.getQueryHint()
            Yue.C0424.m1623(r4, r0, r3)
            return
        L29:
            android.view.inspector.InspectionCompanion$UninitializedPropertyMapException r3 = Yue.C0426.m1625()
            throw r3
    }
}
