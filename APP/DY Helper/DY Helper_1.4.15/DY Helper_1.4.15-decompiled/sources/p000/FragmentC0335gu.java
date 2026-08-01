package p000;

/* JADX INFO: renamed from: gu */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentC0335gu extends android.app.Fragment {

    /* JADX INFO: renamed from: ε */
    public p000.C0700pu f4466;

    public FragmentC0335gu() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            super.onActivityResult(r2, r3, r4)
            r0 = 22031(0x560f, float:3.0872E-41)
            if (r2 == r0) goto L8
            goto L40
        L8:
            r2 = -1
            r0 = 0
            if (r3 != r2) goto L24
            if (r4 == 0) goto L12
            android.net.Uri r0 = r4.getData()
        L12:
            if (r0 == 0) goto L24
            android.app.Activity r2 = r1.getActivity()     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L24
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L24
            r3 = 3
            r2.takePersistableUriPermission(r0, r3)     // Catch: java.lang.Throwable -> L24
        L24:
            pu r2 = r1.f4466
            if (r2 == 0) goto L2b
            r2.invoke(r0)
        L2b:
            android.app.FragmentManager r2 = r1.getFragmentManager()     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L40
            android.app.FragmentTransaction r2 = r2.beginTransaction()     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L40
            android.app.FragmentTransaction r1 = r2.remove(r1)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L40
            r1.commitAllowingStateLoss()     // Catch: java.lang.Throwable -> L40
        L40:
            return
    }

    @Override // android.app.Fragment
    public final void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT_TREE"
            r3.<init>(r0)
            r0 = 195(0xc3, float:2.73E-43)
            r3.addFlags(r0)
            r0 = 22031(0x560f, float:3.0872E-41)
            r2.startActivityForResult(r3, r0)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            android.app.Activity r3 = r2.getActivity()
            java.lang.String r0 = "无法打开目录选择器"
            r1 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
            r3.show()
            pu r3 = r2.f4466
            if (r3 == 0) goto L2b
            r0 = 0
            r3.invoke(r0)
        L2b:
            android.app.FragmentManager r3 = r2.getFragmentManager()     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L40
            android.app.FragmentTransaction r3 = r3.beginTransaction()     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L40
            android.app.FragmentTransaction r2 = r3.remove(r2)     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L40
            r2.commitAllowingStateLoss()     // Catch: java.lang.Throwable -> L40
        L40:
            return
    }
}
