package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mw0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7296;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ com.example.dyhelper.p002ui.MainActivity f7297;

    public /* synthetic */ mw0(com.example.dyhelper.p002ui.MainActivity r1, int r2) {
            r0 = this;
            r0.f7296 = r2
            r0.f7297 = r1
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f7296
            com.example.dyhelper.ui.MainActivity r3 = r3.f7297
            switch(r0) {
                case 0: goto L26;
                case 1: goto L1d;
                default: goto L7;
            }
        L7:
            int r0 = com.example.dyhelper.p002ui.MainActivity.f2568
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r2 = ".ui.LauncherAlias"
            java.lang.String r3 = p000.AbstractC0602nx.m4129(r3, r2)
            r0.<init>(r1, r3)
            return r0
        L1d:
            int r0 = com.example.dyhelper.p002ui.MainActivity.f2568
            lw0 r0 = new lw0
            r1 = 1
            r0.<init>(r3, r1)
            return r0
        L26:
            int r0 = com.example.dyhelper.p002ui.MainActivity.f2568
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.example.dyhelper.ui.AboutActivity> r1 = com.example.dyhelper.p002ui.AboutActivity.class
            r0.<init>(r3, r1)
            r3.startActivity(r0)
            s62 r3 = p000.s62.f9751
            return r3
    }
}
