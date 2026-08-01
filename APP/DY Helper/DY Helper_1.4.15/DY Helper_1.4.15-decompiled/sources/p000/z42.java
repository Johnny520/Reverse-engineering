package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class z42 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final p000.C1144 f12974;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.b52 f12975;

    public z42(p000.b52 r4) {
            r3 = this;
            r3.<init>()
            r3.f12975 = r4
            ｎ r0 = new ｎ
            androidx.appcompat.widget.Toolbar r1 = r4.f1484
            android.content.Context r1 = r1.getContext()
            java.lang.CharSequence r4 = r4.f1491
            r0.<init>()
            r2 = 4096(0x1000, float:5.74E-42)
            r0.f13494 = r2
            r0.f13496 = r2
            r2 = 0
            r0.f13501 = r2
            r0.f13502 = r2
            r2 = 0
            r0.f13503 = r2
            r0.f13504 = r2
            r2 = 16
            r0.f13505 = r2
            r0.f13498 = r1
            r0.f13490 = r4
            r3.f12974 = r0
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            b52 r2 = r1.f12975
            android.view.Window$Callback r0 = r2.f1494
            if (r0 == 0) goto L10
            boolean r2 = r2.f1495
            if (r2 == 0) goto L10
            r2 = 0
            ｎ r1 = r1.f12974
            r0.onMenuItemSelected(r2, r1)
        L10:
            return
    }
}
