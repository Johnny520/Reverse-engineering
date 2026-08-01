package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vg1 extends android.app.Fragment {

    /* JADX INFO: renamed from: ε */
    public p000.C0940wa f11269;

    public vg1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int r4, int r5, android.content.Intent r6) {
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            r0 = 61052(0xee7c, float:8.5552E-41)
            if (r4 == r0) goto L9
            goto L69
        L9:
            android.app.Activity r4 = r3.getActivity()
            r0 = 0
            if (r6 == 0) goto L15
            android.net.Uri r1 = r6.getData()
            goto L16
        L15:
            r1 = r0
        L16:
            r2 = -1
            if (r5 != r2) goto L4d
            if (r4 == 0) goto L4d
            if (r1 == 0) goto L4d
            int r5 = r6.getFlags()     // Catch: java.lang.Throwable -> L2d
            r5 = r5 & 1
            if (r5 == 0) goto L2f
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L2d
            r4.takePersistableUriPermission(r1, r5)     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
            r4 = move-exception
            goto L32
        L2f:
            s62 r4 = p000.s62.f9751     // Catch: java.lang.Throwable -> L2d
            goto L38
        L32:
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L38:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)
            if (r4 == 0) goto L45
            java.lang.String r5 = "rc62a71041a7416a5"
            java.lang.String r6 = "持久化 SAF 图片读取权限失败"
            p000.C0888ux.m5977(r5, r6, r4)
        L45:
            wa r4 = r3.f11269
            if (r4 == 0) goto L54
            r4.invoke(r1)
            goto L54
        L4d:
            wa r4 = r3.f11269
            if (r4 == 0) goto L54
            r4.invoke(r0)
        L54:
            android.app.FragmentManager r4 = r3.getFragmentManager()     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L69
            android.app.FragmentTransaction r4 = r4.beginTransaction()     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L69
            android.app.FragmentTransaction r3 = r4.remove(r3)     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L69
            r3.commitAllowingStateLoss()     // Catch: java.lang.Throwable -> L69
        L69:
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
            r0 = 61052(0xee7c, float:8.5552E-41)
            r2.startActivityForResult(r3, r0)     // Catch: java.lang.Throwable -> L26
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L26
            goto L2d
        L26:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
            r3 = r0
        L2d:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L57
            java.lang.String r0 = "rc62a71041a7416a5"
            java.lang.String r1 = "打开 SAF 图片选择器失败"
            p000.C0888ux.m5977(r0, r1, r3)
            wa r3 = r2.f11269
            if (r3 == 0) goto L42
            r0 = 0
            r3.invoke(r0)
        L42:
            android.app.FragmentManager r3 = r2.getFragmentManager()     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L57
            android.app.FragmentTransaction r3 = r3.beginTransaction()     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L57
            android.app.FragmentTransaction r2 = r3.remove(r2)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L57
            r2.commitAllowingStateLoss()     // Catch: java.lang.Throwable -> L57
        L57:
            return
    }
}
