package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fu1 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4137;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.EditText f4138;

    public /* synthetic */ fu1(android.widget.EditText r1, int r2) {
            r0 = this;
            r0.f4137 = r2
            r0.f4138 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r1) {
            r0 = this;
            int r1 = r0.f4137
            android.widget.EditText r0 = r0.f4138
            switch(r1) {
                case 0: goto L13;
                case 1: goto Lf;
                case 2: goto Lb;
                default: goto L7;
            }
        L7:
            p000.jz1.m3096(r0)
            return
        Lb:
            p000.jz1.m3096(r0)
            return
        Lf:
            p000.jz1.m3096(r0)
            return
        L13:
            android.text.Editable r0 = r0.getText()
            r0.clear()
            return
    }
}
