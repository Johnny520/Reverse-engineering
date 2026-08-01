package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ey0 implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3681;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.a80 f3682;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.widget.EditText f3683;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.String f3684;

    public /* synthetic */ ey0(p000.a80 r1, android.widget.EditText r2, java.lang.String r3, int r4) {
            r0 = this;
            r0.f3681 = r4
            r0.f3682 = r1
            r0.f3683 = r2
            r0.f3684 = r3
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r3, int r4) {
            r2 = this;
            int r3 = r2.f3681
            r4 = 0
            java.lang.String r0 = r2.f3684
            android.widget.EditText r1 = r2.f3683
            a80 r2 = r2.f3682
            switch(r3) {
                case 0: goto L22;
                default: goto Lc;
            }
        Lc:
            android.text.Editable r3 = r1.getText()
            if (r3 == 0) goto L16
            java.lang.String r4 = r3.toString()
        L16:
            if (r4 != 0) goto L1a
            java.lang.String r4 = ""
        L1a:
            java.lang.String r3 = p000.qy0.m4981(r0, r4)
            r2.invoke(r3)
            return
        L22:
            java.util.Set r3 = p000.AbstractC0488ku.f6117
            android.text.Editable r3 = r1.getText()
            if (r3 == 0) goto L2e
            java.lang.String r4 = r3.toString()
        L2e:
            java.lang.String r3 = p000.AbstractC0488ku.m3415(r4, r0)
            r2.invoke(r3)
            return
    }
}
