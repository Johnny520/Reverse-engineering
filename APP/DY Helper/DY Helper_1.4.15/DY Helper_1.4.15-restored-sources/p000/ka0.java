package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ka0 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f5823;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.m80 f5824;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ android.widget.CompoundButton f5825;

    public /* synthetic */ ka0(p000.m80 r1, android.widget.CompoundButton r2, int r3) {
            r0 = this;
            r0.f5823 = r3
            r0.f5824 = r1
            r0.f5825 = r2
            r0.<init>()
            return
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton r2, boolean r3) {
            r1 = this;
            int r0 = r1.f5823
            switch(r0) {
                case 0: goto L30;
                case 1: goto L18;
                default: goto L5;
            }
        L5:
            m80 r0 = r1.f5824
            e80 r0 = (p000.e80) r0
            android.widget.CompoundButton r1 = r1.f5825
            android.widget.Switch r1 = (android.widget.Switch) r1
            r2.getClass()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r0.invoke(r2, r1)
            return
        L18:
            m80 r0 = r1.f5824
            com.example.dyhelper.ui.ν r0 = (com.example.dyhelper.p002ui.C0170) r0
            android.widget.CompoundButton r1 = r1.f5825
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r2.getClass()
            x90 r2 = new x90
            boolean r1 = r1.isChecked()
            r2.<init>(r3, r1)
            r0.invoke(r2)
            return
        L30:
            m80 r0 = r1.f5824
            com.example.dyhelper.ui.ν r0 = (com.example.dyhelper.p002ui.C0170) r0
            android.widget.CompoundButton r1 = r1.f5825
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r2.getClass()
            x90 r2 = new x90
            boolean r1 = r1.isChecked()
            r2.<init>(r1, r3)
            r0.invoke(r2)
            return
    }
}
