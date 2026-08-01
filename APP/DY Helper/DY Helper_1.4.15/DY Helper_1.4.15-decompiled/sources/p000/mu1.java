package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class mu1 extends android.app.Fragment {

    /* JADX INFO: renamed from: ε */
    public p000.a80 f7281;

    public mu1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int r4, int r5, android.content.Intent r6) {
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            r0 = 10002(0x2712, float:1.4016E-41)
            if (r4 != r0) goto L5c
            r4 = -1
            r0 = 0
            if (r5 != r4) goto L40
            if (r6 == 0) goto L12
            android.net.Uri r4 = r6.getData()
            goto L13
        L12:
            r4 = r0
        L13:
            if (r4 == 0) goto L3f
            if (r6 == 0) goto L1c
            int r5 = r6.getFlags()     // Catch: java.lang.Exception -> L3f
            goto L1d
        L1c:
            r5 = 0
        L1d:
            r6 = 1
            r5 = r5 & r6
            android.app.Activity r1 = r3.getActivity()     // Catch: java.lang.Exception -> L3f
            if (r1 == 0) goto L3f
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> L3f
            if (r1 == 0) goto L3f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L3f
            int r2 = r5.intValue()     // Catch: java.lang.Exception -> L3f
            if (r2 == 0) goto L36
            r0 = r5
        L36:
            if (r0 == 0) goto L3c
            int r6 = r0.intValue()     // Catch: java.lang.Exception -> L3f
        L3c:
            r1.takePersistableUriPermission(r4, r6)     // Catch: java.lang.Exception -> L3f
        L3f:
            r0 = r4
        L40:
            a80 r4 = r3.f7281
            if (r4 == 0) goto L47
            r4.invoke(r0)
        L47:
            android.app.FragmentManager r4 = r3.getFragmentManager()
            if (r4 == 0) goto L5c
            android.app.FragmentTransaction r4 = r4.beginTransaction()
            if (r4 == 0) goto L5c
            android.app.FragmentTransaction r3 = r4.remove(r3)
            if (r3 == 0) goto L5c
            r3.commitAllowingStateLoss()
        L5c:
            return
    }

    @Override // android.app.Fragment
    public final void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
            r3.<init>(r0)
            java.lang.String r0 = "android.intent.category.OPENABLE"
            r3.addCategory(r0)
            java.lang.String r0 = "image/*"
            r3.setType(r0)
            r0 = 1
            r3.addFlags(r0)
            r0 = 64
            r3.addFlags(r0)
            r0 = 10002(0x2712, float:1.4016E-41)
            r2.startActivityForResult(r3, r0)     // Catch: java.lang.Exception -> L23
            return
        L23:
            android.app.Activity r3 = r2.getActivity()
            java.lang.String r0 = "无法打开图库"
            r1 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
            r3.show()
            a80 r3 = r2.f7281
            if (r3 == 0) goto L39
            r0 = 0
            r3.invoke(r0)
        L39:
            android.app.FragmentManager r3 = r2.getFragmentManager()
            if (r3 == 0) goto L4e
            android.app.FragmentTransaction r3 = r3.beginTransaction()
            if (r3 == 0) goto L4e
            android.app.FragmentTransaction r2 = r3.remove(r2)
            if (r2 == 0) goto L4e
            r2.commitAllowingStateLoss()
        L4e:
            return
    }
}
