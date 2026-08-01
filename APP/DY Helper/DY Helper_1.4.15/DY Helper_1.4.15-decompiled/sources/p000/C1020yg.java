package p000;

/* JADX INFO: renamed from: yg */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1020yg implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f12605;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.a80 f12606;

    public /* synthetic */ C1020yg(p000.a80 r1, int r2) {
            r0 = this;
            r0.f12605 = r2
            r0.f12606 = r1
            r0.<init>()
            return
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton r2, boolean r3) {
            r1 = this;
            int r0 = r1.f12605
            a80 r1 = r1.f12606
            switch(r0) {
                case 0: goto L16;
                default: goto L7;
            }
        L7:
            lw0 r1 = (p000.lw0) r1
            int r0 = com.example.dyhelper.p002ui.MainActivity.f2568
            r2.getClass()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r1.invoke(r2)
            return
        L16:
            wg r1 = (p000.C0946wg) r1
            r2.getClass()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r1.invoke(r2)
            return
    }
}
