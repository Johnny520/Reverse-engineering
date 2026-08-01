package p000;

/* JADX INFO: renamed from: ju */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentC0445ju extends android.app.Fragment {

    /* JADX INFO: renamed from: ε */
    public p000.C0372hu f5582;

    public FragmentC0445ju() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            super.onActivityResult(r3, r4, r5)
            r0 = 11001(0x2af9, float:1.5416E-41)
            if (r3 == r0) goto L9
            goto L88
        L9:
            r3 = -1
            r0 = 0
            if (r4 != r3) goto L6c
            if (r5 == 0) goto L14
            android.net.Uri r3 = r5.getData()
            goto L15
        L14:
            r3 = r0
        L15:
            if (r3 == 0) goto L6b
            if (r5 == 0) goto L1e
            int r4 = r5.getFlags()
            goto L1f
        L1e:
            r4 = 0
        L1f:
            r5 = r4 & 3
            r4 = r4 & 2
            if (r4 == 0) goto L4b
            android.app.Activity r4 = r2.getActivity()     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L43
            android.content.ContentResolver r1 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L41
            r1.takePersistableUriPermission(r3, r5)     // Catch: java.lang.Throwable -> L41
            boolean r4 = p000.AbstractC1021yh.m6884(r4, r3)     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L39
            goto L6b
        L39:
            java.lang.SecurityException r3 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "当前用户空间未保存持久读写授权"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L41
            throw r3     // Catch: java.lang.Throwable -> L41
        L41:
            r3 = move-exception
            goto L53
        L43:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "宿主 Activity 已失效"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L41
            throw r3     // Catch: java.lang.Throwable -> L41
        L4b:
            java.lang.SecurityException r3 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "目录选择器未授予写入权限"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L41
            throw r3     // Catch: java.lang.Throwable -> L41
        L53:
            java.lang.String r4 = "DYHelper"
            java.lang.String r5 = "持久化下载目录授权失败"
            p000.C0888ux.m5977(r4, r5, r3)
            android.app.Activity r3 = r2.getActivity()
            if (r3 == 0) goto L6c
            java.lang.String r4 = "目录授权未能保存，将继续使用系统默认目录"
            r5 = 1
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r4, r5)
            r3.show()
            goto L6c
        L6b:
            r0 = r3
        L6c:
            hu r3 = r2.f5582
            if (r3 == 0) goto L73
            r3.invoke(r0)
        L73:
            android.app.FragmentManager r3 = r2.getFragmentManager()
            if (r3 == 0) goto L88
            android.app.FragmentTransaction r3 = r3.beginTransaction()
            if (r3 == 0) goto L88
            android.app.FragmentTransaction r2 = r3.remove(r2)
            if (r2 == 0) goto L88
            r2.commitAllowingStateLoss()
        L88:
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
            java.lang.String r0 = "android.content.extra.SHOW_ADVANCED"
            r1 = 1
            r3.putExtra(r0, r1)
            java.lang.String r0 = "android.provider.extra.INITIAL_URI"
            java.lang.String r1 = "content://com.android.externalstorage.documents/root/primary"
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L20
            r3.putExtra(r0, r1)     // Catch: java.lang.Throwable -> L20
        L20:
            r0 = 11001(0x2af9, float:1.5416E-41)
            r2.startActivityForResult(r3, r0)     // Catch: java.lang.Throwable -> L26
            goto L51
        L26:
            android.app.Activity r3 = r2.getActivity()
            java.lang.String r0 = "无法打开目录选择器"
            r1 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r0, r1)
            r3.show()
            hu r3 = r2.f5582
            if (r3 == 0) goto L3c
            r0 = 0
            r3.invoke(r0)
        L3c:
            android.app.FragmentManager r3 = r2.getFragmentManager()
            if (r3 == 0) goto L51
            android.app.FragmentTransaction r3 = r3.beginTransaction()
            if (r3 == 0) goto L51
            android.app.FragmentTransaction r2 = r3.remove(r2)
            if (r2 == 0) goto L51
            r2.commitAllowingStateLoss()
        L51:
            return
    }
}
